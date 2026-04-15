package ya;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends AbstractSequentialList implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f26050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xa.d f26051b;

    public s0(List list, xa.d dVar) {
        list.getClass();
        this.f26050a = list;
        this.f26051b = dVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f26050a.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new q0(this, this.f26050a.listIterator(i10), 1);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        this.f26050a.subList(i10, i11).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26050a.size();
    }
}
