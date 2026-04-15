package wd;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends ce.m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final f0 f23666k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f23667l = new a(11);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ce.e f23668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f23670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f23671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f23672f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public z0 f23673g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g1 f23674h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte f23675i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f23676j;

    static {
        f0 f0Var = new f0();
        f23666k = f0Var;
        List list = Collections.EMPTY_LIST;
        f0Var.f23670d = list;
        f0Var.f23671e = list;
        f0Var.f23672f = list;
        f0Var.f23673g = z0.f24067g;
        f0Var.f23674h = g1.f23698e;
    }

    public f0(e0 e0Var) {
        super(e0Var);
        this.f23675i = (byte) -1;
        this.f23676j = -1;
        this.f23668b = e0Var.f3948a;
    }

    @Override // ce.x
    public final ce.b a() {
        return f23666k;
    }

    @Override // ce.x
    public final boolean b() {
        byte b10 = this.f23675i;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.f23670d.size(); i10++) {
            if (!((b0) this.f23670d.get(i10)).b()) {
                this.f23675i = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < this.f23671e.size(); i11++) {
            if (!((j0) this.f23671e.get(i11)).b()) {
                this.f23675i = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < this.f23672f.size(); i12++) {
            if (!((v0) this.f23672f.get(i12)).b()) {
                this.f23675i = (byte) 0;
                return false;
            }
        }
        if ((this.f23669c & 1) == 1 && !this.f23673g.b()) {
            this.f23675i = (byte) 0;
            return false;
        }
        if (i()) {
            this.f23675i = (byte) 1;
            return true;
        }
        this.f23675i = (byte) 0;
        return false;
    }

    @Override // ce.b
    public final int c() {
        int i10 = this.f23676j;
        if (i10 != -1) {
            return i10;
        }
        int iG = 0;
        for (int i11 = 0; i11 < this.f23670d.size(); i11++) {
            iG += ce.g.g(3, (ce.b) this.f23670d.get(i11));
        }
        for (int i12 = 0; i12 < this.f23671e.size(); i12++) {
            iG += ce.g.g(4, (ce.b) this.f23671e.get(i12));
        }
        for (int i13 = 0; i13 < this.f23672f.size(); i13++) {
            iG += ce.g.g(5, (ce.b) this.f23672f.get(i13));
        }
        if ((this.f23669c & 1) == 1) {
            iG += ce.g.g(30, this.f23673g);
        }
        if ((this.f23669c & 2) == 2) {
            iG += ce.g.g(32, this.f23674h);
        }
        int size = this.f23668b.size() + j() + iG;
        this.f23676j = size;
        return size;
    }

    @Override // ce.b
    public final ce.k d() {
        return e0.h();
    }

    @Override // ce.b
    public final ce.k e() {
        e0 e0VarH = e0.h();
        e0VarH.i(this);
        return e0VarH;
    }

    @Override // ce.b
    public final void f(ce.g gVar) throws IOException {
        c();
        androidx.media3.exoplayer.offline.u uVar = new androidx.media3.exoplayer.offline.u(this);
        for (int i10 = 0; i10 < this.f23670d.size(); i10++) {
            gVar.H(3, (ce.b) this.f23670d.get(i10));
        }
        for (int i11 = 0; i11 < this.f23671e.size(); i11++) {
            gVar.H(4, (ce.b) this.f23671e.get(i11));
        }
        for (int i12 = 0; i12 < this.f23672f.size(); i12++) {
            gVar.H(5, (ce.b) this.f23672f.get(i12));
        }
        if ((this.f23669c & 1) == 1) {
            gVar.H(30, this.f23673g);
        }
        if ((this.f23669c & 2) == 2) {
            gVar.H(32, this.f23674h);
        }
        uVar.e1(TinkerReport.KEY_APPLIED_SUCC_COST_5S_LESS, gVar);
        gVar.K(this.f23668b);
    }

    public f0() {
        this.f23675i = (byte) -1;
        this.f23676j = -1;
        this.f23668b = ce.e.f3915a;
    }

    public f0(ce.f fVar, ce.i iVar) {
        this.f23675i = (byte) -1;
        this.f23676j = -1;
        List list = Collections.EMPTY_LIST;
        this.f23670d = list;
        this.f23671e = list;
        this.f23672f = list;
        this.f23673g = z0.f24067g;
        this.f23674h = g1.f23698e;
        ce.d dVar = new ce.d();
        ce.g gVarU = ce.g.u(dVar, 1);
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    try {
                        int iN = fVar.n();
                        if (iN != 0) {
                            if (iN == 26) {
                                if ((i10 & 1) != 1) {
                                    this.f23670d = new ArrayList();
                                    i10 |= 1;
                                }
                                this.f23670d.add(fVar.g(b0.f23549z, iVar));
                            } else if (iN == 34) {
                                if ((i10 & 2) != 2) {
                                    this.f23671e = new ArrayList();
                                    i10 |= 2;
                                }
                                this.f23671e.add(fVar.g(j0.D, iVar));
                            } else if (iN != 42) {
                                o oVar = null;
                                g gVarI = null;
                                if (iN == 242) {
                                    if ((this.f23669c & 1) == 1) {
                                        z0 z0Var = this.f23673g;
                                        z0Var.getClass();
                                        gVarI = z0.i(z0Var);
                                    }
                                    z0 z0Var2 = (z0) fVar.g(z0.f24068h, iVar);
                                    this.f23673g = z0Var2;
                                    if (gVarI != null) {
                                        gVarI.j(z0Var2);
                                        this.f23673g = gVarI.g();
                                    }
                                    this.f23669c |= 1;
                                } else if (iN != 258) {
                                    if (!n(fVar, gVarU, iVar, iN)) {
                                    }
                                } else {
                                    if ((this.f23669c & 2) == 2) {
                                        g1 g1Var = this.f23674h;
                                        g1Var.getClass();
                                        oVar = new o(2);
                                        oVar.f23878d = Collections.EMPTY_LIST;
                                        oVar.m(g1Var);
                                    }
                                    g1 g1Var2 = (g1) fVar.g(g1.f23699f, iVar);
                                    this.f23674h = g1Var2;
                                    if (oVar != null) {
                                        oVar.m(g1Var2);
                                        this.f23674h = oVar.i();
                                    }
                                    this.f23669c |= 2;
                                }
                            } else {
                                if ((i10 & 4) != 4) {
                                    this.f23672f = new ArrayList();
                                    i10 |= 4;
                                }
                                this.f23672f.add(fVar.g(v0.f23993q, iVar));
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
                if ((i10 & 1) == 1) {
                    this.f23670d = Collections.unmodifiableList(this.f23670d);
                }
                if ((i10 & 2) == 2) {
                    this.f23671e = Collections.unmodifiableList(this.f23671e);
                }
                if ((i10 & 4) == 4) {
                    this.f23672f = Collections.unmodifiableList(this.f23672f);
                }
                try {
                    gVarU.m();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f23668b = dVar.i();
                    throw th3;
                }
                this.f23668b = dVar.i();
                m();
                throw th2;
            }
        }
        if ((i10 & 1) == 1) {
            this.f23670d = Collections.unmodifiableList(this.f23670d);
        }
        if ((i10 & 2) == 2) {
            this.f23671e = Collections.unmodifiableList(this.f23671e);
        }
        if ((i10 & 4) == 4) {
            this.f23672f = Collections.unmodifiableList(this.f23672f);
        }
        try {
            gVarU.m();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f23668b = dVar.i();
            throw th4;
        }
        this.f23668b = dVar.i();
        m();
    }
}
