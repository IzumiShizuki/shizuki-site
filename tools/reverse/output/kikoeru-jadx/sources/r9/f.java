package r9;

import androidx.compose.foundation.layout.FillElement;
import com.cnl.kikoeru.R;
import com.tencent.bugly.beta.tinker.TinkerReport;
import e7.a0;
import e7.m0;
import f1.g;
import hd.q0;
import j2.h0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jc.l;
import n7.b0;
import na.q;
import nd.h;
import q1.n0;
import q9.j0;
import u3.x0;
import ub.p;
import vb.m;
import w1.g0;
import w1.j;
import w1.n;
import w1.u;
import x0.e1;
import x0.k;
import x0.o;
import x0.o2;
import x0.p1;
import x0.v;
import y.d1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f18977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f18978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final wb.b f18979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p f18980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o2 f18981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static WeakReference f18982f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e1 f18983g;

    static {
        String strG = q.g(R.string.layout_settings);
        w1.f fVarB = b0.f15426j;
        if (fVarB == null) {
            w1.e eVar = new w1.e("Filled.SettingsApplications", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i10 = g0.f23208a;
            n0 n0Var = new n0(q1.q.f17569b);
            q0 q0VarH = h0.h(12.0f, 10.0f);
            q0VarH.n(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
            q0VarH.w(0.9f, 2.0f, 2.0f, 2.0f);
            q0VarH.w(2.0f, -0.9f, 2.0f, -2.0f);
            q0VarH.w(-0.9f, -2.0f, -2.0f, -2.0f);
            q0VarH.l();
            q0VarH.u(19.0f, 3.0f);
            q0VarH.s(5.0f, 3.0f);
            q0VarH.n(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
            q0VarH.z(14.0f);
            q0VarH.n(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
            q0VarH.r(14.0f);
            q0VarH.n(1.11f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
            q0VarH.s(21.0f, 5.0f);
            q0VarH.n(0.0f, -1.1f, -0.89f, -2.0f, -2.0f, -2.0f);
            q0VarH.l();
            q0VarH.u(17.25f, 12.0f);
            q0VarH.n(0.0f, 0.23f, -0.02f, 0.46f, -0.05f, 0.68f);
            q0VarH.t(1.48f, 1.16f);
            q0VarH.n(0.13f, 0.11f, 0.17f, 0.3f, 0.08f, 0.45f);
            q0VarH.t(-1.4f, 2.42f);
            q0VarH.n(-0.09f, 0.15f, -0.27f, 0.21f, -0.43f, 0.15f);
            q0VarH.t(-1.74f, -0.7f);
            q0VarH.n(-0.36f, 0.28f, -0.76f, 0.51f, -1.18f, 0.69f);
            q0VarH.t(-0.26f, 1.85f);
            q0VarH.n(-0.03f, 0.17f, -0.18f, 0.3f, -0.35f, 0.3f);
            q0VarH.r(-2.8f);
            q0VarH.n(-0.17f, 0.0f, -0.32f, -0.13f, -0.35f, -0.29f);
            q0VarH.t(-0.26f, -1.85f);
            q0VarH.n(-0.43f, -0.18f, -0.82f, -0.41f, -1.18f, -0.69f);
            q0VarH.t(-1.74f, 0.7f);
            q0VarH.n(-0.16f, 0.06f, -0.34f, 0.0f, -0.43f, -0.15f);
            q0VarH.t(-1.4f, -2.42f);
            q0VarH.n(-0.09f, -0.15f, -0.05f, -0.34f, 0.08f, -0.45f);
            q0VarH.t(1.48f, -1.16f);
            q0VarH.n(-0.03f, -0.23f, -0.05f, -0.46f, -0.05f, -0.69f);
            q0VarH.n(0.0f, -0.23f, 0.02f, -0.46f, 0.05f, -0.68f);
            q0VarH.t(-1.48f, -1.16f);
            q0VarH.n(-0.13f, -0.11f, -0.17f, -0.3f, -0.08f, -0.45f);
            q0VarH.t(1.4f, -2.42f);
            q0VarH.n(0.09f, -0.15f, 0.27f, -0.21f, 0.43f, -0.15f);
            q0VarH.t(1.74f, 0.7f);
            q0VarH.n(0.36f, -0.28f, 0.76f, -0.51f, 1.18f, -0.69f);
            q0VarH.t(0.26f, -1.85f);
            q0VarH.n(0.03f, -0.17f, 0.18f, -0.3f, 0.35f, -0.3f);
            q0VarH.r(2.8f);
            q0VarH.n(0.17f, 0.0f, 0.32f, 0.13f, 0.35f, 0.29f);
            q0VarH.t(0.26f, 1.85f);
            q0VarH.n(0.43f, 0.18f, 0.82f, 0.41f, 1.18f, 0.69f);
            q0VarH.t(1.74f, -0.7f);
            q0VarH.n(0.16f, -0.06f, 0.34f, 0.0f, 0.43f, 0.15f);
            q0VarH.t(1.4f, 2.42f);
            q0VarH.n(0.09f, 0.15f, 0.05f, 0.34f, -0.08f, 0.45f);
            q0VarH.t(-1.48f, 1.16f);
            q0VarH.n(0.03f, 0.23f, 0.05f, 0.46f, 0.05f, 0.69f);
            q0VarH.l();
            w1.e.a(eVar, q0VarH.f8447b, 0, n0Var);
            fVarB = eVar.b();
            b0.f15426j = fVarB;
        }
        c cVar = new c("SettingsUi", strG, fVarB, null, null, b.f18945h, TinkerReport.KEY_APPLIED_EXCEPTION);
        String strG2 = q.g(R.string.music_settings);
        w1.f fVarB2 = nh.b.f15899f;
        if (fVarB2 == null) {
            w1.e eVar2 = new w1.e("Filled.GraphicEq", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i11 = g0.f23208a;
            n0 n0Var2 = new n0(q1.q.f17569b);
            q0 q0Var = new q0((byte) 0, 6);
            q0Var.u(7.0f, 18.0f);
            q0Var.r(2.0f);
            q0Var.s(9.0f, 6.0f);
            h0.t(q0Var, 7.0f, 6.0f, 12.0f);
            q0Var.u(11.0f, 22.0f);
            q0Var.r(2.0f);
            q0Var.s(13.0f, 2.0f);
            q0Var.r(-2.0f);
            q0Var.z(20.0f);
            q0Var.l();
            q0Var.u(3.0f, 14.0f);
            q0Var.r(2.0f);
            q0Var.z(-4.0f);
            q0Var.s(3.0f, 10.0f);
            q0Var.z(4.0f);
            q0Var.l();
            q0Var.u(15.0f, 18.0f);
            q0Var.r(2.0f);
            q0Var.s(17.0f, 6.0f);
            q0Var.r(-2.0f);
            q0Var.z(12.0f);
            q0Var.l();
            q0Var.u(19.0f, 10.0f);
            q0Var.z(4.0f);
            q0Var.r(2.0f);
            q0Var.z(-4.0f);
            q0Var.r(-2.0f);
            q0Var.l();
            w1.e.a(eVar2, q0Var.f8447b, 0, n0Var2);
            fVarB2 = eVar2.b();
            nh.b.f15899f = fVarB2;
        }
        c cVar2 = new c("SettingsMusic", strG2, fVarB2, null, null, b.f18946i, TinkerReport.KEY_APPLIED_EXCEPTION);
        c cVar3 = new c("SettingsLyric", q.g(R.string.lyric_settings), h.n(), null, null, b.f18947j, TinkerReport.KEY_APPLIED_EXCEPTION);
        String strG3 = q.g(R.string.misc_settings);
        w1.f fVarB3 = b0.f15422f;
        if (fVarB3 == null) {
            w1.e eVar3 = new w1.e("Filled.Hive", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i12 = g0.f23208a;
            long j10 = q1.q.f17569b;
            n0 n0Var3 = new n0(j10);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new n(13.79f, 8.0f));
            arrayList.add(new u(1.8f, -3.0f));
            arrayList.add(new u(-1.8f, -3.0f));
            arrayList.add(new u(-3.58f, 0.0f));
            arrayList.add(new u(-1.8f, 3.0f));
            arrayList.add(new u(1.8f, 3.0f));
            j jVar = j.f23242c;
            arrayList.add(jVar);
            w1.e.a(eVar3, arrayList, 0, n0Var3);
            n0 n0Var4 = new n0(j10);
            ArrayList arrayList2 = new ArrayList(32);
            arrayList2.add(new n(10.21f, 9.0f));
            arrayList2.add(new u(-1.8f, 3.0f));
            arrayList2.add(new u(1.8f, 3.0f));
            arrayList2.add(new u(3.58f, 0.0f));
            arrayList2.add(new u(1.8f, -3.0f));
            arrayList2.add(new u(-1.8f, -3.0f));
            arrayList2.add(jVar);
            w1.e.a(eVar3, arrayList2, 0, n0Var4);
            n0 n0Var5 = new n0(j10);
            ArrayList arrayList3 = new ArrayList(32);
            arrayList3.add(new n(16.45f, 11.51f));
            arrayList3.add(new u(3.59f, 0.0f));
            arrayList3.add(new u(1.79f, -3.0f));
            arrayList3.add(new u(-1.79f, -3.0f));
            arrayList3.add(new u(-3.59f, 0.0f));
            arrayList3.add(new u(-1.8f, 3.0f));
            arrayList3.add(jVar);
            w1.e.a(eVar3, arrayList3, 0, n0Var5);
            n0 n0Var6 = new n0(j10);
            ArrayList arrayList4 = new ArrayList(32);
            arrayList4.add(new n(20.04f, 12.51f));
            arrayList4.add(new u(-3.59f, 0.0f));
            arrayList4.add(new u(-1.8f, 3.0f));
            arrayList4.add(new u(1.8f, 3.0f));
            arrayList4.add(new u(3.59f, 0.0f));
            arrayList4.add(new u(1.79f, -3.0f));
            arrayList4.add(jVar);
            w1.e.a(eVar3, arrayList4, 0, n0Var6);
            n0 n0Var7 = new n0(j10);
            ArrayList arrayList5 = new ArrayList(32);
            arrayList5.add(new n(7.55f, 11.51f));
            arrayList5.add(new u(1.8f, -3.0f));
            arrayList5.add(new u(-1.8f, -3.0f));
            arrayList5.add(new u(-3.59f, 0.0f));
            arrayList5.add(new u(-1.79f, 3.0f));
            arrayList5.add(new u(1.79f, 3.0f));
            arrayList5.add(jVar);
            w1.e.a(eVar3, arrayList5, 0, n0Var7);
            n0 n0Var8 = new n0(j10);
            ArrayList arrayList6 = new ArrayList(32);
            arrayList6.add(new n(7.55f, 12.51f));
            arrayList6.add(new u(-3.59f, 0.0f));
            arrayList6.add(new u(-1.79f, 3.0f));
            arrayList6.add(new u(1.79f, 3.0f));
            arrayList6.add(new u(3.59f, 0.0f));
            arrayList6.add(new u(1.8f, -3.0f));
            arrayList6.add(jVar);
            w1.e.a(eVar3, arrayList6, 0, n0Var8);
            n0 n0Var9 = new n0(j10);
            ArrayList arrayList7 = new ArrayList(32);
            arrayList7.add(new n(10.21f, 16.0f));
            arrayList7.add(new u(-1.8f, 3.0f));
            arrayList7.add(new u(1.8f, 3.0f));
            arrayList7.add(new u(3.58f, 0.0f));
            arrayList7.add(new u(1.8f, -3.0f));
            arrayList7.add(new u(-1.8f, -3.0f));
            arrayList7.add(jVar);
            w1.e.a(eVar3, arrayList7, 0, n0Var9);
            fVarB3 = eVar3.b();
            b0.f15422f = fVarB3;
        }
        c cVar4 = new c("SettingsMisc", strG3, fVarB3, null, null, b.f18948k, TinkerReport.KEY_APPLIED_EXCEPTION);
        c cVar5 = new c("SettingsData", q.g(R.string.data_settings), b0.l(), null, null, b.f18949l, TinkerReport.KEY_APPLIED_EXCEPTION);
        c cVar6 = new c("SettingsBlacklist", q.g(R.string.blacklist_settings), n7.d.t(), b.f18950m, null, b.f18951n, 112);
        c cVar7 = new c("SettingsAccount", q.g(R.string.account_settings), nh.a.j(), null, null, b.f18952o, TinkerReport.KEY_APPLIED_EXCEPTION);
        String strG4 = q.g(R.string.card_settings);
        w1.f fVarB4 = x0.f21347e;
        if (fVarB4 == null) {
            w1.e eVar4 = new w1.e("Filled.Dashboard", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i13 = g0.f23208a;
            n0 n0Var10 = new n0(q1.q.f17569b);
            q0 q0Var2 = new q0((byte) 0, 6);
            q0Var2.u(3.0f, 13.0f);
            q0Var2.r(8.0f);
            q0Var2.s(11.0f, 3.0f);
            h0.t(q0Var2, 3.0f, 3.0f, 10.0f);
            q0Var2.u(3.0f, 21.0f);
            q0Var2.r(8.0f);
            q0Var2.z(-6.0f);
            h0.t(q0Var2, 3.0f, 15.0f, 6.0f);
            q0Var2.u(13.0f, 21.0f);
            q0Var2.r(8.0f);
            q0Var2.s(21.0f, 11.0f);
            q0Var2.r(-8.0f);
            q0Var2.z(10.0f);
            q0Var2.l();
            q0Var2.u(13.0f, 3.0f);
            q0Var2.z(6.0f);
            q0Var2.r(8.0f);
            q0Var2.s(21.0f, 3.0f);
            q0Var2.r(-8.0f);
            q0Var2.l();
            w1.e.a(eVar4, q0Var2.f8447b, 0, n0Var10);
            fVarB4 = eVar4.b();
            x0.f21347e = fVarB4;
        }
        List listX = ud.b.x(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, new c("SettingsCard", strG4, fVarB4, b.f18953p, null, b.f18954q, 112));
        f18977a = listX;
        c cVar8 = new c("DownloadScreen", q.g(R.string.download), h.g(), b.f18955r, b.f18956s, b.f18957t, 48);
        String strG5 = q.g(R.string.history);
        w1.f fVarB5 = x0.f21351i;
        if (fVarB5 == null) {
            w1.e eVar5 = new w1.e("Filled.History", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i14 = g0.f23208a;
            n0 n0Var11 = new n0(q1.q.f17569b);
            q0 q0VarH2 = h0.h(13.0f, 3.0f);
            q0VarH2.n(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
            q0VarH2.s(1.0f, 12.0f);
            q0VarH2.t(3.89f, 3.89f);
            q0VarH2.t(0.07f, 0.14f);
            q0VarH2.s(9.0f, 12.0f);
            q0VarH2.s(6.0f, 12.0f);
            q0VarH2.n(0.0f, -3.87f, 3.13f, -7.0f, 7.0f, -7.0f);
            q0VarH2.w(7.0f, 3.13f, 7.0f, 7.0f);
            q0VarH2.w(-3.13f, 7.0f, -7.0f, 7.0f);
            q0VarH2.n(-1.93f, 0.0f, -3.68f, -0.79f, -4.94f, -2.06f);
            q0VarH2.t(-1.42f, 1.42f);
            q0VarH2.m(8.27f, 19.99f, 10.51f, 21.0f, 13.0f, 21.0f);
            q0VarH2.n(4.97f, 0.0f, 9.0f, -4.03f, 9.0f, -9.0f);
            q0VarH2.w(-4.03f, -9.0f, -9.0f, -9.0f);
            q0VarH2.l();
            q0VarH2.u(12.0f, 8.0f);
            q0VarH2.z(5.0f);
            q0VarH2.t(4.28f, 2.54f);
            q0VarH2.t(0.72f, -1.21f);
            q0VarH2.t(-3.5f, -2.08f);
            q0VarH2.s(13.5f, 8.0f);
            q0VarH2.s(12.0f, 8.0f);
            q0VarH2.l();
            w1.e.a(eVar5, q0VarH2.f8447b, 0, n0Var11);
            fVarB5 = eVar5.b();
            x0.f21351i = fVarB5;
        }
        List listX2 = ud.b.x(cVar8, new c("HistoryScreen", strG5, fVarB5, b.f18958u, b.f18959v, b.f18960w, 48), new c("SubtitleScreen", q.g(R.string.local_subtitle), b0.p(), b.f18961x, null, b.f18962y, 112));
        f18978b = listX2;
        wb.b bVarL = ud.b.l();
        bVarL.add(new c("SettingsMain", q.g(R.string.settings), h.m(), null, null, b.f18963z, TinkerReport.KEY_APPLIED_EXCEPTION));
        m.P(bVarL, listX);
        m.P(bVarL, listX2);
        f18979c = ud.b.g(bVarL);
        f18980d = ub.a.d(new j0(4));
        f18981e = new o2(new j0(5));
        f18983g = v.v(null);
    }

    public static final void a(d1 d1Var, o oVar, int i10) {
        int i11;
        l.e(d1Var, "padding");
        oVar.Y(1950222755);
        if ((i10 & 6) == 0) {
            i11 = (oVar.f(d1Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (oVar.N(i11 & 1, (i11 & 3) != 2)) {
            a0 a0VarW = g8.a.W(new m0[0], oVar);
            Object objK = oVar.K();
            Object obj = k.f24334a;
            if (objK == obj) {
                objK = new a(23);
                oVar.h0(objK);
            }
            na.c.c(a0VarW, (ic.o) objK, oVar, 48);
            boolean zH = oVar.h(a0VarW);
            Object objK2 = oVar.K();
            if (zH || objK2 == obj) {
                objK2 = new a9.e(a0VarW, null, 2);
                oVar.h0(objK2);
            }
            v.e((ic.n) objK2, a0VarW, oVar);
            v.a(f18981e.a(a0VarW), g.f(-1710945053, new ba.h0(21, a0VarW, d1Var), oVar), oVar, 56);
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new e(i10, 0, d1Var);
        }
    }

    public static final void b(int i10, o oVar) {
        o oVar2;
        oVar.Y(1067280711);
        if (oVar.N(i10 & 1, i10 != 0)) {
            a0 a0Var = (a0) oVar.j(a9.u.f265c);
            a0 a0Var2 = (a0) oVar.j(f18981e);
            FillElement fillElement = androidx.compose.foundation.layout.c.f557c;
            boolean zH = oVar.h(a0Var2) | oVar.h(a0Var);
            Object objK = oVar.K();
            if (zH || objK == k.f24334a) {
                objK = new ba.q0(17, a0Var2, a0Var);
                oVar.h0(objK);
            }
            oVar2 = oVar;
            a.a.g(6, 510, null, (ic.k) objK, null, fillElement, null, null, oVar2, null, null, false);
        } else {
            oVar2 = oVar;
            oVar2.Q();
        }
        p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new q9.b(i10, 5);
        }
    }

    public static final void c(int i10, o oVar) {
        o oVar2;
        oVar.Y(-775913551);
        if (oVar.N(i10 & 1, i10 != 0)) {
            c cVar = (c) ((Map) f18980d.getValue()).get((String) f18983g.getValue());
            if (cVar != null) {
                oVar.W(273482450);
                oVar2 = oVar;
                b0.c(cVar.f18968e.getValue(), null, null, null, g.f(1276175499, new d(cVar, 0), oVar), oVar2, 24576, 14);
            } else {
                oVar2 = oVar;
                oVar2.W(260147025);
            }
            oVar2.p(false);
        } else {
            oVar2 = oVar;
            oVar2.Q();
        }
        p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new q9.b(i10, 4);
        }
    }
}
