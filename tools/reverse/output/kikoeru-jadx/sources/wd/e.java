package wd;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends ce.p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final e f23630p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f23631q = new a(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ce.e f23632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f23634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f23635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f23636e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f23637f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23638g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f23639h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23640i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h f23641j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f23642k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f23643l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f23644m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte f23645n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f23646o;

    static {
        e eVar = new e();
        f23630p = eVar;
        eVar.i();
    }

    public e() {
        this.f23645n = (byte) -1;
        this.f23646o = -1;
        this.f23632a = ce.e.f3915a;
    }

    public static c j(e eVar) {
        c cVarG = c.g();
        cVarG.h(eVar);
        return cVarG;
    }

    @Override // ce.x
    public final boolean b() {
        byte b10 = this.f23645n;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if ((this.f23633b & 128) == 128 && !this.f23641j.b()) {
            this.f23645n = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.f23642k.size(); i10++) {
            if (!((e) this.f23642k.get(i10)).b()) {
                this.f23645n = (byte) 0;
                return false;
            }
        }
        this.f23645n = (byte) 1;
        return true;
    }

    @Override // ce.b
    public final int c() {
        int i10 = this.f23646o;
        if (i10 != -1) {
            return i10;
        }
        int iD = (this.f23633b & 1) == 1 ? ce.g.d(1, this.f23634c.f23622a) : 0;
        if ((this.f23633b & 2) == 2) {
            long j10 = this.f23635d;
            iD += ce.g.j((j10 >> 63) ^ (j10 << 1)) + ce.g.k(2);
        }
        if ((this.f23633b & 4) == 4) {
            iD += ce.g.k(3) + 4;
        }
        if ((this.f23633b & 8) == 8) {
            iD += ce.g.k(4) + 8;
        }
        if ((this.f23633b & 16) == 16) {
            iD += ce.g.e(5, this.f23638g);
        }
        if ((this.f23633b & 32) == 32) {
            iD += ce.g.e(6, this.f23639h);
        }
        if ((this.f23633b & 64) == 64) {
            iD += ce.g.e(7, this.f23640i);
        }
        if ((this.f23633b & 128) == 128) {
            iD += ce.g.g(8, this.f23641j);
        }
        for (int i11 = 0; i11 < this.f23642k.size(); i11++) {
            iD += ce.g.g(9, (ce.b) this.f23642k.get(i11));
        }
        if ((this.f23633b & 512) == 512) {
            iD += ce.g.e(10, this.f23644m);
        }
        if ((this.f23633b & 256) == 256) {
            iD += ce.g.e(11, this.f23643l);
        }
        int size = this.f23632a.size() + iD;
        this.f23646o = size;
        return size;
    }

    @Override // ce.b
    public final ce.k d() {
        return c.g();
    }

    @Override // ce.b
    public final ce.k e() {
        return j(this);
    }

    @Override // ce.b
    public final void f(ce.g gVar) throws IOException {
        c();
        if ((this.f23633b & 1) == 1) {
            gVar.E(1, this.f23634c.f23622a);
        }
        if ((this.f23633b & 2) == 2) {
            long j10 = this.f23635d;
            gVar.Q(2, 0);
            gVar.P((j10 >> 63) ^ (j10 << 1));
        }
        if ((this.f23633b & 4) == 4) {
            float f10 = this.f23636e;
            gVar.Q(3, 5);
            gVar.M(Float.floatToRawIntBits(f10));
        }
        if ((this.f23633b & 8) == 8) {
            double d10 = this.f23637f;
            gVar.Q(4, 1);
            gVar.N(Double.doubleToRawLongBits(d10));
        }
        if ((this.f23633b & 16) == 16) {
            gVar.F(5, this.f23638g);
        }
        if ((this.f23633b & 32) == 32) {
            gVar.F(6, this.f23639h);
        }
        if ((this.f23633b & 64) == 64) {
            gVar.F(7, this.f23640i);
        }
        if ((this.f23633b & 128) == 128) {
            gVar.H(8, this.f23641j);
        }
        for (int i10 = 0; i10 < this.f23642k.size(); i10++) {
            gVar.H(9, (ce.b) this.f23642k.get(i10));
        }
        if ((this.f23633b & 512) == 512) {
            gVar.F(10, this.f23644m);
        }
        if ((this.f23633b & 256) == 256) {
            gVar.F(11, this.f23643l);
        }
        gVar.K(this.f23632a);
    }

    public final void i() {
        this.f23634c = d.f23608b;
        this.f23635d = 0L;
        this.f23636e = 0.0f;
        this.f23637f = 0.0d;
        this.f23638g = 0;
        this.f23639h = 0;
        this.f23640i = 0;
        this.f23641j = h.f23704g;
        this.f23642k = Collections.EMPTY_LIST;
        this.f23643l = 0;
        this.f23644m = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public e(ce.f fVar, ce.i iVar) {
        g gVar;
        this.f23645n = (byte) -1;
        this.f23646o = -1;
        i();
        ce.d dVar = new ce.d();
        ce.g gVarU = ce.g.u(dVar, 1);
        boolean z10 = false;
        char c3 = 0;
        while (true) {
            ?? Q = 256;
            if (!z10) {
                try {
                    try {
                        int iN = fVar.n();
                        switch (iN) {
                            case 0:
                                z10 = true;
                                break;
                            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                                int iK = fVar.k();
                                d dVarB = d.b(iK);
                                if (dVarB == null) {
                                    gVarU.O(iN);
                                    gVarU.O(iK);
                                } else {
                                    this.f23633b |= 1;
                                    this.f23634c = dVarB;
                                }
                                break;
                            case 16:
                                this.f23633b |= 2;
                                long jL = fVar.l();
                                this.f23635d = (-(jL & 1)) ^ (jL >>> 1);
                                break;
                            case 29:
                                this.f23633b |= 4;
                                this.f23636e = Float.intBitsToFloat(fVar.i());
                                break;
                            case 33:
                                this.f23633b |= 8;
                                this.f23637f = Double.longBitsToDouble(fVar.j());
                                break;
                            case 40:
                                this.f23633b |= 16;
                                this.f23638g = fVar.k();
                                break;
                            case 48:
                                this.f23633b |= 32;
                                this.f23639h = fVar.k();
                                break;
                            case 56:
                                this.f23633b |= 64;
                                this.f23640i = fVar.k();
                                break;
                            case 66:
                                if ((this.f23633b & 128) == 128) {
                                    h hVar = this.f23641j;
                                    hVar.getClass();
                                    gVar = new g(0);
                                    gVar.f23691d = Collections.EMPTY_LIST;
                                    gVar.i(hVar);
                                } else {
                                    gVar = null;
                                }
                                h hVar2 = (h) fVar.g(h.f23705h, iVar);
                                this.f23641j = hVar2;
                                if (gVar != null) {
                                    gVar.i(hVar2);
                                    this.f23641j = gVar.f();
                                }
                                this.f23633b |= 128;
                                break;
                            case TinkerReport.KEY_TRY_APPLY_NOT_EXIST /* 74 */:
                                if ((c3 & 256) != 256) {
                                    this.f23642k = new ArrayList();
                                    c3 = 256;
                                }
                                this.f23642k.add(fVar.g(f23631q, iVar));
                                break;
                            case TinkerReport.KEY_TRY_APPLY_CONDITION_NOT_SATISFIED /* 80 */:
                                this.f23633b |= 512;
                                this.f23644m = fVar.k();
                                break;
                            case 88:
                                this.f23633b |= 256;
                                this.f23643l = fVar.k();
                                break;
                            default:
                                Q = fVar.q(iN, gVarU);
                                if (Q == 0) {
                                    z10 = true;
                                }
                                break;
                        }
                    } catch (Throwable th2) {
                        if ((c3 & 256) == Q) {
                            this.f23642k = Collections.unmodifiableList(this.f23642k);
                        }
                        try {
                            gVarU.m();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f23632a = dVar.i();
                            throw th3;
                        }
                        this.f23632a = dVar.i();
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
            } else {
                if ((c3 & 256) == 256) {
                    this.f23642k = Collections.unmodifiableList(this.f23642k);
                }
                try {
                    gVarU.m();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f23632a = dVar.i();
                    throw th4;
                }
                this.f23632a = dVar.i();
                return;
            }
        }
    }

    public e(c cVar) {
        this.f23645n = (byte) -1;
        this.f23646o = -1;
        this.f23632a = cVar.f3948a;
    }
}
