package o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Collection, Set, kc.b, kc.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f15950a = p.a.f16474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f15951b = p.a.f16476c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15952c;

    public f(int i10) {
        if (i10 > 0) {
            t.b(this, i10);
        }
    }

    public final Object a(int i10) {
        int i11 = this.f15952c;
        Object[] objArr = this.f15951b;
        Object obj = objArr[i10];
        if (i11 <= 1) {
            clear();
            return obj;
        }
        int i12 = i11 - 1;
        int[] iArr = this.f15950a;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            if (i10 < i12) {
                int i13 = i10 + 1;
                vb.l.h0(i10, i13, i11, iArr, iArr);
                Object[] objArr2 = this.f15951b;
                vb.l.i0(i10, i13, i11, objArr2, objArr2);
            }
            this.f15951b[i12] = null;
        } else {
            int i14 = i11 > 8 ? i11 + (i11 >> 1) : 8;
            int[] iArr2 = new int[i14];
            this.f15950a = iArr2;
            this.f15951b = new Object[i14];
            if (i10 > 0) {
                vb.l.l0(0, i10, 6, iArr, iArr2);
                vb.l.m0(0, i10, 6, objArr, this.f15951b);
            }
            if (i10 < i12) {
                int i15 = i10 + 1;
                vb.l.h0(i10, i15, i11, iArr, this.f15950a);
                vb.l.i0(i10, i15, i11, objArr, this.f15951b);
            }
        }
        if (i11 != this.f15952c) {
            throw new ConcurrentModificationException();
        }
        this.f15952c = i12;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i10;
        int iC;
        int i11 = this.f15952c;
        if (obj == null) {
            iC = t.c(this, null, 0);
            i10 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i10 = iHashCode;
            iC = t.c(this, obj, iHashCode);
        }
        if (iC >= 0) {
            return false;
        }
        int i12 = ~iC;
        int[] iArr = this.f15950a;
        if (i11 >= iArr.length) {
            int i13 = 8;
            if (i11 >= 8) {
                i13 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i13 = 4;
            }
            Object[] objArr = this.f15951b;
            int[] iArr2 = new int[i13];
            this.f15950a = iArr2;
            this.f15951b = new Object[i13];
            if (i11 != this.f15952c) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                vb.l.l0(0, iArr.length, 6, iArr, iArr2);
                vb.l.m0(0, objArr.length, 6, objArr, this.f15951b);
            }
        }
        if (i12 < i11) {
            int[] iArr3 = this.f15950a;
            int i14 = i12 + 1;
            vb.l.h0(i14, i12, i11, iArr3, iArr3);
            Object[] objArr2 = this.f15951b;
            vb.l.i0(i14, i12, i11, objArr2, objArr2);
        }
        int i15 = this.f15952c;
        if (i11 == i15) {
            int[] iArr4 = this.f15950a;
            if (i12 < iArr4.length) {
                iArr4[i12] = i10;
                this.f15951b[i12] = obj;
                this.f15952c = i15 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        jc.l.e(collection, "elements");
        int size = collection.size() + this.f15952c;
        int i10 = this.f15952c;
        int[] iArr = this.f15950a;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f15951b;
            int[] iArr2 = new int[size];
            this.f15950a = iArr2;
            this.f15951b = new Object[size];
            if (i10 > 0) {
                vb.l.l0(0, i10, 6, iArr, iArr2);
                vb.l.m0(0, this.f15952c, 6, objArr, this.f15951b);
            }
        }
        if (this.f15952c != i10) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f15952c != 0) {
            this.f15950a = p.a.f16474a;
            this.f15951b = p.a.f16476c;
            this.f15952c = 0;
        }
        if (this.f15952c != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? t.c(this, null, 0) : t.c(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        jc.l.e(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f15952c != ((Set) obj).size()) {
            return false;
        }
        try {
            int i10 = this.f15952c;
            for (int i11 = 0; i11 < i10; i11++) {
                if (!((Set) obj).contains(this.f15951b[i11])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f15950a;
        int i10 = this.f15952c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f15952c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iC = obj == null ? t.c(this, null, 0) : t.c(this, obj, obj.hashCode());
        if (iC < 0) {
            return false;
        }
        a(iC);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        jc.l.e(collection, "elements");
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        jc.l.e(collection, "elements");
        boolean z10 = false;
        for (int i10 = this.f15952c - 1; -1 < i10; i10--) {
            if (!vb.m.S(collection, this.f15951b[i10])) {
                a(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f15952c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return vb.l.o0(0, this.f15952c, this.f15951b);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f15952c * 14);
        sb.append('{');
        int i10 = this.f15952c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            Object obj = this.f15951b[i11];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        jc.l.d(string, "toString(...)");
        return string;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        jc.l.e(objArr, "array");
        int i10 = this.f15952c;
        if (objArr.length < i10) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i10);
        } else if (objArr.length > i10) {
            objArr[i10] = null;
        }
        vb.l.i0(0, 0, this.f15952c, this.f15951b, objArr);
        return objArr;
    }
}
