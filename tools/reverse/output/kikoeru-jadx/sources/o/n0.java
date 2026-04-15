package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements kc.e, Set, kc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f16025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f16026b;

    public n0(l0 l0Var) {
        this.f16025a = l0Var;
        this.f16026b = l0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f16026b.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        jc.l.e(collection, "elements");
        l0 l0Var = this.f16026b;
        int i10 = l0Var.f16005d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            l0Var.j(it.next());
        }
        return i10 != l0Var.f16005d;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f16026b.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f16025a.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        jc.l.e(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f16025a.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n0.class != obj.getClass()) {
            return false;
        }
        return jc.l.a(this.f16025a, ((n0) obj).f16025a);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f16025a.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f16025a.g();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new d1.c(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f16026b.l(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        jc.l.e(collection, "elements");
        l0 l0Var = this.f16026b;
        l0Var.getClass();
        int i10 = l0Var.f16005d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            l0Var.i(it.next());
        }
        return i10 != l0Var.f16005d;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        boolean z10;
        jc.l.e(collection, "elements");
        l0 l0Var = this.f16026b;
        l0Var.getClass();
        Object[] objArr = l0Var.f16003b;
        int i10 = l0Var.f16005d;
        long[] jArr = l0Var.f16002a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = (i11 << 3) + i13;
                            if (!vb.m.S(collection, objArr[i14])) {
                                l0Var.m(i14);
                            }
                        }
                        j10 >>= 8;
                    }
                    z10 = false;
                    if (i12 != 8) {
                        break;
                    }
                } else {
                    z10 = false;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        } else {
            z10 = false;
        }
        if (i10 != l0Var.f16005d) {
            return true;
        }
        return z10;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f16025a.f16005d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return jc.g.a(this);
    }

    public final String toString() {
        return this.f16025a.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        jc.l.e(objArr, "array");
        return jc.g.b(this, objArr);
    }
}
