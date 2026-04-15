package j5;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m1 implements b0, a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f10356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a0 f10358c;

    public m1(b0 b0Var, long j10) {
        this.f10356a = b0Var;
        this.f10357b = j10;
    }

    @Override // j5.a0
    public final void a(b0 b0Var) {
        a0 a0Var = this.f10358c;
        a0Var.getClass();
        a0Var.a(this);
    }

    @Override // j5.d1
    public final void c(e1 e1Var) {
        a0 a0Var = this.f10358c;
        a0Var.getClass();
        a0Var.c(this);
    }

    @Override // j5.e1
    public final long d() {
        long jD = this.f10356a.d();
        if (jD == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jD + this.f10357b;
    }

    @Override // j5.e1
    public final boolean e(v4.f0 f0Var) {
        v4.e0 e0Var = new v4.e0();
        long j10 = f0Var.f22482a;
        e0Var.f22468b = f0Var.f22483b;
        e0Var.f22469c = f0Var.f22484c;
        e0Var.f22467a = j10 - this.f10357b;
        return this.f10356a.e(new v4.f0(e0Var));
    }

    @Override // j5.b0
    public final void f() {
        this.f10356a.f();
    }

    @Override // j5.b0
    public final void g(a0 a0Var, long j10) {
        this.f10358c = a0Var;
        this.f10356a.g(this, j10 - this.f10357b);
    }

    @Override // j5.b0
    public final long h(long j10) {
        long j11 = this.f10357b;
        return this.f10356a.h(j10 - j11) + j11;
    }

    @Override // j5.b0
    public final void i(long j10) {
        this.f10356a.i(j10 - this.f10357b);
    }

    @Override // j5.b0
    public final long l(m5.r[] rVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j10) {
        c1[] c1VarArr2 = new c1[c1VarArr.length];
        int i10 = 0;
        while (true) {
            c1 c1Var = null;
            if (i10 >= c1VarArr.length) {
                break;
            }
            l1 l1Var = (l1) c1VarArr[i10];
            if (l1Var != null) {
                c1Var = l1Var.f10350a;
            }
            c1VarArr2[i10] = c1Var;
            i10++;
        }
        b0 b0Var = this.f10356a;
        long j11 = this.f10357b;
        long jL = b0Var.l(rVarArr, zArr, c1VarArr2, zArr2, j10 - j11);
        for (int i11 = 0; i11 < c1VarArr.length; i11++) {
            c1 c1Var2 = c1VarArr2[i11];
            if (c1Var2 == null) {
                c1VarArr[i11] = null;
            } else {
                c1 c1Var3 = c1VarArr[i11];
                if (c1Var3 == null || ((l1) c1Var3).f10350a != c1Var2) {
                    c1VarArr[i11] = new l1(c1Var2, j11);
                }
            }
        }
        return jL + j11;
    }

    @Override // j5.e1
    public final boolean m() {
        return this.f10356a.m();
    }

    @Override // j5.b0
    public final long o(long j10, v4.b1 b1Var) {
        long j11 = this.f10357b;
        return this.f10356a.o(j10 - j11, b1Var) + j11;
    }

    @Override // j5.b0
    public final long p() {
        long jP = this.f10356a.p();
        if (jP == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jP + this.f10357b;
    }

    @Override // j5.b0
    public final o1 q() {
        return this.f10356a.q();
    }

    @Override // j5.e1
    public final long t() {
        long jT = this.f10356a.t();
        if (jT == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jT + this.f10357b;
    }

    @Override // j5.e1
    public final void w(long j10) {
        this.f10356a.w(j10 - this.f10357b);
    }
}
