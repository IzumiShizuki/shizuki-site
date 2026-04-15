package bb;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import ud.s;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractList implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f2535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2537c;

    public b(int[] iArr, int i10, int i11) {
        this.f2535a = iArr;
        this.f2536b = i10;
        this.f2537c = i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Integer) {
            return g8.a.R(this.f2535a, ((Integer) obj).intValue(), this.f2536b, this.f2537c) != -1;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return super.equals(obj);
        }
        b bVar = (b) obj;
        int size = size();
        if (bVar.size() != size) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f2535a[this.f2536b + i10] != bVar.f2535a[bVar.f2536b + i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        s.g(i10, size());
        return Integer.valueOf(this.f2535a[this.f2536b + i10]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = this.f2536b; i11 < this.f2537c; i11++) {
            i10 = (i10 * 31) + this.f2535a[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f2537c;
        int[] iArr = this.f2535a;
        int i11 = this.f2536b;
        int iR = g8.a.R(iArr, iIntValue, i11, i10);
        if (iR >= 0) {
            return iR - i11;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i10;
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i11 = this.f2537c;
            while (true) {
                i11--;
                i10 = this.f2536b;
                if (i11 < i10) {
                    i11 = -1;
                    break;
                }
                if (this.f2535a[i11] == iIntValue) {
                    break;
                }
            }
            if (i11 >= 0) {
                return i11 - i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        Integer num = (Integer) obj;
        s.g(i10, size());
        int i11 = this.f2536b + i10;
        int[] iArr = this.f2535a;
        int i12 = iArr[i11];
        num.getClass();
        iArr[i11] = num.intValue();
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2537c - this.f2536b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i10, int i11) {
        s.j(i10, i11, size());
        if (i10 == i11) {
            return Collections.EMPTY_LIST;
        }
        int i12 = this.f2536b;
        return new b(this.f2535a, i10 + i12, i12 + i11);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        int[] iArr = this.f2535a;
        int i10 = this.f2536b;
        sb.append(iArr[i10]);
        while (true) {
            i10++;
            if (i10 >= this.f2537c) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i10]);
        }
    }
}
