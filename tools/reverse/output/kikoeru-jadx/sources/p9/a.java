package p9;

import a9.p;
import android.os.Build;
import androidx.media3.exoplayer.offline.u;
import ba.c0;
import ba.h0;
import ba.j0;
import ba.k0;
import ba.y;
import c0.z;
import com.cnl.kikoeru.R;
import d0.i0;
import f1.g;
import hd.q0;
import j1.n;
import j1.q;
import java.util.ArrayList;
import java.util.List;
import jc.l;
import la.k;
import m0.b1;
import m0.c1;
import m0.r0;
import n7.b0;
import nd.h;
import q1.n0;
import u3.x0;
import ub.a0;
import w1.g0;
import w1.j;
import w1.r;
import w1.t;
import x0.o;
import x0.o2;
import x0.p1;
import x0.v;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f1.f f16930a = new f1.f(new m9.d(6), 227511946, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f1.f f16931b = new f1.f(new m9.d(7), -1586280757, false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f1.f f16932c = new f1.f(new k(11), -470955826, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f1.f f16933d = new f1.f(new m9.d(8), 894893836, false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f1.f f16934e = new f1.f(new k(12), -934583526, false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f1.f f16935f = new f1.f(new k(13), 454976657, false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f1.f f16936g = new f1.f(new k(14), -1241046702, false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f1.f f16937h = new f1.f(new m9.d(9), -1988651781, false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final f1.f f16938i = new f1.f(new m9.d(10), 1022404348, false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static boolean f16939j = true;

    public static final void a(List list, fg.f fVar, ic.k kVar, o oVar, int i10) {
        l.e(list, "pages");
        l.e(kVar, "onClickAgain");
        oVar.Y(-336890426);
        int i11 = (oVar.h(list) ? 4 : 2) | i10 | (oVar.h(kVar) ? 256 : 128);
        if (oVar.N(i11 & 1, (i11 & 147) != 146)) {
            q qVarN = y.d.n(n.f9689a);
            o2 o2Var = c1.f12773a;
            r0.a(qVarN, q1.q.b(0.8f, ((b1) oVar.j(o2Var)).i()), ((b1) oVar.j(o2Var)).f(), 0, g.f(-100188514, new b(list, fVar, kVar), oVar), oVar, 27648);
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new p(list, fVar, kVar, i10, 10);
        }
    }

    public static final void b(String str, o oVar, int i10) {
        Object obj;
        int i11;
        char c3;
        oVar.Y(1529424612);
        int i12 = i10 | (oVar.f(str) ? 4 : 2);
        if (oVar.N(i12 & 1, (i12 & 3) != 2)) {
            boolean zG = oVar.g(((Boolean) y.f2506a.getValue()).booleanValue());
            Object objK = oVar.K();
            Object obj2 = x0.k.f24334a;
            if (zG || objK == obj2) {
                objK = Boolean.valueOf(g9.a.b() && ((Boolean) a0.c.F(Boolean.TYPE, gg.c.a(), "homePageRecommend", Boolean.TRUE)).booleanValue());
                oVar.h0(objK);
            }
            Boolean bool = (Boolean) objK;
            final int i13 = bool.booleanValue() ? 3 : 1;
            c0[] c0VarArr = j0.f2395a;
            boolean zD = oVar.d(i13);
            Object objK2 = oVar.K();
            if (zD || objK2 == obj2) {
                objK2 = new ic.a() { // from class: ba.g0
                    @Override // ic.a
                    public final Object b() {
                        return Integer.valueOf(i13);
                    }
                };
                oVar.h0(objK2);
            }
            ic.a aVar = (ic.a) objK2;
            float f10 = d0.j0.f5359a;
            Object[] objArr = new Object[0];
            u uVar = d0.d.I;
            boolean zC = oVar.c(0.0f) | oVar.f(aVar);
            Object objK3 = oVar.K();
            if (zC || objK3 == obj2) {
                objK3 = new i0(0, aVar);
                oVar.h0(objK3);
            }
            d0.d dVar = (d0.d) g1.l.d(objArr, uVar, (ic.a) objK3, oVar, 0, 4);
            dVar.H.setValue(aVar);
            k0 k0Var = new k0(dVar, ud.b.x(lc.b.L(oVar), lc.b.L(oVar), lc.b.L(oVar)));
            z zVarL = lc.b.L(oVar);
            Object objK4 = oVar.K();
            if (objK4 == obj2) {
                objK4 = v.m(oVar);
                oVar.h0(objK4);
            }
            hf.y yVar = (hf.y) objK4;
            c(0, oVar);
            Object objK5 = oVar.K();
            if (objK5 == obj2) {
                objK5 = v.v(bool);
                oVar.h0(objK5);
            }
            w0 w0Var = (w0) objK5;
            Object objK6 = oVar.K();
            if (objK6 == obj2) {
                objK6 = new d(w0Var);
                oVar.h0(objK6);
            }
            d dVar2 = (d) objK6;
            Object objK7 = oVar.K();
            if (objK7 == obj2) {
                objK7 = lc.b.G("initialPage", 0, gg.c.a(), false, jc.z.a(Integer.TYPE));
                oVar.h0(objK7);
            }
            fg.f fVar = (fg.f) objK7;
            Object objK8 = oVar.K();
            if (objK8 == obj2) {
                w1.f fVarB = h.f15799m;
                if (fVarB == null) {
                    w1.e eVar = new w1.e("Filled.Widgets", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i14 = g0.f23208a;
                    n0 n0Var = new n0(q1.q.f17569b);
                    q0 q0Var = new q0((byte) 0, 6);
                    q0Var.u(13.0f, 13.0f);
                    q0Var.z(8.0f);
                    q0Var.r(8.0f);
                    q0Var.z(-8.0f);
                    q0Var.r(-8.0f);
                    q0Var.l();
                    q0Var.u(3.0f, 21.0f);
                    q0Var.r(8.0f);
                    q0Var.z(-8.0f);
                    q0Var.s(3.0f, 13.0f);
                    q0Var.z(8.0f);
                    q0Var.l();
                    q0Var.u(3.0f, 3.0f);
                    q0Var.z(8.0f);
                    q0Var.r(8.0f);
                    q0Var.s(11.0f, 3.0f);
                    q0Var.s(3.0f, 3.0f);
                    q0Var.l();
                    q0Var.u(16.66f, 1.69f);
                    q0Var.s(11.0f, 7.34f);
                    q0Var.s(16.66f, 13.0f);
                    q0Var.t(5.66f, -5.66f);
                    q0Var.t(-5.66f, -5.65f);
                    q0Var.l();
                    w1.e.a(eVar, q0Var.f8447b, 0, n0Var);
                    fVarB = eVar.b();
                    h.f15799m = fVarB;
                }
                w1.f fVarB2 = x0.f21359q;
                if (fVarB2 != null) {
                    obj = obj2;
                } else {
                    w1.e eVar2 = new w1.e("Outlined.Widgets", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i15 = g0.f23208a;
                    obj = obj2;
                    n0 n0Var2 = new n0(q1.q.f17569b);
                    q0 q0Var2 = new q0((byte) 0, 6);
                    ArrayList arrayList = q0Var2.f8447b;
                    q0Var2.u(16.66f, 4.52f);
                    q0Var2.t(2.83f, 2.83f);
                    q0Var2.t(-2.83f, 2.83f);
                    q0Var2.t(-2.83f, -2.83f);
                    q0Var2.t(2.83f, -2.83f);
                    q0Var2.u(9.0f, 5.0f);
                    q0Var2.z(4.0f);
                    q0Var2.s(5.0f, 9.0f);
                    q0Var2.s(5.0f, 5.0f);
                    q0Var2.r(4.0f);
                    arrayList.add(new w1.v(10.0f, 10.0f));
                    q0Var2.z(4.0f);
                    q0Var2.r(-4.0f);
                    q0Var2.z(-4.0f);
                    q0Var2.r(4.0f);
                    q0Var2.u(9.0f, 15.0f);
                    q0Var2.z(4.0f);
                    q0Var2.s(5.0f, 19.0f);
                    q0Var2.z(-4.0f);
                    q0Var2.r(4.0f);
                    arrayList.add(new w1.v(7.66f, -13.31f));
                    q0Var2.s(11.0f, 7.34f);
                    q0Var2.s(16.66f, 13.0f);
                    q0Var2.t(5.66f, -5.66f);
                    q0Var2.t(-5.66f, -5.65f);
                    q0Var2.l();
                    q0Var2.u(11.0f, 3.0f);
                    q0Var2.s(3.0f, 3.0f);
                    q0Var2.z(8.0f);
                    q0Var2.r(8.0f);
                    q0Var2.s(11.0f, 3.0f);
                    q0Var2.l();
                    q0Var2.u(21.0f, 13.0f);
                    q0Var2.r(-8.0f);
                    q0Var2.z(8.0f);
                    q0Var2.r(8.0f);
                    q0Var2.z(-8.0f);
                    q0Var2.l();
                    q0Var2.u(11.0f, 13.0f);
                    q0Var2.s(3.0f, 13.0f);
                    q0Var2.z(8.0f);
                    q0Var2.r(8.0f);
                    q0Var2.z(-8.0f);
                    q0Var2.l();
                    w1.e.a(eVar2, arrayList, 0, n0Var2);
                    fVarB2 = eVar2.b();
                    x0.f21359q = fVarB2;
                }
                f fVar2 = new f(fVarB, fVarB2, na.q.g(R.string.main_repository), new f1.f(new ba.k(9, k0Var, dVar2), -1138337716, true), f16930a, new f1.f(new h0(17, k0Var, w0Var), 491208971, true));
                w1.f fVarM = b0.m();
                w1.f fVarB3 = n7.e.f15472n;
                if (fVarB3 == null) {
                    w1.e eVar3 = new w1.e("Outlined.FavoriteBorder", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i16 = g0.f23208a;
                    n0 n0Var3 = new n0(q1.q.f17569b);
                    q0 q0VarH = j2.h0.h(16.5f, 3.0f);
                    q0VarH.n(-1.74f, 0.0f, -3.41f, 0.81f, -4.5f, 2.09f);
                    q0VarH.m(10.91f, 3.81f, 9.24f, 3.0f, 7.5f, 3.0f);
                    q0VarH.m(4.42f, 3.0f, 2.0f, 5.42f, 2.0f, 8.5f);
                    q0VarH.n(0.0f, 3.78f, 3.4f, 6.86f, 8.55f, 11.54f);
                    q0VarH.s(12.0f, 21.35f);
                    q0VarH.t(1.45f, -1.32f);
                    q0VarH.m(18.6f, 15.36f, 22.0f, 12.28f, 22.0f, 8.5f);
                    q0VarH.m(22.0f, 5.42f, 19.58f, 3.0f, 16.5f, 3.0f);
                    q0VarH.l();
                    q0VarH.u(12.1f, 18.55f);
                    q0VarH.t(-0.1f, 0.1f);
                    q0VarH.t(-0.1f, -0.1f);
                    q0VarH.m(7.14f, 14.24f, 4.0f, 11.39f, 4.0f, 8.5f);
                    q0VarH.m(4.0f, 6.5f, 5.5f, 5.0f, 7.5f, 5.0f);
                    q0VarH.n(1.54f, 0.0f, 3.04f, 0.99f, 3.57f, 2.36f);
                    q0VarH.r(1.87f);
                    q0VarH.m(13.46f, 5.99f, 14.96f, 5.0f, 16.5f, 5.0f);
                    q0VarH.n(2.0f, 0.0f, 3.5f, 1.5f, 3.5f, 3.5f);
                    q0VarH.n(0.0f, 2.89f, -3.14f, 5.74f, -7.9f, 10.05f);
                    q0VarH.l();
                    w1.e.a(eVar3, q0VarH.f8447b, 0, n0Var3);
                    fVarB3 = eVar3.b();
                    n7.e.f15472n = fVarB3;
                }
                f fVar3 = new f(fVarM, fVarB3, na.q.g(R.string.main_favorite), new f1.f(new ba.k(7, zVarL, str), 1342836877, true), f16931b, null);
                w1.f fVarB4 = h.f15787a;
                if (fVarB4 == null) {
                    w1.e eVar4 = new w1.e("Filled.Category", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i17 = g0.f23208a;
                    long j10 = q1.q.f17569b;
                    n0 n0Var4 = new n0(j10);
                    ArrayList arrayList2 = new ArrayList(32);
                    arrayList2.add(new w1.n(12.0f, 2.0f));
                    arrayList2.add(new w1.u(-5.5f, 9.0f));
                    arrayList2.add(new t(11.0f));
                    j jVar = j.f23242c;
                    arrayList2.add(jVar);
                    w1.e.a(eVar4, arrayList2, 0, n0Var4);
                    n0 n0Var5 = new n0(j10);
                    ArrayList arrayList3 = new ArrayList(32);
                    arrayList3.add(new w1.n(17.5f, 17.5f));
                    arrayList3.add(new w1.v(-4.5f, 0.0f));
                    arrayList3.add(new r(4.5f, 4.5f, 0.0f, true, true, 9.0f, 0.0f));
                    arrayList3.add(new r(4.5f, 4.5f, 0.0f, true, true, -9.0f, 0.0f));
                    w1.e.a(eVar4, arrayList3, 0, n0Var5);
                    n0 n0Var6 = new n0(j10);
                    ArrayList arrayList4 = new ArrayList(32);
                    arrayList4.add(new w1.n(3.0f, 13.5f));
                    arrayList4.add(new t(8.0f));
                    arrayList4.add(new w1.z(8.0f));
                    arrayList4.add(new w1.l(3.0f));
                    arrayList4.add(jVar);
                    w1.e.a(eVar4, arrayList4, 0, n0Var6);
                    fVarB4 = eVar4.b();
                    h.f15787a = fVarB4;
                }
                w1.f fVar4 = fVarB4;
                w1.f fVarB5 = nh.b.f15908o;
                if (fVarB5 != null) {
                    c3 = 0;
                } else {
                    w1.e eVar5 = new w1.e("Outlined.Category", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i18 = g0.f23208a;
                    n0 n0Var7 = new n0(q1.q.f17569b);
                    q0 q0Var3 = new q0((byte) 0, 6);
                    q0Var3.u(12.0f, 2.0f);
                    q0Var3.t(-5.5f, 9.0f);
                    q0Var3.r(11.0f);
                    q0Var3.s(12.0f, 2.0f);
                    q0Var3.l();
                    q0Var3.u(12.0f, 5.84f);
                    q0Var3.s(13.93f, 9.0f);
                    q0Var3.r(-3.87f);
                    q0Var3.s(12.0f, 5.84f);
                    q0Var3.l();
                    q0Var3.u(17.5f, 13.0f);
                    q0Var3.n(-2.49f, 0.0f, -4.5f, 2.01f, -4.5f, 4.5f);
                    q0Var3.w(2.01f, 4.5f, 4.5f, 4.5f);
                    q0Var3.w(4.5f, -2.01f, 4.5f, -4.5f);
                    q0Var3.w(-2.01f, -4.5f, -4.5f, -4.5f);
                    q0Var3.l();
                    q0Var3.u(17.5f, 20.0f);
                    q0Var3.n(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f);
                    q0Var3.w(1.12f, -2.5f, 2.5f, -2.5f);
                    q0Var3.w(2.5f, 1.12f, 2.5f, 2.5f);
                    q0Var3.w(-1.12f, 2.5f, -2.5f, 2.5f);
                    q0Var3.l();
                    q0Var3.u(3.0f, 21.5f);
                    q0Var3.r(8.0f);
                    q0Var3.z(-8.0f);
                    j2.h0.t(q0Var3, 3.0f, 13.5f, 8.0f);
                    q0Var3.u(5.0f, 15.5f);
                    q0Var3.r(4.0f);
                    q0Var3.z(4.0f);
                    j2.h0.t(q0Var3, 5.0f, 19.5f, -4.0f);
                    c3 = 0;
                    w1.e.a(eVar5, q0Var3.f8447b, 0, n0Var7);
                    fVarB5 = eVar5.b();
                    nh.b.f15908o = fVarB5;
                }
                f fVar5 = new f(fVar4, fVarB5, na.q.g(R.string.main_others), f16932c, f16933d, null);
                f[] fVarArr = new f[3];
                fVarArr[c3] = fVar2;
                i11 = 1;
                fVarArr[1] = fVar3;
                fVarArr[2] = fVar5;
                objK8 = ud.b.x(fVarArr);
                oVar.h0(objK8);
            } else {
                obj = obj2;
                i11 = 1;
            }
            q9.a.e(((Number) fVar.getValue()).intValue() == i11, g.f(-829745773, new c((List) objK8, fVar, yVar, k0Var, zVarL, 0), oVar), oVar, 48);
            Object objK9 = oVar.K();
            yb.c cVar = null;
            Object obj3 = obj;
            if (objK9 == obj3) {
                objK9 = new i7.a(2, cVar, 7);
                oVar.h0(objK9);
            }
            a0 a0Var = a0.f21526a;
            v.e((ic.n) objK9, a0Var, oVar);
            if ((i12 & 14) != 4) {
                i11 = 0;
            }
            Object objK10 = oVar.K();
            if (i11 != 0 || objK10 == obj3) {
                objK10 = new androidx.lifecycle.r(str, fVar, cVar, 12);
                oVar.h0(objK10);
            }
            v.e((ic.n) objK10, a0Var, oVar);
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ba.p(i10, 10, str);
        }
    }

    public static final void c(int i10, o oVar) {
        p1 p1VarR;
        m9.d dVar;
        oVar.Y(-375728252);
        if (!oVar.N(i10 & 1, i10 != 0)) {
            oVar.Q();
        } else {
            if (Build.VERSION.SDK_INT < 31) {
                p1VarR = oVar.r();
                if (p1VarR != null) {
                    dVar = new m9.d(i10, 11);
                    p1VarR.f24421d = dVar;
                }
                return;
            }
            Object objK = oVar.K();
            x0.r0 r0Var = x0.k.f24334a;
            if (objK == r0Var) {
                objK = v.v(Boolean.FALSE);
                oVar.h0(objK);
            }
            w0 w0Var = (w0) objK;
            Object objK2 = oVar.K();
            if (objK2 == r0Var) {
                objK2 = new e(w0Var, null, 0);
                oVar.h0(objK2);
            }
            v.e((ic.n) objK2, a0.f21526a, oVar);
            if (((Boolean) w0Var.getValue()).booleanValue()) {
                oVar.W(-634675824);
                d(w0Var, oVar, 6);
            } else {
                oVar.W(-645817410);
            }
            oVar.p(false);
        }
        p1VarR = oVar.r();
        if (p1VarR != null) {
            dVar = new m9.d(i10, 12);
            p1VarR.f24421d = dVar;
        }
    }

    public static final void d(w0 w0Var, o oVar, int i10) {
        oVar.Y(1932473009);
        if (oVar.N(i10 & 1, (i10 & 3) != 2)) {
            Object objK = oVar.K();
            if (objK == x0.k.f24334a) {
                objK = new ma.c(w0Var, 2);
                oVar.h0(objK);
            }
            a2.c.c((ic.a) objK, g.f(579170553, new aa.g(w0Var, 11), oVar), null, f16937h, f16938i, null, 0L, 0L, null, oVar, 27696, 484);
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new aa.g(w0Var, i10, 12);
        }
    }
}
