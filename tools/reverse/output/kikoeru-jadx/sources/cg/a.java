package cg;

import b0.o1;
import g2.g1;
import g2.u0;
import g2.v0;
import g2.w0;
import g2.x0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f3994a = new a();

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
    public final w0 h(x0 x0Var, List list, long j10) {
        jc.l.e(x0Var, "$this$Layout");
        jc.l.e(list, "measurables");
        g1 g1VarV = ((u0) list.get(0)).v(j10);
        g1 g1VarV2 = ((u0) list.get(1)).v(f3.b.b(g1VarV.f7180a, g1VarV.f7181b, 5));
        return x0Var.b0(g1VarV.f7180a, g1VarV.f7181b, vb.s.f22820a, new o1(3, g1VarV, g1VarV2));
    }

    @Override // g2.v0
    public final /* synthetic */ int i(g2.y yVar, List list, int i10) {
        return a0.c.c(this, yVar, list, i10);
    }
}
