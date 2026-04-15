package na;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import u.n2;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ic.k f15716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ic.k f15717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0 f15718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w0 f15719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w0 f15720e;

    public l(ic.k kVar, ic.k kVar2, w0 w0Var, w0 w0Var2, w0 w0Var3) {
        this.f15716a = kVar;
        this.f15717b = kVar2;
        this.f15718c = w0Var;
        this.f15719d = w0Var2;
        this.f15720e = w0Var3;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(c2.x xVar, yb.c cVar) {
        Object objF = n2.f(xVar, new ba.i(this.f15718c, this.f15719d, this.f15720e, 9), this.f15716a, null, this.f15717b, cVar, 4);
        return objF == zb.a.f26667a ? objF : ub.a0.f21526a;
    }
}
