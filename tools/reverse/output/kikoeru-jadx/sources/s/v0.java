package s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v0 f19292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v0 f19293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ v0[] f19294c;

    static {
        v0 v0Var = new v0("Default", 0);
        f19292a = v0Var;
        v0 v0Var2 = new v0("UserInput", 1);
        f19293b = v0Var2;
        f19294c = new v0[]{v0Var, v0Var2, new v0("PreventUserInput", 2)};
    }

    public static v0 valueOf(String str) {
        return (v0) Enum.valueOf(v0.class, str);
    }

    public static v0[] values() {
        return (v0[]) f19294c.clone();
    }
}
