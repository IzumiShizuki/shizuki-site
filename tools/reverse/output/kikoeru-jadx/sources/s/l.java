package s;

import r.y1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1.c f19204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jc.y f19205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f19206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q1.k f19207e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p1.c cVar, jc.y yVar, long j10, q1.k kVar) {
        super(1);
        this.f19204b = cVar;
        this.f19205c = yVar;
        this.f19206d = j10;
        this.f19207e = kVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        i2.l0 l0Var = (i2.l0) obj;
        l0Var.b();
        p1.c cVar = this.f19204b;
        float f10 = cVar.f16483a;
        float f11 = cVar.f16484b;
        jc.y yVar = this.f19205c;
        long j10 = this.f19206d;
        q1.k kVar = this.f19207e;
        s1.b bVar = l0Var.f8782a;
        ((y1) bVar.f19346b.f3618b).i0(f10, f11);
        try {
            q.t0.k(l0Var, (q1.f) yVar.f10838a, j10, 0L, 0.0f, kVar, 0, 890);
            ((y1) bVar.f19346b.f3618b).i0(-f10, -f11);
            return ub.a0.f21526a;
        } catch (Throwable th2) {
            ((y1) bVar.f19346b.f3618b).i0(-f10, -f11);
            throw th2;
        }
    }
}
