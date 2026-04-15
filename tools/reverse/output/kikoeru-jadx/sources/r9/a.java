package r9;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.cnl.kikoeru.MainActivity;
import com.cnl.kikoeru.R;
import com.tencent.bugly.beta.tinker.TinkerReport;
import e7.u;
import f7.r;
import hd.q0;
import ic.o;
import j2.h0;
import jc.l;
import m0.z8;
import n7.b0;
import na.q;
import q1.n0;
import q9.j0;
import u9.j;
import ub.a0;
import w1.g0;
import w1.i0;
import x0.k;
import x0.r0;
import y.k1;
import y8.i;
import z8.h;
import z8.n;
import z9.m;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18937a;

    public /* synthetic */ a(int i10) {
        this.f18937a = i10;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        u uVar;
        int i10 = this.f18937a;
        r0 r0Var = k.f24334a;
        a0 a0Var = a0.f21526a;
        switch (i10) {
            case 0:
                x0.o oVar = (x0.o) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                l.e((i) obj, "$this$prefsItem");
                if (!oVar.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    oVar.Q();
                } else {
                    n.a("floatingLyricsTextAlignCenter", q.g(R.string.lyrics_align), null, q.g(R.string.lyrics_align_summary), true, null, 0L, false, oVar, 24582, 484);
                }
                break;
            case 1:
                x0.o oVar2 = (x0.o) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                l.e((i) obj, "$this$prefsItem");
                if (!oVar2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    oVar2.Q();
                } else {
                    h.a("floatingLyricsTextSize", q.g(R.string.lyrics_text_size), null, 25, true, null, new oc.d(10, 35, 1), 0, 0L, false, oVar2, 199686, 3924);
                }
                break;
            case 2:
                x0.o oVar3 = (x0.o) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                l.e((i) obj, "$this$prefsItem");
                if (!oVar3.N(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    oVar3.Q();
                } else {
                    w9.e.b("floatLyricsTextColor", q.g(R.string.lyrics_text_color), null, 4294967295L, 0L, false, oVar3, 3078);
                    w9.e.b("floatLyricsTextShadowColor", q.g(R.string.lyrics_text_shadow_color), null, 4278190080L, 0L, false, oVar3, 3078);
                }
                break;
            case 3:
                x0.o oVar4 = (x0.o) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                l.e((c) obj, "it");
                if (!oVar4.N(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    oVar4.Q();
                } else {
                    f.b(0, oVar4);
                }
                break;
            case 4:
                x0.o oVar5 = (x0.o) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                l.e((a0.d) obj, "$this$item");
                if (!oVar5.N(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    oVar5.Q();
                } else {
                    y.d.d(androidx.compose.foundation.layout.c.d(j1.n.f9689a, 16), oVar5);
                    y8.e.a(q.g(R.string.settings), 0L, oVar5, 0);
                }
                break;
            case 5:
                x0.o oVar6 = (x0.o) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                l.e((c) obj, "it");
                if (!oVar6.N(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    oVar6.Q();
                } else {
                    y9.b.a(0, oVar6);
                }
                break;
            case 6:
                x0.o oVar7 = (x0.o) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                l.e((a0.d) obj, "$this$item");
                if (!oVar7.N(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    oVar7.Q();
                } else {
                    y.d.d(androidx.compose.foundation.layout.c.d(j1.n.f9689a, 16), oVar7);
                    y8.e.a(q.g(R.string.main_others), 0L, oVar7, 0);
                }
                break;
            case 7:
                x0.o oVar8 = (x0.o) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                l.e((a0.d) obj, "$this$item");
                if (!oVar8.N(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    oVar8.Q();
                } else {
                    w1.f fVarB = nd.h.f15798l;
                    if (fVarB == null) {
                        w1.e eVar = new w1.e("Filled.Upgrade", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i11 = g0.f23208a;
                        n0 n0Var = new n0(q1.q.f17569b);
                        q0 q0Var = new q0((byte) 0, 6);
                        q0Var.u(16.0f, 18.0f);
                        q0Var.z(2.0f);
                        q0Var.q(8.0f);
                        q0Var.z(-2.0f);
                        q0Var.q(16.0f);
                        q0Var.l();
                        q0Var.u(11.0f, 7.99f);
                        q0Var.y(16.0f);
                        q0Var.r(2.0f);
                        q0Var.y(7.99f);
                        q0Var.r(3.0f);
                        q0Var.s(12.0f, 4.0f);
                        q0Var.s(8.0f, 7.99f);
                        q0Var.q(11.0f);
                        q0Var.l();
                        w1.e.a(eVar, q0Var.f8447b, 0, n0Var);
                        fVarB = eVar.b();
                        nd.h.f15798l = fVarB;
                    }
                    i0 i0VarC = w1.b.c(fVarB, oVar8);
                    String strG = q.g(R.string.check_update);
                    f1.f fVar = b.C;
                    Object objK = oVar8.K();
                    if (objK == r0Var) {
                        objK = new j0(3);
                        oVar8.h0(objK);
                    }
                    ka.b.g(null, i0VarC, 0L, strG, fVar, (ic.a) objK, oVar8, 221248, 5);
                }
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                x0.o oVar9 = (x0.o) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                l.e((a0.d) obj, "$this$item");
                if (!oVar9.N(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    oVar9.Q();
                } else {
                    w1.f fVarB2 = n7.e.f15464f;
                    if (fVarB2 == null) {
                        w1.e eVar2 = new w1.e("Filled.Group", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i12 = g0.f23208a;
                        n0 n0Var2 = new n0(q1.q.f17569b);
                        q0 q0VarH = h0.h(16.0f, 11.0f);
                        q0VarH.n(1.66f, 0.0f, 2.99f, -1.34f, 2.99f, -3.0f);
                        q0VarH.v(17.66f, 5.0f, 16.0f, 5.0f);
                        q0VarH.n(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
                        q0VarH.w(1.34f, 3.0f, 3.0f, 3.0f);
                        q0VarH.l();
                        q0VarH.u(8.0f, 11.0f);
                        q0VarH.n(1.66f, 0.0f, 2.99f, -1.34f, 2.99f, -3.0f);
                        q0VarH.v(9.66f, 5.0f, 8.0f, 5.0f);
                        q0VarH.m(6.34f, 5.0f, 5.0f, 6.34f, 5.0f, 8.0f);
                        q0VarH.w(1.34f, 3.0f, 3.0f, 3.0f);
                        q0VarH.l();
                        q0VarH.u(8.0f, 13.0f);
                        q0VarH.n(-2.33f, 0.0f, -7.0f, 1.17f, -7.0f, 3.5f);
                        q0VarH.s(1.0f, 19.0f);
                        q0VarH.r(14.0f);
                        q0VarH.z(-2.5f);
                        q0VarH.n(0.0f, -2.33f, -4.67f, -3.5f, -7.0f, -3.5f);
                        q0VarH.l();
                        q0VarH.u(16.0f, 13.0f);
                        q0VarH.n(-0.29f, 0.0f, -0.62f, 0.02f, -0.97f, 0.05f);
                        q0VarH.n(1.16f, 0.84f, 1.97f, 1.97f, 1.97f, 3.45f);
                        q0VarH.s(17.0f, 19.0f);
                        q0VarH.r(6.0f);
                        q0VarH.z(-2.5f);
                        q0VarH.n(0.0f, -2.33f, -4.67f, -3.5f, -7.0f, -3.5f);
                        q0VarH.l();
                        w1.e.a(eVar2, q0VarH.f8447b, 0, n0Var2);
                        fVarB2 = eVar2.b();
                        n7.e.f15464f = fVarB2;
                    }
                    i0 i0VarC2 = w1.b.c(fVarB2, oVar9);
                    String strG2 = q.g(R.string.join_group);
                    Object objK2 = oVar9.K();
                    if (objK2 == r0Var) {
                        objK2 = new j0(2);
                        oVar9.h0(objK2);
                    }
                    ka.b.g(null, i0VarC2, 0L, strG2, null, (ic.a) objK2, oVar9, 196672, 21);
                }
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                x0.o oVar10 = (x0.o) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                l.e((a0.d) obj, "$this$item");
                if (!oVar10.N(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    oVar10.Q();
                } else {
                    Object objJ = oVar10.j(AndroidCompositionLocals_androidKt.f721b);
                    l.c(objJ, "null cannot be cast to non-null type com.cnl.kikoeru.MainActivity");
                    MainActivity mainActivity = (MainActivity) objJ;
                    w1.f fVarB3 = nh.a.f15884g;
                    if (fVarB3 == null) {
                        w1.e eVar3 = new w1.e("Filled.Key", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i13 = g0.f23208a;
                        n0 n0Var3 = new n0(q1.q.f17569b);
                        q0 q0Var2 = new q0((byte) 0, 6);
                        q0Var2.u(21.0f, 10.0f);
                        q0Var2.r(-8.35f);
                        q0Var2.m(11.83f, 7.67f, 9.61f, 6.0f, 7.0f, 6.0f);
                        q0Var2.n(-3.31f, 0.0f, -6.0f, 2.69f, -6.0f, 6.0f);
                        q0Var2.w(2.69f, 6.0f, 6.0f, 6.0f);
                        q0Var2.n(2.61f, 0.0f, 4.83f, -1.67f, 5.65f, -4.0f);
                        q0Var2.q(13.0f);
                        q0Var2.t(2.0f, 2.0f);
                        q0Var2.t(2.0f, -2.0f);
                        q0Var2.t(2.0f, 2.0f);
                        q0Var2.t(4.0f, -4.04f);
                        q0Var2.s(21.0f, 10.0f);
                        q0Var2.l();
                        q0Var2.u(7.0f, 15.0f);
                        q0Var2.n(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f);
                        q0Var2.n(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f);
                        q0Var2.w(3.0f, 1.35f, 3.0f, 3.0f);
                        q0Var2.m(10.0f, 13.65f, 8.65f, 15.0f, 7.0f, 15.0f);
                        q0Var2.l();
                        w1.e.a(eVar3, q0Var2.f8447b, 0, n0Var3);
                        fVarB3 = eVar3.b();
                        nh.a.f15884g = fVarB3;
                    }
                    i0 i0VarC3 = w1.b.c(fVarB3, oVar10);
                    String strG3 = q.g(R.string.notification_permission);
                    boolean zH = oVar10.h(mainActivity);
                    Object objK3 = oVar10.K();
                    if (zH || objK3 == r0Var) {
                        objK3 = new androidx.lifecycle.n0(25, mainActivity);
                        oVar10.h0(objK3);
                    }
                    ka.b.g(null, i0VarC3, 0L, strG3, null, (ic.a) objK3, oVar10, 64, 21);
                }
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                x0.o oVar11 = (x0.o) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                l.e((a0.d) obj, "$this$item");
                if (!oVar11.N(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    oVar11.Q();
                } else {
                    Context context = (Context) oVar11.j(AndroidCompositionLocals_androidKt.f721b);
                    w1.f fVarB4 = b0.f15417a;
                    if (fVarB4 == null) {
                        w1.e eVar4 = new w1.e("Filled.BatterySaver", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i14 = g0.f23208a;
                        n0 n0Var4 = new n0(q1.q.f17569b);
                        q0 q0Var3 = new q0((byte) 0, 6);
                        q0Var3.u(16.0f, 4.0f);
                        q0Var3.r(-2.0f);
                        q0Var3.y(2.0f);
                        q0Var3.r(-4.0f);
                        q0Var3.z(2.0f);
                        q0Var3.q(8.0f);
                        q0Var3.m(7.45f, 4.0f, 7.0f, 4.45f, 7.0f, 5.0f);
                        q0Var3.z(16.0f);
                        q0Var3.n(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
                        q0Var3.r(8.0f);
                        q0Var3.n(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                        q0Var3.y(5.0f);
                        q0Var3.m(17.0f, 4.45f, 16.55f, 4.0f, 16.0f, 4.0f);
                        q0Var3.l();
                        q0Var3.u(15.0f, 14.0f);
                        q0Var3.r(-2.0f);
                        q0Var3.z(2.0f);
                        q0Var3.r(-2.0f);
                        q0Var3.z(-2.0f);
                        q0Var3.q(9.0f);
                        q0Var3.z(-2.0f);
                        q0Var3.r(2.0f);
                        q0Var3.z(-2.0f);
                        q0Var3.r(2.0f);
                        q0Var3.z(2.0f);
                        q0Var3.r(2.0f);
                        q0Var3.y(14.0f);
                        q0Var3.l();
                        w1.e.a(eVar4, q0Var3.f8447b, 0, n0Var4);
                        fVarB4 = eVar4.b();
                        b0.f15417a = fVarB4;
                    }
                    i0 i0VarC4 = w1.b.c(fVarB4, oVar11);
                    String strG4 = q.g(R.string.ignore_battery_optimizations);
                    boolean zH2 = oVar11.h(context);
                    Object objK4 = oVar11.K();
                    if (zH2 || objK4 == r0Var) {
                        objK4 = new r(context, 1);
                        oVar11.h0(objK4);
                    }
                    ka.b.g(null, i0VarC4, 0L, strG4, null, (ic.a) objK4, oVar11, 64, 21);
                }
                break;
            case 11:
                x0.o oVar12 = (x0.o) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                l.e((c) obj, "it");
                if (!oVar12.N(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    oVar12.Q();
                } else {
                    b.a(0, oVar12);
                }
                break;
            case 12:
                x0.o oVar13 = (x0.o) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                l.e((c) obj, "it");
                if (!oVar13.N(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    oVar13.Q();
                } else {
                    aa.a.c(0, oVar13);
                }
                break;
            case 13:
                x0.o oVar14 = (x0.o) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                l.e((c) obj, "it");
                if (!oVar14.N(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    oVar14.Q();
                } else {
                    x9.a.a(0, oVar14);
                }
                break;
            case 14:
                x0.o oVar15 = (x0.o) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                l.e((c) obj, "it");
                if (!oVar15.N(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    oVar15.Q();
                } else {
                    v9.b.b(0, oVar15);
                }
                break;
            case 15:
                x0.o oVar16 = (x0.o) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                l.e((c) obj, "it");
                if (!oVar16.N(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    oVar16.Q();
                } else {
                    t9.e.b(0, oVar16);
                }
                break;
            case 16:
                x0.o oVar17 = (x0.o) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                l.e((c) obj, "it");
                if (!oVar17.N(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    oVar17.Q();
                } else {
                    s9.d.a(0, oVar17);
                }
                break;
            case 17:
                x0.o oVar18 = (x0.o) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                l.e((c) obj, "it");
                if (!oVar18.N(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    oVar18.Q();
                } else {
                    j.a(0, oVar18);
                }
                break;
            case 18:
                c cVar = (c) obj;
                x0.o oVar19 = (x0.o) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                l.e(cVar, "it");
                if ((iIntValue19 & 6) == 0) {
                    iIntValue19 |= oVar19.f(cVar) ? 4 : 2;
                }
                if (!oVar19.N(iIntValue19 & 1, (iIntValue19 & 19) != 18)) {
                    oVar19.Q();
                } else {
                    la.l.m(cVar, oVar19, iIntValue19 & 14);
                }
                break;
            case 19:
                c cVar2 = (c) obj;
                x0.o oVar20 = (x0.o) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                l.e(cVar2, "it");
                if ((iIntValue20 & 6) == 0) {
                    iIntValue20 |= oVar20.f(cVar2) ? 4 : 2;
                }
                if (!oVar20.N(iIntValue20 & 1, (iIntValue20 & 19) != 18)) {
                    oVar20.Q();
                } else {
                    n9.b.a(cVar2, oVar20, iIntValue20 & 14);
                }
                break;
            case 20:
                c cVar3 = (c) obj;
                x0.o oVar21 = (x0.o) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                l.e(cVar3, "it");
                if ((iIntValue21 & 6) == 0) {
                    iIntValue21 |= oVar21.f(cVar3) ? 4 : 2;
                }
                if (!oVar21.N(iIntValue21 & 1, (iIntValue21 & 19) != 18)) {
                    oVar21.Q();
                } else {
                    la.l.m(cVar3, oVar21, iIntValue21 & 14);
                }
                break;
            case 21:
                c cVar4 = (c) obj;
                x0.o oVar22 = (x0.o) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                l.e(cVar4, "it");
                if ((iIntValue22 & 6) == 0) {
                    iIntValue22 |= oVar22.f(cVar4) ? 4 : 2;
                }
                if (!oVar22.N(iIntValue22 & 1, (iIntValue22 & 19) != 18)) {
                    oVar22.Q();
                } else {
                    nh.a.b(cVar4, oVar22, iIntValue22 & 14);
                }
                break;
            case 22:
                x0.o oVar23 = (x0.o) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                l.e((c) obj, "it");
                if (!oVar23.N(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    oVar23.Q();
                } else {
                    m.f(0, oVar23);
                }
                break;
            case 23:
                e7.j jVar = (e7.j) obj3;
                l.e((e7.a0) obj, "<unused var>");
                f.f18983g.setValue((jVar == null || (uVar = jVar.f6334b) == null) ? null : (String) uVar.f6400b.f8191e);
                break;
            case 24:
                x0.o oVar24 = (x0.o) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                l.e((a0.d) obj, "$this$item");
                if (!oVar24.N(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    oVar24.Q();
                } else {
                    y8.e.a(q.g(R.string.current_account), 0L, oVar24, 0);
                }
                break;
            case 25:
                x0.o oVar25 = (x0.o) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                l.e((a0.d) obj, "$this$item");
                if (!oVar25.N(iIntValue25 & 1, (iIntValue25 & 17) != 16)) {
                    oVar25.Q();
                } else {
                    y8.e.a(q.g(R.string.other_account), 0L, oVar25, 0);
                }
                break;
            case 26:
                x0.o oVar26 = (x0.o) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                l.e((k1) obj, "$this$TextButton");
                if (!oVar26.N(iIntValue26 & 1, (iIntValue26 & 17) != 16)) {
                    oVar26.Q();
                } else {
                    z8.b(q.g(R.string.btn_delete), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar26, 0, 0, 131070);
                }
                break;
            case 27:
                x0.o oVar27 = (x0.o) obj2;
                int iIntValue27 = ((Integer) obj3).intValue();
                l.e((k1) obj, "$this$TextButton");
                if (!oVar27.N(iIntValue27 & 1, (iIntValue27 & 17) != 16)) {
                    oVar27.Q();
                } else {
                    z8.b(q.g(R.string.btn_cancel), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar27, 0, 0, 131070);
                }
                break;
            case 28:
                x0.o oVar28 = (x0.o) obj2;
                int iIntValue28 = ((Integer) obj3).intValue();
                l.e((k1) obj, "$this$TextButton");
                if (!oVar28.N(iIntValue28 & 1, (iIntValue28 & 17) != 16)) {
                    oVar28.Q();
                } else {
                    z8.b(q.g(R.string.btn_confirm), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar28, 0, 0, 131070);
                }
                break;
            default:
                x0.o oVar29 = (x0.o) obj2;
                int iIntValue29 = ((Integer) obj3).intValue();
                l.e((k1) obj, "$this$TextButton");
                if (!oVar29.N(iIntValue29 & 1, (iIntValue29 & 17) != 16)) {
                    oVar29.Q();
                } else {
                    z8.b(q.g(R.string.btn_cancel), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar29, 0, 0, 131070);
                }
                break;
        }
        return a0Var;
    }
}
