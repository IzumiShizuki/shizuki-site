package la;

import h0.j1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.w0 f11941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w.k f11942c;

    public /* synthetic */ e(x0.w0 w0Var, w.k kVar, int i10) {
        this.f11940a = i10;
        this.f11941b = w0Var;
        this.f11942c = kVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        x0.f0 f0Var = (x0.f0) obj;
        switch (this.f11940a) {
            case 0:
                jc.l.e(f0Var, "$this$DisposableEffect");
                return new j1(this.f11941b, this.f11942c, 2);
            default:
                jc.l.e(f0Var, "$this$DisposableEffect");
                return new j1(this.f11941b, this.f11942c, 1);
        }
    }
}
