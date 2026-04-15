package q9;

import x0.n2;
import x0.p1;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ef.l f18120a = new ef.l(0, "(?:RJ)?\\d{6,8}");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ef.l f18121b = new ef.l("[0-9a-f\\-]{36}");

    public static final void a(w0 w0Var, String str, ic.k kVar, x0.o oVar, int i10) {
        String str2;
        jc.l.e(w0Var, "show");
        jc.l.e(kVar, "onConfirm");
        oVar.Y(-373019401);
        int i11 = (oVar.f(w0Var) ? 4 : 2) | i10 | 48 | (oVar.h(kVar) ? 256 : 128);
        if (oVar.N(i11 & 1, (i11 & 147) != 146)) {
            Object objK = oVar.K();
            str2 = "";
            x0.r0 r0Var = x0.k.f24334a;
            if (objK == r0Var) {
                objK = x0.v.v("");
                oVar.h0(objK);
            }
            w0 w0Var2 = (w0) objK;
            Object objK2 = oVar.K();
            if (objK2 == r0Var) {
                objK2 = x0.v.o(new ma.c(w0Var2, 6));
                oVar.h0(objK2);
            }
            n2 n2Var = (n2) objK2;
            if (!((Boolean) w0Var.getValue()).booleanValue()) {
                p1 p1VarR = oVar.r();
                if (p1VarR != null) {
                    p1VarR.f24421d = new s(w0Var, kVar, i10, 1);
                    return;
                }
                return;
            }
            boolean z10 = (i11 & 14) == 4;
            Object objK3 = oVar.K();
            if (z10 || objK3 == r0Var) {
                objK3 = new ma.c(w0Var, 11);
                oVar.h0(objK3);
            }
            a2.c.b((ic.a) objK3, f1.g.f(1146024879, new a9.p(w0Var, kVar, n2Var, 11), oVar), null, f1.g.f(605595373, new aa.g(w0Var, 16), oVar), a.f17947t, f1.g.f(65165867, new ba.h0(18, w0Var2, n2Var), oVar), null, 0L, 0L, null, oVar, 224304, 964);
        } else {
            oVar.Q();
            str2 = str;
        }
        p1 p1VarR2 = oVar.r();
        if (p1VarR2 != null) {
            p1VarR2.f24421d = new ha.a(w0Var, str2, kVar, i10, 2);
        }
    }

    public static final void b(w0 w0Var, ic.k kVar, x0.o oVar, int i10) {
        w0 w0Var2;
        ic.k kVar2;
        jc.l.e(w0Var, "show");
        jc.l.e(kVar, "onConfirm");
        oVar.Y(-406965330);
        int i11 = (oVar.f(w0Var) ? 4 : 2) | i10 | (oVar.h(kVar) ? 32 : 16);
        if (oVar.N(i11 & 1, (i11 & 19) != 18)) {
            Object objK = oVar.K();
            x0.r0 r0Var = x0.k.f24334a;
            if (objK == r0Var) {
                objK = x0.v.v("");
                oVar.h0(objK);
            }
            w0 w0Var3 = (w0) objK;
            Object objK2 = oVar.K();
            if (objK2 == r0Var) {
                objK2 = x0.v.v(vb.r.f22819a);
                oVar.h0(objK2);
            }
            w0 w0Var4 = (w0) objK2;
            if (!((Boolean) w0Var.getValue()).booleanValue()) {
                p1 p1VarR = oVar.r();
                if (p1VarR != null) {
                    p1VarR.f24421d = new s(w0Var, kVar, i10, 2);
                    return;
                }
                return;
            }
            boolean z10 = (i11 & 14) == 4;
            Object objK3 = oVar.K();
            if (z10 || objK3 == r0Var) {
                objK3 = new ma.c(w0Var, 7);
                oVar.h0(objK3);
            }
            w0Var2 = w0Var;
            kVar2 = kVar;
            android.support.v4.media.session.b.c((ic.a) objK3, new j3.q(3), f1.g.f(515550661, new r(w0Var3, w0Var4, w0Var2, kVar2, 0), oVar), oVar, 432);
        } else {
            w0Var2 = w0Var;
            kVar2 = kVar;
            oVar.Q();
        }
        p1 p1VarR2 = oVar.r();
        if (p1VarR2 != null) {
            p1VarR2.f24421d = new s(w0Var2, kVar2, i10, 0);
        }
    }

    public static final void c(w0 w0Var, String str, ic.a aVar, x0.o oVar, int i10) {
        w0 w0Var2;
        p1 p1VarR;
        ba.m0 m0Var;
        jc.l.e(w0Var, "show");
        jc.l.e(str, "name");
        jc.l.e(aVar, "onDelete");
        oVar.Y(-2135414294);
        int i11 = i10 | (oVar.f(str) ? 32 : 16) | (oVar.h(aVar) ? 256 : 128);
        if (!oVar.N(i11 & 1, (i11 & 147) != 146)) {
            w0Var2 = w0Var;
            oVar.Q();
        } else {
            if (!((Boolean) w0Var.getValue()).booleanValue()) {
                p1VarR = oVar.r();
                if (p1VarR != null) {
                    m0Var = new ba.m0(w0Var, str, aVar, i10, 2);
                    p1VarR.f24421d = m0Var;
                }
                return;
            }
            w0Var2 = w0Var;
            Object objK = oVar.K();
            if (objK == x0.k.f24334a) {
                objK = new ma.c(w0Var2, 13);
                oVar.h0(objK);
            }
            a2.c.b((ic.a) objK, f1.g.f(-1654396254, new ba.h(w0Var2, aVar, 4), oVar), null, f1.g.f(239937632, new aa.g(w0Var2, 15), oVar), null, f1.g.f(2134271518, new ba.p(11, str), oVar), null, 0L, 0L, null, oVar, 199728, 980);
        }
        p1VarR = oVar.r();
        if (p1VarR != null) {
            m0Var = new ba.m0(w0Var2, str, aVar, i10, 3);
            p1VarR.f24421d = m0Var;
        }
    }

    public static final void d(w0 w0Var, bg.p pVar, ic.k kVar, ic.k kVar2, x0.o oVar, int i10) {
        int i11;
        w0 w0Var2;
        bg.p pVar2;
        ic.k kVar3;
        ic.k kVar4;
        x0.o oVar2;
        jc.l.e(w0Var, "show");
        jc.l.e(pVar, "playlist");
        jc.l.e(kVar2, "onConfirm");
        oVar.Y(-47873522);
        if ((i10 & 6) == 0) {
            i11 = (oVar.f(w0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.h(pVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar.h(kVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= oVar.h(kVar2) ? 2048 : 1024;
        }
        if (oVar.N(i11 & 1, (i11 & 1171) != 1170)) {
            oVar2 = oVar;
            f(w0Var, pVar, kVar, kVar2, oVar2, i11 & 8190, 0);
            w0Var2 = w0Var;
            pVar2 = pVar;
            kVar3 = kVar;
            kVar4 = kVar2;
        } else {
            w0Var2 = w0Var;
            pVar2 = pVar;
            kVar3 = kVar;
            kVar4 = kVar2;
            oVar2 = oVar;
            oVar2.Q();
        }
        p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ba.f0(w0Var2, pVar2, kVar3, kVar4, i10, 2);
        }
    }

    public static final void e(w0 w0Var, ic.k kVar, x0.o oVar, int i10) {
        int i11;
        w0 w0Var2;
        ic.k kVar2;
        x0.o oVar2;
        jc.l.e(w0Var, "show");
        jc.l.e(kVar, "onConfirm");
        oVar.Y(813405711);
        if ((i10 & 6) == 0) {
            i11 = (oVar.f(w0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = i11 | (oVar.h(kVar) ? 32 : 16);
        if (oVar.N(i12 & 1, (i12 & 19) != 18)) {
            w0Var2 = w0Var;
            kVar2 = kVar;
            oVar2 = oVar;
            f(w0Var2, null, null, kVar2, oVar2, (i12 & 14) | ((i12 << 6) & 7168), 6);
        } else {
            w0Var2 = w0Var;
            kVar2 = kVar;
            oVar2 = oVar;
            oVar2.Q();
        }
        p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new f1.b(w0Var2, kVar2, i10, 4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final x0.w0 r28, bg.p r29, ic.k r30, final ic.k r31, x0.o r32, final int r33, final int r34) {
        /*
            Method dump skipped, instruction units count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q9.w.f(x0.w0, bg.p, ic.k, ic.k, x0.o, int, int):void");
    }
}
