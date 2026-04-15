package j5;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v implements b0, a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f10446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n5.f f10448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f10449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b0 f10450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a0 f10451f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f10452g = -9223372036854775807L;

    public v(d0 d0Var, n5.f fVar, long j10) {
        this.f10446a = d0Var;
        this.f10448c = fVar;
        this.f10447b = j10;
    }

    @Override // j5.a0
    public final void a(b0 b0Var) {
        a0 a0Var = this.f10451f;
        int i10 = p4.c0.f16548a;
        a0Var.a(this);
    }

    public final void b(d0 d0Var) {
        long j10 = this.f10452g;
        if (j10 == -9223372036854775807L) {
            j10 = this.f10447b;
        }
        a aVar = this.f10449d;
        aVar.getClass();
        b0 b0VarC = aVar.c(d0Var, this.f10448c, j10);
        this.f10450e = b0VarC;
        if (this.f10451f != null) {
            b0VarC.g(this, j10);
        }
    }

    @Override // j5.d1
    public final void c(e1 e1Var) {
        a0 a0Var = this.f10451f;
        int i10 = p4.c0.f16548a;
        a0Var.c(this);
    }

    @Override // j5.e1
    public final long d() {
        b0 b0Var = this.f10450e;
        int i10 = p4.c0.f16548a;
        return b0Var.d();
    }

    @Override // j5.e1
    public final boolean e(v4.f0 f0Var) {
        b0 b0Var = this.f10450e;
        return b0Var != null && b0Var.e(f0Var);
    }

    @Override // j5.b0
    public final void f() {
        b0 b0Var = this.f10450e;
        if (b0Var != null) {
            b0Var.f();
            return;
        }
        a aVar = this.f10449d;
        if (aVar != null) {
            aVar.k();
        }
    }

    @Override // j5.b0
    public final void g(a0 a0Var, long j10) {
        this.f10451f = a0Var;
        b0 b0Var = this.f10450e;
        if (b0Var != null) {
            long j11 = this.f10452g;
            if (j11 == -9223372036854775807L) {
                j11 = this.f10447b;
            }
            b0Var.g(this, j11);
        }
    }

    @Override // j5.b0
    public final long h(long j10) {
        b0 b0Var = this.f10450e;
        int i10 = p4.c0.f16548a;
        return b0Var.h(j10);
    }

    @Override // j5.b0
    public final void i(long j10) {
        b0 b0Var = this.f10450e;
        int i10 = p4.c0.f16548a;
        b0Var.i(j10);
    }

    @Override // j5.b0
    public final long l(m5.r[] rVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j10) {
        long j11 = this.f10452g;
        long j12 = (j11 == -9223372036854775807L || j10 != this.f10447b) ? j10 : j11;
        this.f10452g = -9223372036854775807L;
        b0 b0Var = this.f10450e;
        int i10 = p4.c0.f16548a;
        return b0Var.l(rVarArr, zArr, c1VarArr, zArr2, j12);
    }

    @Override // j5.e1
    public final boolean m() {
        b0 b0Var = this.f10450e;
        return b0Var != null && b0Var.m();
    }

    @Override // j5.b0
    public final long o(long j10, v4.b1 b1Var) {
        b0 b0Var = this.f10450e;
        int i10 = p4.c0.f16548a;
        return b0Var.o(j10, b1Var);
    }

    @Override // j5.b0
    public final long p() {
        b0 b0Var = this.f10450e;
        int i10 = p4.c0.f16548a;
        return b0Var.p();
    }

    @Override // j5.b0
    public final o1 q() {
        b0 b0Var = this.f10450e;
        int i10 = p4.c0.f16548a;
        return b0Var.q();
    }

    @Override // j5.e1
    public final long t() {
        b0 b0Var = this.f10450e;
        int i10 = p4.c0.f16548a;
        return b0Var.t();
    }

    @Override // j5.e1
    public final void w(long j10) {
        b0 b0Var = this.f10450e;
        int i10 = p4.c0.f16548a;
        b0Var.w(j10);
    }
}
