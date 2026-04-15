package r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z0 implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f18637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f18638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f18639c;

    public z0(float f10, float f11, Object obj) {
        this.f18637a = f10;
        this.f18638b = f11;
        this.f18639c = obj;
    }

    @Override // r.j
    public final x1 a(v1 v1Var) {
        Object obj = this.f18639c;
        return new y1(this.f18637a, this.f18638b, obj == null ? null : (p) v1Var.f18596a.a(obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z0) {
            z0 z0Var = (z0) obj;
            if (z0Var.f18637a == this.f18637a && z0Var.f18638b == this.f18638b && jc.l.a(z0Var.f18639c, this.f18639c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f18639c;
        return Float.floatToIntBits(this.f18638b) + q.t0.x(this.f18637a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    public /* synthetic */ z0(int i10, Object obj) {
        this(1.0f, 1500.0f, (i10 & 4) != 0 ? null : obj);
    }
}
