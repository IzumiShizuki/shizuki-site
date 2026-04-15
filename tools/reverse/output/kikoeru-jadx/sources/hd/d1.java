package hd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d1 f8372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d1 f8373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d1 f8374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ d1[] f8375d;

    static {
        d1 d1Var = new d1("WARNING", 0);
        f8372a = d1Var;
        d1 d1Var2 = new d1("ERROR", 1);
        f8373b = d1Var2;
        d1 d1Var3 = new d1("HIDDEN", 2);
        f8374c = d1Var3;
        f8375d = new d1[]{d1Var, d1Var2, d1Var3};
    }

    public static d1 valueOf(String str) {
        return (d1) Enum.valueOf(d1.class, str);
    }

    public static d1[] values() {
        return (d1[]) f8375d.clone();
    }
}
