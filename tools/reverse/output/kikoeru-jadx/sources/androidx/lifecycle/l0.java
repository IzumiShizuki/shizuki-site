package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class l0 implements u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static l0 f781b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f782a;

    public /* synthetic */ l0(int i10) {
        this.f782a = i10;
    }

    @Override // androidx.lifecycle.u0
    public s0 a(Class cls) {
        switch (this.f782a) {
            case 0:
                throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
            default:
                return android.support.v4.media.session.b.C(cls);
        }
    }

    @Override // androidx.lifecycle.u0
    public final s0 b(pc.c cVar, i4.e eVar) {
        switch (this.f782a) {
            case 0:
                jc.l.e(cVar, "modelClass");
                return new p0();
            default:
                jc.l.e(cVar, "modelClass");
                return c(g8.a.D(cVar), eVar);
        }
    }

    @Override // androidx.lifecycle.u0
    public s0 c(Class cls, i4.e eVar) {
        switch (this.f782a) {
            case 0:
                a(cls);
                throw null;
            default:
                return a(cls);
        }
    }
}
