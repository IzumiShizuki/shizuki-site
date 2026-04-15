package wd;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends ce.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final r0 f23913h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f23914i = new a(18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ce.e f23915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q0 f23917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t0 f23918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte f23920f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23921g;

    static {
        r0 r0Var = new r0();
        f23913h = r0Var;
        r0Var.f23917c = q0.f23904d;
        r0Var.f23918d = t0.f23947t;
        r0Var.f23919e = 0;
    }

    public r0() {
        this.f23920f = (byte) -1;
        this.f23921g = -1;
        this.f23915a = ce.e.f3915a;
    }

    @Override // ce.x
    public final boolean b() {
        byte b10 = this.f23920f;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if ((this.f23916b & 2) != 2 || this.f23918d.b()) {
            this.f23920f = (byte) 1;
            return true;
        }
        this.f23920f = (byte) 0;
        return false;
    }

    @Override // ce.b
    public final int c() {
        int i10 = this.f23921g;
        if (i10 != -1) {
            return i10;
        }
        int iD = (this.f23916b & 1) == 1 ? ce.g.d(1, this.f23917c.f23907a) : 0;
        if ((this.f23916b & 2) == 2) {
            iD += ce.g.g(2, this.f23918d);
        }
        if ((this.f23916b & 4) == 4) {
            iD += ce.g.e(3, this.f23919e);
        }
        int size = this.f23915a.size() + iD;
        this.f23921g = size;
        return size;
    }

    @Override // ce.b
    public final ce.k d() {
        return p0.g();
    }

    @Override // ce.b
    public final ce.k e() {
        p0 p0VarG = p0.g();
        p0VarG.h(this);
        return p0VarG;
    }

    @Override // ce.b
    public final void f(ce.g gVar) throws IOException {
        c();
        if ((this.f23916b & 1) == 1) {
            gVar.E(1, this.f23917c.f23907a);
        }
        if ((this.f23916b & 2) == 2) {
            gVar.H(2, this.f23918d);
        }
        if ((this.f23916b & 4) == 4) {
            gVar.F(3, this.f23919e);
        }
        gVar.K(this.f23915a);
    }

    public r0(ce.f fVar, ce.i iVar) {
        this.f23920f = (byte) -1;
        this.f23921g = -1;
        q0 q0Var = q0.f23904d;
        this.f23917c = q0Var;
        this.f23918d = t0.f23947t;
        boolean z10 = false;
        this.f23919e = 0;
        ce.d dVar = new ce.d();
        ce.g gVarU = ce.g.u(dVar, 1);
        while (!z10) {
            try {
                try {
                    int iN = fVar.n();
                    if (iN != 0) {
                        s0 s0VarR = null;
                        q0 q0Var2 = null;
                        if (iN == 8) {
                            int iK = fVar.k();
                            if (iK == 0) {
                                q0Var2 = q0.f23902b;
                            } else if (iK == 1) {
                                q0Var2 = q0.f23903c;
                            } else if (iK == 2) {
                                q0Var2 = q0Var;
                            } else if (iK == 3) {
                                q0Var2 = q0.f23905e;
                            }
                            if (q0Var2 == null) {
                                gVarU.O(iN);
                                gVarU.O(iK);
                            } else {
                                this.f23916b |= 1;
                                this.f23917c = q0Var2;
                            }
                        } else if (iN == 18) {
                            if ((this.f23916b & 2) == 2) {
                                t0 t0Var = this.f23918d;
                                t0Var.getClass();
                                s0VarR = t0.r(t0Var);
                            }
                            t0 t0Var2 = (t0) fVar.g(t0.f23948u, iVar);
                            this.f23918d = t0Var2;
                            if (s0VarR != null) {
                                s0VarR.i(t0Var2);
                                this.f23918d = s0VarR.g();
                            }
                            this.f23916b |= 2;
                        } else if (iN != 24) {
                            if (!fVar.q(iN, gVarU)) {
                            }
                        } else {
                            this.f23916b |= 4;
                            this.f23919e = fVar.k();
                        }
                    }
                    z10 = true;
                } catch (Throwable th2) {
                    try {
                        gVarU.m();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f23915a = dVar.i();
                        throw th3;
                    }
                    this.f23915a = dVar.i();
                    throw th2;
                }
            } catch (ce.s e10) {
                e10.f3972a = this;
                throw e10;
            } catch (IOException e11) {
                ce.s sVar = new ce.s(e11.getMessage());
                sVar.f3972a = this;
                throw sVar;
            }
        }
        try {
            gVarU.m();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f23915a = dVar.i();
            throw th4;
        }
        this.f23915a = dVar.i();
    }

    public r0(p0 p0Var) {
        this.f23920f = (byte) -1;
        this.f23921g = -1;
        this.f23915a = p0Var.f3948a;
    }
}
