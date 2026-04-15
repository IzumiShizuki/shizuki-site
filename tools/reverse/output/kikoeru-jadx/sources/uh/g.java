package uh;

import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import b0.o0;
import x0.r0;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g extends jc.m implements ic.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ic.a f21994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f21995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ic.k f21996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ic.n f21997f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Object obj, ic.a aVar, boolean z10, ic.k kVar, ic.n nVar) {
        super(3);
        this.f21993b = obj;
        this.f21994c = aVar;
        this.f21995d = z10;
        this.f21996e = kVar;
        this.f21997f = nVar;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        j1.q qVar = (j1.q) obj;
        x0.o oVar = (x0.o) obj2;
        ((Number) obj3).intValue();
        jc.l.e(qVar, "$this$composed");
        oVar.W(251188795);
        Object objK = oVar.K();
        r0 r0Var = x0.k.f24334a;
        if (objK == r0Var) {
            x0.y yVar = new x0.y(x0.v.m(oVar));
            oVar.h0(yVar);
            objK = yVar;
        }
        hf.y yVar2 = ((x0.y) objK).f24523a;
        oVar.W(-98755228);
        Object objK2 = oVar.K();
        if (objK2 == r0Var) {
            objK2 = x0.v.v(null);
            oVar.h0(objK2);
        }
        w0 w0Var = (w0) objK2;
        oVar.p(false);
        oVar.W(-98752659);
        Object objK3 = oVar.K();
        if (objK3 == r0Var) {
            objK3 = x0.v.v(Boolean.FALSE);
            oVar.h0(objK3);
        }
        w0 w0Var2 = (w0) objK3;
        oVar.p(false);
        oVar.W(-98750263);
        boolean zH = oVar.h(yVar2) | oVar.f(null);
        ic.a aVar = this.f21994c;
        boolean zF = zH | oVar.f(aVar);
        Object objK4 = oVar.K();
        if (zF || objK4 == r0Var) {
            o0 o0Var = new o0(aVar, w0Var2, w0Var, yVar2, 6);
            oVar.h0(o0Var);
            objK4 = o0Var;
        }
        oVar.p(false);
        Object obj4 = this.f21993b;
        x0.v.c(obj4, (ic.k) objK4, oVar);
        boolean z10 = this.f21995d;
        Boolean boolValueOf = Boolean.valueOf(z10);
        oVar.W(-98735032);
        boolean zG = oVar.g(z10) | oVar.h(yVar2) | oVar.f(null);
        ic.k kVar = this.f21996e;
        boolean zF2 = zG | oVar.f(kVar) | oVar.f(aVar);
        ic.n nVar = this.f21997f;
        boolean zF3 = zF2 | oVar.f(nVar);
        Object objK5 = oVar.K();
        if (zF3 || objK5 == r0Var) {
            f fVar = new f(this.f21995d, nVar, kVar, w0Var2, yVar2, w0Var, aVar, null);
            oVar.h0(fVar);
            objK5 = fVar;
        }
        oVar.p(false);
        c2.l lVar = c2.e0.f3261a;
        j1.q qVarE = qVar.e(new SuspendPointerInputElement(obj4, boolValueOf, null, new c2.d0((ic.n) objK5), 4));
        oVar.p(false);
        return qVarE;
    }
}
