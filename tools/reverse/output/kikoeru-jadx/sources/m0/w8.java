package m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w8 f13842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w8 f13843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ w8[] f13844c;

    static {
        w8 w8Var = new w8("Filled", 0);
        f13842a = w8Var;
        w8 w8Var2 = new w8("Outlined", 1);
        f13843b = w8Var2;
        f13844c = new w8[]{w8Var, w8Var2};
    }

    public static w8 valueOf(String str) {
        return (w8) Enum.valueOf(w8.class, str);
    }

    public static w8[] values() {
        return (w8[]) f13844c.clone();
    }
}
