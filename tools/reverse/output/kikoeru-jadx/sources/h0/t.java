package h0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t implements g2.v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f7838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ic.k f7839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y2.y f7840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y2.r f7841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f3.c f7842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f7843f;

    public t(u0 u0Var, ic.k kVar, y2.y yVar, y2.r rVar, f3.c cVar, int i10) {
        this.f7838a = u0Var;
        this.f7839b = kVar;
        this.f7840c = yVar;
        this.f7841d = rVar;
        this.f7842e = cVar;
        this.f7843f = i10;
    }

    @Override // g2.v0
    public final int c(g2.y yVar, List list, int i10) {
        u0 u0Var = this.f7838a;
        u0Var.f7857a.a(yVar.getLayoutDirection());
        ch.l lVar = u0Var.f7857a.f7598j;
        if (lVar != null) {
            return q0.m(lVar.j());
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    @Override // g2.v0
    public final /* synthetic */ int f(g2.y yVar, List list, int i10) {
        return a0.c.m(this, yVar, list, i10);
    }

    @Override // g2.v0
    public final /* synthetic */ int g(g2.y yVar, List list, int i10) {
        return a0.c.j(this, yVar, list, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f5  */
    @Override // g2.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final g2.w0 h(g2.x0 r30, java.util.List r31, long r32) {
        /*
            Method dump skipped, instruction units count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.t.h(g2.x0, java.util.List, long):g2.w0");
    }

    @Override // g2.v0
    public final /* synthetic */ int i(g2.y yVar, List list, int i10) {
        return a0.c.c(this, yVar, list, i10);
    }
}
