package io.github.shizuki.site.content.service;

import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.content.entity.LoginAppearanceEntity;
import io.github.shizuki.site.content.mapper.LoginAppearanceMapper;
import io.github.shizuki.site.content.request.LoginAppearanceSaveRequest;
import io.github.shizuki.site.content.response.LoginAppearanceResponse;
import java.util.Set;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

/**
 * 站点级登录页外观配置服务。
 *
 * <p>单例行配置由管理员写入、公开接口只读。写路径使用乐观版本号避免并发覆盖。
 */
@Service
public class LoginAppearanceService {

    public static final String SINGLETON_KEY = "SITE";
    private static final String DEFAULT_PRESET = "milkshake";
    private static final Set<String> SUPPORTED_PRESETS =
        Set.of("milkshake", "blueberry", "peach", "matcha", "mint", "galaxy");

    private final LoginAppearanceMapper appearanceMapper;

    public LoginAppearanceService(LoginAppearanceMapper appearanceMapper) {
        this.appearanceMapper = appearanceMapper;
    }

    /** 管理员读取当前配置；未初始化时返回默认快照。 */
    @Transactional(readOnly = true)
    public LoginAppearanceResponse getAdminSnapshot() {
        return toSnapshot(loadActive());
    }

    /** 管理员保存配置（乐观版本号控制）。 */
    @Transactional(rollbackFor = Exception.class)
    public LoginAppearanceResponse save(LoginAppearanceSaveRequest request) {
        if (request == null || request.expectedVersion() < 0) {
            throw badRequest("configuration version must be non-negative");
        }
        String preset = normalizePreset(request.themePreset());
        String bgImageUrl = normalizeUrl(request.bgImageUrl());
        String mascotImageUrl = normalizeUrl(request.mascotImageUrl());

        LoginAppearanceEntity current = loadActive();
        int expectedVersion = request.expectedVersion();
        int currentVersion = current == null ? 0 : valueOrZero(current.getVersion());
        if (expectedVersion != currentVersion) {
            throw versionConflict(currentVersion);
        }

        if (current == null) {
            LoginAppearanceEntity created = new LoginAppearanceEntity();
            created.setSingletonKey(SINGLETON_KEY);
            created.setThemePreset(preset);
            created.setBgImageUrl(bgImageUrl);
            created.setMascotImageUrl(mascotImageUrl);
            created.setDeleted(0);
            created.setVersion(expectedVersion + 1);
            appearanceMapper.insert(created);
            return toSnapshot(created);
        }

        int updated = appearanceMapper.updateVersioned(
            SINGLETON_KEY,
            expectedVersion,
            preset,
            bgImageUrl,
            mascotImageUrl
        );
        if (updated != 1) {
            throw versionConflict(valueOrZero(loadActive().getVersion()));
        }
        return toSnapshot(loadActive());
    }

    /** 公开读取：仅有默认预设且未配置图片时视为未配置，返回 null 让前端回退到本地主题。 */
    @Transactional(readOnly = true)
    public LoginAppearanceResponse publicSnapshot() {
        LoginAppearanceEntity entity = loadActive();
        if (entity == null) {
            return null;
        }
        String preset = entity.getThemePreset() == null ? "" : entity.getThemePreset().trim();
        boolean meaningful = StringUtils.hasText(entity.getBgImageUrl())
            || StringUtils.hasText(entity.getMascotImageUrl())
            || (!preset.isEmpty() && !DEFAULT_PRESET.equals(preset));
        if (!meaningful) {
            return null;
        }
        return toSnapshot(entity);
    }

    private LoginAppearanceEntity loadActive() {
        LoginAppearanceEntity entity = appearanceMapper.selectById(SINGLETON_KEY);
        if (entity == null || Integer.valueOf(1).equals(entity.getDeleted())) {
            return null;
        }
        return entity;
    }

    private LoginAppearanceResponse toSnapshot(LoginAppearanceEntity entity) {
        if (entity == null) {
            return new LoginAppearanceResponse(DEFAULT_PRESET, "", "", 0);
        }
        return new LoginAppearanceResponse(
            normalizePreset(entity.getThemePreset()),
            StringUtils.hasText(entity.getBgImageUrl()) ? entity.getBgImageUrl() : "",
            StringUtils.hasText(entity.getMascotImageUrl()) ? entity.getMascotImageUrl() : "",
            valueOrZero(entity.getVersion())
        );
    }

    private String normalizePreset(String raw) {
        String normalized = raw == null ? "" : raw.trim();
        if (normalized.isEmpty()) {
            return DEFAULT_PRESET;
        }
        if (!SUPPORTED_PRESETS.contains(normalized)) {
            throw badRequest("unsupported theme preset: " + normalized);
        }
        return normalized;
    }

    private String normalizeUrl(String raw) {
        String normalized = raw == null ? "" : raw.trim();
        if (normalized.length() > 4096) {
            throw badRequest("image url too long");
        }
        if (!normalized.isEmpty() && !normalized.startsWith("http://") && !normalized.startsWith("https://")
            && !normalized.startsWith("/") && !normalized.startsWith("data:image/")) {
            throw badRequest("image url must be an absolute http(s) url, a site path, or a data image url");
        }
        return normalized;
    }

    private BusinessException versionConflict(int currentVersion) {
        return new BusinessException(
            ErrorCode.CONFLICT,
            "Login appearance configuration version conflict",
            java.util.Map.of("current_version", currentVersion)
        );
    }

    private BusinessException badRequest(String message) {
        return new BusinessException(ErrorCode.BAD_REQUEST, message);
    }

    private int valueOrZero(Integer value) {
        return value == null ? 0 : value;
    }
}
