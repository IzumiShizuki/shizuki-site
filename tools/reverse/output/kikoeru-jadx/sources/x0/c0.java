package x0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends h1.f0 implements n2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a f24257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i2 f24258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b0 f24259d = new b0(h1.n.k().g());

    public c0(ic.a aVar, i2 i2Var) {
        this.f24257b = aVar;
        this.f24258c = i2Var;
    }

    @Override // h1.e0
    public final h1.g0 a() {
        return this.f24259d;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final x0.b0 e(x0.b0 r23, h1.g r24, boolean r25, ic.a r26) {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.c0.e(x0.b0, h1.g, boolean, ic.a):x0.b0");
    }

    public final b0 f() {
        h1.g gVarK = h1.n.k();
        return e((b0) h1.n.j(this.f24259d, gVarK), gVarK, false, this.f24257b);
    }

    @Override // x0.n2
    public final Object getValue() {
        ic.k kVarE = h1.n.k().e();
        if (kVarE != null) {
            kVarE.a(this);
        }
        h1.g gVarK = h1.n.k();
        return e((b0) h1.n.j(this.f24259d, gVarK), gVarK, true, this.f24257b).f24251f;
    }

    @Override // h1.e0
    public final void i(h1.g0 g0Var) {
        jc.l.c(g0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.f24259d = (b0) g0Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        b0 b0Var = (b0) h1.n.i(this.f24259d);
        sb.append(b0Var.d(this, h1.n.k()) ? String.valueOf(b0Var.f24251f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
