package se;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s0 f19984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s0 f19985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ s0[] f19986c;

    static {
        s0 s0Var = new s0("SUPERTYPE", 0);
        f19984a = s0Var;
        s0 s0Var2 = new s0("COMMON", 1);
        f19985b = s0Var2;
        f19986c = new s0[]{s0Var, s0Var2};
    }

    public static s0 valueOf(String str) {
        return (s0) Enum.valueOf(s0.class, str);
    }

    public static s0[] values() {
        return (s0[]) f19986c.clone();
    }
}
