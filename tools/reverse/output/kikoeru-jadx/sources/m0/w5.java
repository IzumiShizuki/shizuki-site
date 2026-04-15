package m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w5 f13819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w5 f13820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w5 f13821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w5 f13822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final w5 f13823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ w5[] f13824f;

    static {
        w5 w5Var = new w5("TopBar", 0);
        f13819a = w5Var;
        w5 w5Var2 = new w5("MainContent", 1);
        f13820b = w5Var2;
        w5 w5Var3 = new w5("Snackbar", 2);
        f13821c = w5Var3;
        w5 w5Var4 = new w5("Fab", 3);
        f13822d = w5Var4;
        w5 w5Var5 = new w5("BottomBar", 4);
        f13823e = w5Var5;
        f13824f = new w5[]{w5Var, w5Var2, w5Var3, w5Var4, w5Var5};
    }

    public static w5 valueOf(String str) {
        return (w5) Enum.valueOf(w5.class, str);
    }

    public static w5[] values() {
        return (w5[]) f13824f.clone();
    }
}
