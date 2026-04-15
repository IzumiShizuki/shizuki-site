package x0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g1 f24308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g1 f24309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g1 f24310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ g1[] f24311d;

    /* JADX INFO: Fake field, exist only in values array */
    g1 EF0;

    static {
        g1 g1Var = new g1("Invalid", 0);
        g1 g1Var2 = new g1("Cancelled", 1);
        f24308a = g1Var2;
        g1 g1Var3 = new g1("InitialPending", 2);
        g1 g1Var4 = new g1("RecomposePending", 3);
        g1 g1Var5 = new g1("Recomposing", 4);
        f24309b = g1Var5;
        g1 g1Var6 = new g1("ApplyPending", 5);
        f24310c = g1Var6;
        f24311d = new g1[]{g1Var, g1Var2, g1Var3, g1Var4, g1Var5, g1Var6, new g1("Applied", 6)};
    }

    public static g1 valueOf(String str) {
        return (g1) Enum.valueOf(g1.class, str);
    }

    public static g1[] values() {
        return (g1[]) f24311d.clone();
    }
}
