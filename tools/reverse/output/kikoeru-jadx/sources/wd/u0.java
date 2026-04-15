package wd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends ce.l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23980f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f23981g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public t0 f23982h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23983i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public t0 f23984j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f23985k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f23986l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f23987m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f23988n;

    public static u0 h() {
        u0 u0Var = new u0();
        u0Var.f23979e = 6;
        List list = Collections.EMPTY_LIST;
        u0Var.f23981g = list;
        t0 t0Var = t0.f23947t;
        u0Var.f23982h = t0Var;
        u0Var.f23984j = t0Var;
        u0Var.f23986l = list;
        u0Var.f23987m = list;
        u0Var.f23988n = list;
        return u0Var;
    }

    @Override // ce.k
    public final ce.b c() {
        v0 v0VarG = g();
        if (v0VarG.b()) {
            return v0VarG;
        }
        throw new ce.j0();
    }

    public final Object clone() {
        u0 u0VarH = h();
        u0VarH.i(g());
        return u0VarH;
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
            wd.a r1 = wd.v0.f23993q     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            wd.v0 r1 = new wd.v0     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            ce.b r4 = r3.f3972a     // Catch: java.lang.Throwable -> Lf
            wd.v0 r4 = (wd.v0) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: wd.u0.d(ce.f, ce.i):ce.k");
    }

    @Override // ce.k
    public final /* bridge */ /* synthetic */ ce.k e(ce.p pVar) {
        i((v0) pVar);
        return this;
    }

    public final v0 g() {
        v0 v0Var = new v0(this);
        int i10 = this.f23978d;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        v0Var.f23996d = this.f23979e;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        v0Var.f23997e = this.f23980f;
        if ((i10 & 4) == 4) {
            this.f23981g = Collections.unmodifiableList(this.f23981g);
            this.f23978d &= -5;
        }
        v0Var.f23998f = this.f23981g;
        if ((i10 & 8) == 8) {
            i11 |= 4;
        }
        v0Var.f23999g = this.f23982h;
        if ((i10 & 16) == 16) {
            i11 |= 8;
        }
        v0Var.f24000h = this.f23983i;
        if ((i10 & 32) == 32) {
            i11 |= 16;
        }
        v0Var.f24001i = this.f23984j;
        if ((i10 & 64) == 64) {
            i11 |= 32;
        }
        v0Var.f24002j = this.f23985k;
        if ((this.f23978d & 128) == 128) {
            this.f23986l = Collections.unmodifiableList(this.f23986l);
            this.f23978d &= -129;
        }
        v0Var.f24003k = this.f23986l;
        if ((this.f23978d & 256) == 256) {
            this.f23987m = Collections.unmodifiableList(this.f23987m);
            this.f23978d &= -257;
        }
        v0Var.f24004l = this.f23987m;
        if ((this.f23978d & 512) == 512) {
            this.f23988n = Collections.unmodifiableList(this.f23988n);
            this.f23978d &= -513;
        }
        v0Var.f24005m = this.f23988n;
        v0Var.f23995c = i11;
        return v0Var;
    }

    public final void i(v0 v0Var) {
        t0 t0Var;
        t0 t0Var2;
        if (v0Var == v0.f23992p) {
            return;
        }
        int i10 = v0Var.f23995c;
        if ((i10 & 1) == 1) {
            int i11 = v0Var.f23996d;
            this.f23978d = 1 | this.f23978d;
            this.f23979e = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = v0Var.f23997e;
            this.f23978d = 2 | this.f23978d;
            this.f23980f = i12;
        }
        if (!v0Var.f23998f.isEmpty()) {
            if (this.f23981g.isEmpty()) {
                this.f23981g = v0Var.f23998f;
                this.f23978d &= -5;
            } else {
                if ((this.f23978d & 4) != 4) {
                    this.f23981g = new ArrayList(this.f23981g);
                    this.f23978d |= 4;
                }
                this.f23981g.addAll(v0Var.f23998f);
            }
        }
        if ((v0Var.f23995c & 4) == 4) {
            t0 t0Var3 = v0Var.f23999g;
            if ((this.f23978d & 8) != 8 || (t0Var2 = this.f23982h) == t0.f23947t) {
                this.f23982h = t0Var3;
            } else {
                s0 s0VarR = t0.r(t0Var2);
                s0VarR.i(t0Var3);
                this.f23982h = s0VarR.g();
            }
            this.f23978d |= 8;
        }
        int i13 = v0Var.f23995c;
        if ((i13 & 8) == 8) {
            int i14 = v0Var.f24000h;
            this.f23978d |= 16;
            this.f23983i = i14;
        }
        if ((i13 & 16) == 16) {
            t0 t0Var4 = v0Var.f24001i;
            if ((this.f23978d & 32) != 32 || (t0Var = this.f23984j) == t0.f23947t) {
                this.f23984j = t0Var4;
            } else {
                s0 s0VarR2 = t0.r(t0Var);
                s0VarR2.i(t0Var4);
                this.f23984j = s0VarR2.g();
            }
            this.f23978d |= 32;
        }
        if ((v0Var.f23995c & 32) == 32) {
            int i15 = v0Var.f24002j;
            this.f23978d |= 64;
            this.f23985k = i15;
        }
        if (!v0Var.f24003k.isEmpty()) {
            if (this.f23986l.isEmpty()) {
                this.f23986l = v0Var.f24003k;
                this.f23978d &= -129;
            } else {
                if ((this.f23978d & 128) != 128) {
                    this.f23986l = new ArrayList(this.f23986l);
                    this.f23978d |= 128;
                }
                this.f23986l.addAll(v0Var.f24003k);
            }
        }
        if (!v0Var.f24004l.isEmpty()) {
            if (this.f23987m.isEmpty()) {
                this.f23987m = v0Var.f24004l;
                this.f23978d &= -257;
            } else {
                if ((this.f23978d & 256) != 256) {
                    this.f23987m = new ArrayList(this.f23987m);
                    this.f23978d |= 256;
                }
                this.f23987m.addAll(v0Var.f24004l);
            }
        }
        if (!v0Var.f24005m.isEmpty()) {
            if (this.f23988n.isEmpty()) {
                this.f23988n = v0Var.f24005m;
                this.f23978d &= -513;
            } else {
                if ((this.f23978d & 512) != 512) {
                    this.f23988n = new ArrayList(this.f23988n);
                    this.f23978d |= 512;
                }
                this.f23988n.addAll(v0Var.f24005m);
            }
        }
        f(v0Var);
        this.f3948a = this.f3948a.i(v0Var.f23994b);
    }
}
