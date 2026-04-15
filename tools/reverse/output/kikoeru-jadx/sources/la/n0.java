package la;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n0 f12047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n0 f12048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ n0[] f12049c;

    static {
        n0 n0Var = new n0("Tabs", 0);
        f12047a = n0Var;
        n0 n0Var2 = new n0("Divider", 1);
        n0 n0Var3 = new n0("Indicator", 2);
        f12048b = n0Var3;
        f12049c = new n0[]{n0Var, n0Var2, n0Var3};
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) f12049c.clone();
    }
}
