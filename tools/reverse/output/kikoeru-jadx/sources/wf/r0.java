package wf;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements Map.Entry, kc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f24171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f24172b;

    public r0(Object obj, Object obj2) {
        this.f24171a = obj;
        this.f24172b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return jc.l.a(this.f24171a, r0Var.f24171a) && jc.l.a(this.f24172b, r0Var.f24172b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f24171a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f24172b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f24171a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f24172b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "MapEntry(key=" + this.f24171a + ", value=" + this.f24172b + ')';
    }
}
