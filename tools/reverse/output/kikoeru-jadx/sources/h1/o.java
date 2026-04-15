package h1;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o implements Set, kc.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f8060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8061b;

    public o(v vVar, int i10) {
        this.f8061b = i10;
        this.f8060a = vVar;
    }

    private final boolean a(Collection collection) {
        a1.d dVar;
        int i10;
        g gVarK;
        boolean zB;
        Collection<Map.Entry> collection2 = collection;
        int iT = vb.w.t(vb.n.K(collection2, 10));
        if (iT < 16) {
            iT = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iT);
        for (Map.Entry entry : collection2) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        v vVar = this.f8060a;
        boolean z10 = false;
        do {
            synchronized (t.f8068b) {
                u uVar = vVar.f8071a;
                jc.l.c(uVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                u uVar2 = (u) n.i(uVar);
                dVar = uVar2.f8069c;
                i10 = uVar2.f8070d;
            }
            jc.l.b(dVar);
            a1.c cVarBuilder = dVar.builder();
            Object it = vVar.f8072b.iterator();
            while (((d0) it).hasNext()) {
                Map.Entry entry2 = (Map.Entry) ((c0) it).next();
                if (!linkedHashMap.containsKey(entry2.getKey()) || !jc.l.a(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    cVarBuilder.remove(entry2.getKey());
                    z10 = true;
                }
            }
            a1.d dVarBuild = cVarBuilder.build();
            if (jc.l.a(dVarBuild, dVar)) {
                break;
            }
            u uVar3 = vVar.f8071a;
            jc.l.c(uVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (n.f8051c) {
                gVarK = n.k();
                zB = v.b(vVar, (u) n.x(uVar3, vVar, gVarK), i10, dVarBuild);
            }
            n.o(gVarK, vVar);
        } while (!zB);
        return z10;
    }

    private final boolean i(Collection collection) {
        a1.d dVar;
        int i10;
        g gVarK;
        boolean zB;
        Set setK0 = vb.m.K0(collection);
        v vVar = this.f8060a;
        boolean z10 = false;
        do {
            synchronized (t.f8068b) {
                u uVar = vVar.f8071a;
                jc.l.c(uVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                u uVar2 = (u) n.i(uVar);
                dVar = uVar2.f8069c;
                i10 = uVar2.f8070d;
            }
            jc.l.b(dVar);
            a1.c cVarBuilder = dVar.builder();
            Object it = vVar.f8072b.iterator();
            while (((d0) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((c0) it).next();
                if (!setK0.contains(entry.getKey())) {
                    cVarBuilder.remove(entry.getKey());
                    z10 = true;
                }
            }
            a1.d dVarBuild = cVarBuilder.build();
            if (jc.l.a(dVarBuild, dVar)) {
                break;
            }
            u uVar3 = vVar.f8071a;
            jc.l.c(uVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (n.f8051c) {
                gVarK = n.k();
                zB = v.b(vVar, (u) n.x(uVar3, vVar, gVarK), i10, dVarBuild);
            }
            n.o(gVarK, vVar);
        } while (!zB);
        return z10;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f8061b) {
            case 0:
                t.m();
                throw null;
            case 1:
                t.m();
                throw null;
            default:
                t.m();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f8061b) {
            case 0:
                t.m();
                throw null;
            case 1:
                t.m();
                throw null;
            default:
                t.m();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f8060a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f8061b) {
            case 0:
                if (!(obj instanceof Map.Entry) || ((obj instanceof kc.a) && !(obj instanceof kc.c))) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return jc.l.a(this.f8060a.get(entry.getKey()), entry.getValue());
            case 1:
                return this.f8060a.containsKey(obj);
            default:
                return this.f8060a.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f8061b) {
            case 0:
                Collection collection2 = collection;
                if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        if (!contains((Map.Entry) it.next())) {
                            break;
                        }
                    }
                }
                break;
            case 1:
                Collection collection3 = collection;
                if (!(collection3 instanceof Collection) || !collection3.isEmpty()) {
                    Iterator it2 = collection3.iterator();
                    while (it2.hasNext()) {
                        if (!this.f8060a.containsKey(it2.next())) {
                            break;
                        }
                    }
                }
                break;
            default:
                Collection collection4 = collection;
                if (!(collection4 instanceof Collection) || !collection4.isEmpty()) {
                    Iterator it3 = collection4.iterator();
                    while (it3.hasNext()) {
                        if (!this.f8060a.containsValue(it3.next())) {
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f8060a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f8061b) {
            case 0:
                v vVar = this.f8060a;
                return new c0(vVar, ((a1.b) ((vb.e) vVar.d().f8069c).entrySet()).iterator(), 0);
            case 1:
                v vVar2 = this.f8060a;
                return new c0(vVar2, ((a1.b) ((vb.e) vVar2.d().f8069c).entrySet()).iterator(), 1);
            default:
                v vVar3 = this.f8060a;
                return new c0(vVar3, ((a1.b) ((vb.e) vVar3.d().f8069c).entrySet()).iterator(), 2);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        Object next;
        switch (this.f8061b) {
            case 0:
                if (obj instanceof Map.Entry) {
                    return (!(obj instanceof kc.a) || (obj instanceof kc.c)) && this.f8060a.remove(((Map.Entry) obj).getKey()) != null;
                }
                return false;
            case 1:
                return this.f8060a.remove(obj) != null;
            default:
                v vVar = this.f8060a;
                Object it = vVar.f8072b.iterator();
                while (true) {
                    if (((d0) it).hasNext()) {
                        next = ((c0) it).next();
                        if (jc.l.a(((Map.Entry) next).getValue(), obj)) {
                        }
                    } else {
                        next = null;
                    }
                }
                Map.Entry entry = (Map.Entry) next;
                if (entry == null) {
                    return false;
                }
                vVar.remove(entry.getKey());
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        boolean z10;
        boolean z11;
        a1.d dVar;
        int i10;
        g gVarK;
        boolean zB;
        switch (this.f8061b) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    while (it.hasNext()) {
                        z10 = this.f8060a.remove(((Map.Entry) it.next()).getKey()) != null || z10;
                    }
                    return z10;
                }
                break;
            case 1:
                Iterator it2 = collection.iterator();
                while (true) {
                    while (it2.hasNext()) {
                        z11 = this.f8060a.remove(it2.next()) != null || z11;
                    }
                    return z11;
                }
                break;
            default:
                Set setK0 = vb.m.K0(collection);
                v vVar = this.f8060a;
                boolean z12 = false;
                do {
                    synchronized (t.f8068b) {
                        u uVar = vVar.f8071a;
                        jc.l.c(uVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        u uVar2 = (u) n.i(uVar);
                        dVar = uVar2.f8069c;
                        i10 = uVar2.f8070d;
                    }
                    jc.l.b(dVar);
                    a1.c cVarBuilder = dVar.builder();
                    Object it3 = vVar.f8072b.iterator();
                    while (((d0) it3).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((c0) it3).next();
                        if (setK0.contains(entry.getValue())) {
                            cVarBuilder.remove(entry.getKey());
                            z12 = true;
                        }
                    }
                    a1.d dVarBuild = cVarBuilder.build();
                    if (!jc.l.a(dVarBuild, dVar)) {
                        u uVar3 = vVar.f8071a;
                        jc.l.c(uVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        synchronized (n.f8051c) {
                            gVarK = n.k();
                            zB = v.b(vVar, (u) n.x(uVar3, vVar, gVarK), i10, dVarBuild);
                        }
                        n.o(gVarK, vVar);
                    }
                    return z12;
                } while (!zB);
                return z12;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        a1.d dVar;
        int i10;
        g gVarK;
        boolean zB;
        switch (this.f8061b) {
            case 0:
                return a(collection);
            case 1:
                return i(collection);
            default:
                Set setK0 = vb.m.K0(collection);
                v vVar = this.f8060a;
                boolean z10 = false;
                do {
                    synchronized (t.f8068b) {
                        u uVar = vVar.f8071a;
                        jc.l.c(uVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        u uVar2 = (u) n.i(uVar);
                        dVar = uVar2.f8069c;
                        i10 = uVar2.f8070d;
                    }
                    jc.l.b(dVar);
                    a1.c cVarBuilder = dVar.builder();
                    Object it = vVar.f8072b.iterator();
                    while (((d0) it).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((c0) it).next();
                        if (!setK0.contains(entry.getValue())) {
                            cVarBuilder.remove(entry.getKey());
                            z10 = true;
                        }
                    }
                    a1.d dVarBuild = cVarBuilder.build();
                    if (!jc.l.a(dVarBuild, dVar)) {
                        u uVar3 = vVar.f8071a;
                        jc.l.c(uVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        synchronized (n.f8051c) {
                            gVarK = n.k();
                            zB = v.b(vVar, (u) n.x(uVar3, vVar, gVarK), i10, dVarBuild);
                        }
                        n.o(gVarK, vVar);
                    }
                    return z10;
                } while (!zB);
                return z10;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f8060a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return jc.g.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return jc.g.b(this, objArr);
    }
}
