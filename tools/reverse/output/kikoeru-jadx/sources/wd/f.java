package wd;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f extends ce.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f f23658g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f23659h = new a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ce.e f23660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f23663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f23664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23665f;

    static {
        f fVar = new f();
        f23658g = fVar;
        fVar.f23662c = 0;
        fVar.f23663d = e.f23630p;
    }

    public f() {
        this.f23664e = (byte) -1;
        this.f23665f = -1;
        this.f23660a = ce.e.f3915a;
    }

    @Override // ce.x
    public final boolean b() {
        byte b10 = this.f23664e;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        int i10 = this.f23661b;
        if ((i10 & 1) != 1) {
            this.f23664e = (byte) 0;
            return false;
        }
        if ((i10 & 2) != 2) {
            this.f23664e = (byte) 0;
            return false;
        }
        if (this.f23663d.b()) {
            this.f23664e = (byte) 1;
            return true;
        }
        this.f23664e = (byte) 0;
        return false;
    }

    @Override // ce.b
    public final int c() {
        int i10 = this.f23665f;
        if (i10 != -1) {
            return i10;
        }
        int iE = (this.f23661b & 1) == 1 ? ce.g.e(1, this.f23662c) : 0;
        if ((this.f23661b & 2) == 2) {
            iE += ce.g.g(2, this.f23663d);
        }
        int size = this.f23660a.size() + iE;
        this.f23665f = size;
        return size;
    }

    @Override // ce.b
    public final ce.k d() {
        b bVar = new b(0);
        bVar.f23547e = e.f23630p;
        return bVar;
    }

    @Override // ce.b
    public final ce.k e() {
        b bVar = new b(0);
        bVar.f23547e = e.f23630p;
        bVar.h(this);
        return bVar;
    }

    @Override // ce.b
    public final void f(ce.g gVar) throws IOException {
        c();
        if ((this.f23661b & 1) == 1) {
            gVar.F(1, this.f23662c);
        }
        if ((this.f23661b & 2) == 2) {
            gVar.H(2, this.f23663d);
        }
        gVar.K(this.f23660a);
    }

    public f(ce.f fVar, ce.i iVar) {
        c cVarJ;
        this.f23664e = (byte) -1;
        this.f23665f = -1;
        boolean z10 = false;
        this.f23662c = 0;
        this.f23663d = e.f23630p;
        ce.d dVar = new ce.d();
        ce.g gVarU = ce.g.u(dVar, 1);
        while (!z10) {
            try {
                try {
                    int iN = fVar.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f23661b |= 1;
                            this.f23662c = fVar.k();
                        } else if (iN != 18) {
                            if (!fVar.q(iN, gVarU)) {
                            }
                        } else {
                            if ((this.f23661b & 2) == 2) {
                                e eVar = this.f23663d;
                                eVar.getClass();
                                cVarJ = e.j(eVar);
                            } else {
                                cVarJ = null;
                            }
                            e eVar2 = (e) fVar.g(e.f23631q, iVar);
                            this.f23663d = eVar2;
                            if (cVarJ != null) {
                                cVarJ.h(eVar2);
                                this.f23663d = cVarJ.f();
                            }
                            this.f23661b |= 2;
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
                    this.f23660a = dVar.i();
                    throw th3;
                }
                this.f23660a = dVar.i();
                throw th2;
            }
        }
        try {
            gVarU.m();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f23660a = dVar.i();
            throw th4;
        }
        this.f23660a = dVar.i();
    }

    public f(b bVar) {
        this.f23664e = (byte) -1;
        this.f23665f = -1;
        this.f23660a = bVar.f3948a;
    }
}
