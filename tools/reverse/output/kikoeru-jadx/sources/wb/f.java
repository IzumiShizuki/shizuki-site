package wb;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f extends vb.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f23488b;

    public /* synthetic */ f(e eVar, int i10) {
        this.f23487a = i10;
        this.f23488b = eVar;
    }

    @Override // vb.g
    public final int a() {
        switch (this.f23487a) {
        }
        return this.f23488b.f23482i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f23487a) {
            case 0:
                l.e((Map.Entry) obj, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f23487a) {
            case 0:
                l.e(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                l.e(collection, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f23487a) {
            case 0:
                this.f23488b.clear();
                break;
            default:
                this.f23488b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f23487a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                return this.f23488b.h((Map.Entry) obj);
            default:
                return this.f23488b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f23487a) {
            case 0:
                l.e(collection, "elements");
                return this.f23488b.g(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f23487a) {
        }
        return this.f23488b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f23487a) {
            case 0:
                e eVar = this.f23488b;
                eVar.getClass();
                return new c(eVar, 0);
            default:
                e eVar2 = this.f23488b;
                eVar2.getClass();
                return new c(eVar2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f23487a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    e eVar = this.f23488b;
                    eVar.getClass();
                    eVar.c();
                    int iJ = eVar.j(entry.getKey());
                    if (iJ >= 0) {
                        Object[] objArr = eVar.f23475b;
                        l.b(objArr);
                        if (l.a(objArr[iJ], entry.getValue())) {
                            eVar.n(iJ);
                            break;
                        }
                    }
                }
                break;
            default:
                e eVar2 = this.f23488b;
                eVar2.c();
                int iJ2 = eVar2.j(obj);
                if (iJ2 >= 0) {
                    eVar2.n(iJ2);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.f23487a) {
            case 0:
                l.e(collection, "elements");
                this.f23488b.c();
                break;
            default:
                l.e(collection, "elements");
                this.f23488b.c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.f23487a) {
            case 0:
                l.e(collection, "elements");
                this.f23488b.c();
                break;
            default:
                l.e(collection, "elements");
                this.f23488b.c();
                break;
        }
        return super.retainAll(collection);
    }
}
