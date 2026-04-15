package q9;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.ui.ZIndexElement;
import androidx.lifecycle.x0;
import com.cnl.kikoeru.R;
import g2.v0;
import j2.l1;
import java.util.List;
import m0.b1;
import m0.c1;
import m0.g2;
import m0.h2;
import m0.s2;
import m0.t2;
import m0.y5;
import m0.z5;
import x0.e1;
import x0.j1;
import x0.n1;
import x0.p1;
import x0.w0;
import y.d1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f1.f f17928a = new f1.f(new m9.d(13), 22217658, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f1.f f17929b = new f1.f(new m9.d(14), -558682474, false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f1.f f17930c = new f1.f(new m9.d(15), -849327325, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f1.f f17931d = new f1.f(new m9.d(16), -605790462, false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f1.f f17932e = new f1.f(new la.k(15), 627777165, false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f1.f f17933f = new f1.f(new la.k(22), -1968671644, false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f1.f f17934g = new f1.f(new la.k(23), 1463882317, false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f1.f f17935h = new f1.f(new m9.d(17), -1116143146, false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final f1.f f17936i = new f1.f(new m9.d(18), 1022696727, false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final f1.f f17937j = new f1.f(new m9.d(19), 90527743, false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final f1.f f17938k = new f1.f(new m9.d(20), 1492367744, false);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final f1.f f17939l = new f1.f(new la.k(16), -706246011, false);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final f1.f f17940m = new f1.f(new la.k(17), 1188087875, false);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final f1.f f17941n = new f1.f(new m9.d(21), -1358067343, false);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final f1.f f17942o = new f1.f(new m9.d(22), 471138994, false);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final f1.f f17943p = new f1.f(new la.k(18), 747505510, false);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final f1.f f17944q = new f1.f(new la.k(19), -714882865, false);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final f1.f f17945r = new f1.f(new la.k(20), 240878418, false);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final f1.f f17946s = new f1.f(new la.k(21), -299551088, false);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final f1.f f17947t = new f1.f(new m9.d(23), -1812103028, false);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final f1.f f17948u = new f1.f(new m9.d(24), -1096189233, false);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final f1.f f17949v = new f1.f(new m9.d(25), 1923572379, false);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final f1.f f17950w = new f1.f(new m9.d(26), 1390794986, false);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final f1.f f17951x = new f1.f(new m9.d(27), -1537122797, false);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final f1.f f17952y = new f1.f(new m9.d(28), 215380220, false);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final f1.f f17953z = new f1.f(new m9.d(29), 562191205, false);
    public static final f1.f A = new f1.f(new la.k(24), 1940327923, false);
    public static final f1.f B = new f1.f(new la.k(25), 175741098, false);
    public static final f1.f C = new f1.f(new b(0), -1169704812, false);

    public static final void a(d1 d1Var, c0.z zVar, String str, x0.o oVar, int i10) {
        int i11;
        boolean z10;
        Object obj;
        w0 w0Var;
        x0.o oVar2 = oVar;
        jc.l.e(d1Var, "padding");
        jc.l.e(zVar, "state");
        oVar2.Y(-64483832);
        if ((i10 & 6) == 0) {
            i11 = (oVar2.f(d1Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar2.f(zVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar2.f(str) ? 256 : 128;
        }
        if (oVar2.N(i11 & 1, (i11 & 147) != 146)) {
            x0 x0VarA = j4.a.a(oVar2);
            if (x0VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            i4.b bVarC = x0VarA instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) x0VarA).c() : i4.a.f9001b;
            jc.a0 a0Var = jc.z.f10839a;
            yb.c cVar = null;
            final o oVar3 = (o) g8.a.w(x0VarA, a0Var.b(o.class), null, bVarC);
            x0 x0VarA2 = j4.a.a(oVar2);
            if (x0VarA2 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            final r0 r0Var = (r0) g8.a.w(x0VarA2, a0Var.b(r0.class), null, x0VarA2 instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) x0VarA2).c() : i4.a.f9001b);
            j7.b bVarA = j7.d.a((lf.f) oVar3.f18053b.getValue(), oVar2);
            Object objK = oVar2.K();
            x0.r0 r0Var2 = x0.k.f24334a;
            if (objK == r0Var2) {
                objK = x0.v.m(oVar2);
                oVar2.h0(objK);
            }
            final hf.y yVar = (hf.y) objK;
            Object objK2 = oVar2.K();
            if (objK2 == r0Var2) {
                objK2 = x0.v.v(Boolean.FALSE);
                oVar2.h0(objK2);
            }
            final w0 w0Var2 = (w0) objK2;
            boolean zBooleanValue = ((Boolean) w0Var2.getValue()).booleanValue();
            boolean zH = oVar2.h(yVar) | oVar2.h(oVar3) | oVar2.h(r0Var);
            Object objK3 = oVar2.K();
            if (zH || objK3 == r0Var2) {
                z10 = zBooleanValue;
                final int i12 = 0;
                obj = new ic.a() { // from class: q9.d
                    @Override // ic.a
                    public final Object b() {
                        switch (i12) {
                            case 0:
                                hf.a0.y(yVar, null, null, new j(oVar3, r0Var, w0Var2, null, 1), 3);
                                break;
                            default:
                                hf.a0.y(yVar, null, null, new j(oVar3, r0Var, w0Var2, null, 0), 3);
                                break;
                        }
                        return ub.a0.f21526a;
                    }
                };
                oVar2.h0(obj);
            } else {
                obj = objK3;
                z10 = zBooleanValue;
            }
            t0.j jVarY = n7.e.y(z10, (ic.a) obj, oVar2);
            boolean zH2 = oVar2.h(oVar3) | oVar2.h(r0Var);
            Object objK4 = oVar2.K();
            if (zH2 || objK4 == r0Var2) {
                objK4 = new i(oVar3, r0Var, null, 0);
                oVar2.h0(objK4);
            }
            ub.a0 a0Var2 = ub.a0.f21526a;
            x0.v.e((ic.n) objK4, a0Var2, oVar2);
            bg.p pVarW = r0Var.w();
            boolean zH3 = oVar2.h(oVar3) | oVar2.h(r0Var);
            Object objK5 = oVar2.K();
            if (zH3 || objK5 == r0Var2) {
                objK5 = new i(oVar3, r0Var, null, 1);
                oVar2.h0(objK5);
            }
            x0.v.e((ic.n) objK5, pVarW, oVar2);
            boolean zH4 = ((i11 & 896) == 256) | oVar2.h(r0Var);
            Object objK6 = oVar2.K();
            if (zH4 || objK6 == r0Var2) {
                objK6 = new q.q(str, r0Var, cVar, 1);
                oVar2.h0(objK6);
            }
            x0.v.e((ic.n) objK6, a0Var2, oVar2);
            j1.q qVarW = n7.d.w(androidx.compose.foundation.layout.a.i(androidx.compose.foundation.layout.c.f557c, d1Var), jVarY);
            v0 v0VarD = y.p.d(j1.c.f9662a, false);
            int iQ = x0.v.q(oVar2);
            j1 j1VarL = oVar2.l();
            j1.q qVarC = j1.a.c(qVarW, oVar2);
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
                j2.h0.s(iQ, oVar2, iQ, hVar);
            }
            x0.v.A(i2.j.f8735d, qVarC, oVar2);
            boolean zH5 = oVar2.h(yVar) | oVar2.h(oVar3) | oVar2.h(r0Var);
            Object objK7 = oVar2.K();
            if (zH5 || objK7 == r0Var2) {
                final int i13 = 1;
                ic.a aVar = new ic.a() { // from class: q9.d
                    @Override // ic.a
                    public final Object b() {
                        switch (i13) {
                            case 0:
                                hf.a0.y(yVar, null, null, new j(oVar3, r0Var, w0Var2, null, 1), 3);
                                break;
                            default:
                                hf.a0.y(yVar, null, null, new j(oVar3, r0Var, w0Var2, null, 0), 3);
                                break;
                        }
                        return ub.a0.f21526a;
                    }
                };
                w0Var = w0Var2;
                oVar2.h0(aVar);
                objK7 = aVar;
            } else {
                w0Var = w0Var2;
            }
            ic.a aVar2 = (ic.a) objK7;
            boolean zH6 = oVar2.h(yVar) | oVar2.h(bVarA);
            Object objK8 = oVar2.K();
            if (zH6 || objK8 == r0Var2) {
                objK8 = new e(yVar, bVarA, w0Var, 0);
                oVar2.h0(objK8);
            }
            ka.b.d(bVarA, aVar2, (ic.a) objK8, oVar2, 8, 0);
            Object objK9 = oVar2.K();
            if (objK9 == r0Var2) {
                objK9 = x0.v.v(0L);
                oVar2.h0(objK9);
            }
            w0 w0Var3 = (w0) objK9;
            Object objK10 = oVar2.K();
            if (objK10 == r0Var2) {
                objK10 = x0.v.v(Boolean.FALSE);
                oVar2.h0(objK10);
            }
            w0 w0Var4 = (w0) objK10;
            da.a.f(((Number) w0Var3.getValue()).longValue(), w0Var4, oVar2, 48);
            Object objK11 = oVar2.K();
            if (objK11 == r0Var2) {
                wb.b bVarL = ud.b.l();
                if (g9.a.b()) {
                    bVarL.add(new la.x0(pc.f0.D(), na.q.g(R.string.add_to_playlist)));
                }
                objK11 = ud.b.g(bVarL);
                oVar2.h0(objK11);
            }
            List list = (List) objK11;
            Object objK12 = oVar2.K();
            if (objK12 == r0Var2) {
                objK12 = new ba.s0(w0Var4, w0Var3, 3, (byte) 0);
                oVar2.h0(objK12);
            }
            la.l.d(bVarA, zVar, null, null, 0.0f, null, null, list, null, (ic.n) objK12, oVar, 8 | (i11 & 112), 6, 892);
            oVar2 = oVar;
            t0.f.b(((Boolean) w0Var.getValue()).booleanValue(), jVarY, androidx.compose.foundation.layout.b.f554a.a(j1.n.f9689a, j1.c.f9663b), 0L, 0L, oVar2, 64);
            oVar2.p(true);
        } else {
            oVar2.Q();
        }
        p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new f1.c(i10, 8, d1Var, zVar, str);
        }
    }

    public static final void b(int i10, x0.o oVar) {
        oVar.Y(1213011302);
        if (oVar.N(i10 & 1, i10 != 0)) {
            x0 x0VarA = j4.a.a(oVar);
            if (x0VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            i4.b bVarC = x0VarA instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) x0VarA).c() : i4.a.f9001b;
            jc.a0 a0Var = jc.z.f10839a;
            o oVar2 = (o) g8.a.w(x0VarA, a0Var.b(o.class), null, bVarC);
            x0 x0VarA2 = j4.a.a(oVar);
            if (x0VarA2 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            r0 r0Var = (r0) g8.a.w(x0VarA2, a0Var.b(r0.class), null, x0VarA2 instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) x0VarA2).c() : i4.a.f9001b);
            Object objK = oVar.K();
            Object obj = x0.k.f24334a;
            if (objK == obj) {
                objK = x0.v.m(oVar);
                oVar.h0(objK);
            }
            hf.y yVar = (hf.y) objK;
            Object objK2 = oVar.K();
            if (objK2 == obj) {
                objK2 = (String) pc.f0.P(gg.c.a(), "username", "", jc.z.a(String.class)).a();
                oVar.h0(objK2);
            }
            String str = (String) objK2;
            y.v vVarA = y.u.a(y.k.f25158c, j1.c.f9674m, oVar, 0);
            int iQ = x0.v.q(oVar);
            j1 j1VarL = oVar.l();
            j1.q qVarD = j1.n.f9689a;
            j1.q qVarC = j1.a.c(qVarD, oVar);
            i2.k.f8771g0.getClass();
            ic.a aVar = i2.j.f8733b;
            oVar.a0();
            if (oVar.S) {
                oVar.k(aVar);
            } else {
                oVar.k0();
            }
            i2.h hVar = i2.j.f8738g;
            x0.v.A(hVar, vVarA, oVar);
            i2.h hVar2 = i2.j.f8737f;
            x0.v.A(hVar2, j1VarL, oVar);
            i2.h hVar3 = i2.j.f8741j;
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                j2.h0.s(iQ, oVar, iQ, hVar3);
            }
            i2.h hVar4 = i2.j.f8735d;
            x0.v.A(hVar4, qVarC, oVar);
            bg.p pVarW = r0Var.w();
            if (g9.a.b()) {
                oVar.W(-1425115752);
                boolean zH = oVar.h(yVar) | oVar.h(r0Var);
                Object objK3 = oVar.K();
                if (zH || objK3 == obj) {
                    objK3 = new c(1, yVar, r0Var);
                    oVar.h0(objK3);
                }
                qVarD = androidx.compose.foundation.a.d(qVarD, null, (ic.a) objK3, 7);
                oVar.p(false);
            } else {
                oVar.W(-1425116924);
                oVar.p(false);
            }
            ka.b.i(f1.g.f(-1538803545, new f(pVarW, 0), oVar), f1.g.f(-272845871, new g(pVarW, oVar2, str, yVar, r0Var, 0), oVar), 0L, 0L, 0.0f, qVarD, oVar, 390, 58);
            HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(j1.c.f9676o);
            v0 v0VarD = y.p.d(j1.c.f9662a, false);
            int iQ2 = x0.v.q(oVar);
            j1 j1VarL2 = oVar.l();
            j1.q qVarC2 = j1.a.c(horizontalAlignElement, oVar);
            oVar.a0();
            if (oVar.S) {
                oVar.k(aVar);
            } else {
                oVar.k0();
            }
            x0.v.A(hVar, v0VarD, oVar);
            x0.v.A(hVar2, j1VarL2, oVar);
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ2))) {
                j2.h0.s(iQ2, oVar, iQ2, hVar3);
            }
            x0.v.A(hVar4, qVarC2, oVar);
            fg.f fVar = oVar2.f18056e;
            fg.f fVar2 = oVar2.f18057f;
            e1 e1Var = oVar2.f18058g;
            boolean zBooleanValue = ((Boolean) oVar2.f18055d.getValue()).booleanValue();
            boolean zH2 = oVar.h(oVar2);
            Object objK4 = oVar.K();
            if (zH2 || objK4 == obj) {
                objK4 = new h(oVar2, 0);
                oVar.h0(objK4);
            }
            m0.b0.a(zBooleanValue, (ic.a) objK4, null, 0L, null, null, f1.g.f(1415110421, new g(fVar2, oVar2, pVarW, e1Var, fVar), oVar), oVar, 1572864, 60);
            oVar.p(true);
            oVar.p(true);
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new b(i10, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final w1.f r22, final java.lang.String r23, java.lang.String r24, final boolean r25, int r26, final ic.a r27, boolean r28, ic.a r29, boolean r30, ic.a r31, ic.a r32, x0.o r33, final int r34, final int r35, final int r36) {
        /*
            Method dump skipped, instruction units count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q9.a.c(w1.f, java.lang.String, java.lang.String, boolean, int, ic.a, boolean, ic.a, boolean, ic.a, ic.a, x0.o, int, int, int):void");
    }

    public static final void d(r0 r0Var, j1.q qVar, x0.o oVar, int i10) {
        r0 r0Var2;
        j1.q qVar2;
        x0.o oVar2 = oVar;
        oVar2.Y(-1525430838);
        int i11 = (oVar2.h(r0Var) ? 4 : 2) | i10 | 432;
        if (oVar2.N(i11 & 1, (i11 & 147) != 146)) {
            Object objK = oVar2.K();
            x0.r0 r0Var3 = x0.k.f24334a;
            if (objK == r0Var3) {
                objK = (String) pc.f0.P(gg.c.a(), "username", "", jc.z.a(String.class)).a();
                oVar2.h0(objK);
            }
            String str = (String) objK;
            j7.b bVarA = j7.d.a(new lf.s((lf.f) r0Var.f18086c.getValue(), str, 4), oVar2);
            Object objK2 = oVar2.K();
            if (objK2 == r0Var3) {
                objK2 = x0.v.m(oVar2);
                oVar2.h0(objK2);
            }
            hf.y yVar = (hf.y) objK2;
            Object objK3 = oVar2.K();
            if (objK3 == r0Var3) {
                objK3 = x0.v.v(Boolean.FALSE);
                oVar2.h0(objK3);
            }
            w0 w0Var = (w0) objK3;
            boolean zBooleanValue = ((Boolean) w0Var.getValue()).booleanValue();
            boolean zH = oVar2.h(yVar) | oVar2.h(r0Var);
            Object objK4 = oVar2.K();
            if (zH || objK4 == r0Var3) {
                objK4 = new ba.c((Object) yVar, (Object) r0Var, w0Var, 20);
                oVar2.h0(objK4);
            }
            t0.j jVarY = n7.e.y(zBooleanValue, (ic.a) objK4, oVar2);
            j1.n nVar = j1.n.f9689a;
            j1.q qVarE = n7.d.w(androidx.compose.foundation.layout.c.c(nVar, 1.0f), jVarY).e(nVar);
            v0 v0VarD = y.p.d(j1.c.f9662a, false);
            int iQ = x0.v.q(oVar2);
            j1 j1VarL = oVar2.l();
            j1.q qVarC = j1.a.c(qVarE, oVar2);
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
                j2.h0.s(iQ, oVar2, iQ, hVar);
            }
            x0.v.A(i2.j.f8735d, qVarC, oVar2);
            boolean zH2 = oVar2.h(yVar) | oVar2.h(bVarA);
            Object objK5 = oVar2.K();
            if (zH2 || objK5 == r0Var3) {
                objK5 = new e(yVar, bVarA, w0Var, 1);
                oVar2.h0(objK5);
            }
            ka.b.d(bVarA, null, (ic.a) objK5, oVar2, 8, 2);
            boolean zH3 = oVar2.h(r0Var) | oVar2.h(yVar) | oVar2.h(bVarA);
            Object objK6 = oVar2.K();
            if (zH3 || objK6 == r0Var3) {
                h7.d dVar = new h7.d(bVarA, r0Var, yVar, str, 1);
                r0Var2 = r0Var;
                oVar2.h0(dVar);
                objK6 = dVar;
            } else {
                r0Var2 = r0Var;
            }
            qVar2 = nVar;
            a.a.g(0, 511, null, (ic.k) objK6, null, null, null, null, oVar, null, null, false);
            t0.f.b(((Boolean) w0Var.getValue()).booleanValue(), jVarY, androidx.compose.foundation.layout.b.f554a.a(qVar2, j1.c.f9663b), 0L, 0L, oVar, 64);
            oVar2 = oVar;
            oVar2.p(true);
        } else {
            r0Var2 = r0Var;
            oVar2.Q();
            qVar2 = qVar;
        }
        p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ba.h0(r0Var2, qVar2, i10, 19);
        }
    }

    public static final void e(final boolean z10, final f1.f fVar, x0.o oVar, final int i10) {
        p1 p1VarR;
        ic.n nVar;
        oVar.Y(1339670782);
        int i11 = (oVar.g(z10) ? 4 : 2) | i10;
        if (!oVar.N(i11 & 1, (i11 & 19) != 18)) {
            oVar.Q();
        } else {
            if (!g9.a.b()) {
                oVar.W(1296278364);
                fVar.q(oVar, 6);
                oVar.p(false);
                p1VarR = oVar.r();
                if (p1VarR != null) {
                    final int i12 = 0;
                    nVar = new ic.n(z10, fVar, i10, i12) { // from class: q9.b0

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f17969a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ boolean f17970b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ f1.f f17971c;

                        {
                            this.f17969a = i12;
                        }

                        @Override // ic.n
                        public final Object q(Object obj, Object obj2) {
                            int i13 = this.f17969a;
                            x0.o oVar2 = (x0.o) obj;
                            ((Integer) obj2).getClass();
                            switch (i13) {
                                case 0:
                                    a.e(this.f17970b, this.f17971c, oVar2, x0.v.D(49));
                                    break;
                                default:
                                    a.e(this.f17970b, this.f17971c, oVar2, x0.v.D(49));
                                    break;
                            }
                            return ub.a0.f21526a;
                        }
                    };
                    p1VarR.f24421d = nVar;
                }
                return;
            }
            oVar.W(1293568964);
            oVar.p(false);
            x0 x0VarA = j4.a.a(oVar);
            if (x0VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            r0 r0Var = (r0) g8.a.w(x0VarA, jc.z.f10839a.b(r0.class), null, x0VarA instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) x0VarA).c() : i4.a.f9001b);
            t2 t2Var = r0Var.f18085b;
            Object objK = oVar.K();
            if (objK == x0.k.f24334a) {
                objK = x0.v.m(oVar);
                oVar.h0(objK);
            }
            g(f1.g.f(-526369139, new c0(0, (hf.y) objK, r0Var), oVar), new ZIndexElement(2.0f), t2Var, z10, null, 0.0f, 0L, 0L, 0L, fVar, oVar, ((i11 << 9) & 7168) | 805306422);
        }
        p1VarR = oVar.r();
        if (p1VarR != null) {
            final int i13 = 1;
            nVar = new ic.n(z10, fVar, i10, i13) { // from class: q9.b0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f17969a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f17970b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ f1.f f17971c;

                {
                    this.f17969a = i13;
                }

                @Override // ic.n
                public final Object q(Object obj, Object obj2) {
                    int i132 = this.f17969a;
                    x0.o oVar2 = (x0.o) obj;
                    ((Integer) obj2).getClass();
                    switch (i132) {
                        case 0:
                            a.e(this.f17970b, this.f17971c, oVar2, x0.v.D(49));
                            break;
                        default:
                            a.e(this.f17970b, this.f17971c, oVar2, x0.v.D(49));
                            break;
                    }
                    return ub.a0.f21526a;
                }
            };
            p1VarR.f24421d = nVar;
        }
    }

    public static final void f(final w0 w0Var, final bg.p pVar, x0.o oVar, final int i10) {
        int i11;
        jc.l.e(w0Var, "show");
        jc.l.e(pVar, "playlist");
        oVar.Y(-735641910);
        if ((i10 & 6) == 0) {
            i11 = (oVar.f(w0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.h(pVar) ? 32 : 16;
        }
        if (!oVar.N(i11 & 1, (i11 & 19) != 18)) {
            oVar.Q();
        } else {
            if (!((Boolean) w0Var.getValue()).booleanValue()) {
                p1 p1VarR = oVar.r();
                if (p1VarR != null) {
                    final int i12 = 0;
                    p1VarR.f24421d = new ic.n() { // from class: q9.g0
                        @Override // ic.n
                        public final Object q(Object obj, Object obj2) {
                            int i13 = i12;
                            x0.o oVar2 = (x0.o) obj;
                            ((Integer) obj2).intValue();
                            switch (i13) {
                                case 0:
                                    a.f(w0Var, pVar, oVar2, x0.v.D(i10 | 1));
                                    break;
                                default:
                                    a.f(w0Var, pVar, oVar2, x0.v.D(i10 | 1));
                                    break;
                            }
                            return ub.a0.f21526a;
                        }
                    };
                    return;
                }
                return;
            }
            boolean z10 = (i11 & 14) == 4;
            Object objK = oVar.K();
            if (z10 || objK == x0.k.f24334a) {
                objK = new ma.c(w0Var, 17);
                oVar.h0(objK);
            }
            a2.c.c((ic.a) objK, f1.g.f(618165010, new ba.h0(20, pVar, w0Var), oVar), null, C, f1.g.f(-2063639723, new f(pVar, 2), oVar), null, 0L, 0L, null, oVar, 27696, 484);
        }
        p1 p1VarR2 = oVar.r();
        if (p1VarR2 != null) {
            final int i13 = 1;
            p1VarR2.f24421d = new ic.n() { // from class: q9.g0
                @Override // ic.n
                public final Object q(Object obj, Object obj2) {
                    int i132 = i13;
                    x0.o oVar2 = (x0.o) obj;
                    ((Integer) obj2).intValue();
                    switch (i132) {
                        case 0:
                            a.f(w0Var, pVar, oVar2, x0.v.D(i10 | 1));
                            break;
                        default:
                            a.f(w0Var, pVar, oVar2, x0.v.D(i10 | 1));
                            break;
                    }
                    return ub.a0.f21526a;
                }
            };
        }
    }

    public static final void g(f1.f fVar, j1.q qVar, t2 t2Var, boolean z10, q1.l0 l0Var, float f10, long j10, long j11, long j12, f1.f fVar2, x0.o oVar, int i10) {
        int i11;
        t2 t2Var2;
        boolean z11;
        x0.o oVar2;
        q1.l0 l0Var2;
        float f11;
        long j13;
        long j14;
        long j15;
        q1.l0 l0Var3;
        long jI;
        long jA;
        int i12;
        float f12;
        long j16;
        int i13;
        q1.l0 l0Var4;
        float f13;
        long j17;
        long j18;
        oVar.Y(1548390135);
        if ((i10 & 6) == 0) {
            i11 = (oVar.h(fVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.f(qVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            t2Var2 = t2Var;
            i11 |= oVar.f(t2Var2) ? 256 : 128;
        } else {
            t2Var2 = t2Var;
        }
        if ((i10 & 3072) == 0) {
            z11 = z10;
            i11 |= oVar.g(z11) ? 2048 : 1024;
        } else {
            z11 = z10;
        }
        if ((i10 & 24576) == 0) {
            i11 |= 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= 4194304;
        }
        if ((100663296 & i10) == 0) {
            i11 |= 33554432;
        }
        if ((805306368 & i10) == 0) {
            i11 |= oVar.h(fVar2) ? 536870912 : 268435456;
        }
        if (oVar.N(i11 & 1, (306783379 & i11) != 306783378)) {
            oVar.S();
            if ((i10 & 1) == 0 || oVar.x()) {
                l0Var3 = ((y5) oVar.j(z5.f13997a)).f13963c;
                float f14 = g2.f13014a;
                jI = ((b1) oVar.j(c1.f12773a)).i();
                long jB = c1.b(jI, oVar);
                jA = g2.a(oVar);
                i12 = i11 & (-268427265);
                f12 = f14;
                j16 = jB;
            } else {
                oVar.Q();
                i12 = i11 & (-268427265);
                l0Var3 = l0Var;
                f12 = f10;
                jI = j10;
                j16 = j11;
                jA = j12;
            }
            oVar.q();
            Object objK = oVar.K();
            if (objK == x0.k.f24334a) {
                i13 = i12;
                objK = lc.b.G("leftDrawer", Boolean.FALSE, gg.c.a(), true, jc.z.a(Boolean.TYPE));
                oVar.h0(objK);
            } else {
                i13 = i12;
            }
            if (((Boolean) ((fg.f) objK).getValue()).booleanValue()) {
                oVar.W(142420921);
                t2 t2Var3 = t2Var2;
                boolean z12 = z11;
                l0Var4 = l0Var3;
                f13 = f12;
                j17 = jI;
                j18 = jA;
                s2.a(fVar, qVar, t2Var3, z12, l0Var4, f13, j17, j16, j18, fVar2, oVar, i13 & 2147483646);
                oVar2 = oVar;
                oVar2.p(false);
            } else {
                q1.l0 l0Var5 = l0Var3;
                float f15 = f12;
                long j19 = jI;
                oVar2 = oVar;
                long j20 = jA;
                oVar2.W(142733525);
                n1 n1VarA = l1.f9872n.a(f3.m.f6668b);
                long j21 = j16;
                t0 t0Var = new t0(qVar, t2Var, z10, l0Var5, f15, j19, j21, j20, fVar, fVar2);
                l0Var4 = l0Var5;
                f13 = f15;
                j17 = j19;
                j16 = j21;
                j18 = j20;
                x0.v.a(n1VarA, f1.g.f(-512372279, t0Var, oVar2), oVar2, 56);
                oVar2.p(false);
            }
            j15 = j18;
            j14 = j16;
            j13 = j17;
            f11 = f13;
            l0Var2 = l0Var4;
        } else {
            oVar2 = oVar;
            oVar2.Q();
            l0Var2 = l0Var;
            f11 = f10;
            j13 = j10;
            j14 = j11;
            j15 = j12;
        }
        p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new h2(fVar, qVar, t2Var, z10, l0Var2, f11, j13, j14, j15, fVar2, i10);
        }
    }
}
