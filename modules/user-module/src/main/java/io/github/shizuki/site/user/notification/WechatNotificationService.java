package io.github.shizuki.site.user.notification;

import static io.github.shizuki.site.user.notification.WechatNotificationModels.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.notification.NotificationContentResolver;
import io.github.shizuki.site.notification.WebsiteContentPublishedEvent;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.*;
import java.util.*;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/** All state transitions hold a short database mutex across instances. No network I/O occurs here. */
@Service
@Transactional
public class WechatNotificationService {
    private static final ZoneId QUIET_ZONE = ZoneId.of("Asia/Shanghai");
    private static final Set<String> KINDS = Set.of("POST", "MOMENT");
    private final JdbcTemplate db;
    private final ObjectMapper json;
    private final WechatNotificationSettings settings;
    private final ObjectProvider<NotificationContentResolver> resolver;
    private final Clock clock;
    private final SecureRandom random = new SecureRandom();

    @Autowired
    public WechatNotificationService(JdbcTemplate db, ObjectMapper json, WechatNotificationSettings settings,
                                     ObjectProvider<NotificationContentResolver> resolver) {
        this(db, json, settings, resolver, Clock.systemUTC());
    }
    WechatNotificationService(JdbcTemplate db, ObjectMapper json, WechatNotificationSettings settings,
                              ObjectProvider<NotificationContentResolver> resolver, Clock clock) {
        this.db = db; this.json = json; this.settings = settings; this.resolver = resolver; this.clock = clock;
    }

    public Status status(long userId) {
        lock(); ensure(userId);
        Preference p = preference(userId);
        List<History> history = db.query("""
            SELECT id, content_kind, status_code, attempts, created_at, error_code FROM WX_NOTIFY_DELIVERY
            WHERE user_id=? AND created_at>=? ORDER BY created_at DESC LIMIT 20
            """, (r,n) -> new History(r.getString(1), r.getString(2), r.getString(3), r.getInt(4),
                instant(r, "created_at"), r.getString(6)), userId, time(now().minus(Duration.ofDays(30))));
        return new Status(settings.available(), p.version != null, mask(p.sender), p.boundAt, p.paused,
            p.start, p.end, groups(userId), subscriptions(userId), history);
    }

    public Challenge challenge(long userId) {
        settings.requireAvailable(); lock(); ensure(userId);
        Instant now = now();
        List<Instant> issued = db.query("SELECT issued_at FROM WX_NOTIFY_CHALLENGE WHERE user_id=?",
            (r,n)->instant(r,"issued_at"), userId);
        if (!issued.isEmpty() && issued.get(0).plusSeconds(30).isAfter(now))
            throw new BusinessException(ErrorCode.TOO_MANY_REQUESTS, "请稍后再生成绑定码");
        String code = token();
        db.update("DELETE FROM WX_NOTIFY_CHALLENGE WHERE user_id=?", userId);
        db.update("INSERT INTO WX_NOTIFY_CHALLENGE(user_id,code_hash,expires_at,issued_at) VALUES(?,?,?,?)",
            userId, hash(code), time(now.plusSeconds(600)), time(now));
        return new Challenge(code, "/shizuki_bind " + code, now.plusSeconds(600));
    }

    public void confirm(Confirmation request) {
        settings.requireAvailable(); validateSender(request.sender()); lock();
        List<Long> users = db.query("""
            SELECT user_id FROM WX_NOTIFY_CHALLENGE WHERE code_hash=? AND expires_at>?
            """, (r,n)->r.getLong(1), hash(request.code()), time(now()));
        if (users.isEmpty()) throw new BusinessException(ErrorCode.BAD_REQUEST, "绑定码无效或已过期，请在网站重新生成");
        long userId = users.get(0);
        ensure(userId);
        PrivateSender sender = request.sender();
        String identity = identity(sender);
        List<Long> owners = db.query("SELECT user_id FROM WX_NOTIFY_PREFERENCE WHERE identity_hash=?",
            (r,n)->r.getLong(1), identity);
        if (!owners.isEmpty() && owners.get(0) != userId)
            throw new BusinessException(ErrorCode.CONFLICT, "该微信已绑定其他账号，请先解绑");
        cancel(userId);
        db.update("""
            UPDATE WX_NOTIFY_PREFERENCE SET platform_id=?,sender_id=?,origin_text=?,identity_hash=?,
            binding_version=?,bound_at=?,last_sent_at=NULL WHERE user_id=?
            """, sender.platformId(), sender.senderId(), sender.origin(), identity, UUID.randomUUID().toString(),
            time(now()), userId);
        db.update("DELETE FROM WX_NOTIFY_CHALLENGE WHERE user_id=?", userId);
    }

    public void update(long userId, Preferences input) {
        lock(); ensure(userId);
        if ((input.quietStart()==null) != (input.quietEnd()==null)
            || (input.quietStart()!=null && (input.quietStart()<0 || input.quietStart()>23
            || input.quietEnd()<0 || input.quietEnd()>23 || input.quietStart().equals(input.quietEnd()))))
            throw new BusinessException(ErrorCode.BAD_REQUEST, "免打扰时间必须是不同的起止小时");
        Set<String> allowed = groupCodes(userId);
        Set<Subscription> requested = new LinkedHashSet<>(input.subscriptions());
        if (requested.size()>128 || requested.stream().anyMatch(s -> !allowed.contains(s.groupCode()) || !KINDS.contains(s.kind())))
            throw new BusinessException(ErrorCode.FORBIDDEN, "只能订阅当前所属的有效分组");
        db.update("UPDATE WX_NOTIFY_PREFERENCE SET paused=?,quiet_start=?,quiet_end=? WHERE user_id=?",
            input.paused(), input.quietStart(), input.quietEnd(), userId);
        db.update("DELETE FROM WX_NOTIFY_SUBSCRIPTION WHERE user_id=?", userId);
        for (Subscription s: requested)
            db.update("INSERT INTO WX_NOTIFY_SUBSCRIPTION(user_id,group_code,content_kind) VALUES(?,?,?)", userId, s.groupCode(), s.kind());
    }

    public void unbind(long userId) {
        lock(); ensure(userId); clearBinding(userId);
    }

    public void control(Control request) {
        settings.requireAvailable(); validateSender(request.sender()); lock();
        List<Long> users = db.query("""
            SELECT user_id FROM WX_NOTIFY_PREFERENCE WHERE identity_hash=? AND origin_text=?
            """, (r,n)->r.getLong(1), identity(request.sender()), request.sender().origin());
        if (users.isEmpty()) throw new BusinessException(ErrorCode.NOT_FOUND, "当前微信尚未绑定网站账号");
        long userId=users.get(0);
        switch(request.action()) {
            case "UNBIND" -> clearBinding(userId);
            case "PAUSE", "RESUME" -> db.update("UPDATE WX_NOTIFY_PREFERENCE SET paused=? WHERE user_id=?",
                "PAUSE".equals(request.action()), userId);
            default -> throw new BusinessException(ErrorCode.BAD_REQUEST, "Invalid action");
        }
    }

    public void enqueue(WebsiteContentPublishedEvent event) {
        if (!settings.available() || event.authorId()==null || !KINDS.contains(event.kind())) return;
        lock();
        Optional<NotificationContentResolver.Content> content = resolve(event.kind(), event.sourceId());
        if (content.isEmpty() || !event.authorId().equals(content.get().authorId())) return;
        Set<String> authorGroups=groupCodes(event.authorId());
        if (authorGroups.isEmpty()) return;
        List<Long> candidates=db.query("""
            SELECT DISTINCT s.user_id FROM WX_NOTIFY_SUBSCRIPTION s
            JOIN WX_NOTIFY_PREFERENCE p ON p.user_id=s.user_id
            WHERE s.content_kind=? AND p.binding_version IS NOT NULL AND p.paused=FALSE AND s.user_id<>?
            """, (r,n)->r.getLong(1), event.kind(), event.authorId());
        for (long user: candidates) {
            Preference p=preference(user);
            if (!matches(user, event.authorId(), event.kind(), authorGroups) || !settings.allows(p.platform)) continue;
            Integer count=db.queryForObject("SELECT COUNT(*) FROM WX_NOTIFY_DELIVERY WHERE event_key=? AND user_id=?",
                Integer.class, event.eventKey(), user);
            if (count!=null && count>0) continue;
            db.update("""
                INSERT INTO WX_NOTIFY_DELIVERY(id,event_key,user_id,content_kind,source_id,author_id,
                binding_version,status_code,attempts,available_at,created_at,updated_at)
                VALUES(?,?,?,?,?,?,?,'PENDING',0,?,?,?)
                """, UUID.randomUUID().toString(),event.eventKey(),user,event.kind(),event.sourceId(),
                event.authorId(),p.version,time(now()),time(now()),time(now()));
        }
    }

    /** Claim one item per request. Slow/private platform limits are honored before every send. */
    public List<Lease> lease(LeaseRequest request) {
        settings.requireAvailable(); lock();
        for(String platform:request.platformIds()) if(!settings.allows(platform))
            throw new BusinessException(ErrorCode.FORBIDDEN, "Platform is not allowed");
        cleanup();
        db.update("""
            UPDATE WX_NOTIFY_DELIVERY SET status_code='FAILED',error_code='RETRY_EXHAUSTED',updated_at=?
            WHERE attempts>=5 AND (status_code='PENDING' OR (status_code='LEASED' AND lease_until<=?))
            """, time(now()),time(now()));
        List<Delivery> rows=db.query("""
            SELECT * FROM WX_NOTIFY_DELIVERY WHERE attempts<5 AND
            ((status_code='PENDING' AND available_at<=?) OR (status_code='LEASED' AND lease_until<=?))
            ORDER BY created_at,id LIMIT 100
            """, (r,n)->delivery(r),time(now()),time(now()));
        for(Delivery d: rows) {
            Preference p=preference(d.user);
            if (!valid(d,p)) { finish(d.id,"CANCELLED","NO_LONGER_AUTHORIZED"); continue; }
            if (!request.platformIds().contains(p.platform) || temporarilyWithheld(p)) {
                db.update("""
                    UPDATE WX_NOTIFY_DELIVERY SET status_code='PENDING',available_at=?,lease_hash=NULL,
                    lease_until=NULL,updated_at=? WHERE id=?
                    """,time(now().plusSeconds(60)),time(now()),d.id);
                continue;
            }
            String secret=token();
            db.update("""
                UPDATE WX_NOTIFY_DELIVERY SET status_code='LEASED',attempts=attempts+1,lease_hash=?,
                lease_until=?,updated_at=? WHERE id=?
                """,hash(secret),time(now().plusSeconds(120)),time(now()),d.id);
            return List.of(new Lease(d.id, secret));
        }
        return List.of();
    }

    public AuthorizedDelivery authorize(String id, LeaseToken input) {
        settings.requireAvailable(); lock();
        Delivery d=requireLease(id,input.token());
        Preference p=preference(d.user);
        if (!valid(d,p)) { finish(id,"CANCELLED","NO_LONGER_AUTHORIZED"); return AuthorizedDelivery.withheld(); }
        if (temporarilyWithheld(p)) {
            db.update("""
                UPDATE WX_NOTIFY_DELIVERY SET status_code='PENDING',attempts=attempts-1,
                available_at=?,lease_hash=NULL,lease_until=NULL,updated_at=? WHERE id=?
                """,time(now().plusSeconds(60)),time(now()),id);
            return AuthorizedDelivery.withheld();
        }
        Optional<NotificationContentResolver.Content> content=resolve(d.kind,d.source);
        if(content.isEmpty() || !Objects.equals(content.get().authorId(),d.author)) {
            finish(id,"CANCELLED","CONTENT_UNAVAILABLE"); return AuthorizedDelivery.withheld();
        }
        NotificationContentResolver.Content c=content.get();
        if(c.readingPath()==null || !c.readingPath().startsWith("/read/") || c.readingPath().contains("\n"))
            throw new BusinessException(ErrorCode.INTERNAL_ERROR, "Invalid reading link");
        String text="同组成员发布了" + ("POST".equals(d.kind) ? "文章" : "动态") + "\n"
            + clean(c.title(),100) + "\n" + clean(c.summary(),180) + "\n"
            + settings.origin() + c.readingPath() + "\n\n在网站「微信提醒」管理订阅；私聊 /shizuki_pause 暂停";
        return new AuthorizedDelivery(true,p.origin,text);
    }

    public void acknowledge(String id, Acknowledgment input) {
        settings.requireAvailable(); lock();
        Delivery d=findDelivery(id);
        // A successful ack can be retried after a network timeout with the same secret.
        if("SENT".equals(d.status) && Objects.equals(d.leaseHash,hash(input.token())) && input.success()) return;
        d=requireLease(id,input.token());
        if(input.success()) {
            db.update("UPDATE WX_NOTIFY_DELIVERY SET status_code='SENT',error_code=NULL,updated_at=? WHERE id=?",time(now()),id);
            db.update("UPDATE WX_NOTIFY_PREFERENCE SET last_sent_at=? WHERE user_id=? AND binding_version=?",
                time(now()),d.user,d.bindingVersion);
        } else if(d.attempts>=5) finish(id,"FAILED","PROVIDER_SEND_FAILED");
        else db.update("""
            UPDATE WX_NOTIFY_DELIVERY SET status_code='PENDING',available_at=?,error_code='PROVIDER_SEND_FAILED',
            lease_hash=NULL,lease_until=NULL,updated_at=? WHERE id=?
            """,time(now().plusSeconds(30L << (d.attempts-1))),time(now()),id);
    }

    private boolean valid(Delivery d, Preference p) {
        return p.version!=null && p.version.equals(d.bindingVersion) && settings.allows(p.platform)
            && matches(d.user,d.author,d.kind,groupCodes(d.author));
    }
    private boolean matches(long user,long author,String kind,Set<String> authorGroups) {
        if(user==author || authorGroups.isEmpty()) return false;
        Set<String> mine=groupCodes(user);
        return subscriptions(user).stream().anyMatch(s->kind.equals(s.kind())
            && mine.contains(s.groupCode()) && authorGroups.contains(s.groupCode()));
    }
    private boolean temporarilyWithheld(Preference p) {
        return p.paused || isQuiet(p.start,p.end,now())
            || (p.lastSent!=null && p.lastSent.plusSeconds(60).isAfter(now()));
    }
    static boolean isQuiet(Integer start,Integer end,Instant now) {
        if(start==null || end==null) return false;
        int hour=now.atZone(QUIET_ZONE).getHour();
        return start<end ? hour>=start && hour<end : hour>=start || hour<end;
    }
    private void clearBinding(long user) {
        cancel(user);
        db.update("""
            UPDATE WX_NOTIFY_PREFERENCE SET platform_id=NULL,sender_id=NULL,origin_text=NULL,identity_hash=NULL,
            binding_version=NULL,bound_at=NULL,last_sent_at=NULL WHERE user_id=?
            """,user);
        db.update("DELETE FROM WX_NOTIFY_CHALLENGE WHERE user_id=?",user);
        db.update("DELETE FROM WX_NOTIFY_SUBSCRIPTION WHERE user_id=?",user);
    }
    private void cancel(long user) {
        db.update("""
            UPDATE WX_NOTIFY_DELIVERY SET status_code='CANCELLED',error_code='BINDING_CHANGED',
            lease_hash=NULL,lease_until=NULL,updated_at=? WHERE user_id=? AND status_code IN ('PENDING','LEASED')
            """,time(now()),user);
    }
    private void finish(String id,String state,String reason) {
        db.update("""
            UPDATE WX_NOTIFY_DELIVERY SET status_code=?,error_code=?,lease_hash=NULL,lease_until=NULL,updated_at=? WHERE id=?
            """,state,reason,time(now()),id);
    }
    private Delivery requireLease(String id,String token) {
        Delivery d=findDelivery(id);
        if(!"LEASED".equals(d.status) || d.until==null || !d.until.isAfter(now())
            || !MessageDigest.isEqual(hash(token).getBytes(StandardCharsets.UTF_8),
                String.valueOf(d.leaseHash).getBytes(StandardCharsets.UTF_8)))
            throw new BusinessException(ErrorCode.CONFLICT,"Delivery lease expired or invalid");
        return d;
    }
    private Delivery findDelivery(String id) {
        return db.query("SELECT * FROM WX_NOTIFY_DELIVERY WHERE id=?",(r,n)->delivery(r),id).stream()
            .findFirst().orElseThrow(()->new BusinessException(ErrorCode.NOT_FOUND,"Delivery not found"));
    }
    private void validateSender(PrivateSender s) {
        if(!settings.allows(s.platformId()) || !s.origin().equals(s.platformId()+":FriendMessage:"+s.senderId()))
            throw new BusinessException(ErrorCode.FORBIDDEN,"Only an allowed private sender can bind");
    }
    private String identity(PrivateSender s) { return hash(s.platformId()+"\n"+s.senderId()); }
    private Optional<NotificationContentResolver.Content> resolve(String kind,String source) {
        NotificationContentResolver target=resolver.getIfAvailable();
        return target==null ? Optional.empty() : target.resolve(kind,source);
    }
    private void lock() { db.queryForObject("SELECT id FROM WX_NOTIFY_MUTEX WHERE id=1 FOR UPDATE",Integer.class); }
    private void ensure(long user) {
        Integer count=db.queryForObject("SELECT COUNT(*) FROM USR_ACCOUNT WHERE id=? AND deleted_flag=0",Integer.class,user);
        if(count==null || count!=1) throw new BusinessException(ErrorCode.UNAUTHORIZED,"Account unavailable");
        if(db.queryForObject("SELECT COUNT(*) FROM WX_NOTIFY_PREFERENCE WHERE user_id=?",Integer.class,user)==0)
            db.update("INSERT INTO WX_NOTIFY_PREFERENCE(user_id) VALUES(?)",user);
    }
    private Preference preference(long user) {
        return db.query("SELECT * FROM WX_NOTIFY_PREFERENCE WHERE user_id=?", (r,n)->new Preference(
            r.getBoolean("paused"),(Integer)r.getObject("quiet_start"),(Integer)r.getObject("quiet_end"),
            r.getString("platform_id"),r.getString("sender_id"),r.getString("origin_text"),r.getString("binding_version"),
            instant(r,"bound_at"),instant(r,"last_sent_at")),user).stream().findFirst()
            .orElse(new Preference(false,null,null,null,null,null,null,null,null));
    }
    private List<Subscription> subscriptions(long user) {
        return db.query("SELECT group_code,content_kind FROM WX_NOTIFY_SUBSCRIPTION WHERE user_id=? ORDER BY group_code,content_kind",
            (r,n)->new Subscription(r.getString(1),r.getString(2)),user);
    }
    private List<Group> groups(long user) {
        List<String> raw=db.query("SELECT groups_json FROM USR_ACCOUNT WHERE id=? AND deleted_flag=0",(r,n)->r.getString(1),user);
        if(raw.isEmpty()) return List.of();
        Set<String> membership;
        try { membership=json.readValue(raw.get(0),new TypeReference<Set<String>>(){}); }
        catch(Exception e) { return List.of(); }
        if (membership == null) return List.of();
        return db.query("SELECT group_code,display_name FROM USR_GROUP WHERE deleted_flag=0 AND status_code='ACTIVE' ORDER BY sort_num,id",
            (r,n)->new Group(r.getString(1),r.getString(2))).stream()
            .filter(g->!"GUEST".equals(g.code()) && membership.contains(g.code())).toList();
    }
    private Set<String> groupCodes(long user) {
        Set<String> result=new HashSet<>(); groups(user).forEach(g->result.add(g.code())); return result;
    }
    private void cleanup() {
        db.update("DELETE FROM WX_NOTIFY_CHALLENGE WHERE expires_at<=?",time(now()));
        // Keep minimal dedup receipts; discard contact-independent lease secrets after the history window.
        db.update("""
            UPDATE WX_NOTIFY_DELIVERY SET lease_hash=NULL,error_code=NULL WHERE updated_at<?
            AND status_code IN ('SENT','FAILED','CANCELLED') AND (lease_hash IS NOT NULL OR error_code IS NOT NULL)
            """,time(now().minus(Duration.ofDays(30))));
    }
    private Instant now() { return clock.instant(); }
    private String token() { byte[] data=new byte[16]; random.nextBytes(data); return Base64.getUrlEncoder().withoutPadding().encodeToString(data); }
    private static String hash(String raw) {
        try { return HexFormat.of().formatHex(MessageDigest.getInstance("SHA-256").digest(raw.getBytes(StandardCharsets.UTF_8))); }
        catch(NoSuchAlgorithmException e) { throw new IllegalStateException(e); }
    }
    private static String mask(String id) { return id==null ? null : "微信 ···" + id.substring(Math.max(0,id.length()-4)); }
    private static String clean(String text,int max) {
        String value=text==null ? "" : text.replaceAll("[\\p{Cntrl}\\s]+"," ").trim();
        return value.substring(0,Math.min(max,value.length()));
    }
    private static Timestamp time(Instant instant) { return Timestamp.valueOf(LocalDateTime.ofInstant(instant,ZoneOffset.UTC)); }
    private static Instant instant(ResultSet r,String column) throws SQLException {
        Timestamp t=r.getTimestamp(column); return t==null ? null : t.toLocalDateTime().toInstant(ZoneOffset.UTC);
    }
    private static Delivery delivery(ResultSet r) throws SQLException {
        return new Delivery(r.getString("id"),r.getLong("user_id"),r.getString("content_kind"),r.getString("source_id"),
            r.getLong("author_id"),r.getString("binding_version"),r.getString("status_code"),r.getInt("attempts"),
            r.getString("lease_hash"),instant(r,"lease_until"));
    }
    private record Preference(boolean paused,Integer start,Integer end,String platform,String sender,String origin,
                              String version,Instant boundAt,Instant lastSent) {}
    private record Delivery(String id,long user,String kind,String source,long author,String bindingVersion,
                            String status,int attempts,String leaseHash,Instant until) {}
}
