package wd;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l extends ce.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l f23831g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f23832h = new a(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ce.e f23833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ce.w f23836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f23837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23838f;

    static {
        l lVar = new l();
        f23831g = lVar;
        lVar.f23835c = 0;
        lVar.f23836d = ce.e.f3915a;
    }

    public l() {
        this.f23837e = (byte) -1;
        this.f23838f = -1;
        this.f23833a = ce.e.f3915a;
    }

    @Override // ce.x
    public final boolean b() {
        byte b10 = this.f23837e;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        int i10 = this.f23834b;
        if ((i10 & 1) != 1) {
            this.f23837e = (byte) 0;
            return false;
        }
        if ((i10 & 2) == 2) {
            this.f23837e = (byte) 1;
            return true;
        }
        this.f23837e = (byte) 0;
        return false;
    }

    @Override // ce.b
    public final int c() {
        int i10 = this.f23838f;
        if (i10 != -1) {
            return i10;
        }
        int iE = (this.f23834b & 1) == 1 ? ce.g.e(1, this.f23835c) : 0;
        if ((this.f23834b & 2) == 2) {
            ce.w wVar = this.f23836d;
            iE += wVar.size() + ce.g.i(wVar.size()) + ce.g.k(2);
        }
        int size = this.f23833a.size() + iE;
        this.f23838f = size;
        return size;
    }

    @Override // ce.b
    public final ce.k d() {
        b bVar = new b(1);
        bVar.f23547e = ce.e.f3915a;
        return bVar;
    }

    @Override // ce.b
    public final ce.k e() {
        b bVar = new b(1);
        bVar.f23547e = ce.e.f3915a;
        bVar.i(this);
        return bVar;
    }

    @Override // ce.b
    public final void f(ce.g gVar) throws IOException {
        c();
        if ((this.f23834b & 1) == 1) {
            gVar.F(1, this.f23835c);
        }
        if ((this.f23834b & 2) == 2) {
            ce.w wVar = this.f23836d;
            gVar.Q(2, 2);
            gVar.O(wVar.size());
            gVar.K(wVar);
        }
        gVar.K(this.f23833a);
    }

    public l(ce.f fVar) {
        this.f23837e = (byte) -1;
        this.f23838f = -1;
        boolean z10 = false;
        this.f23835c = 0;
        this.f23836d = ce.e.f3915a;
        ce.d dVar = new ce.d();
        ce.g gVarU = ce.g.u(dVar, 1);
        while (!z10) {
            try {
                try {
                    int iN = fVar.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f23834b |= 1;
                            this.f23835c = fVar.k();
                        } else if (iN != 18) {
                            if (!fVar.q(iN, gVarU)) {
                            }
                        } else {
                            this.f23834b |= 2;
                            this.f23836d = fVar.e();
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
                    this.f23833a = dVar.i();
                    throw th3;
                }
                this.f23833a = dVar.i();
                throw th2;
            }
        }
        try {
            gVarU.m();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f23833a = dVar.i();
            throw th4;
        }
        this.f23833a = dVar.i();
    }

    public l(b bVar) {
        this.f23837e = (byte) -1;
        this.f23838f = -1;
        this.f23833a = bVar.f3948a;
    }
}
