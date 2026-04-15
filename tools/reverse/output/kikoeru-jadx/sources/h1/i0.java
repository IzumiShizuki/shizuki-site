package h1;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import x0.k1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements List, kc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f8018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8021d;

    public i0(s sVar, int i10, int i11) {
        this.f8018a = sVar;
        this.f8019b = i10;
        this.f8020c = t.f(sVar);
        this.f8021d = i11 - i10;
    }

    public final void a() {
        if (t.f(this.f8018a) != this.f8020c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        a();
        int i10 = this.f8019b + this.f8021d;
        s sVar = this.f8018a;
        sVar.add(i10, obj);
        this.f8021d++;
        this.f8020c = t.f(sVar);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f8021d, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.f8021d > 0) {
            a();
            int i10 = this.f8021d;
            int i11 = this.f8019b;
            s sVar = this.f8018a;
            sVar.k(i11, i10 + i11);
            this.f8021d = 0;
            this.f8020c = t.f(sVar);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        a();
        t.a(i10, this.f8021d);
        return this.f8018a.get(this.f8019b + i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        a();
        int i10 = this.f8021d;
        int i11 = this.f8019b;
        Iterator it = nh.b.E(i11, i10 + i11).iterator();
        while (it.hasNext()) {
            int iNextInt = ((vb.v) it).nextInt();
            if (jc.l.a(obj, this.f8018a.get(iNextInt))) {
                return iNextInt - i11;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f8021d == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        int i10 = this.f8021d;
        int i11 = this.f8019b;
        for (int i12 = (i10 + i11) - 1; i12 >= i11; i12--) {
            if (jc.l.a(obj, this.f8018a.get(i12))) {
                return i12 - i11;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        boolean z10;
        Iterator it = collection.iterator();
        while (true) {
            while (it.hasNext()) {
                z10 = remove(it.next()) || z10;
            }
            return z10;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i10;
        b1.c cVar;
        g gVarK;
        boolean zB;
        a();
        s sVar = this.f8018a;
        int i11 = this.f8019b;
        int i12 = this.f8021d + i11;
        int size = sVar.size();
        do {
            synchronized (t.f8067a) {
                a0 a0Var = sVar.f8066a;
                jc.l.c(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                a0 a0Var2 = (a0) n.i(a0Var);
                i10 = a0Var2.f7980d;
                cVar = a0Var2.f7979c;
            }
            jc.l.b(cVar);
            b1.g gVarL = cVar.l();
            gVarL.subList(i11, i12).retainAll(collection);
            b1.c cVarJ = gVarL.j();
            if (jc.l.a(cVarJ, cVar)) {
                break;
            }
            a0 a0Var3 = sVar.f8066a;
            jc.l.c(a0Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (n.f8051c) {
                gVarK = n.k();
                zB = t.b((a0) n.x(a0Var3, sVar, gVarK), i10, cVarJ, true);
            }
            n.o(gVarK, sVar);
        } while (!zB);
        int size2 = size - sVar.size();
        if (size2 > 0) {
            this.f8020c = t.f(this.f8018a);
            this.f8021d -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        t.a(i10, this.f8021d);
        a();
        int i11 = i10 + this.f8019b;
        s sVar = this.f8018a;
        Object obj2 = sVar.set(i11, obj);
        this.f8020c = t.f(sVar);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f8021d;
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        if (!(i10 >= 0 && i10 <= i11 && i11 <= this.f8021d)) {
            k1.a("fromIndex or toIndex are out of bounds");
        }
        a();
        int i12 = this.f8019b;
        return new i0(this.f8018a, i10 + i12, i11 + i12);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return jc.g.a(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        a();
        jc.w wVar = new jc.w();
        wVar.f10836a = i10 - 1;
        return new h0(wVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return jc.g.b(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        a();
        int i11 = i10 + this.f8019b;
        s sVar = this.f8018a;
        boolean zAddAll = sVar.addAll(i11, collection);
        if (zAddAll) {
            this.f8021d = collection.size() + this.f8021d;
            this.f8020c = t.f(sVar);
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        a();
        int i11 = this.f8019b + i10;
        s sVar = this.f8018a;
        Object objRemove = sVar.remove(i11);
        this.f8021d--;
        this.f8020c = t.f(sVar);
        return objRemove;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        a();
        int i11 = this.f8019b + i10;
        s sVar = this.f8018a;
        sVar.add(i11, obj);
        this.f8021d++;
        this.f8020c = t.f(sVar);
    }
}
