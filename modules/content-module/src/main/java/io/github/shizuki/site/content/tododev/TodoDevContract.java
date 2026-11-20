package io.github.shizuki.site.content.tododev;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Locale;

public final class TodoDevContract {
    private TodoDevContract() { }

    static final String REQUEST_ID = "[A-Za-z0-9_-]{8,64}";

    public enum Stage {
        RESEARCH("research", false),
        DESIGN("design", true),
        IMPLEMENTATION("implementation", false),
        VERIFICATION("verification", true);

        final String artifact;
        final boolean humanApproval;

        Stage(String artifact, boolean humanApproval) {
            this.artifact = artifact;
            this.humanApproval = humanApproval;
        }

        Stage next() {
            return ordinal() == values().length - 1 ? this : values()[ordinal() + 1];
        }

        List<String> skillIds() {
            return List.of("todo-dev-" + name().toLowerCase(Locale.ROOT));
        }
    }

    public enum Status {
        READY, IN_PROGRESS, BLOCKED, FAILED, AWAITING_APPROVAL, COMPLETE
    }

    public enum EventType {
        ENABLE, PROGRESS, SUBMIT, APPROVE
    }

    public record Enable(
        @NotBlank @Size(max = 201)
        @Pattern(regexp = "[A-Za-z0-9][A-Za-z0-9_.-]{0,99}/[A-Za-z0-9][A-Za-z0-9_.-]{0,99}") String repository,
        boolean skipResearch
    ) { }

    public record Artifact(
        @NotBlank @Pattern(regexp = "[a-z][a-z0-9_-]{0,31}") String kind,
        @NotBlank @Size(max = 2048) String url
    ) { }

    public record Write(
        @NotNull @Min(0) Integer expectedVersion,
        @NotNull @Pattern(regexp = REQUEST_ID) String requestId,
        @NotBlank @Size(max = 1000) String summary,
        @Size(max = 500) String nextStep,
        Status status,
        @Size(max = 8) List<@NotNull @Valid Artifact> artifacts
    ) { }

    public record Approve(
        @NotNull @Min(0) Integer expectedVersion,
        @NotNull @Pattern(regexp = REQUEST_ID) String requestId
    ) { }

    public record Summary(String todoId, String projectId, String title, String repository,
                          Stage stage, Status status, int version, String nextStep) { }

    public record Context(String todoId, String projectId, String title, String repository,
                          Stage stage, Status status, int version, String nextStep,
                          List<String> skillIds, String requiredArtifact, List<Event> events,
                          List<StageClock> stageClocks) { }

    public record StageClock(String stage, LocalDateTime startedAt, LocalDateTime lastEventAt) { }

    public record Event(EventType eventType, Stage stage, Status status, String source,
                        String summary, List<Artifact> artifacts, LocalDateTime createdAt) { }
}
