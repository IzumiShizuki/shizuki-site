package cg;

import android.app.Activity;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.s1;
import h0.d1;
import x0.r0;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h extends jc.m implements ic.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ic.k f4043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ub.e f4044e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, ic.k kVar, ub.e eVar, int i10) {
        super(3);
        this.f4041b = i10;
        this.f4042c = obj;
        this.f4043d = kVar;
        this.f4044e = eVar;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        int i10;
        int i11 = this.f4041b;
        r0 r0Var = x0.k.f24334a;
        boolean z10 = true;
        ub.e eVar = this.f4044e;
        Object obj4 = this.f4042c;
        switch (i11) {
            case 0:
                j1.q qVar = (j1.q) obj;
                x0.o oVar = (x0.o) obj2;
                ((Number) obj3).intValue();
                jc.l.e(qVar, "$this$composed");
                oVar.X(960333704);
                Object objJ = oVar.j(AndroidCompositionLocals_androidKt.f721b);
                jc.l.c(objJ, "null cannot be cast to non-null type android.app.Activity");
                Activity activity = (Activity) objJ;
                oVar.X(911578316);
                Object objK = oVar.K();
                if (objK == r0Var) {
                    objK = x0.v.v(new f3.l(0L));
                    oVar.h0(objK);
                }
                w0 w0Var = (w0) objK;
                oVar.p(false);
                oVar.X(911578376);
                Object objK2 = oVar.K();
                if (objK2 == r0Var) {
                    objK2 = new c(w0Var, 1);
                    oVar.h0(objK2);
                }
                oVar.p(false);
                j1.q qVarE = androidx.compose.ui.layout.a.e(qVar, (ic.k) objK2);
                g gVar = new g(activity, (b) obj4, w0Var, (c) this.f4043d, (d) eVar, null, 0);
                c2.l lVar = c2.e0.f3261a;
                j1.q qVarE2 = qVarE.e(new SuspendPointerInputElement("音量、亮度", null, null, new c2.d0(gVar), 6));
                oVar.p(false);
                return qVarE2;
            default:
                j1.q qVar2 = (j1.q) obj;
                x0.o oVar2 = (x0.o) obj2;
                ((Number) obj3).intValue();
                ic.a aVar = (ic.a) eVar;
                uh.j jVar = (uh.j) obj4;
                jc.l.e(qVar2, "$this$composed");
                oVar2.W(-1794533607);
                oVar2.W(-1020129731);
                Object objK3 = oVar2.K();
                if (objK3 == r0Var) {
                    objK3 = x0.v.v(new p1.b(0L));
                    oVar2.h0(objK3);
                }
                w0 w0Var2 = (w0) objK3;
                oVar2.p(false);
                oVar2.W(-1020127586);
                Object objK4 = oVar2.K();
                if (objK4 == r0Var) {
                    objK4 = x0.v.v(new f3.l(0L));
                    oVar2.h0(objK4);
                }
                w0 w0Var3 = (w0) objK4;
                oVar2.p(false);
                Object objK5 = oVar2.K();
                if (objK5 == r0Var) {
                    x0.y yVar = new x0.y(x0.v.m(oVar2));
                    oVar2.h0(yVar);
                    objK5 = yVar;
                }
                hf.y yVar2 = ((x0.y) objK5).f24523a;
                oVar2.W(-1020123472);
                Object objK6 = oVar2.K();
                if (objK6 == r0Var) {
                    objK6 = new eg.c(w0Var2, w0Var3, 2);
                    oVar2.h0(objK6);
                }
                oVar2.p(false);
                j1.q qVarD = androidx.compose.ui.layout.a.d(qVar2, (ic.k) objK6);
                uh.y yVar3 = jVar.f22009a;
                Object obj5 = jVar.f22010b;
                yVar3.getClass();
                jc.l.e(obj5, "key");
                if (!((Boolean) x0.v.o(new s1(18, obj5, yVar3)).getValue()).booleanValue() && ((Boolean) jVar.f22009a.f22080k.getValue()).booleanValue()) {
                    z10 = false;
                }
                oVar2.W(-1020110929);
                boolean zH = oVar2.h(yVar2) | oVar2.f(jVar);
                ic.k kVar = this.f4043d;
                boolean zF = zH | oVar2.f(kVar);
                uh.j jVar2 = (uh.j) obj4;
                Object objK7 = oVar2.K();
                if (zF || objK7 == r0Var) {
                    i10 = 18;
                    d1 d1Var = new d1(yVar2, kVar, jVar2, w0Var2, w0Var3, 4);
                    oVar2.h0(d1Var);
                    objK7 = d1Var;
                } else {
                    i10 = 18;
                }
                ic.k kVar2 = (ic.k) objK7;
                oVar2.p(false);
                oVar2.W(-1020094176);
                boolean zF2 = oVar2.f(jVar) | oVar2.f(aVar);
                Object objK8 = oVar2.K();
                if (zF2 || objK8 == r0Var) {
                    objK8 = new s1(17, jVar, aVar);
                    oVar2.h0(objK8);
                }
                ic.a aVar2 = (ic.a) objK8;
                oVar2.p(false);
                oVar2.W(-1020089987);
                boolean zF3 = oVar2.f(jVar);
                Object objK9 = oVar2.K();
                if (zF3 || objK9 == r0Var) {
                    objK9 = new d(i10, jVar);
                    oVar2.h0(objK9);
                }
                ic.n nVar = (ic.n) objK9;
                oVar2.p(false);
                jc.l.e(qVarD, "<this>");
                jc.l.e(kVar2, "onDragStarted");
                jc.l.e(aVar2, "onDragStopped");
                jc.l.e(nVar, "onDrag");
                j1.q qVarA = j1.a.a(qVarD, new uh.g(yVar3, aVar2, z10, kVar2, nVar));
                oVar2.p(false);
                return qVarA;
        }
    }
}
