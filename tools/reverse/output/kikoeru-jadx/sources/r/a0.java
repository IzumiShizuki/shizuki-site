package r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f18320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18322d;

    public a0(int i10, int i11, v vVar) {
        this.f18319a = i10;
        this.f18320b = vVar;
        this.f18321c = ((long) i10) * 1000000;
        this.f18322d = ((long) i11) * 1000000;
    }

    @Override // r.j
    public final x1 a(v1 v1Var) {
        return new b0.w1(this);
    }

    @Override // r.y
    public final float b(long j10, float f10, float f11, float f12) {
        long j11 = j10 - this.f18322d;
        if (j11 < 0) {
            j11 = 0;
        }
        long j12 = this.f18321c;
        long j13 = j11 > j12 ? j12 : j11;
        if (j13 == 0) {
            return f12;
        }
        return (e(j13, f10, f11, f12) - e(j13 - 1000000, f10, f11, f12)) * 1000.0f;
    }

    @Override // r.y
    public final long c(float f10, float f11, float f12) {
        return this.f18322d + this.f18321c;
    }

    @Override // r.y
    public final float d(float f10, float f11, float f12) {
        return b(c(f10, f11, f12), f10, f11, f12);
    }

    @Override // r.y
    public final float e(long j10, float f10, float f11, float f12) {
        long j11 = j10 - this.f18322d;
        if (j11 < 0) {
            j11 = 0;
        }
        long j12 = this.f18321c;
        if (j11 > j12) {
            j11 = j12;
        }
        float fB = this.f18320b.b(this.f18319a == 0 ? 1.0f : j11 / j12);
        return (f11 * fB) + ((1 - fB) * f10);
    }
}
