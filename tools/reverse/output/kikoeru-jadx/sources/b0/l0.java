package b0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1291e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(int i10, n0 n0Var, Object obj) {
        super(2);
        this.f1288b = 0;
        this.f1290d = n0Var;
        this.f1289c = i10;
        this.f1291e = obj;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f1288b) {
            case 0:
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ((n0) this.f1290d).e(this.f1289c, this.f1291e, oVar);
                } else {
                    oVar.Q();
                }
                break;
            case 1:
                ((Number) obj2).intValue();
                pc.f0.a((w1.f) this.f1290d, (String) this.f1291e, this.f1289c, (x0.o) obj, x0.v.D(1));
                break;
            case 2:
                ((Number) obj2).intValue();
                a.a.a((y.k1) this.f1290d, (cg.f0) this.f1291e, (x0.o) obj, x0.v.D(this.f1289c | 1));
                break;
            case 3:
                ((Number) obj2).intValue();
                gh.g.d((cg.o0) this.f1290d, (String) this.f1291e, (x0.o) obj, x0.v.D(this.f1289c | 1));
                break;
            case 4:
                ((Number) obj2).intValue();
                h0.q0.d((l0.l1) this.f1290d, (f1.f) this.f1291e, (x0.o) obj, x0.v.D(this.f1289c | 1));
                break;
            case 5:
                ((Number) obj2).intValue();
                android.support.v4.media.session.b.p((j1.q) this.f1290d, (ic.n) this.f1291e, (x0.o) obj, x0.v.D(this.f1289c | 1));
                break;
            case 6:
                ((Number) obj2).intValue();
                l0.u0.b((j1.q) this.f1290d, (f1.f) this.f1291e, (x0.o) obj, x0.v.D(49), this.f1289c);
                break;
            case 7:
                ((Number) obj2).intValue();
                ((r.q1) this.f1290d).a(x0.v.D(this.f1289c | 1), this.f1291e, (x0.o) obj);
                break;
            default:
                ((Number) obj2).intValue();
                ua.l.G((j1.q) this.f1290d, (ta.c) this.f1291e, (x0.o) obj, this.f1289c | 1);
                break;
        }
        return ub.a0.f21526a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(j1.q qVar, f1.f fVar, int i10, int i11) {
        super(2);
        this.f1288b = 6;
        this.f1290d = qVar;
        this.f1291e = fVar;
        this.f1289c = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(Object obj, Object obj2, int i10, int i11) {
        super(2);
        this.f1288b = i11;
        this.f1290d = obj;
        this.f1291e = obj2;
        this.f1289c = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(w1.f fVar, String str, int i10, int i11) {
        super(2);
        this.f1288b = 1;
        this.f1290d = fVar;
        this.f1291e = str;
        this.f1289c = i10;
    }
}
