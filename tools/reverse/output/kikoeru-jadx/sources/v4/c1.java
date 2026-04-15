package v4;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c1 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p4.v f22434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f22436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f22437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m4.s0 f22438e = m4.s0.f14578d;

    public c1(p4.v vVar) {
        this.f22434a = vVar;
    }

    @Override // v4.g0
    public final void a(m4.s0 s0Var) {
        if (this.f22435b) {
            d(b());
        }
        this.f22438e = s0Var;
    }

    @Override // v4.g0
    public final long b() {
        long j10 = this.f22436c;
        if (!this.f22435b) {
            return j10;
        }
        this.f22434a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f22437d;
        m4.s0 s0Var = this.f22438e;
        return (s0Var.f14581a == 1.0f ? p4.c0.N(jElapsedRealtime) : jElapsedRealtime * ((long) s0Var.f14583c)) + j10;
    }

    @Override // v4.g0
    public final /* synthetic */ boolean c() {
        return false;
    }

    public final void d(long j10) {
        this.f22436c = j10;
        if (this.f22435b) {
            this.f22434a.getClass();
            this.f22437d = SystemClock.elapsedRealtime();
        }
    }

    @Override // v4.g0
    public final m4.s0 e() {
        return this.f22438e;
    }

    public final void f() {
        if (this.f22435b) {
            return;
        }
        this.f22434a.getClass();
        this.f22437d = SystemClock.elapsedRealtime();
        this.f22435b = true;
    }
}
