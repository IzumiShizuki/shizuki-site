package d0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import ba.u0;
import m0.e3;
import u.n2;
import u.w1;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5341b;

    public /* synthetic */ h(int i10, Object obj) {
        this.f5340a = i10;
        this.f5341b = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(c2.x xVar, yb.c cVar) {
        switch (this.f5340a) {
            case 0:
                Object objK = hf.a0.k(new u0(xVar, (d) this.f5341b, null, 2), cVar);
                if (objK != zb.a.f26667a) {
                    break;
                }
                break;
            case 1:
                Object objF = n2.f(xVar, null, new aa.d((w0) this.f5341b, 3), null, null, cVar, 13);
                if (objF != zb.a.f26667a) {
                    break;
                }
                break;
            case 2:
                Object objE = w1.e(xVar, new g(1, (i0.a) this.f5341b, null), cVar);
                if (objE != zb.a.f26667a) {
                    break;
                }
                break;
            case 3:
                Object objF0 = ((s.d) this.f5341b).F0(xVar, cVar);
                if (objF0 != zb.a.f26667a) {
                    break;
                }
                break;
            case 4:
                Object objE2 = w1.e(xVar, new e3(1, (s.f) this.f5341b, null), cVar);
                if (objE2 != zb.a.f26667a) {
                    break;
                }
                break;
            default:
                d2.e eVar = new d2.e();
                u.k0 k0Var = (u.k0) this.f5341b;
                Object objK2 = hf.a0.k(new m9.a(k0Var, xVar, new cg.d0(9, k0Var, eVar), new cg.b(eVar, xVar, k0Var, 19), new u.f0(k0Var, 0), new u.f0(k0Var, 1), new b0.i0(17, eVar, k0Var), null), cVar);
                if (objK2 != zb.a.f26667a) {
                    break;
                }
                break;
        }
        return ub.a0.f21526a;
    }
}
