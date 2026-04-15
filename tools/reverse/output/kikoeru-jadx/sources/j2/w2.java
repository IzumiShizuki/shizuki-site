package j2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w2 f10088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w2 f10089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ w2[] f10090c;

    static {
        w2 w2Var = new w2("Shown", 0);
        f10088a = w2Var;
        w2 w2Var2 = new w2("Hidden", 1);
        f10089b = w2Var2;
        f10090c = new w2[]{w2Var, w2Var2};
    }

    public static w2 valueOf(String str) {
        return (w2) Enum.valueOf(w2.class, str);
    }

    public static w2[] values() {
        return (w2[]) f10090c.clone();
    }
}
