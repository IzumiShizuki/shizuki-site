package ya;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class k0 implements Map, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient m0 f26008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient m0 f26009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient d0 f26010c;

    public static k0 a(Map map) {
        if ((map instanceof k0) && !(map instanceof SortedMap)) {
            return (k0) map;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        boolean z10 = setEntrySet instanceof Collection;
        ah.j jVar = new ah.j(z10 ? setEntrySet.size() : 4);
        if (z10) {
            int size = setEntrySet.size() * 2;
            Object[] objArr = (Object[]) jVar.f391c;
            if (size > objArr.length) {
                jVar.f391c = Arrays.copyOf(objArr, c0.e(objArr.length, size));
            }
        }
        for (Map.Entry entry : setEntrySet) {
            jVar.G(entry.getKey(), entry.getValue());
        }
        return jVar.c();
    }

    public abstract c1 b();

    public abstract d1 c();

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract d0 d();

    @Override // java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public d0 values() {
        d0 d0Var = this.f26010c;
        if (d0Var != null) {
            return d0Var;
        }
        d0 d0VarD = d();
        this.f26010c = d0VarD;
        return d0VarD;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        m0 m0Var = this.f26008a;
        if (m0Var != null) {
            return m0Var;
        }
        c1 c1VarB = b();
        this.f26008a = c1VarB;
        return c1VarB;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return q.g(obj, this);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        m0 m0VarB = this.f26008a;
        if (m0VarB == null) {
            m0VarB = b();
            this.f26008a = m0VarB;
        }
        return q.l(m0VarB);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        m0 m0Var = this.f26009b;
        if (m0Var != null) {
            return m0Var;
        }
        d1 d1VarC = c();
        this.f26009b = d1VarC;
        return d1VarC;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        q.d(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        boolean z10 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z10) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z10 = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
