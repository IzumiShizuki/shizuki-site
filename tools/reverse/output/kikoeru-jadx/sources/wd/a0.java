package wd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends ce.l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23518f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23519g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public t0 f23520h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23521i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f23522j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public t0 f23523k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f23524l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f23525m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f23526n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f23527o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f23528p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public z0 f23529q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List f23530r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p f23531s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public List f23532t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public List f23533u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List f23534v;

    public static a0 h() {
        a0 a0Var = new a0();
        a0Var.f23517e = 6;
        a0Var.f23518f = 6;
        t0 t0Var = t0.f23947t;
        a0Var.f23520h = t0Var;
        List list = Collections.EMPTY_LIST;
        a0Var.f23522j = list;
        a0Var.f23523k = t0Var;
        a0Var.f23525m = list;
        a0Var.f23526n = list;
        a0Var.f23527o = list;
        a0Var.f23528p = list;
        a0Var.f23529q = z0.f24067g;
        a0Var.f23530r = list;
        a0Var.f23531s = p.f23885e;
        a0Var.f23532t = list;
        a0Var.f23533u = list;
        a0Var.f23534v = list;
        return a0Var;
    }

    @Override // ce.k
    public final ce.b c() {
        b0 b0VarG = g();
        if (b0VarG.b()) {
            return b0VarG;
        }
        throw new ce.j0();
    }

    public final Object clone() {
        a0 a0VarH = h();
        a0VarH.i(g());
        return a0VarH;
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
            wd.a r1 = wd.b0.f23549z     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            wd.b0 r1 = new wd.b0     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            ce.b r4 = r3.f3972a     // Catch: java.lang.Throwable -> Lf
            wd.b0 r4 = (wd.b0) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: wd.a0.d(ce.f, ce.i):ce.k");
    }

    @Override // ce.k
    public final /* bridge */ /* synthetic */ ce.k e(ce.p pVar) {
        i((b0) pVar);
        return this;
    }

    public final b0 g() {
        b0 b0Var = new b0(this);
        int i10 = this.f23516d;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        b0Var.f23552d = this.f23517e;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        b0Var.f23553e = this.f23518f;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        b0Var.f23554f = this.f23519g;
        if ((i10 & 8) == 8) {
            i11 |= 8;
        }
        b0Var.f23555g = this.f23520h;
        if ((i10 & 16) == 16) {
            i11 |= 16;
        }
        b0Var.f23556h = this.f23521i;
        if ((i10 & 32) == 32) {
            this.f23522j = Collections.unmodifiableList(this.f23522j);
            this.f23516d &= -33;
        }
        b0Var.f23557i = this.f23522j;
        if ((i10 & 64) == 64) {
            i11 |= 32;
        }
        b0Var.f23558j = this.f23523k;
        if ((i10 & 128) == 128) {
            i11 |= 64;
        }
        b0Var.f23559k = this.f23524l;
        if ((this.f23516d & 256) == 256) {
            this.f23525m = Collections.unmodifiableList(this.f23525m);
            this.f23516d &= -257;
        }
        b0Var.f23560l = this.f23525m;
        if ((this.f23516d & 512) == 512) {
            this.f23526n = Collections.unmodifiableList(this.f23526n);
            this.f23516d &= -513;
        }
        b0Var.f23561m = this.f23526n;
        if ((this.f23516d & 1024) == 1024) {
            this.f23527o = Collections.unmodifiableList(this.f23527o);
            this.f23516d &= -1025;
        }
        b0Var.f23563o = this.f23527o;
        if ((this.f23516d & 2048) == 2048) {
            this.f23528p = Collections.unmodifiableList(this.f23528p);
            this.f23516d &= -2049;
        }
        b0Var.f23564p = this.f23528p;
        if ((i10 & 4096) == 4096) {
            i11 |= 128;
        }
        b0Var.f23565q = this.f23529q;
        if ((this.f23516d & 8192) == 8192) {
            this.f23530r = Collections.unmodifiableList(this.f23530r);
            this.f23516d &= -8193;
        }
        b0Var.f23566r = this.f23530r;
        if ((i10 & 16384) == 16384) {
            i11 |= 256;
        }
        b0Var.f23567s = this.f23531s;
        if ((this.f23516d & 32768) == 32768) {
            this.f23532t = Collections.unmodifiableList(this.f23532t);
            this.f23516d &= -32769;
        }
        b0Var.f23568t = this.f23532t;
        if ((this.f23516d & 65536) == 65536) {
            this.f23533u = Collections.unmodifiableList(this.f23533u);
            this.f23516d &= -65537;
        }
        b0Var.f23569u = this.f23533u;
        if ((this.f23516d & 131072) == 131072) {
            this.f23534v = Collections.unmodifiableList(this.f23534v);
            this.f23516d &= -131073;
        }
        b0Var.f23570v = this.f23534v;
        b0Var.f23551c = i11;
        return b0Var;
    }

    public final void i(b0 b0Var) {
        p pVar;
        z0 z0Var;
        t0 t0Var;
        t0 t0Var2;
        if (b0Var == b0.f23548y) {
            return;
        }
        int i10 = b0Var.f23551c;
        if ((i10 & 1) == 1) {
            int i11 = b0Var.f23552d;
            this.f23516d = 1 | this.f23516d;
            this.f23517e = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = b0Var.f23553e;
            this.f23516d = 2 | this.f23516d;
            this.f23518f = i12;
        }
        if ((i10 & 4) == 4) {
            int i13 = b0Var.f23554f;
            this.f23516d = 4 | this.f23516d;
            this.f23519g = i13;
        }
        if ((i10 & 8) == 8) {
            t0 t0Var3 = b0Var.f23555g;
            if ((this.f23516d & 8) != 8 || (t0Var2 = this.f23520h) == t0.f23947t) {
                this.f23520h = t0Var3;
            } else {
                s0 s0VarR = t0.r(t0Var2);
                s0VarR.i(t0Var3);
                this.f23520h = s0VarR.g();
            }
            this.f23516d |= 8;
        }
        if ((b0Var.f23551c & 16) == 16) {
            int i14 = b0Var.f23556h;
            this.f23516d = 16 | this.f23516d;
            this.f23521i = i14;
        }
        if (!b0Var.f23557i.isEmpty()) {
            if (this.f23522j.isEmpty()) {
                this.f23522j = b0Var.f23557i;
                this.f23516d &= -33;
            } else {
                if ((this.f23516d & 32) != 32) {
                    this.f23522j = new ArrayList(this.f23522j);
                    this.f23516d |= 32;
                }
                this.f23522j.addAll(b0Var.f23557i);
            }
        }
        if ((b0Var.f23551c & 32) == 32) {
            t0 t0Var4 = b0Var.f23558j;
            if ((this.f23516d & 64) != 64 || (t0Var = this.f23523k) == t0.f23947t) {
                this.f23523k = t0Var4;
            } else {
                s0 s0VarR2 = t0.r(t0Var);
                s0VarR2.i(t0Var4);
                this.f23523k = s0VarR2.g();
            }
            this.f23516d |= 64;
        }
        if ((b0Var.f23551c & 64) == 64) {
            int i15 = b0Var.f23559k;
            this.f23516d |= 128;
            this.f23524l = i15;
        }
        if (!b0Var.f23560l.isEmpty()) {
            if (this.f23525m.isEmpty()) {
                this.f23525m = b0Var.f23560l;
                this.f23516d &= -257;
            } else {
                if ((this.f23516d & 256) != 256) {
                    this.f23525m = new ArrayList(this.f23525m);
                    this.f23516d |= 256;
                }
                this.f23525m.addAll(b0Var.f23560l);
            }
        }
        if (!b0Var.f23561m.isEmpty()) {
            if (this.f23526n.isEmpty()) {
                this.f23526n = b0Var.f23561m;
                this.f23516d &= -513;
            } else {
                if ((this.f23516d & 512) != 512) {
                    this.f23526n = new ArrayList(this.f23526n);
                    this.f23516d |= 512;
                }
                this.f23526n.addAll(b0Var.f23561m);
            }
        }
        if (!b0Var.f23563o.isEmpty()) {
            if (this.f23527o.isEmpty()) {
                this.f23527o = b0Var.f23563o;
                this.f23516d &= -1025;
            } else {
                if ((this.f23516d & 1024) != 1024) {
                    this.f23527o = new ArrayList(this.f23527o);
                    this.f23516d |= 1024;
                }
                this.f23527o.addAll(b0Var.f23563o);
            }
        }
        if (!b0Var.f23564p.isEmpty()) {
            if (this.f23528p.isEmpty()) {
                this.f23528p = b0Var.f23564p;
                this.f23516d &= -2049;
            } else {
                if ((this.f23516d & 2048) != 2048) {
                    this.f23528p = new ArrayList(this.f23528p);
                    this.f23516d |= 2048;
                }
                this.f23528p.addAll(b0Var.f23564p);
            }
        }
        if ((b0Var.f23551c & 128) == 128) {
            z0 z0Var2 = b0Var.f23565q;
            if ((this.f23516d & 4096) != 4096 || (z0Var = this.f23529q) == z0.f24067g) {
                this.f23529q = z0Var2;
            } else {
                g gVarI = z0.i(z0Var);
                gVarI.j(z0Var2);
                this.f23529q = gVarI.g();
            }
            this.f23516d |= 4096;
        }
        if (!b0Var.f23566r.isEmpty()) {
            if (this.f23530r.isEmpty()) {
                this.f23530r = b0Var.f23566r;
                this.f23516d &= -8193;
            } else {
                if ((this.f23516d & 8192) != 8192) {
                    this.f23530r = new ArrayList(this.f23530r);
                    this.f23516d |= 8192;
                }
                this.f23530r.addAll(b0Var.f23566r);
            }
        }
        if ((b0Var.f23551c & 256) == 256) {
            p pVar2 = b0Var.f23567s;
            if ((this.f23516d & 16384) != 16384 || (pVar = this.f23531s) == p.f23885e) {
                this.f23531s = pVar2;
            } else {
                o oVar = new o(0);
                oVar.f23878d = Collections.EMPTY_LIST;
                oVar.j(pVar);
                oVar.j(pVar2);
                this.f23531s = oVar.f();
            }
            this.f23516d |= 16384;
        }
        if (!b0Var.f23568t.isEmpty()) {
            if (this.f23532t.isEmpty()) {
                this.f23532t = b0Var.f23568t;
                this.f23516d &= -32769;
            } else {
                if ((this.f23516d & 32768) != 32768) {
                    this.f23532t = new ArrayList(this.f23532t);
                    this.f23516d |= 32768;
                }
                this.f23532t.addAll(b0Var.f23568t);
            }
        }
        if (!b0Var.f23569u.isEmpty()) {
            if (this.f23533u.isEmpty()) {
                this.f23533u = b0Var.f23569u;
                this.f23516d &= -65537;
            } else {
                if ((this.f23516d & 65536) != 65536) {
                    this.f23533u = new ArrayList(this.f23533u);
                    this.f23516d |= 65536;
                }
                this.f23533u.addAll(b0Var.f23569u);
            }
        }
        if (!b0Var.f23570v.isEmpty()) {
            if (this.f23534v.isEmpty()) {
                this.f23534v = b0Var.f23570v;
                this.f23516d &= -131073;
            } else {
                if ((this.f23516d & 131072) != 131072) {
                    this.f23534v = new ArrayList(this.f23534v);
                    this.f23516d |= 131072;
                }
                this.f23534v.addAll(b0Var.f23570v);
            }
        }
        f(b0Var);
        this.f3948a = this.f3948a.i(b0Var.f23550b);
    }
}
