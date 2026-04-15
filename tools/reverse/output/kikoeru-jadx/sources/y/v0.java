package y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v0 f25270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v0 f25271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ v0[] f25272c;

    static {
        v0 v0Var = new v0("Min", 0);
        f25270a = v0Var;
        v0 v0Var2 = new v0("Max", 1);
        f25271b = v0Var2;
        f25272c = new v0[]{v0Var, v0Var2};
    }

    public static v0 valueOf(String str) {
        return (v0) Enum.valueOf(v0.class, str);
    }

    public static v0[] values() {
        return (v0[]) f25272c.clone();
    }
}
