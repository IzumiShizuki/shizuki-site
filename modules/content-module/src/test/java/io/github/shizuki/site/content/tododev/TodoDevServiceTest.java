package io.github.shizuki.site.content.tododev;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.shizuki.common.core.error.BusinessException;
import io.github.shizuki.common.core.error.ErrorCode;
import io.github.shizuki.site.content.entity.LightAppTodoDevEntity;
import io.github.shizuki.site.content.entity.LightAppTodoDevEventEntity;
import io.github.shizuki.site.content.entity.LightAppTodoEntity;
import io.github.shizuki.site.content.mapper.LightAppTodoDevEventMapper;
import io.github.shizuki.site.content.mapper.LightAppTodoDevMapper;
import io.github.shizuki.site.content.mapper.LightAppTodoMapper;
import io.github.shizuki.site.content.tododev.TodoDevContract.*;
import io.github.shizuki.site.content.tododev.TodoDevCredential.Actor;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TodoDevServiceTest {
    private final LightAppTodoMapper todos = mock(LightAppTodoMapper.class);
    private final LightAppTodoDevMapper workflows = mock(LightAppTodoDevMapper.class);
    private final LightAppTodoDevEventMapper events = mock(LightAppTodoDevEventMapper.class);
    private final TodoDevService service = new TodoDevService(todos, workflows, events, new ObjectMapper());
    private final Actor agent = new Actor(1, 10L, "MCP");
    private final Actor human = new Actor(1, null, "WEB");
    private final LightAppTodoDevEntity workflow = new LightAppTodoDevEntity();

    @BeforeEach
    void setup() {
        var todo = new LightAppTodoEntity();
        todo.setId(42L);
        todo.setUserId(1L);
        todo.setProjectId(10L);
        todo.setTitle("Migration");
        when(todos.selectById(42L)).thenReturn(todo);
        when(todos.selectOwnedByIdForUpdate(42L, 1L)).thenReturn(todo);
        workflow.setTodoId(42L);
        workflow.setRepository("owner/repo");
        workflow.setStageCode("DESIGN");
        workflow.setStatusCode("READY");
        workflow.setVersion(0);
        when(workflows.selectById(42L)).thenReturn(workflow);
        when(workflows.compareAndSet(eq(42L), anyInt(), anyString(), anyString(), nullable(String.class))).thenReturn(1);
        when(events.insert(any(LightAppTodoDevEventEntity.class))).thenReturn(1);
    }

    @Test
    void progressResumeAndApprovalPreserveLegacyTodo() {
        var progress = service.progress(agent, 42L, new Write(0, "progress1", "Updated design",
            "Compare rollbacks", null, List.of()));
        assertThat(progress.version()).isEqualTo(1);
        var resumed = service.context(agent, 42L);
        assertThat(resumed.stage()).isEqualTo(Stage.DESIGN);
        assertThat(resumed.status()).isEqualTo(Status.IN_PROGRESS);
        assertThat(resumed.nextStep()).isEqualTo("Compare rollbacks");
        assertThat(resumed.skillIds()).containsExactly("todo-dev-design");
        var submitted = service.submit(agent, 42L, new Write(1, "submission1", "Design reviewed",
            null, null, List.of(new Artifact("design", "https://example.com/design"))));
        assertThat(submitted.status()).isEqualTo(Status.AWAITING_APPROVAL);
        assertThat(submitted.stage()).isEqualTo(Stage.DESIGN);
        expect(ErrorCode.FORBIDDEN, () -> service.approve(agent, 42L, new Approve(2, "approve1")));
        var approved = service.approve(human, 42L, new Approve(2, "approve1"));
        assertThat(approved.stage()).isEqualTo(Stage.IMPLEMENTATION);
        assertThat(approved.status()).isEqualTo(Status.READY);
        verifyNoMoreInteractionsAfterReads();
    }

    @Test
    void crossProjectStaleAndInvalidArtifactsFailClosed() {
        expect(ErrorCode.NOT_FOUND, () -> service.context(new Actor(1, 11L, "MCP"), 42L));
        expect(ErrorCode.NOT_FOUND, () -> service.context(new Actor(2, 10L, "MCP"), 42L));
        assertThat(service.search(agent, "Migration", 11L)).isEmpty();
        expect(ErrorCode.CONFLICT, () -> service.progress(agent, 42L,
            new Write(3, "request01", "Stale", null, null, null)));
        expect(ErrorCode.BAD_REQUEST, () -> service.submit(agent, 42L,
            new Write(0, "request02", "No evidence", null, null, null)));
        expect(ErrorCode.BAD_REQUEST, () -> service.submit(agent, 42L,
            new Write(0, "request03", "Unsafe", null, null, List.of(new Artifact("design", "javascript:alert(1)")))));
        verify(workflows, never()).compareAndSet(anyLong(), anyInt(), anyString(), anyString(), nullable(String.class));
        verify(events, never()).insert(any(LightAppTodoDevEventEntity.class));
    }

    @Test
    void fourStagesRecoverFromFailureAndKeepHumanGates() {
        workflow.setStageCode("RESEARCH");
        for (var stage : Stage.values()) {
            var current = service.context(agent, 42L);
            assertThat(current.stage()).isEqualTo(stage);
            var running = service.progress(agent, 42L, new Write(current.version(), "start-" + stage,
                "Started", null, Status.IN_PROGRESS, null));
            if (stage == Stage.IMPLEMENTATION) {
                var failed = service.progress(agent, 42L, new Write(running.version(), "failure-dev",
                    "Local worker failed", null, Status.FAILED, null));
                assertThat(service.context(agent, 42L).status()).isEqualTo(Status.FAILED);
                running = service.progress(agent, 42L, new Write(failed.version(), "retry-dev",
                    "Restarted", null, Status.IN_PROGRESS, null));
            }
            var submitted = service.submit(agent, 42L, new Write(running.version(), "submit-" + stage,
                "Checked evidence", null, null, List.of(new Artifact(stage.artifact, "https://example.org/report"))));
            if (stage.humanApproval) {
                assertThat(submitted.status()).isEqualTo(Status.AWAITING_APPROVAL);
                expect(ErrorCode.FORBIDDEN, () -> service.approve(agent, 42L, new Approve(submitted.version(), "no-approve")));
                service.approve(human, 42L, new Approve(submitted.version(), "approve-" + stage));
            }
        }
        assertThat(service.context(human, 42L).status()).isEqualTo(Status.COMPLETE);
    }

    @Test
    void secondOwnerCannotReadOrUpdateFirstOwnersWorkflow() {
        var foreign = new Actor(2, 10L, "MCP");
        expect(ErrorCode.NOT_FOUND, () -> service.context(foreign, 42L));
        expect(ErrorCode.NOT_FOUND, () -> service.progress(foreign, 42L,
            new Write(0, "foreign-write", "Started", null, Status.IN_PROGRESS, null)));
        verifyNoInteractions(events);
    }

    @Test
    void replayDoesNotAppendAndChangedPayloadConflicts() {
        var request = new Write(0, "progress1", "Updated", null, null, List.of());
        var written = org.mockito.ArgumentCaptor.forClass(LightAppTodoDevEventEntity.class);
        service.progress(agent, 42L, request);
        verify(events).insert(written.capture());
        when(events.selectOne(any())).thenReturn(written.getValue());
        assertThat(service.progress(agent, 42L, request).version()).isEqualTo(1);
        expect(ErrorCode.CONFLICT, () -> service.progress(agent, 42L,
            new Write(0, "progress1", "Different", null, null, List.of())));
        verify(events, times(1)).insert(any(LightAppTodoDevEventEntity.class));
    }

    private void verifyNoMoreInteractionsAfterReads() {
        verify(todos, times(3)).selectOwnedByIdForUpdate(42L, 1L);
        verify(todos).selectById(42L);
        verifyNoMoreInteractions(todos);
    }

    private static void expect(ErrorCode code, org.assertj.core.api.ThrowableAssert.ThrowingCallable action) {
        assertThatThrownBy(action).isInstanceOfSatisfying(BusinessException.class,
            error -> assertThat(error.getErrorCode()).isEqualTo(code));
    }
}
