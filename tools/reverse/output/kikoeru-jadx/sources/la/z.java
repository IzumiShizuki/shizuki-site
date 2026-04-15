package la;

import bg.a2;
import m0.p1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12154a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ic.a f12155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j1.q f12156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f12157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f12159f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f12160g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f12161h;

    public /* synthetic */ z(a2 a2Var, j1.q qVar, boolean z10, ic.a aVar, ic.a aVar2, int i10, int i11) {
        this.f12160g = a2Var;
        this.f12156c = qVar;
        this.f12157d = z10;
        this.f12155b = aVar;
        this.f12161h = aVar2;
        this.f12158e = i10;
        this.f12159f = i11;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f12154a) {
            case 0:
                ((Integer) obj2).getClass();
                d0.d((a2) this.f12160g, this.f12156c, this.f12157d, this.f12155b, (ic.a) this.f12161h, (x0.o) obj, x0.v.D(this.f12158e | 1), this.f12159f);
                break;
            case 1:
                ((Integer) obj2).getClass();
                m0.b0.b(this.f12155b, this.f12156c, this.f12157d, (y.d1) this.f12160g, (ic.o) this.f12161h, (x0.o) obj, x0.v.D(this.f12158e | 1), this.f12159f);
                break;
            default:
                ((Integer) obj2).getClass();
                m0.z0.c((s2.a) this.f12160g, this.f12155b, this.f12156c, this.f12157d, (p1) this.f12161h, (x0.o) obj, x0.v.D(this.f12158e | 1), this.f12159f);
                break;
        }
        return ub.a0.f21526a;
    }

    public /* synthetic */ z(ic.a aVar, j1.q qVar, boolean z10, y.d1 d1Var, ic.o oVar, int i10, int i11) {
        this.f12155b = aVar;
        this.f12156c = qVar;
        this.f12157d = z10;
        this.f12160g = d1Var;
        this.f12161h = oVar;
        this.f12158e = i10;
        this.f12159f = i11;
    }

    public /* synthetic */ z(s2.a aVar, ic.a aVar2, j1.q qVar, boolean z10, p1 p1Var, int i10, int i11) {
        this.f12160g = aVar;
        this.f12155b = aVar2;
        this.f12156c = qVar;
        this.f12157d = z10;
        this.f12161h = p1Var;
        this.f12158e = i10;
        this.f12159f = i11;
    }
}
