package i7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends ac.i implements ic.o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ v f9284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ v f9285f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d0 f9286g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(d0 d0Var, yb.c cVar) {
        super(3, cVar);
        this.f9286g = d0Var;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        r0 r0Var = new r0(this.f9286g, (yb.c) obj3);
        r0Var.f9284e = (v) obj;
        r0Var.f9285f = (v) obj2;
        return r0Var.u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        ub.a.f(obj);
        v vVar = this.f9284e;
        v vVar2 = this.f9285f;
        jc.l.e(vVar2, "<this>");
        jc.l.e(vVar, "previous");
        int i10 = vVar2.f9335a;
        int i11 = vVar.f9335a;
        return i10 > i11 ? true : i10 < i11 ? false : u.d(vVar2.f9336b, vVar.f9336b, this.f9286g) ? vVar2 : vVar;
    }
}
