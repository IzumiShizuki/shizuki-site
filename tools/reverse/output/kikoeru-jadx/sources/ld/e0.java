package ld;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e0 f12204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e0 f12205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e0 f12206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d0 f12207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ e0[] f12208f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f12209a;

    static {
        e0 e0Var = new e0(0, null, "NULL");
        f12204b = e0Var;
        e0 e0Var2 = new e0(1, -1, "INDEX");
        f12205c = e0Var2;
        e0 e0Var3 = new e0(2, Boolean.FALSE, "FALSE");
        f12206d = e0Var3;
        d0 d0Var = new d0(3, null, "MAP_GET_OR_DEFAULT");
        f12207e = d0Var;
        f12208f = new e0[]{e0Var, e0Var2, e0Var3, d0Var};
    }

    public e0(int i10, Object obj, String str) {
        this.f12209a = obj;
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) f12208f.clone();
    }
}
