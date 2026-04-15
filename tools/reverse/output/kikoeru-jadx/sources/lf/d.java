package lf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f12379a;

    public d(f fVar) {
        this.f12379a = fVar;
    }

    @Override // lf.f
    public final Object b(g gVar, yb.c cVar) {
        jc.y yVar = new jc.y();
        yVar.f10838a = mf.c.f15133b;
        Object objB = this.f12379a.b(new i7.s0(this, yVar, gVar), cVar);
        return objB == zb.a.f26667a ? objB : ub.a0.f21526a;
    }
}
