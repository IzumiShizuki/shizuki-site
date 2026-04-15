package o;

import g2.s1;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v implements Map, kc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f16054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f16055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f16056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s1 f16057d;

    public v(k0 k0Var) {
        jc.l.e(k0Var, "parent");
        this.f16054a = k0Var;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f16054a.c(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f16054a.d(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        h hVar = this.f16055b;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this.f16054a, 0);
        this.f16055b = hVar2;
        return hVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        return jc.l.a(this.f16054a, ((v) obj).f16054a);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f16054a.g(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f16054a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f16054a.i();
    }

    @Override // java.util.Map
    public final Set keySet() {
        h hVar = this.f16056c;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this.f16054a, 1);
        this.f16056c = hVar2;
        return hVar2;
    }

    @Override // java.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f16054a.f15999e;
    }

    public final String toString() {
        return this.f16054a.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        s1 s1Var = this.f16057d;
        if (s1Var != null) {
            return s1Var;
        }
        s1 s1Var2 = new s1(this.f16054a);
        this.f16057d = s1Var2;
        return s1Var2;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
