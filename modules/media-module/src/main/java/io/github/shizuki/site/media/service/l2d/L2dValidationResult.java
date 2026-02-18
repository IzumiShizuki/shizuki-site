package io.github.shizuki.site.media.service.l2d;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * L2D ZIP 校验结果。
 */
public class L2dValidationResult {

    /**
     * 唯一入口 model3.json 的包内路径。
     */
    private String entryModelJson;
    /**
     * Moc 文件路径（解析自 FileReferences）。
     */
    private String mocPath;
    /**
     * 纹理文件数量。
     */
    private int textureCount;
    /**
     * Motion 组数量（按分组计数）。
     */
    private int motionGroupCount;
    /**
     * Expression 数量。
     */
    private int expressionCount;
    /**
     * 是否声明并校验通过 Physics 文件。
     */
    private boolean hasPhysics;
    /**
     * 是否声明并校验通过 Pose 文件。
     */
    private boolean hasPose;
    /**
     * 模型引用文件清单（去重后）。
     */
    private Set<String> references = new LinkedHashSet<>();

    public String getEntryModelJson() {
        return entryModelJson;
    }

    public void setEntryModelJson(String entryModelJson) {
        this.entryModelJson = entryModelJson;
    }

    public String getMocPath() {
        return mocPath;
    }

    public void setMocPath(String mocPath) {
        this.mocPath = mocPath;
    }

    public int getTextureCount() {
        return textureCount;
    }

    public void setTextureCount(int textureCount) {
        this.textureCount = textureCount;
    }

    public int getMotionGroupCount() {
        return motionGroupCount;
    }

    public void setMotionGroupCount(int motionGroupCount) {
        this.motionGroupCount = motionGroupCount;
    }

    public int getExpressionCount() {
        return expressionCount;
    }

    public void setExpressionCount(int expressionCount) {
        this.expressionCount = expressionCount;
    }

    public boolean isHasPhysics() {
        return hasPhysics;
    }

    public void setHasPhysics(boolean hasPhysics) {
        this.hasPhysics = hasPhysics;
    }

    public boolean isHasPose() {
        return hasPose;
    }

    public void setHasPose(boolean hasPose) {
        this.hasPose = hasPose;
    }

    public Set<String> getReferences() {
        return references;
    }

    public void setReferences(Set<String> references) {
        this.references = references;
    }
}
