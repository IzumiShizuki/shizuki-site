package s4;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ya.j1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q extends ya.q implements Map {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f19467b;

    public q(Map map) {
        this.f19467b = map;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f19467b.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.f19467b.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Iterator it = ((j1) entrySet()).iterator();
        it.getClass();
        if (obj == null) {
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(((Map.Entry) it.next()).getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return ya.q.i(this.f19467b.entrySet(), new p(0));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && ya.q.g(obj, this);
    }

    @Override // ya.q
    public final Object f() {
        return this.f19467b;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f19467b.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return ya.q.l(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.f19467b;
        return map.isEmpty() || (map.size() == 1 && map.containsKey(null));
    }

    @Override // java.util.Map
    public final Set keySet() {
        return ya.q.i(this.f19467b.keySet(), new p(1));
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.f19467b.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f19467b.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.f19467b.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        Map map = this.f19467b;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f19467b.values();
    }
}
