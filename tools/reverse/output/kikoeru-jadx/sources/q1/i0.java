package q1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements f3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f17521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f17522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f17523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f17524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f17525f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f17526g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f17527h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f17528i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f17529j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f17530k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f17531l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public l0 f17532m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f17533n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f17534o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public f3.c f17535p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public f3.m f17536q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f17537r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public h0 f17538s;

    @Override // f3.c
    public final long E(float f10) {
        return a0.c.w(J(f10), this);
    }

    @Override // f3.c
    public final float I(int i10) {
        return i10 / a();
    }

    @Override // f3.c
    public final float J(float f10) {
        return f10 / a();
    }

    @Override // f3.c
    public final float M() {
        return this.f17535p.M();
    }

    @Override // f3.c
    public final float Q(float f10) {
        return a() * f10;
    }

    @Override // f3.c
    public final int U(long j10) {
        throw null;
    }

    @Override // f3.c
    public final float a() {
        return this.f17535p.a();
    }

    @Override // f3.c
    public final /* synthetic */ int a0(float f10) {
        return a0.c.q(f10, this);
    }

    public final void b(float f10) {
        if (this.f17523d == f10) {
            return;
        }
        this.f17520a |= 4;
        this.f17523d = f10;
    }

    public final void c(long j10) {
        if (q.c(this.f17527h, j10)) {
            return;
        }
        this.f17520a |= 64;
        this.f17527h = j10;
    }

    public final void d(boolean z10) {
        if (this.f17533n != z10) {
            this.f17520a |= 16384;
            this.f17533n = z10;
        }
    }

    public final void f(float f10) {
        if (this.f17521b == f10) {
            return;
        }
        this.f17520a |= 1;
        this.f17521b = f10;
    }

    @Override // f3.c
    public final /* synthetic */ long f0(long j10) {
        return a0.c.v(j10, this);
    }

    public final void g(float f10) {
        if (this.f17522c == f10) {
            return;
        }
        this.f17520a |= 2;
        this.f17522c = f10;
    }

    public final void h(float f10) {
        if (this.f17526g == f10) {
            return;
        }
        this.f17520a |= 32;
        this.f17526g = f10;
    }

    public final void i(l0 l0Var) {
        if (jc.l.a(this.f17532m, l0Var)) {
            return;
        }
        this.f17520a |= 8192;
        this.f17532m = l0Var;
    }

    @Override // f3.c
    public final /* synthetic */ float i0(long j10) {
        return a0.c.u(j10, this);
    }

    public final void j(long j10) {
        if (q.c(this.f17528i, j10)) {
            return;
        }
        this.f17520a |= 128;
        this.f17528i = j10;
    }

    public final void k(long j10) {
        if (p0.a(this.f17531l, j10)) {
            return;
        }
        this.f17520a |= 4096;
        this.f17531l = j10;
    }

    public final void l(float f10) {
        if (this.f17524e == f10) {
            return;
        }
        this.f17520a |= 8;
        this.f17524e = f10;
    }

    public final void m(float f10) {
        if (this.f17525f == f10) {
            return;
        }
        this.f17520a |= 16;
        this.f17525f = f10;
    }

    @Override // f3.c
    public final /* synthetic */ long n(long j10) {
        return a0.c.t(j10, this);
    }

    @Override // f3.c
    public final /* synthetic */ float r(long j10) {
        return a0.c.s(j10, this);
    }
}
