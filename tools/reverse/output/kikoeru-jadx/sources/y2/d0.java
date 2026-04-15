package y2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t2.g f25401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f25402b;

    public d0(t2.g gVar, r rVar) {
        this.f25401a = gVar;
        this.f25402b = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return jc.l.a(this.f25401a, d0Var.f25401a) && jc.l.a(this.f25402b, d0Var.f25402b);
    }

    public final int hashCode() {
        return this.f25402b.hashCode() + (this.f25401a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f25401a) + ", offsetMapping=" + this.f25402b + ')';
    }
}
