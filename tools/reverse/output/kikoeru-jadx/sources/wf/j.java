package wf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j implements sf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f24134a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f1 f24135b = new f1("kotlin.Byte", uf.e.f21683c);

    @Override // sf.a
    public final uf.g a() {
        return f24135b;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        return Byte.valueOf(bVar.z());
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        tVar.d(((Number) obj).byteValue());
    }
}
