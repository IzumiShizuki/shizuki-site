package bg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e2 f2876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e2 f2877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e2 f2878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e2 f2879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ e2[] f2880e;

    static {
        e2 e2Var = new e2("release", 0);
        f2876a = e2Var;
        e2 e2Var2 = new e2("create_date", 1);
        f2877b = e2Var2;
        e2 e2Var3 = new e2("created_at", 2);
        f2878c = e2Var3;
        e2 e2Var4 = new e2("rating", 3);
        e2 e2Var5 = new e2("dl_count", 4);
        e2 e2Var6 = new e2("price", 5);
        e2 e2Var7 = new e2("rate_average_2dp", 6);
        e2 e2Var8 = new e2("review_count", 7);
        e2 e2Var9 = new e2("id", 8);
        e2 e2Var10 = new e2("nsfw", 9);
        e2 e2Var11 = new e2("random", 10);
        f2879d = e2Var11;
        f2880e = new e2[]{e2Var, e2Var2, e2Var3, e2Var4, e2Var5, e2Var6, e2Var7, e2Var8, e2Var9, e2Var10, e2Var11};
    }

    public static e2 valueOf(String str) {
        return (e2) Enum.valueOf(e2.class, str);
    }

    public static e2[] values() {
        return (e2[]) f2880e.clone();
    }
}
