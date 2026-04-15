package t;

import j3.x;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20070a;

    public f(long j10) {
        this.f20070a = j10;
    }

    @Override // j3.x
    public final long a(f3.k kVar, long j10, f3.m mVar, long j11) {
        int i10 = kVar.f6662a;
        long j12 = this.f20070a;
        return (((long) nh.a.e(i10 + ((int) (j12 >> 32)), (int) (j11 >> 32), (int) (j10 >> 32), mVar == f3.m.f6667a)) << 32) | (((long) nh.a.e(kVar.f6663b + ((int) (j12 & 4294967295L)), (int) (j11 & 4294967295L), (int) (j10 & 4294967295L), true)) & 4294967295L);
    }
}
