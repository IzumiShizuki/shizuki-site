package io.github.shizuki.site.media.model;

/**
 * L2D 包校验结果枚举。
 */
public enum L2dValidationEnum {
    /**
     * 校验通过。
     */
    PASSED(1),
    /**
     * 校验失败。
     */
    FAILED(2);

    private final int code;

    L2dValidationEnum(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
