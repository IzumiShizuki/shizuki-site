package eg;

import androidx.lifecycle.q;
import androidx.lifecycle.x;
import g2.c0;
import ic.k;
import jc.l;
import jc.m;
import ub.a0;
import x0.f0;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends m implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0 f6585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w0 f6586d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(w0 w0Var, w0 w0Var2, int i10) {
        super(1);
        this.f6584b = i10;
        this.f6585c = w0Var;
        this.f6586d = w0Var2;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f6584b) {
            case 0:
                l.e((f0) obj, "$this$DisposableEffect");
                q qVarF = ((x) this.f6585c.getValue()).f();
                b bVar = new b(0, this.f6586d);
                qVarF.W0(bVar);
                break;
            case 1:
                ((k) this.f6585c.getValue()).a(ta.c.a((ta.c) this.f6586d.getValue(), 0.0f, 0.0f, ((Number) obj).floatValue(), 11));
                break;
            default:
                c0 c0Var = (c0) obj;
                l.e(c0Var, "it");
                this.f6585c.setValue(new p1.b(c0Var.H(0L)));
                this.f6586d.setValue(new f3.l(c0Var.k()));
                break;
        }
        return a0.f21526a;
    }
}
