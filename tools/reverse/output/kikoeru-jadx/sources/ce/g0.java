package ce;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements Comparable, Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparable f3932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f3933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f3934c;

    public g0(c0 c0Var, Comparable comparable, Object obj) {
        this.f3934c = c0Var;
        this.f3932a = comparable;
        this.f3933b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f3932a.compareTo(((g0) obj).f3932a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f3932a;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f3933b;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f3932a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f3933b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f3932a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f3933b;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f3934c.b();
        Object obj2 = this.f3933b;
        this.f3933b = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f3932a);
        String strValueOf2 = String.valueOf(this.f3933b);
        StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 1);
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        return sb.toString();
    }
}
