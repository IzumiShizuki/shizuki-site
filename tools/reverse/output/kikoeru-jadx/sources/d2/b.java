package d2;

import j2.h0;
import java.util.Arrays;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f5450c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(byte b10, int i10) {
        this(32);
        this.f5448a = i10;
        switch (i10) {
            case 1:
                break;
        }
    }

    public final void a(long j10) {
        switch (this.f5448a) {
            case 0:
                if (!c(j10)) {
                    int i10 = this.f5449b;
                    long[] jArrCopyOf = this.f5450c;
                    if (i10 >= jArrCopyOf.length) {
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i10 + 1, jArrCopyOf.length * 2));
                        l.d(jArrCopyOf, "copyOf(...)");
                        this.f5450c = jArrCopyOf;
                    }
                    jArrCopyOf[i10] = j10;
                    if (i10 >= this.f5449b) {
                        this.f5449b = i10 + 1;
                    }
                }
                break;
            default:
                int i11 = this.f5449b;
                long[] jArr = this.f5450c;
                if (i11 == jArr.length) {
                    this.f5450c = Arrays.copyOf(jArr, i11 * 2);
                }
                long[] jArr2 = this.f5450c;
                int i12 = this.f5449b;
                this.f5449b = i12 + 1;
                jArr2[i12] = j10;
                break;
        }
    }

    public void b(long[] jArr) {
        int length = this.f5449b + jArr.length;
        long[] jArr2 = this.f5450c;
        if (length > jArr2.length) {
            this.f5450c = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.f5450c, this.f5449b, jArr.length);
        this.f5449b = length;
    }

    public boolean c(long j10) {
        int i10 = this.f5449b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f5450c[i11] == j10) {
                return true;
            }
        }
        return false;
    }

    public long d(int i10) {
        if (i10 >= 0 && i10 < this.f5449b) {
            return this.f5450c[i10];
        }
        StringBuilder sbO = h0.o(i10, "Invalid index ", ", size is ");
        sbO.append(this.f5449b);
        throw new IndexOutOfBoundsException(sbO.toString());
    }

    public void e(long j10) {
        int i10 = this.f5449b;
        int i11 = 0;
        while (i11 < i10) {
            if (j10 == this.f5450c[i11]) {
                int i12 = this.f5449b - 1;
                while (i11 < i12) {
                    long[] jArr = this.f5450c;
                    int i13 = i11 + 1;
                    jArr[i11] = jArr[i13];
                    i11 = i13;
                }
                this.f5449b--;
                return;
            }
            i11++;
        }
    }

    public b(int i10) {
        this.f5448a = 1;
        this.f5450c = new long[i10];
    }
}
