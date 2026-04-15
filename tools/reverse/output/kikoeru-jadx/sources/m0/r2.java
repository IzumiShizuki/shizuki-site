package m0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r2 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ic.a f13546b;

    public /* synthetic */ r2(int i10, ic.a aVar) {
        this.f13545a = i10;
        this.f13546b = aVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(c2.x xVar, yb.c cVar) {
        switch (this.f13545a) {
            case 0:
                Object objF = u.n2.f(xVar, null, null, null, new da.z(4, this.f13546b), cVar, 7);
                if (objF != zb.a.f26667a) {
                    break;
                }
                break;
            case 1:
                Object objE = u.w1.e(xVar, new e3(0, this.f13546b, null), cVar);
                if (objE != zb.a.f26667a) {
                    break;
                }
                break;
            default:
                Object objF2 = u.n2.f(xVar, null, null, null, new da.z(5, this.f13546b), cVar, 7);
                if (objF2 != zb.a.f26667a) {
                    break;
                }
                break;
        }
        return ub.a0.f21526a;
    }
}
