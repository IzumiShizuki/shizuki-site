package wd;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends ce.m {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b1 f23573n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f23574o = new a(22);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ce.e f23575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t0 f23579f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23580g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public t0 f23581h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23582i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f23583j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e f23584k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte f23585l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f23586m;

    static {
        b1 b1Var = new b1();
        f23573n = b1Var;
        b1Var.f23577d = 0;
        b1Var.f23578e = 0;
        t0 t0Var = t0.f23947t;
        b1Var.f23579f = t0Var;
        b1Var.f23580g = 0;
        b1Var.f23581h = t0Var;
        b1Var.f23582i = 0;
        b1Var.f23583j = Collections.EMPTY_LIST;
        b1Var.f23584k = e.f23630p;
    }

    public b1(a1 a1Var) {
        super(a1Var);
        this.f23585l = (byte) -1;
        this.f23586m = -1;
        this.f23575b = a1Var.f3948a;
    }

    @Override // ce.x
    public final ce.b a() {
        return f23573n;
    }

    @Override // ce.x
    public final boolean b() {
        byte b10 = this.f23585l;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        int i10 = this.f23576c;
        if ((i10 & 2) != 2) {
            this.f23585l = (byte) 0;
            return false;
        }
        if ((i10 & 4) == 4 && !this.f23579f.b()) {
            this.f23585l = (byte) 0;
            return false;
        }
        if ((this.f23576c & 16) == 16 && !this.f23581h.b()) {
            this.f23585l = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < this.f23583j.size(); i11++) {
            if (!((h) this.f23583j.get(i11)).b()) {
                this.f23585l = (byte) 0;
                return false;
            }
        }
        if ((this.f23576c & 64) == 64 && !this.f23584k.b()) {
            this.f23585l = (byte) 0;
            return false;
        }
        if (i()) {
            this.f23585l = (byte) 1;
            return true;
        }
        this.f23585l = (byte) 0;
        return false;
    }

    @Override // ce.b
    public final int c() {
        int i10 = this.f23586m;
        if (i10 != -1) {
            return i10;
        }
        int iE = (this.f23576c & 1) == 1 ? ce.g.e(1, this.f23577d) : 0;
        if ((this.f23576c & 2) == 2) {
            iE += ce.g.e(2, this.f23578e);
        }
        if ((this.f23576c & 4) == 4) {
            iE += ce.g.g(3, this.f23579f);
        }
        if ((this.f23576c & 16) == 16) {
            iE += ce.g.g(4, this.f23581h);
        }
        if ((this.f23576c & 8) == 8) {
            iE += ce.g.e(5, this.f23580g);
        }
        if ((this.f23576c & 32) == 32) {
            iE += ce.g.e(6, this.f23582i);
        }
        for (int i11 = 0; i11 < this.f23583j.size(); i11++) {
            iE += ce.g.g(7, (ce.b) this.f23583j.get(i11));
        }
        if ((this.f23576c & 64) == 64) {
            iE += ce.g.g(8, this.f23584k);
        }
        int size = this.f23575b.size() + j() + iE;
        this.f23586m = size;
        return size;
    }

    @Override // ce.b
    public final ce.k d() {
        return a1.h();
    }

    @Override // ce.b
    public final ce.k e() {
        a1 a1VarH = a1.h();
        a1VarH.i(this);
        return a1VarH;
    }

    @Override // ce.b
    public final void f(ce.g gVar) throws IOException {
        c();
        androidx.media3.exoplayer.offline.u uVar = new androidx.media3.exoplayer.offline.u(this);
        if ((this.f23576c & 1) == 1) {
            gVar.F(1, this.f23577d);
        }
        if ((this.f23576c & 2) == 2) {
            gVar.F(2, this.f23578e);
        }
        if ((this.f23576c & 4) == 4) {
            gVar.H(3, this.f23579f);
        }
        if ((this.f23576c & 16) == 16) {
            gVar.H(4, this.f23581h);
        }
        if ((this.f23576c & 8) == 8) {
            gVar.F(5, this.f23580g);
        }
        if ((this.f23576c & 32) == 32) {
            gVar.F(6, this.f23582i);
        }
        for (int i10 = 0; i10 < this.f23583j.size(); i10++) {
            gVar.H(7, (ce.b) this.f23583j.get(i10));
        }
        if ((this.f23576c & 64) == 64) {
            gVar.H(8, this.f23584k);
        }
        uVar.e1(TinkerReport.KEY_APPLIED_SUCC_COST_5S_LESS, gVar);
        gVar.K(this.f23575b);
    }

    public final a1 p() {
        a1 a1VarH = a1.h();
        a1VarH.i(this);
        return a1VarH;
    }

    public b1() {
        this.f23585l = (byte) -1;
        this.f23586m = -1;
        this.f23575b = ce.e.f3915a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b1(ce.f fVar, ce.i iVar) {
        this.f23585l = (byte) -1;
        this.f23586m = -1;
        boolean z10 = false;
        this.f23577d = 0;
        this.f23578e = 0;
        t0 t0Var = t0.f23947t;
        this.f23579f = t0Var;
        this.f23580g = 0;
        this.f23581h = t0Var;
        this.f23582i = 0;
        this.f23583j = Collections.EMPTY_LIST;
        this.f23584k = e.f23630p;
        ce.d dVar = new ce.d();
        ce.g gVarU = ce.g.u(dVar, 1);
        char c3 = 0;
        while (!z10) {
            try {
                try {
                    int iN = fVar.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f23576c |= 1;
                            this.f23577d = fVar.k();
                        } else if (iN != 16) {
                            c cVarJ = null;
                            s0 s0VarR = null;
                            s0 s0VarR2 = null;
                            if (iN == 26) {
                                if ((this.f23576c & 4) == 4) {
                                    t0 t0Var2 = this.f23579f;
                                    t0Var2.getClass();
                                    s0VarR = t0.r(t0Var2);
                                }
                                t0 t0Var3 = (t0) fVar.g(t0.f23948u, iVar);
                                this.f23579f = t0Var3;
                                if (s0VarR != null) {
                                    s0VarR.i(t0Var3);
                                    this.f23579f = s0VarR.g();
                                }
                                this.f23576c |= 4;
                            } else if (iN == 34) {
                                if ((this.f23576c & 16) == 16) {
                                    t0 t0Var4 = this.f23581h;
                                    t0Var4.getClass();
                                    s0VarR2 = t0.r(t0Var4);
                                }
                                t0 t0Var5 = (t0) fVar.g(t0.f23948u, iVar);
                                this.f23581h = t0Var5;
                                if (s0VarR2 != null) {
                                    s0VarR2.i(t0Var5);
                                    this.f23581h = s0VarR2.g();
                                }
                                this.f23576c |= 16;
                            } else if (iN == 40) {
                                this.f23576c |= 8;
                                this.f23580g = fVar.k();
                            } else if (iN == 48) {
                                this.f23576c |= 32;
                                this.f23582i = fVar.k();
                            } else if (iN == 58) {
                                if ((c3 & '@') != 64) {
                                    this.f23583j = new ArrayList();
                                    c3 = '@';
                                }
                                this.f23583j.add(fVar.g(h.f23705h, iVar));
                            } else if (iN != 66) {
                                if (!n(fVar, gVarU, iVar, iN)) {
                                }
                            } else {
                                if ((this.f23576c & 64) == 64) {
                                    e eVar = this.f23584k;
                                    eVar.getClass();
                                    cVarJ = e.j(eVar);
                                }
                                e eVar2 = (e) fVar.g(e.f23631q, iVar);
                                this.f23584k = eVar2;
                                if (cVarJ != null) {
                                    cVarJ.h(eVar2);
                                    this.f23584k = cVarJ.f();
                                }
                                this.f23576c |= 64;
                            }
                        } else {
                            this.f23576c |= 2;
                            this.f23578e = fVar.k();
                        }
                    }
                    z10 = true;
                } catch (Throwable th2) {
                    if ((c3 & '@') == 64) {
                        this.f23583j = Collections.unmodifiableList(this.f23583j);
                    }
                    try {
                        gVarU.m();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f23575b = dVar.i();
                        throw th3;
                    }
                    this.f23575b = dVar.i();
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
        if ((c3 & '@') == 64) {
            this.f23583j = Collections.unmodifiableList(this.f23583j);
        }
        try {
            gVarU.m();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f23575b = dVar.i();
            throw th4;
        }
        this.f23575b = dVar.i();
        m();
    }
}
