package k5;

import androidx.media3.exoplayer.offline.u;
import m4.q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends l {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f11029k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f11030l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public u f11031m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int[] f11032n;

    public a(s4.h hVar, s4.m mVar, q qVar, int i10, Object obj, long j10, long j11, long j12, long j13, long j14) {
        super(hVar, mVar, qVar, i10, obj, j10, j11, j14);
        this.f11029k = j12;
        this.f11030l = j13;
    }

    public final int c(int i10) {
        int[] iArr = this.f11032n;
        p4.c.j(iArr);
        return iArr[i10];
    }
}
