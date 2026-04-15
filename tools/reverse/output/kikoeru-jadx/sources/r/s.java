package r;

import i7.p2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0.w1 f18561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v1 f18562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f18563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f18564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f18565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p f18566f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f18567g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f18568h;

    public s(t tVar, v1 v1Var, Object obj, p pVar) {
        b0.w1 w1Var = new b0.w1(16, tVar.f18575a);
        this.f18561a = w1Var;
        this.f18562b = v1Var;
        this.f18563c = obj;
        p pVar2 = (p) v1Var.f18596a.a(obj);
        this.f18564d = pVar2;
        this.f18565e = d.k(pVar);
        this.f18567g = v1Var.f18597b.a(w1Var.P(pVar2, pVar));
        if (((p) w1Var.f1397e) == null) {
            w1Var.f1397e = pVar2.c();
        }
        p pVar3 = (p) w1Var.f1397e;
        if (pVar3 == null) {
            jc.l.k("velocityVector");
            throw null;
        }
        int iB = pVar3.b();
        long jMax = 0;
        for (int i10 = 0; i10 < iB; i10++) {
            p2 p2Var = (p2) w1Var.f1395c;
            pVar2.getClass();
            jMax = Math.max(jMax, ((long) (Math.exp(((q.v0) p2Var.f9258a).b(pVar.a(i10)) / (((double) q.w0.f17468a) - 1.0d)) * 1000.0d)) * 1000000);
        }
        this.f18568h = jMax;
        p pVarK = d.k(this.f18561a.Q(jMax, this.f18564d, pVar));
        this.f18566f = pVarK;
        int iB2 = pVarK.b();
        for (int i11 = 0; i11 < iB2; i11++) {
            p pVar4 = this.f18566f;
            float fA = pVar4.a(i11);
            this.f18561a.getClass();
            this.f18561a.getClass();
            pVar4.e(nh.b.j(fA, -0.0f, 0.0f), i11);
        }
    }

    @Override // r.f
    public final boolean a() {
        return false;
    }

    @Override // r.f
    public final long b() {
        return this.f18568h;
    }

    @Override // r.f
    public final v1 c() {
        return this.f18562b;
    }

    @Override // r.f
    public final p d(long j10) {
        if (q.t0.a(this, j10)) {
            return this.f18566f;
        }
        return this.f18561a.Q(j10, this.f18564d, this.f18565e);
    }

    @Override // r.f
    public final /* synthetic */ boolean e(long j10) {
        return q.t0.a(this, j10);
    }

    @Override // r.f
    public final Object f(long j10) {
        if (q.t0.a(this, j10)) {
            return this.f18567g;
        }
        ic.k kVar = this.f18562b.f18597b;
        b0.w1 w1Var = this.f18561a;
        p pVar = (p) w1Var.f1396d;
        p pVar2 = this.f18564d;
        if (pVar == null) {
            w1Var.f1396d = pVar2.c();
        }
        p pVar3 = (p) w1Var.f1396d;
        if (pVar3 == null) {
            jc.l.k("valueVector");
            throw null;
        }
        int iB = pVar3.b();
        for (int i10 = 0; i10 < iB; i10++) {
            p pVar4 = (p) w1Var.f1396d;
            if (pVar4 == null) {
                jc.l.k("valueVector");
                throw null;
            }
            p2 p2Var = (p2) w1Var.f1395c;
            float fA = pVar2.a(i10);
            long j11 = j10 / 1000000;
            q.u0 u0VarA = ((q.v0) p2Var.f9258a).a(this.f18565e.a(i10));
            long j12 = u0VarA.f17460c;
            pVar4.e((Math.signum(u0VarA.f17458a) * u0VarA.f17459b * q.b.a(j12 > 0 ? j11 / j12 : 1.0f).f17228a) + fA, i10);
        }
        p pVar5 = (p) w1Var.f1396d;
        if (pVar5 != null) {
            return kVar.a(pVar5);
        }
        jc.l.k("valueVector");
        throw null;
    }

    @Override // r.f
    public final Object g() {
        return this.f18567g;
    }
}
