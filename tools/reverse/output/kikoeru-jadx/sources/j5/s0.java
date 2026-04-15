package j5;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10412b;

    public s0(int i10, boolean z10) {
        this.f10411a = i10;
        this.f10412b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s0.class != obj.getClass()) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return this.f10411a == s0Var.f10411a && this.f10412b == s0Var.f10412b;
    }

    public final int hashCode() {
        return (this.f10411a * 31) + (this.f10412b ? 1 : 0);
    }
}
