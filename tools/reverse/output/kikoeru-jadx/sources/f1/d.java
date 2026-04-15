package f1;

import bg.a2;
import j1.q;
import java.util.List;
import la.d0;
import m0.u4;
import ub.a0;
import x0.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6615a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f6616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6619e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6620f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f6621g;

    public /* synthetic */ d(a2 a2Var, q qVar, List list, ic.n nVar, f fVar, int i10) {
        this.f6618d = a2Var;
        this.f6619e = qVar;
        this.f6620f = list;
        this.f6621g = nVar;
        this.f6616b = fVar;
        this.f6617c = i10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f6615a) {
            case 0:
                ((Integer) obj2).intValue();
                this.f6616b.j(this.f6618d, this.f6619e, this.f6620f, this.f6621g, (x0.o) obj, v.D(this.f6617c) | 1);
                break;
            case 1:
                ((Integer) obj2).getClass();
                d0.c((a2) this.f6618d, (q) this.f6619e, (List) this.f6620f, (ic.n) this.f6621g, this.f6616b, (x0.o) obj, v.D(this.f6617c | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((u4) this.f6618d).a((q) this.f6619e, (ic.n) this.f6620f, this.f6616b, (ic.n) this.f6621g, (x0.o) obj, v.D(this.f6617c | 1));
                break;
        }
        return a0.f21526a;
    }

    public /* synthetic */ d(f fVar, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f6616b = fVar;
        this.f6618d = obj;
        this.f6619e = obj2;
        this.f6620f = obj3;
        this.f6621g = obj4;
        this.f6617c = i10;
    }

    public /* synthetic */ d(u4 u4Var, q qVar, ic.n nVar, f fVar, ic.n nVar2, int i10) {
        this.f6618d = u4Var;
        this.f6619e = qVar;
        this.f6620f = nVar;
        this.f6616b = fVar;
        this.f6621g = nVar2;
        this.f6617c = i10;
    }
}
