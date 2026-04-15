package m0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r6 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f13568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f13569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.w0 f13570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.n2 f13571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hf.y f13572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u.o0 f13573f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x0.w0 f13574g;

    public r6(boolean z10, float f10, x0.w0 w0Var, x0.n2 n2Var, hf.y yVar, u.o0 o0Var, x0.w0 w0Var2) {
        this.f13568a = z10;
        this.f13569b = f10;
        this.f13570c = w0Var;
        this.f13571d = n2Var;
        this.f13572e = yVar;
        this.f13573f = o0Var;
        this.f13574g = w0Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(c2.x xVar, yb.c cVar) {
        Object objF = u.n2.f(xVar, null, null, new q6(this.f13568a, this.f13569b, this.f13570c, this.f13571d, null), new ba.i(this.f13572e, this.f13573f, this.f13574g, 8), cVar, 3);
        return objF == zb.a.f26667a ? objF : ub.a0.f21526a;
    }
}
