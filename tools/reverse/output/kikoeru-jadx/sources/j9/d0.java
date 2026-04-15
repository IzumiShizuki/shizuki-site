package j9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f10674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d0 f10675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d0 f10676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d0 f10677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d0 f10678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ d0[] f10679f;

    static {
        d0 d0Var = new d0("DATABASE", 0);
        f10674a = d0Var;
        d0 d0Var2 = new d0("NETWORK", 1);
        f10675b = d0Var2;
        d0 d0Var3 = new d0("NETWORK_NO_LRC", 2);
        f10676c = d0Var3;
        d0 d0Var4 = new d0("DOWNLOAD", 3);
        f10677d = d0Var4;
        d0 d0Var5 = new d0("DOCUMENT", 4);
        f10678e = d0Var5;
        f10679f = new d0[]{d0Var, d0Var2, d0Var3, d0Var4, d0Var5};
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) f10679f.clone();
    }
}
