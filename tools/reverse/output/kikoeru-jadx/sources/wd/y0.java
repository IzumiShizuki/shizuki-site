package wd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends ce.m {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final y0 f24041m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f24042n = new a(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ce.e f24043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f24047f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public x0 f24048g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f24049h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f24050i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f24051j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte f24052k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f24053l;

    static {
        y0 y0Var = new y0();
        f24041m = y0Var;
        y0Var.f24045d = 0;
        y0Var.f24046e = 0;
        y0Var.f24047f = false;
        y0Var.f24048g = x0.f24033d;
        List list = Collections.EMPTY_LIST;
        y0Var.f24049h = list;
        y0Var.f24050i = list;
    }

    public y0(w0 w0Var) {
        super(w0Var);
        this.f24051j = -1;
        this.f24052k = (byte) -1;
        this.f24053l = -1;
        this.f24043b = w0Var.f3948a;
    }

    @Override // ce.x
    public final ce.b a() {
        return f24041m;
    }

    @Override // ce.x
    public final boolean b() {
        byte b10 = this.f24052k;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        int i10 = this.f24044c;
        if ((i10 & 1) != 1) {
            this.f24052k = (byte) 0;
            return false;
        }
        if ((i10 & 2) != 2) {
            this.f24052k = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < this.f24049h.size(); i11++) {
            if (!((t0) this.f24049h.get(i11)).b()) {
                this.f24052k = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.f24052k = (byte) 1;
            return true;
        }
        this.f24052k = (byte) 0;
        return false;
    }

    @Override // ce.b
    public final int c() {
        int i10 = this.f24053l;
        if (i10 != -1) {
            return i10;
        }
        int iE = (this.f24044c & 1) == 1 ? ce.g.e(1, this.f24045d) : 0;
        if ((this.f24044c & 2) == 2) {
            iE += ce.g.e(2, this.f24046e);
        }
        if ((this.f24044c & 4) == 4) {
            iE += ce.g.k(3) + 1;
        }
        if ((this.f24044c & 8) == 8) {
            iE += ce.g.d(4, this.f24048g.f24035a);
        }
        for (int i11 = 0; i11 < this.f24049h.size(); i11++) {
            iE += ce.g.g(5, (ce.b) this.f24049h.get(i11));
        }
        int iF = 0;
        for (int i12 = 0; i12 < this.f24050i.size(); i12++) {
            iF += ce.g.f(((Integer) this.f24050i.get(i12)).intValue());
        }
        int iF2 = iE + iF;
        if (!this.f24050i.isEmpty()) {
            iF2 = iF2 + 1 + ce.g.f(iF);
        }
        this.f24051j = iF;
        int size = this.f24043b.size() + j() + iF2;
        this.f24053l = size;
        return size;
    }

    @Override // ce.b
    public final ce.k d() {
        return w0.h();
    }

    @Override // ce.b
    public final ce.k e() {
        w0 w0VarH = w0.h();
        w0VarH.i(this);
        return w0VarH;
    }

    @Override // ce.b
    public final void f(ce.g gVar) throws IOException {
        c();
        androidx.media3.exoplayer.offline.u uVar = new androidx.media3.exoplayer.offline.u(this);
        if ((this.f24044c & 1) == 1) {
            gVar.F(1, this.f24045d);
        }
        if ((this.f24044c & 2) == 2) {
            gVar.F(2, this.f24046e);
        }
        if ((this.f24044c & 4) == 4) {
            boolean z10 = this.f24047f;
            gVar.Q(3, 0);
            gVar.J(z10 ? 1 : 0);
        }
        if ((this.f24044c & 8) == 8) {
            gVar.E(4, this.f24048g.f24035a);
        }
        for (int i10 = 0; i10 < this.f24049h.size(); i10++) {
            gVar.H(5, (ce.b) this.f24049h.get(i10));
        }
        if (this.f24050i.size() > 0) {
            gVar.O(50);
            gVar.O(this.f24051j);
        }
        for (int i11 = 0; i11 < this.f24050i.size(); i11++) {
            gVar.G(((Integer) this.f24050i.get(i11)).intValue());
        }
        uVar.e1(1000, gVar);
        gVar.K(this.f24043b);
    }

    public y0() {
        this.f24051j = -1;
        this.f24052k = (byte) -1;
        this.f24053l = -1;
        this.f24043b = ce.e.f3915a;
    }

    public y0(ce.f fVar, ce.i iVar) {
        x0 x0Var;
        this.f24051j = -1;
        this.f24052k = (byte) -1;
        this.f24053l = -1;
        this.f24045d = 0;
        this.f24046e = 0;
        this.f24047f = false;
        x0 x0Var2 = x0.f24033d;
        this.f24048g = x0Var2;
        List list = Collections.EMPTY_LIST;
        this.f24049h = list;
        this.f24050i = list;
        ce.d dVar = new ce.d();
        ce.g gVarU = ce.g.u(dVar, 1);
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    int iN = fVar.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f24044c |= 1;
                            this.f24045d = fVar.k();
                        } else if (iN == 16) {
                            this.f24044c |= 2;
                            this.f24046e = fVar.k();
                        } else if (iN == 24) {
                            this.f24044c |= 4;
                            this.f24047f = fVar.l() != 0;
                        } else if (iN == 32) {
                            int iK = fVar.k();
                            if (iK == 0) {
                                x0Var = x0.f24031b;
                            } else if (iK != 1) {
                                x0Var = iK != 2 ? null : x0Var2;
                            } else {
                                x0Var = x0.f24032c;
                            }
                            if (x0Var == null) {
                                gVarU.O(iN);
                                gVarU.O(iK);
                            } else {
                                this.f24044c |= 8;
                                this.f24048g = x0Var;
                            }
                        } else if (iN == 42) {
                            if ((i10 & 16) != 16) {
                                this.f24049h = new ArrayList();
                                i10 |= 16;
                            }
                            this.f24049h.add(fVar.g(t0.f23948u, iVar));
                        } else if (iN == 48) {
                            if ((i10 & 32) != 32) {
                                this.f24050i = new ArrayList();
                                i10 |= 32;
                            }
                            this.f24050i.add(Integer.valueOf(fVar.k()));
                        } else if (iN != 50) {
                            if (!n(fVar, gVarU, iVar, iN)) {
                            }
                        } else {
                            int iD = fVar.d(fVar.k());
                            if ((i10 & 32) != 32 && fVar.b() > 0) {
                                this.f24050i = new ArrayList();
                                i10 |= 32;
                            }
                            while (fVar.b() > 0) {
                                this.f24050i.add(Integer.valueOf(fVar.k()));
                            }
                            fVar.c(iD);
                        }
                    }
                    z10 = true;
                } catch (Throwable th2) {
                    if ((i10 & 16) == 16) {
                        this.f24049h = Collections.unmodifiableList(this.f24049h);
                    }
                    if ((i10 & 32) == 32) {
                        this.f24050i = Collections.unmodifiableList(this.f24050i);
                    }
                    try {
                        gVarU.m();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f24043b = dVar.i();
                        throw th3;
                    }
                    this.f24043b = dVar.i();
                    m();
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
        if ((i10 & 16) == 16) {
            this.f24049h = Collections.unmodifiableList(this.f24049h);
        }
        if ((i10 & 32) == 32) {
            this.f24050i = Collections.unmodifiableList(this.f24050i);
        }
        try {
            gVarU.m();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f24043b = dVar.i();
            throw th4;
        }
        this.f24043b = dVar.i();
        m();
    }
}
