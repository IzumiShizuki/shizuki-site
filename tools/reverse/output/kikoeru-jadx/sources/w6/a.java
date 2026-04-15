package w6;

import android.graphics.Rect;
import java.util.Arrays;
import p4.r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f23423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f23424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f23425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23426e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23427f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Rect f23428g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f23422a = new int[4];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f23429h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23430i = -1;

    public static int a(int[] iArr, int i10) {
        return (i10 < 0 || i10 >= iArr.length) ? iArr[0] : iArr[i10];
    }

    public static int c(int i10, int i11) {
        return (i10 & 16777215) | ((i11 * 17) << 24);
    }

    public final void b(r rVar, boolean z10, Rect rect, int[] iArr) {
        int i10;
        int i11;
        int iWidth = rect.width();
        int iHeight = rect.height();
        int i12 = !z10 ? 1 : 0;
        int i13 = i12 * iWidth;
        while (true) {
            int i14 = 0;
            do {
                int i15 = 0;
                for (int i16 = 1; i15 < i16 && i16 <= 64; i16 <<= 2) {
                    if (rVar.b() < 4) {
                        i11 = 0;
                        i10 = -1;
                        break;
                    }
                    i15 = (i15 << 4) | rVar.i(4);
                }
                i10 = i15 & 3;
                i11 = i15 < 4 ? iWidth : i15 >> 2;
                int iMin = Math.min(i11, iWidth - i14);
                if (iMin > 0) {
                    int i17 = i13 + iMin;
                    Arrays.fill(iArr, i13, i17, this.f23422a[i10]);
                    i14 += iMin;
                    i13 = i17;
                }
            } while (i14 < iWidth);
            i12 += 2;
            if (i12 >= iHeight) {
                return;
            }
            i13 = i12 * iWidth;
            rVar.c();
        }
    }
}
