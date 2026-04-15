package o;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f15982a;

    static {
        long[] jArr = s0.f16040a;
        int iD = s0.d(0);
        int iMax = iD > 0 ? Math.max(7, s0.c(iD)) : 0;
        if (iMax != 0) {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            vb.l.r0(jArr, -9187201950435737472L);
        }
        int i10 = iMax >> 3;
        long j10 = 255 << ((iMax & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j10)) | j10;
        float[] fArr = new float[iMax];
        f15982a = new float[0];
    }
}
