package m5;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;
import m4.j1;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1 f14667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f14669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m4.q[] f14670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f14671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14672f;

    public c(j1 j1Var, int[] iArr) {
        int i10 = 0;
        p4.c.i(iArr.length > 0);
        j1Var.getClass();
        this.f14667a = j1Var;
        int length = iArr.length;
        this.f14668b = length;
        this.f14670d = new m4.q[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.f14670d[i11] = j1Var.f14307d[iArr[i11]];
        }
        Arrays.sort(this.f14670d, new androidx.media3.exoplayer.offline.i(7));
        this.f14669c = new int[this.f14668b];
        while (true) {
            int i12 = this.f14668b;
            if (i10 >= i12) {
                this.f14671e = new long[i12];
                return;
            } else {
                this.f14669c[i10] = j1Var.b(this.f14670d[i10]);
                i10++;
            }
        }
    }

    @Override // m5.r
    public final boolean a(int i10, long j10) {
        return this.f14671e[i10] > j10;
    }

    @Override // m5.r
    public final j1 b() {
        return this.f14667a;
    }

    @Override // m5.r
    public final /* synthetic */ boolean d(long j10, k5.f fVar, List list) {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f14667a.equals(cVar.f14667a) && Arrays.equals(this.f14669c, cVar.f14669c)) {
                return true;
            }
        }
        return false;
    }

    @Override // m5.r
    public final m4.q g(int i10) {
        return this.f14670d[i10];
    }

    public final int hashCode() {
        if (this.f14672f == 0) {
            this.f14672f = Arrays.hashCode(this.f14669c) + (System.identityHashCode(this.f14667a) * 31);
        }
        return this.f14672f;
    }

    @Override // m5.r
    public final int i(int i10) {
        return this.f14669c[i10];
    }

    @Override // m5.r
    public int j(long j10, List list) {
        return list.size();
    }

    @Override // m5.r
    public final int l() {
        return this.f14669c[c()];
    }

    @Override // m5.r
    public final int length() {
        return this.f14669c.length;
    }

    @Override // m5.r
    public final m4.q m() {
        return this.f14670d[c()];
    }

    @Override // m5.r
    public final boolean o(int i10, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zA = a(i10, jElapsedRealtime);
        int i11 = 0;
        while (i11 < this.f14668b && !zA) {
            zA = (i11 == i10 || a(i11, jElapsedRealtime)) ? false : true;
            i11++;
        }
        if (!zA) {
            return false;
        }
        long[] jArr = this.f14671e;
        long j11 = jArr[i10];
        int i12 = c0.f16548a;
        long j12 = jElapsedRealtime + j10;
        if (((j10 ^ j12) & (jElapsedRealtime ^ j12)) < 0) {
            j12 = Long.MAX_VALUE;
        }
        jArr[i10] = Math.max(j11, j12);
        return true;
    }

    @Override // m5.r
    public final int s(m4.q qVar) {
        for (int i10 = 0; i10 < this.f14668b; i10++) {
            if (this.f14670d[i10] == qVar) {
                return i10;
            }
        }
        return -1;
    }

    @Override // m5.r
    public final int u(int i10) {
        for (int i11 = 0; i11 < this.f14668b; i11++) {
            if (this.f14669c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // m5.r
    public void h() {
    }

    @Override // m5.r
    public void k() {
    }

    @Override // m5.r
    public final /* synthetic */ void r() {
    }

    @Override // m5.r
    public final /* synthetic */ void t() {
    }

    @Override // m5.r
    public final void e(boolean z10) {
    }

    @Override // m5.r
    public void p(float f10) {
    }
}
