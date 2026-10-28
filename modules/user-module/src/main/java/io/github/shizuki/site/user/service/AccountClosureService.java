package io.github.shizuki.site.user.service;

import cn.dev33.satoken.stp.StpUtil;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.user.service.auth.RefreshTokenService;
import java.util.List;
import java.util.UUID;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/** Removes login identity while retaining the user ID for historical references. */
@Service
public class AccountClosureService {

    private final JdbcTemplate db;
    private final ObjectMapper json;
    private final RefreshTokenService refreshTokens;

    public AccountClosureService(JdbcTemplate db, ObjectMapper json, RefreshTokenService refreshTokens) {
        this.db = db;
        this.json = json;
        this.refreshTokens = refreshTokens;
    }

    @Transactional
    public void closeAccount(Long userId, String confirmation) {
        if (userId == null || userId <= 0) {
            throw new BusinessException(ErrorCode.UNAUTHORIZED, "请先登录后再注销账号");
        }
        if (!"注销账号".equals(confirmation)) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "请输入“注销账号”确认");
        }

        // Consistent lock ordering serializes closures, including concurrent administrators.
        List<Account> active = db.query(
            "SELECT id, groups_json FROM USR_ACCOUNT WHERE deleted_flag=0 ORDER BY id FOR UPDATE",
            (row, index) -> new Account(row.getLong("id"), isAdmin(row.getString("groups_json")))
        );
        Account target = active.stream().filter(account -> account.id().equals(userId)).findFirst()
            .orElseThrow(() -> new BusinessException(ErrorCode.UNAUTHORIZED, "账号已注销或不存在"));
        if (target.admin() && active.stream().filter(Account::admin).count() <= 1) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "无法注销最后一个管理员，请先设置另一位管理员");
        }

        // Physical removal releases unique identity keys and erases encrypted credentials.
        for (String table : List.of("OAU_BINDING", "USR_PROVIDER_SECRET", "USR_PREFERENCE")) {
            db.update("DELETE FROM " + table + " WHERE user_id=?", userId);
        }
        db.update("DELETE FROM OAU_LOGIN WHERE user_id=? OR initiator_user_id=?", userId, userId);
        for (String table : List.of("USR_CONTACT_CHALLENGE", "USR_CONTACT_BINDING",
                "WX_NOTIFY_CHALLENGE", "WX_NOTIFY_SUBSCRIPTION", "WX_NOTIFY_DELIVERY", "WX_NOTIFY_PREFERENCE")) {
            db.update("DELETE FROM " + table + " WHERE user_id=?", userId);
        }
        db.update("""
            UPDATE USR_ACCOUNT SET username_code=?, nickname_text='已注销用户', password_hash=NULL,
                email_text=NULL, email_verified_flag=0, avatar_url_text=NULL, groups_json='[]',
                permissions_json='[]', deleted_flag=1, update_time=CURRENT_TIMESTAMP, version_num=version_num+1
            WHERE id=? AND deleted_flag=0
            """, "closed_" + userId + "_" + UUID.randomUUID().toString().replace("-", ""), userId);

        // Failure propagates and rolls the database transaction back; never swallow revocation errors.
        refreshTokens.revokeAll(userId);
        StpUtil.logout(userId);
    }

    private boolean isAdmin(String groups) {
        try {
            return json.readValue(groups, new TypeReference<List<String>>() {}).stream()
                .anyMatch("ADMIN"::equalsIgnoreCase);
        } catch (Exception error) {
            throw new BusinessException(ErrorCode.BAD_REQUEST, "账号分组数据异常，请联系管理员");
        }
    }

    private record Account(Long id, boolean admin) {
    }
}
