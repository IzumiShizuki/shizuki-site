package io.github.shizuki.site.content.mapper.publiccontent;

/** Opaque public identity affected by a managed photo or derivative state change. */
public class PublicContentCacheTargetRow {

    private String contentType;
    private String publicIdentifier;

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getPublicIdentifier() {
        return publicIdentifier;
    }

    public void setPublicIdentifier(String publicIdentifier) {
        this.publicIdentifier = publicIdentifier;
    }
}
