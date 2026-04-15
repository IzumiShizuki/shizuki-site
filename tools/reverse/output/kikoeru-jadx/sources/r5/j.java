package r5;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f18835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f18836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f18837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f18838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f18839f;

    public j(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f18835b = iArr;
        this.f18836c = jArr;
        this.f18837d = jArr2;
        this.f18838e = jArr3;
        int length = iArr.length;
        this.f18834a = length;
        if (length > 0) {
            this.f18839f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f18839f = 0L;
        }
    }

    @Override // r5.b0
    public final boolean e() {
        return true;
    }

    @Override // r5.b0
    public final a0 k(long j10) {
        long[] jArr = this.f18838e;
        int iE = p4.c0.e(jArr, j10, true);
        long j11 = jArr[iE];
        long[] jArr2 = this.f18836c;
        c0 c0Var = new c0(j11, jArr2[iE]);
        if (j11 >= j10 || iE == this.f18834a - 1) {
            return new a0(c0Var, c0Var);
        }
        int i10 = iE + 1;
        return new a0(c0Var, new c0(jArr[i10], jArr2[i10]));
    }

    @Override // r5.b0
    public final long m() {
        return this.f18839f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f18834a + ", sizes=" + Arrays.toString(this.f18835b) + ", offsets=" + Arrays.toString(this.f18836c) + ", timeUs=" + Arrays.toString(this.f18838e) + ", durationsUs=" + Arrays.toString(this.f18837d) + ")";
    }
}
