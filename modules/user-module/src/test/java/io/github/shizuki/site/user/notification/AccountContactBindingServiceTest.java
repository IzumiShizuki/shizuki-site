package io.github.shizuki.site.user.notification;

import static io.github.shizuki.site.user.notification.AccountContactModels.*;
import static io.github.shizuki.site.user.notification.WechatNotificationModels.PrivateSender;
import static org.assertj.core.api.Assertions.*;

import java.nio.file.Path;
import java.nio.charset.StandardCharsets;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import org.h2.jdbcx.JdbcDataSource;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.FileSystemResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

class AccountContactBindingServiceTest {
    private static final Instant NOW = Instant.parse("2026-10-20T12:00:00Z");
    private JdbcTemplate db;
    private AccountContactBindingService service;

    @BeforeEach
    void setUp() {
        JdbcDataSource source = new JdbcDataSource();
        source.setURL("jdbc:h2:mem:contacts_" + System.nanoTime() + ";MODE=PostgreSQL;DB_CLOSE_DELAY=-1");
        db = new JdbcTemplate(source);
        db.execute("CREATE TABLE USR_ACCOUNT(id BIGINT PRIMARY KEY, deleted_flag INTEGER DEFAULT 0)");
        db.update("INSERT INTO USR_ACCOUNT(id) VALUES(1),(2),(3)");
        db.execute("""
            CREATE TABLE WX_NOTIFY_PREFERENCE (
                user_id BIGINT PRIMARY KEY, platform_id VARCHAR(128), sender_id VARCHAR(256),
                origin_text VARCHAR(768), identity_hash VARCHAR(64), binding_version VARCHAR(36), bound_at TIMESTAMP
            )
            """);
        db.update("""
            INSERT INTO WX_NOTIFY_PREFERENCE(user_id,platform_id,sender_id,origin_text,identity_hash,binding_version,bound_at)
            VALUES(3,'wechat','legacy-wechat-5678','wechat:FriendMessage:legacy-wechat-5678',
                'legacy-identity-hash','legacy-binding-version',?)
            """, java.sql.Timestamp.from(NOW));
        ResourceDatabasePopulator migration = new ResourceDatabasePopulator(new FileSystemResource(Path.of(
            "../../apps/monolith-app/src/main/resources/monolith/db/migration-pg/V1019__account_contact_bindings.sql")));
        migration.setSqlScriptEncoding(StandardCharsets.UTF_8.name());
        migration.execute(source);
        var settings = new AccountContactBindingSettings(true, "test-secret-with-at-least-32-characters",
            "wechat,qq,onebot", "https://site.shizuki.online");
        service = new AccountContactBindingService(db, settings, Clock.fixed(NOW, ZoneOffset.UTC));
    }

    @Test
    void migratesExistingWechatBindingIntoSharedDirectory() {
        ContactBinding migrated = service.status(3).bindings().get(0);
        assertThat(migrated.platform()).isEqualTo("WECHAT");
        assertThat(migrated.maskedIdentity()).isEqualTo("微信 ···5678");
        assertThat(migrated.todoEditEnabled()).isTrue();
        assertThat(migrated.todoNotifyEnabled()).isTrue();
    }

    @Test
    void createsHashedSingleUseChallengeAndMasksIdentity() {
        Challenge challenge = service.challenge(1, "QQ");
        assertThat(db.queryForObject("SELECT code_hash FROM USR_CONTACT_CHALLENGE", String.class))
            .hasSize(64).isNotEqualTo(challenge.command());

        service.confirm(new Confirmation(challenge.command().split(" ")[2], "QQ",
            new PrivateSender("onebot", "12345678", "onebot:FriendMessage:12345678")));

        ContactBinding binding = service.status(1).bindings().get(0);
        assertThat(binding.maskedIdentity()).isEqualTo("QQ ···5678");
        assertThat(binding.todoEditEnabled()).isTrue();
        assertThat(binding.todoNotifyEnabled()).isTrue();
        assertThatThrownBy(() -> service.confirm(new Confirmation(
            challenge.command().split(" ")[2], "QQ",
            new PrivateSender("onebot", "12345678", "onebot:FriendMessage:12345678"))))
            .isInstanceOf(RuntimeException.class);
    }

    @Test
    void preventsCrossAccountReuseAndAllowsOwnerToRebindAfterUnbinding() {
        Challenge first = service.challenge(1, "WECHAT");
        PrivateSender sender = new PrivateSender("wechat", "wx-id", "wechat:FriendMessage:wx-id");
        service.confirm(new Confirmation(first.command().split(" ")[2], "WECHAT", sender));
        String id = service.status(1).bindings().get(0).id();
        service.unbind(1, id);

        Challenge second = service.challenge(2, "WECHAT");
        assertThatThrownBy(() -> service.confirm(new Confirmation(
            second.command().split(" ")[2], "WECHAT", sender)))
            .isInstanceOf(RuntimeException.class);

        Challenge owner = service.challenge(1, "WECHAT");
        service.confirm(new Confirmation(owner.command().split(" ")[2], "WECHAT", sender));
        assertThat(service.status(1).bindings()).hasSize(1);
        assertThat(service.status(2).bindings()).isEmpty();
    }
}
