package q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r.x f17445a;

    public s0(r.x xVar) {
        this.f17445a = xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s0) {
            return Float.compare(0.0f, 0.0f) == 0 && jc.l.a(this.f17445a, ((s0) obj).f17445a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17445a.hashCode() + (Float.floatToIntBits(0.0f) * 31);
    }

    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.f17445a + ')';
    }
}
