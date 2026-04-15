package vb;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object[] f22813d = new Object[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f22815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22816c;

    public j() {
        this.f22815b = f22813d;
    }

    @Override // vb.f
    public final int a() {
        return this.f22816c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int length;
        int i11 = this.f22816c;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(a0.c.I("index: ", i10, i11, ", size: "));
        }
        if (i10 == i11) {
            addLast(obj);
            return;
        }
        if (i10 == 0) {
            addFirst(obj);
            return;
        }
        r();
        k(this.f22816c + 1);
        int iQ = q(this.f22814a + i10);
        int i12 = this.f22816c;
        if (i10 < ((i12 + 1) >> 1)) {
            if (iQ == 0) {
                Object[] objArr = this.f22815b;
                jc.l.e(objArr, "<this>");
                iQ = objArr.length;
            }
            int i13 = iQ - 1;
            int i14 = this.f22814a;
            if (i14 == 0) {
                Object[] objArr2 = this.f22815b;
                jc.l.e(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i14 - 1;
            }
            int i15 = this.f22814a;
            if (i13 >= i15) {
                Object[] objArr3 = this.f22815b;
                objArr3[length] = objArr3[i15];
                l.i0(i15, i15 + 1, i13 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.f22815b;
                l.i0(i15 - 1, i15, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f22815b;
                objArr5[objArr5.length - 1] = objArr5[0];
                l.i0(0, 1, i13 + 1, objArr5, objArr5);
            }
            this.f22815b[i13] = obj;
            this.f22814a = length;
        } else {
            int iQ2 = q(i12 + this.f22814a);
            if (iQ < iQ2) {
                Object[] objArr6 = this.f22815b;
                l.i0(iQ + 1, iQ, iQ2, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.f22815b;
                l.i0(1, 0, iQ2, objArr7, objArr7);
                Object[] objArr8 = this.f22815b;
                objArr8[0] = objArr8[objArr8.length - 1];
                l.i0(iQ + 1, iQ, objArr8.length - 1, objArr8, objArr8);
            }
            this.f22815b[iQ] = obj;
        }
        this.f22816c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        jc.l.e(collection, "elements");
        int i11 = this.f22816c;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(a0.c.I("index: ", i10, i11, ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i10 == this.f22816c) {
            return addAll(collection);
        }
        r();
        k(collection.size() + this.f22816c);
        int iQ = q(this.f22816c + this.f22814a);
        int iQ2 = q(this.f22814a + i10);
        int size = collection.size();
        if (i10 >= ((this.f22816c + 1) >> 1)) {
            int i12 = iQ2 + size;
            if (iQ2 < iQ) {
                int i13 = size + iQ;
                Object[] objArr = this.f22815b;
                if (i13 <= objArr.length) {
                    l.i0(i12, iQ2, iQ, objArr, objArr);
                } else if (i12 >= objArr.length) {
                    l.i0(i12 - objArr.length, iQ2, iQ, objArr, objArr);
                } else {
                    int length = iQ - (i13 - objArr.length);
                    l.i0(0, length, iQ, objArr, objArr);
                    Object[] objArr2 = this.f22815b;
                    l.i0(i12, iQ2, length, objArr2, objArr2);
                }
            } else {
                Object[] objArr3 = this.f22815b;
                l.i0(size, 0, iQ, objArr3, objArr3);
                Object[] objArr4 = this.f22815b;
                if (i12 >= objArr4.length) {
                    l.i0(i12 - objArr4.length, iQ2, objArr4.length, objArr4, objArr4);
                } else {
                    l.i0(0, objArr4.length - size, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.f22815b;
                    l.i0(i12, iQ2, objArr5.length - size, objArr5, objArr5);
                }
            }
            j(iQ2, collection);
            return true;
        }
        int i14 = this.f22814a;
        int length2 = i14 - size;
        if (iQ2 < i14) {
            Object[] objArr6 = this.f22815b;
            l.i0(length2, i14, objArr6.length, objArr6, objArr6);
            if (size >= iQ2) {
                Object[] objArr7 = this.f22815b;
                l.i0(objArr7.length - size, 0, iQ2, objArr7, objArr7);
            } else {
                Object[] objArr8 = this.f22815b;
                l.i0(objArr8.length - size, 0, size, objArr8, objArr8);
                Object[] objArr9 = this.f22815b;
                l.i0(0, size, iQ2, objArr9, objArr9);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.f22815b;
            l.i0(length2, i14, iQ2, objArr10, objArr10);
        } else {
            Object[] objArr11 = this.f22815b;
            length2 += objArr11.length;
            int i15 = iQ2 - i14;
            int length3 = objArr11.length - length2;
            if (length3 >= i15) {
                l.i0(length2, i14, iQ2, objArr11, objArr11);
            } else {
                l.i0(length2, i14, i14 + length3, objArr11, objArr11);
                Object[] objArr12 = this.f22815b;
                l.i0(0, this.f22814a + length3, iQ2, objArr12, objArr12);
            }
        }
        this.f22814a = length2;
        j(o(iQ2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        r();
        k(this.f22816c + 1);
        int length = this.f22814a;
        if (length == 0) {
            Object[] objArr = this.f22815b;
            jc.l.e(objArr, "<this>");
            length = objArr.length;
        }
        int i10 = length - 1;
        this.f22814a = i10;
        this.f22815b[i10] = obj;
        this.f22816c++;
    }

    public final void addLast(Object obj) {
        r();
        k(a() + 1);
        this.f22815b[q(a() + this.f22814a)] = obj;
        this.f22816c = a() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            r();
            p(this.f22814a, q(a() + this.f22814a));
        }
        this.f22814a = 0;
        this.f22816c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f22815b[this.f22814a];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        int iA = a();
        if (i10 < 0 || i10 >= iA) {
            throw new IndexOutOfBoundsException(a0.c.I("index: ", i10, iA, ", size: "));
        }
        return this.f22815b[q(this.f22814a + i10)];
    }

    @Override // vb.f
    public final Object i(int i10) {
        int i11 = this.f22816c;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(a0.c.I("index: ", i10, i11, ", size: "));
        }
        if (i10 == ud.b.r(this)) {
            return removeLast();
        }
        if (i10 == 0) {
            return removeFirst();
        }
        r();
        int iQ = q(this.f22814a + i10);
        Object[] objArr = this.f22815b;
        Object obj = objArr[iQ];
        if (i10 < (this.f22816c >> 1)) {
            int i12 = this.f22814a;
            if (iQ >= i12) {
                l.i0(i12 + 1, i12, iQ, objArr, objArr);
            } else {
                l.i0(1, 0, iQ, objArr, objArr);
                Object[] objArr2 = this.f22815b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i13 = this.f22814a;
                l.i0(i13 + 1, i13, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f22815b;
            int i14 = this.f22814a;
            objArr3[i14] = null;
            this.f22814a = m(i14);
        } else {
            int iQ2 = q(ud.b.r(this) + this.f22814a);
            if (iQ <= iQ2) {
                Object[] objArr4 = this.f22815b;
                l.i0(iQ, iQ + 1, iQ2 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f22815b;
                l.i0(iQ, iQ + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.f22815b;
                objArr6[objArr6.length - 1] = objArr6[0];
                l.i0(0, 1, iQ2 + 1, objArr6, objArr6);
            }
            this.f22815b[iQ2] = null;
        }
        this.f22816c--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i10;
        int iQ = q(a() + this.f22814a);
        int length = this.f22814a;
        if (length < iQ) {
            while (length < iQ) {
                if (jc.l.a(obj, this.f22815b[length])) {
                    i10 = this.f22814a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iQ) {
            return -1;
        }
        int length2 = this.f22815b.length;
        while (true) {
            if (length >= length2) {
                for (int i11 = 0; i11 < iQ; i11++) {
                    if (jc.l.a(obj, this.f22815b[i11])) {
                        length = i11 + this.f22815b.length;
                        i10 = this.f22814a;
                    }
                }
                return -1;
            }
            if (jc.l.a(obj, this.f22815b[length])) {
                i10 = this.f22814a;
                break;
            }
            length++;
        }
        return length - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return a() == 0;
    }

    public final void j(int i10, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f22815b.length;
        while (i10 < length && it.hasNext()) {
            this.f22815b[i10] = it.next();
            i10++;
        }
        int i11 = this.f22814a;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f22815b[i12] = it.next();
        }
        this.f22816c = collection.size() + this.f22816c;
    }

    public final void k(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f22815b;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr == f22813d) {
            if (i10 < 10) {
                i10 = 10;
            }
            this.f22815b = new Object[i10];
            return;
        }
        int length = objArr.length;
        int i11 = length + (length >> 1);
        if (i11 - i10 < 0) {
            i11 = i10;
        }
        if (i11 - 2147483639 > 0) {
            i11 = i10 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i11];
        l.i0(0, this.f22814a, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f22815b;
        int length2 = objArr3.length;
        int i12 = this.f22814a;
        l.i0(length2 - i12, 0, i12, objArr3, objArr2);
        this.f22814a = 0;
        this.f22815b = objArr2;
    }

    public final Object l() {
        if (isEmpty()) {
            return null;
        }
        return this.f22815b[this.f22814a];
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f22815b[q(ud.b.r(this) + this.f22814a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i10;
        int iQ = q(this.f22816c + this.f22814a);
        int i11 = this.f22814a;
        if (i11 < iQ) {
            length = iQ - 1;
            if (i11 <= length) {
                while (!jc.l.a(obj, this.f22815b[length])) {
                    if (length != i11) {
                        length--;
                    }
                }
                i10 = this.f22814a;
                return length - i10;
            }
            return -1;
        }
        if (i11 > iQ) {
            int i12 = iQ - 1;
            while (true) {
                if (-1 >= i12) {
                    Object[] objArr = this.f22815b;
                    jc.l.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i13 = this.f22814a;
                    if (i13 <= length) {
                        while (!jc.l.a(obj, this.f22815b[length])) {
                            if (length != i13) {
                                length--;
                            }
                        }
                        i10 = this.f22814a;
                    }
                } else {
                    if (jc.l.a(obj, this.f22815b[i12])) {
                        length = i12 + this.f22815b.length;
                        i10 = this.f22814a;
                        break;
                    }
                    i12--;
                }
            }
        }
        return -1;
    }

    public final int m(int i10) {
        jc.l.e(this.f22815b, "<this>");
        if (i10 == r0.length - 1) {
            return 0;
        }
        return i10 + 1;
    }

    public final Object n() {
        if (isEmpty()) {
            return null;
        }
        return this.f22815b[q(ud.b.r(this) + this.f22814a)];
    }

    public final int o(int i10) {
        return i10 < 0 ? i10 + this.f22815b.length : i10;
    }

    public final void p(int i10, int i11) {
        if (i10 < i11) {
            l.p0(i10, i11, this.f22815b);
            return;
        }
        Object[] objArr = this.f22815b;
        l.p0(i10, objArr.length, objArr);
        l.p0(0, i11, this.f22815b);
    }

    public final int q(int i10) {
        Object[] objArr = this.f22815b;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    public final void r() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        i(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iQ;
        jc.l.e(collection, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f22815b.length != 0) {
            int iQ2 = q(this.f22816c + this.f22814a);
            int i10 = this.f22814a;
            if (i10 < iQ2) {
                iQ = i10;
                while (i10 < iQ2) {
                    Object obj = this.f22815b[i10];
                    if (collection.contains(obj)) {
                        z10 = true;
                    } else {
                        this.f22815b[iQ] = obj;
                        iQ++;
                    }
                    i10++;
                }
                l.p0(iQ, iQ2, this.f22815b);
            } else {
                int length = this.f22815b.length;
                int i11 = i10;
                boolean z11 = false;
                while (i10 < length) {
                    Object[] objArr = this.f22815b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (collection.contains(obj2)) {
                        z11 = true;
                    } else {
                        this.f22815b[i11] = obj2;
                        i11++;
                    }
                    i10++;
                }
                iQ = q(i11);
                for (int i12 = 0; i12 < iQ2; i12++) {
                    Object[] objArr2 = this.f22815b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (collection.contains(obj3)) {
                        z11 = true;
                    } else {
                        this.f22815b[iQ] = obj3;
                        iQ = m(iQ);
                    }
                }
                z10 = z11;
            }
            if (z10) {
                r();
                this.f22816c = o(iQ - this.f22814a);
            }
        }
        return z10;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        r();
        Object[] objArr = this.f22815b;
        int i10 = this.f22814a;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f22814a = m(i10);
        this.f22816c = a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        r();
        int iQ = q(ud.b.r(this) + this.f22814a);
        Object[] objArr = this.f22815b;
        Object obj = objArr[iQ];
        objArr[iQ] = null;
        this.f22816c = a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        ua.j.g(i10, i11, this.f22816c);
        int i12 = i11 - i10;
        if (i12 == 0) {
            return;
        }
        if (i12 == this.f22816c) {
            clear();
            return;
        }
        if (i12 == 1) {
            i(i10);
            return;
        }
        r();
        if (i10 < this.f22816c - i11) {
            int iQ = q(this.f22814a + (i10 - 1));
            int iQ2 = q(this.f22814a + (i11 - 1));
            while (i10 > 0) {
                int i13 = iQ + 1;
                int iMin = Math.min(i10, Math.min(i13, iQ2 + 1));
                Object[] objArr = this.f22815b;
                int i14 = iQ2 - iMin;
                int i15 = iQ - iMin;
                l.i0(i14 + 1, i15 + 1, i13, objArr, objArr);
                iQ = o(i15);
                iQ2 = o(i14);
                i10 -= iMin;
            }
            int iQ3 = q(this.f22814a + i12);
            p(this.f22814a, iQ3);
            this.f22814a = iQ3;
        } else {
            int iQ4 = q(this.f22814a + i11);
            int iQ5 = q(this.f22814a + i10);
            int i16 = this.f22816c;
            while (true) {
                i16 -= i11;
                if (i16 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f22815b;
                i11 = Math.min(i16, Math.min(objArr2.length - iQ4, objArr2.length - iQ5));
                Object[] objArr3 = this.f22815b;
                int i17 = iQ4 + i11;
                l.i0(iQ5, iQ4, i17, objArr3, objArr3);
                iQ4 = q(i17);
                iQ5 = q(iQ5 + i11);
            }
            int iQ6 = q(this.f22816c + this.f22814a);
            p(o(iQ6 - i12), iQ6);
        }
        this.f22816c -= i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iQ;
        jc.l.e(collection, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f22815b.length != 0) {
            int iQ2 = q(this.f22816c + this.f22814a);
            int i10 = this.f22814a;
            if (i10 < iQ2) {
                iQ = i10;
                while (i10 < iQ2) {
                    Object obj = this.f22815b[i10];
                    if (collection.contains(obj)) {
                        this.f22815b[iQ] = obj;
                        iQ++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                l.p0(iQ, iQ2, this.f22815b);
            } else {
                int length = this.f22815b.length;
                int i11 = i10;
                boolean z11 = false;
                while (i10 < length) {
                    Object[] objArr = this.f22815b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (collection.contains(obj2)) {
                        this.f22815b[i11] = obj2;
                        i11++;
                    } else {
                        z11 = true;
                    }
                    i10++;
                }
                iQ = q(i11);
                for (int i12 = 0; i12 < iQ2; i12++) {
                    Object[] objArr2 = this.f22815b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (collection.contains(obj3)) {
                        this.f22815b[iQ] = obj3;
                        iQ = m(iQ);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                r();
                this.f22816c = o(iQ - this.f22814a);
            }
        }
        return z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        int iA = a();
        if (i10 < 0 || i10 >= iA) {
            throw new IndexOutOfBoundsException(a0.c.I("index: ", i10, iA, ", size: "));
        }
        int iQ = q(this.f22814a + i10);
        Object[] objArr = this.f22815b;
        Object obj2 = objArr[iQ];
        objArr[iQ] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    public j(int i10) {
        Object[] objArr;
        if (i10 == 0) {
            objArr = f22813d;
        } else if (i10 > 0) {
            objArr = new Object[i10];
        } else {
            throw new IllegalArgumentException(t0.B(i10, "Illegal Capacity: "));
        }
        this.f22815b = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        jc.l.e(objArr, "array");
        int length = objArr.length;
        int i10 = this.f22816c;
        if (length < i10) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i10);
            jc.l.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) objNewInstance;
        }
        int iQ = q(this.f22816c + this.f22814a);
        int i11 = this.f22814a;
        if (i11 < iQ) {
            l.m0(i11, iQ, 2, this.f22815b, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f22815b;
            l.i0(0, this.f22814a, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.f22815b;
            l.i0(objArr3.length - this.f22814a, 0, iQ, objArr3, objArr);
        }
        int i12 = this.f22816c;
        if (i12 < objArr.length) {
            objArr[i12] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        jc.l.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        r();
        k(collection.size() + a());
        j(q(a() + this.f22814a), collection);
        return true;
    }
}
