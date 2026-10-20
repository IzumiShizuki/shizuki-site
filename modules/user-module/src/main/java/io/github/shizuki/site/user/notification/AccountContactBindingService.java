package io.github.shizuki.site.user.notification;

import static io.github.shizuki.site.user.notification.AccountContactModels.*;
import static io.github.shizuki.site.user.notification.WechatNotificationModels.PrivateSender;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Base64;
import java.util.HexFormat;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AccountContactBindingService {
    private final JdbcTemplate db;
    private final AccountContactBindingSettings settings;
    private final Clock clock;
    private final SecureRandom random = new SecureRandom();

    @Autowired
    public AccountContactBindingService(JdbcTemplate db, AccountContactBindingSettings settings) {
        this(db, settings, Clock.systemUTC());
    }

    AccountContactBindingService(JdbcTemplate db, AccountContactBindingSettings settings, Clock clock) {
        this.db = db;
        this.settings = settings;
        this.clock = clock;
    }

    public Status status(long userId) {
        ensureUser(userId);
        List<ContactBinding> bindings = db.query("""
            SELECT id, platform_code, masked_identity, todo_edit_enabled, todo_notify_enabled, binding_version, bound_at
            FROM USR_CONTACT_BINDING WHERE user_id=? AND active=TRUE ORDER BY bound_at, id
            """, (r, n) -> new ContactBinding(r.getString(1), r.getString(2), r.getString(3),
                r.getBoolean(4), r.getBoolean(5), r.getString(6), instant(r, "bound_at")), userId);
        return new Status(settings.available(), bindings);
    }

    public Challenge challenge(long userId, String platform) {
        requirePlatform(platform);
        settings.requireAvailable();
        ensureUser(userId);
        Instant now = clock.instant();
        List<Instant> issued = db.query("SELECT issued_at FROM USR_CONTACT_CHALLENGE WHERE user_id=? AND platform_code=?",
            (r, n) -> instant(r, "issued_at"), userId, platform);
        if (!issued.isEmpty() && issued.get(0).plusSeconds(30).isAfter(now))
            throw new BusinessException(ErrorCode.TOO_MANY_REQUESTS, "请稍后再生成绑定码");
        String code = token();
        db.update("DELETE FROM USR_CONTACT_CHALLENGE WHERE user_id=? AND platform_code=?", userId, platform);
        db.update("""
            INSERT INTO USR_CONTACT_CHALLENGE(user_id,platform_code,code_hash,expires_at,issued_at)
            VALUES(?,?,?,?,?)
            """, userId, platform, hash(code), time(now.plusSeconds(600)), time(now));
        return new Challenge(platform, "/shizuki_bind " + platform + " " + code, now.plusSeconds(600));
    }

    public void confirm(Confirmation input) {
        settings.requireAvailable();
        requirePlatform(input.platform());
        PrivateSender sender = input.sender();
        if (!platformMatches(input.platform(), sender.platformId()) || !settings.allows(sender.platformId())
            || !sender.origin().equals(sender.platformId() + ":FriendMessage:" + sender.senderId()))
            throw new BusinessException(ErrorCode.FORBIDDEN, "Only an allowed private sender can bind");
        List<Long> users = db.query("""
            SELECT user_id FROM USR_CONTACT_CHALLENGE
            WHERE platform_code=? AND code_hash=? AND expires_at>?
            FOR UPDATE
            """, (r, n) -> r.getLong(1), input.platform(), hash(input.code()), time(clock.instant()));
        if (users.isEmpty()) throw new BusinessException(ErrorCode.BAD_REQUEST, "绑定码无效或已过期，请重新生成");
        long userId = users.get(0);
        ensureUser(userId);
        String identity = hash(sender.platformId() + "\n" + sender.senderId());
        List<OwnedBinding> owned = db.query("""
            SELECT id, user_id, active FROM USR_CONTACT_BINDING WHERE identity_hash=?
            """, (r, n) -> new OwnedBinding(r.getString(1), r.getLong(2), r.getBoolean(3)), identity);
        if (!owned.isEmpty() && (owned.get(0).userId != userId || owned.get(0).active))
            throw new BusinessException(ErrorCode.CONFLICT, "该消息账号已绑定网站账号");
        String id = owned.isEmpty() ? UUID.randomUUID().toString() : owned.get(0).id;
        String version = UUID.randomUUID().toString();
        if (owned.isEmpty()) {
            db.update("""
                INSERT INTO USR_CONTACT_BINDING(id,user_id,platform_code,platform_id,sender_id,origin_text,identity_hash,
                masked_identity,binding_version,todo_edit_enabled,todo_notify_enabled,active,bound_at)
                VALUES(?,?,?,?,?,?,?,?,?,TRUE,TRUE,TRUE,?)
                """, id, userId, input.platform(), sender.platformId(), sender.senderId(), sender.origin(), identity,
                mask(input.platform(), sender.senderId()), version, time(clock.instant()));
        } else {
            db.update("""
                UPDATE USR_CONTACT_BINDING SET platform_code=?,platform_id=?,sender_id=?,origin_text=?,
                    masked_identity=?,binding_version=?,todo_edit_enabled=TRUE,todo_notify_enabled=TRUE,
                    active=TRUE,bound_at=? WHERE id=? AND user_id=?
                """, input.platform(), sender.platformId(), sender.senderId(), sender.origin(),
                mask(input.platform(), sender.senderId()), version, time(clock.instant()), id, userId);
        }
        db.update("DELETE FROM USR_CONTACT_CHALLENGE WHERE user_id=? AND platform_code=?", userId, input.platform());
    }

    public void updateCapabilities(long userId, String id, CapabilitiesRequest input) {
        ensureUser(userId);
        if (db.update("""
            UPDATE USR_CONTACT_BINDING SET todo_edit_enabled=?,todo_notify_enabled=?,binding_version=?
            WHERE id=? AND user_id=? AND active=TRUE
            """, input.todoEditEnabled(), input.todoNotifyEnabled(), UUID.randomUUID().toString(), id, userId) == 0)
            throw new BusinessException(ErrorCode.NOT_FOUND, "绑定身份不存在");
    }

    public void unbind(long userId, String id) {
        ensureUser(userId);
        if (db.update("""
            UPDATE USR_CONTACT_BINDING SET active=FALSE,binding_version=? WHERE id=? AND user_id=? AND active=TRUE
            """, UUID.randomUUID().toString(), id, userId) == 0)
            throw new BusinessException(ErrorCode.NOT_FOUND, "绑定身份不存在");
    }

    private void ensureUser(long userId) {
        Integer count = db.queryForObject("SELECT COUNT(*) FROM USR_ACCOUNT WHERE id=? AND deleted_flag=0", Integer.class, userId);
        if (count == null || count != 1) throw new BusinessException(ErrorCode.UNAUTHORIZED, "Account unavailable");
    }

    private void requirePlatform(String platform) {
        if (!"QQ".equals(platform) && !"WECHAT".equals(platform))
            throw new BusinessException(ErrorCode.BAD_REQUEST, "Unsupported contact platform");
    }

    private boolean platformMatches(String code, String platformId) {
        String normalized = platformId.toLowerCase();
        return "QQ".equals(code) ? !normalized.contains("wechat") && !normalized.contains("weixin")
            : normalized.contains("wechat") || normalized.contains("weixin");
    }

    private String token() {
        byte[] data = new byte[16];
        random.nextBytes(data);
        return Base64.getUrlEncoder().withoutPadding().encodeToString(data);
    }

    private static String hash(String raw) {
        try {
            return HexFormat.of().formatHex(MessageDigest.getInstance("SHA-256").digest(raw.getBytes(StandardCharsets.UTF_8)));
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    private static String mask(String platform, String sender) {
        String visible = sender.substring(Math.max(0, sender.length() - 4));
        return ("QQ".equals(platform) ? "QQ ···" : "微信 ···") + visible;
    }

    private static Timestamp time(Instant instant) {
        return Timestamp.valueOf(LocalDateTime.ofInstant(instant, ZoneOffset.UTC));
    }

    private static Instant instant(ResultSet result, String column) throws SQLException {
        Timestamp timestamp = result.getTimestamp(column);
        return timestamp == null ? null : timestamp.toLocalDateTime().toInstant(ZoneOffset.UTC);
    }

    private record OwnedBinding(String id, long userId, boolean active) {}
}
