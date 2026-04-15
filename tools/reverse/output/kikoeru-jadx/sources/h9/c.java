package h9;

import ac.i;
import ag.z;
import bg.a2;
import da.i0;
import hf.l0;
import hf.y;
import i7.j2;
import i9.o;
import ic.n;
import jc.l;
import lf.g;
import ub.a0;
import ub.m;
import x0.v;
import yb.h;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends i implements n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8239f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f8240g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10, yb.c cVar, int i11) {
        super(i10, cVar);
        this.f8238e = i11;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f8238e) {
            case 0:
                return new c(2, cVar, 0);
            case 1:
                c cVar2 = new c(2, cVar, 1);
                cVar2.f8240g = obj;
                return cVar2;
            default:
                c cVar3 = new c(2, cVar, 2);
                cVar3.f8240g = obj;
                return cVar3;
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f8238e) {
            case 0:
                return ((c) o((y) obj, (yb.c) obj2)).u(a0.f21526a);
            case 1:
                return ((c) o((g) obj, (yb.c) obj2)).u(a0.f21526a);
            default:
                return ((c) o((y) obj, (yb.c) obj2)).u(a0.f21526a);
        }
    }

    @Override // ac.a
    public final Object u(Object obj) {
        Object objI;
        g gVar;
        j2 j2Var;
        y yVar;
        int i10 = this.f8238e;
        yb.c cVar = null;
        a0 a0Var = a0.f21526a;
        zb.a aVar = zb.a.f26667a;
        char c3 = 1;
        switch (i10) {
            case 0:
                int i11 = this.f8239f;
                if (i11 == 0) {
                    ub.a.f(obj);
                    a9.i.d().setValue(Boolean.TRUE);
                    a2 a2Var = (a2) d.f8241a.getValue();
                    if (a2Var == null) {
                        return null;
                    }
                    long j10 = a2Var.f2823f;
                    String str = z.f369a;
                    objI = z.i(j10, a9.i.f(), true);
                    if (!(objI instanceof m)) {
                        pf.e eVar = l0.f8566a;
                        jf.d dVar = nf.n.f15850a;
                        i0 i0Var = new i0((a2) objI, cVar, c3 == true ? 1 : 0);
                        this.f8240g = objI;
                        this.f8239f = 1;
                        if (hf.a0.H(dVar, i0Var, this) == aVar) {
                            return aVar;
                        }
                    }
                    return new ub.n(objI);
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objI = this.f8240g;
                ub.a.f(obj);
                o.f9489a.getClass();
                o.d();
                return new ub.n(objI);
            case 1:
                int i12 = this.f8239f;
                if (i12 == 0) {
                    ub.a.f(obj);
                    gVar = (g) this.f8240g;
                    j2Var = null;
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ub.a.f(obj);
                        return a0Var;
                    }
                    gVar = (g) this.f8240g;
                    ub.a.f(obj);
                    j2Var = (j2) obj;
                }
                Boolean boolValueOf = Boolean.valueOf(j2Var == j2.f9179a);
                this.f8240g = null;
                this.f8239f = 2;
                return gVar.n(boolValueOf, this) == aVar ? aVar : a0Var;
            default:
                int i13 = this.f8239f;
                if (i13 == 0) {
                    ub.a.f(obj);
                    yVar = (y) this.f8240g;
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yVar = (y) this.f8240g;
                    ub.a.f(obj);
                }
                while (hf.a0.w(yVar.O())) {
                    u.d dVar2 = u.d.f20859f;
                    this.f8240g = yVar;
                    this.f8239f = 1;
                    h hVar = this.f302b;
                    l.b(hVar);
                    if (v.s(hVar).k(dVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return a0Var;
        }
    }
}
