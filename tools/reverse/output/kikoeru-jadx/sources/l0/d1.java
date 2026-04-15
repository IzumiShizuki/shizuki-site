package l0;

import q.t1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j1.q f11449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.f f11450d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(j1.q qVar, f1.f fVar, int i10, int i11) {
        super(2);
        this.f11448b = i11;
        this.f11449c = qVar;
        this.f11450d = fVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        int i10 = this.f11448b;
        x0.o oVar = (x0.o) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                u0.f(this.f11449c, this.f11450d, oVar, x0.v.D(49));
                break;
            default:
                t1.a(this.f11449c, this.f11450d, oVar, x0.v.D(49));
                break;
        }
        return ub.a0.f21526a;
    }
}
