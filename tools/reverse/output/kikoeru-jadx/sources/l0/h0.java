package l0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import u.w1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ic.k f11493b;

    public /* synthetic */ h0(ic.k kVar, int i10) {
        this.f11492a = i10;
        this.f11493b = kVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(c2.x xVar, yb.c cVar) {
        switch (this.f11492a) {
            case 0:
                Object objB0 = ((c2.j0) xVar).B0(new g0(0, this.f11493b, null), cVar);
                return objB0 == zb.a.f26667a ? objB0 : ub.a0.f21526a;
            default:
                Object objE = w1.e(xVar, new g0(1, this.f11493b, null), cVar);
                ub.a0 a0Var = ub.a0.f21526a;
                zb.a aVar = zb.a.f26667a;
                if (objE != aVar) {
                    objE = a0Var;
                }
                return objE == aVar ? objE : a0Var;
        }
    }
}
