package x0;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class c2 {
    public static final int a(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 3];
    }

    public static final int b(ArrayList arrayList, int i10, int i11) {
        int iE = e(arrayList, i10, i11);
        return iE >= 0 ? iE : -(iE + 1);
    }

    public static final int c(int[] iArr, int i10) {
        int i11 = i10 * 5;
        return Integer.bitCount(iArr[i11 + 1] >> 28) + iArr[i11 + 4];
    }

    public static final void d(int[] iArr, int i10, int i11) {
        if (i11 >= 0) {
        }
        int i12 = (i10 * 5) + 1;
        iArr[i12] = i11 | (iArr[i12] & (-67108864));
    }

    public static final int e(ArrayList arrayList, int i10, int i11) {
        int size = arrayList.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) >>> 1;
            int i14 = ((a) arrayList.get(i13)).f24233a;
            if (i14 < 0) {
                i14 += i11;
            }
            int iG = jc.l.g(i14, i10);
            if (iG < 0) {
                i12 = i13 + 1;
            } else {
                if (iG <= 0) {
                    return i13;
                }
                size = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    public static final void f() {
        throw new ConcurrentModificationException();
    }
}
