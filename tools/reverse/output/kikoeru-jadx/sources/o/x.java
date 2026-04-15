package o;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f16070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16071b;

    public x(int i10) {
        this.f16070a = i10 == 0 ? o.f16027a : new int[i10];
    }

    public final void a(int i10) {
        b(this.f16071b + 1);
        int[] iArr = this.f16070a;
        int i11 = this.f16071b;
        iArr[i11] = i10;
        this.f16071b = i11 + 1;
    }

    public final void b(int i10) {
        int[] iArr = this.f16070a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i10, (iArr.length * 3) / 2));
            jc.l.d(iArrCopyOf, "copyOf(...)");
            this.f16070a = iArrCopyOf;
        }
    }

    public final int c(int i10) {
        if (i10 >= 0 && i10 < this.f16071b) {
            return this.f16070a[i10];
        }
        p.a.d("Index must be between 0 and size");
        throw null;
    }

    public final int d() {
        int i10 = this.f16071b;
        if (i10 != 0) {
            return this.f16070a[i10 - 1];
        }
        p.a.e("IntList is empty.");
        throw null;
    }

    public final void e(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f16071b)) {
            p.a.d("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f16070a;
        int i12 = iArr[i10];
        if (i10 != i11 - 1) {
            vb.l.h0(i10, i10 + 1, i11, iArr, iArr);
        }
        this.f16071b--;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            x xVar = (x) obj;
            int i10 = xVar.f16071b;
            int i11 = this.f16071b;
            if (i10 == i11) {
                int[] iArr = this.f16070a;
                int[] iArr2 = xVar.f16070a;
                oc.d dVarE = nh.b.E(0, i11);
                int i12 = dVarE.f16307a;
                int i13 = dVarE.f16308b;
                if (i12 > i13) {
                    return true;
                }
                while (iArr[i12] == iArr2[i12]) {
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

    public final void f(int i10, int i11) {
        if (i10 < 0 || i10 >= this.f16071b) {
            p.a.d("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f16070a;
        int i12 = iArr[i10];
        iArr[i10] = i11;
    }

    public final int hashCode() {
        int[] iArr = this.f16070a;
        int i10 = this.f16071b;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12] * 31;
        }
        return i11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f16070a;
        int i10 = this.f16071b;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                sb.append((CharSequence) "]");
                break;
            }
            int i12 = iArr[i11];
            if (i11 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i11 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i12);
            i11++;
        }
        String string = sb.toString();
        jc.l.d(string, "toString(...)");
        return string;
    }

    public /* synthetic */ x() {
        this(16);
    }
}
