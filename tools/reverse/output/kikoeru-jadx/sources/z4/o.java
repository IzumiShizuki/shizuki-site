package z4;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o extends n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f26448j;

    public o(j jVar, long j10, long j11, long j12, long j13, List list, long j14, List list2, long j15, long j16) {
        super(jVar, j10, j11, j12, j13, list, j14, j15, j16);
        this.f26448j = list2;
    }

    @Override // z4.n
    public final long d(long j10) {
        return this.f26448j.size();
    }

    @Override // z4.n
    public final j h(k kVar, long j10) {
        return (j) this.f26448j.get((int) (j10 - this.f26442d));
    }

    @Override // z4.n
    public final boolean i() {
        return true;
    }
}
