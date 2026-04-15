package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f3.c f12851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.b1 f12852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.b1 f12853c;

    public d3(f3.c cVar, x0.b1 b1Var, x0.b1 b1Var2) {
        this.f12851a = cVar;
        this.f12852b = b1Var;
        this.f12853c = b1Var2;
    }

    public final void a(boolean z10, ic.a aVar, j1.q qVar, s.o1 o1Var, f1.f fVar, x0.o oVar, int i10) {
        int i11;
        j1.q qVar2;
        s.o1 o1Var2;
        s.o1 o1VarV;
        int i12;
        j1.q qVar3;
        oVar.Y(-1576205770);
        if ((i10 & 6) == 0) {
            i11 = (oVar.g(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.h(aVar) ? 32 : 16;
        }
        int i13 = i11 | 384;
        if ((i10 & 3072) == 0) {
            i13 = i11 | 1408;
        }
        if ((i10 & 24576) == 0) {
            i13 |= oVar.h(fVar) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i13 |= oVar.f(this) ? 131072 : 65536;
        }
        if (oVar.N(i13 & 1, (74899 & i13) != 74898)) {
            oVar.S();
            if ((i10 & 1) == 0 || oVar.x()) {
                o1VarV = n7.b0.v(oVar);
                i12 = i13 & (-7169);
                qVar3 = j1.n.f9689a;
            } else {
                oVar.Q();
                i12 = i13 & (-7169);
                qVar3 = qVar;
                o1VarV = o1Var;
            }
            oVar.q();
            Object objK = oVar.K();
            x0.r0 r0Var = x0.k.f24334a;
            if (objK == r0Var) {
                objK = new r.i0(Boolean.FALSE);
                oVar.h0(objK);
            }
            r.i0 i0Var = (r.i0) objK;
            i0Var.f18457c.setValue(Boolean.valueOf(z10));
            if (((Boolean) i0Var.f18456b.getValue()).booleanValue() || ((Boolean) i0Var.f18457c.getValue()).booleanValue()) {
                oVar.W(132216667);
                Object objK2 = oVar.K();
                if (objK2 == r0Var) {
                    objK2 = x0.v.v(new q1.p0(q1.p0.f17566b));
                    oVar.h0(objK2);
                }
                x0.w0 w0Var = (x0.w0) objK2;
                f3.c cVar = (f3.c) oVar.j(j2.l1.f9866h);
                Object objK3 = oVar.K();
                if (objK3 == r0Var) {
                    objK3 = new aa.g(w0Var, 6);
                    oVar.h0(objK3);
                }
                s0.g.a(aVar, new v2(0L, cVar, (ic.n) objK3), f1.g.f(1604457564, new y2(i0Var, w0Var, o1VarV, this, qVar3, fVar), oVar), oVar, ((i12 >> 3) & 14) | 384);
                oVar.p(false);
            } else {
                oVar.W(133094060);
                oVar.p(false);
            }
            o1Var2 = o1VarV;
            qVar2 = qVar3;
        } else {
            oVar.Q();
            qVar2 = qVar;
            o1Var2 = o1Var;
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new la.t0(this, z10, aVar, qVar2, o1Var2, fVar, i10);
        }
    }
}
