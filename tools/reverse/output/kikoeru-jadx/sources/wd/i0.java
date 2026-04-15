package wd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends ce.l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23749f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23750g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public t0 f23751h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23752i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f23753j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public t0 f23754k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f23755l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f23756m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f23757n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f23758o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b1 f23759p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f23760q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f23761r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List f23762s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public List f23763t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public List f23764u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List f23765v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f23766w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List f23767x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List f23768y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public List f23769z;

    public static i0 h() {
        i0 i0Var = new i0();
        i0Var.f23748e = 518;
        i0Var.f23749f = 2054;
        t0 t0Var = t0.f23947t;
        i0Var.f23751h = t0Var;
        List list = Collections.EMPTY_LIST;
        i0Var.f23753j = list;
        i0Var.f23754k = t0Var;
        i0Var.f23756m = list;
        i0Var.f23757n = list;
        i0Var.f23758o = list;
        i0Var.f23759p = b1.f23573n;
        i0Var.f23762s = list;
        i0Var.f23763t = list;
        i0Var.f23764u = list;
        i0Var.f23765v = list;
        i0Var.f23766w = list;
        i0Var.f23767x = list;
        i0Var.f23768y = list;
        i0Var.f23769z = list;
        return i0Var;
    }

    @Override // ce.k
    public final ce.b c() {
        j0 j0VarG = g();
        if (j0VarG.b()) {
            return j0VarG;
        }
        throw new ce.j0();
    }

    public final Object clone() {
        i0 i0VarH = h();
        i0VarH.i(g());
        return i0VarH;
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
            wd.a r1 = wd.j0.D     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            wd.j0 r1 = new wd.j0     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            ce.b r4 = r3.f3972a     // Catch: java.lang.Throwable -> Lf
            wd.j0 r4 = (wd.j0) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: wd.i0.d(ce.f, ce.i):ce.k");
    }

    @Override // ce.k
    public final /* bridge */ /* synthetic */ ce.k e(ce.p pVar) {
        i((j0) pVar);
        return this;
    }

    public final j0 g() {
        j0 j0Var = new j0(this);
        int i10 = this.f23747d;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        j0Var.f23779d = this.f23748e;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        j0Var.f23780e = this.f23749f;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        j0Var.f23781f = this.f23750g;
        if ((i10 & 8) == 8) {
            i11 |= 8;
        }
        j0Var.f23782g = this.f23751h;
        if ((i10 & 16) == 16) {
            i11 |= 16;
        }
        j0Var.f23783h = this.f23752i;
        if ((i10 & 32) == 32) {
            this.f23753j = Collections.unmodifiableList(this.f23753j);
            this.f23747d &= -33;
        }
        j0Var.f23784i = this.f23753j;
        if ((i10 & 64) == 64) {
            i11 |= 32;
        }
        j0Var.f23785j = this.f23754k;
        if ((i10 & 128) == 128) {
            i11 |= 64;
        }
        j0Var.f23786k = this.f23755l;
        if ((this.f23747d & 256) == 256) {
            this.f23756m = Collections.unmodifiableList(this.f23756m);
            this.f23747d &= -257;
        }
        j0Var.f23787l = this.f23756m;
        if ((this.f23747d & 512) == 512) {
            this.f23757n = Collections.unmodifiableList(this.f23757n);
            this.f23747d &= -513;
        }
        j0Var.f23788m = this.f23757n;
        if ((this.f23747d & 1024) == 1024) {
            this.f23758o = Collections.unmodifiableList(this.f23758o);
            this.f23747d &= -1025;
        }
        j0Var.f23790o = this.f23758o;
        if ((i10 & 2048) == 2048) {
            i11 |= 128;
        }
        j0Var.f23791p = this.f23759p;
        if ((i10 & 4096) == 4096) {
            i11 |= 256;
        }
        j0Var.f23792q = this.f23760q;
        if ((i10 & 8192) == 8192) {
            i11 |= 512;
        }
        j0Var.f23793r = this.f23761r;
        if ((this.f23747d & 16384) == 16384) {
            this.f23762s = Collections.unmodifiableList(this.f23762s);
            this.f23747d &= -16385;
        }
        j0Var.f23794s = this.f23762s;
        if ((this.f23747d & 32768) == 32768) {
            this.f23763t = Collections.unmodifiableList(this.f23763t);
            this.f23747d &= -32769;
        }
        j0Var.f23795t = this.f23763t;
        if ((this.f23747d & 65536) == 65536) {
            this.f23764u = Collections.unmodifiableList(this.f23764u);
            this.f23747d &= -65537;
        }
        j0Var.f23796u = this.f23764u;
        if ((this.f23747d & 131072) == 131072) {
            this.f23765v = Collections.unmodifiableList(this.f23765v);
            this.f23747d &= -131073;
        }
        j0Var.f23797v = this.f23765v;
        if ((this.f23747d & 262144) == 262144) {
            this.f23766w = Collections.unmodifiableList(this.f23766w);
            this.f23747d &= -262145;
        }
        j0Var.f23798w = this.f23766w;
        if ((this.f23747d & 524288) == 524288) {
            this.f23767x = Collections.unmodifiableList(this.f23767x);
            this.f23747d &= -524289;
        }
        j0Var.f23799x = this.f23767x;
        if ((this.f23747d & 1048576) == 1048576) {
            this.f23768y = Collections.unmodifiableList(this.f23768y);
            this.f23747d &= -1048577;
        }
        j0Var.f23800y = this.f23768y;
        if ((this.f23747d & 2097152) == 2097152) {
            this.f23769z = Collections.unmodifiableList(this.f23769z);
            this.f23747d &= -2097153;
        }
        j0Var.f23801z = this.f23769z;
        j0Var.f23778c = i11;
        return j0Var;
    }

    public final void i(j0 j0Var) {
        b1 b1Var;
        t0 t0Var;
        t0 t0Var2;
        if (j0Var == j0.C) {
            return;
        }
        int i10 = j0Var.f23778c;
        if ((i10 & 1) == 1) {
            int i11 = j0Var.f23779d;
            this.f23747d = 1 | this.f23747d;
            this.f23748e = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = j0Var.f23780e;
            this.f23747d = 2 | this.f23747d;
            this.f23749f = i12;
        }
        if ((i10 & 4) == 4) {
            int i13 = j0Var.f23781f;
            this.f23747d = 4 | this.f23747d;
            this.f23750g = i13;
        }
        if ((i10 & 8) == 8) {
            t0 t0Var3 = j0Var.f23782g;
            if ((this.f23747d & 8) != 8 || (t0Var2 = this.f23751h) == t0.f23947t) {
                this.f23751h = t0Var3;
            } else {
                s0 s0VarR = t0.r(t0Var2);
                s0VarR.i(t0Var3);
                this.f23751h = s0VarR.g();
            }
            this.f23747d |= 8;
        }
        if ((j0Var.f23778c & 16) == 16) {
            int i14 = j0Var.f23783h;
            this.f23747d = 16 | this.f23747d;
            this.f23752i = i14;
        }
        if (!j0Var.f23784i.isEmpty()) {
            if (this.f23753j.isEmpty()) {
                this.f23753j = j0Var.f23784i;
                this.f23747d &= -33;
            } else {
                if ((this.f23747d & 32) != 32) {
                    this.f23753j = new ArrayList(this.f23753j);
                    this.f23747d |= 32;
                }
                this.f23753j.addAll(j0Var.f23784i);
            }
        }
        if ((j0Var.f23778c & 32) == 32) {
            t0 t0Var4 = j0Var.f23785j;
            if ((this.f23747d & 64) != 64 || (t0Var = this.f23754k) == t0.f23947t) {
                this.f23754k = t0Var4;
            } else {
                s0 s0VarR2 = t0.r(t0Var);
                s0VarR2.i(t0Var4);
                this.f23754k = s0VarR2.g();
            }
            this.f23747d |= 64;
        }
        if ((j0Var.f23778c & 64) == 64) {
            int i15 = j0Var.f23786k;
            this.f23747d |= 128;
            this.f23755l = i15;
        }
        if (!j0Var.f23787l.isEmpty()) {
            if (this.f23756m.isEmpty()) {
                this.f23756m = j0Var.f23787l;
                this.f23747d &= -257;
            } else {
                if ((this.f23747d & 256) != 256) {
                    this.f23756m = new ArrayList(this.f23756m);
                    this.f23747d |= 256;
                }
                this.f23756m.addAll(j0Var.f23787l);
            }
        }
        if (!j0Var.f23788m.isEmpty()) {
            if (this.f23757n.isEmpty()) {
                this.f23757n = j0Var.f23788m;
                this.f23747d &= -513;
            } else {
                if ((this.f23747d & 512) != 512) {
                    this.f23757n = new ArrayList(this.f23757n);
                    this.f23747d |= 512;
                }
                this.f23757n.addAll(j0Var.f23788m);
            }
        }
        if (!j0Var.f23790o.isEmpty()) {
            if (this.f23758o.isEmpty()) {
                this.f23758o = j0Var.f23790o;
                this.f23747d &= -1025;
            } else {
                if ((this.f23747d & 1024) != 1024) {
                    this.f23758o = new ArrayList(this.f23758o);
                    this.f23747d |= 1024;
                }
                this.f23758o.addAll(j0Var.f23790o);
            }
        }
        if ((j0Var.f23778c & 128) == 128) {
            b1 b1Var2 = j0Var.f23791p;
            if ((this.f23747d & 2048) != 2048 || (b1Var = this.f23759p) == b1.f23573n) {
                this.f23759p = b1Var2;
            } else {
                a1 a1VarH = a1.h();
                a1VarH.i(b1Var);
                a1VarH.i(b1Var2);
                this.f23759p = a1VarH.g();
            }
            this.f23747d |= 2048;
        }
        int i16 = j0Var.f23778c;
        if ((i16 & 256) == 256) {
            int i17 = j0Var.f23792q;
            this.f23747d |= 4096;
            this.f23760q = i17;
        }
        if ((i16 & 512) == 512) {
            int i18 = j0Var.f23793r;
            this.f23747d |= 8192;
            this.f23761r = i18;
        }
        if (!j0Var.f23794s.isEmpty()) {
            if (this.f23762s.isEmpty()) {
                this.f23762s = j0Var.f23794s;
                this.f23747d &= -16385;
            } else {
                if ((this.f23747d & 16384) != 16384) {
                    this.f23762s = new ArrayList(this.f23762s);
                    this.f23747d |= 16384;
                }
                this.f23762s.addAll(j0Var.f23794s);
            }
        }
        if (!j0Var.f23795t.isEmpty()) {
            if (this.f23763t.isEmpty()) {
                this.f23763t = j0Var.f23795t;
                this.f23747d &= -32769;
            } else {
                if ((this.f23747d & 32768) != 32768) {
                    this.f23763t = new ArrayList(this.f23763t);
                    this.f23747d |= 32768;
                }
                this.f23763t.addAll(j0Var.f23795t);
            }
        }
        if (!j0Var.f23796u.isEmpty()) {
            if (this.f23764u.isEmpty()) {
                this.f23764u = j0Var.f23796u;
                this.f23747d &= -65537;
            } else {
                if ((this.f23747d & 65536) != 65536) {
                    this.f23764u = new ArrayList(this.f23764u);
                    this.f23747d |= 65536;
                }
                this.f23764u.addAll(j0Var.f23796u);
            }
        }
        if (!j0Var.f23797v.isEmpty()) {
            if (this.f23765v.isEmpty()) {
                this.f23765v = j0Var.f23797v;
                this.f23747d &= -131073;
            } else {
                if ((this.f23747d & 131072) != 131072) {
                    this.f23765v = new ArrayList(this.f23765v);
                    this.f23747d |= 131072;
                }
                this.f23765v.addAll(j0Var.f23797v);
            }
        }
        if (!j0Var.f23798w.isEmpty()) {
            if (this.f23766w.isEmpty()) {
                this.f23766w = j0Var.f23798w;
                this.f23747d &= -262145;
            } else {
                if ((this.f23747d & 262144) != 262144) {
                    this.f23766w = new ArrayList(this.f23766w);
                    this.f23747d |= 262144;
                }
                this.f23766w.addAll(j0Var.f23798w);
            }
        }
        if (!j0Var.f23799x.isEmpty()) {
            if (this.f23767x.isEmpty()) {
                this.f23767x = j0Var.f23799x;
                this.f23747d &= -524289;
            } else {
                if ((this.f23747d & 524288) != 524288) {
                    this.f23767x = new ArrayList(this.f23767x);
                    this.f23747d |= 524288;
                }
                this.f23767x.addAll(j0Var.f23799x);
            }
        }
        if (!j0Var.f23800y.isEmpty()) {
            if (this.f23768y.isEmpty()) {
                this.f23768y = j0Var.f23800y;
                this.f23747d &= -1048577;
            } else {
                if ((this.f23747d & 1048576) != 1048576) {
                    this.f23768y = new ArrayList(this.f23768y);
                    this.f23747d |= 1048576;
                }
                this.f23768y.addAll(j0Var.f23800y);
            }
        }
        if (!j0Var.f23801z.isEmpty()) {
            if (this.f23769z.isEmpty()) {
                this.f23769z = j0Var.f23801z;
                this.f23747d &= -2097153;
            } else {
                if ((this.f23747d & 2097152) != 2097152) {
                    this.f23769z = new ArrayList(this.f23769z);
                    this.f23747d |= 2097152;
                }
                this.f23769z.addAll(j0Var.f23801z);
            }
        }
        f(j0Var);
        this.f3948a = this.f3948a.i(j0Var.f23777b);
    }
}
