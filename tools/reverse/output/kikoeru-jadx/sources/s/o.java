package s;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f19235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1.n0 f19236b;

    public o(float f10, q1.n0 n0Var) {
        this.f19235a = f10;
        this.f19236b = n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return f3.f.a(this.f19235a, oVar.f19235a) && this.f19236b.equals(oVar.f19236b);
    }

    public final int hashCode() {
        return this.f19236b.hashCode() + (Float.floatToIntBits(this.f19235a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) f3.f.b(this.f19235a)) + ", brush=" + this.f19236b + ')';
    }
}
