package io.github.shizuki.site.user.service;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

import cn.dev33.satoken.stp.StpUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.site.user.service.auth.RefreshTokenService;
import java.util.List;
import org.h2.jdbcx.JdbcDataSource;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AccountClosureServiceTest.Config.class)
class AccountClosureServiceTest {
    @Configuration
    @EnableTransactionManagement
    static class Config {
        @Bean JdbcDataSource source() {
            var source = new JdbcDataSource();
            source.setURL("jdbc:h2:mem:account_closure;MODE=PostgreSQL;DB_CLOSE_DELAY=-1");
            return source;
        }
        @Bean JdbcTemplate db(JdbcDataSource source) { return new JdbcTemplate(source); }
        @Bean PlatformTransactionManager transactions(JdbcDataSource source) {
            return new DataSourceTransactionManager(source);
        }
        @Bean RefreshTokenService refreshTokens() { return mock(RefreshTokenService.class); }
        @Bean AccountClosureService service(JdbcTemplate db, RefreshTokenService refreshTokens) {
            return new AccountClosureService(db, new ObjectMapper(), refreshTokens);
        }
    }

    private static final List<String> CHILD_TABLES = List.of("OAU_BINDING", "USR_PROVIDER_SECRET", "USR_PREFERENCE",
        "USR_CONTACT_CHALLENGE", "USR_CONTACT_BINDING", "WX_NOTIFY_CHALLENGE", "WX_NOTIFY_SUBSCRIPTION",
        "WX_NOTIFY_DELIVERY", "WX_NOTIFY_PREFERENCE");
    @Autowired private JdbcTemplate db;
    @Autowired private AccountClosureService service;
    @Autowired private RefreshTokenService refreshTokens;

    @BeforeEach
    void setUp() {
        reset(refreshTokens);
        db.execute("DROP ALL OBJECTS");
        db.execute("""
            CREATE TABLE USR_ACCOUNT(id BIGINT PRIMARY KEY, username_code VARCHAR(64) UNIQUE,
              nickname_text VARCHAR(128), password_hash VARCHAR(255), email_text VARCHAR(128) UNIQUE,
              email_verified_flag INTEGER, avatar_url_text VARCHAR(512), groups_json VARCHAR(512),
              permissions_json VARCHAR(512), deleted_flag INTEGER DEFAULT 0, update_time TIMESTAMP,
              version_num INTEGER DEFAULT 0)
            """);
        db.update("""
            INSERT INTO USR_ACCOUNT(id,username_code,nickname_text,password_hash,email_text,email_verified_flag,
              avatar_url_text,groups_json,permissions_json) VALUES
              (1,'admin','Admin','hash','admin@example.test',1,'https://example.test/1.png','["ADMIN"]','[]'),
              (2,'member','Member','hash','member@example.test',1,'https://example.test/2.png','["USER"]','["read"]')
            """);
        for (String table : CHILD_TABLES) {
            db.execute("CREATE TABLE " + table + "(user_id BIGINT REFERENCES USR_ACCOUNT(id), secret VARCHAR(64))");
            db.update("INSERT INTO " + table + " VALUES(1,'other-user'),(2,'private')");
        }
        db.execute("CREATE TABLE OAU_LOGIN(user_id BIGINT, initiator_user_id BIGINT)");
        db.update("INSERT INTO OAU_LOGIN VALUES(1,NULL),(2,NULL),(NULL,2)");
    }

    @Test
    void removesPrivateIdentityAndAllSessionsWhilePreservingOtherUsers() {
        try (var sessions = mockStatic(StpUtil.class)) {
            service.closeAccount(2L, "注销账号");
            sessions.verify(() -> StpUtil.logout(2L));
        }
        verify(refreshTokens).revokeAll(2L);
        var closed = db.queryForMap("SELECT * FROM USR_ACCOUNT WHERE id=2");
        assertThat(closed.get("DELETED_FLAG")).isEqualTo(1);
        assertThat(closed.get("USERNAME_CODE").toString()).startsWith("closed_2_");
        assertThat(closed.get("NICKNAME_TEXT")).isEqualTo("已注销用户");
        assertThat(closed.get("PASSWORD_HASH")).isNull();
        assertThat(closed.get("EMAIL_TEXT")).isNull();
        assertThat(closed.get("AVATAR_URL_TEXT")).isNull();
        assertThat(closed.get("GROUPS_JSON")).isEqualTo("[]");
        assertThat(closed.get("PERMISSIONS_JSON")).isEqualTo("[]");
        for (String table : CHILD_TABLES) {
            assertThat(db.queryForList("SELECT user_id FROM " + table, Long.class)).containsExactly(1L);
        }
        assertThat(db.queryForObject("SELECT COUNT(*) FROM OAU_LOGIN", Integer.class)).isEqualTo(1);
        assertThat(db.queryForObject("SELECT nickname_text FROM USR_ACCOUNT WHERE id=1", String.class)).isEqualTo("Admin");
        // Both original unique identifiers can be registered again.
        db.update("INSERT INTO USR_ACCOUNT(id,username_code,email_text) VALUES(3,'member','member@example.test')");
    }

    @Test
    void rejectsMissingIdentityWrongConfirmationAndLastAdministrator() {
        assertThatThrownBy(() -> service.closeAccount(null, "注销账号")).isInstanceOf(BusinessException.class);
        assertThatThrownBy(() -> service.closeAccount(2L, "删除")).isInstanceOf(BusinessException.class);
        assertThatThrownBy(() -> service.closeAccount(1L, "注销账号")).hasMessageContaining("最后一个管理员");
        verifyNoInteractions(refreshTokens);
        assertThat(db.queryForObject("SELECT COUNT(*) FROM USR_ACCOUNT WHERE deleted_flag=0", Integer.class)).isEqualTo(2);
    }

    @Test
    void allowsAdministratorClosureWhenAnotherAdministratorRemains() {
        db.update("UPDATE USR_ACCOUNT SET groups_json='[\"ADMIN\"]' WHERE id=2");
        try (var sessions = mockStatic(StpUtil.class)) {
            service.closeAccount(1L, "注销账号");
        }
        assertThatThrownBy(() -> service.closeAccount(2L, "注销账号")).hasMessageContaining("最后一个管理员");
    }

    @Test
    void rollsBackIdentityAndCleanupWhenRefreshRevocationFails() {
        doThrow(new IllegalStateException("Redis unavailable")).when(refreshTokens).revokeAll(2L);
        assertThatThrownBy(() -> service.closeAccount(2L, "注销账号")).hasMessageContaining("Redis unavailable");
        assertIdentityPreserved();
    }

    @Test
    void rollsBackIdentityAndCleanupWhenAccessRevocationFails() {
        try (var sessions = mockStatic(StpUtil.class)) {
            sessions.when(() -> StpUtil.logout(2L)).thenThrow(new IllegalStateException("Access revocation failed"));
            assertThatThrownBy(() -> service.closeAccount(2L, "注销账号")).hasMessageContaining("Access revocation failed");
        }
        assertIdentityPreserved();
    }

    private void assertIdentityPreserved() {
        assertThat(db.queryForObject("SELECT username_code FROM USR_ACCOUNT WHERE id=2 AND deleted_flag=0", String.class))
            .isEqualTo("member");
        for (String table : CHILD_TABLES) {
            assertThat(db.queryForObject("SELECT COUNT(*) FROM " + table + " WHERE user_id=2", Integer.class)).isEqualTo(1);
        }
    }
}
