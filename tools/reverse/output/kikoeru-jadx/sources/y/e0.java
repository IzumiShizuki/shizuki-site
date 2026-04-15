package y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f25116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f25117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f25118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f25119d;

    public e0(float f10, float f11, float f12, float f13) {
        this.f25116a = f10;
        this.f25117b = f11;
        this.f25118c = f12;
        this.f25119d = f13;
    }

    @Override // y.r1
    public final int a(f3.c cVar, f3.m mVar) {
        return cVar.a0(this.f25116a);
    }

    @Override // y.r1
    public final int b(f3.c cVar) {
        return cVar.a0(this.f25117b);
    }

    @Override // y.r1
    public final int c(f3.c cVar) {
        return cVar.a0(this.f25119d);
    }

    @Override // y.r1
    public final int d(f3.c cVar, f3.m mVar) {
        return cVar.a0(this.f25118c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return f3.f.a(this.f25116a, e0Var.f25116a) && f3.f.a(this.f25117b, e0Var.f25117b) && f3.f.a(this.f25118c, e0Var.f25118c) && f3.f.a(this.f25119d, e0Var.f25119d);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f25119d) + q.t0.x(this.f25118c, q.t0.x(this.f25117b, Float.floatToIntBits(this.f25116a) * 31, 31), 31);
    }

    public final String toString() {
        return "Insets(left=" + ((Object) f3.f.b(this.f25116a)) + ", top=" + ((Object) f3.f.b(this.f25117b)) + ", right=" + ((Object) f3.f.b(this.f25118c)) + ", bottom=" + ((Object) f3.f.b(this.f25119d)) + ')';
    }
}
