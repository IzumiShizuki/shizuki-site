package i2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f8790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8792c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8794e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8795f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8796g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8797h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8798i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f8799j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f8800k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8801l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f8802m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f8803n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f8804o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public v0 f8806q;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f0 f8793d = f0.f8693e;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z0 f8805p = new z0(this);

    public n0(j0 j0Var) {
        this.f8790a = j0Var;
    }

    public final g1 a() {
        return this.f8790a.F.f8665d;
    }

    public final void b() {
        f0 f0Var = this.f8790a.G.f8793d;
        f0 f0Var2 = f0.f8691c;
        f0 f0Var3 = f0.f8692d;
        if (f0Var == f0Var2 || f0Var == f0Var3) {
            if (this.f8805p.B) {
                g(true);
            } else {
                f(true);
            }
        }
        if (f0Var == f0Var3) {
            v0 v0Var = this.f8806q;
            if (v0Var == null || !v0Var.f8877v) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j10) {
        v0 v0Var = this.f8806q;
        if (v0Var != null) {
            n0 n0Var = v0Var.f8861f;
            n0Var.f8793d = f0.f8690b;
            z0 z0Var = n0Var.f8805p;
            j0 j0Var = n0Var.f8790a;
            n0Var.f8794e = false;
            r1 snapshotObserver = ((j2.v) m0.a(j0Var)).getSnapshotObserver();
            t0 t0Var = new t0(v0Var, j10);
            snapshotObserver.getClass();
            if (j0Var.f8749h != null) {
                snapshotObserver.a(j0Var, snapshotObserver.f8838b, t0Var);
            } else {
                snapshotObserver.a(j0Var, snapshotObserver.f8839c, t0Var);
            }
            n0Var.f8795f = true;
            n0Var.f8796g = true;
            if (f.s(j0Var)) {
                z0Var.f8925w = true;
                z0Var.f8926x = true;
            } else {
                z0Var.f8924v = true;
            }
            n0Var.f8793d = f0.f8693e;
        }
    }

    public final void d(int i10) {
        int i11 = this.f8801l;
        this.f8801l = i10;
        if ((i11 == 0) != (i10 == 0)) {
            j0 j0VarV = this.f8790a.v();
            n0 n0Var = j0VarV != null ? j0VarV.G : null;
            if (n0Var != null) {
                if (i10 == 0) {
                    n0Var.d(n0Var.f8801l - 1);
                } else {
                    n0Var.d(n0Var.f8801l + 1);
                }
            }
        }
    }

    public final void e(int i10) {
        int i11 = this.f8804o;
        this.f8804o = i10;
        if ((i11 == 0) != (i10 == 0)) {
            j0 j0VarV = this.f8790a.v();
            n0 n0Var = j0VarV != null ? j0VarV.G : null;
            if (n0Var != null) {
                if (i10 == 0) {
                    n0Var.e(n0Var.f8804o - 1);
                } else {
                    n0Var.e(n0Var.f8804o + 1);
                }
            }
        }
    }

    public final void f(boolean z10) {
        if (this.f8800k != z10) {
            this.f8800k = z10;
            if (z10 && !this.f8799j) {
                d(this.f8801l + 1);
            } else {
                if (z10 || this.f8799j) {
                    return;
                }
                d(this.f8801l - 1);
            }
        }
    }

    public final void g(boolean z10) {
        if (this.f8799j != z10) {
            this.f8799j = z10;
            if (z10 && !this.f8800k) {
                d(this.f8801l + 1);
            } else {
                if (z10 || this.f8800k) {
                    return;
                }
                d(this.f8801l - 1);
            }
        }
    }

    public final void h(boolean z10) {
        if (this.f8803n != z10) {
            this.f8803n = z10;
            if (z10 && !this.f8802m) {
                e(this.f8804o + 1);
            } else {
                if (z10 || this.f8802m) {
                    return;
                }
                e(this.f8804o - 1);
            }
        }
    }

    public final void i(boolean z10) {
        if (this.f8802m != z10) {
            this.f8802m = z10;
            if (z10 && !this.f8803n) {
                e(this.f8804o + 1);
            } else {
                if (z10 || this.f8803n) {
                    return;
                }
                e(this.f8804o - 1);
            }
        }
    }

    public final void j() {
        z0 z0Var = this.f8805p;
        n0 n0Var = z0Var.f8908f;
        Object obj = z0Var.f8921s;
        j0 j0Var = this.f8790a;
        if ((obj != null || n0Var.a().A() != null) && z0Var.f8920r) {
            z0Var.f8920r = false;
            z0Var.f8921s = n0Var.a().A();
            j0 j0VarV = j0Var.v();
            if (j0VarV != null) {
                j0.Y(j0VarV, false, 7);
            }
        }
        v0 v0Var = this.f8806q;
        if (v0Var != null) {
            n0 n0Var2 = v0Var.f8861f;
            if (v0Var.f8879x == null) {
                r0 r0VarK0 = n0Var2.a().K0();
                jc.l.b(r0VarK0);
                if (r0VarK0.f8831o.A() == null) {
                    return;
                }
            }
            if (v0Var.f8878w) {
                v0Var.f8878w = false;
                r0 r0VarK02 = n0Var2.a().K0();
                jc.l.b(r0VarK02);
                v0Var.f8879x = r0VarK02.f8831o.A();
                if (f.s(j0Var)) {
                    j0 j0VarV2 = j0Var.v();
                    if (j0VarV2 != null) {
                        j0.Y(j0VarV2, false, 7);
                        return;
                    }
                    return;
                }
                j0 j0VarV3 = j0Var.v();
                if (j0VarV3 != null) {
                    j0.W(j0VarV3, false, 7);
                }
            }
        }
    }
}
