package k6;

import p4.c0;
import r5.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f11145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f11146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11149e;

    public g(long[] jArr, long[] jArr2, long j10, long j11, int i10) {
        this.f11145a = jArr;
        this.f11146b = jArr2;
        this.f11147c = j10;
        this.f11148d = j11;
        this.f11149e = i10;
    }

    @Override // k6.f
    public final long b(long j10) {
        return this.f11145a[c0.e(this.f11146b, j10, true)];
    }

    @Override // k6.f
    public final long d() {
        return this.f11148d;
    }

    @Override // r5.b0
    public final boolean e() {
        return true;
    }

    @Override // r5.b0
    public final a0 k(long j10) {
        long[] jArr = this.f11145a;
        int iE = c0.e(jArr, j10, true);
        long j11 = jArr[iE];
        long[] jArr2 = this.f11146b;
        r5.c0 c0Var = new r5.c0(j11, jArr2[iE]);
        if (j11 >= j10 || iE == jArr.length - 1) {
            return new a0(c0Var, c0Var);
        }
        int i10 = iE + 1;
        return new a0(c0Var, new r5.c0(jArr[i10], jArr2[i10]));
    }

    @Override // k6.f
    public final int l() {
        return this.f11149e;
    }

    @Override // r5.b0
    public final long m() {
        return this.f11147c;
    }
}
