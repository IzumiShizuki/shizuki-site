package ya;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class d extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient b f25962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient n f25963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Map f25964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v0 f25965d;

    public d(v0 v0Var, Map map) {
        this.f25965d = v0Var;
        this.f25964c = map;
    }

    public final e0 a(Map.Entry entry) {
        Object key = entry.getKey();
        List list = (List) ((Collection) entry.getValue());
        boolean z10 = list instanceof RandomAccess;
        v0 v0Var = this.f25965d;
        return new e0(key, z10 ? new h(v0Var, key, list, null) : new l(v0Var, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        v0 v0Var = this.f25965d;
        if (this.f25964c == v0Var.f26067d) {
            v0Var.b();
            return;
        }
        c cVar = new c(this);
        while (cVar.hasNext()) {
            cVar.next();
            cVar.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f25964c;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        b bVar = this.f25962a;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.f25962a = bVar2;
        return bVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f25964c.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.f25964c;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        List list = (List) collection;
        boolean z10 = list instanceof RandomAccess;
        v0 v0Var = this.f25965d;
        return z10 ? new h(v0Var, obj, list, null) : new l(v0Var, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f25964c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        v0 v0Var = this.f25965d;
        Set set = v0Var.f26028a;
        if (set != null) {
            return set;
        }
        Map map = v0Var.f26067d;
        Set gVar = map instanceof NavigableMap ? new g(v0Var, (NavigableMap) map) : map instanceof SortedMap ? new j(v0Var, (SortedMap) map) : new e(v0Var, map);
        v0Var.f26028a = gVar;
        return gVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.f25964c.remove(obj);
        if (collection == null) {
            return null;
        }
        v0 v0Var = this.f25965d;
        Collection collectionC = v0Var.c();
        collectionC.addAll(collection);
        v0Var.f26068e -= collection.size();
        collection.clear();
        return collectionC;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f25964c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f25964c.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        n nVar = this.f25963b;
        if (nVar != null) {
            return nVar;
        }
        n nVar2 = new n(this);
        this.f25963b = nVar2;
        return nVar2;
    }
}
