package i2;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements g2.w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g2.w0 f8649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8651c;

    public b0(g2.w0 w0Var, c0 c0Var) {
        this.f8649a = w0Var;
        a0 a0Var = c0Var.T;
        jc.l.b(a0Var);
        this.f8650b = a0Var.f7180a;
        a0 a0Var2 = c0Var.T;
        jc.l.b(a0Var2);
        this.f8651c = a0Var2.f7181b;
    }

    @Override // g2.w0
    public final int b() {
        return this.f8651c;
    }

    @Override // g2.w0
    public final int h() {
        return this.f8650b;
    }

    @Override // g2.w0
    public final Map i() {
        return this.f8649a.i();
    }

    @Override // g2.w0
    public final void j() {
        this.f8649a.j();
    }

    @Override // g2.w0
    public final ic.k k() {
        return this.f8649a.k();
    }
}
