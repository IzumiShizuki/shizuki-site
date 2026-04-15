package d;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements androidx.lifecycle.v, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.q f5204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f5205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h0 f5206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0 f5207d;

    public g0(j0 j0Var, androidx.lifecycle.q qVar, b0 b0Var) {
        jc.l.e(b0Var, "onBackPressedCallback");
        this.f5207d = j0Var;
        this.f5204a = qVar;
        this.f5205b = b0Var;
        qVar.W0(this);
    }

    @Override // d.d
    public final void cancel() {
        this.f5204a.q1(this);
        this.f5205b.f5181b.remove(this);
        h0 h0Var = this.f5206c;
        if (h0Var != null) {
            h0Var.cancel();
        }
        this.f5206c = null;
    }

    @Override // androidx.lifecycle.v
    public final void i(androidx.lifecycle.x xVar, androidx.lifecycle.o oVar) {
        if (oVar != androidx.lifecycle.o.ON_START) {
            if (oVar != androidx.lifecycle.o.ON_STOP) {
                if (oVar == androidx.lifecycle.o.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                h0 h0Var = this.f5206c;
                if (h0Var != null) {
                    h0Var.cancel();
                    return;
                }
                return;
            }
        }
        b0 b0Var = this.f5205b;
        jc.l.e(b0Var, "onBackPressedCallback");
        j0 j0Var = this.f5207d;
        j0Var.f5215b.addLast(b0Var);
        h0 h0Var2 = new h0(j0Var, b0Var);
        b0Var.f5181b.add(h0Var2);
        j0Var.e();
        b0Var.f5182c = new i0(0, j0Var, j0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0, 1);
        this.f5206c = h0Var2;
    }
}
