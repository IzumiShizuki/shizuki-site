package la;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1.f f12147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12148b;

    public x0(w1.f fVar, String str) {
        this.f12147a = fVar;
        this.f12148b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return jc.l.a(this.f12147a, x0Var.f12147a) && jc.l.a(this.f12148b, x0Var.f12148b);
    }

    public final int hashCode() {
        return this.f12148b.hashCode() + (this.f12147a.hashCode() * 31);
    }

    public final String toString() {
        return "TextWithIcon(icon=" + this.f12147a + ", text=" + this.f12148b + ")";
    }
}
