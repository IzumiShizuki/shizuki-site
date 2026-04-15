package m0;

import androidx.compose.material.MinimumInteractiveModifier;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e7 implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j1.q f12931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1.l0 f12932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f12933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f12934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s.o f12935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f12936f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w.k f12937g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f12938h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ic.a f12939i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f1.f f12940j;

    public e7(j1.q qVar, q1.l0 l0Var, long j10, float f10, s.o oVar, float f11, w.k kVar, boolean z10, ic.a aVar, f1.f fVar) {
        this.f12931a = qVar;
        this.f12932b = l0Var;
        this.f12933c = j10;
        this.f12934d = f10;
        this.f12935e = oVar;
        this.f12936f = f11;
        this.f12937g = kVar;
        this.f12938h = z10;
        this.f12939i = aVar;
        this.f12940j = fVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        x0.o oVar = (x0.o) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            x0.o2 o2Var = t3.f13651a;
            j1.q qVarC = androidx.compose.foundation.a.c(android.support.v4.media.session.b.q(this.f12931a.e(MinimumInteractiveModifier.f666a), this.f12932b, android.support.v4.media.session.b.r(this.f12933c, (r1) oVar.j(x2.f13883a), this.f12934d, oVar), this.f12935e, this.f12936f), this.f12937g, l5.a(0.0f, 7, 0L, false), this.f12938h, null, this.f12939i, 24);
            g2.v0 v0VarD = y.p.d(j1.c.f9662a, true);
            int iQ = x0.v.q(oVar);
            x0.j1 j1VarL = oVar.l();
            j1.q qVarC2 = j1.a.c(qVarC, oVar);
            i2.k.f8771g0.getClass();
            i2.i iVar = i2.j.f8733b;
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            x0.v.A(i2.j.f8738g, v0VarD, oVar);
            x0.v.A(i2.j.f8737f, j1VarL, oVar);
            i2.h hVar = i2.j.f8741j;
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                j2.h0.s(iQ, oVar, iQ, hVar);
            }
            x0.v.A(i2.j.f8735d, qVarC2, oVar);
            this.f12940j.q(oVar, 0);
            oVar.p(true);
        } else {
            oVar.Q();
        }
        return ub.a0.f21526a;
    }
}
