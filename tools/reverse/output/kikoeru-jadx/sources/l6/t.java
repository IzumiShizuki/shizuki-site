package l6;

import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f11865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f11867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f11868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f11870f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f11871g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f11872h;

    public t(q qVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        p4.c.c(iArr.length == jArr2.length);
        p4.c.c(jArr.length == jArr2.length);
        p4.c.c(iArr2.length == jArr2.length);
        this.f11865a = qVar;
        this.f11867c = jArr;
        this.f11868d = iArr;
        this.f11869e = i10;
        this.f11870f = jArr2;
        this.f11871g = iArr2;
        this.f11872h = j10;
        this.f11866b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j10) {
        long[] jArr = this.f11870f;
        for (int iA = c0.a(jArr, j10, true); iA < jArr.length; iA++) {
            if ((this.f11871g[iA] & 1) != 0) {
                return iA;
            }
        }
        return -1;
    }
}
