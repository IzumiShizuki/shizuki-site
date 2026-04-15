package h0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f7646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h0 f7647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h0 f7648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ h0[] f7649d;

    static {
        h0 h0Var = new h0("Cursor", 0);
        f7646a = h0Var;
        h0 h0Var2 = new h0("SelectionStart", 1);
        f7647b = h0Var2;
        h0 h0Var3 = new h0("SelectionEnd", 2);
        f7648c = h0Var3;
        f7649d = new h0[]{h0Var, h0Var2, h0Var3};
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) f7649d.clone();
    }
}
