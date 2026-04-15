package g2;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s1 implements Collection, kc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7284a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7285b;

    public s1() {
        int i10 = o.r0.f16035a;
        this.f7285b = new o.h0(6);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f7284a) {
            case 0:
                return ((o.h0) this.f7285b).a(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f7284a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.f7284a) {
            case 0:
                ((o.h0) this.f7285b).b();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f7284a) {
            case 0:
                return ((o.h0) this.f7285b).c(obj);
            default:
                return ((o.k0) this.f7285b).d(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f7284a) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!((o.h0) this.f7285b).c(it.next())) {
                        break;
                    }
                }
                break;
            default:
                jc.l.e(collection, "elements");
                Collection collection2 = collection;
                if (!collection2.isEmpty()) {
                    Iterator it2 = collection2.iterator();
                    while (it2.hasNext()) {
                        if (!((o.k0) this.f7285b).d(it2.next())) {
                            break;
                        }
                    }
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.f7284a) {
            case 0:
                return ((o.h0) this.f7285b).f15980g == 0;
            default:
                return ((o.k0) this.f7285b).i();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f7284a) {
            case 0:
                o.h0 h0Var = (o.h0) this.f7285b;
                h0Var.getClass();
                return new d1.c(new o.j0(h0Var));
            default:
                return pc.f0.O(new o.g(2, this, null));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f7284a) {
            case 0:
                return ((o.h0) this.f7285b).g(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f7284a) {
            case 0:
                return ((o.h0) this.f7285b).g(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.f7284a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f7284a) {
            case 0:
                return ((o.h0) this.f7285b).i(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final int size() {
        switch (this.f7284a) {
            case 0:
                return ((o.h0) this.f7285b).f15980g;
            default:
                return ((o.k0) this.f7285b).f15999e;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.f7284a) {
        }
        return jc.g.a(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f7284a) {
            case 0:
                break;
            default:
                jc.l.e(objArr, "array");
                break;
        }
        return jc.g.b(this, objArr);
    }

    public s1(o.k0 k0Var) {
        jc.l.e(k0Var, "parent");
        this.f7285b = k0Var;
    }
}
