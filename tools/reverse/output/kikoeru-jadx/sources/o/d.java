package o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Collection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f15935a;

    public d(e eVar) {
        this.f15935a = eVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f15935a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f15935a.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f15935a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new a(this.f15935a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        e eVar = this.f15935a;
        int iA = eVar.a(obj);
        if (iA < 0) {
            return false;
        }
        eVar.f(iA);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        e eVar = this.f15935a;
        int i10 = eVar.f16053c;
        int i11 = 0;
        boolean z10 = false;
        while (i11 < i10) {
            if (collection.contains(eVar.h(i11))) {
                eVar.f(i11);
                i11--;
                i10--;
                z10 = true;
            }
            i11++;
        }
        return z10;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        e eVar = this.f15935a;
        int i10 = eVar.f16053c;
        int i11 = 0;
        boolean z10 = false;
        while (i11 < i10) {
            if (!collection.contains(eVar.h(i11))) {
                eVar.f(i11);
                i11--;
                i10--;
                z10 = true;
            }
            i11++;
        }
        return z10;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f15935a.f16053c;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        e eVar = this.f15935a;
        int i10 = eVar.f16053c;
        Object[] objArr = new Object[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = eVar.h(i11);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        e eVar = this.f15935a;
        int i10 = eVar.f16053c;
        if (objArr.length < i10) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i10);
        }
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = eVar.h(i11);
        }
        if (objArr.length > i10) {
            objArr[i10] = null;
        }
        return objArr;
    }
}
