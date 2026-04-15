package wf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m1 implements sf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m1 f24146a = new m1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f1 f24147b = new f1("kotlin.Short", uf.e.f21689i);

    @Override // sf.a
    public final uf.g a() {
        return f24147b;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        return Short.valueOf(bVar.A());
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        tVar.t(((Number) obj).shortValue());
    }
}
