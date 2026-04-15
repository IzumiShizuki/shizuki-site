package lh;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p extends j0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j0 f12599e;

    public p(j0 j0Var) {
        jc.l.e(j0Var, "delegate");
        this.f12599e = j0Var;
    }

    @Override // lh.j0
    public final j0 a() {
        return this.f12599e.a();
    }

    @Override // lh.j0
    public final j0 b() {
        return this.f12599e.b();
    }

    @Override // lh.j0
    public final long c() {
        return this.f12599e.c();
    }

    @Override // lh.j0
    public final j0 d(long j10) {
        return this.f12599e.d(j10);
    }

    @Override // lh.j0
    public final boolean e() {
        return this.f12599e.e();
    }

    @Override // lh.j0
    public final void f() throws InterruptedIOException {
        this.f12599e.f();
    }

    @Override // lh.j0
    public final j0 g(long j10) {
        jc.l.e(TimeUnit.MILLISECONDS, "unit");
        return this.f12599e.g(j10);
    }
}
