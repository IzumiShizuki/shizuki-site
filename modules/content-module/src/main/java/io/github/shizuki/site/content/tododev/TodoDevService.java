package io.github.shizuki.site.content.tododev;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
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
import java.net.URI;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Comparator;
import java.util.HexFormat;
import java.util.TreeMap;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TodoDevService {
    private static final TypeReference<List<Artifact>> ARTIFACTS = new TypeReference<>() { };
    private final LightAppTodoMapper todos;
    private final LightAppTodoDevMapper workflows;
    private final LightAppTodoDevEventMapper events;
    private final ObjectMapper json;

    public TodoDevService(LightAppTodoMapper todos, LightAppTodoDevMapper workflows,
                          LightAppTodoDevEventMapper events, ObjectMapper json) {
        this.todos = todos;
        this.workflows = workflows;
        this.events = events;
        this.json = json;
    }

    @Transactional(readOnly = true, isolation = Isolation.REPEATABLE_READ)
    public List<Summary> search(Actor actor, String q, Long projectId) {
        String query = q == null ? null : q.strip();
        if ((query != null && query.length() > 200) || (projectId != null && projectId <= 0)) {
            throw bad("Invalid Todo query");
        }
        if (actor.projectId() != null && projectId != null && !projectId.equals(actor.projectId())) {
            return List.of();
        }
        Long scope = actor.projectId() == null ? projectId : actor.projectId();
        List<Long> ids = workflows.searchIds(actor.ownerId(), scope, query, actor.projectId() != null);
        if (ids.isEmpty()) {
            return List.of();
        }
        var matches = todos.selectBatchIds(ids).stream()
            .filter(todo -> visible(actor, todo))
            .collect(Collectors.toMap(LightAppTodoEntity::getId, Function.identity()));
        var dev = workflows.selectBatchIds(ids).stream()
            .collect(Collectors.toMap(LightAppTodoDevEntity::getTodoId, Function.identity()));
        return ids.stream().filter(id -> matches.containsKey(id) && dev.containsKey(id))
            .map(id -> summary(matches.get(id), dev.get(id))).toList();
    }

    @Transactional(readOnly = true, isolation = Isolation.REPEATABLE_READ)
    public Context context(Actor actor, Long id) {
        return snapshot(requireTodo(actor, id, false), requireWorkflow(id));
    }

    @Transactional
    public Context enable(Actor actor, Long id, Enable body) {
        LightAppTodoEntity todo = requireTodo(actor, id, true);
        if (todo.getProjectId() == null) {
            throw bad("Assign the Todo to a project first");
        }
        LightAppTodoDevEntity existing = workflows.selectById(id);
        if (existing != null) {
            if (!existing.getRepository().equalsIgnoreCase(body.repository())) {
                throw conflict("Development workflow already enabled for another repository");
            }
            return snapshot(todo, existing);
        }
        Stage stage = body.skipResearch() ? Stage.DESIGN : Stage.RESEARCH;
        var workflow = new LightAppTodoDevEntity();
        workflow.setTodoId(id);
        workflow.setRepository(body.repository());
        workflow.setStageCode(stage.name());
        workflow.setStatusCode(Status.READY.name());
        workflow.setNextStep(defaultStep(stage));
        workflow.setVersion(0);
        requireWrite(workflows.insert(workflow));
        addEvent(id, "enable", hash(EventType.ENABLE, actor, body),
            EventType.ENABLE, actor, stage, Status.READY, 0, "已启用研发模式", List.of());
        return snapshot(todo, workflow);
    }

    @Transactional
    public Context progress(Actor actor, Long id, Write body) {
        return write(actor, id, EventType.PROGRESS, body);
    }

    @Transactional
    public Context submit(Actor actor, Long id, Write body) {
        return write(actor, id, EventType.SUBMIT, body);
    }

    @Transactional
    public Context approve(Actor actor, Long id, Approve body) {
        if (!"WEB".equals(actor.source())) {
            throw new BusinessException(ErrorCode.FORBIDDEN, "Website approval required");
        }
        LightAppTodoEntity todo = requireTodo(actor, id, true);
        LightAppTodoDevEntity workflow = requireWorkflow(id);
        String hash = hash(EventType.APPROVE, actor, body);
        if (replayed(id, body.requestId(), hash)) {
            return snapshot(todo, workflow);
        }
        checkVersion(workflow, body.expectedVersion());
        Stage stage = Stage.valueOf(workflow.getStageCode());
        if (!stage.humanApproval || !Status.AWAITING_APPROVAL.name().equals(workflow.getStatusCode())) {
            throw conflict("Current stage is not awaiting approval");
        }
        Status status = stage == Stage.VERIFICATION ? Status.COMPLETE : Status.READY;
        String nextStep = status == Status.COMPLETE ? null : defaultStep(stage.next());
        return apply(todo, workflow, body.requestId(), hash, EventType.APPROVE, actor, stage, stage.next(),
            status, nextStep, "已确认阶段成果", List.of());
    }

    private Context write(Actor actor, Long id, EventType type, Write body) {
        LightAppTodoEntity todo = requireTodo(actor, id, true);
        LightAppTodoDevEntity workflow = requireWorkflow(id);
        String hash = hash(type, actor, body);
        if (replayed(id, body.requestId(), hash)) {
            return snapshot(todo, workflow);
        }
        checkVersion(workflow, body.expectedVersion());
        Stage stage = Stage.valueOf(workflow.getStageCode());
        Status before = Status.valueOf(workflow.getStatusCode());
        if (before == Status.AWAITING_APPROVAL || before == Status.COMPLETE) {
            throw conflict("Stage is awaiting approval or workflow is complete");
        }
        List<Artifact> artifacts = body.artifacts() == null ? List.of() : body.artifacts();
        artifacts.forEach(artifact -> validateUrl(artifact.url()));
        String nextStep = body.nextStep() == null ? workflow.getNextStep() : cleanStep(body.nextStep());
        if (type == EventType.PROGRESS) {
            Status status = body.status() == null ? Status.IN_PROGRESS : body.status();
            if (status != Status.IN_PROGRESS && status != Status.BLOCKED && status != Status.FAILED) {
                throw bad("Invalid progress status");
            }
            // Older Todo readers parse the persisted status as a closed enum.
            // Keep the existing blocked state and mark failures in the event.
            String summary = body.summary();
            if (status == Status.FAILED) {
                status = Status.BLOCKED;
                summary = "[RUN_FAILED] " + summary;
            }
            return apply(todo, workflow, body.requestId(), hash, type, actor, stage, stage, status,
                nextStep, summary, artifacts);
        }
        if (body.status() != null) {
            throw bad("The server determines the submission status");
        }
        if (artifacts.stream().noneMatch(a -> a.kind().equals(stage.artifact))) {
            throw bad("Missing required artifact: " + stage.artifact);
        }
        if (stage.humanApproval) {
            return apply(todo, workflow, body.requestId(), hash, type, actor, stage, stage,
                Status.AWAITING_APPROVAL, "等待在 Todo 中确认阶段成果", body.summary(), artifacts);
        }
        return apply(todo, workflow, body.requestId(), hash, type, actor, stage, stage.next(),
            Status.READY, body.nextStep() == null ? defaultStep(stage.next()) : nextStep, body.summary(), artifacts);
    }

    private Context apply(LightAppTodoEntity todo, LightAppTodoDevEntity workflow, String requestId, String hash,
                          EventType type, Actor actor, Stage stage, Stage destination,
                          Status status, String nextStep, String summary, List<Artifact> artifacts) {
        Long id = todo.getId();
        int version = workflow.getVersion();
        if (workflows.compareAndSet(id, version, destination.name(), status.name(), nextStep) != 1) {
            throw conflict("Todo development workflow version changed; reload before retrying");
        }
        addEvent(id, requestId, hash, type, actor, stage, status, version + 1, summary, artifacts);
        workflow.setStageCode(destination.name());
        workflow.setStatusCode(status.name());
        workflow.setNextStep(nextStep);
        workflow.setVersion(version + 1);
        return snapshot(todo, workflow);
    }

    private void addEvent(Long id, String requestId, String hash, EventType type, Actor actor, Stage stage,
                          Status status, int version, String summary, List<Artifact> artifacts) {
        var event = new LightAppTodoDevEventEntity();
        event.setTodoId(id);
        event.setRequestId(requestId);
        event.setRequestHash(hash);
        event.setEventType(type.name());
        event.setStageCode(stage.name());
        event.setStatusCode(status.name());
        event.setSource(actor.source());
        event.setSummary(summary.strip());
        event.setArtifactsJson(encode(artifacts));
        event.setResultingVersion(version);
        event.setCreatedAt(LocalDateTime.now(ZoneOffset.UTC));
        requireWrite(events.insert(event));
    }

    private boolean replayed(Long id, String requestId, String hash) {
        var prior = events.selectOne(new LambdaQueryWrapper<LightAppTodoDevEventEntity>()
            .eq(LightAppTodoDevEventEntity::getTodoId, id)
            .eq(LightAppTodoDevEventEntity::getRequestId, requestId));
        if (prior == null) {
            return false;
        }
        if (!prior.getRequestHash().equals(hash)) {
            throw conflict("Request ID already used for a different update");
        }
        return true;
    }

    private LightAppTodoEntity requireTodo(Actor actor, Long id, boolean lock) {
        LightAppTodoEntity todo = lock ? todos.selectOwnedByIdForUpdate(id, actor.ownerId()) : todos.selectById(id);
        if (!visible(actor, todo)) {
            throw missing();
        }
        return todo;
    }

    private boolean visible(Actor actor, LightAppTodoEntity todo) {
        return todo != null && Objects.equals(todo.getUserId(), actor.ownerId())
            && (actor.projectId() == null || actor.projectId().equals(todo.getProjectId()));
    }

    private LightAppTodoDevEntity requireWorkflow(Long id) {
        LightAppTodoDevEntity workflow = workflows.selectById(id);
        if (workflow == null) {
            throw missing();
        }
        return workflow;
    }

    private Summary summary(LightAppTodoEntity todo, LightAppTodoDevEntity workflow) {
        return new Summary(todo.getId().toString(), todo.getProjectId() == null ? null : todo.getProjectId().toString(),
            todo.getTitle(), workflow.getRepository(), Stage.valueOf(workflow.getStageCode()),
            Status.valueOf(workflow.getStatusCode()), workflow.getVersion(), workflow.getNextStep());
    }

    private Context snapshot(LightAppTodoEntity todo, LightAppTodoDevEntity workflow) {
        Summary summary = summary(todo, workflow);
        var recent = events.selectList(new LambdaQueryWrapper<LightAppTodoDevEventEntity>()
            .eq(LightAppTodoDevEventEntity::getTodoId, todo.getId())
            .orderByDesc(LightAppTodoDevEventEntity::getResultingVersion)
            .last("LIMIT 30"));
        var handoff = new TreeMap<Integer, LightAppTodoDevEventEntity>(Comparator.reverseOrder());
        recent.forEach(row -> handoff.put(row.getResultingVersion(), row));
        if (recent.size() == 30) {
            // Stage deliverables are useful even after dozens of newer progress notes.
            events.selectList(new LambdaQueryWrapper<LightAppTodoDevEventEntity>()
                .eq(LightAppTodoDevEventEntity::getTodoId, todo.getId())
                .eq(LightAppTodoDevEventEntity::getEventType, EventType.SUBMIT.name())
                .orderByDesc(LightAppTodoDevEventEntity::getResultingVersion)
                .last("LIMIT 4")).forEach(row -> handoff.put(row.getResultingVersion(), row));
        }
        List<Event> history = handoff.values().stream()
            .map(row -> new Event(EventType.valueOf(row.getEventType()), Stage.valueOf(row.getStageCode()),
                Status.valueOf(row.getStatusCode()), row.getSource(), row.getSummary(), decode(row.getArtifactsJson()),
                row.getCreatedAt())).toList();
        return new Context(summary.todoId(), summary.projectId(), summary.title(), summary.repository(),
            summary.stage(), summary.status(), summary.version(), summary.nextStep(),
            summary.stage().skillIds(), summary.stage().artifact, history, events.stageClocks(todo.getId()));
    }

    private static String cleanStep(String value) {
        return value.isBlank() ? null : value.strip();
    }

    private static String defaultStep(Stage stage) {
        return switch (stage) {
            case RESEARCH -> "核对现状、依赖和实施风险";
            case DESIGN -> "整理方案、验证标准和回滚策略";
            case IMPLEMENTATION -> "按已确认方案实现并运行相关测试";
            case VERIFICATION -> "执行验收，记录通过项和未验证项";
        };
    }

    private static void checkVersion(LightAppTodoDevEntity workflow, int expected) {
        if (workflow.getVersion() != expected) {
            throw conflict("Todo development workflow version changed; reload before retrying");
        }
    }

    private static void validateUrl(String raw) {
        URI uri;
        try {
            uri = URI.create(raw);
        } catch (IllegalArgumentException e) {
            throw bad("Invalid artifact URL");
        }
        if (!("https".equalsIgnoreCase(uri.getScheme()) || "http".equalsIgnoreCase(uri.getScheme()))
            || uri.getHost() == null || uri.getUserInfo() != null) {
            throw bad("Artifact URL must be HTTP(S) without embedded credentials");
        }
    }

    private String hash(EventType type, Actor actor, Object request) {
        return HexFormat.of().formatHex(TodoDevCredential.sha256(encode(
            List.of(type.name(), actor.source(), actor.ownerId(), request))));
    }

    private String encode(Object value) {
        try {
            return json.writeValueAsString(value);
        } catch (JsonProcessingException e) {
            throw new IllegalStateException("Cannot encode Todo development record", e);
        }
    }

    private List<Artifact> decode(String value) {
        try {
            return json.readValue(value, ARTIFACTS);
        } catch (JsonProcessingException e) {
            throw new IllegalStateException("Cannot read Todo development artifact record", e);
        }
    }

    private static void requireWrite(int rows) {
        if (rows != 1) {
            throw new IllegalStateException("Todo development record could not be saved");
        }
    }

    private static BusinessException missing() {
        return new BusinessException(ErrorCode.NOT_FOUND, "Todo development workflow not found");
    }

    private static BusinessException conflict(String message) {
        return new BusinessException(ErrorCode.CONFLICT, message);
    }

    private static BusinessException bad(String message) {
        return new BusinessException(ErrorCode.BAD_REQUEST, message);
    }
}
