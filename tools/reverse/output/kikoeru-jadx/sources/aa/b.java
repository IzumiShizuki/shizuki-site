package aa;

import androidx.compose.foundation.layout.FillElement;
import cg.v;
import com.cnl.kikoeru.R;
import com.tencent.bugly.beta.tinker.TinkerReport;
import g2.v0;
import hd.q0;
import hf.y;
import i2.i;
import i2.j;
import i2.k;
import ic.o;
import j1.n;
import j1.q;
import j2.h0;
import java.util.Timer;
import jc.l;
import jc.z;
import m0.r3;
import m0.z8;
import pc.f0;
import q1.n0;
import u3.x0;
import ub.a0;
import w1.g0;
import x0.e1;
import x0.j1;
import x0.r0;
import x0.w0;
import y.k1;
import y.p;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f279a;

    public /* synthetic */ b(int i10) {
        this.f279a = i10;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        v vVar = (v) obj;
        x0.o oVar = (x0.o) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        l.e(vVar, "it");
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? oVar.f(vVar) : oVar.h(vVar) ? 4 : 2;
        }
        if (oVar.N(iIntValue & 1, (iIntValue & 19) != 18)) {
            FillElement fillElement = androidx.compose.foundation.layout.c.f557c;
            v0 v0VarD = p.d(j1.c.f9662a, false);
            int iQ = x0.v.q(oVar);
            j1 j1VarL = oVar.l();
            q qVarC = j1.a.c(fillElement, oVar);
            k.f8771g0.getClass();
            i iVar = j.f8733b;
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            x0.v.A(j.f8738g, v0VarD, oVar);
            x0.v.A(j.f8737f, j1VarL, oVar);
            i2.h hVar = j.f8741j;
            if (oVar.S || !l.a(oVar.K(), Integer.valueOf(iQ))) {
                h0.s(iQ, oVar, iQ, hVar);
            }
            x0.v.A(j.f8735d, qVarC, oVar);
            int i10 = iIntValue & 14;
            gh.g.f(vVar, fillElement, oVar, 3128 | i10);
            j1.h hVar2 = j1.c.f9663b;
            androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f554a;
            n nVar = n.f9689a;
            int i11 = i10 | 8;
            a2.c.o(vVar, bVar.a(nVar, hVar2), oVar, i11);
            a2.c.n(vVar, bVar.a(nVar, j1.c.f9669h), oVar, i11);
            int i12 = ((iIntValue << 3) & 112) | 70;
            a2.c.j(vVar, oVar, i12);
            a2.c.l(vVar, oVar, i12);
            oVar.p(true);
        } else {
            oVar.Q();
        }
        return a0.f21526a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        f1.f fVarF;
        ka.g gVar = (ka.g) obj;
        x0.o oVar = (x0.o) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        l.e(gVar, "it");
        if ((iIntValue & 6) == 0) {
            iIntValue |= oVar.f(gVar) ? 4 : 2;
        }
        if (oVar.N(iIntValue & 1, (iIntValue & 19) != 18)) {
            q qVar = gVar.f11258c;
            j3.q qVar2 = gVar.f11262g;
            String str = gVar.f11257b;
            if (str == null) {
                oVar.W(609238562);
                oVar.p(false);
                fVarF = null;
            } else {
                oVar.W(609238563);
                fVarF = f1.g.f(2075590821, new ba.p(8, str), oVar);
                oVar.p(false);
            }
            boolean z10 = (iIntValue & 14) == 4;
            Object objK = oVar.K();
            if (z10 || objK == x0.k.f24334a) {
                objK = new ka.c(gVar, 0);
                oVar.h0(objK);
            }
            a2.c.b((ic.a) objK, f1.g.f(1718080867, new ka.d(gVar, 0), oVar), qVar, f1.g.f(1931697953, new ka.d(gVar, 1), oVar), fVarF, f1.g.f(2145315039, new ka.d(gVar, 2), oVar), null, 0L, 0L, qVar2, oVar, 199728, 448);
        } else {
            oVar.Q();
        }
        return a0.f21526a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        x0.o oVar = (x0.o) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        l.e((k1) obj, "$this$SwipeToDismiss");
        if (!oVar.N(iIntValue & 1, (iIntValue & 17) != 16)) {
            oVar.Q();
        }
        return a0.f21526a;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        x0.o oVar = (x0.o) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        l.e((k1) obj, "$this$FilledLongClickChip");
        if (oVar.N(iIntValue & 1, (iIntValue & 17) != 16)) {
            z8.b(na.q.g(R.string.has_local_subtitle), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar, 0, 0, 131070);
        } else {
            oVar.Q();
        }
        return a0.f21526a;
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        x0.o oVar = (x0.o) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        l.e((k1) obj, "$this$FilledLongClickChip");
        if (oVar.N(iIntValue & 1, (iIntValue & 17) != 16)) {
            z8.b(na.q.g(R.string.has_subtitle), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar, 0, 0, 131070);
        } else {
            oVar.Q();
        }
        return a0.f21526a;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        x0.o oVar;
        int i10 = this.f279a;
        Class cls = Boolean.TYPE;
        r0 r0Var = x0.k.f24334a;
        a0 a0Var = a0.f21526a;
        int i11 = 16;
        switch (i10) {
            case 0:
                x0.o oVar2 = (x0.o) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                l.e((y8.i) obj, "$this$prefsItem");
                if (oVar2.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    a.a(0, oVar2);
                } else {
                    oVar2.Q();
                }
                return a0Var;
            case 1:
                x0.o oVar3 = (x0.o) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                l.e((y8.i) obj, "$this$prefsItem");
                if (oVar3.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    Object objK = oVar3.K();
                    if (objK == r0Var) {
                        objK = lc.b.G("useListLayout", Boolean.FALSE, gg.c.a(), false, z.a(cls));
                        oVar3.h0(objK);
                    }
                    fg.f fVar = (fg.f) objK;
                    a.b(fVar, oVar3, 6);
                    if (((Boolean) fVar.getValue()).booleanValue()) {
                        oVar3.W(205234050);
                        z8.l.a("listMinWidthHorizontal", na.q.g(R.string.list_min_width_horizontal), null, 360.0f, null, new oc.a(150.0f, 500.0f), true, null, 0L, false, oVar3, 1575942, 3988);
                        oVar = oVar3;
                        oVar.p(false);
                    } else {
                        oVar = oVar3;
                        oVar.W(205580134);
                        z8.l.a("listMinWidthVertical", na.q.g(R.string.list_min_width_vertical), null, 170.0f, null, new oc.a(100.0f, 250.0f), true, null, 0L, false, oVar, 1575942, 3988);
                        oVar.p(false);
                    }
                    z8.a.a(na.q.g(R.string.card_min_width_summary), null, null, false, false, null, 0L, false, null, null, oVar, 12582912, 894);
                } else {
                    oVar3.Q();
                }
                return a0Var;
            case 2:
                x0.o oVar4 = (x0.o) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                l.e((y8.i) obj, "$this$prefsItem");
                if (oVar4.N(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    z8.n.a("cardBackgroundColor", na.q.g(R.string.colored_card_background), null, na.q.g(R.string.colored_card_background_summary), false, null, 0L, false, oVar4, 24582, 484);
                } else {
                    oVar4.Q();
                }
                return a0Var;
            case 3:
                x0.o oVar5 = (x0.o) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                l.e((y8.i) obj, "$this$prefsItem");
                if (oVar5.N(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    String strG = na.q.g(R.string.home_recommend);
                    String strG2 = na.q.g(R.string.recommend_summary);
                    Object objK2 = oVar5.K();
                    if (objK2 == r0Var) {
                        objK2 = new a9.n(18);
                        oVar5.h0(objK2);
                    }
                    z8.n.a("homePageRecommend", strG, null, strG2, true, (ic.k) objK2, 0L, false, oVar5, 221190, TinkerReport.KEY_LOADED_INTERPRET_TYPE_INTERPRET_OK);
                } else {
                    oVar5.Q();
                }
                return a0Var;
            case 4:
                x0.o oVar6 = (x0.o) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                l.e((y8.i) obj, "$this$prefsItem");
                if (oVar6.N(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    z8.n.a("musicPageRecommend", na.q.g(R.string.music_recommend), null, na.q.g(R.string.recommend_summary), true, null, 0L, false, oVar6, 24582, 484);
                } else {
                    oVar6.Q();
                }
                return a0Var;
            case 5:
                x0.o oVar7 = (x0.o) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                l.e((y8.i) obj, "$this$prefsItem");
                if (oVar7.N(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    z8.n.a("sharedElementTranslation", na.q.g(R.string.shared_element_translation), null, na.q.g(R.string.shared_element_translation_summary), false, null, 0L, false, oVar7, 24582, 484);
                } else {
                    oVar7.Q();
                }
                return a0Var;
            case 6:
                x0.o oVar8 = (x0.o) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                l.e((y8.i) obj, "$this$prefsItem");
                if (oVar8.N(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    z8.n.a("leftDrawer", na.q.g(R.string.use_left_drawer), null, na.q.g(R.string.left_drawer_summary), false, null, 0L, false, oVar8, 24582, 484);
                } else {
                    oVar8.Q();
                }
                return a0Var;
            case 7:
                x0.o oVar9 = (x0.o) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                l.e((y8.i) obj, "$this$prefsItem");
                if (oVar9.N(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    hg.a aVar = (hg.a) oVar9.j(y8.c.e());
                    Object objK3 = oVar9.K();
                    Object obj4 = objK3;
                    if (objK3 == r0Var) {
                        e1 e1VarV = x0.v.v(f0.P(aVar, "backgroundEnable", Boolean.FALSE, z.a(cls)).a());
                        oVar9.h0(e1VarV);
                        obj4 = e1VarV;
                    }
                    w0 w0Var = (w0) obj4;
                    String strG3 = na.q.g(R.string.enable_background);
                    Object objK4 = oVar9.K();
                    Object obj5 = objK4;
                    if (objK4 == r0Var) {
                        d dVar = new d(w0Var, 0);
                        oVar9.h0(dVar);
                        obj5 = dVar;
                    }
                    z8.n.a("backgroundEnable", strG3, null, null, false, (ic.k) obj5, 0L, false, oVar9, 221190, 460);
                    Object objK5 = oVar9.K();
                    Object obj6 = objK5;
                    if (objK5 == r0Var) {
                        y yVarM = x0.v.m(oVar9);
                        oVar9.h0(yVarM);
                        obj6 = yVarM;
                    }
                    y yVar = (y) obj6;
                    h.a aVar2 = new h.a(z ? 1 : 0);
                    boolean zH = oVar9.h(yVar);
                    Object objK6 = oVar9.K();
                    Object obj7 = objK6;
                    if (zH || objK6 == r0Var) {
                        e eVar = new e(yVar, z ? 1 : 0);
                        oVar9.h0(eVar);
                        obj7 = eVar;
                    }
                    e.h hVarL = a.a.L(aVar2, (ic.k) obj7, oVar9, 0);
                    String strG4 = na.q.g(R.string.choose_background);
                    boolean zBooleanValue = ((Boolean) w0Var.getValue()).booleanValue();
                    boolean zH2 = oVar9.h(hVarL);
                    Object objK7 = oVar9.K();
                    Object obj8 = objK7;
                    if (zH2 || objK7 == r0Var) {
                        c cVar = new c(hVarL, 0);
                        oVar9.h0(cVar);
                        obj8 = cVar;
                    }
                    z8.a.a(strG4, null, null, false, false, (ic.a) obj8, 0L, zBooleanValue, null, null, oVar9, 0, 862);
                    String strG5 = na.q.g(R.string.restore_default_background);
                    boolean zBooleanValue2 = ((Boolean) w0Var.getValue()).booleanValue();
                    Object objK8 = oVar9.K();
                    Object obj9 = objK8;
                    if (objK8 == r0Var) {
                        a9.g gVar = new a9.g(15);
                        oVar9.h0(gVar);
                        obj9 = gVar;
                    }
                    z8.a.a(strG5, null, null, false, false, (ic.a) obj9, 0L, zBooleanValue2, null, null, oVar9, 196608, 862);
                    String strG6 = na.q.g(R.string.background_alpha);
                    boolean zBooleanValue3 = ((Boolean) w0Var.getValue()).booleanValue();
                    Object objK9 = oVar9.K();
                    Object obj10 = objK9;
                    if (objK9 == r0Var) {
                        a9.n nVar = new a9.n(i11);
                        oVar9.h0(nVar);
                        obj10 = nVar;
                    }
                    z8.l.a("backgroundAlpha", strG6, null, 0.7f, (ic.k) obj10, null, true, null, 0L, zBooleanValue3, oVar9, 1600518, 2980);
                    String strG7 = na.q.g(R.string.background_blur);
                    oc.a aVar3 = new oc.a(0.0f, 25.0f);
                    boolean zBooleanValue4 = ((Boolean) w0Var.getValue()).booleanValue();
                    Object objK10 = oVar9.K();
                    Object obj11 = objK10;
                    if (objK10 == r0Var) {
                        a9.n nVar2 = new a9.n(17);
                        oVar9.h0(nVar2);
                        obj11 = nVar2;
                    }
                    z8.l.a("backgroundBlur", strG7, null, 3.0f, (ic.k) obj11, aVar3, true, null, 0L, zBooleanValue4, oVar9, 1600518, 2948);
                } else {
                    oVar9.Q();
                }
                return a0Var;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                x0.o oVar10 = (x0.o) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                l.e((k1) obj, "$this$TextButton");
                if (oVar10.N(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    z8.b(na.q.g(R.string.btn_delete), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar10, 0, 0, 131070);
                } else {
                    oVar10.Q();
                }
                return a0Var;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                x0.o oVar11 = (x0.o) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                l.e((k1) obj, "$this$TextButton");
                if (oVar11.N(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    z8.b(na.q.g(R.string.btn_cancel), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar11, 0, 0, 131070);
                } else {
                    oVar11.Q();
                }
                return a0Var;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                x0.o oVar12 = (x0.o) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                l.e((k1) obj, "$this$TextButton");
                if (oVar12.N(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    z8.b(na.q.g(R.string.btn_confirm), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar12, 0, 0, 131070);
                } else {
                    oVar12.Q();
                }
                return a0Var;
            case 11:
                x0.o oVar13 = (x0.o) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                l.e((k1) obj, "$this$TextButton");
                if (oVar13.N(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    z8.b(na.q.g(R.string.dont_show_again), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar13, 0, 0, 131070);
                } else {
                    oVar13.Q();
                }
                return a0Var;
            case 12:
                x0.o oVar14 = (x0.o) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                l.e((c0.h) obj, "$this$item");
                if (oVar14.N(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    f0.b(null, 0L, 0.0f, 0.0f, oVar14, 0, 15);
                } else {
                    oVar14.Q();
                }
                return a0Var;
            case 13:
                x0.o oVar15 = (x0.o) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                l.e((k1) obj, "$this$DropdownMenuItem");
                if (oVar15.N(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    r3.b(x0.t(), "AdvancedComment", androidx.compose.foundation.layout.a.n(n.f9689a, 0.0f, 0.0f, 10, 0.0f, 11), 0L, oVar15, 432, 8);
                    z8.b(na.q.g(R.string.advanced_comment), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar15, 0, 0, 131070);
                } else {
                    oVar15.Q();
                }
                return a0Var;
            case 14:
                x0.o oVar16 = (x0.o) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                l.e((k1) obj, "$this$DropdownMenuItem");
                if (oVar16.N(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    r3.b(nd.h.n(), "AddSubtitles", androidx.compose.foundation.layout.a.n(n.f9689a, 0.0f, 0.0f, 10, 0.0f, 11), 0L, oVar16, 432, 8);
                    z8.b(na.q.g(R.string.add_subtitle_manual), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar16, 0, 0, 131070);
                } else {
                    oVar16.Q();
                }
                return a0Var;
            case 15:
                x0.o oVar17 = (x0.o) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                l.e((k1) obj, "$this$DropdownMenuItem");
                if (oVar17.N(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    w1.f fVarB = n7.d.f15448j;
                    if (fVarB == null) {
                        w1.e eVar2 = new w1.e("Filled.Refresh", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i12 = g0.f23208a;
                        n0 n0Var = new n0(q1.q.f17569b);
                        q0 q0VarH = h0.h(17.65f, 6.35f);
                        q0VarH.m(16.2f, 4.9f, 14.21f, 4.0f, 12.0f, 4.0f);
                        q0VarH.n(-4.42f, 0.0f, -7.99f, 3.58f, -7.99f, 8.0f);
                        q0VarH.w(3.57f, 8.0f, 7.99f, 8.0f);
                        q0VarH.n(3.73f, 0.0f, 6.84f, -2.55f, 7.73f, -6.0f);
                        q0VarH.r(-2.08f);
                        q0VarH.n(-0.82f, 2.33f, -3.04f, 4.0f, -5.65f, 4.0f);
                        q0VarH.n(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
                        q0VarH.w(2.69f, -6.0f, 6.0f, -6.0f);
                        q0VarH.n(1.66f, 0.0f, 3.14f, 0.69f, 4.22f, 1.78f);
                        q0VarH.s(13.0f, 11.0f);
                        q0VarH.r(7.0f);
                        q0VarH.y(4.0f);
                        q0VarH.t(-2.35f, 2.35f);
                        q0VarH.l();
                        w1.e.a(eVar2, q0VarH.f8447b, 0, n0Var);
                        fVarB = eVar2.b();
                        n7.d.f15448j = fVarB;
                    }
                    r3.b(fVarB, "Refresh", androidx.compose.foundation.layout.a.n(n.f9689a, 0.0f, 0.0f, 10, 0.0f, 11), 0L, oVar17, 432, 8);
                    z8.b(na.q.g(R.string.refresh), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar17, 0, 0, 131070);
                } else {
                    oVar17.Q();
                }
                return a0Var;
            case 16:
                x0.o oVar18 = (x0.o) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                l.e((k1) obj, "$this$DropdownMenuItem");
                if (oVar18.N(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    r3.b(n7.e.r(), "Copy", androidx.compose.foundation.layout.a.n(n.f9689a, 0.0f, 0.0f, 10, 0.0f, 11), 0L, oVar18, 432, 8);
                    z8.b(na.q.g(R.string.copy_asmr_one), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar18, 0, 0, 131070);
                } else {
                    oVar18.Q();
                }
                return a0Var;
            case 17:
                x0.o oVar19 = (x0.o) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                l.e((k1) obj, "$this$DropdownMenuItem");
                if (oVar19.N(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    r3.b(nh.a.s(), "Share", androidx.compose.foundation.layout.a.n(n.f9689a, 0.0f, 0.0f, 10, 0.0f, 11), 0L, oVar19, 432, 8);
                    z8.b(na.q.g(R.string.share_asmr_one), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar19, 0, 0, 131070);
                } else {
                    oVar19.Q();
                }
                return a0Var;
            case 18:
                x0.o oVar20 = (x0.o) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                l.e((k1) obj, "$this$DropdownMenuItem");
                if (oVar20.N(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    w1.f fVarB2 = n7.d.f15447i;
                    if (fVarB2 == null) {
                        w1.e eVar3 = new w1.e("Filled.OpenInBrowser", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i13 = g0.f23208a;
                        n0 n0Var2 = new n0(q1.q.f17569b);
                        q0 q0Var = new q0((byte) 0, 6);
                        q0Var.u(19.0f, 4.0f);
                        q0Var.s(5.0f, 4.0f);
                        q0Var.n(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        q0Var.z(12.0f);
                        q0Var.n(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
                        q0Var.r(4.0f);
                        q0Var.z(-2.0f);
                        q0Var.s(5.0f, 18.0f);
                        q0Var.s(5.0f, 8.0f);
                        q0Var.r(14.0f);
                        q0Var.z(10.0f);
                        q0Var.r(-4.0f);
                        q0Var.z(2.0f);
                        q0Var.r(4.0f);
                        q0Var.n(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        q0Var.s(21.0f, 6.0f);
                        q0Var.n(0.0f, -1.1f, -0.89f, -2.0f, -2.0f, -2.0f);
                        q0Var.l();
                        q0Var.u(12.0f, 10.0f);
                        q0Var.t(-4.0f, 4.0f);
                        q0Var.r(3.0f);
                        q0Var.z(6.0f);
                        q0Var.r(2.0f);
                        q0Var.z(-6.0f);
                        q0Var.r(3.0f);
                        q0Var.t(-4.0f, -4.0f);
                        q0Var.l();
                        w1.e.a(eVar3, q0Var.f8447b, 0, n0Var2);
                        fVarB2 = eVar3.b();
                        n7.d.f15447i = fVarB2;
                    }
                    r3.b(fVarB2, "OpenInBrowser", androidx.compose.foundation.layout.a.n(n.f9689a, 0.0f, 0.0f, 10, 0.0f, 11), 0L, oVar20, 432, 8);
                    z8.b(na.q.g(R.string.open_dlsite_in_browser), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar20, 0, 0, 131070);
                } else {
                    oVar20.Q();
                }
                return a0Var;
            case 19:
                x0.o oVar21 = (x0.o) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                l.e((k1) obj, "$this$TextButton");
                if (oVar21.N(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    z8.b(na.q.g(R.string.create_new), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar21, 0, 0, 131070);
                } else {
                    oVar21.Q();
                }
                return a0Var;
            case 20:
                x0.o oVar22 = (x0.o) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                l.e((k1) obj, "$this$TextButton");
                if (oVar22.N(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    z8.b(na.q.g(R.string.btn_confirm), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar22, 0, 0, 131070);
                } else {
                    oVar22.Q();
                }
                return a0Var;
            case 21:
                fa.v vVar = fa.v.f7039a;
                x0.o oVar23 = (x0.o) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                l.e((k1) obj, "$this$Button");
                if (oVar23.N(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    z8.b(((Timer) fa.v.f7045g.getValue()) == null ? na.q.g(R.string.start) : na.q.g(R.string.stop), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar23, 0, 0, 131070);
                } else {
                    oVar23.Q();
                }
                return a0Var;
            case 22:
                x0.o oVar24 = (x0.o) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                l.e((k1) obj, "$this$TextButton");
                if (oVar24.N(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    z8.b(n7.e.E(R.string.cancel, oVar24), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar24, 0, 0, 131070);
                } else {
                    oVar24.Q();
                }
                return a0Var;
            case 23:
                x0.o oVar25 = (x0.o) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                l.e((k1) obj, "$this$TextButton");
                if (oVar25.N(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    z8.b(na.q.g(R.string.copy), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar25, 0, 0, 131070);
                } else {
                    oVar25.Q();
                }
                return a0Var;
            case 24:
                return f(obj, obj2, obj3);
            case 25:
                return h(obj, obj2, obj3);
            case 26:
                return i(obj, obj2, obj3);
            case 27:
                return j(obj, obj2, obj3);
            case 28:
                return m(obj, obj2, obj3);
            default:
                x0.o oVar26 = (x0.o) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                l.e((k1) obj, "$this$OutlinedLongClickChip");
                if (oVar26.N(iIntValue25 & 1, (iIntValue25 & 17) != 16)) {
                    z8.b(na.q.g(R.string.multilingual), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar26, 0, 0, 131070);
                } else {
                    oVar26.Q();
                }
                return a0Var;
        }
    }
}
