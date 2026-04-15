package i7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k2 implements hf.y, kf.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kf.f f9183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hf.y f9184b;

    public k2(hf.y yVar, kf.f fVar) {
        jc.l.e(yVar, "scope");
        this.f9183a = fVar;
        this.f9184b = yVar;
    }

    @Override // hf.y
    public final yb.h O() {
        return this.f9184b.O();
    }

    @Override // kf.u
    public final Object j(Object obj, yb.c cVar) {
        return this.f9183a.j(obj, cVar);
    }
}
