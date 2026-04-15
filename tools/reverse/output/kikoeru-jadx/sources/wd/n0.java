package wd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends ce.p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n0 f23870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f23871f = new a(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ce.e f23872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f23873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f23874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23875d;

    static {
        n0 n0Var = new n0();
        f23870e = n0Var;
        n0Var.f23873b = Collections.EMPTY_LIST;
    }

    public n0() {
        this.f23874c = (byte) -1;
        this.f23875d = -1;
        this.f23872a = ce.e.f3915a;
    }

    @Override // ce.x
    public final boolean b() {
        byte b10 = this.f23874c;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.f23873b.size(); i10++) {
            if (!((m0) this.f23873b.get(i10)).b()) {
                this.f23874c = (byte) 0;
                return false;
            }
        }
        this.f23874c = (byte) 1;
        return true;
    }

    @Override // ce.b
    public final int c() {
        int i10 = this.f23875d;
        if (i10 != -1) {
            return i10;
        }
        int iG = 0;
        for (int i11 = 0; i11 < this.f23873b.size(); i11++) {
            iG += ce.g.g(1, (ce.b) this.f23873b.get(i11));
        }
        int size = this.f23872a.size() + iG;
        this.f23875d = size;
        return size;
    }

    @Override // ce.b
    public final ce.k d() {
        o oVar = new o(1);
        oVar.f23878d = Collections.EMPTY_LIST;
        return oVar;
    }

    @Override // ce.b
    public final ce.k e() {
        o oVar = new o(1);
        oVar.f23878d = Collections.EMPTY_LIST;
        oVar.k(this);
        return oVar;
    }

    @Override // ce.b
    public final void f(ce.g gVar) throws IOException {
        c();
        for (int i10 = 0; i10 < this.f23873b.size(); i10++) {
            gVar.H(1, (ce.b) this.f23873b.get(i10));
        }
        gVar.K(this.f23872a);
    }

    public n0(ce.f fVar, ce.i iVar) {
        this.f23874c = (byte) -1;
        this.f23875d = -1;
        this.f23873b = Collections.EMPTY_LIST;
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
                            if (!z11) {
                                this.f23873b = new ArrayList();
                                z11 = true;
                            }
                            this.f23873b.add(fVar.g(m0.f23851i, iVar));
                        }
                    }
                    z10 = true;
                } catch (Throwable th2) {
                    if (z11) {
                        this.f23873b = Collections.unmodifiableList(this.f23873b);
                    }
                    try {
                        gVarU.m();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f23872a = dVar.i();
                        throw th3;
                    }
                    this.f23872a = dVar.i();
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
            this.f23873b = Collections.unmodifiableList(this.f23873b);
        }
        try {
            gVarU.m();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f23872a = dVar.i();
            throw th4;
        }
        this.f23872a = dVar.i();
    }

    public n0(o oVar) {
        this.f23874c = (byte) -1;
        this.f23875d = -1;
        this.f23872a = oVar.f3948a;
    }
}
