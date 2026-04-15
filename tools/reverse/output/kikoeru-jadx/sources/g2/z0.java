package g2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z0 f7337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z0 f7338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ z0[] f7339c;

    static {
        z0 z0Var = new z0("Width", 0);
        f7337a = z0Var;
        z0 z0Var2 = new z0("Height", 1);
        f7338b = z0Var2;
        f7339c = new z0[]{z0Var, z0Var2};
    }

    public static z0 valueOf(String str) {
        return (z0) Enum.valueOf(z0.class, str);
    }

    public static z0[] values() {
        return (z0[]) f7339c.clone();
    }
}
