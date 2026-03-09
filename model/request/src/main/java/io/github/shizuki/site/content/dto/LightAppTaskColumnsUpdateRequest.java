package io.github.shizuki.site.content.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.List;

@Schema(description = "轻应用任务列配置更新请求")
public class LightAppTaskColumnsUpdateRequest {

    @Valid
    @NotEmpty
    @Schema(description = "列配置列表")
    private List<Item> columns;

    public List<Item> getColumns() {
        return columns;
    }

    public void setColumns(List<Item> columns) {
        this.columns = columns;
    }

    public static class Item {

        @NotBlank
        @Size(max = 64)
        @Schema(description = "列编码")
        private String columnCode;

        @NotBlank
        @Size(max = 120)
        @Schema(description = "列标题")
        private String title;

        @NotNull
        @Schema(description = "排序值")
        private Integer sortNum;

        @NotNull
        @Schema(description = "是否启用")
        private Boolean enabled;

        public String getColumnCode() {
            return columnCode;
        }

        public void setColumnCode(String columnCode) {
            this.columnCode = columnCode;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Integer getSortNum() {
            return sortNum;
        }

        public void setSortNum(Integer sortNum) {
            this.sortNum = sortNum;
        }

        public Boolean getEnabled() {
            return enabled;
        }

        public void setEnabled(Boolean enabled) {
            this.enabled = enabled;
        }
    }
}
