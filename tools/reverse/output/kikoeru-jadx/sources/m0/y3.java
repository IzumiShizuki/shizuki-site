package m0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y3 implements g2.v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f13947a;

    public y3(float f10) {
        this.f13947a = f10;
    }

    @Override // g2.v0
    public final /* synthetic */ int c(g2.y yVar, List list, int i10) {
        return a0.c.f(this, yVar, list, i10);
    }

    @Override // g2.v0
    public final /* synthetic */ int f(g2.y yVar, List list, int i10) {
        return a0.c.m(this, yVar, list, i10);
    }

    @Override // g2.v0
    public final /* synthetic */ int g(g2.y yVar, List list, int i10) {
        return a0.c.j(this, yVar, list, i10);
    }

    @Override // g2.v0
    public final g2.w0 h(g2.x0 x0Var, List list, long j10) {
        int iMax;
        int iRound;
        g2.g1 g1VarV = ((g2.u0) list.get(0)).v(f3.a.a(j10, 0, 0, 0, 0, 11));
        int iR = g1VarV.R(g2.c.f7162a);
        if (iR != Integer.MIN_VALUE) {
            iRound = x0Var.a0(this.f13947a) - iR;
            iMax = Math.max(f3.a.i(j10), g1VarV.f7181b + iRound);
        } else {
            iMax = Math.max(f3.a.i(j10), g1VarV.f7181b);
            long j11 = (((long) 0) << 32) | (((long) (iMax - g1VarV.f7181b)) & 4294967295L);
            float f10 = 1;
            iRound = (int) (((((long) Math.round(((x0Var.getLayoutDirection() == f3.m.f6667a ? 0.0f : (-1) * 0.0f) + f10) * ((((int) (j11 >> 32)) - ((int) 0)) / 2.0f))) << 32) | (((long) Math.round((f10 + 0.0f) * ((((int) (j11 & 4294967295L)) - ((int) 0)) / 2.0f))) & 4294967295L)) & 4294967295L);
        }
        return x0Var.b0(g1VarV.f7180a, iMax, vb.s.f22820a, new o0(iRound, 1, g1VarV));
    }

    @Override // g2.v0
    public final /* synthetic */ int i(g2.y yVar, List list, int i10) {
        return a0.c.c(this, yVar, list, i10);
    }
}
