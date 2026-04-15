package b1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends vb.d implements List, Collection, kc.a {
    @Override // vb.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // vb.a, java.util.Collection, java.util.List
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

    public abstract c i(int i10, Object obj);

    @Override // vb.d, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public abstract c j(Object obj);

    public c k(Collection collection) {
        g gVarL = l();
        gVarL.addAll(collection);
        return gVarL.j();
    }

    public abstract g l();

    @Override // vb.d, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public abstract c m(b bVar);

    public abstract c n(int i10);

    public abstract c o(int i10, Object obj);

    @Override // vb.d, java.util.List
    public final List subList(int i10, int i11) {
        return new a1.a(this, i10, i11);
    }
}
