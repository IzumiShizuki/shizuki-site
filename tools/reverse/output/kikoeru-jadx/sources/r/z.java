package r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f18635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0 f18636b;

    public z(float f10, float f11, float f12) {
        this.f18635a = f12;
        y0 y0Var = new y0();
        y0Var.f18630a = 1.0f;
        y0Var.f18631b = Math.sqrt(50.0d);
        y0Var.f18632c = 1.0f;
        if (f10 < 0.0f) {
            n0.a("Damping ratio must be non-negative");
        }
        y0Var.f18632c = f10;
        double d10 = y0Var.f18631b;
        if (((float) (d10 * d10)) <= 0.0f) {
            n0.a("Spring stiffness constant must be positive.");
        }
        y0Var.f18631b = Math.sqrt(f11);
        this.f18636b = y0Var;
    }

    @Override // r.j
    public final x1 a(v1 v1Var) {
        return new b0.w1(this);
    }

    @Override // r.y
    public final float b(long j10, float f10, float f11, float f12) {
        y0 y0Var = this.f18636b;
        y0Var.f18630a = f11;
        return Float.intBitsToFloat((int) (y0Var.a(f10, f12, j10 / 1000000) & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0220  */
    @Override // r.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long c(float r35, float r36, float r37) {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r.z.c(float, float, float):long");
    }

    @Override // r.y
    public final float d(float f10, float f11, float f12) {
        return 0.0f;
    }

    @Override // r.y
    public final float e(long j10, float f10, float f11, float f12) {
        y0 y0Var = this.f18636b;
        y0Var.f18630a = f11;
        return Float.intBitsToFloat((int) (y0Var.a(f10, f12, j10 / 1000000) >> 32));
    }
}
