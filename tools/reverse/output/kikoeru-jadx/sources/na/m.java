package na;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import ba.e0;
import u.o2;
import u.w1;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w0 f15721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f15722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0 f15723c;

    public m(w0 w0Var, w0 w0Var2, w0 w0Var3) {
        this.f15721a = w0Var;
        this.f15722b = w0Var2;
        this.f15723c = w0Var3;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(c2.x xVar, yb.c cVar) {
        Object objE = w1.e(xVar, new o2(new e0(this.f15721a, this.f15722b, this.f15723c, 1), null), cVar);
        ub.a0 a0Var = ub.a0.f21526a;
        zb.a aVar = zb.a.f26667a;
        if (objE != aVar) {
            objE = a0Var;
        }
        return objE == aVar ? objE : a0Var;
    }
}
