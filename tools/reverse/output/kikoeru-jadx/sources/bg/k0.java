package bg;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@sf.g
public abstract class k0 extends o0 {
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f2918c = ub.a.c(ub.i.f21540a, v.f2979d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ub.p f2919b = ub.a.d(new b0.d0(3, this));

    public static final void e(k0 k0Var, yf.t tVar, uf.g gVar) {
        jc.l.e(k0Var, "self");
        jc.l.e(gVar, "serialDesc");
    }

    public abstract String b();

    public abstract String c();

    public final String d() {
        return (String) this.f2919b.getValue();
    }
}
