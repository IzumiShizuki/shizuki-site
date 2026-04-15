package wd;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends ce.m {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final v0 f23992p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f23993q = new a(19);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ce.e f23994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f23998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public t0 f23999g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f24000h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public t0 f24001i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f24002j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f24003k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f24004l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f24005m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte f24006n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f24007o;

    static {
        v0 v0Var = new v0();
        f23992p = v0Var;
        v0Var.f23996d = 6;
        v0Var.f23997e = 0;
        List list = Collections.EMPTY_LIST;
        v0Var.f23998f = list;
        t0 t0Var = t0.f23947t;
        v0Var.f23999g = t0Var;
        v0Var.f24000h = 0;
        v0Var.f24001i = t0Var;
        v0Var.f24002j = 0;
        v0Var.f24003k = list;
        v0Var.f24004l = list;
        v0Var.f24005m = list;
    }

    public v0(u0 u0Var) {
        super(u0Var);
        this.f24006n = (byte) -1;
        this.f24007o = -1;
        this.f23994b = u0Var.f3948a;
    }

    @Override // ce.x
    public final ce.b a() {
        return f23992p;
    }

    @Override // ce.x
    public final boolean b() {
        byte b10 = this.f24006n;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if ((this.f23995c & 2) != 2) {
            this.f24006n = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.f23998f.size(); i10++) {
            if (!((y0) this.f23998f.get(i10)).b()) {
                this.f24006n = (byte) 0;
                return false;
            }
        }
        if ((this.f23995c & 4) == 4 && !this.f23999g.b()) {
            this.f24006n = (byte) 0;
            return false;
        }
        if ((this.f23995c & 16) == 16 && !this.f24001i.b()) {
            this.f24006n = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < this.f24003k.size(); i11++) {
            if (!((h) this.f24003k.get(i11)).b()) {
                this.f24006n = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < this.f24005m.size(); i12++) {
            if (!((l) this.f24005m.get(i12)).b()) {
                this.f24006n = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.f24006n = (byte) 1;
            return true;
        }
        this.f24006n = (byte) 0;
        return false;
    }

    @Override // ce.b
    public final int c() {
        int i10 = this.f24007o;
        if (i10 != -1) {
            return i10;
        }
        int iE = (this.f23995c & 1) == 1 ? ce.g.e(1, this.f23996d) : 0;
        if ((this.f23995c & 2) == 2) {
            iE += ce.g.e(2, this.f23997e);
        }
        for (int i11 = 0; i11 < this.f23998f.size(); i11++) {
            iE += ce.g.g(3, (ce.b) this.f23998f.get(i11));
        }
        if ((this.f23995c & 4) == 4) {
            iE += ce.g.g(4, this.f23999g);
        }
        if ((this.f23995c & 8) == 8) {
            iE += ce.g.e(5, this.f24000h);
        }
        if ((this.f23995c & 16) == 16) {
            iE += ce.g.g(6, this.f24001i);
        }
        if ((this.f23995c & 32) == 32) {
            iE += ce.g.e(7, this.f24002j);
        }
        for (int i12 = 0; i12 < this.f24003k.size(); i12++) {
            iE += ce.g.g(8, (ce.b) this.f24003k.get(i12));
        }
        int iF = 0;
        for (int i13 = 0; i13 < this.f24004l.size(); i13++) {
            iF += ce.g.f(((Integer) this.f24004l.get(i13)).intValue());
        }
        int size = (this.f24004l.size() * 2) + iE + iF;
        for (int i14 = 0; i14 < this.f24005m.size(); i14++) {
            size += ce.g.g(32, (ce.b) this.f24005m.get(i14));
        }
        int size2 = this.f23994b.size() + j() + size;
        this.f24007o = size2;
        return size2;
    }

    @Override // ce.b
    public final ce.k d() {
        return u0.h();
    }

    @Override // ce.b
    public final ce.k e() {
        u0 u0VarH = u0.h();
        u0VarH.i(this);
        return u0VarH;
    }

    @Override // ce.b
    public final void f(ce.g gVar) throws IOException {
        c();
        androidx.media3.exoplayer.offline.u uVar = new androidx.media3.exoplayer.offline.u(this);
        if ((this.f23995c & 1) == 1) {
            gVar.F(1, this.f23996d);
        }
        if ((this.f23995c & 2) == 2) {
            gVar.F(2, this.f23997e);
        }
        for (int i10 = 0; i10 < this.f23998f.size(); i10++) {
            gVar.H(3, (ce.b) this.f23998f.get(i10));
        }
        if ((this.f23995c & 4) == 4) {
            gVar.H(4, this.f23999g);
        }
        if ((this.f23995c & 8) == 8) {
            gVar.F(5, this.f24000h);
        }
        if ((this.f23995c & 16) == 16) {
            gVar.H(6, this.f24001i);
        }
        if ((this.f23995c & 32) == 32) {
            gVar.F(7, this.f24002j);
        }
        for (int i11 = 0; i11 < this.f24003k.size(); i11++) {
            gVar.H(8, (ce.b) this.f24003k.get(i11));
        }
        for (int i12 = 0; i12 < this.f24004l.size(); i12++) {
            gVar.F(31, ((Integer) this.f24004l.get(i12)).intValue());
        }
        for (int i13 = 0; i13 < this.f24005m.size(); i13++) {
            gVar.H(32, (ce.b) this.f24005m.get(i13));
        }
        uVar.e1(TinkerReport.KEY_APPLIED_SUCC_COST_5S_LESS, gVar);
        gVar.K(this.f23994b);
    }

    public v0() {
        this.f24006n = (byte) -1;
        this.f24007o = -1;
        this.f23994b = ce.e.f3915a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public v0(ce.f fVar, ce.i iVar) {
        this.f24006n = (byte) -1;
        this.f24007o = -1;
        this.f23996d = 6;
        boolean z10 = false;
        this.f23997e = 0;
        List list = Collections.EMPTY_LIST;
        this.f23998f = list;
        t0 t0Var = t0.f23947t;
        this.f23999g = t0Var;
        this.f24000h = 0;
        this.f24001i = t0Var;
        this.f24002j = 0;
        this.f24003k = list;
        this.f24004l = list;
        this.f24005m = list;
        ce.d dVar = new ce.d();
        ce.g gVarU = ce.g.u(dVar, 1);
        int i10 = 0;
        while (true) {
            ?? N = 128;
            if (!z10) {
                try {
                    try {
                        int iN = fVar.n();
                        s0 s0VarR = null;
                        switch (iN) {
                            case 0:
                                z10 = true;
                                break;
                            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                                this.f23995c |= 1;
                                this.f23996d = fVar.k();
                                break;
                            case 16:
                                this.f23995c |= 2;
                                this.f23997e = fVar.k();
                                break;
                            case 26:
                                if ((i10 & 4) != 4) {
                                    this.f23998f = new ArrayList();
                                    i10 |= 4;
                                }
                                this.f23998f.add(fVar.g(y0.f24042n, iVar));
                                break;
                            case 34:
                                if ((this.f23995c & 4) == 4) {
                                    t0 t0Var2 = this.f23999g;
                                    t0Var2.getClass();
                                    s0VarR = t0.r(t0Var2);
                                }
                                t0 t0Var3 = (t0) fVar.g(t0.f23948u, iVar);
                                this.f23999g = t0Var3;
                                if (s0VarR != null) {
                                    s0VarR.i(t0Var3);
                                    this.f23999g = s0VarR.g();
                                }
                                this.f23995c |= 4;
                                break;
                            case 40:
                                this.f23995c |= 8;
                                this.f24000h = fVar.k();
                                break;
                            case 50:
                                if ((this.f23995c & 16) == 16) {
                                    t0 t0Var4 = this.f24001i;
                                    t0Var4.getClass();
                                    s0VarR = t0.r(t0Var4);
                                }
                                t0 t0Var5 = (t0) fVar.g(t0.f23948u, iVar);
                                this.f24001i = t0Var5;
                                if (s0VarR != null) {
                                    s0VarR.i(t0Var5);
                                    this.f24001i = s0VarR.g();
                                }
                                this.f23995c |= 16;
                                break;
                            case 56:
                                this.f23995c |= 32;
                                this.f24002j = fVar.k();
                                break;
                            case 66:
                                if ((i10 & 128) != 128) {
                                    this.f24003k = new ArrayList();
                                    i10 |= 128;
                                }
                                this.f24003k.add(fVar.g(h.f23705h, iVar));
                                break;
                            case 248:
                                if ((i10 & 256) != 256) {
                                    this.f24004l = new ArrayList();
                                    i10 |= 256;
                                }
                                this.f24004l.add(Integer.valueOf(fVar.k()));
                                break;
                            case TinkerReport.KEY_LOADED_UNKNOWN_EXCEPTION /* 250 */:
                                int iD = fVar.d(fVar.k());
                                if ((i10 & 256) != 256 && fVar.b() > 0) {
                                    this.f24004l = new ArrayList();
                                    i10 |= 256;
                                }
                                while (fVar.b() > 0) {
                                    this.f24004l.add(Integer.valueOf(fVar.k()));
                                }
                                fVar.c(iD);
                                break;
                            case 258:
                                if ((i10 & 512) != 512) {
                                    this.f24005m = new ArrayList();
                                    i10 |= 512;
                                }
                                this.f24005m.add(fVar.g(l.f23832h, iVar));
                                break;
                            default:
                                N = n(fVar, gVarU, iVar, iN);
                                if (N == 0) {
                                    z10 = true;
                                }
                                break;
                        }
                    } catch (ce.s e10) {
                        e10.f3972a = this;
                        throw e10;
                    } catch (IOException e11) {
                        ce.s sVar = new ce.s(e11.getMessage());
                        sVar.f3972a = this;
                        throw sVar;
                    }
                } catch (Throwable th2) {
                    if ((i10 & 4) == 4) {
                        this.f23998f = Collections.unmodifiableList(this.f23998f);
                    }
                    if ((i10 & 128) == N) {
                        this.f24003k = Collections.unmodifiableList(this.f24003k);
                    }
                    if ((i10 & 256) == 256) {
                        this.f24004l = Collections.unmodifiableList(this.f24004l);
                    }
                    if ((i10 & 512) == 512) {
                        this.f24005m = Collections.unmodifiableList(this.f24005m);
                    }
                    try {
                        gVarU.m();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f23994b = dVar.i();
                        throw th3;
                    }
                    this.f23994b = dVar.i();
                    m();
                    throw th2;
                }
            } else {
                if ((i10 & 4) == 4) {
                    this.f23998f = Collections.unmodifiableList(this.f23998f);
                }
                if ((i10 & 128) == 128) {
                    this.f24003k = Collections.unmodifiableList(this.f24003k);
                }
                if ((i10 & 256) == 256) {
                    this.f24004l = Collections.unmodifiableList(this.f24004l);
                }
                if ((i10 & 512) == 512) {
                    this.f24005m = Collections.unmodifiableList(this.f24005m);
                }
                try {
                    gVarU.m();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f23994b = dVar.i();
                    throw th4;
                }
                this.f23994b = dVar.i();
                m();
                return;
            }
        }
    }
}
