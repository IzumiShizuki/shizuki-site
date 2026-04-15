package x0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e1 f24307a;

    public g0(e1 e1Var) {
        this.f24307a = e1Var;
    }

    @Override // x0.r2
    public final Object a(j1 j1Var) {
        return this.f24307a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0) && this.f24307a.equals(((g0) obj).f24307a);
    }

    public final int hashCode() {
        return this.f24307a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f24307a + ')';
    }
}
