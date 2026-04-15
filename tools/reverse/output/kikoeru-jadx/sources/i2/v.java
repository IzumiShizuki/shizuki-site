package i2;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f8859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8860b;

    public v() {
        this.f8859a = new int[10];
    }

    public int a(int i10) {
        int i11 = this.f8860b - 1;
        return i11 >= 0 ? this.f8859a[i11] : i10;
    }

    public int b() {
        int[] iArr = this.f8859a;
        int i10 = this.f8860b - 1;
        this.f8860b = i10;
        return iArr[i10];
    }

    public void c(int i10) {
        int[] iArrCopyOf = this.f8859a;
        if (this.f8860b >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            jc.l.d(iArrCopyOf, "copyOf(...)");
            this.f8859a = iArrCopyOf;
        }
        int i11 = this.f8860b;
        this.f8860b = i11 + 1;
        iArrCopyOf[i11] = i10;
    }

    public void d(int i10, int i11, int i12) {
        int i13 = this.f8860b;
        int[] iArrCopyOf = this.f8859a;
        int i14 = i13 + 3;
        if (i14 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            jc.l.d(iArrCopyOf, "copyOf(...)");
            this.f8859a = iArrCopyOf;
        }
        iArrCopyOf[i13] = i10 + i12;
        iArrCopyOf[i13 + 1] = i11 + i12;
        iArrCopyOf[i13 + 2] = i12;
        this.f8860b = i14;
    }

    public void e(int i10, int i11, int i12, int i13) {
        int i14 = this.f8860b;
        int[] iArrCopyOf = this.f8859a;
        int i15 = i14 + 4;
        if (i15 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            jc.l.d(iArrCopyOf, "copyOf(...)");
            this.f8859a = iArrCopyOf;
        }
        iArrCopyOf[i14] = i10;
        iArrCopyOf[i14 + 1] = i11;
        iArrCopyOf[i14 + 2] = i12;
        iArrCopyOf[i14 + 3] = i13;
        this.f8860b = i15;
    }

    public void f(int i10, int i11) {
        if (i10 < i11) {
            int i12 = i10 - 3;
            for (int i13 = i10; i13 < i11; i13 += 3) {
                int[] iArr = this.f8859a;
                int i14 = iArr[i13];
                int i15 = iArr[i11];
                if (i14 < i15 || (i14 == i15 && iArr[i13 + 1] <= iArr[i11 + 1])) {
                    i12 += 3;
                    g(i12, i13);
                }
            }
            g(i12 + 3, i11);
            f(i10, i12);
            f(i12 + 6, i11);
        }
    }

    public void g(int i10, int i11) {
        int[] iArr = this.f8859a;
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
        int i13 = i10 + 1;
        int i14 = i11 + 1;
        int i15 = iArr[i13];
        iArr[i13] = iArr[i14];
        iArr[i14] = i15;
        int i16 = i10 + 2;
        int i17 = i11 + 2;
        int i18 = iArr[i16];
        iArr[i16] = iArr[i17];
        iArr[i17] = i18;
    }

    public v(int i10) {
        this.f8859a = new int[i10];
    }
}
