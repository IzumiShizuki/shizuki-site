package y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f25088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b0 f25089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b0 f25090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b0[] f25091d;

    static {
        b0 b0Var = new b0("Vertical", 0);
        f25088a = b0Var;
        b0 b0Var2 = new b0("Horizontal", 1);
        f25089b = b0Var2;
        b0 b0Var3 = new b0("Both", 2);
        f25090c = b0Var3;
        f25091d = new b0[]{b0Var, b0Var2, b0Var3};
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) f25091d.clone();
    }
}
