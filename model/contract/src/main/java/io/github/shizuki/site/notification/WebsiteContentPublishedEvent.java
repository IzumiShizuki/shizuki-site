package io.github.shizuki.site.notification;

/** Source identity only; delivery resolves current visibility and text. */
public record WebsiteContentPublishedEvent(String kind, String sourceId, Long authorId) {
    public String eventKey() { return kind + ":" + sourceId; }
}
