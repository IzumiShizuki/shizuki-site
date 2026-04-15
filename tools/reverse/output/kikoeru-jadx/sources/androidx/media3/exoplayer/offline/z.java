package androidx.media3.exoplayer.offline;

import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s4.m f987b;

    public z(long j10, s4.m mVar) {
        this.f986a = j10;
        this.f987b = mVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j10 = ((z) obj).f986a;
        int i10 = c0.f16548a;
        long j11 = this.f986a;
        if (j11 < j10) {
            return -1;
        }
        return j11 == j10 ? 0 : 1;
    }
}
