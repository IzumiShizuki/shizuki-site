package xf;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@sf.g(with = a0.class)
public final class y extends m implements Map<String, m>, kc.a {
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f25022a;

    public y(Map map) {
        jc.l.e(map, "content");
        this.f25022a = map;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ m compute(String str, BiFunction<? super String, ? super m, ? extends m> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ m computeIfAbsent(String str, Function<? super String, ? extends m> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ m computeIfPresent(String str, BiFunction<? super String, ? super m, ? extends m> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.f25022a.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        return this.f25022a.containsValue((m) obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, m>> entrySet() {
        return this.f25022a.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return jc.l.a(this.f25022a, obj);
    }

    @Override // java.util.Map
    public final m get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (m) this.f25022a.get((String) obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f25022a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f25022a.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.f25022a.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ m merge(String str, m mVar, BiFunction<? super m, ? super m, ? extends m> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ m put(String str, m mVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends m> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ m putIfAbsent(String str, m mVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final m remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ m replace(String str, m mVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super m, ? extends m> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f25022a.size();
    }

    public final String toString() {
        return vb.m.f0(this.f25022a.entrySet(), ",", "{", "}", new t9.c(20), 24);
    }

    @Override // java.util.Map
    public final Collection<m> values() {
        return this.f25022a.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, m mVar, m mVar2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
