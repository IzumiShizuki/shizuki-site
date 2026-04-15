package wd;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends ce.m {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final t0 f23947t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f23948u = new a(17);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ce.e f23949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f23951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f23952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23953f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public t0 f23954g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f23955h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23956i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f23957j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f23958k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f23959l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public t0 f23960m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f23961n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public t0 f23962o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f23963p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f23964q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public byte f23965r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f23966s;

    static {
        t0 t0Var = new t0();
        f23947t = t0Var;
        t0Var.q();
    }

    public t0(s0 s0Var) {
        super(s0Var);
        this.f23965r = (byte) -1;
        this.f23966s = -1;
        this.f23949b = s0Var.f3948a;
    }

    public static s0 r(t0 t0Var) {
        s0 s0VarH = s0.h();
        s0VarH.i(t0Var);
        return s0VarH;
    }

    @Override // ce.x
    public final ce.b a() {
        return f23947t;
    }

    @Override // ce.x
    public final boolean b() {
        byte b10 = this.f23965r;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.f23951d.size(); i10++) {
            if (!((r0) this.f23951d.get(i10)).b()) {
                this.f23965r = (byte) 0;
                return false;
            }
        }
        if ((this.f23950c & 4) == 4 && !this.f23954g.b()) {
            this.f23965r = (byte) 0;
            return false;
        }
        if ((this.f23950c & 256) == 256 && !this.f23960m.b()) {
            this.f23965r = (byte) 0;
            return false;
        }
        if ((this.f23950c & 1024) == 1024 && !this.f23962o.b()) {
            this.f23965r = (byte) 0;
            return false;
        }
        if (i()) {
            this.f23965r = (byte) 1;
            return true;
        }
        this.f23965r = (byte) 0;
        return false;
    }

    @Override // ce.b
    public final int c() {
        int i10 = this.f23966s;
        if (i10 != -1) {
            return i10;
        }
        int iE = (this.f23950c & 4096) == 4096 ? ce.g.e(1, this.f23964q) : 0;
        for (int i11 = 0; i11 < this.f23951d.size(); i11++) {
            iE += ce.g.g(2, (ce.b) this.f23951d.get(i11));
        }
        if ((this.f23950c & 1) == 1) {
            iE += ce.g.k(3) + 1;
        }
        if ((this.f23950c & 2) == 2) {
            iE += ce.g.e(4, this.f23953f);
        }
        if ((this.f23950c & 4) == 4) {
            iE += ce.g.g(5, this.f23954g);
        }
        if ((this.f23950c & 16) == 16) {
            iE += ce.g.e(6, this.f23956i);
        }
        if ((this.f23950c & 32) == 32) {
            iE += ce.g.e(7, this.f23957j);
        }
        if ((this.f23950c & 8) == 8) {
            iE += ce.g.e(8, this.f23955h);
        }
        if ((this.f23950c & 64) == 64) {
            iE += ce.g.e(9, this.f23958k);
        }
        if ((this.f23950c & 256) == 256) {
            iE += ce.g.g(10, this.f23960m);
        }
        if ((this.f23950c & 512) == 512) {
            iE += ce.g.e(11, this.f23961n);
        }
        if ((this.f23950c & 128) == 128) {
            iE += ce.g.e(12, this.f23959l);
        }
        if ((this.f23950c & 1024) == 1024) {
            iE += ce.g.g(13, this.f23962o);
        }
        if ((this.f23950c & 2048) == 2048) {
            iE += ce.g.e(14, this.f23963p);
        }
        int size = this.f23949b.size() + j() + iE;
        this.f23966s = size;
        return size;
    }

    @Override // ce.b
    public final ce.k d() {
        return s0.h();
    }

    @Override // ce.b
    public final void f(ce.g gVar) throws IOException {
        c();
        androidx.media3.exoplayer.offline.u uVar = new androidx.media3.exoplayer.offline.u(this);
        if ((this.f23950c & 4096) == 4096) {
            gVar.F(1, this.f23964q);
        }
        for (int i10 = 0; i10 < this.f23951d.size(); i10++) {
            gVar.H(2, (ce.b) this.f23951d.get(i10));
        }
        if ((this.f23950c & 1) == 1) {
            boolean z10 = this.f23952e;
            gVar.Q(3, 0);
            gVar.J(z10 ? 1 : 0);
        }
        if ((this.f23950c & 2) == 2) {
            gVar.F(4, this.f23953f);
        }
        if ((this.f23950c & 4) == 4) {
            gVar.H(5, this.f23954g);
        }
        if ((this.f23950c & 16) == 16) {
            gVar.F(6, this.f23956i);
        }
        if ((this.f23950c & 32) == 32) {
            gVar.F(7, this.f23957j);
        }
        if ((this.f23950c & 8) == 8) {
            gVar.F(8, this.f23955h);
        }
        if ((this.f23950c & 64) == 64) {
            gVar.F(9, this.f23958k);
        }
        if ((this.f23950c & 256) == 256) {
            gVar.H(10, this.f23960m);
        }
        if ((this.f23950c & 512) == 512) {
            gVar.F(11, this.f23961n);
        }
        if ((this.f23950c & 128) == 128) {
            gVar.F(12, this.f23959l);
        }
        if ((this.f23950c & 1024) == 1024) {
            gVar.H(13, this.f23962o);
        }
        if ((this.f23950c & 2048) == 2048) {
            gVar.F(14, this.f23963p);
        }
        uVar.e1(TinkerReport.KEY_APPLIED_SUCC_COST_5S_LESS, gVar);
        gVar.K(this.f23949b);
    }

    public final boolean p() {
        return (this.f23950c & 16) == 16;
    }

    public final void q() {
        this.f23951d = Collections.EMPTY_LIST;
        this.f23952e = false;
        this.f23953f = 0;
        t0 t0Var = f23947t;
        this.f23954g = t0Var;
        this.f23955h = 0;
        this.f23956i = 0;
        this.f23957j = 0;
        this.f23958k = 0;
        this.f23959l = 0;
        this.f23960m = t0Var;
        this.f23961n = 0;
        this.f23962o = t0Var;
        this.f23963p = 0;
        this.f23964q = 0;
    }

    @Override // ce.b
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final s0 e() {
        return r(this);
    }

    public t0() {
        this.f23965r = (byte) -1;
        this.f23966s = -1;
        this.f23949b = ce.e.f3915a;
    }

    public t0(ce.f fVar, ce.i iVar) {
        this.f23965r = (byte) -1;
        this.f23966s = -1;
        q();
        ce.d dVar = new ce.d();
        ce.g gVarU = ce.g.u(dVar, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int iN = fVar.n();
                    a aVar = f23948u;
                    s0 s0VarR = null;
                    switch (iN) {
                        case 0:
                            break;
                        case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                            this.f23950c |= 4096;
                            this.f23964q = fVar.k();
                            continue;
                        case 18:
                            if (!z11) {
                                this.f23951d = new ArrayList();
                                z11 = true;
                            }
                            this.f23951d.add(fVar.g(r0.f23914i, iVar));
                            continue;
                        case 24:
                            this.f23950c |= 1;
                            this.f23952e = fVar.l() != 0;
                            continue;
                        case 32:
                            this.f23950c |= 2;
                            this.f23953f = fVar.k();
                            continue;
                        case 42:
                            if ((this.f23950c & 4) == 4) {
                                t0 t0Var = this.f23954g;
                                t0Var.getClass();
                                s0VarR = r(t0Var);
                            }
                            t0 t0Var2 = (t0) fVar.g(aVar, iVar);
                            this.f23954g = t0Var2;
                            if (s0VarR != null) {
                                s0VarR.i(t0Var2);
                                this.f23954g = s0VarR.g();
                            }
                            this.f23950c |= 4;
                            continue;
                        case 48:
                            this.f23950c |= 16;
                            this.f23956i = fVar.k();
                            continue;
                        case 56:
                            this.f23950c |= 32;
                            this.f23957j = fVar.k();
                            continue;
                        case 64:
                            this.f23950c |= 8;
                            this.f23955h = fVar.k();
                            continue;
                        case TinkerReport.KEY_TRY_APPLY_RUNNING /* 72 */:
                            this.f23950c |= 64;
                            this.f23958k = fVar.k();
                            continue;
                        case 82:
                            if ((this.f23950c & 256) == 256) {
                                t0 t0Var3 = this.f23960m;
                                t0Var3.getClass();
                                s0VarR = r(t0Var3);
                            }
                            t0 t0Var4 = (t0) fVar.g(aVar, iVar);
                            this.f23960m = t0Var4;
                            if (s0VarR != null) {
                                s0VarR.i(t0Var4);
                                this.f23960m = s0VarR.g();
                            }
                            this.f23950c |= 256;
                            continue;
                        case 88:
                            this.f23950c |= 512;
                            this.f23961n = fVar.k();
                            continue;
                        case 96:
                            this.f23950c |= 128;
                            this.f23959l = fVar.k();
                            continue;
                        case 106:
                            if ((this.f23950c & 1024) == 1024) {
                                t0 t0Var5 = this.f23962o;
                                t0Var5.getClass();
                                s0VarR = r(t0Var5);
                            }
                            t0 t0Var6 = (t0) fVar.g(aVar, iVar);
                            this.f23962o = t0Var6;
                            if (s0VarR != null) {
                                s0VarR.i(t0Var6);
                                this.f23962o = s0VarR.g();
                            }
                            this.f23950c |= 1024;
                            continue;
                        case 112:
                            this.f23950c |= 2048;
                            this.f23963p = fVar.k();
                            continue;
                        default:
                            if (!n(fVar, gVarU, iVar, iN)) {
                            }
                            break;
                    }
                    z10 = true;
                } catch (Throwable th2) {
                    if (z11) {
                        this.f23951d = Collections.unmodifiableList(this.f23951d);
                    }
                    try {
                        gVarU.m();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f23949b = dVar.i();
                        throw th3;
                    }
                    this.f23949b = dVar.i();
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
        if (z11) {
            this.f23951d = Collections.unmodifiableList(this.f23951d);
        }
        try {
            gVarU.m();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f23949b = dVar.i();
            throw th4;
        }
        this.f23949b = dVar.i();
        m();
    }
}
