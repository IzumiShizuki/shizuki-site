package y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f25131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f25132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25134d;

    public h0(l0 l0Var, long j10, int i10, int i11) {
        this.f25131a = l0Var;
        this.f25132b = j10;
        this.f25133c = i10;
        this.f25134d = i11;
    }

    public final d a(g0 g0Var, boolean z10, int i10, int i11, int i12, int i13) {
        if (!g0Var.f25130b) {
            return null;
        }
        this.f25131a.getClass();
        return null;
    }

    public final g0 b(boolean z10, int i10, long j10, o.k kVar, int i11, int i12, int i13, boolean z11, boolean z12) {
        int i14 = i12 + i13;
        if (kVar == null) {
            return new g0(true, true);
        }
        long j11 = kVar.f15994a;
        this.f25131a.getClass();
        if (i11 >= Integer.MAX_VALUE || ((int) (j10 & 4294967295L)) - ((int) (j11 & 4294967295L)) < 0) {
            return new g0(true, true);
        }
        if (i10 != 0 && (i10 >= Integer.MAX_VALUE || ((int) (j10 >> 32)) - ((int) (j11 >> 32)) < 0)) {
            return z11 ? new g0(true, true) : new g0(true, b(z10, 0, o.k.a(f3.a.h(this.f25132b), (((int) (j10 & 4294967295L)) - this.f25134d) - i13), new o.k(o.k.a(((int) (j11 >> 32)) - this.f25133c, (int) (j11 & 4294967295L))), i11 + 1, i14, 0, true, false).f25130b);
        }
        Math.max(i13, (int) (j11 & 4294967295L));
        return new g0(false, false);
    }
}
