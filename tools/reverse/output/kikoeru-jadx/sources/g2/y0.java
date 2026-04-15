package g2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y0 f7320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y0 f7321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ y0[] f7322c;

    static {
        y0 y0Var = new y0("Min", 0);
        f7320a = y0Var;
        y0 y0Var2 = new y0("Max", 1);
        f7321b = y0Var2;
        f7322c = new y0[]{y0Var, y0Var2};
    }

    public static y0 valueOf(String str) {
        return (y0) Enum.valueOf(y0.class, str);
    }

    public static y0[] values() {
        return (y0[]) f7322c.clone();
    }
}
