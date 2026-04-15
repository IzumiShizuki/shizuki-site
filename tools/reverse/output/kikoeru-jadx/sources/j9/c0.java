package j9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c0 f10663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c0 f10664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ c0[] f10665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ bc.b f10666e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10667a;

    static {
        c0 c0Var = new c0(0, "LRC", "lrc");
        f10663b = c0Var;
        c0 c0Var2 = new c0(1, "VTT", "vtt");
        f10664c = c0Var2;
        c0[] c0VarArr = {c0Var, c0Var2, new c0(2, "SRT", "srt"), new c0(3, "ASS", "ass"), new c0(4, "SSA", "ssa")};
        f10665d = c0VarArr;
        f10666e = new bc.b(c0VarArr);
    }

    public c0(int i10, String str, String str2) {
        this.f10667a = str2;
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) f10665d.clone();
    }
}
