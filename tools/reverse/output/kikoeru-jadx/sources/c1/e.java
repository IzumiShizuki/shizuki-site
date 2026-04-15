package c1;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class e extends AbstractMap implements a1.c, Map, kc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f3214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e1.b f3215b = new e1.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f3216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f3217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3219f;

    public e(c cVar) {
        this.f3214a = cVar;
        this.f3216c = cVar.f3209a;
        this.f3219f = cVar.f3210b;
    }

    @Override // a1.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c build() {
        m mVar = this.f3216c;
        c cVar = this.f3214a;
        if (mVar != cVar.f3209a) {
            this.f3215b = new e1.b();
            cVar = new c(this.f3216c, this.f3219f);
        }
        this.f3214a = cVar;
        return cVar;
    }

    public final void b(int i10) {
        this.f3219f = i10;
        this.f3218e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f3216c = m.f3232e;
        b(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f3216c.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new g(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f3216c.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new g(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f3217d = null;
        this.f3216c = this.f3216c.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f3217d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        c cVarBuild = null;
        c cVar = map instanceof c ? (c) map : null;
        if (cVar == null) {
            e eVar = map instanceof e ? (e) map : null;
            if (eVar != null) {
                cVarBuild = eVar.build();
            }
        } else {
            cVarBuild = cVar;
        }
        if (cVarBuild == null) {
            super.putAll(map);
            return;
        }
        e1.a aVar = new e1.a();
        aVar.f6060a = 0;
        int i10 = this.f3219f;
        m mVar = this.f3216c;
        m mVar2 = cVarBuild.f3209a;
        jc.l.c(mVar2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f3216c = mVar.m(mVar2, 0, aVar, this);
        int i11 = (cVarBuild.f3210b + i10) - aVar.f6060a;
        if (i10 != i11) {
            b(i11);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i10 = this.f3219f;
        m mVarO = this.f3216c.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (mVarO == null) {
            mVarO = m.f3232e;
        }
        this.f3216c = mVarO;
        return i10 != this.f3219f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f3219f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new i(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f3217d = null;
        m mVarN = this.f3216c.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (mVarN == null) {
            mVarN = m.f3232e;
        }
        this.f3216c = mVarN;
        return this.f3217d;
    }
}
