package cg;

import l0.l1;
import l0.u0;
import y.k1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f4064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4066f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(j1.q qVar, ic.a aVar, boolean z10, int i10) {
        super(2);
        this.f4062b = 2;
        this.f4063c = qVar;
        this.f4066f = aVar;
        this.f4064d = z10;
        this.f4065e = i10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        int i10 = this.f4062b;
        x0.o oVar = (x0.o) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                a.a.f((k1) this.f4063c, this.f4064d, (c0) this.f4066f, oVar, x0.v.D(this.f4065e | 1));
                break;
            case 1:
                a.a.j((k1) this.f4063c, this.f4064d, (b0) this.f4066f, oVar, x0.v.D(this.f4065e | 1));
                break;
            case 2:
                u0.e((j1.q) this.f4063c, (ic.a) this.f4066f, this.f4064d, oVar, x0.v.D(this.f4065e | 1));
                break;
            default:
                u0.g(this.f4064d, (e3.j) this.f4063c, (l1) this.f4066f, oVar, x0.v.D(this.f4065e | 1));
                break;
        }
        return ub.a0.f21526a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(k1 k1Var, boolean z10, jc.m mVar, int i10, int i11) {
        super(2);
        this.f4062b = i11;
        this.f4063c = k1Var;
        this.f4064d = z10;
        this.f4066f = mVar;
        this.f4065e = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(boolean z10, e3.j jVar, l1 l1Var, int i10) {
        super(2);
        this.f4062b = 3;
        this.f4064d = z10;
        this.f4063c = jVar;
        this.f4066f = l1Var;
        this.f4065e = i10;
    }
}
