package z0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements List, kc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f26367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26369c;

    public c(int i10, int i11, List list) {
        this.f26367a = list;
        this.f26368b = i10;
        this.f26369c = i11;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i10 = this.f26369c;
        this.f26369c = i10 + 1;
        this.f26367a.add(i10, obj);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        this.f26367a.addAll(i10 + this.f26368b, collection);
        int size = collection.size();
        this.f26369c += size;
        return size > 0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i10 = this.f26369c - 1;
        int i11 = this.f26368b;
        if (i11 <= i10) {
            while (true) {
                this.f26367a.remove(i10);
                if (i10 == i11) {
                    break;
                } else {
                    i10--;
                }
            }
        }
        this.f26369c = i11;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i10 = this.f26369c;
        for (int i11 = this.f26368b; i11 < i10; i11++) {
            if (l.a(this.f26367a.get(i11), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object get(int i10) {
        f.a(i10, this);
        return this.f26367a.get(i10 + this.f26368b);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i10 = this.f26369c;
        int i11 = this.f26368b;
        for (int i12 = i11; i12 < i10; i12++) {
            if (l.a(this.f26367a.get(i12), obj)) {
                return i12 - i11;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f26369c == this.f26368b;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new d(0, this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i10 = this.f26369c - 1;
        int i11 = this.f26368b;
        if (i11 > i10) {
            return -1;
        }
        while (!l.a(this.f26367a.get(i10), obj)) {
            if (i10 == i11) {
                return -1;
            }
            i10--;
        }
        return i10 - i11;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new d(0, this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i10 = this.f26369c;
        for (int i11 = this.f26368b; i11 < i10; i11++) {
            ?? r22 = this.f26367a;
            if (l.a(r22.get(i11), obj)) {
                r22.remove(i11);
                this.f26369c--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i10 = this.f26369c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i10 != this.f26369c;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i10 = this.f26369c;
        int i11 = i10 - 1;
        int i12 = this.f26368b;
        if (i12 <= i11) {
            while (true) {
                ?? r32 = this.f26367a;
                if (!collection.contains(r32.get(i11))) {
                    r32.remove(i11);
                    this.f26369c--;
                }
                if (i11 == i12) {
                    break;
                }
                i11--;
            }
        }
        return i10 != this.f26369c;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        f.a(i10, this);
        return this.f26367a.set(i10 + this.f26368b, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f26369c - this.f26368b;
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

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final void add(int i10, Object obj) {
        this.f26367a.add(i10 + this.f26368b, obj);
        this.f26369c++;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        return new d(i10, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return jc.g.b(this, objArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.f26367a.addAll(this.f26369c, collection);
        int size = collection.size();
        this.f26369c += size;
        return size > 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object remove(int i10) {
        f.a(i10, this);
        this.f26369c--;
        return this.f26367a.remove(i10 + this.f26368b);
    }
}
