package c1;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i extends AbstractCollection implements Collection, kc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3227b;

    public /* synthetic */ i(int i10, Object obj) {
        this.f3226a = i10;
        this.f3227b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f3226a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.f3226a) {
            case 1:
                jc.l.e(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f3226a) {
            case 0:
                ((e) this.f3227b).clear();
                break;
            default:
                ((wb.e) this.f3227b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f3226a) {
            case 0:
                return ((e) this.f3227b).containsValue(obj);
            default:
                return ((wb.e) this.f3227b).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f3226a) {
            case 1:
                return ((wb.e) this.f3227b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f3226a) {
            case 0:
                e eVar = (e) this.f3227b;
                n[] nVarArr = new n[8];
                for (int i10 = 0; i10 < 8; i10++) {
                    nVarArr[i10] = new o(2);
                }
                return new h(eVar, nVarArr);
            default:
                wb.e eVar2 = (wb.e) this.f3227b;
                eVar2.getClass();
                return new wb.c(eVar2, 2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f3226a) {
            case 1:
                wb.e eVar = (wb.e) this.f3227b;
                eVar.c();
                int iK = eVar.k(obj);
                if (iK < 0) {
                    return false;
                }
                eVar.n(iK);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f3226a) {
            case 1:
                jc.l.e(collection, "elements");
                ((wb.e) this.f3227b).c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f3226a) {
            case 1:
                jc.l.e(collection, "elements");
                ((wb.e) this.f3227b).c();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f3226a) {
            case 0:
                e eVar = (e) this.f3227b;
                eVar.getClass();
                return eVar.f3219f;
            default:
                return ((wb.e) this.f3227b).f23482i;
        }
    }
}
