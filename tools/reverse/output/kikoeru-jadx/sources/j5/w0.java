package j5;

import android.net.Uri;
import android.os.Looper;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s4.g f10461h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final androidx.media3.exoplayer.offline.g f10462i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b5.t f10463j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m3.l f10464k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f10465l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m4.q f10466m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f10467n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f10468o = -9223372036854775807L;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f10469p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f10470q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public s4.f0 f10471r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public m4.i0 f10472s;

    public w0(m4.i0 i0Var, s4.g gVar, androidx.media3.exoplayer.offline.g gVar2, b5.t tVar, m3.l lVar, int i10, m4.q qVar) {
        this.f10472s = i0Var;
        this.f10461h = gVar;
        this.f10462i = gVar2;
        this.f10463j = tVar;
        this.f10464k = lVar;
        this.f10465l = i10;
        this.f10466m = qVar;
    }

    @Override // j5.a
    public final boolean a(m4.i0 i0Var) {
        m4.d0 d0Var = i().f14286b;
        d0Var.getClass();
        m4.d0 d0Var2 = i0Var.f14286b;
        if (d0Var2 == null || !d0Var2.f14178a.equals(d0Var.f14178a) || d0Var2.f14185h != d0Var.f14185h) {
            return false;
        }
        String str = d0Var2.f14183f;
        String str2 = d0Var.f14183f;
        int i10 = p4.c0.f16548a;
        return Objects.equals(str, str2);
    }

    @Override // j5.a
    public final b0 c(d0 d0Var, n5.f fVar, long j10) {
        s4.h hVarQ = this.f10461h.q();
        s4.f0 f0Var = this.f10471r;
        if (f0Var != null) {
            hVarQ.t(f0Var);
        }
        m4.d0 d0Var2 = i().f14286b;
        d0Var2.getClass();
        Uri uri = d0Var2.f14178a;
        p4.c.j(this.f10208g);
        return new t0(uri, hVarQ, new c7.e1((r5.r) this.f10462i.f903b), this.f10463j, new b5.q(this.f10205d.f1595c, 0, d0Var), this.f10464k, b(d0Var), this, fVar, d0Var2.f14183f, this.f10465l, this.f10466m, p4.c0.N(d0Var2.f14185h), null);
    }

    @Override // j5.a
    public final synchronized m4.i0 i() {
        return this.f10472s;
    }

    @Override // j5.a
    public final void m(s4.f0 f0Var) {
        this.f10471r = f0Var;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        w4.k kVar = this.f10208g;
        p4.c.j(kVar);
        b5.t tVar = this.f10463j;
        tVar.g(looperMyLooper, kVar);
        tVar.c();
        u();
    }

    @Override // j5.a
    public final void o(b0 b0Var) {
        t0 t0Var = (t0) b0Var;
        if (t0Var.f10441x) {
            for (b1 b1Var : t0Var.f10438u) {
                b1Var.k();
                b5.l lVar = b1Var.f10216h;
                if (lVar != null) {
                    lVar.c(b1Var.f10213e);
                    b1Var.f10216h = null;
                    b1Var.f10215g = null;
                }
            }
        }
        t0Var.f10430m.e(t0Var);
        t0Var.f10435r.removeCallbacksAndMessages(null);
        t0Var.f10436s = null;
        t0Var.P = true;
    }

    @Override // j5.a
    public final void q() {
        this.f10463j.a();
    }

    @Override // j5.a
    public final synchronized void t(m4.i0 i0Var) {
        this.f10472s = i0Var;
    }

    public final void u() {
        long j10 = this.f10468o;
        boolean z10 = this.f10469p;
        boolean z11 = this.f10470q;
        m4.i0 i0VarI = i();
        m4.i1 g1Var = new g1(-9223372036854775807L, -9223372036854775807L, j10, j10, 0L, 0L, z10, false, false, null, i0VarI, z11 ? i0VarI.f14287c : null);
        if (this.f10467n) {
            g1Var = new u0(g1Var);
        }
        n(g1Var);
    }

    public final void v(long j10, boolean z10, boolean z11) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f10468o;
        }
        if (!this.f10467n && this.f10468o == j10 && this.f10469p == z10 && this.f10470q == z11) {
            return;
        }
        this.f10468o = j10;
        this.f10469p = z10;
        this.f10470q = z11;
        this.f10467n = false;
        u();
    }

    @Override // j5.a
    public final void k() {
    }
}
