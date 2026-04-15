package t2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f20398b = new u(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20399a;

    public u() {
        this.f20399a = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            return this.f20399a == ((u) obj).f20399a;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f20399a ? 1231 : 1237) * 31;
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f20399a + ", emojiSupportMatch=EmojiSupportMatch.Default)";
    }

    public u(boolean z10) {
        this.f20399a = z10;
    }
}
