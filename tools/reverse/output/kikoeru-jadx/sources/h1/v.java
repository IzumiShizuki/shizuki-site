package h1;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v implements e0, Map, kc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u f8071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f8072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f8073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f8074d;

    public v() {
        c1.c cVar = c1.c.f3208c;
        g gVarK = n.k();
        u uVar = new u(gVarK.g(), cVar);
        if (!(gVarK instanceof b)) {
            uVar.f8013b = new u(1, cVar);
        }
        this.f8071a = uVar;
        this.f8072b = new o(this, 0);
        this.f8073c = new o(this, 1);
        this.f8074d = new o(this, 2);
    }

    public static final boolean b(v vVar, u uVar, int i10, a1.d dVar) {
        boolean z10;
        synchronized (t.f8068b) {
            int i11 = uVar.f8070d;
            if (i11 == i10) {
                uVar.f8069c = dVar;
                z10 = true;
                uVar.f8070d = i11 + 1;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public static void c(u uVar) {
        c1.c cVar = c1.c.f3208c;
        synchronized (t.f8068b) {
            uVar.f8069c = cVar;
            uVar.f8070d++;
        }
    }

    @Override // h1.e0
    public final g0 a() {
        return this.f8071a;
    }

    @Override // java.util.Map
    public final void clear() {
        g gVarK;
        u uVar = this.f8071a;
        jc.l.c(uVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        if (c1.c.f3208c != ((u) n.i(uVar)).f8069c) {
            u uVar2 = this.f8071a;
            jc.l.c(uVar2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (n.f8051c) {
                gVarK = n.k();
                c((u) n.x(uVar2, this, gVarK));
            }
            n.o(gVarK, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return d().f8069c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return d().f8069c.containsValue(obj);
    }

    public final u d() {
        u uVar = this.f8071a;
        jc.l.c(uVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (u) n.u(uVar, this);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f8072b;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return d().f8069c.get(obj);
    }

    @Override // h1.e0
    public final void i(g0 g0Var) {
        jc.l.c(g0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.f8071a = (u) g0Var;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((vb.e) d().f8069c).isEmpty();
    }

    @Override // h1.e0
    public final /* synthetic */ g0 j(g0 g0Var, g0 g0Var2, g0 g0Var3) {
        return null;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f8073c;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        a1.d dVar;
        int i10;
        Object objPut;
        g gVarK;
        boolean zB;
        do {
            synchronized (t.f8068b) {
                u uVar = this.f8071a;
                jc.l.c(uVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                u uVar2 = (u) n.i(uVar);
                dVar = uVar2.f8069c;
                i10 = uVar2.f8070d;
            }
            jc.l.b(dVar);
            c1.e eVar = (c1.e) dVar.builder();
            objPut = eVar.put(obj, obj2);
            a1.d dVarBuild = eVar.build();
            if (jc.l.a(dVarBuild, dVar)) {
                break;
            }
            u uVar3 = this.f8071a;
            jc.l.c(uVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (n.f8051c) {
                gVarK = n.k();
                zB = b(this, (u) n.x(uVar3, this, gVarK), i10, dVarBuild);
            }
            n.o(gVarK, this);
        } while (!zB);
        return objPut;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        a1.d dVar;
        int i10;
        g gVarK;
        boolean zB;
        do {
            synchronized (t.f8068b) {
                u uVar = this.f8071a;
                jc.l.c(uVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                u uVar2 = (u) n.i(uVar);
                dVar = uVar2.f8069c;
                i10 = uVar2.f8070d;
            }
            jc.l.b(dVar);
            c1.e eVar = (c1.e) dVar.builder();
            eVar.putAll(map);
            a1.d dVarBuild = eVar.build();
            if (jc.l.a(dVarBuild, dVar)) {
                return;
            }
            u uVar3 = this.f8071a;
            jc.l.c(uVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (n.f8051c) {
                gVarK = n.k();
                zB = b(this, (u) n.x(uVar3, this, gVarK), i10, dVarBuild);
            }
            n.o(gVarK, this);
        } while (!zB);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        a1.d dVar;
        int i10;
        Object objRemove;
        g gVarK;
        boolean zB;
        do {
            synchronized (t.f8068b) {
                u uVar = this.f8071a;
                jc.l.c(uVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                u uVar2 = (u) n.i(uVar);
                dVar = uVar2.f8069c;
                i10 = uVar2.f8070d;
            }
            jc.l.b(dVar);
            a1.c cVarBuilder = dVar.builder();
            objRemove = cVarBuilder.remove(obj);
            a1.d dVarBuild = cVarBuilder.build();
            if (jc.l.a(dVarBuild, dVar)) {
                break;
            }
            u uVar3 = this.f8071a;
            jc.l.c(uVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (n.f8051c) {
                gVarK = n.k();
                zB = b(this, (u) n.x(uVar3, this, gVarK), i10, dVarBuild);
            }
            n.o(gVarK, this);
        } while (!zB);
        return objRemove;
    }

    @Override // java.util.Map
    public final int size() {
        vb.e eVar = (vb.e) d().f8069c;
        eVar.getClass();
        return ((c1.c) eVar).f3210b;
    }

    public final String toString() {
        u uVar = this.f8071a;
        jc.l.c(uVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return "SnapshotStateMap(value=" + ((u) n.i(uVar)).f8069c + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f8074d;
    }
}
