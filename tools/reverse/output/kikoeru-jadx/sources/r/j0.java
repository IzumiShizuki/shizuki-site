package r;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f18462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ j0[] f18463b;

    static {
        j0 j0Var = new j0("Default", 0);
        f18462a = j0Var;
        f18463b = new j0[]{j0Var, new j0("UserInput", 1), new j0("PreventUserInput", 2)};
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) f18463b.clone();
    }
}
