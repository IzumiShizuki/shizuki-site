package i2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j1 f8768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j1 f8769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ j1[] f8770c;

    static {
        j1 j1Var = new j1("Width", 0);
        f8768a = j1Var;
        j1 j1Var2 = new j1("Height", 1);
        f8769b = j1Var2;
        f8770c = new j1[]{j1Var, j1Var2};
    }

    public static j1 valueOf(String str) {
        return (j1) Enum.valueOf(j1.class, str);
    }

    public static j1[] values() {
        return (j1[]) f8770c.clone();
    }
}
