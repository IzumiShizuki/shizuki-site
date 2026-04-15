package b0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r1 extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.f f1344c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(f1.f fVar) {
        super(2);
        this.f1343b = 4;
        this.f1344c = fVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f1343b) {
            case 0:
                ((Number) obj2).intValue();
                g0.c(this.f1344c, (x0.o) obj, x0.v.D(7));
                break;
            case 1:
                ((Number) obj2).intValue();
                a.a.o(this.f1344c, (x0.o) obj, x0.v.D(7));
                break;
            case 2:
                ((Number) obj2).intValue();
                g2.n1.a(this.f1344c, (x0.o) obj, x0.v.D(7));
                break;
            case 3:
                ((Number) obj2).intValue();
                q.t1.b(this.f1344c, (x0.o) obj, x0.v.D(7));
                break;
            default:
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    this.f1344c.g(y.p0.f25210a, oVar, 6);
                } else {
                    oVar.Q();
                }
                break;
        }
        return ub.a0.f21526a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1(f1.f fVar, int i10, int i11) {
        super(2);
        this.f1343b = i11;
        this.f1344c = fVar;
    }
}
