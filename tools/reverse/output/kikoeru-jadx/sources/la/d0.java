package la;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bg.a2;
import com.cnl.kikoeru.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import m0.z8;
import q.l1;
import q.m1;
import x0.j1;
import x0.o2;
import x0.p1;
import y.i1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ka.h f11936a = new ka.h(11);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f11937b = ja.a.f10794k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f11938c = ja.a.f10790g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f11939d = ja.a.f10792i;

    public static final void a(a2 a2Var, j1.q qVar, List list, ic.a aVar, ic.n nVar, x0.o oVar, int i10) {
        oVar.Y(1118529475);
        int i11 = i10 | (oVar.h(a2Var) ? 4 : 2) | (oVar.f(qVar) ? 32 : 16) | (oVar.h(list) ? 256 : 128) | (oVar.g(false) ? 2048 : 1024) | (oVar.h(aVar) ? 16384 : 8192) | (oVar.h(nVar) ? 131072 : 65536);
        if (oVar.N(i11 & 1, (74899 & i11) != 74898)) {
            c(a2Var, qVar, list, nVar, f1.g.f(-1713891106, new a9.p(a2Var, (m1) oVar.j(a9.u.f263a), aVar, 7), oVar), oVar, ((i11 >> 3) & 57344) | (i11 & 14) | 196608 | (i11 & 112) | (i11 & 896) | (i11 & 7168));
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new w(a2Var, qVar, list, aVar, nVar, i10, 1);
        }
    }

    public static final void b(a2 a2Var, j1.q qVar, j1.q qVar2, x0.o oVar, int i10) {
        int i11;
        j1.q qVar3;
        Integer numValueOf = Integer.valueOf(R.mipmap.enterface);
        oVar.Y(1466461841);
        if ((i10 & 6) == 0) {
            i11 = (oVar.h(a2Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            qVar3 = qVar;
            i11 |= oVar.f(qVar3) ? 32 : 16;
        } else {
            qVar3 = qVar;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar.f(qVar2) ? 256 : 128;
        }
        if (oVar.N(i11 & 1, (i11 & 147) != 146)) {
            g2.v0 v0VarD = y.p.d(j1.c.f9662a, false);
            int iQ = x0.v.q(oVar);
            j1 j1VarL = oVar.l();
            j1.q qVarC = j1.a.c(qVar2, oVar);
            i2.k.f8771g0.getClass();
            i2.i iVar = i2.j.f8733b;
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            x0.v.A(i2.j.f8738g, v0VarD, oVar);
            x0.v.A(i2.j.f8737f, j1VarL, oVar);
            i2.h hVar = i2.j.f8741j;
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                j2.h0.s(iQ, oVar, iQ, hVar);
            }
            x0.v.A(i2.j.f8735d, qVarC, oVar);
            s8.h hVar2 = new s8.h((Context) oVar.j(AndroidCompositionLocals_androidKt.f721b));
            hVar2.a("Bearer " + a9.i.f());
            hVar2.f19591c = a2Var.I;
            hVar2.f19605q = numValueOf;
            hVar2.f19606r = null;
            hVar2.f19607s = numValueOf;
            hVar2.f19608t = null;
            hVar2.f19603o = numValueOf;
            hVar2.f19604p = null;
            i8.n.b(hVar2.b(), a2Var.f2839v, a9.i.b(), qVar3, null, null, g2.o.f7245a, null, null, oVar, ((i11 << 6) & 7168) | 12582912, 0, 8048);
            x0.z zVar = z8.f14018a;
            x0.v.a(zVar.a(t2.l0.a((t2.l0) oVar.j(zVar), q1.q.f17571d, lc.b.C(11), null, null, null, 0L, null, null, 0L, null, null, 16777212)), f1.g.f(1610225495, new a9.r(9, a2Var), oVar), oVar, 56);
            oVar.p(true);
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new f1.c(i10, 4, a2Var, qVar, qVar2);
        }
    }

    public static final void c(a2 a2Var, j1.q qVar, List list, ic.n nVar, f1.f fVar, x0.o oVar, int i10) {
        int i11;
        Object obj;
        long jI;
        oVar.Y(-1011313356);
        if ((i10 & 6) == 0) {
            i11 = (oVar.h(a2Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.f(qVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar.h(list) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= oVar.g(false) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= oVar.h(nVar) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= oVar.h(fVar) ? 131072 : 65536;
        }
        if (oVar.N(i11 & 1, (74899 & i11) != 74898)) {
            e7.a0 a0Var = (e7.a0) oVar.j(a9.u.f265c);
            x0.w0 w0VarY = x0.v.y(a2Var, oVar);
            Object objK = oVar.K();
            Object obj2 = x0.k.f24334a;
            if (objK == obj2) {
                objK = x0.v.v(Boolean.FALSE);
                oVar.h0(objK);
            }
            x0.w0 w0Var = (x0.w0) objK;
            Object objK2 = oVar.K();
            if (objK2 == obj2) {
                obj = obj2;
                objK2 = x0.v.v(new b(((a2) w0VarY.getValue()).f2823f, ((a2) w0VarY.getValue()).f2839v, list, new ba.q0(8, nVar, w0VarY)));
                oVar.h0(objK2);
            } else {
                obj = obj2;
            }
            l.j(w0Var, (x0.w0) objK2, (a2) w0VarY.getValue(), false, null, oVar, (i11 & 7168) | 54, 16);
            Boolean bool = Boolean.FALSE;
            oVar.W(500600386);
            hg.a aVarA = gg.c.a();
            jc.y yVar = new jc.y();
            oVar.W(1849434622);
            Object objK3 = oVar.K();
            if (objK3 == obj) {
                objK3 = lc.b.G("cardBackgroundColor", bool, aVarA, true, jc.z.a(Boolean.TYPE));
                oVar.h0(objK3);
            }
            fg.f fVar2 = (fg.f) objK3;
            oVar.p(false);
            yVar.f10838a = fVar2;
            x0.v.c(fVar2, new a9.t(yVar, 1), oVar);
            fg.f fVar3 = (fg.f) yVar.f10838a;
            oVar.p(false);
            j1.q qVarC = androidx.compose.foundation.layout.c.c(qVar, 1.0f);
            boolean zH = oVar.h(a0Var) | oVar.f(w0VarY);
            Object objK4 = oVar.K();
            if (zH || objK4 == obj) {
                objK4 = new a0(a0Var, w0VarY, 0);
                oVar.h0(objK4);
            }
            ic.a aVar = (ic.a) objK4;
            Object objK5 = oVar.K();
            if (objK5 == obj) {
                objK5 = new aa.f(w0Var, 20);
                oVar.h0(objK5);
            }
            j1.q qVarF = androidx.compose.foundation.a.f(qVarC, (ic.a) objK5, aVar, aVar, 79);
            if (((Boolean) fVar3.getValue()).booleanValue()) {
                oVar.W(-1209493185);
                jI = q1.h0.l(q1.q.b(0.2f, h((a2) w0VarY.getValue(), oVar)), ((m0.b1) oVar.j(m0.c1.f12773a)).i());
                oVar.p(false);
            } else {
                oVar.W(-1209490725);
                jI = ((m0.b1) oVar.j(m0.c1.f12773a)).i();
                oVar.p(false);
            }
            g8.a.a(qVarF, null, jI, 0.0f, fVar, oVar, (i11 << 3) & 3670016, 58);
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new f1.d(a2Var, qVar, list, nVar, fVar, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [boolean, int] */
    public static final void d(a2 a2Var, j1.q qVar, boolean z10, ic.a aVar, ic.a aVar2, x0.o oVar, int i10, int i11) {
        j1.q qVar2;
        int i12;
        ic.a aVar3;
        int i13;
        j1.q qVar3;
        ic.a aVar4;
        x0.o oVar2;
        ?? r82;
        x0.o oVar3 = oVar;
        long j10 = a2Var.f2823f;
        oVar3.Y(-1337762708);
        int i14 = (oVar3.h(a2Var) ? 4 : 2) | i10;
        int i15 = i11 & 2;
        if (i15 != 0) {
            i12 = i14 | 48;
            qVar2 = qVar;
        } else {
            qVar2 = qVar;
            i12 = i14 | (oVar3.f(qVar2) ? 32 : 16);
        }
        if ((i10 & 384) == 0) {
            i12 |= oVar3.g(z10) ? 256 : 128;
        }
        int i16 = i12 | (oVar3.h(aVar) ? 2048 : 1024);
        int i17 = i11 & 16;
        if (i17 != 0) {
            i13 = i16 | 24576;
            aVar3 = aVar2;
        } else {
            aVar3 = aVar2;
            i13 = i16 | (oVar3.h(aVar3) ? 16384 : 8192);
        }
        int i18 = i13;
        if (oVar3.N(i18 & 1, (i13 & 9363) != 9362)) {
            j1.n nVar = j1.n.f9689a;
            j1.q qVar4 = i15 != 0 ? nVar : qVar2;
            ic.a aVar5 = i17 != 0 ? null : aVar3;
            m1 m1Var = (m1) oVar3.j(a9.u.f263a);
            j1.g gVar = j1.c.f9672k;
            j1.q qVarC = androidx.compose.foundation.layout.c.c(qVar4, 1.0f);
            y.j1 j1VarA = i1.a(y.k.f25156a, gVar, oVar3, 48);
            int iQ = x0.v.q(oVar3);
            j1 j1VarL = oVar3.l();
            j1.q qVarC2 = j1.a.c(qVarC, oVar3);
            i2.k.f8771g0.getClass();
            i2.i iVar = i2.j.f8733b;
            oVar3.a0();
            if (oVar3.S) {
                oVar3.k(iVar);
            } else {
                oVar3.k0();
            }
            i2.h hVar = i2.j.f8738g;
            x0.v.A(hVar, j1VarA, oVar3);
            i2.h hVar2 = i2.j.f8737f;
            x0.v.A(hVar2, j1VarL, oVar3);
            i2.h hVar3 = i2.j.f8741j;
            j1.q qVar5 = qVar4;
            if (oVar3.S || !jc.l.a(oVar3.K(), Integer.valueOf(iQ))) {
                j2.h0.s(iQ, oVar3, iQ, hVar3);
            }
            i2.h hVar4 = i2.j.f8735d;
            x0.v.A(hVar4, qVarC2, oVar3);
            oVar3.W(2142222969);
            j1.q qVarJ = androidx.compose.foundation.layout.c.j(nVar, 80);
            if (aVar5 != null) {
                oVar3.W(1859856657);
                boolean z11 = (i18 & 57344) == 16384;
                Object objK = oVar3.K();
                if (z11 || objK == x0.k.f24334a) {
                    objK = new ba.j(5, aVar5);
                    oVar3.h0(objK);
                }
                qVarJ = androidx.compose.foundation.a.d(qVarJ, null, (ic.a) objK, 7);
                r82 = 0;
                oVar3.p(false);
            } else {
                r82 = 0;
                oVar3.W(1859858487);
                oVar3.p(false);
            }
            oVar3.p(r82);
            l1 l1VarD = m1Var.d(r82, "cover-" + j10, oVar3);
            x0.m1 m1Var2 = a9.u.f264b;
            b(a2Var, qVarJ, q.t0.P(m1Var, l1VarD, (q.u) oVar3.j(m1Var2)), oVar3, i18 & 14);
            float f10 = 5;
            j1.q qVarJ2 = androidx.compose.foundation.layout.a.j(nVar, f10);
            ic.a aVar6 = aVar5;
            y.v vVarA = y.u.a(y.k.f25158c, j1.c.f9674m, oVar3, 0);
            int iQ2 = x0.v.q(oVar3);
            j1 j1VarL2 = oVar3.l();
            j1.q qVarC3 = j1.a.c(qVarJ2, oVar3);
            oVar3.a0();
            if (oVar3.S) {
                oVar3.k(iVar);
            } else {
                oVar3.k0();
            }
            x0.v.A(hVar, vVarA, oVar3);
            x0.v.A(hVar2, j1VarL2, oVar3);
            if (oVar3.S || !jc.l.a(oVar3.K(), Integer.valueOf(iQ2))) {
                j2.h0.s(iQ2, oVar3, iQ2, hVar3);
            }
            x0.v.A(hVar4, qVarC3, oVar3);
            z8.b(a2Var.f2839v, q.t0.P(m1Var, m1Var.d(0, j2.h0.i(j10, "title-"), oVar3), (q.u) oVar3.j(m1Var2)), ((m0.b1) oVar3.j(m0.c1.f12773a)).e(), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar, 0, 0, 131064);
            x0.o oVar4 = oVar;
            y.d.d(androidx.compose.foundation.layout.c.d(nVar, f10), oVar4);
            f(a2Var, q.t0.P(m1Var, m1Var.d(0, "tags-" + j10, oVar4), (q.u) oVar4.j(m1Var2)), z10, aVar, oVar4, i18 & 8078);
            oVar4.p(true);
            oVar4.p(true);
            qVar3 = qVar5;
            aVar4 = aVar6;
            oVar2 = oVar4;
        } else {
            oVar3.Q();
            qVar3 = qVar2;
            aVar4 = aVar3;
            oVar2 = oVar3;
        }
        p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new z(a2Var, qVar3, z10, aVar, aVar4, i10, i11);
        }
    }

    public static final void e(a2 a2Var, j1.q qVar, List list, ic.a aVar, ic.n nVar, x0.o oVar, int i10) {
        oVar.Y(-1368396580);
        int i11 = i10 | (oVar.h(a2Var) ? 4 : 2) | (oVar.f(qVar) ? 32 : 16) | (oVar.h(list) ? 256 : 128) | (oVar.g(false) ? 2048 : 1024) | (oVar.h(aVar) ? 16384 : 8192) | (oVar.h(nVar) ? 131072 : 65536);
        if (oVar.N(i11 & 1, (74899 & i11) != 74898)) {
            c(a2Var, qVar, list, nVar, f1.g.f(-1122666761, new fa.n(a2Var, aVar), oVar), oVar, ((i11 >> 3) & 57344) | (i11 & 14) | 196608 | (i11 & 112) | (i11 & 896) | (i11 & 7168));
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new w(a2Var, qVar, list, aVar, nVar, i10, 0);
        }
    }

    public static final void f(final a2 a2Var, j1.q qVar, final boolean z10, final ic.a aVar, x0.o oVar, int i10) {
        int i11;
        x0.w0 w0Var;
        oVar.Y(-555919031);
        if ((i10 & 6) == 0) {
            i11 = (oVar.h(a2Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.f(qVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= oVar.g(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= oVar.h(aVar) ? 2048 : 1024;
        }
        int i12 = i11;
        if (oVar.N(i12 & 1, (i12 & 1171) != 1170)) {
            e7.a0 a0Var = (e7.a0) oVar.j(a9.u.f265c);
            Object objK = oVar.K();
            x0.r0 r0Var = x0.k.f24334a;
            if (objK == r0Var) {
                objK = x0.v.v(Boolean.FALSE);
                oVar.h0(objK);
            }
            x0.w0 w0Var2 = (x0.w0) objK;
            Object objK2 = oVar.K();
            if (objK2 == r0Var) {
                objK2 = x0.v.v(new m());
                oVar.h0(objK2);
            }
            final x0.w0 w0Var3 = (x0.w0) objK2;
            int i13 = i12 << 3;
            l.j(w0Var2, w0Var3, (a2) x0.v.y(a2Var, oVar).getValue(), z10, aVar, oVar, (i13 & 57344) | (i13 & 7168) | 54, 0);
            Object objK3 = oVar.K();
            if (objK3 == r0Var) {
                objK3 = Build.VERSION.SDK_INT >= 24 ? LocaleList.getDefault().get(0).getLanguage() : Locale.getDefault().getLanguage();
                oVar.h0(objK3);
            }
            final String str = (String) objK3;
            u9.i[] iVarArrValues = u9.i.values();
            ArrayList arrayList = new ArrayList(iVarArrValues.length);
            int length = iVarArrValues.length;
            int i14 = 0;
            while (i14 < length) {
                u9.i iVar = iVarArrValues[i14];
                arrayList.add(new ub.k(iVar, Boolean.valueOf(iVar.f21484a)));
                i14++;
                a0Var = a0Var;
            }
            final e7.a0 a0Var2 = a0Var;
            xf.r rVar = na.w.f15765a;
            rVar.getClass();
            wf.y yVar = new wf.y("com.cnl.kikoeru.ui.screen.main.others.card.CardTags", u9.i.values());
            wf.g gVar = wf.g.f24118a;
            String strB = rVar.b(new wf.d(new wf.s0(yVar, gVar, 1), 0), arrayList);
            oVar.W(500600386);
            hg.a aVarA = gg.c.a();
            jc.y yVar2 = new jc.y();
            oVar.W(1849434622);
            Object objK4 = oVar.K();
            if (objK4 == r0Var) {
                w0Var = w0Var2;
                objK4 = lc.b.G("cardTagsOrder", strB, aVarA, true, jc.z.a(String.class));
                oVar.h0(objK4);
            } else {
                w0Var = w0Var2;
            }
            fg.f fVar = (fg.f) objK4;
            oVar.p(false);
            yVar2.f10838a = fVar;
            x0.v.c(fVar, new a9.t(yVar2, 2), oVar);
            fg.f fVar2 = (fg.f) yVar2.f10838a;
            oVar.p(false);
            Object objK5 = oVar.K();
            if (objK5 == r0Var) {
                objK5 = x0.v.v(rVar.a((String) fVar2.getValue(), new wf.d(new wf.s0(new wf.y("com.cnl.kikoeru.ui.screen.main.others.card.CardTags", u9.i.values()), gVar, 1), 0)));
                oVar.h0(objK5);
            }
            final x0.w0 w0Var4 = (x0.w0) objK5;
            float f10 = 5;
            final x0.w0 w0Var5 = w0Var;
            y.d.b(qVar, y.k.g(f10), y.k.g(f10), null, 0, 0, f1.g.f(1194649198, new ic.o() { // from class: la.b0
                /* JADX WARN: Removed duplicated region for block: B:136:0x04a6  */
                /* JADX WARN: Removed duplicated region for block: B:151:0x04cc  */
                /* JADX WARN: Removed duplicated region for block: B:157:0x04d7  */
                /* JADX WARN: Removed duplicated region for block: B:160:0x04ec A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:161:0x04ee  */
                /* JADX WARN: Removed duplicated region for block: B:165:0x0506  */
                /* JADX WARN: Removed duplicated region for block: B:171:0x0536  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x0201  */
                @Override // ic.o
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object g(java.lang.Object r23, java.lang.Object r24, java.lang.Object r25) {
                    /*
                        Method dump skipped, instruction units count: 1676
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: la.b0.g(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, oVar), oVar, ((i12 >> 3) & 14) | 1573296);
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new c0(a2Var, qVar, z10, aVar, i10);
        }
    }

    public static final void g(e7.a0 a0Var, bg.t tVar) {
        e7.a0.b(a0Var, "SearchScreen/" + na.w.k(tVar.name()) + "/" + na.w.k(tVar.f()));
    }

    public static final long h(a2 a2Var, x0.o oVar) {
        oVar.W(1523155544);
        String str = a2Var.A;
        boolean z10 = a2Var.f2828k;
        if (jc.l.a(str, "adult") || z10) {
            oVar.p(false);
            return f11937b;
        }
        if (jc.l.a(str, "r15")) {
            oVar.p(false);
            return f11938c;
        }
        if (jc.l.a(str, "general") || !z10) {
            oVar.p(false);
            return f11939d;
        }
        o2 o2Var = m0.c1.f12773a;
        long jL = q1.h0.l(q1.q.b(0.12f, ((m0.b1) oVar.j(o2Var)).e()), ((m0.b1) oVar.j(o2Var)).i());
        oVar.p(false);
        return jL;
    }
}
