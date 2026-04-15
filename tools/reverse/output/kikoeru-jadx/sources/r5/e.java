package r5;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f18805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f18809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f18810f;

    public e(g gVar, long j10, long j11, long j12, long j13, long j14) {
        this.f18805a = gVar;
        this.f18806b = j10;
        this.f18807c = j11;
        this.f18808d = j12;
        this.f18809e = j13;
        this.f18810f = j14;
    }

    @Override // r5.b0
    public final boolean e() {
        return true;
    }

    @Override // r5.b0
    public final a0 k(long j10) {
        c0 c0Var = new c0(j10, f.a(this.f18805a.f(j10), 0L, this.f18807c, this.f18808d, this.f18809e, this.f18810f));
        return new a0(c0Var, c0Var);
    }

    @Override // r5.b0
    public final long m() {
        return this.f18806b;
    }
}
