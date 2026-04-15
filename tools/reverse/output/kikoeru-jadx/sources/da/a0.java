package da;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import h0.c1;
import l0.l1;
import u.n2;
import u.w1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5633c;

    public /* synthetic */ a0(int i10, Object obj, Object obj2) {
        this.f5631a = i10;
        this.f5632b = obj;
        this.f5633c = obj2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(c2.x xVar, yb.c cVar) {
        switch (this.f5631a) {
            case 0:
                Object objF = n2.f(xVar, null, new aa.d((x0.w0) this.f5632b, 4), null, new z(0, (ic.a) this.f5633c), cVar, 5);
                if (objF != zb.a.f26667a) {
                    break;
                }
                break;
            case 1:
                Object objK = hf.a0.k(new h0.e0(xVar, (c1) this.f5632b, (l1) this.f5633c, null), cVar);
                if (objK != zb.a.f26667a) {
                    break;
                }
                break;
            case 2:
                c2.j0 j0Var = (c2.j0) xVar;
                j0Var.getClass();
                Object objE = w1.e(xVar, new d0.g((l0.l) this.f5632b, new ah.j(i2.f.y(j0Var).A), (c1) this.f5633c, null, 2), cVar);
                if (objE != zb.a.f26667a) {
                    break;
                }
                break;
            default:
                Object objE2 = w1.e(xVar, new h0.x0((l0.s0) this.f5632b, (l0.x) this.f5633c, null, 1), cVar);
                if (objE2 != zb.a.f26667a) {
                    break;
                }
                break;
        }
        return ub.a0.f21526a;
    }
}
