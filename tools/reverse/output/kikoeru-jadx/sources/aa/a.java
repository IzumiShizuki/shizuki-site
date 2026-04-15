package aa;

import androidx.compose.foundation.BorderModifierNodeElement;
import com.cnl.kikoeru.R;
import hd.q0;
import i2.i;
import i2.j;
import j1.n;
import j2.h0;
import java.util.Iterator;
import java.util.List;
import jc.l;
import jc.z;
import m0.b1;
import m0.c1;
import m0.r3;
import m0.z8;
import n7.b0;
import pc.f0;
import q1.n0;
import q1.q;
import w1.g0;
import x0.k;
import x0.o;
import x0.p1;
import x0.r0;
import x0.v;
import x0.w0;
import y.i1;
import y.j1;
import y.u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f1.f f269a = new f1.f(new a9.a(3), 746929082, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f1.f f270b = new f1.f(new a9.a(4), 887776547, false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f1.f f271c = new f1.f(new b(0), 387215520, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f1.f f272d = new f1.f(new b(1), 1120495817, false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f1.f f273e = new f1.f(new b(2), -340074112, false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f1.f f274f = new f1.f(new b(3), -1297202584, false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f1.f f275g = new f1.f(new b(4), 1537194783, false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f1.f f276h = new f1.f(new b(5), 580066311, false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final f1.f f277i = new f1.f(new b(6), -1837632090, false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final f1.f f278j = new f1.f(new b(7), 1661030603, false);

    public static final void a(int i10, o oVar) {
        char c3;
        char c10;
        long j10;
        long jB;
        o oVar2 = oVar;
        oVar2.Y(-494462119);
        if (oVar2.N(i10 & 1, i10 != 0)) {
            w1.f fVarB = n7.d.f15440b;
            if (fVarB == null) {
                w1.e eVar = new w1.e("Filled.Android", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i11 = g0.f23208a;
                n0 n0Var = new n0(q.f17569b);
                q0 q0Var = new q0((byte) 0, 6);
                q0Var.u(17.6f, 9.48f);
                q0Var.t(1.84f, -3.18f);
                q0Var.n(0.16f, -0.31f, 0.04f, -0.69f, -0.26f, -0.85f);
                q0Var.n(-0.29f, -0.15f, -0.65f, -0.06f, -0.83f, 0.22f);
                q0Var.t(-1.88f, 3.24f);
                q0Var.n(-2.86f, -1.21f, -6.08f, -1.21f, -8.94f, 0.0f);
                q0Var.s(5.65f, 5.67f);
                q0Var.n(-0.19f, -0.29f, -0.58f, -0.38f, -0.87f, -0.2f);
                q0Var.m(4.5f, 5.65f, 4.41f, 6.01f, 4.56f, 6.3f);
                q0Var.s(6.4f, 9.48f);
                q0Var.m(3.3f, 11.25f, 1.28f, 14.44f, 1.0f, 18.0f);
                q0Var.r(22.0f);
                q0Var.m(22.72f, 14.44f, 20.7f, 11.25f, 17.6f, 9.48f);
                q0Var.l();
                q0Var.u(7.0f, 15.25f);
                q0Var.n(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f);
                q0Var.n(0.0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f);
                q0Var.v(8.25f, 13.31f, 8.25f, 14.0f);
                q0Var.m(8.25f, 14.69f, 7.69f, 15.25f, 7.0f, 15.25f);
                q0Var.l();
                q0Var.u(17.0f, 15.25f);
                q0Var.n(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f);
                q0Var.n(0.0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f);
                q0Var.w(1.25f, 0.56f, 1.25f, 1.25f);
                q0Var.m(18.25f, 14.69f, 17.69f, 15.25f, 17.0f, 15.25f);
                q0Var.l();
                w1.e.a(eVar, q0Var.f8447b, 0, n0Var);
                fVarB = eVar.b();
                n7.d.f15440b = fVarB;
            }
            ub.q qVar = new ub.q(fVarB, na.q.g(R.string.sync_with_system), "auto");
            w1.f fVarB2 = b0.f15429m;
            if (fVarB2 != null) {
                c3 = 1;
            } else {
                w1.e eVar2 = new w1.e("Filled.WbSunny", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i12 = g0.f23208a;
                n0 n0Var2 = new n0(q.f17569b);
                q0 q0Var2 = new q0((byte) 0, 6);
                c3 = 1;
                q0Var2.u(6.76f, 4.84f);
                q0Var2.t(-1.8f, -1.79f);
                q0Var2.t(-1.41f, 1.41f);
                q0Var2.t(1.79f, 1.79f);
                q0Var2.t(1.42f, -1.41f);
                q0Var2.l();
                q0Var2.u(4.0f, 10.5f);
                q0Var2.s(1.0f, 10.5f);
                q0Var2.z(2.0f);
                q0Var2.r(3.0f);
                q0Var2.z(-2.0f);
                q0Var2.l();
                q0Var2.u(13.0f, 0.55f);
                q0Var2.r(-2.0f);
                q0Var2.s(11.0f, 3.5f);
                q0Var2.r(2.0f);
                q0Var2.s(13.0f, 0.55f);
                q0Var2.l();
                q0Var2.u(20.45f, 4.46f);
                q0Var2.t(-1.41f, -1.41f);
                q0Var2.t(-1.79f, 1.79f);
                q0Var2.t(1.41f, 1.41f);
                q0Var2.t(1.79f, -1.79f);
                q0Var2.l();
                q0Var2.u(17.24f, 18.16f);
                q0Var2.t(1.79f, 1.8f);
                q0Var2.t(1.41f, -1.41f);
                q0Var2.t(-1.8f, -1.79f);
                q0Var2.t(-1.4f, 1.4f);
                q0Var2.l();
                q0Var2.u(20.0f, 10.5f);
                q0Var2.z(2.0f);
                q0Var2.r(3.0f);
                q0Var2.z(-2.0f);
                q0Var2.r(-3.0f);
                q0Var2.l();
                q0Var2.u(12.0f, 5.5f);
                q0Var2.n(-3.31f, 0.0f, -6.0f, 2.69f, -6.0f, 6.0f);
                q0Var2.w(2.69f, 6.0f, 6.0f, 6.0f);
                q0Var2.w(6.0f, -2.69f, 6.0f, -6.0f);
                q0Var2.w(-2.69f, -6.0f, -6.0f, -6.0f);
                q0Var2.l();
                q0Var2.u(11.0f, 22.45f);
                q0Var2.r(2.0f);
                q0Var2.s(13.0f, 19.5f);
                q0Var2.r(-2.0f);
                q0Var2.z(2.95f);
                q0Var2.l();
                q0Var2.u(3.55f, 18.54f);
                q0Var2.t(1.41f, 1.41f);
                q0Var2.t(1.79f, -1.8f);
                q0Var2.t(-1.41f, -1.41f);
                q0Var2.t(-1.79f, 1.8f);
                q0Var2.l();
                w1.e.a(eVar2, q0Var2.f8447b, 0, n0Var2);
                fVarB2 = eVar2.b();
                b0.f15429m = fVarB2;
            }
            ub.q qVar2 = new ub.q(fVarB2, na.q.g(R.string.dark_theme_day), "day");
            w1.f fVarB3 = nh.b.f15901h;
            if (fVarB3 != null) {
                c10 = 0;
            } else {
                w1.e eVar3 = new w1.e("Filled.NightsStay", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i13 = g0.f23208a;
                long j11 = q.f17569b;
                n0 n0Var3 = new n0(j11);
                q0 q0VarH = h0.h(11.1f, 12.08f);
                q0VarH.m(8.77f, 7.57f, 10.6f, 3.6f, 11.63f, 2.01f);
                q0VarH.m(6.27f, 2.2f, 1.98f, 6.59f, 1.98f, 12.0f);
                q0VarH.n(0.0f, 0.14f, 0.02f, 0.28f, 0.02f, 0.42f);
                q0VarH.m(2.62f, 12.15f, 3.29f, 12.0f, 4.0f, 12.0f);
                q0VarH.n(1.66f, 0.0f, 3.18f, 0.83f, 4.1f, 2.15f);
                q0VarH.m(9.77f, 14.63f, 11.0f, 16.17f, 11.0f, 18.0f);
                q0VarH.n(0.0f, 1.52f, -0.87f, 2.83f, -2.12f, 3.51f);
                q0VarH.n(0.98f, 0.32f, 2.03f, 0.5f, 3.11f, 0.5f);
                q0VarH.n(3.5f, 0.0f, 6.58f, -1.8f, 8.37f, -4.52f);
                q0VarH.m(18.0f, 17.72f, 13.38f, 16.52f, 11.1f, 12.08f);
                q0VarH.l();
                w1.e.a(eVar3, q0VarH.f8447b, 0, n0Var3);
                n0 n0Var4 = new n0(j11);
                q0 q0Var3 = new q0((byte) 0, 6);
                q0Var3.u(7.0f, 16.0f);
                q0Var3.t(-0.18f, 0.0f);
                q0Var3.m(6.4f, 14.84f, 5.3f, 14.0f, 4.0f, 14.0f);
                q0Var3.n(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
                q0Var3.w(1.34f, 3.0f, 3.0f, 3.0f);
                q0Var3.n(0.62f, 0.0f, 2.49f, 0.0f, 3.0f, 0.0f);
                q0Var3.n(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                q0Var3.m(9.0f, 16.9f, 8.1f, 16.0f, 7.0f, 16.0f);
                q0Var3.l();
                c10 = 0;
                w1.e.a(eVar3, q0Var3.f8447b, 0, n0Var4);
                fVarB3 = eVar3.b();
                nh.b.f15901h = fVarB3;
            }
            ub.q qVar3 = new ub.q(fVarB3, na.q.g(R.string.dark_theme_night), "night");
            ub.q[] qVarArr = new ub.q[3];
            qVarArr[c10] = qVar;
            qVarArr[c3] = qVar2;
            qVarArr[2] = qVar3;
            List listX = ud.b.x(qVarArr);
            Object objK = oVar2.K();
            r0 r0Var = k.f24334a;
            if (objK == r0Var) {
                objK = f0.P(gg.c.a(), "darkTheme", "auto", z.a(String.class));
                oVar2.h0(objK);
            }
            hg.b bVar = (hg.b) objK;
            Object objK2 = oVar2.K();
            if (objK2 == r0Var) {
                Iterator it = listX.iterator();
                int i14 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i14 = -1;
                        break;
                    } else if (l.a(((ub.q) it.next()).f21555c, bVar.a())) {
                        break;
                    } else {
                        i14++;
                    }
                }
                objK2 = v.v(Integer.valueOf(i14));
                oVar2.h0(objK2);
            }
            w0 w0Var = (w0) objK2;
            long jF = ((b1) oVar2.j(c1.f12773a)).f();
            long j12 = q.f17570c;
            n nVar = n.f9689a;
            float f10 = 5;
            float f11 = 10;
            j1.q qVarN = androidx.compose.foundation.layout.a.n(androidx.compose.foundation.layout.a.l(androidx.compose.foundation.layout.c.c(nVar, 1.0f), f10, 0.0f, 2), 0.0f, f11, 0.0f, 0.0f, 13);
            float f12 = f11;
            j1 j1VarA = i1.a(y.k.f25156a, j1.c.f9671j, oVar2, 0);
            int iQ = v.q(oVar2);
            x0.j1 j1VarL = oVar2.l();
            j1.q qVarC = j1.a.c(qVarN, oVar2);
            i2.k.f8771g0.getClass();
            i iVar = j.f8733b;
            oVar2.a0();
            if (oVar2.S) {
                oVar2.k(iVar);
            } else {
                oVar2.k0();
            }
            v.A(j.f8738g, j1VarA, oVar2);
            v.A(j.f8737f, j1VarL, oVar2);
            i2.h hVar = j.f8741j;
            if (oVar2.S || !l.a(oVar2.K(), Integer.valueOf(iQ))) {
                h0.s(iQ, oVar2, iQ, hVar);
            }
            v.A(j.f8735d, qVarC, oVar2);
            oVar2.W(807616729);
            Iterator it2 = listX.iterator();
            int i15 = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i16 = i15 + 1;
                if (i15 < 0) {
                    ud.b.H();
                    throw null;
                }
                ub.q qVar4 = (ub.q) next;
                w1.f fVar = (w1.f) qVar4.f21553a;
                String str = (String) qVar4.f21554b;
                long j13 = ((Number) w0Var.getValue()).intValue() == i15 ? jF : j12;
                Iterator it3 = it2;
                j1.q qVarL = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.layout.c.c(nVar, 1.0f / (3 - i15)), f10, 0.0f, 2);
                float f13 = 1;
                if (((Number) w0Var.getValue()).intValue() == i15) {
                    j10 = j12;
                    jB = jF;
                } else {
                    j10 = j12;
                    jB = q.b(0.2f, j12);
                }
                float f14 = f10;
                j1.q qVarK = gh.g.k(qVarL.e(new BorderModifierNodeElement(f13, new n0(jB), g0.g.a(f10))), g0.g.a(f14));
                boolean zD = oVar2.d(i15) | oVar2.h(bVar) | oVar2.f(listX);
                Object objK3 = oVar2.K();
                if (zD || objK3 == r0Var) {
                    objK3 = new h(i15, bVar, listX, w0Var);
                    oVar2.h0(objK3);
                }
                j1.q qVarJ = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.a.d(qVarK, null, (ic.a) objK3, 7), f12);
                y.v vVarA = u.a(y.k.f25158c, j1.c.f9674m, oVar2, 0);
                int iQ2 = v.q(oVar2);
                x0.j1 j1VarL2 = oVar2.l();
                j1.q qVarC2 = j1.a.c(qVarJ, oVar2);
                i2.k.f8771g0.getClass();
                i iVar2 = j.f8733b;
                oVar2.a0();
                if (oVar2.S) {
                    oVar2.k(iVar2);
                } else {
                    oVar2.k0();
                }
                v.A(j.f8738g, vVarA, oVar2);
                v.A(j.f8737f, j1VarL2, oVar2);
                i2.h hVar2 = j.f8741j;
                if (oVar2.S || !l.a(oVar2.K(), Integer.valueOf(iQ2))) {
                    h0.s(iQ2, oVar2, iQ2, hVar2);
                }
                v.A(j.f8735d, qVarC2, oVar2);
                float f15 = f12;
                long j14 = j13;
                r3.b(fVar, null, androidx.compose.foundation.layout.a.n(nVar, 0.0f, 0.0f, f15, 0.0f, 11), j14, oVar2, 432, 0);
                z8.b(str, null, j14, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar, 0, 0, 131066);
                oVar2 = oVar;
                oVar2.p(true);
                w0Var = w0Var;
                f12 = f15;
                i15 = i16;
                it2 = it3;
                j12 = j10;
                f10 = f14;
                nVar = nVar;
                listX = listX;
                r0Var = r0Var;
                bVar = bVar;
            }
            oVar2.p(false);
            oVar2.p(true);
        } else {
            oVar2.Q();
        }
        p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new a9.a(i10, 5);
        }
    }

    public static final void b(w0 w0Var, o oVar, int i10) {
        long j10;
        long jB;
        l.e(w0Var, "state");
        oVar.Y(49244484);
        if (oVar.N(i10 & 1, (i10 & 3) != 2)) {
            long jF = ((b1) oVar.j(c1.f12773a)).f();
            long j11 = q.f17570c;
            n nVar = n.f9689a;
            j1.q qVarJ = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.c(nVar, 1.0f), 10);
            j1 j1VarA = i1.a(y.k.f25156a, j1.c.f9671j, oVar, 0);
            int iQ = v.q(oVar);
            x0.j1 j1VarL = oVar.l();
            j1.q qVarC = j1.a.c(qVarJ, oVar);
            i2.k.f8771g0.getClass();
            i iVar = j.f8733b;
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            v.A(j.f8738g, j1VarA, oVar);
            v.A(j.f8737f, j1VarL, oVar);
            i2.h hVar = j.f8741j;
            if (oVar.S || !l.a(oVar.K(), Integer.valueOf(iQ))) {
                h0.s(iQ, oVar, iQ, hVar);
            }
            v.A(j.f8735d, qVarC, oVar);
            float f10 = 0;
            long j12 = ((Boolean) w0Var.getValue()).booleanValue() ? jF : j11;
            long j13 = q.f17574g;
            float f11 = 5;
            j1.q qVarN = androidx.compose.foundation.layout.a.n(androidx.compose.foundation.layout.c.c(nVar, 0.5f), 0.0f, 0.0f, f11, 0.0f, 11);
            float f12 = 1;
            if (((Boolean) w0Var.getValue()).booleanValue()) {
                j10 = jF;
                jB = j10;
            } else {
                j10 = jF;
                jB = q.b(0.2f, j11);
            }
            j1.q qVarE = qVarN.e(new BorderModifierNodeElement(f12, new n0(jB), g0.g.a(f11)));
            Object objK = oVar.K();
            r0 r0Var = k.f24334a;
            if (objK == r0Var) {
                objK = new f(w0Var, 0);
                oVar.h0(objK);
            }
            g8.a.b((ic.a) objK, qVarE, j13, j12, f10, f269a, oVar);
            long j14 = !((Boolean) w0Var.getValue()).booleanValue() ? j10 : j11;
            j1.q qVarE2 = androidx.compose.foundation.layout.a.n(androidx.compose.foundation.layout.c.c(nVar, 1.0f), f11, 0.0f, 0.0f, 0.0f, 14).e(new BorderModifierNodeElement(f12, new n0(!((Boolean) w0Var.getValue()).booleanValue() ? j10 : q.b(0.2f, j11)), g0.g.a(f11)));
            Object objK2 = oVar.K();
            if (objK2 == r0Var) {
                objK2 = new f(w0Var, 1);
                oVar.h0(objK2);
            }
            g8.a.b((ic.a) objK2, qVarE2, j13, j14, f10, f270b, oVar);
            oVar.p(true);
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new g(w0Var, i10, 0);
        }
    }

    public static final void c(int i10, o oVar) {
        o oVar2;
        oVar.Y(-1394950972);
        if (oVar.N(i10 & 1, i10 != 0)) {
            hg.a aVarA = gg.c.a();
            Object objK = oVar.K();
            if (objK == k.f24334a) {
                objK = new a9.n(19);
                oVar.h0(objK);
            }
            oVar2 = oVar;
            y8.c.c(aVarA, null, 0.0f, 0.0f, (ic.k) objK, oVar2, 24576);
        } else {
            oVar2 = oVar;
            oVar2.Q();
        }
        p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new a9.a(i10, 6);
        }
    }
}
