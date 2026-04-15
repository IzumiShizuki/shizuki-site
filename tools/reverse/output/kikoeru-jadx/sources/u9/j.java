package u9;

import a0.g0;
import a0.j0;
import a9.t;
import android.view.View;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.s1;
import f3.m;
import ic.n;
import ic.p;
import j2.l1;
import java.util.ArrayList;
import java.util.List;
import jc.l;
import jc.z;
import m0.p3;
import t2.x;
import ub.k;
import uh.w;
import wf.s0;
import wf.y;
import x0.c0;
import x0.o;
import x0.p1;
import x0.r0;
import x0.v;
import x0.w0;
import xf.r;
import y.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f1.f f21485a = new f1.f(new x(24), 2010326567, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f1.f f21486b = new f1.f(new x(25), -1319315095, false);

    public static final void a(int i10, o oVar) {
        w wVar;
        oVar.Y(1500313288);
        if (oVar.N(i10 & 1, i10 != 0)) {
            i[] iVarArrValues = i.values();
            ArrayList arrayList = new ArrayList(iVarArrValues.length);
            for (i iVar : iVarArrValues) {
                arrayList.add(new k(iVar, Boolean.valueOf(iVar.f21484a)));
            }
            r rVar = na.w.f15765a;
            rVar.getClass();
            y yVar = new y("com.cnl.kikoeru.ui.screen.main.others.card.CardTags", i.values());
            wf.g gVar = wf.g.f24118a;
            String strB = rVar.b(new wf.d(new s0(yVar, gVar, 1), 0), arrayList);
            oVar.W(500600386);
            hg.a aVarA = gg.c.a();
            jc.y yVar2 = new jc.y();
            oVar.W(1849434622);
            Object objK = oVar.K();
            Object obj = x0.k.f24334a;
            if (objK == obj) {
                objK = lc.b.G("cardTagsOrder", strB, aVarA, true, z.a(String.class));
                oVar.h0(objK);
            }
            fg.f fVar = (fg.f) objK;
            oVar.p(false);
            yVar2.f10838a = fVar;
            v.c(fVar, new t(yVar2, 4), oVar);
            fg.f fVar2 = (fg.f) yVar2.f10838a;
            oVar.p(false);
            Object objK2 = oVar.K();
            if (objK2 == obj) {
                objK2 = v.v(rVar.a((String) fVar2.getValue(), new wf.d(new s0(new y("com.cnl.kikoeru.ui.screen.main.others.card.CardTags", i.values()), gVar, 1), 0)));
                oVar.h0(objK2);
            }
            w0 w0Var = (w0) objK2;
            List list = (List) w0Var.getValue();
            boolean zF = oVar.f(fVar2);
            Object objK3 = oVar.K();
            if (zF || objK3 == obj) {
                objK3 = new a(w0Var, fVar2, (yb.c) null);
                oVar.h0(objK3);
            }
            v.e((n) objK3, list, oVar);
            String str = (String) fVar2.getValue();
            boolean zF2 = oVar.f(fVar2);
            Object objK4 = oVar.K();
            if (zF2 || objK4 == obj) {
                objK4 = new a(fVar2, w0Var, (yb.c) null);
                oVar.h0(objK4);
            }
            v.e((n) objK4, str, oVar);
            View view = (View) oVar.j(AndroidCompositionLocals_androidKt.f725f);
            g0 g0VarA = j0.a(oVar);
            boolean zH = oVar.h(view);
            Object objK5 = oVar.K();
            if (zH || objK5 == obj) {
                objK5 = new h(view, w0Var, null);
                oVar.h0(objK5);
            }
            p pVar = (p) objK5;
            l.e(g0VarA, "lazyListState");
            l.e(pVar, "onMove");
            oVar.W(-645045624);
            float f10 = 0;
            e1 e1Var = new e1(f10, f10, f10, f10);
            float f11 = uh.k.f22012a;
            oVar.W(1347434050);
            boolean zF3 = oVar.f(g0VarA);
            Object objK6 = oVar.K();
            if (zF3 || objK6 == obj) {
                objK6 = new uh.v(g0VarA, 0);
                oVar.h0(objK6);
            }
            ic.a aVar = (ic.a) objK6;
            oVar.p(false);
            l.e(aVar, "pixelAmountProvider");
            oVar.W(996643712);
            Object objK7 = oVar.K();
            if (objK7 == obj) {
                Object yVar3 = new x0.y(v.m(oVar));
                oVar.h0(yVar3);
                objK7 = yVar3;
            }
            hf.y yVar4 = ((x0.y) objK7).f24523a;
            w0 w0VarY = v.y(aVar, oVar);
            w0 w0VarY2 = v.y(100L, oVar);
            oVar.W(1852585201);
            boolean zF4 = oVar.f(g0VarA) | oVar.f(yVar4) | oVar.e(100L);
            Object objK8 = oVar.K();
            if (zF4 || objK8 == obj) {
                objK8 = new uh.g0(g0VarA, yVar4, new s1(19, w0VarY, w0VarY2));
                oVar.h0(objK8);
            }
            uh.g0 g0Var = (uh.g0) objK8;
            oVar.p(false);
            oVar.p(false);
            f3.c cVar = (f3.c) oVar.j(l1.f9866h);
            float fQ = cVar.Q(f11);
            Object objK9 = oVar.K();
            if (objK9 == obj) {
                Object yVar5 = new x0.y(v.m(oVar));
                oVar.h0(yVar5);
                objK9 = yVar5;
            }
            hf.y yVar6 = ((x0.y) objK9).f24523a;
            w0 w0VarY3 = v.y(pVar, oVar);
            m mVar = (m) oVar.j(l1.f9872n);
            uh.a aVar2 = new uh.a(cVar.Q(androidx.compose.foundation.layout.a.e(e1Var, mVar)), cVar.Q(androidx.compose.foundation.layout.a.d(e1Var, mVar)), cVar.Q(f10), cVar.Q(f10));
            oVar.W(1347465600);
            boolean zF5 = oVar.f(g0VarA);
            Object objK10 = oVar.K();
            if (zF5 || objK10 == obj) {
                objK10 = new uh.v(g0VarA, 1);
                oVar.h0(objK10);
            }
            oVar.p(false);
            c0 c0VarO = v.o((ic.a) objK10);
            Object obj2 = (u.e1) c0VarO.getValue();
            oVar.W(1347468268);
            boolean zF6 = oVar.f(e1Var) | oVar.c(f11) | oVar.f(yVar6) | oVar.f(g0VarA) | oVar.f(g0Var) | oVar.f(obj2);
            Object objK11 = oVar.K();
            if (zF6 || objK11 == obj) {
                int iOrdinal = ((u.e1) c0VarO.getValue()).ordinal();
                if (iOrdinal == 0) {
                    wVar = w.f22065c;
                } else {
                    if (iOrdinal != 1) {
                        throw new ce.j0();
                    }
                    wVar = w.f22066d;
                }
                w wVar2 = wVar;
                l.e(g0Var, "scroller");
                l.e(mVar, "layoutDirection");
                objK11 = new uh.y(new a0.z(g0VarA), yVar6, w0VarY3, fQ, aVar2, g0Var, mVar, wVar2);
                oVar.h0(objK11);
            }
            Object obj3 = (uh.y) objK11;
            oVar.p(false);
            oVar.p(false);
            FillElement fillElement = androidx.compose.foundation.layout.c.f557c;
            float f12 = 5;
            e1 e1Var2 = new e1(f12, f12, f12, f12);
            y.g gVarG = y.k.g(f12);
            boolean zF7 = oVar.f(obj3) | oVar.h(view);
            Object objK12 = oVar.K();
            if (zF7 || objK12 == obj) {
                objK12 = new ba.i(w0Var, obj3, view, 13);
                oVar.h0(objK12);
            }
            a.a.g(24966, 488, g0VarA, (ic.k) objK12, null, fillElement, null, null, oVar, gVarG, e1Var2, false);
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new x(i10, 22);
        }
    }

    public static final void b(int i10, o oVar) {
        o oVar2;
        oVar.Y(1213684685);
        if (oVar.N(i10 & 1, i10 != 0)) {
            i[] iVarArrValues = i.values();
            ArrayList arrayList = new ArrayList(iVarArrValues.length);
            for (i iVar : iVarArrValues) {
                arrayList.add(new k(iVar, Boolean.valueOf(iVar.f21484a)));
            }
            r rVar = na.w.f15765a;
            rVar.getClass();
            String strB = rVar.b(new wf.d(new s0(new y("com.cnl.kikoeru.ui.screen.main.others.card.CardTags", i.values()), wf.g.f24118a, 1), 0), arrayList);
            oVar.W(500600386);
            hg.a aVarA = gg.c.a();
            jc.y yVar = new jc.y();
            oVar.W(1849434622);
            Object objK = oVar.K();
            r0 r0Var = x0.k.f24334a;
            if (objK == r0Var) {
                objK = lc.b.G("cardTagsOrder", strB, aVarA, true, z.a(String.class));
                oVar.h0(objK);
            }
            fg.f fVar = (fg.f) objK;
            oVar.p(false);
            yVar.f10838a = fVar;
            v.c(fVar, new t(yVar, 5), oVar);
            fg.f fVar2 = (fg.f) yVar.f10838a;
            oVar.p(false);
            boolean zF = oVar.f(fVar2);
            Object objK2 = oVar.K();
            if (zF || objK2 == r0Var) {
                objK2 = new t9.f(1, fVar2);
                oVar.h0(objK2);
            }
            oVar2 = oVar;
            p3.a((ic.a) objK2, null, false, f21486b, oVar2, 24576, 14);
        } else {
            oVar2 = oVar;
            oVar2.Q();
        }
        p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new x(i10, 21);
        }
    }
}
