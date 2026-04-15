package ya;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class l extends AbstractCollection implements List {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f26011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Collection f26012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f26013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Collection f26014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v0 f26015e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v0 f26016f;

    public l(v0 v0Var, Object obj, List list, l lVar) {
        this.f26016f = v0Var;
        this.f26015e = v0Var;
        this.f26011a = obj;
        this.f26012b = list;
        this.f26013c = lVar;
        this.f26014d = lVar == null ? null : lVar.f26012b;
    }

    public final void a() {
        l lVar = this.f26013c;
        if (lVar != null) {
            lVar.a();
        } else {
            this.f26015e.f26067d.put(this.f26011a, this.f26012b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        i();
        boolean zIsEmpty = this.f26012b.isEmpty();
        boolean zAdd = this.f26012b.add(obj);
        if (zAdd) {
            this.f26015e.f26068e++;
            if (zIsEmpty) {
                a();
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f26012b.addAll(collection);
        if (zAddAll) {
            this.f26015e.f26068e += this.f26012b.size() - size;
            if (size == 0) {
                a();
            }
        }
        return zAddAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f26012b.clear();
        this.f26015e.f26068e -= size;
        j();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        i();
        return this.f26012b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        i();
        return this.f26012b.containsAll(collection);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        i();
        return this.f26012b.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        i();
        return ((List) this.f26012b).get(i10);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        i();
        return this.f26012b.hashCode();
    }

    public final void i() {
        Collection collection;
        l lVar = this.f26013c;
        if (lVar != null) {
            lVar.i();
            if (lVar.f26012b != this.f26014d) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f26012b.isEmpty() || (collection = (Collection) this.f26015e.f26067d.get(this.f26011a)) == null) {
                return;
            }
            this.f26012b = collection;
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        i();
        return ((List) this.f26012b).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        i();
        return new c(this);
    }

    public final void j() {
        l lVar = this.f26013c;
        if (lVar != null) {
            lVar.j();
        } else if (this.f26012b.isEmpty()) {
            this.f26015e.f26067d.remove(this.f26011a);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        i();
        return ((List) this.f26012b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        i();
        return new k(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        i();
        boolean zRemove = this.f26012b.remove(obj);
        if (zRemove) {
            v0 v0Var = this.f26015e;
            v0Var.f26068e--;
            j();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f26012b.removeAll(collection);
        if (zRemoveAll) {
            this.f26015e.f26068e += this.f26012b.size() - size;
            j();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f26012b.retainAll(collection);
        if (zRetainAll) {
            this.f26015e.f26068e += this.f26012b.size() - size;
            j();
        }
        return zRetainAll;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        i();
        return ((List) this.f26012b).set(i10, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        i();
        return this.f26012b.size();
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        i();
        List listSubList = ((List) this.f26012b).subList(i10, i11);
        l lVar = this.f26013c;
        if (lVar == null) {
            lVar = this;
        }
        boolean z10 = listSubList instanceof RandomAccess;
        v0 v0Var = this.f26016f;
        Object obj = this.f26011a;
        return z10 ? new h(v0Var, obj, listSubList, lVar) : new l(v0Var, obj, listSubList, lVar);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        i();
        return this.f26012b.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        i();
        return new k(this, i10);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        i();
        Object objRemove = ((List) this.f26012b).remove(i10);
        v0 v0Var = this.f26016f;
        v0Var.f26068e--;
        j();
        return objRemove;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        i();
        boolean zIsEmpty = this.f26012b.isEmpty();
        ((List) this.f26012b).add(i10, obj);
        this.f26016f.f26068e++;
        if (zIsEmpty) {
            a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f26012b).addAll(i10, collection);
        if (zAddAll) {
            this.f26016f.f26068e += this.f26012b.size() - size;
            if (size == 0) {
                a();
            }
        }
        return zAddAll;
    }
}
