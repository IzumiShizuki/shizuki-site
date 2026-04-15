package eg;

import a0.f0;
import ac.i;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import c2.d0;
import c2.e0;
import h0.n1;
import h0.p1;
import ic.n;
import ic.o;
import j1.q;
import j2.l1;
import jc.l;
import jc.m;
import u.v1;
import v0.a0;
import w.k;
import x0.e1;
import x0.r0;
import x0.v;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f extends m implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6593b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f6594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6596e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p1 p1Var, boolean z10, k kVar) {
        super(3);
        this.f6595d = p1Var;
        this.f6594c = z10;
        this.f6596e = kVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [ac.i, ic.n] */
    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        int i10 = this.f6593b;
        boolean z10 = this.f6594c;
        Object obj4 = this.f6596e;
        Object obj5 = this.f6595d;
        switch (i10) {
            case 0:
                q qVarE = (q) obj;
                x0.o oVar = (x0.o) obj2;
                ((Number) obj3).intValue();
                l.e(qVarE, "$this$composed");
                oVar.X(335353616);
                if (z10) {
                    c2.l lVar = e0.f3261a;
                    qVarE = qVarE.e(new SuspendPointerInputElement((String) obj5, null, null, new d0((i) obj4), 6));
                }
                oVar.p(false);
                return qVarE;
            case 1:
                x0.o oVar2 = (x0.o) obj2;
                ((Number) obj3).intValue();
                p1 p1Var = (p1) obj5;
                e1 e1Var = p1Var.f7807f;
                oVar2.W(805428266);
                boolean z11 = ((u.e1) e1Var.getValue()) == u.e1.f20882a || !(oVar2.j(l1.f9872n) == f3.m.f6668b);
                boolean zF = oVar2.f(p1Var);
                Object objK = oVar2.K();
                r0 r0Var = x0.k.f24334a;
                if (zF || objK == r0Var) {
                    objK = new f0(13, p1Var);
                    oVar2.h0(objK);
                }
                w0 w0VarY = v.y((ic.k) objK, oVar2);
                Object objK2 = oVar2.K();
                if (objK2 == r0Var) {
                    u.k kVar = new u.k(new cg.c(w0VarY, 6));
                    oVar2.h0(kVar);
                    objK2 = kVar;
                }
                v1 v1Var = (v1) objK2;
                boolean zF2 = oVar2.f(v1Var) | oVar2.f(p1Var);
                Object objK3 = oVar2.K();
                if (zF2 || objK3 == r0Var) {
                    objK3 = new n1(v1Var, p1Var);
                    oVar2.h0(objK3);
                }
                q qVarB = androidx.compose.foundation.gestures.a.b((n1) objK3, (u.e1) e1Var.getValue(), z10 && p1Var.f7803b.e() != 0.0f, z11, (k) obj4);
                oVar2.p(false);
                return qVarB;
            default:
                x0.o oVar3 = (x0.o) obj2;
                if ((((Number) obj3).intValue() & 17) == 16 && oVar3.z()) {
                    oVar3.Q();
                } else {
                    v0.e0.f22190a.a((k) obj5, null, (a0) obj4, this.f6594c, 0L, oVar3, 196608);
                }
                return ub.a0.f21526a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(n nVar, String str, boolean z10) {
        super(3);
        this.f6594c = z10;
        this.f6595d = str;
        this.f6596e = (i) nVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, a0 a0Var, boolean z10) {
        super(3);
        this.f6595d = kVar;
        this.f6596e = a0Var;
        this.f6594c = z10;
    }
}
