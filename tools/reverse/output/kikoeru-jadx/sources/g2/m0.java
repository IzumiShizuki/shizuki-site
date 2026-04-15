package g2;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends i2.g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f7237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ic.n f7238c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(p0 p0Var, ic.n nVar, String str) {
        super(str);
        this.f7237b = p0Var;
        this.f7238c = nVar;
    }

    @Override // g2.v0
    public final w0 h(x0 x0Var, List list, long j10) {
        p0 p0Var = this.f7237b;
        k0 k0Var = p0Var.f7260h;
        k0Var.f7221a = x0Var.getLayoutDirection();
        k0Var.f7222b = x0Var.a();
        k0Var.f7223c = x0Var.M();
        boolean zO = x0Var.O();
        ic.n nVar = this.f7238c;
        if (zO || p0Var.f7253a.f8749h == null) {
            p0Var.f7256d = 0;
            w0 w0Var = (w0) nVar.q(k0Var, new f3.a(j10));
            return new l0(w0Var, p0Var, p0Var.f7256d, w0Var, 1);
        }
        p0Var.f7257e = 0;
        w0 w0Var2 = (w0) nVar.q(p0Var.f7261i, new f3.a(j10));
        return new l0(w0Var2, p0Var, p0Var.f7257e, w0Var2, 0);
    }
}
