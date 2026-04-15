package l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k implements j3.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1.d f11517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f11518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f11519c = 0;

    public k(j1.d dVar, o oVar) {
        this.f11517a = dVar;
        this.f11518b = oVar;
    }

    @Override // j3.x
    public final long a(f3.k kVar, long j10, f3.m mVar, long j11) {
        long jB = this.f11518b.b();
        if ((9223372034707292159L & jB) == 9205357640488583168L) {
            jB = this.f11519c;
        }
        this.f11519c = jB;
        return f3.j.d(f3.j.d((((long) kVar.f6662a) << 32) | (((long) kVar.f6663b) & 4294967295L), android.support.v4.media.session.b.X(jB)), this.f11517a.a(j11, 0L, mVar));
    }
}
