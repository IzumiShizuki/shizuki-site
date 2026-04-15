package b0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f1353e;

    public int a(long j10) {
        int i10 = this.f1349a + 1;
        long[] jArr = (long[]) this.f1351c;
        int length = jArr.length;
        if (i10 > length) {
            int i11 = length * 2;
            long[] jArr2 = new long[i11];
            int[] iArr = new int[i11];
            vb.l.k0(jArr, jArr2, 0, 0, jArr.length);
            vb.l.l0(0, 0, 14, (int[]) this.f1352d, iArr);
            this.f1351c = jArr2;
            this.f1352d = iArr;
        }
        int i12 = this.f1349a;
        this.f1349a = i12 + 1;
        int length2 = ((int[]) this.f1353e).length;
        if (this.f1350b >= length2) {
            int i13 = length2 * 2;
            int[] iArr2 = new int[i13];
            int i14 = 0;
            while (i14 < i13) {
                int i15 = i14 + 1;
                iArr2[i14] = i15;
                i14 = i15;
            }
            vb.l.l0(0, 0, 14, (int[]) this.f1353e, iArr2);
            this.f1353e = iArr2;
        }
        int i16 = this.f1350b;
        int[] iArr3 = (int[]) this.f1353e;
        this.f1350b = iArr3[i16];
        long[] jArr3 = (long[]) this.f1351c;
        jArr3[i12] = j10;
        ((int[]) this.f1352d)[i12] = i16;
        iArr3[i16] = i12;
        while (i12 > 0) {
            int i17 = ((i12 + 1) >> 1) - 1;
            if (jc.l.h(jArr3[i17], j10) <= 0) {
                break;
            }
            b(i17, i12);
            i12 = i17;
        }
        return i16;
    }

    public void b(int i10, int i11) {
        long[] jArr = (long[]) this.f1351c;
        int[] iArr = (int[]) this.f1352d;
        int[] iArr2 = (int[]) this.f1353e;
        long j10 = jArr[i10];
        jArr[i10] = jArr[i11];
        jArr[i11] = j10;
        int i12 = iArr[i10];
        int i13 = iArr[i11];
        iArr[i10] = i13;
        iArr[i11] = i12;
        iArr2[i13] = i10;
        iArr2[i12] = i11;
    }
}
