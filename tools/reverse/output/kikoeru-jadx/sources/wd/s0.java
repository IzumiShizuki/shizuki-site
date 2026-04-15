package wd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends ce.l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f23928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f23929f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23930g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public t0 f23931h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23932i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f23933j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f23934k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f23935l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f23936m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public t0 f23937n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f23938o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public t0 f23939p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f23940q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f23941r;

    public static s0 h() {
        s0 s0Var = new s0();
        s0Var.f23928e = Collections.EMPTY_LIST;
        t0 t0Var = t0.f23947t;
        s0Var.f23931h = t0Var;
        s0Var.f23937n = t0Var;
        s0Var.f23939p = t0Var;
        return s0Var;
    }

    @Override // ce.k
    public final ce.b c() {
        t0 t0VarG = g();
        if (t0VarG.b()) {
            return t0VarG;
        }
        throw new ce.j0();
    }

    public final Object clone() {
        s0 s0VarH = h();
        s0VarH.i(g());
        return s0VarH;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // ce.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ce.k d(ce.f r3, ce.i r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            wd.a r1 = wd.t0.f23948u     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            wd.t0 r1 = new wd.t0     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            ce.b r4 = r3.f3972a     // Catch: java.lang.Throwable -> Lf
            wd.t0 r4 = (wd.t0) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.i(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: wd.s0.d(ce.f, ce.i):ce.k");
    }

    @Override // ce.k
    public final /* bridge */ /* synthetic */ ce.k e(ce.p pVar) {
        i((t0) pVar);
        return this;
    }

    public final t0 g() {
        t0 t0Var = new t0(this);
        int i10 = this.f23927d;
        if ((i10 & 1) == 1) {
            this.f23928e = Collections.unmodifiableList(this.f23928e);
            this.f23927d &= -2;
        }
        t0Var.f23951d = this.f23928e;
        int i11 = (i10 & 2) != 2 ? 0 : 1;
        t0Var.f23952e = this.f23929f;
        if ((i10 & 4) == 4) {
            i11 |= 2;
        }
        t0Var.f23953f = this.f23930g;
        if ((i10 & 8) == 8) {
            i11 |= 4;
        }
        t0Var.f23954g = this.f23931h;
        if ((i10 & 16) == 16) {
            i11 |= 8;
        }
        t0Var.f23955h = this.f23932i;
        if ((i10 & 32) == 32) {
            i11 |= 16;
        }
        t0Var.f23956i = this.f23933j;
        if ((i10 & 64) == 64) {
            i11 |= 32;
        }
        t0Var.f23957j = this.f23934k;
        if ((i10 & 128) == 128) {
            i11 |= 64;
        }
        t0Var.f23958k = this.f23935l;
        if ((i10 & 256) == 256) {
            i11 |= 128;
        }
        t0Var.f23959l = this.f23936m;
        if ((i10 & 512) == 512) {
            i11 |= 256;
        }
        t0Var.f23960m = this.f23937n;
        if ((i10 & 1024) == 1024) {
            i11 |= 512;
        }
        t0Var.f23961n = this.f23938o;
        if ((i10 & 2048) == 2048) {
            i11 |= 1024;
        }
        t0Var.f23962o = this.f23939p;
        if ((i10 & 4096) == 4096) {
            i11 |= 2048;
        }
        t0Var.f23963p = this.f23940q;
        if ((i10 & 8192) == 8192) {
            i11 |= 4096;
        }
        t0Var.f23964q = this.f23941r;
        t0Var.f23950c = i11;
        return t0Var;
    }

    public final s0 i(t0 t0Var) {
        t0 t0Var2;
        t0 t0Var3;
        t0 t0Var4;
        t0 t0Var5 = t0.f23947t;
        if (t0Var == t0Var5) {
            return this;
        }
        if (!t0Var.f23951d.isEmpty()) {
            if (this.f23928e.isEmpty()) {
                this.f23928e = t0Var.f23951d;
                this.f23927d &= -2;
            } else {
                if ((this.f23927d & 1) != 1) {
                    this.f23928e = new ArrayList(this.f23928e);
                    this.f23927d |= 1;
                }
                this.f23928e.addAll(t0Var.f23951d);
            }
        }
        int i10 = t0Var.f23950c;
        if ((i10 & 1) == 1) {
            boolean z10 = t0Var.f23952e;
            this.f23927d |= 2;
            this.f23929f = z10;
        }
        if ((i10 & 2) == 2) {
            int i11 = t0Var.f23953f;
            this.f23927d |= 4;
            this.f23930g = i11;
        }
        if ((i10 & 4) == 4) {
            t0 t0Var6 = t0Var.f23954g;
            if ((this.f23927d & 8) != 8 || (t0Var4 = this.f23931h) == t0Var5) {
                this.f23931h = t0Var6;
            } else {
                s0 s0VarR = t0.r(t0Var4);
                s0VarR.i(t0Var6);
                this.f23931h = s0VarR.g();
            }
            this.f23927d |= 8;
        }
        if ((t0Var.f23950c & 8) == 8) {
            int i12 = t0Var.f23955h;
            this.f23927d |= 16;
            this.f23932i = i12;
        }
        if (t0Var.p()) {
            int i13 = t0Var.f23956i;
            this.f23927d |= 32;
            this.f23933j = i13;
        }
        int i14 = t0Var.f23950c;
        if ((i14 & 32) == 32) {
            int i15 = t0Var.f23957j;
            this.f23927d |= 64;
            this.f23934k = i15;
        }
        if ((i14 & 64) == 64) {
            int i16 = t0Var.f23958k;
            this.f23927d |= 128;
            this.f23935l = i16;
        }
        if ((i14 & 128) == 128) {
            int i17 = t0Var.f23959l;
            this.f23927d |= 256;
            this.f23936m = i17;
        }
        if ((i14 & 256) == 256) {
            t0 t0Var7 = t0Var.f23960m;
            if ((this.f23927d & 512) != 512 || (t0Var3 = this.f23937n) == t0Var5) {
                this.f23937n = t0Var7;
            } else {
                s0 s0VarR2 = t0.r(t0Var3);
                s0VarR2.i(t0Var7);
                this.f23937n = s0VarR2.g();
            }
            this.f23927d |= 512;
        }
        int i18 = t0Var.f23950c;
        if ((i18 & 512) == 512) {
            int i19 = t0Var.f23961n;
            this.f23927d |= 1024;
            this.f23938o = i19;
        }
        if ((i18 & 1024) == 1024) {
            t0 t0Var8 = t0Var.f23962o;
            if ((this.f23927d & 2048) != 2048 || (t0Var2 = this.f23939p) == t0Var5) {
                this.f23939p = t0Var8;
            } else {
                s0 s0VarR3 = t0.r(t0Var2);
                s0VarR3.i(t0Var8);
                this.f23939p = s0VarR3.g();
            }
            this.f23927d |= 2048;
        }
        int i20 = t0Var.f23950c;
        if ((i20 & 2048) == 2048) {
            int i21 = t0Var.f23963p;
            this.f23927d |= 4096;
            this.f23940q = i21;
        }
        if ((i20 & 4096) == 4096) {
            int i22 = t0Var.f23964q;
            this.f23927d |= 8192;
            this.f23941r = i22;
        }
        f(t0Var);
        this.f3948a = this.f3948a.i(t0Var.f23949b);
        return this;
    }
}
