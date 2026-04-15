package bg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p0 f2950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ p0[] f2951b;

    static {
        p0 p0Var = new p0("updated_at", 0);
        f2950a = p0Var;
        f2951b = new p0[]{p0Var, new p0("userRating", 1), new p0("release", 2), new p0("review_count", 3), new p0("dl_count", 4), new p0("nsfw", 5)};
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) f2951b.clone();
    }
}
