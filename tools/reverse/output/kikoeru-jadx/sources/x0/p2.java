package x0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p2 implements r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f24425a;

    public p2(Object obj) {
        this.f24425a = obj;
    }

    @Override // x0.r2
    public final Object a(j1 j1Var) {
        return this.f24425a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p2) && jc.l.a(this.f24425a, ((p2) obj).f24425a);
    }

    public final int hashCode() {
        Object obj = this.f24425a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f24425a + ')';
    }
}
