package io.github.shizuki.site.content.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.util.List;

@Schema(description = "轻应用待办排序请求")
public class LightAppTodoReorderRequest {

    @Valid
    @NotEmpty
    @Schema(description = "排序项")
    private List<Item> items;

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public static class Item {

        @NotNull
        @Schema(description = "待办ID")
        private Long todoId;

        @NotNull
        @Schema(description = "排序值")
        private Integer sortNum;

        public Long getTodoId() {
            return todoId;
        }

        public void setTodoId(Long todoId) {
            this.todoId = todoId;
        }

        public Integer getSortNum() {
            return sortNum;
        }

        public void setSortNum(Integer sortNum) {
            this.sortNum = sortNum;
        }
    }
}
