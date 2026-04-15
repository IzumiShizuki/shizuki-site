package vb;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f22823b;

    public u(int i10, Object obj) {
        this.f22822a = i10;
        this.f22823b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f22822a == uVar.f22822a && jc.l.a(this.f22823b, uVar.f22823b);
    }

    public final int hashCode() {
        int i10 = this.f22822a * 31;
        Object obj = this.f22823b;
        return i10 + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f22822a + ", value=" + this.f22823b + ')';
    }
}
