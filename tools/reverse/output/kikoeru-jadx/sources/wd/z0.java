package wd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends ce.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final z0 f24067g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f24068h = new a(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ce.e f24069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f24071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f24073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24074f;

    static {
        z0 z0Var = new z0();
        f24067g = z0Var;
        z0Var.f24071c = Collections.EMPTY_LIST;
        z0Var.f24072d = -1;
    }

    public z0() {
        this.f24073e = (byte) -1;
        this.f24074f = -1;
        this.f24069a = ce.e.f3915a;
    }

    public static g i(z0 z0Var) {
        g gVarH = g.h();
        gVarH.j(z0Var);
        return gVarH;
    }

    @Override // ce.x
    public final boolean b() {
        byte b10 = this.f24073e;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.f24071c.size(); i10++) {
            if (!((t0) this.f24071c.get(i10)).b()) {
                this.f24073e = (byte) 0;
                return false;
            }
        }
        this.f24073e = (byte) 1;
        return true;
    }

    @Override // ce.b
    public final int c() {
        int i10 = this.f24074f;
        if (i10 != -1) {
            return i10;
        }
        int iE = 0;
        for (int i11 = 0; i11 < this.f24071c.size(); i11++) {
            iE += ce.g.g(1, (ce.b) this.f24071c.get(i11));
        }
        if ((this.f24070b & 1) == 1) {
            iE += ce.g.e(2, this.f24072d);
        }
        int size = this.f24069a.size() + iE;
        this.f24074f = size;
        return size;
    }

    @Override // ce.b
    public final ce.k d() {
        return g.h();
    }

    @Override // ce.b
    public final ce.k e() {
        return i(this);
    }

    @Override // ce.b
    public final void f(ce.g gVar) throws IOException {
        c();
        for (int i10 = 0; i10 < this.f24071c.size(); i10++) {
            gVar.H(1, (ce.b) this.f24071c.get(i10));
        }
        if ((this.f24070b & 1) == 1) {
            gVar.F(2, this.f24072d);
        }
        gVar.K(this.f24069a);
    }

    public z0(ce.f fVar, ce.i iVar) {
        this.f24073e = (byte) -1;
        this.f24074f = -1;
        this.f24071c = Collections.EMPTY_LIST;
        this.f24072d = -1;
        ce.d dVar = new ce.d();
        ce.g gVarU = ce.g.u(dVar, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int iN = fVar.n();
                    if (iN != 0) {
                        if (iN == 10) {
                            if (!z11) {
                                this.f24071c = new ArrayList();
                                z11 = true;
                            }
                            this.f24071c.add(fVar.g(t0.f23948u, iVar));
                        } else if (iN != 16) {
                            if (!fVar.q(iN, gVarU)) {
                            }
                        } else {
                            this.f24070b |= 1;
                            this.f24072d = fVar.k();
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
                if (z11) {
                    this.f24071c = Collections.unmodifiableList(this.f24071c);
                }
                try {
                    gVarU.m();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f24069a = dVar.i();
                    throw th3;
                }
                this.f24069a = dVar.i();
                throw th2;
            }
        }
        if (z11) {
            this.f24071c = Collections.unmodifiableList(this.f24071c);
        }
        try {
            gVarU.m();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f24069a = dVar.i();
            throw th4;
        }
        this.f24069a = dVar.i();
    }

    public z0(g gVar) {
        this.f24073e = (byte) -1;
        this.f24074f = -1;
        this.f24069a = gVar.f3948a;
    }
}
