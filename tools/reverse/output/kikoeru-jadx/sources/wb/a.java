package wb;

import h1.z;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import jc.l;
import ua.j;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends vb.f implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f23460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f23463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f23464e;

    public a(Object[] objArr, int i10, int i11, a aVar, b bVar) {
        l.e(objArr, "backing");
        l.e(bVar, "root");
        this.f23460a = objArr;
        this.f23461b = i10;
        this.f23462c = i11;
        this.f23463d = aVar;
        this.f23464e = bVar;
        ((AbstractList) this).modCount = ((AbstractList) bVar).modCount;
    }

    @Override // vb.f
    public final int a() {
        m();
        return this.f23462c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        n();
        m();
        l(this.f23461b + this.f23462c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        l.e(collection, "elements");
        n();
        m();
        int size = collection.size();
        k(this.f23461b + this.f23462c, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        n();
        m();
        p(this.f23461b, this.f23462c);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        m();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f23460a;
            int i10 = this.f23462c;
            if (i10 == list.size()) {
                for (int i11 = 0; i11 < i10; i11++) {
                    if (l.a(objArr[this.f23461b + i11], list.get(i11))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        m();
        int i11 = this.f23462c;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(a0.c.I("index: ", i10, i11, ", size: "));
        }
        return this.f23460a[this.f23461b + i10];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        m();
        Object[] objArr = this.f23460a;
        int i10 = this.f23462c;
        int iHashCode = 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[this.f23461b + i11];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // vb.f
    public final Object i(int i10) {
        n();
        m();
        int i11 = this.f23462c;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(a0.c.I("index: ", i10, i11, ", size: "));
        }
        return o(this.f23461b + i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        m();
        for (int i10 = 0; i10 < this.f23462c; i10++) {
            if (l.a(this.f23460a[this.f23461b + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        m();
        return this.f23462c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void k(int i10, Collection collection, int i11) {
        ((AbstractList) this).modCount++;
        b bVar = this.f23464e;
        a aVar = this.f23463d;
        if (aVar != null) {
            aVar.k(i10, collection, i11);
        } else {
            b bVar2 = b.f23465d;
            bVar.k(i10, collection, i11);
        }
        this.f23460a = bVar.f23466a;
        this.f23462c += i11;
    }

    public final void l(int i10, Object obj) {
        ((AbstractList) this).modCount++;
        b bVar = this.f23464e;
        a aVar = this.f23463d;
        if (aVar != null) {
            aVar.l(i10, obj);
        } else {
            b bVar2 = b.f23465d;
            bVar.l(i10, obj);
        }
        this.f23460a = bVar.f23466a;
        this.f23462c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        m();
        for (int i10 = this.f23462c - 1; i10 >= 0; i10--) {
            if (l.a(this.f23460a[this.f23461b + i10], obj)) {
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
        if (((AbstractList) this.f23464e).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void n() {
        if (this.f23464e.f23468c) {
            throw new UnsupportedOperationException();
        }
    }

    public final Object o(int i10) {
        Object objO;
        ((AbstractList) this).modCount++;
        a aVar = this.f23463d;
        if (aVar != null) {
            objO = aVar.o(i10);
        } else {
            b bVar = b.f23465d;
            objO = this.f23464e.o(i10);
        }
        this.f23462c--;
        return objO;
    }

    public final void p(int i10, int i11) {
        if (i11 > 0) {
            ((AbstractList) this).modCount++;
        }
        a aVar = this.f23463d;
        if (aVar != null) {
            aVar.p(i10, i11);
        } else {
            b bVar = b.f23465d;
            this.f23464e.p(i10, i11);
        }
        this.f23462c -= i11;
    }

    public final int q(int i10, int i11, Collection collection, boolean z10) {
        int iQ;
        a aVar = this.f23463d;
        if (aVar != null) {
            iQ = aVar.q(i10, i11, collection, z10);
        } else {
            b bVar = b.f23465d;
            iQ = this.f23464e.q(i10, i11, collection, z10);
        }
        if (iQ > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f23462c -= iQ;
        return iQ;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        n();
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
        n();
        m();
        return q(this.f23461b, this.f23462c, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        l.e(collection, "elements");
        n();
        m();
        return q(this.f23461b, this.f23462c, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        n();
        m();
        int i11 = this.f23462c;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(a0.c.I("index: ", i10, i11, ", size: "));
        }
        Object[] objArr = this.f23460a;
        int i12 = this.f23461b;
        Object obj2 = objArr[i12 + i10];
        objArr[i12 + i10] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i10, int i11) {
        j.g(i10, i11, this.f23462c);
        return new a(this.f23460a, this.f23461b + i10, i11 - i10, this, this.f23464e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        l.e(objArr, "array");
        m();
        int length = objArr.length;
        int i10 = this.f23462c;
        int i11 = this.f23461b;
        if (length < i10) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f23460a, i11, i10 + i11, objArr.getClass());
            l.d(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        vb.l.i0(0, i11, i10 + i11, this.f23460a, objArr);
        int i12 = this.f23462c;
        if (i12 < objArr.length) {
            objArr[i12] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        m();
        return ud.b.a(this.f23460a, this.f23461b, this.f23462c, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        m();
        int i11 = this.f23462c;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(a0.c.I("index: ", i10, i11, ", size: "));
        }
        return new z(this, i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        n();
        m();
        int i11 = this.f23462c;
        if (i10 >= 0 && i10 <= i11) {
            l(this.f23461b + i10, obj);
            return;
        }
        throw new IndexOutOfBoundsException(a0.c.I("index: ", i10, i11, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        l.e(collection, "elements");
        n();
        m();
        int i11 = this.f23462c;
        if (i10 >= 0 && i10 <= i11) {
            int size = collection.size();
            k(this.f23461b + i10, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(a0.c.I("index: ", i10, i11, ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        m();
        Object[] objArr = this.f23460a;
        int i10 = this.f23462c;
        int i11 = this.f23461b;
        return vb.l.o0(i11, i10 + i11, objArr);
    }
}
