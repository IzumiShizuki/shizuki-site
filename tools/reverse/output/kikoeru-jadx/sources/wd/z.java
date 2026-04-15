package wd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z extends ce.p {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final z f24054l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f24055m = new a(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ce.e f24056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y f24060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t0 f24061f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24062g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f24063h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f24064i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte f24065j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f24066k;

    static {
        z zVar = new z();
        f24054l = zVar;
        zVar.f24058c = 0;
        zVar.f24059d = 0;
        zVar.f24060e = y.f24036b;
        zVar.f24061f = t0.f23947t;
        zVar.f24062g = 0;
        List list = Collections.EMPTY_LIST;
        zVar.f24063h = list;
        zVar.f24064i = list;
    }

    public z() {
        this.f24065j = (byte) -1;
        this.f24066k = -1;
        this.f24056a = ce.e.f3915a;
    }

    @Override // ce.x
    public final boolean b() {
        byte b10 = this.f24065j;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if ((this.f24057b & 8) == 8 && !this.f24061f.b()) {
            this.f24065j = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.f24063h.size(); i10++) {
            if (!((z) this.f24063h.get(i10)).b()) {
                this.f24065j = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < this.f24064i.size(); i11++) {
            if (!((z) this.f24064i.get(i11)).b()) {
                this.f24065j = (byte) 0;
                return false;
            }
        }
        this.f24065j = (byte) 1;
        return true;
    }

    @Override // ce.b
    public final int c() {
        int i10 = this.f24066k;
        if (i10 != -1) {
            return i10;
        }
        int iE = (this.f24057b & 1) == 1 ? ce.g.e(1, this.f24058c) : 0;
        if ((this.f24057b & 2) == 2) {
            iE += ce.g.e(2, this.f24059d);
        }
        if ((this.f24057b & 4) == 4) {
            iE += ce.g.d(3, this.f24060e.f24040a);
        }
        if ((this.f24057b & 8) == 8) {
            iE += ce.g.g(4, this.f24061f);
        }
        if ((this.f24057b & 16) == 16) {
            iE += ce.g.e(5, this.f24062g);
        }
        for (int i11 = 0; i11 < this.f24063h.size(); i11++) {
            iE += ce.g.g(6, (ce.b) this.f24063h.get(i11));
        }
        for (int i12 = 0; i12 < this.f24064i.size(); i12++) {
            iE += ce.g.g(7, (ce.b) this.f24064i.get(i12));
        }
        int size = this.f24056a.size() + iE;
        this.f24066k = size;
        return size;
    }

    @Override // ce.b
    public final ce.k d() {
        return x.g();
    }

    @Override // ce.b
    public final ce.k e() {
        x xVarG = x.g();
        xVarG.h(this);
        return xVarG;
    }

    @Override // ce.b
    public final void f(ce.g gVar) throws IOException {
        c();
        if ((this.f24057b & 1) == 1) {
            gVar.F(1, this.f24058c);
        }
        if ((this.f24057b & 2) == 2) {
            gVar.F(2, this.f24059d);
        }
        if ((this.f24057b & 4) == 4) {
            gVar.E(3, this.f24060e.f24040a);
        }
        if ((this.f24057b & 8) == 8) {
            gVar.H(4, this.f24061f);
        }
        if ((this.f24057b & 16) == 16) {
            gVar.F(5, this.f24062g);
        }
        for (int i10 = 0; i10 < this.f24063h.size(); i10++) {
            gVar.H(6, (ce.b) this.f24063h.get(i10));
        }
        for (int i11 = 0; i11 < this.f24064i.size(); i11++) {
            gVar.H(7, (ce.b) this.f24064i.get(i11));
        }
        gVar.K(this.f24056a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z(ce.f fVar, ce.i iVar) {
        y yVar;
        this.f24065j = (byte) -1;
        this.f24066k = -1;
        boolean z10 = false;
        this.f24058c = 0;
        this.f24059d = 0;
        y yVar2 = y.f24036b;
        this.f24060e = yVar2;
        this.f24061f = t0.f23947t;
        this.f24062g = 0;
        List list = Collections.EMPTY_LIST;
        this.f24063h = list;
        this.f24064i = list;
        ce.d dVar = new ce.d();
        ce.g gVarU = ce.g.u(dVar, 1);
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    try {
                        int iN = fVar.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.f24057b |= 1;
                                this.f24058c = fVar.k();
                            } else if (iN != 16) {
                                Object objR = null;
                                if (iN == 24) {
                                    int iK = fVar.k();
                                    if (iK != 0) {
                                        if (iK == 1) {
                                            objR = y.f24037c;
                                        } else if (iK == 2) {
                                            objR = y.f24038d;
                                        }
                                        yVar = objR;
                                    } else {
                                        yVar = yVar2;
                                    }
                                    if (yVar == 0) {
                                        gVarU.O(iN);
                                        gVarU.O(iK);
                                    } else {
                                        this.f24057b |= 4;
                                        this.f24060e = yVar;
                                    }
                                } else if (iN == 34) {
                                    if ((this.f24057b & 8) == 8) {
                                        t0 t0Var = this.f24061f;
                                        t0Var.getClass();
                                        objR = t0.r(t0Var);
                                    }
                                    s0 s0Var = objR;
                                    t0 t0Var2 = (t0) fVar.g(t0.f23948u, iVar);
                                    this.f24061f = t0Var2;
                                    if (s0Var != 0) {
                                        s0Var.i(t0Var2);
                                        this.f24061f = s0Var.g();
                                    }
                                    this.f24057b |= 8;
                                } else if (iN != 40) {
                                    a aVar = f24055m;
                                    if (iN == 50) {
                                        if ((i10 & 32) != 32) {
                                            this.f24063h = new ArrayList();
                                            i10 |= 32;
                                        }
                                        this.f24063h.add(fVar.g(aVar, iVar));
                                    } else if (iN != 58) {
                                        if (!fVar.q(iN, gVarU)) {
                                        }
                                    } else {
                                        if ((i10 & 64) != 64) {
                                            this.f24064i = new ArrayList();
                                            i10 |= 64;
                                        }
                                        this.f24064i.add(fVar.g(aVar, iVar));
                                    }
                                } else {
                                    this.f24057b |= 16;
                                    this.f24062g = fVar.k();
                                }
                            } else {
                                this.f24057b |= 2;
                                this.f24059d = fVar.k();
                            }
                        }
                        z10 = true;
                    } catch (ce.s e10) {
                        e10.f3972a = this;
                        throw e10;
                    }
                } catch (IOException e11) {
                    ce.s sVar = new ce.s(e11.getMessage());
                    sVar.f3972a = this;
                    throw sVar;
                }
            } catch (Throwable th2) {
                if ((i10 & 32) == 32) {
                    this.f24063h = Collections.unmodifiableList(this.f24063h);
                }
                if ((i10 & 64) == 64) {
                    this.f24064i = Collections.unmodifiableList(this.f24064i);
                }
                try {
                    gVarU.m();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f24056a = dVar.i();
                    throw th3;
                }
                this.f24056a = dVar.i();
                throw th2;
            }
        }
        if ((i10 & 32) == 32) {
            this.f24063h = Collections.unmodifiableList(this.f24063h);
        }
        if ((i10 & 64) == 64) {
            this.f24064i = Collections.unmodifiableList(this.f24064i);
        }
        try {
            gVarU.m();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f24056a = dVar.i();
            throw th4;
        }
        this.f24056a = dVar.i();
    }

    public z(x xVar) {
        this.f24065j = (byte) -1;
        this.f24066k = -1;
        this.f24056a = xVar.f3948a;
    }
}
