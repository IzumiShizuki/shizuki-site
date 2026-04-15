package r;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c2 implements x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f18356a = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f18357b = -9223372036854775807L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f18358c;

    @Override // r.x1
    public p H(long j10, p pVar, p pVar2, p pVar3) {
        return ((a2) this.f18358c).H(b(j10), pVar, pVar2, c(j10, pVar, pVar3, pVar2));
    }

    @Override // r.x1
    public boolean a() {
        return true;
    }

    public long b(long j10) {
        long j11 = j10 + this.f18357b;
        if (j11 <= 0) {
            return 0L;
        }
        long j12 = this.f18356a;
        return j11 - ((j11 / j12) * j12);
    }

    public p c(long j10, p pVar, p pVar2, p pVar3) {
        long j11 = this.f18357b;
        long j12 = j10 + j11;
        long j13 = this.f18356a;
        return j12 > j13 ? ((a2) this.f18358c).H(j13 - j11, pVar, pVar3, pVar2) : pVar2;
    }

    public void d(Exception exc) {
        boolean z10;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f18358c) == null) {
            this.f18358c = exc;
        }
        if (this.f18356a == -9223372036854775807L) {
            synchronized (x4.v.f24688j0) {
                z10 = x4.v.f24690l0 > 0;
            }
            if (!z10) {
                this.f18356a = 200 + jElapsedRealtime;
            }
        }
        long j10 = this.f18356a;
        if (j10 == -9223372036854775807L || jElapsedRealtime < j10) {
            this.f18357b = jElapsedRealtime + 50;
            return;
        }
        Exception exc2 = (Exception) this.f18358c;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = (Exception) this.f18358c;
        this.f18358c = null;
        this.f18356a = -9223372036854775807L;
        this.f18357b = -9223372036854775807L;
        throw exc3;
    }

    @Override // r.x1
    public p g(long j10, p pVar, p pVar2, p pVar3) {
        return ((a2) this.f18358c).g(b(j10), pVar, pVar2, c(j10, pVar, pVar3, pVar2));
    }

    @Override // r.x1
    public long n(p pVar, p pVar2, p pVar3) {
        return Long.MAX_VALUE;
    }

    @Override // r.x1
    public p t(p pVar, p pVar2, p pVar3) {
        return H(Long.MAX_VALUE, pVar, pVar2, pVar3);
    }
}
