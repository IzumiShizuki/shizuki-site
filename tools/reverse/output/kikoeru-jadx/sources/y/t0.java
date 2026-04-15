package y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1 f25259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f3.c f25260b;

    public t0(r1 r1Var, f3.c cVar) {
        this.f25259a = r1Var;
        this.f25260b = cVar;
    }

    @Override // y.d1
    public final float a() {
        r1 r1Var = this.f25259a;
        f3.c cVar = this.f25260b;
        return cVar.I(r1Var.c(cVar));
    }

    @Override // y.d1
    public final float b(f3.m mVar) {
        r1 r1Var = this.f25259a;
        f3.c cVar = this.f25260b;
        return cVar.I(r1Var.a(cVar, mVar));
    }

    @Override // y.d1
    public final float c() {
        r1 r1Var = this.f25259a;
        f3.c cVar = this.f25260b;
        return cVar.I(r1Var.b(cVar));
    }

    @Override // y.d1
    public final float d(f3.m mVar) {
        r1 r1Var = this.f25259a;
        f3.c cVar = this.f25260b;
        return cVar.I(r1Var.d(cVar, mVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return jc.l.a(this.f25259a, t0Var.f25259a) && jc.l.a(this.f25260b, t0Var.f25260b);
    }

    public final int hashCode() {
        return this.f25260b.hashCode() + (this.f25259a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.f25259a + ", density=" + this.f25260b + ')';
    }
}
