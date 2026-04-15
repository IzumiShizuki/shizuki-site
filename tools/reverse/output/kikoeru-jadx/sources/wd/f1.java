package wd;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends ce.p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final f1 f23677k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f23678l = new a(23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ce.e f23679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d1 f23683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23684f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23685g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e1 f23686h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte f23687i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f23688j;

    static {
        f1 f1Var = new f1();
        f23677k = f1Var;
        f1Var.f23681c = 0;
        f1Var.f23682d = 0;
        f1Var.f23683e = d1.f23626c;
        f1Var.f23684f = 0;
        f1Var.f23685g = 0;
        f1Var.f23686h = e1.f23653b;
    }

    public f1() {
        this.f23687i = (byte) -1;
        this.f23688j = -1;
        this.f23679a = ce.e.f3915a;
    }

    @Override // ce.x
    public final boolean b() {
        if (this.f23687i == 1) {
            return true;
        }
        this.f23687i = (byte) 1;
        return true;
    }

    @Override // ce.b
    public final int c() {
        int i10 = this.f23688j;
        if (i10 != -1) {
            return i10;
        }
        int iE = (this.f23680b & 1) == 1 ? ce.g.e(1, this.f23681c) : 0;
        if ((this.f23680b & 2) == 2) {
            iE += ce.g.e(2, this.f23682d);
        }
        if ((this.f23680b & 4) == 4) {
            iE += ce.g.d(3, this.f23683e.f23629a);
        }
        if ((this.f23680b & 8) == 8) {
            iE += ce.g.e(4, this.f23684f);
        }
        if ((this.f23680b & 16) == 16) {
            iE += ce.g.e(5, this.f23685g);
        }
        if ((this.f23680b & 32) == 32) {
            iE += ce.g.d(6, this.f23686h.f23657a);
        }
        int size = this.f23679a.size() + iE;
        this.f23688j = size;
        return size;
    }

    @Override // ce.b
    public final ce.k d() {
        return c1.g();
    }

    @Override // ce.b
    public final ce.k e() {
        c1 c1VarG = c1.g();
        c1VarG.h(this);
        return c1VarG;
    }

    @Override // ce.b
    public final void f(ce.g gVar) throws IOException {
        c();
        if ((this.f23680b & 1) == 1) {
            gVar.F(1, this.f23681c);
        }
        if ((this.f23680b & 2) == 2) {
            gVar.F(2, this.f23682d);
        }
        if ((this.f23680b & 4) == 4) {
            gVar.E(3, this.f23683e.f23629a);
        }
        if ((this.f23680b & 8) == 8) {
            gVar.F(4, this.f23684f);
        }
        if ((this.f23680b & 16) == 16) {
            gVar.F(5, this.f23685g);
        }
        if ((this.f23680b & 32) == 32) {
            gVar.E(6, this.f23686h.f23657a);
        }
        gVar.K(this.f23679a);
    }

    public f1(ce.f fVar) {
        this.f23687i = (byte) -1;
        this.f23688j = -1;
        boolean z10 = false;
        this.f23681c = 0;
        this.f23682d = 0;
        d1 d1Var = d1.f23626c;
        this.f23683e = d1Var;
        this.f23684f = 0;
        this.f23685g = 0;
        e1 e1Var = e1.f23653b;
        this.f23686h = e1Var;
        ce.d dVar = new ce.d();
        ce.g gVarU = ce.g.u(dVar, 1);
        while (!z10) {
            try {
                try {
                    int iN = fVar.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f23680b |= 1;
                            this.f23681c = fVar.k();
                        } else if (iN != 16) {
                            e1 e1Var2 = null;
                            d1 d1Var2 = null;
                            if (iN == 24) {
                                int iK = fVar.k();
                                if (iK == 0) {
                                    d1Var2 = d1.f23625b;
                                } else if (iK == 1) {
                                    d1Var2 = d1Var;
                                } else if (iK == 2) {
                                    d1Var2 = d1.f23627d;
                                }
                                if (d1Var2 == null) {
                                    gVarU.O(iN);
                                    gVarU.O(iK);
                                } else {
                                    this.f23680b |= 4;
                                    this.f23683e = d1Var2;
                                }
                            } else if (iN == 32) {
                                this.f23680b |= 8;
                                this.f23684f = fVar.k();
                            } else if (iN == 40) {
                                this.f23680b |= 16;
                                this.f23685g = fVar.k();
                            } else if (iN != 48) {
                                if (!fVar.q(iN, gVarU)) {
                                }
                            } else {
                                int iK2 = fVar.k();
                                if (iK2 == 0) {
                                    e1Var2 = e1Var;
                                } else if (iK2 == 1) {
                                    e1Var2 = e1.f23654c;
                                } else if (iK2 == 2) {
                                    e1Var2 = e1.f23655d;
                                }
                                if (e1Var2 == null) {
                                    gVarU.O(iN);
                                    gVarU.O(iK2);
                                } else {
                                    this.f23680b |= 32;
                                    this.f23686h = e1Var2;
                                }
                            }
                        } else {
                            this.f23680b |= 2;
                            this.f23682d = fVar.k();
                        }
                    }
                    z10 = true;
                } catch (Throwable th2) {
                    try {
                        gVarU.m();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f23679a = dVar.i();
                        throw th3;
                    }
                    this.f23679a = dVar.i();
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
            this.f23679a = dVar.i();
            throw th4;
        }
        this.f23679a = dVar.i();
    }

    public f1(c1 c1Var) {
        this.f23687i = (byte) -1;
        this.f23688j = -1;
        this.f23679a = c1Var.f3948a;
    }
}
