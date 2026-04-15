package h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s0 f7830c = new s0(null, null, 63);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.k f7831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.k f7832b;

    public s0(ic.k kVar, ic.k kVar2, int i10) {
        kVar = (i10 & 1) != 0 ? null : kVar;
        kVar2 = (i10 & 16) != 0 ? null : kVar2;
        this.f7831a = kVar;
        this.f7832b = kVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return this.f7831a == s0Var.f7831a && this.f7832b == s0Var.f7832b;
    }

    public final int hashCode() {
        ic.k kVar = this.f7831a;
        int iHashCode = (kVar != null ? kVar.hashCode() : 0) * 923521;
        ic.k kVar2 = this.f7832b;
        return (iHashCode + (kVar2 != null ? kVar2.hashCode() : 0)) * 31;
    }
}
