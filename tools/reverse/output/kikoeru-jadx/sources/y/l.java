package y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l extends j1.p implements i2.z {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f25165o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f25166p;

    public final long B0(long j10, boolean z10) {
        int iRound;
        int iG = f3.a.g(j10);
        if (iG == Integer.MAX_VALUE || (iRound = Math.round(iG * this.f25165o)) <= 0) {
            return 0L;
        }
        if (!z10 || androidx.compose.foundation.layout.a.f(iRound, iG, j10)) {
            return (((long) iRound) << 32) | (((long) iG) & 4294967295L);
        }
        return 0L;
    }

    public final long C0(long j10, boolean z10) {
        int iRound;
        int iH = f3.a.h(j10);
        if (iH == Integer.MAX_VALUE || (iRound = Math.round(iH / this.f25165o)) <= 0) {
            return 0L;
        }
        if (!z10 || androidx.compose.foundation.layout.a.f(iH, iRound, j10)) {
            return (((long) iH) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    public final long D0(long j10, boolean z10) {
        int i10 = f3.a.i(j10);
        int iRound = Math.round(i10 * this.f25165o);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z10 || androidx.compose.foundation.layout.a.f(iRound, i10, j10)) {
            return (((long) iRound) << 32) | (((long) i10) & 4294967295L);
        }
        return 0L;
    }

    public final long E0(long j10, boolean z10) {
        int iJ = f3.a.j(j10);
        int iRound = Math.round(iJ / this.f25165o);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z10 || androidx.compose.foundation.layout.a.f(iJ, iRound, j10)) {
            return (((long) iJ) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    @Override // i2.z
    public final int b(i2.q0 q0Var, g2.u0 u0Var, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 / this.f25165o) : u0Var.L(i10);
    }

    @Override // i2.z
    public final int c(i2.q0 q0Var, g2.u0 u0Var, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 / this.f25165o) : u0Var.b(i10);
    }

    @Override // i2.z
    public final int d(i2.q0 q0Var, g2.u0 u0Var, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 * this.f25165o) : u0Var.t(i10);
    }

    @Override // i2.z
    public final int f(i2.q0 q0Var, g2.u0 u0Var, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 * this.f25165o) : u0Var.m(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00bf  */
    @Override // i2.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final g2.w0 g(g2.x0 r8, g2.u0 r9, long r10) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y.l.g(g2.x0, g2.u0, long):g2.w0");
    }
}
