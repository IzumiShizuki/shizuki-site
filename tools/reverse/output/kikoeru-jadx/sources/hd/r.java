package hd;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r extends k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f8448a;

    public r(q qVar) {
        this.f8448a = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && jc.l.a(this.f8448a, ((r) obj).f8448a);
    }

    public final int hashCode() {
        return this.f8448a.hashCode();
    }

    public final String toString() {
        return "AnnotationValue(" + this.f8448a + ')';
    }
}
