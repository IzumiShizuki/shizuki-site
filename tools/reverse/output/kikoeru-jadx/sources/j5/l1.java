package j5;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l1 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f10350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10351b;

    public l1(c1 c1Var, long j10) {
        this.f10350a = c1Var;
        this.f10351b = j10;
    }

    @Override // j5.c1
    public final boolean a() {
        return this.f10350a.a();
    }

    @Override // j5.c1
    public final void b() {
        this.f10350a.b();
    }

    @Override // j5.c1
    public final int j(long j10) {
        return this.f10350a.j(j10 - this.f10351b);
    }

    @Override // j5.c1
    public final int n(v2.e eVar, u4.f fVar, int i10) {
        int iN = this.f10350a.n(eVar, fVar, i10);
        if (iN == -4) {
            fVar.f21384g += this.f10351b;
        }
        return iN;
    }
}
