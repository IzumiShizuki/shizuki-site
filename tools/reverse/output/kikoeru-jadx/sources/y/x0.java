package y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x0 f25284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ x0[] f25285b;

    static {
        x0 x0Var = new x0("Horizontal", 0);
        f25284a = x0Var;
        f25285b = new x0[]{x0Var, new x0("Vertical", 1)};
    }

    public static x0 valueOf(String str) {
        return (x0) Enum.valueOf(x0.class, str);
    }

    public static x0[] values() {
        return (x0[]) f25285b.clone();
    }
}
