package hd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b1 f8362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b1 f8363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b1 f8364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b1[] f8365d;

    static {
        b1 b1Var = new b1("INVARIANT", 0);
        f8362a = b1Var;
        b1 b1Var2 = new b1("IN", 1);
        f8363b = b1Var2;
        b1 b1Var3 = new b1("OUT", 2);
        f8364c = b1Var3;
        f8365d = new b1[]{b1Var, b1Var2, b1Var3};
    }

    public static b1 valueOf(String str) {
        return (b1) Enum.valueOf(b1.class, str);
    }

    public static b1[] values() {
        return (b1[]) f8365d.clone();
    }
}
