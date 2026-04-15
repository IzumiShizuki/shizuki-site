package k6;

import r5.a0;
import r5.b0;
import r5.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements f, b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f11115f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f11116g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f11117h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f11118i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f11119j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f11120k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f11121l;

    public a(long j10, long j11, int i10, int i11, boolean z10) {
        this.f11110a = j10;
        this.f11111b = j11;
        this.f11112c = i11 == -1 ? 1 : i11;
        this.f11114e = i10;
        this.f11116g = z10;
        if (j10 == -1) {
            this.f11113d = -1L;
            this.f11115f = -9223372036854775807L;
        } else {
            long j12 = j10 - j11;
            this.f11113d = j12;
            this.f11115f = (Math.max(0L, j12) * 8000000) / ((long) i10);
        }
        this.f11117h = j11;
        this.f11118i = i10;
        this.f11119j = i11;
        this.f11120k = z10;
        this.f11121l = j10 == -1 ? -1L : j10;
    }

    @Override // k6.f
    public final long b(long j10) {
        return (Math.max(0L, j10 - this.f11111b) * 8000000) / ((long) this.f11114e);
    }

    @Override // k6.f
    public final long d() {
        return this.f11121l;
    }

    @Override // r5.b0
    public final boolean e() {
        return this.f11113d != -1 || this.f11116g;
    }

    @Override // r5.b0
    public final a0 k(long j10) {
        long j11 = this.f11111b;
        long j12 = this.f11113d;
        if (j12 == -1 && !this.f11116g) {
            c0 c0Var = new c0(0L, j11);
            return new a0(c0Var, c0Var);
        }
        int i10 = this.f11114e;
        long j13 = this.f11112c;
        long jMin = (((((long) i10) * j10) / 8000000) / j13) * j13;
        if (j12 != -1) {
            jMin = Math.min(jMin, j12 - j13);
        }
        long jMax = Math.max(jMin, 0L) + j11;
        long jMax2 = (Math.max(0L, jMax - j11) * 8000000) / ((long) i10);
        c0 c0Var2 = new c0(jMax2, jMax);
        if (j12 != -1 && jMax2 < j10) {
            long j14 = jMax + j13;
            if (j14 < this.f11110a) {
                return new a0(c0Var2, new c0((Math.max(0L, j14 - j11) * 8000000) / ((long) i10), j14));
            }
        }
        return new a0(c0Var2, c0Var2);
    }

    @Override // k6.f
    public final int l() {
        return this.f11118i;
    }

    @Override // r5.b0
    public final long m() {
        return this.f11115f;
    }
}
