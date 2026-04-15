package wd;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends ce.p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o0 f23879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f23880f = new a(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ce.e f23881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ce.u f23882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f23883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23884d;

    static {
        o0 o0Var = new o0();
        f23879e = o0Var;
        o0Var.f23882b = ce.t.f3984b;
    }

    public o0() {
        this.f23883c = (byte) -1;
        this.f23884d = -1;
        this.f23881a = ce.e.f3915a;
    }

    @Override // ce.x
    public final boolean b() {
        if (this.f23883c == 1) {
            return true;
        }
        this.f23883c = (byte) 1;
        return true;
    }

    @Override // ce.b
    public final int c() {
        int i10 = this.f23884d;
        if (i10 != -1) {
            return i10;
        }
        int size = 0;
        for (int i11 = 0; i11 < this.f23882b.size(); i11++) {
            ce.e eVarG = this.f23882b.g(i11);
            size += eVarG.size() + ce.g.i(eVarG.size());
        }
        int size2 = this.f23881a.size() + this.f23882b.size() + size;
        this.f23884d = size2;
        return size2;
    }

    @Override // ce.b
    public final ce.k d() {
        o oVar = new o(3);
        oVar.f23878d = ce.t.f3984b;
        return oVar;
    }

    @Override // ce.b
    public final ce.k e() {
        o oVar = new o(3);
        oVar.f23878d = ce.t.f3984b;
        oVar.l(this);
        return oVar;
    }

    @Override // ce.b
    public final void f(ce.g gVar) throws IOException {
        c();
        for (int i10 = 0; i10 < this.f23882b.size(); i10++) {
            ce.e eVarG = this.f23882b.g(i10);
            gVar.Q(1, 2);
            gVar.O(eVarG.size());
            gVar.K(eVarG);
        }
        gVar.K(this.f23881a);
    }

    public o0(ce.f fVar) {
        this.f23883c = (byte) -1;
        this.f23884d = -1;
        this.f23882b = ce.t.f3984b;
        ce.d dVar = new ce.d();
        ce.g gVarU = ce.g.u(dVar, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int iN = fVar.n();
                    if (iN != 0) {
                        if (iN != 10) {
                            if (!fVar.q(iN, gVarU)) {
                            }
                        } else {
                            ce.w wVarE = fVar.e();
                            if (!z11) {
                                this.f23882b = new ce.t();
                                z11 = true;
                            }
                            this.f23882b.c(wVarE);
                        }
                    }
                    z10 = true;
                } catch (Throwable th2) {
                    if (z11) {
                        this.f23882b = this.f23882b.h();
                    }
                    try {
                        gVarU.m();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f23881a = dVar.i();
                        throw th3;
                    }
                    this.f23881a = dVar.i();
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
        if (z11) {
            this.f23882b = this.f23882b.h();
        }
        try {
            gVarU.m();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f23881a = dVar.i();
            throw th4;
        }
        this.f23881a = dVar.i();
    }

    public o0(o oVar) {
        this.f23883c = (byte) -1;
        this.f23884d = -1;
        this.f23881a = oVar.f3948a;
    }
}
