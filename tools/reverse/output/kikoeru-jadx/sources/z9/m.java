package z9;

import com.tencent.bugly.beta.tinker.TinkerReport;
import g2.v0;
import hf.y;
import j2.h0;
import jc.z;
import m0.b0;
import m0.d4;
import m0.p3;
import pc.f0;
import pc.u;
import q9.j0;
import x0.j1;
import x0.p1;
import x0.q2;
import x0.r0;
import x0.v;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ u[] f26642a = {z.f10839a.d(new jc.n(m.class, "documentUri", "<v#0>"))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f26643b = {"SHIFT_JIS", "GBK", "UTF-8", "UTF16LE"};

    public static final void a(r rVar, x0.o oVar, int i10) {
        oVar.Y(-363442630);
        int i11 = (oVar.h(rVar) ? 4 : 2) | i10;
        if (oVar.N(i11 & 1, (i11 & 3) != 2)) {
            Object objK = oVar.K();
            r0 r0Var = x0.k.f24334a;
            if (objK == r0Var) {
                objK = v.m(oVar);
                oVar.h0(objK);
            }
            y yVar = (y) objK;
            if (!((Boolean) rVar.f26659g.getValue()).booleanValue()) {
                p1 p1VarR = oVar.r();
                if (p1VarR != null) {
                    p1VarR.f24421d = new c(rVar, i10, 5);
                    return;
                }
                return;
            }
            boolean zH = oVar.h(rVar);
            Object objK2 = oVar.K();
            if (zH || objK2 == r0Var) {
                objK2 = new b(rVar, 3);
                oVar.h0(objK2);
            }
            a2.c.b((ic.a) objK2, f1.g.f(-2054206222, new f(rVar, yVar, 1), oVar), null, f1.g.f(623320624, new c(rVar, 6), oVar), a.f26605k, f1.g.f(-994119826, new c(rVar, 7), oVar), null, 0L, 0L, null, oVar, 224304, 964);
        } else {
            oVar.Q();
        }
        p1 p1VarR2 = oVar.r();
        if (p1VarR2 != null) {
            p1VarR2.f24421d = new c(rVar, i10, 8);
        }
    }

    public static final void b(w0 w0Var, ic.a aVar, x0.o oVar, int i10) {
        oVar.Y(1831184092);
        int i11 = (oVar.f(w0Var) ? 4 : 2) | i10 | (oVar.h(aVar) ? 32 : 16);
        if (oVar.N(i11 & 1, (i11 & 19) != 18)) {
            Object objK = oVar.K();
            r0 r0Var = x0.k.f24334a;
            if (objK == r0Var) {
                objK = f0.P(gg.c.a(), "subtitleDocumentUri", "", z.a(String.class));
                oVar.h0(objK);
            }
            hg.b bVar = (hg.b) objK;
            Object objK2 = oVar.K();
            if (objK2 == r0Var) {
                objK2 = v.m(oVar);
                oVar.h0(objK2);
            }
            y yVar = (y) objK2;
            ic.k kVarN = na.c.n(oVar);
            if (!((Boolean) w0Var.getValue()).booleanValue()) {
                p1 p1VarR = oVar.r();
                if (p1VarR != null) {
                    p1VarR.f24421d = new ba.h(w0Var, aVar, i10, 5);
                    return;
                }
                return;
            }
            boolean z10 = (i11 & 14) == 4;
            Object objK3 = oVar.K();
            if (z10 || objK3 == r0Var) {
                objK3 = new w9.d(w0Var, 5);
                oVar.h0(objK3);
            }
            a2.c.b((ic.a) objK3, f1.g.f(-391068380, new d4(w0Var, yVar, bVar, kVarN, aVar, 4), oVar), null, null, a.f26598d, a.f26599e, null, 0L, 0L, null, oVar, 221232, 972);
        } else {
            oVar.Q();
        }
        p1 p1VarR2 = oVar.r();
        if (p1VarR2 != null) {
            p1VarR2.f24421d = new ba.h(w0Var, aVar, i10, 6);
        }
    }

    public static final void c(r rVar, x0.o oVar, int i10) {
        oVar.Y(-1705903883);
        int i11 = (oVar.h(rVar) ? 4 : 2) | i10;
        if (oVar.N(i11 & 1, (i11 & 3) != 2)) {
            Object objK = oVar.K();
            r0 r0Var = x0.k.f24334a;
            if (objK == r0Var) {
                objK = v.m(oVar);
                oVar.h0(objK);
            }
            y yVar = (y) objK;
            if (!((Boolean) rVar.f26663k.getValue()).booleanValue()) {
                p1 p1VarR = oVar.r();
                if (p1VarR != null) {
                    p1VarR.f24421d = new c(rVar, i10, 1);
                    return;
                }
                return;
            }
            boolean zH = oVar.h(rVar);
            Object objK2 = oVar.K();
            if (zH || objK2 == r0Var) {
                objK2 = new b(rVar, 2);
                oVar.h0(objK2);
            }
            a2.c.b((ic.a) objK2, f1.g.f(-652065987, new f(rVar, yVar, 0), oVar), null, f1.g.f(-288599489, new c(rVar, 2), oVar), null, f1.g.f(74867009, new c(rVar, 3), oVar), null, 0L, 0L, null, oVar, 199728, 980);
        } else {
            oVar.Q();
        }
        p1 p1VarR2 = oVar.r();
        if (p1VarR2 != null) {
            p1VarR2.f24421d = new c(rVar, i10, 4);
        }
    }

    public static final void d(r rVar, x0.o oVar, int i10) {
        p1 p1VarR;
        c cVar;
        oVar.Y(-206144107);
        int i11 = (oVar.h(rVar) ? 4 : 2) | i10;
        if (oVar.N(i11 & 1, (i11 & 3) != 2)) {
            c9.f fVar = (c9.f) rVar.f26658f.getValue();
            if (fVar == null) {
                p1VarR = oVar.r();
                if (p1VarR != null) {
                    cVar = new c(rVar, i10, 9);
                    p1VarR.f24421d = cVar;
                }
                return;
            }
            int i12 = i11 & 14;
            a(rVar, oVar, i12);
            c(rVar, oVar, i12);
            boolean zH = oVar.h(rVar);
            Object objK = oVar.K();
            r0 r0Var = x0.k.f24334a;
            if (zH || objK == r0Var) {
                objK = new e7.y(28, rVar);
                oVar.h0(objK);
            }
            j1.q qVarG = androidx.compose.foundation.layout.a.g(j1.n.f9689a, (ic.k) objK);
            v0 v0VarD = y.p.d(j1.c.f9662a, false);
            int iQ = v.q(oVar);
            j1 j1VarL = oVar.l();
            j1.q qVarC = j1.a.c(qVarG, oVar);
            i2.k.f8771g0.getClass();
            i2.i iVar = i2.j.f8733b;
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            v.A(i2.j.f8738g, v0VarD, oVar);
            v.A(i2.j.f8737f, j1VarL, oVar);
            i2.h hVar = i2.j.f8741j;
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                h0.s(iQ, oVar, iQ, hVar);
            }
            v.A(i2.j.f8735d, qVarC, oVar);
            boolean zBooleanValue = ((Boolean) rVar.f26656d.getValue()).booleanValue();
            boolean zH2 = oVar.h(rVar);
            Object objK2 = oVar.K();
            if (zH2 || objK2 == r0Var) {
                objK2 = new b(rVar, 0);
                oVar.h0(objK2);
            }
            b0.a(zBooleanValue, (ic.a) objK2, null, 0L, null, null, f1.g.f(169071868, new ba.k(10, rVar, fVar), oVar), oVar, 1572864, 60);
            oVar.p(true);
        } else {
            oVar.Q();
        }
        p1VarR = oVar.r();
        if (p1VarR != null) {
            cVar = new c(rVar, i10, 0);
            p1VarR.f24421d = cVar;
        }
    }

    public static final void e(w0 w0Var, x0.o oVar, int i10) {
        p1 p1VarR;
        aa.g gVar;
        oVar.Y(-2013279876);
        int i11 = (oVar.f(w0Var) ? 4 : 2) | i10;
        if (!oVar.N(i11 & 1, (i11 & 3) != 2)) {
            oVar.Q();
        } else {
            if (!((Boolean) w0Var.getValue()).booleanValue()) {
                p1VarR = oVar.r();
                if (p1VarR != null) {
                    gVar = new aa.g(w0Var, i10, 25);
                    p1VarR.f24421d = gVar;
                }
                return;
            }
            w0 w0VarL = v.l(j9.b0.f10660b, oVar);
            w0 w0VarL2 = v.l(j9.b0.f10661c, oVar);
            j3.q qVar = new j3.q(4);
            Object objK = oVar.K();
            if (objK == x0.k.f24334a) {
                objK = new j0(28);
                oVar.h0(objK);
            }
            a2.c.c((ic.a) objK, f1.g.f(-732359116, new ba.h0(25, w0VarL, w0VarL2), oVar), null, null, null, null, 0L, 0L, qVar, oVar, 100663350, TinkerReport.KEY_LOADED_EXCEPTION_DEX);
        }
        p1VarR = oVar.r();
        if (p1VarR != null) {
            gVar = new aa.g(w0Var, i10, 26);
            p1VarR.f24421d = gVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0314  */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v39 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(int r35, x0.o r36) {
        /*
            Method dump skipped, instruction units count: 865
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z9.m.f(int, x0.o):void");
    }

    public static final void g(int i10, x0.o oVar) {
        x0.o oVar2;
        oVar.Y(-1325343941);
        if (oVar.N(i10 & 1, i10 != 0)) {
            Object objK = oVar.K();
            r0 r0Var = x0.k.f24334a;
            if (objK == r0Var) {
                objK = v.m(oVar);
                oVar.h0(objK);
            }
            y yVar = (y) objK;
            boolean zH = oVar.h(yVar);
            Object objK2 = oVar.K();
            if (zH || objK2 == r0Var) {
                objK2 = new ba.d(yVar, 8, false);
                oVar.h0(objK2);
            }
            oVar2 = oVar;
            p3.a((ic.a) objK2, null, false, a.f26608n, oVar2, 24576, 14);
        } else {
            oVar2 = oVar;
            oVar2.Q();
        }
        p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new q2(i10, 11);
        }
    }
}
