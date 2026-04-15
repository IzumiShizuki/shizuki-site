package d;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f5210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f5211b;

    public h0(j0 j0Var, b0 b0Var) {
        jc.l.e(b0Var, "onBackPressedCallback");
        this.f5211b = j0Var;
        this.f5210a = b0Var;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ic.a, jc.j] */
    @Override // d.d
    public final void cancel() {
        j0 j0Var = this.f5211b;
        vb.j jVar = j0Var.f5215b;
        b0 b0Var = this.f5210a;
        jVar.remove(b0Var);
        if (jc.l.a(j0Var.f5216c, b0Var)) {
            b0Var.a();
            j0Var.f5216c = null;
        }
        b0Var.f5181b.remove(this);
        ?? r0 = b0Var.f5182c;
        if (r0 != 0) {
            r0.b();
        }
        b0Var.f5182c = null;
    }
}
