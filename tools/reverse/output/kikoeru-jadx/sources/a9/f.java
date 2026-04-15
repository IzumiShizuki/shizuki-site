package a9;

import b0.d0;
import g2.c0;
import i2.g1;
import q.l1;
import q.m1;
import q.r1;
import q.s1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f implements m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m1 f226a;

    public f(m1 m1Var) {
        jc.l.e(m1Var, "origin");
        this.f226a = m1Var;
    }

    @Override // q.m1
    public final j1.q b(j1.q qVar, d0 d0Var, q.e eVar) {
        jc.l.e(qVar, "<this>");
        jc.l.e(eVar, "clipInOverlayDuringTransition");
        return qVar;
    }

    @Override // q.m1
    public final j1.q c(l1 l1Var, q.u uVar, r1 r1Var, s1 s1Var) {
        jc.l.e(l1Var, "sharedContentState");
        jc.l.e(uVar, "animatedVisibilityScope");
        jc.l.e(r1Var, "boundsTransform");
        jc.l.e(s1Var, "clipInOverlayDuringTransition");
        return j1.n.f9689a;
    }

    @Override // q.m1
    public final l1 d(int i10, Object obj, x0.o oVar) {
        jc.l.e(obj, "key");
        oVar.W(-1148525656);
        l1 l1VarD = this.f226a.d(i10 & 14, obj, oVar);
        oVar.p(false);
        return l1VarD;
    }

    @Override // g2.s0
    public final c0 f(g1 g1Var) {
        return this.f226a.f(g1Var);
    }

    @Override // q.m1
    public final boolean g() {
        return false;
    }
}
