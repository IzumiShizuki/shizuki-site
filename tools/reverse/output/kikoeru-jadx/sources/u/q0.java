package u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends ac.h implements ic.n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f21046d;

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        q0 q0Var = new q0(2, cVar);
        q0Var.f21046d = obj;
        return q0Var;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        return ((q0) o((c2.i0) obj, (yb.c) obj2)).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        int i10 = this.f21045c;
        if (i10 == 0) {
            ub.a.f(obj);
            c2.i0 i0Var = (c2.i0) this.f21046d;
            this.f21045c = 1;
            Object objD = w1.d(i0Var, c2.m.f3316c, this);
            zb.a aVar = zb.a.f26667a;
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ub.a.f(obj);
        }
        return ub.a0.f21526a;
    }
}
