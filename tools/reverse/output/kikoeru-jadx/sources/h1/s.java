package h1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import x0.k1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s implements Parcelable, e0, List, RandomAccess, kc.b {
    public static final Parcelable.Creator<s> CREATOR = new r(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a0 f8066a;

    public s(b1.c cVar) {
        g gVarK = n.k();
        a0 a0Var = new a0(gVarK.g(), cVar);
        if (!(gVarK instanceof b)) {
            a0Var.f8013b = new a0(1, cVar);
        }
        this.f8066a = a0Var;
    }

    @Override // h1.e0
    public final g0 a() {
        return this.f8066a;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i10;
        b1.c cVar;
        g gVarK;
        boolean zB;
        do {
            synchronized (t.f8067a) {
                a0 a0Var = this.f8066a;
                jc.l.c(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                a0 a0Var2 = (a0) n.i(a0Var);
                i10 = a0Var2.f7980d;
                cVar = a0Var2.f7979c;
            }
            jc.l.b(cVar);
            b1.c cVarJ = cVar.j(obj);
            if (cVarJ.equals(cVar)) {
                return false;
            }
            a0 a0Var3 = this.f8066a;
            jc.l.c(a0Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (n.f8051c) {
                gVarK = n.k();
                zB = t.b((a0) n.x(a0Var3, this, gVarK), i10, cVarJ, true);
            }
            n.o(gVarK, this);
        } while (!zB);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        return t.h(this, new q(i10, collection));
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        g gVarK;
        a0 a0Var = this.f8066a;
        jc.l.c(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
        synchronized (n.f8051c) {
            gVarK = n.k();
            a0 a0Var2 = (a0) n.x(a0Var, this, gVarK);
            synchronized (t.f8067a) {
                a0Var2.f7979c = b1.j.f1444b;
                a0Var2.f7980d++;
                a0Var2.f7981e++;
            }
        }
        n.o(gVarK, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return t.e(this).f7979c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return t.e(this).f7979c.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        return t.e(this).f7979c.get(i10);
    }

    @Override // h1.e0
    public final void i(g0 g0Var) {
        g0Var.f8013b = this.f8066a;
        this.f8066a = (a0) g0Var;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return t.e(this).f7979c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return t.e(this).f7979c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // h1.e0
    public final /* synthetic */ g0 j(g0 g0Var, g0 g0Var2, g0 g0Var3) {
        return null;
    }

    public final void k(int i10, int i11) {
        int i12;
        b1.c cVar;
        g gVarK;
        boolean zB;
        do {
            synchronized (t.f8067a) {
                a0 a0Var = this.f8066a;
                jc.l.c(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                a0 a0Var2 = (a0) n.i(a0Var);
                i12 = a0Var2.f7980d;
                cVar = a0Var2.f7979c;
            }
            jc.l.b(cVar);
            b1.g gVarL = cVar.l();
            gVarL.subList(i10, i11).clear();
            b1.c cVarJ = gVarL.j();
            if (jc.l.a(cVarJ, cVar)) {
                return;
            }
            a0 a0Var3 = this.f8066a;
            jc.l.c(a0Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (n.f8051c) {
                gVarK = n.k();
                zB = t.b((a0) n.x(a0Var3, this, gVarK), i12, cVarJ, true);
            }
            n.o(gVarK, this);
        } while (!zB);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return t.e(this).f7979c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new z(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        int i11;
        b1.c cVar;
        g gVarK;
        boolean zB;
        Object obj = get(i10);
        do {
            synchronized (t.f8067a) {
                a0 a0Var = this.f8066a;
                jc.l.c(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                a0 a0Var2 = (a0) n.i(a0Var);
                i11 = a0Var2.f7980d;
                cVar = a0Var2.f7979c;
            }
            jc.l.b(cVar);
            b1.c cVarN = cVar.n(i10);
            if (cVarN.equals(cVar)) {
                break;
            }
            a0 a0Var3 = this.f8066a;
            jc.l.c(a0Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (n.f8051c) {
                gVarK = n.k();
                zB = t.b((a0) n.x(a0Var3, this, gVarK), i11, cVarN, true);
            }
            n.o(gVarK, this);
        } while (!zB);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i10;
        b1.c cVar;
        g gVarK;
        boolean zB;
        do {
            synchronized (t.f8067a) {
                a0 a0Var = this.f8066a;
                jc.l.c(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                a0 a0Var2 = (a0) n.i(a0Var);
                i10 = a0Var2.f7980d;
                cVar = a0Var2.f7979c;
            }
            jc.l.b(cVar);
            b1.c cVarM = cVar.m(new b1.b(0, collection));
            if (jc.l.a(cVarM, cVar)) {
                return false;
            }
            a0 a0Var3 = this.f8066a;
            jc.l.c(a0Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (n.f8051c) {
                gVarK = n.k();
                zB = t.b((a0) n.x(a0Var3, this, gVarK), i10, cVarM, true);
            }
            n.o(gVarK, this);
        } while (!zB);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return t.h(this, new b1.b(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        int i11;
        b1.c cVar;
        g gVarK;
        boolean zB;
        Object obj2 = get(i10);
        do {
            synchronized (t.f8067a) {
                a0 a0Var = this.f8066a;
                jc.l.c(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                a0 a0Var2 = (a0) n.i(a0Var);
                i11 = a0Var2.f7980d;
                cVar = a0Var2.f7979c;
            }
            jc.l.b(cVar);
            b1.c cVarO = cVar.o(i10, obj);
            if (cVarO.equals(cVar)) {
                break;
            }
            a0 a0Var3 = this.f8066a;
            jc.l.c(a0Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (n.f8051c) {
                gVarK = n.k();
                zB = t.b((a0) n.x(a0Var3, this, gVarK), i11, cVarO, false);
            }
            n.o(gVarK, this);
        } while (!zB);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return t.e(this).f7979c.size();
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        if (!(i10 >= 0 && i10 <= i11 && i11 <= size())) {
            k1.a("fromIndex or toIndex are out of bounds");
        }
        return new i0(this, i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return jc.g.a(this);
    }

    public final String toString() {
        a0 a0Var = this.f8066a;
        jc.l.c(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((a0) n.i(a0Var)).f7979c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        b1.c cVar = t.e(this).f7979c;
        int size = cVar.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeValue(cVar.get(i11));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i10;
        b1.c cVar;
        g gVarK;
        boolean zB;
        do {
            synchronized (t.f8067a) {
                a0 a0Var = this.f8066a;
                jc.l.c(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                a0 a0Var2 = (a0) n.i(a0Var);
                i10 = a0Var2.f7980d;
                cVar = a0Var2.f7979c;
            }
            jc.l.b(cVar);
            b1.c cVarK = cVar.k(collection);
            if (jc.l.a(cVarK, cVar)) {
                return false;
            }
            a0 a0Var3 = this.f8066a;
            jc.l.c(a0Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (n.f8051c) {
                gVarK = n.k();
                zB = t.b((a0) n.x(a0Var3, this, gVarK), i10, cVarK, true);
            }
            n.o(gVarK, this);
        } while (!zB);
        return true;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        return new z(this, i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return jc.g.b(this, objArr);
    }

    public s() {
        this(b1.j.f1444b);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        b1.c cVar;
        g gVarK;
        boolean zB;
        do {
            synchronized (t.f8067a) {
                a0 a0Var = this.f8066a;
                jc.l.c(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                a0 a0Var2 = (a0) n.i(a0Var);
                i11 = a0Var2.f7980d;
                cVar = a0Var2.f7979c;
            }
            jc.l.b(cVar);
            b1.c cVarI = cVar.i(i10, obj);
            if (cVarI.equals(cVar)) {
                return;
            }
            a0 a0Var3 = this.f8066a;
            jc.l.c(a0Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (n.f8051c) {
                gVarK = n.k();
                zB = t.b((a0) n.x(a0Var3, this, gVarK), i11, cVarI, true);
            }
            n.o(gVarK, this);
        } while (!zB);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i10;
        b1.c cVar;
        g gVarK;
        boolean zB;
        do {
            synchronized (t.f8067a) {
                a0 a0Var = this.f8066a;
                jc.l.c(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                a0 a0Var2 = (a0) n.i(a0Var);
                i10 = a0Var2.f7980d;
                cVar = a0Var2.f7979c;
            }
            jc.l.b(cVar);
            int iIndexOf = cVar.indexOf(obj);
            b1.c cVarN = iIndexOf != -1 ? cVar.n(iIndexOf) : cVar;
            if (cVarN.equals(cVar)) {
                return false;
            }
            a0 a0Var3 = this.f8066a;
            jc.l.c(a0Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (n.f8051c) {
                gVarK = n.k();
                zB = t.b((a0) n.x(a0Var3, this, gVarK), i10, cVarN, true);
            }
            n.o(gVarK, this);
        } while (!zB);
        return true;
    }
}
