package ha;

import a9.p;
import androidx.compose.foundation.layout.FillElement;
import ce.j0;
import hd.q0;
import hf.y;
import i2.h;
import i2.i;
import i2.j;
import ic.k;
import ic.n;
import j1.q;
import j2.h0;
import jc.l;
import l0.u0;
import m0.b3;
import m0.g5;
import m0.p3;
import m0.r3;
import n7.b0;
import q1.n0;
import u3.x0;
import ub.a0;
import w1.g0;
import x0.j1;
import x0.n2;
import x0.o;
import x0.r0;
import x0.w0;
import y.i1;
import y.u;
import y.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8261e;

    public /* synthetic */ c(hg.b bVar, k kVar, w0 w0Var, w0 w0Var2) {
        this.f8257a = 4;
        this.f8258b = bVar;
        this.f8260d = kVar;
        this.f8259c = w0Var;
        this.f8261e = w0Var2;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        int i10;
        int i11;
        int i12 = this.f8257a;
        j1.n nVar = j1.n.f9689a;
        a0 a0Var = a0.f21526a;
        r0 r0Var = x0.k.f24334a;
        Object obj3 = this.f8261e;
        Object obj4 = this.f8259c;
        Object obj5 = this.f8260d;
        Object obj6 = this.f8258b;
        switch (i12) {
            case 0:
                w0 w0Var = (w0) obj4;
                y yVar = (y) obj6;
                g gVar = (g) obj5;
                n2 n2Var = (n2) obj3;
                o oVar = (o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    FillElement fillElement = androidx.compose.foundation.layout.c.f557c;
                    v vVarA = u.a(y.k.f25158c, j1.c.f9674m, oVar, 0);
                    int iQ = x0.v.q(oVar);
                    j1 j1VarL = oVar.l();
                    q qVarC = j1.a.c(fillElement, oVar);
                    i2.k.f8771g0.getClass();
                    i iVar = j.f8733b;
                    oVar.a0();
                    if (oVar.S) {
                        oVar.k(iVar);
                    } else {
                        oVar.k0();
                    }
                    x0.v.A(j.f8738g, vVarA, oVar);
                    x0.v.A(j.f8737f, j1VarL, oVar);
                    h hVar = j.f8741j;
                    if (oVar.S || !l.a(oVar.K(), Integer.valueOf(iQ))) {
                        h0.s(iQ, oVar, iQ, hVar);
                    }
                    x0.v.A(j.f8735d, qVarC, oVar);
                    boolean zH = oVar.h(yVar) | oVar.h(gVar);
                    Object objK = oVar.K();
                    if (zH || objK == r0Var) {
                        i10 = 6;
                        objK = new ba.c(yVar, gVar, n2Var, i10);
                        oVar.h0(objK);
                    } else {
                        i10 = 6;
                    }
                    b.c(w0Var, (ic.a) objK, oVar, i10);
                    u0.b(androidx.compose.foundation.layout.a.j(y.d.n(b0.x(nVar, b0.v(oVar), true)), 5), f1.g.f(2077614170, new ba.h0(i10, gVar, n2Var), oVar), oVar, 48, 0);
                    oVar.p(true);
                } else {
                    oVar.Q();
                }
                return a0Var;
            case 1:
                m9.c cVar = (m9.c) obj5;
                y yVar2 = (y) obj6;
                w0 w0Var2 = (w0) obj4;
                w0 w0Var3 = (w0) obj3;
                o oVar2 = (o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (oVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    y.j1 j1VarA = i1.a(y.k.f25156a, j1.c.f9672k, oVar2, 48);
                    int iQ2 = x0.v.q(oVar2);
                    j1 j1VarL2 = oVar2.l();
                    q qVarC2 = j1.a.c(nVar, oVar2);
                    i2.k.f8771g0.getClass();
                    i iVar2 = j.f8733b;
                    oVar2.a0();
                    if (oVar2.S) {
                        oVar2.k(iVar2);
                    } else {
                        oVar2.k0();
                    }
                    x0.v.A(j.f8738g, j1VarA, oVar2);
                    x0.v.A(j.f8737f, j1VarL2, oVar2);
                    h hVar2 = j.f8741j;
                    if (oVar2.S || !l.a(oVar2.K(), Integer.valueOf(iQ2))) {
                        h0.s(iQ2, oVar2, iQ2, hVar2);
                    }
                    x0.v.A(j.f8735d, qVarC2, oVar2);
                    int iOrdinal = ((ka.q) cVar.f14994g.getValue()).ordinal();
                    if (iOrdinal == 0) {
                        i11 = 0;
                        oVar2.W(894246156);
                        oVar2.p(false);
                    } else if (iOrdinal == 1) {
                        oVar2.W(894248119);
                        g5.a(androidx.compose.foundation.layout.c.j(nVar, 24), 0L, 0.0f, 0L, 0, oVar2, 6, 30);
                        i11 = 0;
                        oVar2.p(false);
                    } else if (iOrdinal == 2) {
                        oVar2.W(1952231984);
                        w1.f fVarB = n7.d.f15443e;
                        if (fVarB == null) {
                            w1.e eVar = new w1.e("Filled.ErrorOutline", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i13 = g0.f23208a;
                            n0 n0Var = new n0(q1.q.f17569b);
                            q0 q0Var = new q0((byte) 0, 6);
                            q0Var.u(11.0f, 15.0f);
                            q0Var.r(2.0f);
                            q0Var.z(2.0f);
                            q0Var.r(-2.0f);
                            q0Var.l();
                            q0Var.u(11.0f, 7.0f);
                            q0Var.r(2.0f);
                            q0Var.z(6.0f);
                            q0Var.r(-2.0f);
                            q0Var.l();
                            q0Var.u(11.99f, 2.0f);
                            q0Var.m(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                            q0Var.w(4.47f, 10.0f, 9.99f, 10.0f);
                            q0Var.m(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
                            q0Var.v(17.52f, 2.0f, 11.99f, 2.0f);
                            q0Var.l();
                            q0Var.u(12.0f, 20.0f);
                            q0Var.n(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
                            q0Var.w(3.58f, -8.0f, 8.0f, -8.0f);
                            q0Var.w(8.0f, 3.58f, 8.0f, 8.0f);
                            q0Var.w(-3.58f, 8.0f, -8.0f, 8.0f);
                            q0Var.l();
                            w1.e.a(eVar, q0Var.f8447b, 0, n0Var);
                            fVarB = eVar.b();
                            n7.d.f15443e = fVarB;
                        }
                        w1.f fVar = fVarB;
                        long j10 = ja.a.f10793j;
                        boolean zH2 = oVar2.h(yVar2) | oVar2.h(cVar);
                        Object objK2 = oVar2.K();
                        if (zH2 || objK2 == r0Var) {
                            objK2 = new ba.c((Object) yVar2, (Object) cVar, w0Var2, 14);
                            oVar2.h0(objK2);
                        }
                        r3.b(fVar, null, androidx.compose.foundation.a.d(nVar, null, (ic.a) objK2, 7), j10, oVar2, 3120, 0);
                        i11 = 0;
                        oVar2.p(false);
                    } else {
                        if (iOrdinal != 3) {
                            oVar2.W(894244457);
                            oVar2.p(false);
                            throw new j0();
                        }
                        oVar2.W(894251547);
                        r3.b(x0.n(), null, null, ja.a.f10792i, oVar2, 3120, 4);
                        oVar2.p(false);
                        i11 = 0;
                    }
                    b3.f12721a.a(((Boolean) w0Var3.getValue()).booleanValue(), null, oVar2, i11);
                    oVar2.p(true);
                } else {
                    oVar2.Q();
                }
                return a0Var;
            case 2:
                c9.a aVar = (c9.a) obj4;
                fg.f fVar2 = (fg.f) obj6;
                fg.f fVar3 = (fg.f) obj5;
                s9.a aVar2 = (s9.a) obj3;
                o oVar3 = (o) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!oVar3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    oVar3.Q();
                } else if (l.a(aVar.f3767b, (String) fVar2.getValue()) && l.a(aVar.f3768c, (String) fVar3.getValue())) {
                    oVar3.W(1803294328);
                    Object objK3 = oVar3.K();
                    if (objK3 == r0Var) {
                        objK3 = new i9.f(10);
                        oVar3.h0(objK3);
                    }
                    p3.a((ic.a) objK3, null, false, s9.d.f19681j, oVar3, 24582, 14);
                    oVar3.p(false);
                } else {
                    oVar3.W(1803533958);
                    Object objK4 = oVar3.K();
                    if (objK4 == r0Var) {
                        objK4 = x0.v.v(Boolean.FALSE);
                        oVar3.h0(objK4);
                    }
                    w0 w0Var4 = (w0) objK4;
                    Object objK5 = oVar3.K();
                    if (objK5 == r0Var) {
                        objK5 = new ma.c(w0Var4, 21);
                        oVar3.h0(objK5);
                    }
                    p3.a((ic.a) objK5, null, false, s9.d.f19682k, oVar3, 24582, 14);
                    if (((Boolean) w0Var4.getValue()).booleanValue()) {
                        oVar3.W(1803813764);
                        Object objK6 = oVar3.K();
                        if (objK6 == r0Var) {
                            objK6 = new ma.c(w0Var4, 22);
                            oVar3.h0(objK6);
                        }
                        a2.c.b((ic.a) objK6, f1.g.f(-1762006854, new p(aVar2, aVar, w0Var4, 12), oVar3), null, f1.g.f(1079573752, new aa.g(w0Var4, 18), oVar3), s9.d.f19685n, null, null, 0L, 0L, null, oVar3, 27702, 996);
                    } else {
                        oVar3.W(1797299455);
                    }
                    oVar3.p(false);
                    oVar3.p(false);
                }
                return a0Var;
            case 3:
                t9.g gVar2 = (t9.g) obj6;
                w0 w0Var5 = (w0) obj4;
                w0 w0Var6 = (w0) obj5;
                w0 w0Var7 = (w0) obj3;
                o oVar4 = (o) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (oVar4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    boolean zH3 = oVar4.h(gVar2) | oVar4.f(w0Var5);
                    Object objK7 = oVar4.K();
                    if (zH3 || objK7 == r0Var) {
                        ba.e eVar2 = new ba.e(gVar2, w0Var5, w0Var6, w0Var7, 6);
                        oVar4.h0(eVar2);
                        objK7 = eVar2;
                    }
                    android.support.v4.media.session.b.o((ic.a) objK7, null, false, null, t9.i.f20588c, oVar4, 805306368, 510);
                } else {
                    oVar4.Q();
                }
                return a0Var;
            default:
                hg.b bVar = (hg.b) obj6;
                k kVar = (k) obj5;
                w0 w0Var8 = (w0) obj4;
                w0 w0Var9 = (w0) obj3;
                o oVar5 = (o) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (oVar5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean zH4 = oVar5.h(bVar) | oVar5.f(kVar) | oVar5.f(w0Var8);
                    Object objK8 = oVar5.K();
                    if (zH4 || objK8 == r0Var) {
                        ba.e eVar3 = new ba.e((Object) kVar, w0Var9, bVar, w0Var8, 8);
                        oVar5.h0(eVar3);
                        objK8 = eVar3;
                    }
                    android.support.v4.media.session.b.o((ic.a) objK8, null, false, null, z8.a.f26511a, oVar5, 805306368, 510);
                } else {
                    oVar5.Q();
                }
                return a0Var;
        }
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f8257a = i10;
        this.f8259c = obj;
        this.f8258b = obj2;
        this.f8260d = obj3;
        this.f8261e = obj4;
    }

    public /* synthetic */ c(m9.c cVar, y yVar, w0 w0Var, w0 w0Var2) {
        this.f8257a = 1;
        this.f8260d = cVar;
        this.f8258b = yVar;
        this.f8259c = w0Var;
        this.f8261e = w0Var2;
    }

    public /* synthetic */ c(t9.g gVar, w0 w0Var, w0 w0Var2, w0 w0Var3) {
        this.f8257a = 3;
        this.f8258b = gVar;
        this.f8259c = w0Var;
        this.f8260d = w0Var2;
        this.f8261e = w0Var3;
    }
}
