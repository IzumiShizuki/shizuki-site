package r;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o0 f18506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ o0[] f18507b;

    static {
        o0 o0Var = new o0("Restart", 0);
        f18506a = o0Var;
        f18507b = new o0[]{o0Var, new o0("Reverse", 1)};
    }

    public static o0 valueOf(String str) {
        return (o0) Enum.valueOf(o0.class, str);
    }

    public static o0[] values() {
        return (o0[]) f18507b.clone();
    }
}
