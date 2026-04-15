package l0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0.c1 f11653b;

    public /* synthetic */ w(h0.c1 c1Var, int i10) {
        this.f11652a = i10;
        this.f11653b = c1Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(c2.x xVar, yb.c cVar) {
        switch (this.f11652a) {
            case 0:
                Object objN = h0.q0.n(xVar, this.f11653b, cVar);
                if (objN != zb.a.f26667a) {
                    break;
                }
                break;
            default:
                Object objN2 = h0.q0.n(xVar, this.f11653b, cVar);
                if (objN2 != zb.a.f26667a) {
                    break;
                }
                break;
        }
        return ub.a0.f21526a;
    }
}
