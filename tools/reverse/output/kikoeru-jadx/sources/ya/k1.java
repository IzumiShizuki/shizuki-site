package ya;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends j1 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f26005a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f26005a.iterator();
        it.getClass();
        xa.e eVar = this.f26006b;
        eVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (eVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new k1(((SortedSet) this.f26005a).headSet(obj), this.f26006b);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f26005a;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.f26006b.apply(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new k1(((SortedSet) this.f26005a).subSet(obj, obj2), this.f26006b);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new k1(((SortedSet) this.f26005a).tailSet(obj), this.f26006b);
    }
}
