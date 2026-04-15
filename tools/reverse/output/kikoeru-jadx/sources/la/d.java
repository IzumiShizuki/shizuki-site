package la;

import android.view.View;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Map;
import m0.a5;
import m0.d3;
import m0.d8;
import m0.l3;
import m0.x1;
import x0.e1;
import x0.o2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements ic.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f11935e;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f11931a = i10;
        this.f11932b = obj;
        this.f11933c = obj2;
        this.f11934d = obj3;
        this.f11935e = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        Object obj4;
        boolean z10;
        int i10 = this.f11931a;
        ub.a0 a0Var = ub.a0.f21526a;
        x0.r0 r0Var = x0.k.f24334a;
        Object obj5 = this.f11935e;
        Object obj6 = this.f11934d;
        Object obj7 = this.f11933c;
        Object obj8 = this.f11932b;
        switch (i10) {
            case 0:
                ic.k kVar = (ic.k) obj8;
                ic.k kVar2 = (ic.k) obj7;
                w.k kVar3 = (w.k) obj6;
                s.m0 m0Var = (s.m0) obj5;
                x0.o oVar = (x0.o) obj2;
                ((Integer) obj3).getClass();
                jc.l.e((j1.q) obj, "$this$composed");
                oVar.W(113280339);
                x0.w0 w0VarY = x0.v.y(kVar, oVar);
                x0.w0 w0VarY2 = x0.v.y(kVar2, oVar);
                x0.w0 w0VarY3 = x0.v.y(null, oVar);
                boolean z11 = kVar2 != null;
                Object objK = oVar.K();
                Object obj9 = objK;
                if (objK == r0Var) {
                    e1 e1VarV = x0.v.v(null);
                    oVar.h0(e1VarV);
                    obj9 = e1VarV;
                }
                x0.w0 w0Var = (x0.w0) obj9;
                oVar.W(-1109294928);
                Boolean boolValueOf = Boolean.valueOf(z11);
                boolean zF = oVar.f(kVar3);
                Object objK2 = oVar.K();
                Object obj10 = objK2;
                if (zF || objK2 == r0Var) {
                    e eVar = new e(w0Var, kVar3, 0);
                    oVar.h0(eVar);
                    obj10 = eVar;
                }
                x0.v.c(boolValueOf, (ic.k) obj10, oVar);
                j.a(kVar3, w0Var, oVar, 48);
                oVar.p(false);
                View view = (View) oVar.j(AndroidCompositionLocals_androidKt.f725f);
                boolean zH = oVar.h(view);
                Object objK3 = oVar.K();
                Object obj11 = objK3;
                if (zH || objK3 == r0Var) {
                    androidx.lifecycle.n0 n0Var = new androidx.lifecycle.n0(16, view);
                    oVar.h0(n0Var);
                    obj11 = n0Var;
                }
                ic.a aVar = (ic.a) obj11;
                Object objK4 = oVar.K();
                Object obj12 = objK4;
                if (objK4 == r0Var) {
                    e1 e1VarV2 = x0.v.v(Boolean.TRUE);
                    oVar.h0(e1VarV2);
                    obj12 = e1VarV2;
                }
                x0.w0 w0Var2 = (x0.w0) obj12;
                boolean zF2 = oVar.f(aVar);
                Object objK5 = oVar.K();
                if (zF2 || objK5 == r0Var) {
                    ba.o0 o0Var = new ba.o0(w0Var2, aVar, 1);
                    oVar.h0(o0Var);
                    obj4 = o0Var;
                } else {
                    obj4 = objK5;
                }
                x0.w0 w0VarY4 = x0.v.y((ic.a) obj4, oVar);
                Object[] objArr = {kVar3, Boolean.valueOf(z11), false, Boolean.TRUE};
                boolean z12 = z11;
                boolean zG = oVar.g(false) | oVar.g(true) | oVar.f(w0VarY3) | oVar.g(z12) | oVar.f(w0VarY2) | oVar.f(kVar3) | oVar.f(w0VarY4) | oVar.f(w0VarY);
                Object objK6 = oVar.K();
                if (zG || objK6 == r0Var) {
                    objK6 = new g(false, z12, w0VarY3, w0VarY2, kVar3, w0Var, w0VarY4, w0VarY);
                    z10 = false;
                    oVar.h0(objK6);
                } else {
                    z10 = false;
                }
                SuspendPointerInputElement suspendPointerInputElement = new SuspendPointerInputElement(null, null, objArr, (PointerInputEventHandler) objK6, 3);
                Object objK7 = oVar.K();
                Object obj13 = objK7;
                if (objK7 == r0Var) {
                    f fVar = new f(w0Var2);
                    oVar.h0(fVar);
                    obj13 = fVar;
                }
                f fVar2 = (f) obj13;
                jc.l.e(fVar2, "$this$genericClickableWithoutGesture");
                j1.q qVarH = androidx.compose.foundation.a.h(androidx.compose.foundation.f.a(androidx.compose.ui.input.key.a.a(q2.m.a(fVar2, true, new h1.l(kVar2, kVar, 2)), new h1.a(kVar, 1)), kVar3, m0Var), kVar3);
                jc.l.e(qVarH, "<this>");
                j1.q qVarE = j1.a.a(qVarH, new ba.l(5, kVar3)).e(suspendPointerInputElement);
                oVar.p(z10);
                break;
            case 1:
                m9.c cVar = (m9.c) obj8;
                x0.w0 w0Var3 = (x0.w0) obj7;
                hf.y yVar = (hf.y) obj6;
                x0.w0 w0Var4 = (x0.w0) obj5;
                d3 d3Var = (d3) obj;
                x0.o oVar2 = (x0.o) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                jc.l.e(d3Var, "$this$ExposedDropdownMenuBox");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? oVar2.f(d3Var) : oVar2.h(d3Var) ? 4 : 2;
                }
                if (oVar2.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    j1.q qVarC = androidx.compose.foundation.layout.c.c(j1.n.f9689a, 1.0f);
                    String str = (String) w0Var3.getValue();
                    i = ((ka.q) cVar.f14994g.getValue()) != ka.q.f11305c ? 0 : 1;
                    d8 d8Var = d8.f12873a;
                    long j10 = q1.q.f17574g;
                    o2 o2Var = m0.c1.f12773a;
                    x1 x1VarF = d8.f(((m0.b1) oVar2.j(o2Var)).f(), ((m0.b1) oVar2.j(o2Var)).f(), j10, j10, j10, j10, oVar2, 2096662);
                    Object objK8 = oVar2.K();
                    if (objK8 == r0Var) {
                        objK8 = new aa.d(w0Var3, 13);
                        oVar2.h0(objK8);
                    }
                    a5.a(str, (ic.k) objK8, qVarC, false, false, null, m9.e.f14997b, null, m9.e.f14998c, f1.g.f(-334326684, new ha.c(cVar, yVar, w0Var3, w0Var4), oVar2), i, null, null, null, true, 0, 0, null, x1VarF, oVar2, 907542960, 24576, 506040);
                    boolean zBooleanValue = ((Boolean) w0Var4.getValue()).booleanValue();
                    Object objK9 = oVar2.K();
                    if (objK9 == r0Var) {
                        objK9 = new aa.f(w0Var4, 25);
                        oVar2.h0(objK9);
                    }
                    d3Var.a(zBooleanValue, (ic.a) objK9, null, null, f1.g.f(-1099586102, new m9.g(w0Var3, w0Var4, false ? 1 : 0), oVar2), oVar2, 24624 | ((iIntValue << 15) & 458752));
                } else {
                    oVar2.Q();
                }
                break;
            case 2:
                x0.w0 w0Var5 = (x0.w0) obj8;
                x0.w0 w0Var6 = (x0.w0) obj7;
                x0.w0 w0Var7 = (x0.w0) obj6;
                x0.w0 w0Var8 = (x0.w0) obj5;
                d3 d3Var2 = (d3) obj;
                x0.o oVar3 = (x0.o) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                jc.l.e(d3Var2, "$this$ExposedDropdownMenuBox");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? oVar3.f(d3Var2) : oVar3.h(d3Var2) ? 4 : 2;
                }
                int i11 = iIntValue2;
                if (oVar3.N(i11 & 1, (i11 & 19) != 18)) {
                    String str2 = ((String[]) na.o.f15732e.getValue())[((Number) w0Var5.getValue()).intValue()];
                    Object objK10 = oVar3.K();
                    if (objK10 == r0Var) {
                        objK10 = new l3(16);
                        oVar3.h0(objK10);
                    }
                    a5.a(str2, (ic.k) objK10, null, false, true, null, q9.a.f17938k, null, null, f1.g.f(1562702787, new aa.g(w0Var6, 14), oVar3), false, null, null, null, false, 0, 0, null, null, oVar3, 806903856, 0, 1047980);
                    boolean zBooleanValue2 = ((Boolean) w0Var6.getValue()).booleanValue();
                    Object objK11 = oVar3.K();
                    if (objK11 == r0Var) {
                        objK11 = new m9.i(w0Var6, w0Var7, w0Var8, 2);
                        oVar3.h0(objK11);
                    }
                    d3Var2.a(zBooleanValue2, (ic.a) objK11, null, null, f1.g.f(1564353705, new m9.g(w0Var5, w0Var6, i), oVar3), oVar3, 24624 | ((i11 << 15) & 458752));
                } else {
                    oVar3.Q();
                }
                break;
            case 3:
                w1.f fVar3 = (w1.f) obj8;
                String str3 = (String) obj7;
                e7.a0 a0Var2 = (e7.a0) obj6;
                String str4 = (String) obj5;
                x0.o oVar4 = (x0.o) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                jc.l.e((a0.d) obj, "$this$item");
                if (oVar4.N(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    w1.i0 i0VarC = w1.b.c(fVar3, oVar4);
                    boolean zH2 = oVar4.h(a0Var2) | oVar4.f(str4);
                    Object objK12 = oVar4.K();
                    if (zH2 || objK12 == r0Var) {
                        objK12 = new a9.d(24, a0Var2, str4, false);
                        oVar4.h0(objK12);
                    }
                    ka.b.g(null, i0VarC, 0L, str3, null, (ic.a) objK12, oVar4, 64, 21);
                } else {
                    oVar4.Q();
                }
                break;
            default:
                Map map = (Map) obj8;
                hg.b bVar = (hg.b) obj7;
                x0.w0 w0Var9 = (x0.w0) obj6;
                x0.w0 w0Var10 = (x0.w0) obj5;
                x0.o oVar5 = (x0.o) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                jc.l.e((y.w) obj, "$this$DropdownMenu");
                if (oVar5.N(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    for (Map.Entry entry : map.entrySet()) {
                        boolean zH3 = oVar5.h(entry) | oVar5.h(bVar) | oVar5.f(w0Var9) | oVar5.f(null);
                        Object objK13 = oVar5.K();
                        if (zH3 || objK13 == r0Var) {
                            objK13 = new ba.e((Object) entry, w0Var10, bVar, w0Var9, 7);
                            oVar5.h0(objK13);
                        }
                        m0.b0.b((ic.a) objK13, null, false, null, f1.g.f(-348514500, new ba.l(15, entry), oVar5), oVar5, 196608, 30);
                    }
                } else {
                    oVar5.Q();
                }
                break;
        }
        return a0Var;
    }
}
