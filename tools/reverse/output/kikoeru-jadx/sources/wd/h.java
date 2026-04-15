package wd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h extends ce.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h f23704g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f23705h = new a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ce.e f23706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f23709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f23710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23711f;

    static {
        h hVar = new h();
        f23704g = hVar;
        hVar.f23708c = 0;
        hVar.f23709d = Collections.EMPTY_LIST;
    }

    public h() {
        this.f23710e = (byte) -1;
        this.f23711f = -1;
        this.f23706a = ce.e.f3915a;
    }

    @Override // ce.x
    public final boolean b() {
        byte b10 = this.f23710e;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if ((this.f23707b & 1) != 1) {
            this.f23710e = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.f23709d.size(); i10++) {
            if (!((f) this.f23709d.get(i10)).b()) {
                this.f23710e = (byte) 0;
                return false;
            }
        }
        this.f23710e = (byte) 1;
        return true;
    }

    @Override // ce.b
    public final int c() {
        int i10 = this.f23711f;
        if (i10 != -1) {
            return i10;
        }
        int iE = (this.f23707b & 1) == 1 ? ce.g.e(1, this.f23708c) : 0;
        for (int i11 = 0; i11 < this.f23709d.size(); i11++) {
            iE += ce.g.g(2, (ce.b) this.f23709d.get(i11));
        }
        int size = this.f23706a.size() + iE;
        this.f23711f = size;
        return size;
    }

    @Override // ce.b
    public final ce.k d() {
        g gVar = new g(0);
        gVar.f23691d = Collections.EMPTY_LIST;
        return gVar;
    }

    @Override // ce.b
    public final ce.k e() {
        g gVar = new g(0);
        gVar.f23691d = Collections.EMPTY_LIST;
        gVar.i(this);
        return gVar;
    }

    @Override // ce.b
    public final void f(ce.g gVar) throws IOException {
        c();
        if ((this.f23707b & 1) == 1) {
            gVar.F(1, this.f23708c);
        }
        for (int i10 = 0; i10 < this.f23709d.size(); i10++) {
            gVar.H(2, (ce.b) this.f23709d.get(i10));
        }
        gVar.K(this.f23706a);
    }

    public h(ce.f fVar, ce.i iVar) {
        this.f23710e = (byte) -1;
        this.f23711f = -1;
        boolean z10 = false;
        this.f23708c = 0;
        this.f23709d = Collections.EMPTY_LIST;
        ce.d dVar = new ce.d();
        ce.g gVarU = ce.g.u(dVar, 1);
        char c3 = 0;
        while (!z10) {
            try {
                try {
                    int iN = fVar.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f23707b |= 1;
                            this.f23708c = fVar.k();
                        } else if (iN != 18) {
                            if (!fVar.q(iN, gVarU)) {
                            }
                        } else {
                            if ((c3 & 2) != 2) {
                                this.f23709d = new ArrayList();
                                c3 = 2;
                            }
                            this.f23709d.add(fVar.g(f.f23659h, iVar));
                        }
                    }
                    z10 = true;
                } catch (Throwable th2) {
                    if ((c3 & 2) == 2) {
                        this.f23709d = Collections.unmodifiableList(this.f23709d);
                    }
                    try {
                        gVarU.m();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f23706a = dVar.i();
                        throw th3;
                    }
                    this.f23706a = dVar.i();
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
        if ((c3 & 2) == 2) {
            this.f23709d = Collections.unmodifiableList(this.f23709d);
        }
        try {
            gVarU.m();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f23706a = dVar.i();
            throw th4;
        }
        this.f23706a = dVar.i();
    }

    public h(g gVar) {
        this.f23710e = (byte) -1;
        this.f23711f = -1;
        this.f23706a = gVar.f3948a;
    }
}
