package wd;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends ce.m {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h0 f23712j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f23713k = new a(12);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ce.e f23714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o0 f23716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n0 f23717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f0 f23718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f23719g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte f23720h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23721i;

    static {
        h0 h0Var = new h0();
        f23712j = h0Var;
        h0Var.f23716d = o0.f23879e;
        h0Var.f23717e = n0.f23870e;
        h0Var.f23718f = f0.f23666k;
        h0Var.f23719g = Collections.EMPTY_LIST;
    }

    public h0(g0 g0Var) {
        super(g0Var);
        this.f23720h = (byte) -1;
        this.f23721i = -1;
        this.f23714b = g0Var.f3948a;
    }

    @Override // ce.x
    public final ce.b a() {
        return f23712j;
    }

    @Override // ce.x
    public final boolean b() {
        byte b10 = this.f23720h;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if ((this.f23715c & 2) == 2 && !this.f23717e.b()) {
            this.f23720h = (byte) 0;
            return false;
        }
        if ((this.f23715c & 4) == 4 && !this.f23718f.b()) {
            this.f23720h = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.f23719g.size(); i10++) {
            if (!((k) this.f23719g.get(i10)).b()) {
                this.f23720h = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.f23720h = (byte) 1;
            return true;
        }
        this.f23720h = (byte) 0;
        return false;
    }

    @Override // ce.b
    public final int c() {
        int i10 = this.f23721i;
        if (i10 != -1) {
            return i10;
        }
        int iG = (this.f23715c & 1) == 1 ? ce.g.g(1, this.f23716d) : 0;
        if ((this.f23715c & 2) == 2) {
            iG += ce.g.g(2, this.f23717e);
        }
        if ((this.f23715c & 4) == 4) {
            iG += ce.g.g(3, this.f23718f);
        }
        for (int i11 = 0; i11 < this.f23719g.size(); i11++) {
            iG += ce.g.g(4, (ce.b) this.f23719g.get(i11));
        }
        int size = this.f23714b.size() + j() + iG;
        this.f23721i = size;
        return size;
    }

    @Override // ce.b
    public final ce.k d() {
        return g0.h();
    }

    @Override // ce.b
    public final ce.k e() {
        g0 g0VarH = g0.h();
        g0VarH.i(this);
        return g0VarH;
    }

    @Override // ce.b
    public final void f(ce.g gVar) throws IOException {
        c();
        androidx.media3.exoplayer.offline.u uVar = new androidx.media3.exoplayer.offline.u(this);
        if ((this.f23715c & 1) == 1) {
            gVar.H(1, this.f23716d);
        }
        if ((this.f23715c & 2) == 2) {
            gVar.H(2, this.f23717e);
        }
        if ((this.f23715c & 4) == 4) {
            gVar.H(3, this.f23718f);
        }
        for (int i10 = 0; i10 < this.f23719g.size(); i10++) {
            gVar.H(4, (ce.b) this.f23719g.get(i10));
        }
        uVar.e1(TinkerReport.KEY_APPLIED_SUCC_COST_5S_LESS, gVar);
        gVar.K(this.f23714b);
    }

    public h0() {
        this.f23720h = (byte) -1;
        this.f23721i = -1;
        this.f23714b = ce.e.f3915a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h0(ce.f fVar, ce.i iVar) {
        this.f23720h = (byte) -1;
        this.f23721i = -1;
        this.f23716d = o0.f23879e;
        this.f23717e = n0.f23870e;
        this.f23718f = f0.f23666k;
        this.f23719g = Collections.EMPTY_LIST;
        ce.d dVar = new ce.d();
        ce.g gVarU = ce.g.u(dVar, 1);
        boolean z10 = false;
        char c3 = 0;
        while (!z10) {
            try {
                try {
                    int iN = fVar.n();
                    if (iN != 0) {
                        e0 e0VarH = null;
                        o oVar = null;
                        o oVar2 = null;
                        if (iN == 10) {
                            if ((this.f23715c & 1) == 1) {
                                o0 o0Var = this.f23716d;
                                o0Var.getClass();
                                oVar = new o(3);
                                oVar.f23878d = ce.t.f3984b;
                                oVar.l(o0Var);
                            }
                            o0 o0Var2 = (o0) fVar.g(o0.f23880f, iVar);
                            this.f23716d = o0Var2;
                            if (oVar != null) {
                                oVar.l(o0Var2);
                                this.f23716d = oVar.h();
                            }
                            this.f23715c |= 1;
                        } else if (iN == 18) {
                            if ((this.f23715c & 2) == 2) {
                                n0 n0Var = this.f23717e;
                                n0Var.getClass();
                                oVar2 = new o(1);
                                oVar2.f23878d = Collections.EMPTY_LIST;
                                oVar2.k(n0Var);
                            }
                            n0 n0Var2 = (n0) fVar.g(n0.f23871f, iVar);
                            this.f23717e = n0Var2;
                            if (oVar2 != null) {
                                oVar2.k(n0Var2);
                                this.f23717e = oVar2.g();
                            }
                            this.f23715c |= 2;
                        } else if (iN == 26) {
                            if ((this.f23715c & 4) == 4) {
                                f0 f0Var = this.f23718f;
                                f0Var.getClass();
                                e0VarH = e0.h();
                                e0VarH.i(f0Var);
                            }
                            f0 f0Var2 = (f0) fVar.g(f0.f23667l, iVar);
                            this.f23718f = f0Var2;
                            if (e0VarH != null) {
                                e0VarH.i(f0Var2);
                                this.f23718f = e0VarH.g();
                            }
                            this.f23715c |= 4;
                        } else if (iN != 34) {
                            if (!n(fVar, gVarU, iVar, iN)) {
                            }
                        } else {
                            if ((c3 & '\b') != 8) {
                                this.f23719g = new ArrayList();
                                c3 = '\b';
                            }
                            this.f23719g.add(fVar.g(k.H, iVar));
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
                if ((c3 & '\b') == 8) {
                    this.f23719g = Collections.unmodifiableList(this.f23719g);
                }
                try {
                    gVarU.m();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f23714b = dVar.i();
                    throw th3;
                }
                this.f23714b = dVar.i();
                m();
                throw th2;
            }
        }
        if ((c3 & '\b') == 8) {
            this.f23719g = Collections.unmodifiableList(this.f23719g);
        }
        try {
            gVarU.m();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f23714b = dVar.i();
            throw th4;
        }
        this.f23714b = dVar.i();
        m();
    }
}
