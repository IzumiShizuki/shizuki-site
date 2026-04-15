package m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u2 f13690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u2 f13691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ u2[] f13692c;

    static {
        u2 u2Var = new u2("Closed", 0);
        f13690a = u2Var;
        u2 u2Var2 = new u2("Open", 1);
        f13691b = u2Var2;
        f13692c = new u2[]{u2Var, u2Var2};
    }

    public static u2 valueOf(String str) {
        return (u2) Enum.valueOf(u2.class, str);
    }

    public static u2[] values() {
        return (u2[]) f13692c.clone();
    }
}
