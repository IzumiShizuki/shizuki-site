package w1;

import c7.e1;
import q.t0;
import r.y1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f23159c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(e0 e0Var, int i10) {
        super(1);
        this.f23158b = i10;
        this.f23159c = e0Var;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [ic.a, jc.m] */
    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f23158b) {
            case 0:
                e0 e0Var = this.f23159c;
                e0Var.f23173d = true;
                e0Var.f23175f.b();
                return ub.a0.f21526a;
            default:
                s1.d dVar = (s1.d) obj;
                e0 e0Var2 = this.f23159c;
                c cVar = e0Var2.f23171b;
                float f10 = e0Var2.f23180k;
                float f11 = e0Var2.f23181l;
                e1 e1VarS = dVar.S();
                long jD = e1VarS.D();
                e1VarS.z().f();
                try {
                    ((y1) e1VarS.f3618b).g0(f10, f11, 0L);
                    cVar.a(dVar);
                    t0.L(e1VarS, jD);
                    return ub.a0.f21526a;
                } catch (Throwable th2) {
                    t0.L(e1VarS, jD);
                    throw th2;
                }
        }
    }
}
