package q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jc.m f17469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r.u1 f17470b;

    /* JADX WARN: Multi-variable type inference failed */
    public w1(ic.k kVar, r.u1 u1Var) {
        this.f17469a = (jc.m) kVar;
        this.f17470b = u1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return this.f17469a.equals(w1Var.f17469a) && this.f17470b.equals(w1Var.f17470b);
    }

    public final int hashCode() {
        return this.f17470b.hashCode() + (this.f17469a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.f17469a + ", animationSpec=" + this.f17470b + ')';
    }
}
