package ya;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class i0 extends d0 implements List, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g0 f25998b = new g0(a1.f25946e, 0);

    public static a1 o(int i10, Object[] objArr) {
        return i10 == 0 ? a1.f25946e : new a1(i10, objArr);
    }

    public static f0 p() {
        return new f0(4);
    }

    public static i0 q(Collection collection) {
        if (!(collection instanceof d0)) {
            Object[] array = collection.toArray();
            q.c(array.length, array);
            return o(array.length, array);
        }
        i0 i0VarA = ((d0) collection).a();
        if (!i0VarA.m()) {
            return i0VarA;
        }
        Object[] array2 = i0VarA.toArray(d0.f25966a);
        return o(array2.length, array2);
    }

    public static a1 r(Object[] objArr) {
        if (objArr.length == 0) {
            return a1.f25946e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        q.c(objArr2.length, objArr2);
        return o(objArr2.length, objArr2);
    }

    public static a1 t(Long l10, Long l11, Long l12, Long l13, Long l14) {
        Object[] objArr = {l10, l11, l12, l13, l14};
        q.c(5, objArr);
        return o(5, objArr);
    }

    public static a1 u(Object obj) {
        Object[] objArr = {obj};
        q.c(1, objArr);
        return o(1, objArr);
    }

    public static a1 v(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        q.c(2, objArr);
        return o(2, objArr);
    }

    public static a1 w(y0 y0Var, AbstractCollection abstractCollection) {
        y0Var.getClass();
        if (!q.t0.M(abstractCollection)) {
            Iterator it = abstractCollection.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            abstractCollection = arrayList;
        }
        Object[] array = abstractCollection.toArray();
        q.c(array.length, array);
        Arrays.sort(array, y0Var);
        return o(array.length, array);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // ya.d0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && ud.n.f(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i10 = 0; i10 < size; i10++) {
                        if (ud.n.f(get(i10), list.get(i10))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~(get(i11).hashCode() + (i10 * 31)));
        }
        return i10;
    }

    @Override // ya.d0
    public int i(int i10, Object[] objArr) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // ya.d0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // ya.d0
    /* JADX INFO: renamed from: n */
    public final o1 iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final g0 listIterator(int i10) {
        ud.s.i(i10, size());
        return isEmpty() ? f25998b : new g0(this, i10);
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public i0 subList(int i10, int i11) {
        ud.s.j(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? a1.f25946e : new h0(this, i10, i12);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // ya.d0
    public final i0 a() {
        return this;
    }
}
