package y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e1 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f25120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f25121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f25122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f25123d;

    public e1(float f10, float f11, float f12, float f13) {
        this.f25120a = f10;
        this.f25121b = f11;
        this.f25122c = f12;
        this.f25123d = f13;
        if (!((f10 >= 0.0f) & (f11 >= 0.0f) & (f12 >= 0.0f)) || !(f13 >= 0.0f)) {
            z.a.a("Padding must be non-negative");
        }
    }

    @Override // y.d1
    public final float a() {
        return this.f25123d;
    }

    @Override // y.d1
    public final float b(f3.m mVar) {
        return mVar == f3.m.f6667a ? this.f25120a : this.f25122c;
    }

    @Override // y.d1
    public final float c() {
        return this.f25121b;
    }

    @Override // y.d1
    public final float d(f3.m mVar) {
        return mVar == f3.m.f6667a ? this.f25122c : this.f25120a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return f3.f.a(this.f25120a, e1Var.f25120a) && f3.f.a(this.f25121b, e1Var.f25121b) && f3.f.a(this.f25122c, e1Var.f25122c) && f3.f.a(this.f25123d, e1Var.f25123d);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f25123d) + q.t0.x(this.f25122c, q.t0.x(this.f25121b, Float.floatToIntBits(this.f25120a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) f3.f.b(this.f25120a)) + ", top=" + ((Object) f3.f.b(this.f25121b)) + ", end=" + ((Object) f3.f.b(this.f25122c)) + ", bottom=" + ((Object) f3.f.b(this.f25123d)) + ')';
    }
}
