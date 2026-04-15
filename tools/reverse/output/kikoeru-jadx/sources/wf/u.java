package wf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u implements sf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f24186a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f1 f24187b = new f1("kotlin.Double", uf.e.f21685e);

    @Override // sf.a
    public final uf.g a() {
        return f24187b;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        return Double.valueOf(bVar.D());
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        tVar.f(((Number) obj).doubleValue());
    }
}
