package la;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import h0.k1;
import u.n2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f11963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f11964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.w0 f11965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.w0 f11966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w.k f11967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0.w0 f11968f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x0.w0 f11969g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x0.w0 f11970h;

    public g(boolean z10, boolean z11, x0.w0 w0Var, x0.w0 w0Var2, w.k kVar, x0.w0 w0Var3, x0.w0 w0Var4, x0.w0 w0Var5) {
        this.f11963a = z10;
        this.f11964b = z11;
        this.f11965c = w0Var;
        this.f11966d = w0Var2;
        this.f11967e = kVar;
        this.f11968f = w0Var3;
        this.f11969g = w0Var4;
        this.f11970h = w0Var5;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(c2.x xVar, yb.c cVar) {
        Object objE = n2.e(xVar, this.f11963a ? new aa.d(this.f11965c, 7) : null, this.f11964b ? new aa.d(this.f11966d, 8) : null, new k1(this.f11967e, this.f11968f, this.f11969g, (yb.c) null), new aa.d(this.f11970h, 9), cVar);
        return objE == zb.a.f26667a ? objE : ub.a0.f21526a;
    }
}
