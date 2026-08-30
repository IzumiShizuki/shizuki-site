package io.github.shizuki.site.user.service;

import io.github.shizuki.site.user.response.AdminPermissionOptionResponse;
import io.github.shizuki.site.user.response.AdminQuotaOptionResponse;
import java.util.List;
import java.util.Locale;

/**
 * 管理后台内置目录：权限码与配额码的展示标签、描述、分类。
 *
 * <p>数据库中新出现的编码会以“自定义”身份合并进目录，
 * 这里只维护系统内已知的内置项，保证权限选择器/配额面板不再只有裸编码。
 */
public final class AdminCatalogDefaults {

    /** 配额单位：次数。 */
    public static final String QUOTA_UNIT_COUNT = "count";
    /** 配额单位：字节。 */
    public static final String QUOTA_UNIT_BYTES = "bytes";

    private static final List<AdminPermissionOptionResponse> BUILTIN_PERMISSIONS = List.of(
        new AdminPermissionOptionResponse(
            "basic.read", "基础浏览", "访问站点公开内容的基础读取权限", "基础", true),
        new AdminPermissionOptionResponse(
            "music.asmr.access", "音声内容访问", "允许收听 ASMR / 音声分区内容", "音乐", true),
        new AdminPermissionOptionResponse(
            "user.group.read", "用户分组查看", "查看用户与分组归属关系", "后台·用户", true),
        new AdminPermissionOptionResponse(
            "user.group.write", "用户分组管理", "调整用户所属分组（写操作需二次验证）", "后台·用户", true),
        new AdminPermissionOptionResponse(
            "group.permission.read", "分组权限查看", "查看各分组的权限配置", "后台·权限", true),
        new AdminPermissionOptionResponse(
            "group.permission.write", "分组权限管理", "修改分组权限映射（写操作需二次验证）", "后台·权限", true),
        new AdminPermissionOptionResponse(
            "quota.policy.read", "配额策略查看", "查看分组配额策略", "后台·配额", true),
        new AdminPermissionOptionResponse(
            "quota.policy.write", "配额策略管理", "修改分组配额策略（写操作需二次验证）", "后台·配额", true),
        new AdminPermissionOptionResponse(
            "life.content.manage", "生活内容管理", "管理个人相册、照片与生活动态", "后台·内容", true),
        new AdminPermissionOptionResponse(
            "site.widgets.manage", "站点组件管理", "维护天气、今日一言与站点组件配置", "后台·站点", true),
        new AdminPermissionOptionResponse(
            "media.derivative.manage", "媒体派生管理", "处理并审计隐私安全的媒体派生资源", "后台·媒体", true)
    );

    private static final List<AdminQuotaOptionResponse> BUILTIN_QUOTAS = List.of(
        new AdminQuotaOptionResponse(
            "ai_round_total", "AI 对话轮次", "每位用户可用的 AI 对话总轮数", QUOTA_UNIT_COUNT, true),
        new AdminQuotaOptionResponse(
            "music_song_pick_total", "音乐点歌次数", "音乐台点歌/搜索播放的总次数", QUOTA_UNIT_COUNT, true),
        new AdminQuotaOptionResponse(
            "music_upload_bytes_total", "音乐上传容量", "用户可上传音频文件的总容量", QUOTA_UNIT_BYTES, true)
    );

    private AdminCatalogDefaults() {
    }

    public static List<AdminPermissionOptionResponse> builtinPermissions() {
        return BUILTIN_PERMISSIONS;
    }

    public static List<AdminQuotaOptionResponse> builtinQuotas() {
        return BUILTIN_QUOTAS;
    }

    /**
     * 为数据库中发现、但目录未收录的权限码构造“自定义”目录项，分类按编码前缀推断。
     */
    public static AdminPermissionOptionResponse customPermission(String code) {
        return new AdminPermissionOptionResponse(code, code, "自定义权限码", inferCategory(code), false);
    }

    /**
     * 为数据库中发现、但目录未收录的配额码构造“自定义”目录项，字节类编码按后缀推断单位。
     */
    public static AdminQuotaOptionResponse customQuota(String code) {
        String unit = code != null && code.toLowerCase(Locale.ROOT).contains("bytes")
            ? QUOTA_UNIT_BYTES
            : QUOTA_UNIT_COUNT;
        return new AdminQuotaOptionResponse(code, code, "自定义配额项", unit, false);
    }

    private static String inferCategory(String code) {
        if (code == null) {
            return "其他";
        }
        int dotIndex = code.indexOf('.');
        String prefix = (dotIndex > 0 ? code.substring(0, dotIndex) : code).toLowerCase(Locale.ROOT);
        return switch (prefix) {
            case "basic" -> "基础";
            case "music" -> "音乐";
            case "user" -> "后台·用户";
            case "group" -> "后台·权限";
            case "quota" -> "后台·配额";
            case "life" -> "后台·内容";
            case "site" -> "后台·站点";
            case "media" -> "后台·媒体";
            case "blog", "post" -> "博客";
            case "ai" -> "AI";
            default -> "其他";
        };
    }
}
