package u3;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class p0 extends o0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p3.b f21320o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p3.b f21321p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public p3.b f21322q;

    public p0(w0 w0Var, WindowInsets windowInsets) {
        super(w0Var, windowInsets);
        this.f21320o = null;
        this.f21321p = null;
        this.f21322q = null;
    }

    @Override // u3.t0
    public p3.b i() {
        if (this.f21321p == null) {
            this.f21321p = p3.b.c(this.f21313c.getMandatorySystemGestureInsets());
        }
        return this.f21321p;
    }

    @Override // u3.t0
    public p3.b k() {
        if (this.f21320o == null) {
            this.f21320o = p3.b.c(this.f21313c.getSystemGestureInsets());
        }
        return this.f21320o;
    }

    @Override // u3.t0
    public p3.b m() {
        if (this.f21322q == null) {
            this.f21322q = p3.b.c(this.f21313c.getTappableElementInsets());
        }
        return this.f21322q;
    }

    @Override // u3.m0, u3.t0
    public w0 n(int i10, int i11, int i12, int i13) {
        return w0.c(null, this.f21313c.inset(i10, i11, i12, i13));
    }

    public p0(w0 w0Var, p0 p0Var) {
        super(w0Var, p0Var);
        this.f21320o = null;
        this.f21321p = null;
        this.f21322q = null;
    }

    @Override // u3.n0, u3.t0
    public void u(p3.b bVar) {
    }
}
