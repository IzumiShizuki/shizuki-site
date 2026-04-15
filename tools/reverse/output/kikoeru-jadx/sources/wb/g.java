package wb;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g extends vb.g implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f23489b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f23490a;

    static {
        e eVar = e.f23473n;
        f23489b = new g(e.f23473n);
    }

    public g(e eVar) {
        l.e(eVar, "backing");
        this.f23490a = eVar;
    }

    @Override // vb.g
    public final int a() {
        return this.f23490a.f23482i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f23490a.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        l.e(collection, "elements");
        this.f23490a.c();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f23490a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f23490a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f23490a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        e eVar = this.f23490a;
        eVar.getClass();
        return new c(eVar, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        e eVar = this.f23490a;
        eVar.c();
        int iJ = eVar.j(obj);
        if (iJ < 0) {
            return false;
        }
        eVar.n(iJ);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        l.e(collection, "elements");
        this.f23490a.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        l.e(collection, "elements");
        this.f23490a.c();
        return super.retainAll(collection);
    }

    public g() {
        this(new e());
    }
}
