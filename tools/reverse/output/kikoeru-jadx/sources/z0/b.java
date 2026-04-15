package z0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements List, kc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f26366a;

    public b(e eVar) {
        this.f26366a = eVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.f26366a.b(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        e eVar = this.f26366a;
        return eVar.e(eVar.f26374c, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f26366a.g();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f26366a.h(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        e eVar = this.f26366a;
        eVar.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!eVar.h(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        f.a(i10, this);
        return this.f26366a.f26372a[i10];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f26366a.i(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f26366a.f26374c == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new d(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        e eVar = this.f26366a;
        Object[] objArr = eVar.f26372a;
        for (int i10 = eVar.f26374c - 1; i10 >= 0; i10--) {
            if (l.a(obj, objArr[i10])) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new d(0, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f26366a.j(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        e eVar = this.f26366a;
        eVar.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        int i10 = eVar.f26374c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            eVar.j(it.next());
        }
        return i10 != eVar.f26374c;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        e eVar = this.f26366a;
        int i10 = eVar.f26374c;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!collection.contains(eVar.f26372a[i11])) {
                eVar.k(i11);
            }
        }
        return i10 != eVar.f26374c;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        f.a(i10, this);
        Object[] objArr = this.f26366a.f26372a;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f26366a.f26374c;
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        f.b(i10, i11, this);
        return new c(i10, i11, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return jc.g.a(this);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        this.f26366a.a(i10, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        return new d(i10, this);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        f.a(i10, this);
        return this.f26366a.k(i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return jc.g.b(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        return this.f26366a.e(i10, collection);
    }
}
