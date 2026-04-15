package bb;

import java.io.Serializable;
import ud.s;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f2532c = new a(new int[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f2533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2534b;

    public a(int[] iArr) {
        int length = iArr.length;
        this.f2533a = iArr;
        this.f2534b = length;
    }

    public static a b(int i10) {
        return new a(new int[]{i10});
    }

    public final int a(int i10) {
        s.g(i10, this.f2534b);
        return this.f2533a[i10];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            int i10 = aVar.f2534b;
            int i11 = this.f2534b;
            if (i11 == i10) {
                for (int i12 = 0; i12 < i11; i12++) {
                    if (a(i12) == aVar.a(i12)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f2534b; i11++) {
            i10 = (i10 * 31) + this.f2533a[i11];
        }
        return i10;
    }

    public final String toString() {
        int i10 = this.f2534b;
        if (i10 == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i10 * 5);
        sb.append('[');
        int[] iArr = this.f2533a;
        sb.append(iArr[0]);
        for (int i11 = 1; i11 < i10; i11++) {
            sb.append(", ");
            sb.append(iArr[i11]);
        }
        sb.append(']');
        return sb.toString();
    }
}
