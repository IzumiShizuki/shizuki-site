package b7;

import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g1 implements h1, n2, p4.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1783c;

    public /* synthetic */ g1(int i10, Object obj, Object obj2) {
        this.f1781a = i10;
        this.f1782b = obj;
        this.f1783c = obj2;
    }

    @Override // p4.k
    public void a(Object obj) {
        m4.x0 x0Var = (m4.x0) this.f1782b;
        m4.x0 x0Var2 = (m4.x0) this.f1783c;
        m4.w0 w0Var = (m4.w0) obj;
        int i10 = this.f1781a;
        w0Var.e(i10);
        w0Var.g(x0Var, x0Var2, i10);
    }

    @Override // b7.n2
    public void b(t1 t1Var) {
        o2 o2Var = (o2) this.f1782b;
        c7.q0 q0Var = (c7.q0) this.f1783c;
        if (TextUtils.isEmpty(q0Var.f3700a)) {
            p4.c.B("MediaSessionLegacyStub", "onAddQueueItem(): Media ID shouldn't be empty");
            return;
        }
        cb.y yVarJ = o2Var.f2008g.j(t1Var, ya.i0.u(x.h(q0Var)));
        yVarJ.a(new cb.t(0, yVarJ, new ah.j(o2Var, t1Var, this.f1781a)), cb.r.f3875a);
    }

    @Override // b7.h1
    public void c(t0 t0Var) {
        e4 e4Var = (e4) this.f1782b;
        Bundle bundle = (Bundle) this.f1783c;
        d0 d0Var = t0Var.f2069a;
        if (t0Var.T()) {
            d0Var.getClass();
            p4.c.i(Looper.myLooper() == d0Var.f1707d.getLooper());
            cb.v vVarV = d0Var.f1706c.v(d0Var, e4Var, bundle);
            vVarV.a(new b5.n(t0Var, vVarV, this.f1781a, 1), cb.r.f3875a);
        }
    }

    public /* synthetic */ g1(p1 p1Var, int i10, v1 v1Var) {
        this.f1782b = p1Var;
        this.f1781a = i10;
        this.f1783c = v1Var;
    }

    public /* synthetic */ g1(o2 o2Var, c7.q0 q0Var, int i10) {
        this.f1782b = o2Var;
        this.f1783c = q0Var;
        this.f1781a = i10;
    }
}
