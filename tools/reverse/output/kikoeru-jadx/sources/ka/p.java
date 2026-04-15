package ka;

import m0.r0;
import ub.a0;
import x0.v;
import y.r1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11295a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j1.q f11296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f11297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f11298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f11299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f1.f f11300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f11301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f11302h;

    public /* synthetic */ p(f1.f fVar, f1.f fVar2, long j10, long j11, float f10, j1.q qVar, int i10, int i11) {
        this.f11300f = fVar;
        this.f11302h = fVar2;
        this.f11297c = j10;
        this.f11298d = j11;
        this.f11299e = f10;
        this.f11296b = qVar;
        this.f11301g = i11;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f11295a) {
            case 0:
                ((Integer) obj2).getClass();
                int iD = v.D(391);
                b.i(this.f11300f, (f1.f) this.f11302h, this.f11297c, this.f11298d, this.f11299e, this.f11296b, (x0.o) obj, iD, this.f11301g);
                break;
            default:
                ((Integer) obj2).getClass();
                r0.b((r1) this.f11302h, this.f11296b, this.f11297c, this.f11298d, this.f11299e, this.f11300f, (x0.o) obj, v.D(this.f11301g | 1));
                break;
        }
        return a0.f21526a;
    }

    public /* synthetic */ p(r1 r1Var, j1.q qVar, long j10, long j11, float f10, f1.f fVar, int i10) {
        this.f11302h = r1Var;
        this.f11296b = qVar;
        this.f11297c = j10;
        this.f11298d = j11;
        this.f11299e = f10;
        this.f11300f = fVar;
        this.f11301g = i10;
    }
}
