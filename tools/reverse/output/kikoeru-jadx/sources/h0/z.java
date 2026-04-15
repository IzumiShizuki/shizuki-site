package h0;

import j2.a2;
import j2.d3;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f7970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f7971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d3 f7972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l0.l1 f7973e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y2.y f7974f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y2.r f7975g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(u0 u0Var, boolean z10, d3 d3Var, l0.l1 l1Var, y2.y yVar, y2.r rVar) {
        super(1);
        this.f7970b = u0Var;
        this.f7971c = z10;
        this.f7972d = d3Var;
        this.f7973e = l1Var;
        this.f7974f = yVar;
        this.f7975g = rVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        y2.c0 c0Var;
        g2.c0 c0Var2;
        g2.c0 c0Var3;
        g2.c0 c0Var4 = (g2.c0) obj;
        u0 u0Var = this.f7970b;
        x0.e1 e1Var = u0Var.f7871o;
        u0Var.f7864h = c0Var4;
        r1 r1VarD = u0Var.d();
        if (r1VarD != null) {
            r1VarD.f7828b = c0Var4;
        }
        if (this.f7971c) {
            i0 i0VarA = u0Var.a();
            i0 i0Var = i0.f7680b;
            y2.y yVar = this.f7974f;
            l0.l1 l1Var = this.f7973e;
            if (i0VarA == i0Var) {
                if (((Boolean) u0Var.f7868l.getValue()).booleanValue() && ((Boolean) ((a2) this.f7972d).f9721a.getValue()).booleanValue()) {
                    l1Var.p();
                } else {
                    l1Var.l();
                }
                u0Var.f7869m.setValue(Boolean.valueOf(l0.u0.w(l1Var, true)));
                u0Var.f7870n.setValue(Boolean.valueOf(l0.u0.w(l1Var, false)));
                e1Var.setValue(Boolean.valueOf(t2.k0.b(yVar.f25435b)));
            } else if (u0Var.a() == i0.f7681c) {
                e1Var.setValue(Boolean.valueOf(l0.u0.w(l1Var, true)));
            }
            q0.u(u0Var, yVar, this.f7975g);
            r1 r1VarD2 = u0Var.d();
            if (r1VarD2 != null && (c0Var = u0Var.f7861e) != null && u0Var.b() && (c0Var2 = r1VarD2.f7828b) != null && c0Var2.h() && (c0Var3 = r1VarD2.f7829c) != null) {
                t2.i0 i0Var2 = r1VarD2.f7827a;
                a0.f0 f0Var = new a0.f0(12, c0Var2);
                p1.c cVarY = l0.u0.y(c0Var2);
                p1.c cVarS = c0Var2.s(c0Var3, false);
                if (jc.l.a((y2.c0) c0Var.f25399a.f25438b.get(), c0Var)) {
                    c0Var.f25400b.e(this.f7974f, this.f7975g, i0Var2, f0Var, cVarY, cVarS);
                }
            }
        }
        return ub.a0.f21526a;
    }
}
