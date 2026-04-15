package la;

import bg.a2;
import m0.p1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11918a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f11919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j1.q f11920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f11922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f11923f;

    public /* synthetic */ c0(a2 a2Var, j1.q qVar, boolean z10, ic.a aVar, int i10) {
        this.f11922e = a2Var;
        this.f11920c = qVar;
        this.f11919b = z10;
        this.f11923f = aVar;
        this.f11921d = i10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f11918a) {
            case 0:
                ((Integer) obj2).getClass();
                d0.f((a2) this.f11922e, this.f11920c, this.f11919b, (ic.a) this.f11923f, (x0.o) obj, x0.v.D(this.f11921d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                m0.z0.b(this.f11919b, (s2.a) this.f11922e, this.f11920c, (p1) this.f11923f, (x0.o) obj, x0.v.D(this.f11921d | 1));
                break;
        }
        return ub.a0.f21526a;
    }

    public /* synthetic */ c0(boolean z10, s2.a aVar, j1.q qVar, p1 p1Var, int i10) {
        this.f11919b = z10;
        this.f11922e = aVar;
        this.f11920c = qVar;
        this.f11923f = p1Var;
        this.f11921d = i10;
    }
}
