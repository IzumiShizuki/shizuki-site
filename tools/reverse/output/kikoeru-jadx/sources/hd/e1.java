package hd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e1 f8378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e1 f8379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e1 f8380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e1 f8381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ e1[] f8382e;

    static {
        e1 e1Var = new e1("LANGUAGE_VERSION", 0);
        f8378a = e1Var;
        e1 e1Var2 = new e1("COMPILER_VERSION", 1);
        f8379b = e1Var2;
        e1 e1Var3 = new e1("API_VERSION", 2);
        f8380c = e1Var3;
        e1 e1Var4 = new e1("UNKNOWN", 3);
        f8381d = e1Var4;
        f8382e = new e1[]{e1Var, e1Var2, e1Var3, e1Var4};
    }

    public static e1 valueOf(String str) {
        return (e1) Enum.valueOf(e1.class, str);
    }

    public static e1[] values() {
        return (e1[]) f8382e.clone();
    }
}
