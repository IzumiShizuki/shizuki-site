package r5;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d2.b f18894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d2.b f18895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f18896c;

    public y(long j10, long[] jArr, long[] jArr2) {
        p4.c.c(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.f18894a = new d2.b(length);
            this.f18895b = new d2.b(length);
        } else {
            int i10 = length + 1;
            d2.b bVar = new d2.b(i10);
            this.f18894a = bVar;
            d2.b bVar2 = new d2.b(i10);
            this.f18895b = bVar2;
            bVar.a(0L);
            bVar2.a(0L);
        }
        this.f18894a.b(jArr);
        this.f18895b.b(jArr2);
        this.f18896c = j10;
    }

    @Override // r5.b0
    public final boolean e() {
        return this.f18895b.f5449b > 0;
    }

    @Override // r5.b0
    public final a0 k(long j10) {
        d2.b bVar = this.f18895b;
        if (bVar.f5449b == 0) {
            c0 c0Var = c0.f18783c;
            return new a0(c0Var, c0Var);
        }
        int iB = p4.c0.b(bVar, j10);
        long jD = bVar.d(iB);
        d2.b bVar2 = this.f18894a;
        c0 c0Var2 = new c0(jD, bVar2.d(iB));
        if (jD == j10 || iB == bVar.f5449b - 1) {
            return new a0(c0Var2, c0Var2);
        }
        int i10 = iB + 1;
        return new a0(c0Var2, new c0(bVar.d(i10), bVar2.d(i10)));
    }

    @Override // r5.b0
    public final long m() {
        return this.f18896c;
    }
}
