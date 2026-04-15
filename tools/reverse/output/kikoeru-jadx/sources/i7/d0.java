package i7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f9071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d0 f9072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d0 f9073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ d0[] f9074d;

    static {
        d0 d0Var = new d0("REFRESH", 0);
        f9071a = d0Var;
        d0 d0Var2 = new d0("PREPEND", 1);
        f9072b = d0Var2;
        d0 d0Var3 = new d0("APPEND", 2);
        f9073c = d0Var3;
        f9074d = new d0[]{d0Var, d0Var2, d0Var3};
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) f9074d.clone();
    }
}
