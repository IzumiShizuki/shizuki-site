package la;

import m0.d3;
import m0.f4;
import s.o1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t0 implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12102a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f12103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ic.a f12104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j1.q f12105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f12107f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f12108g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f12109h;

    public /* synthetic */ t0(ic.a aVar, j1.q qVar, boolean z10, y.d1 d1Var, w.k kVar, ic.o oVar, int i10) {
        this.f12104c = aVar;
        this.f12105d = qVar;
        this.f12103b = z10;
        this.f12107f = d1Var;
        this.f12108g = kVar;
        this.f12109h = oVar;
        this.f12106e = i10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f12102a) {
            case 0:
                ((Integer) obj2).getClass();
                int iD = x0.v.D(1);
                l.l(this.f12104c, this.f12105d, this.f12103b, (y.d1) this.f12107f, (w1.f) this.f12108g, (String) this.f12109h, (x0.o) obj, iD, this.f12106e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((d3) this.f12107f).a(this.f12103b, this.f12104c, this.f12105d, (o1) this.f12108g, (f1.f) this.f12109h, (x0.o) obj, x0.v.D(this.f12106e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                f4.b(this.f12104c, this.f12105d, this.f12103b, (y.d1) this.f12107f, (w.k) this.f12108g, (ic.o) this.f12109h, (x0.o) obj, x0.v.D(this.f12106e | 1));
                break;
        }
        return ub.a0.f21526a;
    }

    public /* synthetic */ t0(ic.a aVar, j1.q qVar, boolean z10, y.d1 d1Var, w1.f fVar, String str, int i10, int i11) {
        this.f12104c = aVar;
        this.f12105d = qVar;
        this.f12103b = z10;
        this.f12107f = d1Var;
        this.f12108g = fVar;
        this.f12109h = str;
        this.f12106e = i11;
    }

    public /* synthetic */ t0(d3 d3Var, boolean z10, ic.a aVar, j1.q qVar, o1 o1Var, f1.f fVar, int i10) {
        this.f12107f = d3Var;
        this.f12103b = z10;
        this.f12104c = aVar;
        this.f12105d = qVar;
        this.f12108g = o1Var;
        this.f12109h = fVar;
        this.f12106e = i10;
    }
}
