package wd;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends ce.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m0 f23850h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f23851i = new a(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ce.e f23852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l0 f23856e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte f23857f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23858g;

    static {
        m0 m0Var = new m0();
        f23850h = m0Var;
        m0Var.f23854c = -1;
        m0Var.f23855d = 0;
        m0Var.f23856e = l0.f23840c;
    }

    public m0() {
        this.f23857f = (byte) -1;
        this.f23858g = -1;
        this.f23852a = ce.e.f3915a;
    }

    @Override // ce.x
    public final boolean b() {
        byte b10 = this.f23857f;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if ((this.f23853b & 2) == 2) {
            this.f23857f = (byte) 1;
            return true;
        }
        this.f23857f = (byte) 0;
        return false;
    }

    @Override // ce.b
    public final int c() {
        int i10 = this.f23858g;
        if (i10 != -1) {
            return i10;
        }
        int iE = (this.f23853b & 1) == 1 ? ce.g.e(1, this.f23854c) : 0;
        if ((this.f23853b & 2) == 2) {
            iE += ce.g.e(2, this.f23855d);
        }
        if ((this.f23853b & 4) == 4) {
            iE += ce.g.d(3, this.f23856e.f23843a);
        }
        int size = this.f23852a.size() + iE;
        this.f23858g = size;
        return size;
    }

    @Override // ce.b
    public final ce.k d() {
        return k0.g();
    }

    @Override // ce.b
    public final ce.k e() {
        k0 k0VarG = k0.g();
        k0VarG.h(this);
        return k0VarG;
    }

    @Override // ce.b
    public final void f(ce.g gVar) throws IOException {
        c();
        if ((this.f23853b & 1) == 1) {
            gVar.F(1, this.f23854c);
        }
        if ((this.f23853b & 2) == 2) {
            gVar.F(2, this.f23855d);
        }
        if ((this.f23853b & 4) == 4) {
            gVar.E(3, this.f23856e.f23843a);
        }
        gVar.K(this.f23852a);
    }

    public m0(ce.f fVar) {
        l0 l0Var;
        this.f23857f = (byte) -1;
        this.f23858g = -1;
        this.f23854c = -1;
        boolean z10 = false;
        this.f23855d = 0;
        l0 l0Var2 = l0.f23840c;
        this.f23856e = l0Var2;
        ce.d dVar = new ce.d();
        ce.g gVarU = ce.g.u(dVar, 1);
        while (!z10) {
            try {
                try {
                    int iN = fVar.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f23853b |= 1;
                            this.f23854c = fVar.k();
                        } else if (iN == 16) {
                            this.f23853b |= 2;
                            this.f23855d = fVar.k();
                        } else if (iN != 24) {
                            if (!fVar.q(iN, gVarU)) {
                            }
                        } else {
                            int iK = fVar.k();
                            if (iK == 0) {
                                l0Var = l0.f23839b;
                            } else if (iK != 1) {
                                l0Var = iK != 2 ? null : l0.f23841d;
                            } else {
                                l0Var = l0Var2;
                            }
                            if (l0Var == null) {
                                gVarU.O(iN);
                                gVarU.O(iK);
                            } else {
                                this.f23853b |= 4;
                                this.f23856e = l0Var;
                            }
                        }
                    }
                    z10 = true;
                } catch (ce.s e10) {
                    e10.f3972a = this;
                    throw e10;
                } catch (IOException e11) {
                    ce.s sVar = new ce.s(e11.getMessage());
                    sVar.f3972a = this;
                    throw sVar;
                }
            } catch (Throwable th2) {
                try {
                    gVarU.m();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f23852a = dVar.i();
                    throw th3;
                }
                this.f23852a = dVar.i();
                throw th2;
            }
        }
        try {
            gVarU.m();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f23852a = dVar.i();
            throw th4;
        }
        this.f23852a = dVar.i();
    }

    public m0(k0 k0Var) {
        this.f23857f = (byte) -1;
        this.f23858g = -1;
        this.f23852a = k0Var.f3948a;
    }
}
