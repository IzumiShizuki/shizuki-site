package o;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f15923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15924b;

    public b0(int i10) {
        this.f15923a = i10 == 0 ? r.f16034a : new long[i10];
    }

    public final void a(long j10) {
        int i10 = this.f15924b + 1;
        long[] jArr = this.f15923a;
        if (jArr.length < i10) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i10, (jArr.length * 3) / 2));
            jc.l.d(jArrCopyOf, "copyOf(...)");
            this.f15923a = jArrCopyOf;
        }
        long[] jArr2 = this.f15923a;
        int i11 = this.f15924b;
        jArr2[i11] = j10;
        this.f15924b = i11 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            int i10 = b0Var.f15924b;
            int i11 = this.f15924b;
            if (i10 == i11) {
                long[] jArr = this.f15923a;
                long[] jArr2 = b0Var.f15923a;
                oc.d dVarE = nh.b.E(0, i11);
                int i12 = dVarE.f16307a;
                int i13 = dVarE.f16308b;
                if (i12 > i13) {
                    return true;
                }
                while (jArr[i12] == jArr2[i12]) {
                    if (i12 == i13) {
                        return true;
                    }
                    i12++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.f15923a;
        int i10 = this.f15924b;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            long j10 = jArr[i12];
            i11 += ((int) (j10 ^ (j10 >>> 32))) * 31;
        }
        return i11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.f15923a;
        int i10 = this.f15924b;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                sb.append((CharSequence) "]");
                break;
            }
            long j10 = jArr[i11];
            if (i11 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i11 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(j10);
            i11++;
        }
        String string = sb.toString();
        jc.l.d(string, "toString(...)");
        return string;
    }
}
