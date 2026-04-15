package cg;

import y.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f4022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j1.q f4023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4024e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(v vVar, j1.q qVar, int i10, int i11) {
        super(2);
        this.f4021b = i11;
        this.f4022c = vVar;
        this.f4023d = qVar;
        this.f4024e = i10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        int i10 = this.f4021b;
        x0.o oVar = (x0.o) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                a2.c.n(this.f4022c, this.f4023d, oVar, x0.v.D(this.f4024e | 1));
                break;
            case 1:
                a2.c.o(this.f4022c, this.f4023d, oVar, x0.v.D(this.f4024e | 1));
                break;
            default:
                gh.g.f(this.f4022c, this.f4023d, oVar, x0.v.D(this.f4024e | 1));
                break;
        }
        return ub.a0.f21526a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(v vVar, j1.q qVar, e1 e1Var, int i10) {
        super(2);
        this.f4021b = 0;
        this.f4022c = vVar;
        this.f4023d = qVar;
        this.f4024e = i10;
    }
}
