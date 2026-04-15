package fa;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import bg.a2;
import com.cnl.kikoeru.R;
import g2.v0;
import hf.y;
import i7.p2;
import j2.h0;
import java.util.Arrays;
import java.util.List;
import jc.a0;
import jc.z;
import m0.d9;
import m0.e9;
import m0.p3;
import m0.r4;
import m0.x;
import m0.z8;
import na.w;
import x0.e1;
import x0.p1;
import x0.r0;
import x0.w0;
import y.i1;
import y.j1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ pc.u[] f7038a;

    static {
        jc.r rVar = new jc.r(t.class, "musicReplayTime", "<v#3>", 1);
        a0 a0Var = z.f10839a;
        f7038a = new pc.u[]{a0Var.f(rVar), a0Var.f(new jc.r(t.class, "musicForwardTime", "<v#4>", 1))};
    }

    public static final void a(int i10, x0.o oVar) {
        oVar.Y(1286839733);
        if (oVar.N(i10 & 1, i10 != 0)) {
            e7.a0 a0Var = (e7.a0) oVar.j(a9.u.f265c);
            j1.q qVarN = y.d.n(androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.c(j1.n.f9689a, 1.0f), 5));
            j1 j1VarA = i1.a(y.k.f25160e, j1.c.f9672k, oVar, 54);
            int iQ = x0.v.q(oVar);
            x0.j1 j1VarL = oVar.l();
            j1.q qVarC = j1.a.c(qVarN, oVar);
            i2.k.f8771g0.getClass();
            ic.a aVar = i2.j.f8733b;
            oVar.a0();
            if (oVar.S) {
                oVar.k(aVar);
            } else {
                oVar.k0();
            }
            x0.v.A(i2.j.f8738g, j1VarA, oVar);
            x0.v.A(i2.j.f8737f, j1VarL, oVar);
            i2.h hVar = i2.j.f8741j;
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                h0.s(iQ, oVar, iQ, hVar);
            }
            x0.v.A(i2.j.f8735d, qVarC, oVar);
            Object objK = oVar.K();
            Object obj = x0.k.f24334a;
            if (objK == obj) {
                objK = new e.e(4);
                oVar.h0(objK);
            }
            p3.a((ic.a) objK, null, false, b.f6962e, oVar, 24582, 14);
            Object objK2 = oVar.K();
            if (objK2 == obj) {
                objK2 = new e.e(5);
                oVar.h0(objK2);
            }
            p3.a((ic.a) objK2, null, false, b.f6963f, oVar, 24582, 14);
            Object objK3 = oVar.K();
            if (objK3 == obj) {
                objK3 = new e.e(6);
                oVar.h0(objK3);
            }
            p3.a((ic.a) objK3, null, false, b.f6964g, oVar, 24582, 14);
            Object objK4 = oVar.K();
            if (objK4 == obj) {
                objK4 = new e.e(7);
                oVar.h0(objK4);
            }
            p3.a((ic.a) objK4, null, false, b.f6965h, oVar, 24582, 14);
            boolean zH = oVar.h(a0Var);
            Object objK5 = oVar.K();
            if (zH || objK5 == obj) {
                objK5 = new ca.b(a0Var, 4);
                oVar.h0(objK5);
            }
            p3.a((ic.a) objK5, null, false, b.f6966i, oVar, 24576, 14);
            oVar.p(true);
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new a(i10, 9);
        }
    }

    public static final void b(int i10, x0.o oVar) {
        oVar.Y(-117007673);
        if (oVar.N(i10 & 1, i10 != 0)) {
            v vVar = v.f7039a;
            Object objK = oVar.K();
            r0 r0Var = x0.k.f24334a;
            if (objK == r0Var) {
                int i11 = ff.a.f7057d;
                objK = x0.v.v(new ff.a(ff.f.n(v.f7044f - System.currentTimeMillis(), ff.c.MILLISECONDS)));
                oVar.h0(objK);
            }
            w0 w0Var = (w0) objK;
            boolean zH = oVar.h(vVar);
            Object objK2 = oVar.K();
            if (zH || objK2 == r0Var) {
                objK2 = new o(w0Var, null, 0);
                oVar.h0(objK2);
            }
            x0.v.e((ic.n) objK2, ub.a0.f21526a, oVar);
            long j10 = 60;
            z8.b(String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(ff.a.h(((ff.a) w0Var.getValue()).f7058a, ff.c.HOURS)), Long.valueOf(ff.a.h(((ff.a) w0Var.getValue()).f7058a, ff.c.MINUTES) % j10), Long.valueOf(ff.a.h(((ff.a) w0Var.getValue()).f7058a, ff.c.SECONDS) % j10)}, 3)), androidx.compose.foundation.layout.c.c(j1.n.f9689a, 1.0f), 0L, 0L, null, null, 0L, null, new e3.k(3), 0L, 0, false, 0, 0, ((d9) oVar.j(e9.f12960b)).f12880c, oVar, 48, 0, 65020);
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new a(i10, 10);
        }
    }

    public static final void c(a2 a2Var, ic.a aVar, x0.o oVar, int i10) {
        x0.o oVar2 = oVar;
        oVar2.Y(1300221173);
        int i11 = i10 | (oVar2.h(a2Var) ? 4 : 2);
        if (oVar2.N(i11 & 1, (i11 & 19) != 18)) {
            e7.a0 a0Var = (e7.a0) oVar2.j(a9.u.f265c);
            v vVar = v.f7039a;
            FillElement fillElement = androidx.compose.foundation.layout.c.f557c;
            j1.f fVar = j1.c.f9675n;
            y.v vVarA = y.u.a(y.k.f25161f, fVar, oVar2, 54);
            int iQ = x0.v.q(oVar2);
            x0.j1 j1VarL = oVar2.l();
            j1.q qVarC = j1.a.c(fillElement, oVar2);
            i2.k.f8771g0.getClass();
            i2.i iVar = i2.j.f8733b;
            oVar2.a0();
            if (oVar2.S) {
                oVar2.k(iVar);
            } else {
                oVar2.k0();
            }
            i2.h hVar = i2.j.f8738g;
            x0.v.A(hVar, vVarA, oVar2);
            i2.h hVar2 = i2.j.f8737f;
            x0.v.A(hVar2, j1VarL, oVar2);
            i2.h hVar3 = i2.j.f8741j;
            if (oVar2.S || !jc.l.a(oVar2.K(), Integer.valueOf(iQ))) {
                h0.s(iQ, oVar2, iQ, hVar3);
            }
            i2.h hVar4 = i2.j.f8735d;
            x0.v.A(hVar4, qVarC, oVar2);
            if (1.0f <= 0.0d) {
                z.a.a("invalid weight; must be greater than zero");
            }
            j1.q qVarE = fillElement.e(new LayoutWeightElement(1.0f, true));
            y.v vVarA2 = y.u.a(y.k.f25159d, fVar, oVar2, 54);
            int iQ2 = x0.v.q(oVar2);
            x0.j1 j1VarL2 = oVar2.l();
            j1.q qVarC2 = j1.a.c(qVarE, oVar2);
            oVar2.a0();
            if (oVar2.S) {
                oVar2.k(iVar);
            } else {
                oVar2.k0();
            }
            x0.v.A(hVar, vVarA2, oVar2);
            x0.v.A(hVar2, j1VarL2, oVar2);
            if (oVar2.S || !jc.l.a(oVar2.K(), Integer.valueOf(iQ2))) {
                h0.s(iQ2, oVar2, iQ2, hVar3);
            }
            x0.v.A(hVar4, qVarC2, oVar2);
            float f10 = 10;
            g8.a.a(null, g0.g.a(f10), q1.q.f17574g, 4, f1.g.f(1249231428, new a9.p(a2Var, a0Var, aVar, 6), oVar2), oVar, 1769856, 25);
            bg.z zVarB = h9.d.b();
            String str = zVarB != null ? zVarB.f2996d : null;
            String strM = str != null ? w.m(str) : null;
            if (strM == null) {
                strM = "";
            }
            j1.n nVar = j1.n.f9689a;
            z8.b(strM, androidx.compose.foundation.layout.a.n(nVar, 0.0f, f10, 0.0f, 0.0f, 13), 0L, 0L, null, null, 0L, null, new e3.k(3), 0L, 0, false, 0, 0, null, oVar, 48, 0, 130556);
            oVar2 = oVar;
            oVar2.p(true);
            j1.q qVarJ = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.c(nVar, 1.0f), 5);
            j1 j1VarA = i1.a(new y.g(30, true, new y.j(fVar, 0)), j1.c.f9671j, oVar2, 6);
            int iQ3 = x0.v.q(oVar2);
            x0.j1 j1VarL3 = oVar2.l();
            j1.q qVarC3 = j1.a.c(qVarJ, oVar2);
            oVar2.a0();
            if (oVar2.S) {
                oVar2.k(iVar);
            } else {
                oVar2.k0();
            }
            x0.v.A(hVar, j1VarA, oVar2);
            x0.v.A(hVar2, j1VarL3, oVar2);
            if (oVar2.S || !jc.l.a(oVar2.K(), Integer.valueOf(iQ3))) {
                h0.s(iQ3, oVar2, iQ3, hVar3);
            }
            x0.v.A(hVar4, qVarC3, oVar2);
            boolean zH = oVar2.h(vVar);
            Object objK = oVar2.K();
            r0 r0Var = x0.k.f24334a;
            if (zH || objK == r0Var) {
                objK = new e.e(10);
                oVar2.h0(objK);
            }
            p3.a((ic.a) objK, null, false, b.f6967j, oVar2, 24576, 14);
            boolean zH2 = oVar2.h(vVar);
            Object objK2 = oVar2.K();
            if (zH2 || objK2 == r0Var) {
                objK2 = new e.e(11);
                oVar2.h0(objK2);
            }
            p3.a((ic.a) objK2, null, false, b.f6968k, oVar2, 24576, 14);
            oVar2.p(true);
            oVar2.p(true);
        } else {
            oVar2.Q();
        }
        p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new n(a2Var, aVar, i10);
        }
    }

    public static final void d(int i10, x0.o oVar) {
        j1.n nVar;
        androidx.compose.foundation.layout.b bVar;
        x0.o oVar2 = oVar;
        oVar2.Y(-2018297602);
        if (oVar2.N(i10 & 1, i10 != 0)) {
            v vVar = v.f7039a;
            j9.u uVar = j9.u.f10753a;
            Object objK = oVar2.K();
            r0 r0Var = x0.k.f24334a;
            if (objK == r0Var) {
                objK = x0.v.m(oVar2);
                oVar2.h0(objK);
            }
            y yVar = (y) objK;
            FillElement fillElement = androidx.compose.foundation.layout.c.f557c;
            v0 v0VarD = y.p.d(j1.c.f9662a, false);
            int iQ = x0.v.q(oVar2);
            x0.j1 j1VarL = oVar2.l();
            j1.q qVarC = j1.a.c(fillElement, oVar2);
            i2.k.f8771g0.getClass();
            i2.i iVar = i2.j.f8733b;
            oVar2.a0();
            if (oVar2.S) {
                oVar2.k(iVar);
            } else {
                oVar2.k0();
            }
            x0.v.A(i2.j.f8738g, v0VarD, oVar2);
            x0.v.A(i2.j.f8737f, j1VarL, oVar2);
            i2.h hVar = i2.j.f8741j;
            if (oVar2.S || !jc.l.a(oVar2.K(), Integer.valueOf(iQ))) {
                h0.s(iQ, oVar2, iQ, hVar);
            }
            x0.v.A(i2.j.f8735d, qVarC, oVar2);
            e1 e1Var = j9.u.f10757e;
            boolean zIsEmpty = ((List) e1Var.getValue()).isEmpty();
            j1.n nVar2 = j1.n.f9689a;
            androidx.compose.foundation.layout.b bVar2 = androidx.compose.foundation.layout.b.f554a;
            if (zIsEmpty) {
                oVar2.W(1025242549);
                j1.q qVarA = bVar2.a(nVar2, j1.c.f9666e);
                String strG = na.q.g(R.string.no_lrc);
                ka.q qVar = (ka.q) j9.u.f10758f.getValue();
                boolean zH = oVar2.h(yVar) | oVar2.h(uVar);
                Object objK2 = oVar2.K();
                if (zH || objK2 == r0Var) {
                    objK2 = new ba.d(yVar, 2);
                    oVar2.h0(objK2);
                }
                nVar = nVar2;
                bVar = bVar2;
                ka.b.j(qVarA, strG, null, null, qVar, (ic.a) objK2, oVar, 0, 12);
                oVar2 = oVar;
                oVar2.p(false);
            } else {
                nVar = nVar2;
                bVar = bVar2;
                oVar2.W(1025518418);
                e1 e1Var2 = v.f7040b;
                List list = (List) e1Var.getValue();
                Object objK3 = oVar2.K();
                if (objK3 == r0Var) {
                    objK3 = new d9.i(23);
                    oVar2.h0(objK3);
                }
                b.a(e1Var2, list, (ic.k) objK3, oVar2, 384);
                oVar2.p(false);
            }
            j1.q qVarA2 = bVar.a(nVar, j1.c.f9664c);
            boolean zH2 = oVar2.h(uVar) | oVar2.h(yVar) | oVar2.h(vVar);
            Object objK4 = oVar2.K();
            if (zH2 || objK4 == r0Var) {
                objK4 = new ba.d(yVar, 3);
                oVar2.h0(objK4);
            }
            p3.a((ic.a) objK4, qVarA2, false, b.f6961d, oVar2, 24576, 12);
            oVar2.p(true);
        } else {
            oVar2.Q();
        }
        p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new a(i10, 8);
        }
    }

    public static final void e(int i10, x0.o oVar) {
        oVar.Y(746520516);
        int i11 = 0;
        boolean z10 = true;
        if (oVar.N(i10 & 1, i10 != 0)) {
            Object obj = v.f7039a;
            j9.u uVar = j9.u.f10753a;
            Object objK = oVar.K();
            Object obj2 = x0.k.f24334a;
            Object obj3 = objK;
            if (objK == obj2) {
                Object objM = x0.v.m(oVar);
                oVar.h0(objM);
                obj3 = objM;
            }
            y yVar = (y) obj3;
            Object objK2 = oVar.K();
            yb.c cVar = null;
            Object obj4 = objK2;
            if (objK2 == obj2) {
                Object objV = x0.v.v(null);
                oVar.h0(objV);
                obj4 = objV;
            }
            w0 w0Var = (w0) obj4;
            h.a aVar = new h.a(i11);
            Object objK3 = oVar.K();
            Object obj5 = objK3;
            if (objK3 == obj2) {
                Object dVar = new aa.d(w0Var, 19);
                oVar.h0(dVar);
                obj5 = dVar;
            }
            e.h hVarL = a.a.L(aVar, (ic.k) obj5, oVar, 48);
            boolean zH = oVar.h(hVarL) | oVar.f("*/*");
            Object objK4 = oVar.K();
            Object obj6 = objK4;
            if (zH || objK4 == obj2) {
                Object nVar = new na.n(w0Var, hVarL, cVar, z10 ? 1 : 0);
                oVar.h0(nVar);
                obj6 = nVar;
            }
            ic.k kVar = (ic.k) obj6;
            p2 p2Var = v.f7042d;
            boolean z11 = ((r4) ((x) p2Var.f9258a).f13852h.getValue()) != r4.f13548a;
            boolean zH2 = oVar.h(obj) | oVar.h(yVar);
            Object objK5 = oVar.K();
            Object obj7 = objK5;
            if (zH2 || objK5 == obj2) {
                Object dVar2 = new ba.d(yVar, 4);
                oVar.h0(dVar2);
                obj7 = dVar2;
            }
            a2.c.d(z11, (ic.a) obj7, oVar, 0);
            androidx.compose.material.a.a(f1.g.f(-856294926, new ba.k(yVar, kVar), oVar), null, p2Var, false, g0.g.a(10), 0.0f, 0L, 0L, 0L, oVar, 805306886);
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new a(i10, 11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x028f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(int r40, x0.o r41) {
        /*
            Method dump skipped, instruction units count: 1176
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fa.t.f(int, x0.o):void");
    }

    public static final String g(long j10) {
        int i10 = ff.a.f7057d;
        long jN = ff.f.n(j10, ff.c.MILLISECONDS);
        return String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(ff.a.h(jN, ff.c.MINUTES)), Long.valueOf(ff.a.h(jN, ff.c.SECONDS) % ((long) 60))}, 2));
    }

    public static final void h(int i10, x0.o oVar) {
        p1 p1VarR;
        a aVar;
        oVar.Y(293685815);
        if (oVar.N(i10 & 1, i10 != 0)) {
            v vVar = v.f7039a;
            Object objK = oVar.K();
            r0 r0Var = x0.k.f24334a;
            if (objK == r0Var) {
                objK = x0.v.v(Float.valueOf(30.0f));
                oVar.h0(objK);
            }
            w0 w0Var = (w0) objK;
            if (!((Boolean) v.f7046h.getValue()).booleanValue()) {
                p1VarR = oVar.r();
                if (p1VarR != null) {
                    aVar = new a(i10, 7);
                    p1VarR.f24421d = aVar;
                }
                return;
            }
            boolean zH = oVar.h(vVar);
            Object objK2 = oVar.K();
            if (zH || objK2 == r0Var) {
                objK2 = new e.e(8);
                oVar.h0(objK2);
            }
            a2.c.c((ic.a) objK2, b.f6971n, null, b.f6972o, f1.g.f(1747040268, new aa.g(w0Var), oVar), null, 0L, 0L, null, oVar, 27696, 484);
        } else {
            oVar.Q();
        }
        p1VarR = oVar.r();
        if (p1VarR != null) {
            aVar = new a(i10, 13);
            p1VarR.f24421d = aVar;
        }
    }

    public static final void i(String str, long j10, x0.o oVar, int i10) {
        x0.o oVar2;
        oVar.Y(403805896);
        int i11 = (oVar.f(str) ? 4 : 2) | i10 | (oVar.e(j10) ? 32 : 16);
        if (oVar.N(i11 & 1, (i11 & 19) != 18)) {
            Object objK = oVar.K();
            if (objK == x0.k.f24334a) {
                objK = x0.v.m(oVar);
                oVar.h0(objK);
            }
            oVar2 = oVar;
            g8.a.a(null, null, 0L, 4, f1.g.f(500031019, new da.v(str, (y) objK, j10), oVar), oVar2, 1769472, 31);
        } else {
            oVar2 = oVar;
            oVar2.Q();
        }
        p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new m(j10, str, i10, 0);
        }
    }
}
