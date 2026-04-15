package yf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f26335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w f26336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final w f26337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final w f26338f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ w[] f26339g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ bc.b f26340h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f26341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f26342b;

    static {
        w wVar = new w("OBJ", 0, '{', '}');
        f26335c = wVar;
        w wVar2 = new w("LIST", 1, '[', ']');
        f26336d = wVar2;
        w wVar3 = new w("MAP", 2, '{', '}');
        f26337e = wVar3;
        w wVar4 = new w("POLY_OBJ", 3, '[', ']');
        f26338f = wVar4;
        w[] wVarArr = {wVar, wVar2, wVar3, wVar4};
        f26339g = wVarArr;
        f26340h = new bc.b(wVarArr);
    }

    public w(String str, int i10, char c3, char c10) {
        this.f26341a = c3;
        this.f26342b = c10;
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f26339g.clone();
    }
}
