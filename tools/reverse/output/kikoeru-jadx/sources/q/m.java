package q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m implements r.k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r.q1 f17360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j1.d f17361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0.e1 f17362c = x0.v.v(new f3.l(0));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o.k0 f17363d;

    public m(r.q1 q1Var, j1.d dVar) {
        this.f17360a = q1Var;
        this.f17361b = dVar;
        long[] jArr = o.s0.f16040a;
        this.f17363d = new o.k0();
    }

    @Override // r.k1
    public final Object a() {
        return this.f17360a.f().a();
    }

    @Override // r.k1
    public final boolean b(Object obj, Object obj2) {
        return obj.equals(a()) && obj2.equals(c());
    }

    @Override // r.k1
    public final Object c() {
        return this.f17360a.f().c();
    }
}
