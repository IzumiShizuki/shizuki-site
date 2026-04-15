package g2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f7182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f7183d = i1.f7207a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f7184e = 0;

    public g1() {
        long j10 = 0;
        this.f7182c = (j10 & 4294967295L) | (j10 << 32);
    }

    public /* synthetic */ Object A() {
        return null;
    }

    public abstract int R(t tVar);

    public int V() {
        return (int) (this.f7182c & 4294967295L);
    }

    public int W() {
        return (int) (this.f7182c >> 32);
    }

    public final void X() {
        this.f7180a = nh.b.k((int) (this.f7182c >> 32), f3.a.j(this.f7183d), f3.a.h(this.f7183d));
        int iK = nh.b.k((int) (this.f7182c & 4294967295L), f3.a.i(this.f7183d), f3.a.g(this.f7183d));
        this.f7181b = iK;
        int i10 = this.f7180a;
        long j10 = this.f7182c;
        this.f7184e = (((long) ((i10 - ((int) (j10 >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iK - ((int) (j10 & 4294967295L))) / 2)));
    }

    public abstract void Y(long j10, float f10, ic.k kVar);

    public void d0(long j10, float f10, t1.b bVar) {
        Y(j10, f10, null);
    }

    public final void h0(long j10) {
        if (f3.l.b(this.f7182c, j10)) {
            return;
        }
        this.f7182c = j10;
        X();
    }

    public final void k0(long j10) {
        if (f3.a.b(this.f7183d, j10)) {
            return;
        }
        this.f7183d = j10;
        X();
    }
}
