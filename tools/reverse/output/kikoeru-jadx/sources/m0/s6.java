package m0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s6 implements ic.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f13608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u.o0 f13609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w.k f13610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f13611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f13612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0.w0 f13613f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x0.n2 f13614g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x0.w0 f13615h;

    public s6(boolean z10, a6 a6Var, w.k kVar, float f10, boolean z11, x0.a1 a1Var, x0.a1 a1Var2, x0.w0 w0Var) {
        this.f13608a = z10;
        this.f13609b = a6Var;
        this.f13610c = kVar;
        this.f13611d = f10;
        this.f13612e = z11;
        this.f13613f = a1Var;
        this.f13614g = a1Var2;
        this.f13615h = w0Var;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        j1.q qVarE = (j1.q) obj;
        x0.o oVar = (x0.o) obj2;
        ((Number) obj3).intValue();
        oVar.W(1945228890);
        if (this.f13608a) {
            oVar.W(-1679801122);
            Object objK = oVar.K();
            x0.r0 r0Var = x0.k.f24334a;
            if (objK == r0Var) {
                objK = x0.v.m(oVar);
                oVar.h0(objK);
            }
            hf.y yVar = (hf.y) objK;
            float f10 = this.f13611d;
            Float fValueOf = Float.valueOf(f10);
            boolean z10 = this.f13612e;
            Boolean boolValueOf = Boolean.valueOf(z10);
            u.o0 o0Var = this.f13609b;
            Object[] objArr = {o0Var, this.f13610c, fValueOf, boolValueOf};
            boolean zC = oVar.c(f10) | oVar.g(z10) | oVar.f(this.f13613f) | oVar.f(this.f13614g) | oVar.h(yVar) | oVar.h(o0Var);
            x0.w0 w0Var = this.f13615h;
            boolean zF = zC | oVar.f(w0Var);
            Object objK2 = oVar.K();
            if (zF || objK2 == r0Var) {
                objK2 = new r6(this.f13612e, this.f13611d, this.f13613f, this.f13614g, yVar, this.f13609b, w0Var);
                oVar.h0(objK2);
            }
            c2.l lVar = c2.e0.f3261a;
            qVarE = qVarE.e(new SuspendPointerInputElement(null, null, objArr, (PointerInputEventHandler) objK2, 3));
            oVar.p(false);
        } else {
            oVar.W(-1678708124);
            oVar.p(false);
        }
        oVar.p(false);
        return qVarE;
    }
}
