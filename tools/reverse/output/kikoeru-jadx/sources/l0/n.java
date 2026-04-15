package l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0.g f11569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0.g f11570c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t2.i0 f11572e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f11571d = this;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11573f = -1;

    public n(long j10, k0.g gVar, k0.g gVar2) {
        this.f11568a = j10;
        this.f11569b = gVar;
        this.f11570c = gVar2;
    }

    public final long a(r rVar, boolean z10) {
        t2.i0 i0Var;
        q qVar = rVar.f11603b;
        q qVar2 = rVar.f11602a;
        long j10 = this.f11568a;
        if (z10 && qVar2.f11598c != j10) {
            return 9205357640488583168L;
        }
        if ((!z10 && qVar.f11598c != j10) || c() == null || (i0Var = (t2.i0) this.f11570c.b()) == null) {
            return 9205357640488583168L;
        }
        return u0.t(i0Var, nh.b.k(z10 ? qVar2.f11597b : qVar.f11597b, 0, b(i0Var)), z10, rVar.f11604c);
    }

    public final int b(t2.i0 i0Var) {
        int i10;
        synchronized (this.f11571d) {
            try {
                if (this.f11572e != i0Var) {
                    t2.n nVar = i0Var.f20345b;
                    boolean z10 = nVar.f20368c;
                    int i11 = 0;
                    if (!(z10 || ((float) ((int) (i0Var.f20346c & 4294967295L))) < nVar.f20370e) || z10) {
                        i11 = nVar.f20371f - 1;
                    } else {
                        int iE = nVar.e((int) (i0Var.f20346c & 4294967295L));
                        int i12 = i0Var.f20345b.f20371f - 1;
                        if (iE > i12) {
                            iE = i12;
                        }
                        while (iE >= 0 && i0Var.f20345b.f(iE) >= ((int) (i0Var.f20346c & 4294967295L))) {
                            iE--;
                        }
                        if (iE >= 0) {
                            i11 = iE;
                        }
                    }
                    this.f11573f = i0Var.f20345b.c(i11, true);
                    this.f11572e = i0Var;
                }
                i10 = this.f11573f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    public final g2.c0 c() {
        g2.c0 c0Var = (g2.c0) this.f11569b.b();
        if (c0Var == null || !c0Var.h()) {
            return null;
        }
        return c0Var;
    }

    public final t2.g d() {
        t2.i0 i0Var = (t2.i0) this.f11570c.b();
        return i0Var == null ? new t2.g("") : i0Var.f20344a.f20326a;
    }
}
