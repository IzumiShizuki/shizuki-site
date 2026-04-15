package wb;

import h1.z;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import jc.l;
import ua.j;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends vb.f implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f23465d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f23466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f23468c;

    static {
        b bVar = new b(0);
        bVar.f23468c = true;
        f23465d = bVar;
    }

    public b(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f23466a = new Object[i10];
    }

    @Override // vb.f
    public final int a() {
        return this.f23467b;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m();
        int i10 = this.f23467b;
        ((AbstractList) this).modCount++;
        n(i10, 1);
        this.f23466a[i10] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        l.e(collection, "elements");
        m();
        int size = collection.size();
        k(this.f23467b, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m();
        p(0, this.f23467b);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f23466a;
            int i10 = this.f23467b;
            if (i10 == list.size()) {
                for (int i11 = 0; i11 < i10; i11++) {
                    if (l.a(objArr[i11], list.get(i11))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        int i11 = this.f23467b;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(a0.c.I("index: ", i10, i11, ", size: "));
        }
        return this.f23466a[i10];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f23466a;
        int i10 = this.f23467b;
        int iHashCode = 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // vb.f
    public final Object i(int i10) {
        m();
        int i11 = this.f23467b;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(a0.c.I("index: ", i10, i11, ", size: "));
        }
        return o(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.f23467b; i10++) {
            if (l.a(this.f23466a[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f23467b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void k(int i10, Collection collection, int i11) {
        ((AbstractList) this).modCount++;
        n(i10, i11);
        Iterator it = collection.iterator();
        for (int i12 = 0; i12 < i11; i12++) {
            this.f23466a[i10 + i12] = it.next();
        }
    }

    public final void l(int i10, Object obj) {
        ((AbstractList) this).modCount++;
        n(i10, 1);
        this.f23466a[i10] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i10 = this.f23467b - 1; i10 >= 0; i10--) {
            if (l.a(this.f23466a[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final void m() {
        if (this.f23468c) {
            throw new UnsupportedOperationException();
        }
    }

    public final void n(int i10, int i11) {
        int i12 = this.f23467b + i11;
        if (i12 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f23466a;
        if (i12 > objArr.length) {
            int length = objArr.length;
            int i13 = length + (length >> 1);
            if (i13 - i12 < 0) {
                i13 = i12;
            }
            if (i13 - 2147483639 > 0) {
                i13 = i12 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i13);
            l.d(objArrCopyOf, "copyOf(...)");
            this.f23466a = objArrCopyOf;
        }
        Object[] objArr2 = this.f23466a;
        vb.l.i0(i10 + i11, i10, this.f23467b, objArr2, objArr2);
        this.f23467b += i11;
    }

    public final Object o(int i10) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f23466a;
        Object obj = objArr[i10];
        vb.l.i0(i10, i10 + 1, this.f23467b, objArr, objArr);
        Object[] objArr2 = this.f23466a;
        int i11 = this.f23467b - 1;
        l.e(objArr2, "<this>");
        objArr2[i11] = null;
        this.f23467b--;
        return obj;
    }

    public final void p(int i10, int i11) {
        if (i11 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f23466a;
        vb.l.i0(i10, i10 + i11, this.f23467b, objArr, objArr);
        Object[] objArr2 = this.f23466a;
        int i12 = this.f23467b;
        ud.b.G(i12 - i11, i12, objArr2);
        this.f23467b -= i11;
    }

    public final int q(int i10, int i11, Collection collection, boolean z10) {
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            if (collection.contains(this.f23466a[i14]) == z10) {
                Object[] objArr = this.f23466a;
                i12++;
                objArr[i13 + i10] = objArr[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        Object[] objArr2 = this.f23466a;
        vb.l.i0(i10 + i13, i11 + i10, this.f23467b, objArr2, objArr2);
        Object[] objArr3 = this.f23466a;
        int i16 = this.f23467b;
        ud.b.G(i16 - i15, i16, objArr3);
        if (i15 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f23467b -= i15;
        return i15;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            i(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        l.e(collection, "elements");
        m();
        return q(0, this.f23467b, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        l.e(collection, "elements");
        m();
        return q(0, this.f23467b, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        m();
        int i11 = this.f23467b;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(a0.c.I("index: ", i10, i11, ", size: "));
        }
        Object[] objArr = this.f23466a;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i10, int i11) {
        j.g(i10, i11, this.f23467b);
        return new a(this.f23466a, i10, i11 - i10, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        l.e(objArr, "array");
        int length = objArr.length;
        int i10 = this.f23467b;
        if (length < i10) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f23466a, 0, i10, objArr.getClass());
            l.d(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        vb.l.i0(0, 0, i10, this.f23466a, objArr);
        int i11 = this.f23467b;
        if (i11 < objArr.length) {
            objArr[i11] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return ud.b.a(this.f23466a, 0, this.f23467b, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        int i11 = this.f23467b;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(a0.c.I("index: ", i10, i11, ", size: "));
        }
        return new z(this, i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        l.e(collection, "elements");
        m();
        int i11 = this.f23467b;
        if (i10 >= 0 && i10 <= i11) {
            int size = collection.size();
            k(i10, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(a0.c.I("index: ", i10, i11, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        m();
        int i11 = this.f23467b;
        if (i10 >= 0 && i10 <= i11) {
            ((AbstractList) this).modCount++;
            n(i10, 1);
            this.f23466a[i10] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(a0.c.I("index: ", i10, i11, ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return vb.l.o0(0, this.f23467b, this.f23466a);
    }
}
