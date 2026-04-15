package x0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jc.m f24234a;

    /* JADX WARN: Multi-variable type inference failed */
    public a0(ic.k kVar) {
        this.f24234a = (jc.m) kVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ic.k, jc.m] */
    @Override // x0.r2
    public final Object a(j1 j1Var) {
        return this.f24234a.a(j1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && this.f24234a.equals(((a0) obj).f24234a);
    }

    public final int hashCode() {
        return this.f24234a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.f24234a + ')';
    }
}
