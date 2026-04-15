package g0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f7116a;

    public c(float f10) {
        this.f7116a = f10;
    }

    @Override // g0.a
    public final float b(long j10, f3.c cVar) {
        return cVar.Q(this.f7116a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && f3.f.a(this.f7116a, ((c) obj).f7116a);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f7116a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f7116a + ".dp)";
    }
}
