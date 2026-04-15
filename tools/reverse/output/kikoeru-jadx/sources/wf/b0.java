package wf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements sf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f24083a = new b0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f1 f24084b = new f1("kotlin.Float", uf.e.f21686f);

    @Override // sf.a
    public final uf.g a() {
        return f24084b;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        return Float.valueOf(bVar.B());
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        tVar.h(((Number) obj).floatValue());
    }
}
