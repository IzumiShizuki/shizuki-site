package k6;

import p4.c0;
import r5.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f11154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f11155f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long[] f11156g;

    public h(long j10, int i10, long j11, int i11, long j12, long[] jArr) {
        this.f11150a = j10;
        this.f11151b = i10;
        this.f11152c = j11;
        this.f11153d = i11;
        this.f11154e = j12;
        this.f11156g = jArr;
        this.f11155f = j12 != -1 ? j10 + j12 : -1L;
    }

    @Override // k6.f
    public final long b(long j10) {
        long j11 = j10 - this.f11150a;
        if (!e() || j11 <= this.f11151b) {
            return 0L;
        }
        long[] jArr = this.f11156g;
        p4.c.j(jArr);
        double d10 = (j11 * 256.0d) / this.f11154e;
        int iE = c0.e(jArr, (long) d10, true);
        long j12 = this.f11152c;
        long j13 = (((long) iE) * j12) / 100;
        long j14 = jArr[iE];
        int i10 = iE + 1;
        long j15 = (j12 * ((long) i10)) / 100;
        return Math.round((j14 == (iE == 99 ? 256L : jArr[i10]) ? 0.0d : (d10 - j14) / (r0 - j14)) * (j15 - j13)) + j13;
    }

    @Override // k6.f
    public final long d() {
        return this.f11155f;
    }

    @Override // r5.b0
    public final boolean e() {
        return this.f11156g != null;
    }

    @Override // r5.b0
    public final a0 k(long j10) {
        double d10;
        double d11;
        boolean zE = e();
        int i10 = this.f11151b;
        long j11 = this.f11150a;
        if (!zE) {
            r5.c0 c0Var = new r5.c0(0L, j11 + ((long) i10));
            return new a0(c0Var, c0Var);
        }
        long j12 = c0.j(j10, 0L, this.f11152c);
        double d12 = (j12 * 100.0d) / this.f11152c;
        double d13 = 0.0d;
        if (d12 <= 0.0d) {
            d10 = 256.0d;
        } else if (d12 >= 100.0d) {
            d10 = 256.0d;
            d13 = 256.0d;
        } else {
            int i11 = (int) d12;
            long[] jArr = this.f11156g;
            p4.c.j(jArr);
            double d14 = jArr[i11];
            if (i11 == 99) {
                d10 = 256.0d;
                d11 = 256.0d;
            } else {
                d10 = 256.0d;
                d11 = jArr[i11 + 1];
            }
            d13 = ((d11 - d14) * (d12 - ((double) i11))) + d14;
        }
        long j13 = this.f11154e;
        r5.c0 c0Var2 = new r5.c0(j12, j11 + c0.j(Math.round((d13 / d10) * j13), i10, j13 - 1));
        return new a0(c0Var2, c0Var2);
    }

    @Override // k6.f
    public final int l() {
        return this.f11153d;
    }

    @Override // r5.b0
    public final long m() {
        return this.f11152c;
    }
}
