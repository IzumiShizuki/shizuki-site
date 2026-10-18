package io.github.shizuki.site.user.notification;

import static io.github.shizuki.site.user.notification.WechatNotificationModels.*;
import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.site.notification.NotificationContentResolver;
import io.github.shizuki.site.notification.WebsiteContentPublishedEvent;
import java.nio.file.Path;
import java.time.*;
import java.util.*;
import java.util.concurrent.*;
import org.h2.jdbcx.JdbcDataSource;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.*;
import org.springframework.context.annotation.*;
import org.springframework.core.io.FileSystemResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.event.*;
import org.springframework.transaction.support.TransactionTemplate;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes=WechatNotificationServiceTest.Config.class)
class WechatNotificationServiceTest {
    @Configuration @EnableTransactionManagement
    static class Config {
        @Bean JdbcDataSource datasource() {
            var source=new JdbcDataSource();
            source.setURL("jdbc:h2:mem:wechat;MODE=PostgreSQL;DB_CLOSE_DELAY=-1");
            return source;
        }
        @Bean JdbcTemplate db(JdbcDataSource source) { return new JdbcTemplate(source); }
        @Bean PlatformTransactionManager transactions(JdbcDataSource source) { return new DataSourceTransactionManager(source); }
        @Bean MutableClock clock() { return new MutableClock(); }
        @Bean NotificationContentResolver resolver() { return mock(NotificationContentResolver.class); }
        @Bean WechatNotificationSettings settings() {
            return new WechatNotificationSettings(true,"test-secret-with-at-least-32-characters","wechat","https://site.shizuki.online");
        }
        @Bean WechatNotificationService service(JdbcTemplate db,WechatNotificationSettings settings,
                ObjectProvider<NotificationContentResolver> resolver,MutableClock clock) {
            return new WechatNotificationService(db,new ObjectMapper(),settings,resolver,clock);
        }
        @Bean Listener listener(WechatNotificationService service) { return new Listener(service); }
    }
    static class Listener {
        final WechatNotificationService service;
        Listener(WechatNotificationService service) { this.service=service; }
        @TransactionalEventListener(phase=TransactionPhase.BEFORE_COMMIT)
        public void on(WebsiteContentPublishedEvent event) { service.enqueue(event); }
    }
    static class MutableClock extends Clock {
        Instant value=Instant.parse("2026-10-18T04:00:00Z");
        @Override public ZoneId getZone() { return ZoneOffset.UTC; }
        @Override public Clock withZone(ZoneId zone) { return this; }
        @Override public Instant instant() { return value; }
        void advance(long seconds) { value=value.plusSeconds(seconds); }
    }
    @Autowired WechatNotificationService service;
    @Autowired JdbcTemplate db;
    @Autowired JdbcDataSource source;
    @Autowired MutableClock clock;
    @Autowired NotificationContentResolver resolver;
    @Autowired PlatformTransactionManager transactions;
    @Autowired ApplicationEventPublisher events;
    private final WebsiteContentPublishedEvent event=new WebsiteContentPublishedEvent("POST","10",1L);

    @BeforeEach void setup() {
        clock.value=Instant.parse("2026-10-18T04:00:00Z"); reset(resolver);
        db.execute("DROP ALL OBJECTS");
        db.execute("CREATE TABLE USR_ACCOUNT(id BIGINT PRIMARY KEY,groups_json VARCHAR(1024),deleted_flag INTEGER DEFAULT 0)");
        db.execute("CREATE TABLE USR_GROUP(id BIGINT PRIMARY KEY,group_code VARCHAR(64),display_name VARCHAR(128),status_code VARCHAR(16),sort_num INTEGER,deleted_flag INTEGER DEFAULT 0)");
        db.execute("CREATE TABLE CTN_MOMENT(id BIGINT PRIMARY KEY)");
        var migration=Path.of("../../apps/monolith-app/src/main/resources/monolith/db/migration-pg/V1018__wechat_group_notifications.sql");
        new ResourceDatabasePopulator(new FileSystemResource(migration)).execute(source);
        db.update("INSERT INTO USR_ACCOUNT(id,groups_json) VALUES(1,'[\"FRIEND\"]'),(2,'[\"FRIEND\"]'),(3,'[\"OTHER\"]')");
        db.update("INSERT INTO USR_GROUP(id,group_code,display_name,status_code,sort_num) VALUES(1,'FRIEND','朋友','ACTIVE',1),(2,'OTHER','其他','ACTIVE',2)");
        when(resolver.resolve("POST","10")).thenReturn(Optional.of(
            new NotificationContentResolver.Content(1L,"新文章","摘要","/read/posts/10")));
    }
    PrivateSender sender(String id) { return new PrivateSender("wechat",id,"wechat:FriendMessage:"+id); }
    void bind(long user,String id) { service.confirm(new Confirmation(service.challenge(user).code(),sender(id))); }
    void subscribe() {
        bind(2,"wx_reader");
        service.update(2,new Preferences(false,null,null,List.of(new Subscription("FRIEND","POST"))));
    }
    Lease queue() { subscribe(); service.enqueue(event); return service.lease(new LeaseRequest(List.of("wechat"))).get(0); }
    String status(String id) { return db.queryForObject("SELECT status_code FROM WX_NOTIFY_DELIVERY WHERE id=?",String.class,id); }

    @Test void bindingIsHashedSingleUseAndMasked() {
        Challenge code=service.challenge(2);
        assertThat(db.queryForObject("SELECT code_hash FROM WX_NOTIFY_CHALLENGE",String.class)).doesNotContain(code.code()).hasSize(64);
        service.confirm(new Confirmation(code.code(),sender("wx_secret_contact")));
        assertThat(service.status(2).bound()).isTrue();
        assertThat(service.status(2).maskedIdentity()).doesNotContain("wx_secret_contact").endsWith("tact");
        assertThatThrownBy(()->service.confirm(new Confirmation(code.code(),sender("wx_replay")))).isInstanceOf(BusinessException.class);
        assertThat(service.status(2).subscriptions()).isEmpty();
    }
    @Test void expiredCodeAndGroupChatCannotBind() {
        var code=service.challenge(2);
        assertThatThrownBy(()->service.challenge(2)).isInstanceOf(BusinessException.class);
        assertThatThrownBy(()->service.confirm(new Confirmation(code.code(),
            new PrivateSender("wechat","wx","wechat:GroupMessage:room")))).isInstanceOf(BusinessException.class);
        clock.advance(601);
        assertThatThrownBy(()->service.confirm(new Confirmation(code.code(),sender("wx")))).isInstanceOf(BusinessException.class);
        assertThat(service.status(2).bound()).isFalse();
    }
    @Test void identityCannotBeStolenByAnotherAccount() {
        bind(2,"wx");
        var code=service.challenge(3);
        assertThatThrownBy(()->service.confirm(new Confirmation(code.code(),sender("wx")))).isInstanceOf(BusinessException.class);
        assertThat(service.status(2).bound()).isTrue();
        assertThat(service.status(3).bound()).isFalse();
    }
    @Test void concurrentBindingsHaveOneOwner() throws Exception {
        var a=service.challenge(2); var b=service.challenge(3);
        ExecutorService pool=Executors.newFixedThreadPool(2);
        try {
            List<Future<Boolean>> results=pool.invokeAll(List.of(
                ()->tryConfirm(a.code()),()->tryConfirm(b.code())));
            assertThat(results.stream().map(f->{try{return f.get();}catch(Exception e){throw new RuntimeException(e);}}).filter(Boolean::booleanValue).count()).isEqualTo(1);
            assertThat(db.queryForObject("SELECT COUNT(*) FROM WX_NOTIFY_PREFERENCE WHERE identity_hash IS NOT NULL",Integer.class)).isEqualTo(1);
        } finally { pool.shutdownNow(); }
    }
    boolean tryConfirm(String code) { try { service.confirm(new Confirmation(code,sender("same"))); return true; } catch(BusinessException e) { return false; } }
    @Test void subscriptionsRequireLiveMembership() {
        bind(2,"wx");
        assertThatThrownBy(()->service.update(2,new Preferences(false,null,null,List.of(new Subscription("OTHER","POST")))))
            .isInstanceOf(BusinessException.class);
        assertThatThrownBy(()->service.update(2,new Preferences(false,22,22,List.of()))).isInstanceOf(BusinessException.class);
    }
    @Test void duplicateAndSelfPublicationsDoNotFanOutTwice() {
        subscribe();
        bind(1,"author");
        service.update(1,new Preferences(false,null,null,List.of(new Subscription("FRIEND","POST"))));
        service.enqueue(event); service.enqueue(event);
        assertThat(db.queryForObject("SELECT COUNT(*) FROM WX_NOTIFY_DELIVERY",Integer.class)).isEqualTo(1);
    }
    @Test void rollbackDoesNotLeaveAQueuedNotification() {
        subscribe();
        new TransactionTemplate(transactions).executeWithoutResult(tx->{events.publishEvent(event); tx.setRollbackOnly();});
        assertThat(db.queryForObject("SELECT COUNT(*) FROM WX_NOTIFY_DELIVERY",Integer.class)).isZero();
        new TransactionTemplate(transactions).executeWithoutResult(tx->events.publishEvent(event));
        assertThat(db.queryForObject("SELECT COUNT(*) FROM WX_NOTIFY_DELIVERY",Integer.class)).isEqualTo(1);
    }
    @Test void revokedMembershipWithholdsAlreadyLeasedContent() {
        Lease lease=queue();
        db.update("UPDATE USR_ACCOUNT SET groups_json='[\"OTHER\"]' WHERE id=2");
        var result=service.authorize(lease.id(),new LeaseToken(lease.token()));
        assertThat(result.send()).isFalse(); assertThat(result.text()).isNull();
        assertThat(status(lease.id())).isEqualTo("CANCELLED");
    }
    @Test void authorMembershipAlsoCheckedAtSend() {
        Lease lease=queue();
        db.update("UPDATE USR_ACCOUNT SET groups_json='[]' WHERE id=1");
        assertThat(service.authorize(lease.id(),new LeaseToken(lease.token())).send()).isFalse();
    }
    @Test void withdrawnContentDoesNotLeakTitleOrLink() {
        Lease lease=queue();
        when(resolver.resolve("POST","10")).thenReturn(Optional.empty());
        var payload=service.authorize(lease.id(),new LeaseToken(lease.token()));
        assertThat(payload.send()).isFalse(); assertThat(payload.text()).isNull(); assertThat(payload.origin()).isNull();
    }
    @Test void unbindCancelsLeasesAndClearsSubscriptions() {
        Lease lease=queue(); service.unbind(2);
        assertThatThrownBy(()->service.authorize(lease.id(),new LeaseToken(lease.token()))).isInstanceOf(BusinessException.class);
        assertThat(status(lease.id())).isEqualTo("CANCELLED");
        assertThat(service.status(2).subscriptions()).isEmpty();
    }
    @Test void pauseAndQuietHoursDeferWithoutConsumingAttempts() {
        subscribe(); service.enqueue(event);
        service.control(new Control("PAUSE",sender("wx_reader")));
        assertThat(service.lease(new LeaseRequest(List.of("wechat")))).isEmpty();
        assertThat(db.queryForObject("SELECT attempts FROM WX_NOTIFY_DELIVERY",Integer.class)).isZero();
        clock.advance(61); service.control(new Control("RESUME",sender("wx_reader")));
        service.update(2,new Preferences(false,11,13,List.of(new Subscription("FRIEND","POST"))));
        assertThat(service.lease(new LeaseRequest(List.of("wechat")))).isEmpty();
        clock.advance(3601);
        assertThat(service.lease(new LeaseRequest(List.of("wechat")))).hasSize(1);
    }
    @Test void invalidAndExpiredLeasesCannotAuthorizeOrAcknowledge() {
        Lease lease=queue();
        assertThatThrownBy(()->service.authorize(lease.id(),new LeaseToken("wrong"))).isInstanceOf(BusinessException.class);
        clock.advance(121);
        assertThatThrownBy(()->service.acknowledge(lease.id(),new Acknowledgment(lease.token(),true))).isInstanceOf(BusinessException.class);
        Lease replacement=service.lease(new LeaseRequest(List.of("wechat"))).get(0);
        assertThat(replacement.id()).isEqualTo(lease.id()); assertThat(replacement.token()).isNotEqualTo(lease.token());
    }
    @Test void failedSendsBackOffAndEventuallyStop() {
        Lease lease=queue();
        for(int attempt=1;attempt<=5;attempt++) {
            service.acknowledge(lease.id(),new Acknowledgment(lease.token(),false));
            if(attempt<5) {
                assertThat(service.lease(new LeaseRequest(List.of("wechat")))).isEmpty();
                clock.advance(500); lease=service.lease(new LeaseRequest(List.of("wechat"))).get(0);
            }
        }
        assertThat(status(lease.id())).isEqualTo("FAILED");
        clock.advance(10000); assertThat(service.lease(new LeaseRequest(List.of("wechat")))).isEmpty();
    }
    @Test void successfulAcknowledgmentIsIdempotentAndRateLimited() {
        Lease lease=queue();
        var content=service.authorize(lease.id(),new LeaseToken(lease.token()));
        assertThat(content.send()).isTrue(); assertThat(content.text()).contains("https://site.shizuki.online/read/posts/10");
        service.acknowledge(lease.id(),new Acknowledgment(lease.token(),true));
        service.acknowledge(lease.id(),new Acknowledgment(lease.token(),true));
        assertThat(status(lease.id())).isEqualTo("SENT");
        when(resolver.resolve("POST","11")).thenReturn(Optional.of(new NotificationContentResolver.Content(1L,"另一篇","","/read/posts/11")));
        service.enqueue(new WebsiteContentPublishedEvent("POST","11",1L));
        assertThat(service.lease(new LeaseRequest(List.of("wechat")))).isEmpty();
        clock.advance(61); assertThat(service.lease(new LeaseRequest(List.of("wechat")))).hasSize(1);
    }
    @Test void deletedAccountAndDisabledGroupAreRevoked() {
        Lease lease=queue(); db.update("UPDATE USR_GROUP SET status_code='DISABLED' WHERE group_code='FRIEND'");
        assertThat(service.authorize(lease.id(),new LeaseToken(lease.token())).send()).isFalse();
        db.update("UPDATE USR_ACCOUNT SET deleted_flag=1 WHERE id=2");
        assertThatThrownBy(()->service.status(2)).isInstanceOf(BusinessException.class);
    }
    @Test void secretAndPlatformFailClosed() {
        var settings=new WechatNotificationSettings(true,"short","wechat","https://site.shizuki.online");
        assertThat(settings.available()).isFalse();
        var enabled=new WechatNotificationSettings(true,"abcdefghijklmnopqrstuvwxyz0123456789","wechat","https://site.shizuki.online");
        assertThatThrownBy(()->enabled.authenticate(null)).isInstanceOf(BusinessException.class);
        assertThatThrownBy(()->enabled.authenticate("Bearer wrong")).isInstanceOf(BusinessException.class);
        assertThatCode(()->enabled.authenticate("Bearer abcdefghijklmnopqrstuvwxyz0123456789")).doesNotThrowAnyException();
        assertThatThrownBy(()->service.lease(new LeaseRequest(List.of("other")))).isInstanceOf(BusinessException.class);
        assertThat(WechatNotificationService.isQuiet(22,8,Instant.parse("2026-10-18T15:00:00Z"))).isTrue();
        assertThat(WechatNotificationService.isQuiet(22,8,Instant.parse("2026-10-18T00:00:00Z"))).isFalse();
    }

    @Test void mysqlMigrationAlsoAppliesToAnIsolatedCompatibilityDatabase() {
        var mysql=new JdbcDataSource();
        mysql.setURL("jdbc:h2:mem:wechat_mysql;MODE=MySQL");
        var connection=new JdbcTemplate(mysql);
        // Hold the database alive across the script's connections.
        try(var held=mysql.getConnection()) {
            connection.execute("CREATE TABLE USR_ACCOUNT(id BIGINT PRIMARY KEY)");
            connection.execute("CREATE TABLE CTN_MOMENT(id BIGINT PRIMARY KEY)");
            new ResourceDatabasePopulator(new FileSystemResource(Path.of(
                "../../apps/monolith-app/src/main/resources/monolith/db/migration/V436__wechat_group_notifications.sql"))).execute(mysql);
            assertThat(connection.queryForObject("SELECT id FROM WX_NOTIFY_MUTEX",Integer.class)).isEqualTo(1);
            assertThat(connection.queryForList("SELECT author_user_id FROM CTN_MOMENT")).isEmpty();
        } catch(java.sql.SQLException e) { throw new AssertionError(e); }
    }
}
