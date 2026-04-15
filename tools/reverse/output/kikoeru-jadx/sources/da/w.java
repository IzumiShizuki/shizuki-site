package da;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import bg.a2;
import com.cnl.kikoeru.R;
import m0.z8;
import y.v1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5830a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.w0 f5831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f5832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ic.a f5833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5834e;

    public /* synthetic */ w(m0 m0Var, long j10, ic.a aVar, x0.w0 w0Var) {
        this.f5834e = m0Var;
        this.f5832c = j10;
        this.f5833d = aVar;
        this.f5831b = w0Var;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f5830a) {
            case 0:
                m0 m0Var = (m0) this.f5834e;
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                boolean zN = oVar.N(iIntValue & 1, (iIntValue & 3) != 2);
                ub.a0 a0Var = ub.a0.f21526a;
                if (!zN) {
                    oVar.Q();
                    return a0Var;
                }
                a2 a2VarA = m0Var.A();
                String strL = a2VarA != null ? na.c.l(a2VarA) : na.w.a(this.f5832c);
                long j10 = q1.q.f17571d;
                ic.a aVar = this.f5833d;
                boolean zF = oVar.f(aVar);
                Object objK = oVar.K();
                if (zF || objK == x0.k.f24334a) {
                    objK = new a0(0, this.f5831b, aVar);
                    oVar.h0(objK);
                }
                z8.b(strL, new SuspendPointerInputElement(a0Var, null, null, (PointerInputEventHandler) objK, 6), j10, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar, 384, 0, 131064);
                return a0Var;
            default:
                hf.y yVar = (hf.y) this.f5834e;
                x0.o oVar2 = (x0.o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (oVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    float f10 = 10;
                    j1.q qVarA = j1.a.a(y.d.n(y.d.o(androidx.compose.foundation.layout.a.m(j1.n.f9689a, f10, 5, f10, f10))), new v1(3, 0));
                    String strG = na.q.g(R.string.tag);
                    x0.w0 w0Var = this.f5831b;
                    boolean zF2 = oVar2.f(w0Var) | oVar2.h(yVar);
                    long j11 = this.f5832c;
                    boolean zE = zF2 | oVar2.e(j11);
                    ic.a aVar2 = this.f5833d;
                    boolean zF3 = zE | oVar2.f(aVar2);
                    Object objK2 = oVar2.K();
                    x0.r0 r0Var = x0.k.f24334a;
                    if (zF3 || objK2 == r0Var) {
                        la.p0 p0Var = new la.p0(yVar, w0Var, j11, aVar2, 0);
                        oVar2.h0(p0Var);
                        objK2 = p0Var;
                    }
                    ic.k kVar = (ic.k) ((pc.f) objK2);
                    boolean zF4 = oVar2.f(w0Var) | oVar2.h(yVar) | oVar2.e(j11) | oVar2.f(aVar2);
                    Object objK3 = oVar2.K();
                    if (zF4 || objK3 == r0Var) {
                        la.p0 p0Var2 = new la.p0(yVar, w0Var, j11, aVar2, 1);
                        oVar2.h0(p0Var2);
                        objK3 = p0Var2;
                    }
                    ba.z.c(qVarA, null, null, strG, true, false, kVar, null, (ic.k) ((pc.f) objK3), oVar2, 221184, 134);
                } else {
                    oVar2.Q();
                }
                return ub.a0.f21526a;
        }
    }

    public /* synthetic */ w(x0.w0 w0Var, hf.y yVar, long j10, ic.a aVar) {
        this.f5831b = w0Var;
        this.f5834e = yVar;
        this.f5832c = j10;
        this.f5833d = aVar;
    }
}
