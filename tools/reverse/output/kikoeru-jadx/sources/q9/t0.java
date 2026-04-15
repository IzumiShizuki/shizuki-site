package q9;

import m0.s2;
import m0.t2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j1.q f18101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t2 f18102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f18103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q1.l0 f18104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f18105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f18106f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f18107g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f18108h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f1.f f18109i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f1.f f18110j;

    public t0(j1.q qVar, t2 t2Var, boolean z10, q1.l0 l0Var, float f10, long j10, long j11, long j12, f1.f fVar, f1.f fVar2) {
        this.f18101a = qVar;
        this.f18102b = t2Var;
        this.f18103c = z10;
        this.f18104d = l0Var;
        this.f18105e = f10;
        this.f18106f = j10;
        this.f18107g = j11;
        this.f18108h = j12;
        this.f18109i = fVar;
        this.f18110j = fVar2;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        x0.o oVar = (x0.o) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            oVar.W(-1256989083);
            s2.a(f1.g.f(-701454473, new s0(this.f18109i), oVar), this.f18101a, this.f18102b, this.f18103c, this.f18104d, this.f18105e, this.f18106f, this.f18107g, this.f18108h, f1.g.f(1043778846, new m0.g0(this.f18110j, 6), oVar), oVar, 805306374);
            oVar.p(false);
        } else {
            oVar.Q();
        }
        return ub.a0.f21526a;
    }
}
