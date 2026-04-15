package h0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import u.n2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l1 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hf.y f7743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.w0 f7744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w.k f7745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.w0 f7746d;

    public l1(hf.y yVar, x0.w0 w0Var, w.k kVar, x0.w0 w0Var2) {
        this.f7743a = yVar;
        this.f7744b = w0Var;
        this.f7745c = kVar;
        this.f7746d = w0Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(c2.x xVar, yb.c cVar) {
        k1 k1Var = new k1(this.f7743a, this.f7744b, this.f7745c, (yb.c) null);
        cg.c cVar2 = new cg.c(this.f7746d, 3);
        i7.k kVar = n2.f21015a;
        Object objK = hf.a0.k(new f7.w(xVar, k1Var, cVar2, new u.i1(xVar), (yb.c) null), cVar);
        ub.a0 a0Var = ub.a0.f21526a;
        zb.a aVar = zb.a.f26667a;
        if (objK != aVar) {
            objK = a0Var;
        }
        return objK == aVar ? objK : a0Var;
    }
}
