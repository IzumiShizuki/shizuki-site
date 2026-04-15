package wf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g implements sf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f24118a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f1 f24119b = new f1("kotlin.Boolean", uf.e.f21682b);

    @Override // sf.a
    public final uf.g a() {
        return f24119b;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        return Boolean.valueOf(bVar.e());
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        tVar.b(((Boolean) obj).booleanValue());
    }
}
