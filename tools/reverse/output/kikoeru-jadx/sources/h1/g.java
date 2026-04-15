package h1;

import c7.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f8008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f8009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8011d;

    public g(long j10, k kVar) {
        int iA;
        int iNumberOfTrailingZeros;
        this.f8008a = kVar;
        this.f8009b = j10;
        g1.d dVar = n.f8049a;
        if (j10 != 0) {
            k kVarD = d();
            long j11 = kVarD.f8037c;
            long[] jArr = kVarD.f8038d;
            if (jArr != null) {
                j10 = jArr[0];
            } else {
                long j12 = kVarD.f8036b;
                if (j12 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j12);
                } else {
                    long j13 = kVarD.f8035a;
                    if (j13 != 0) {
                        j11 += (long) 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j13);
                    }
                }
                j10 = ((long) iNumberOfTrailingZeros) + j11;
            }
            synchronized (n.f8051c) {
                iA = n.f8054f.a(j10);
            }
        } else {
            iA = -1;
        }
        this.f8011d = iA;
    }

    public static void q(g gVar) {
        n.f8050b.Z(gVar);
    }

    public final void a() {
        synchronized (n.f8051c) {
            b();
            p();
        }
    }

    public void b() {
        n.f8052d = n.f8052d.i(g());
    }

    public abstract void c();

    public k d() {
        return this.f8008a;
    }

    public abstract ic.k e();

    public abstract boolean f();

    public long g() {
        return this.f8009b;
    }

    public int h() {
        return 0;
    }

    public abstract ic.k i();

    public final g j() {
        e1 e1Var = n.f8050b;
        g gVar = (g) e1Var.y();
        e1Var.Z(this);
        return gVar;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(e0 e0Var);

    public final void o() {
        int i10 = this.f8011d;
        if (i10 >= 0) {
            n.v(i10);
            this.f8011d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(k kVar) {
        this.f8008a = kVar;
    }

    public void s(long j10) {
        this.f8009b = j10;
    }

    public void t(int i10) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract g u(ic.k kVar);
}
