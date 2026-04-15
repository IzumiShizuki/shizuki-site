package u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k implements v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jc.m f20969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f20970b = new j(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s.y0 f20971c = new s.y0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x0.e1 f20972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x0.e1 f20973e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x0.e1 f20974f;

    /* JADX WARN: Multi-variable type inference failed */
    public k(ic.k kVar) {
        this.f20969a = (jc.m) kVar;
        Boolean bool = Boolean.FALSE;
        this.f20972d = x0.v.v(bool);
        this.f20973e = x0.v.v(bool);
        this.f20974f = x0.v.v(bool);
    }

    @Override // u.v1
    public final boolean a() {
        return ((Boolean) this.f20972d.getValue()).booleanValue();
    }

    @Override // u.v1
    public final Object b(s.v0 v0Var, ic.n nVar, ac.c cVar) {
        Object objK = hf.a0.k(new q.q(this, v0Var, nVar, null, 10), cVar);
        return objK == zb.a.f26667a ? objK : ub.a0.f21526a;
    }

    @Override // u.v1
    public final /* synthetic */ boolean c() {
        return true;
    }

    @Override // u.v1
    public final /* synthetic */ boolean d() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ic.k, jc.m] */
    @Override // u.v1
    public final float e(float f10) {
        return ((Number) this.f20969a.a(Float.valueOf(f10))).floatValue();
    }
}
