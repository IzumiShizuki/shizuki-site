package ya;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n extends AbstractCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f26021b;

    public /* synthetic */ n(int i10, Serializable serializable) {
        this.f26020a = i10;
        this.f26021b = serializable;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f26020a) {
            case 0:
                ((v0) this.f26021b).b();
                break;
            case 1:
                ((u) this.f26021b).clear();
                break;
            default:
                ((d) this.f26021b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.f26020a) {
            case 0:
                Iterator it = ((v0) this.f26021b).a().values().iterator();
                while (it.hasNext()) {
                    if (((Collection) it.next()).contains(obj)) {
                        return true;
                    }
                }
                return false;
            case 1:
            default:
                return super.contains(obj);
            case 2:
                return ((d) this.f26021b).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f26020a) {
            case 2:
                return ((d) this.f26021b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f26020a) {
            case 0:
                return new a((v0) this.f26021b);
            case 1:
                u uVar = (u) this.f26021b;
                Map mapB = uVar.b();
                return mapB != null ? mapB.values().iterator() : new r(uVar, 2);
            default:
                return new t0(((d) this.f26021b).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f26020a) {
            case 2:
                d dVar = (d) this.f26021b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry : dVar.entrySet()) {
                        if (ud.n.f(obj, entry.getValue())) {
                            dVar.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f26020a) {
            case 2:
                d dVar = (d) this.f26021b;
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : dVar.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return dVar.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f26020a) {
            case 2:
                d dVar = (d) this.f26021b;
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : dVar.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return dVar.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f26020a) {
            case 0:
                return ((v0) this.f26021b).f26068e;
            case 1:
                return ((u) this.f26021b).size();
            default:
                return ((d) this.f26021b).f25964c.size();
        }
    }

    public n(d dVar) {
        this.f26020a = 2;
        this.f26021b = dVar;
    }
}
