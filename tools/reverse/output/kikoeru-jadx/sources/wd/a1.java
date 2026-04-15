package wd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends ce.l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23537f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public t0 f23538g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f23539h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public t0 f23540i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f23541j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f23542k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e f23543l;

    public static a1 h() {
        a1 a1Var = new a1();
        t0 t0Var = t0.f23947t;
        a1Var.f23538g = t0Var;
        a1Var.f23540i = t0Var;
        a1Var.f23542k = Collections.EMPTY_LIST;
        a1Var.f23543l = e.f23630p;
        return a1Var;
    }

    @Override // ce.k
    public final ce.b c() {
        b1 b1VarG = g();
        if (b1VarG.b()) {
            return b1VarG;
        }
        throw new ce.j0();
    }

    public final Object clone() {
        a1 a1VarH = h();
        a1VarH.i(g());
        return a1VarH;
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
            wd.a r1 = wd.b1.f23574o     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            wd.b1 r1 = new wd.b1     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            ce.b r4 = r3.f3972a     // Catch: java.lang.Throwable -> Lf
            wd.b1 r4 = (wd.b1) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: wd.a1.d(ce.f, ce.i):ce.k");
    }

    @Override // ce.k
    public final /* bridge */ /* synthetic */ ce.k e(ce.p pVar) {
        i((b1) pVar);
        return this;
    }

    public final b1 g() {
        b1 b1Var = new b1(this);
        int i10 = this.f23535d;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        b1Var.f23577d = this.f23536e;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        b1Var.f23578e = this.f23537f;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        b1Var.f23579f = this.f23538g;
        if ((i10 & 8) == 8) {
            i11 |= 8;
        }
        b1Var.f23580g = this.f23539h;
        if ((i10 & 16) == 16) {
            i11 |= 16;
        }
        b1Var.f23581h = this.f23540i;
        if ((i10 & 32) == 32) {
            i11 |= 32;
        }
        b1Var.f23582i = this.f23541j;
        if ((i10 & 64) == 64) {
            this.f23542k = Collections.unmodifiableList(this.f23542k);
            this.f23535d &= -65;
        }
        b1Var.f23583j = this.f23542k;
        if ((i10 & 128) == 128) {
            i11 |= 64;
        }
        b1Var.f23584k = this.f23543l;
        b1Var.f23576c = i11;
        return b1Var;
    }

    public final void i(b1 b1Var) {
        e eVar;
        t0 t0Var;
        t0 t0Var2;
        if (b1Var == b1.f23573n) {
            return;
        }
        int i10 = b1Var.f23576c;
        if ((i10 & 1) == 1) {
            int i11 = b1Var.f23577d;
            this.f23535d = 1 | this.f23535d;
            this.f23536e = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = b1Var.f23578e;
            this.f23535d = 2 | this.f23535d;
            this.f23537f = i12;
        }
        if ((i10 & 4) == 4) {
            t0 t0Var3 = b1Var.f23579f;
            if ((this.f23535d & 4) != 4 || (t0Var2 = this.f23538g) == t0.f23947t) {
                this.f23538g = t0Var3;
            } else {
                s0 s0VarR = t0.r(t0Var2);
                s0VarR.i(t0Var3);
                this.f23538g = s0VarR.g();
            }
            this.f23535d |= 4;
        }
        int i13 = b1Var.f23576c;
        if ((i13 & 8) == 8) {
            int i14 = b1Var.f23580g;
            this.f23535d = 8 | this.f23535d;
            this.f23539h = i14;
        }
        if ((i13 & 16) == 16) {
            t0 t0Var4 = b1Var.f23581h;
            if ((this.f23535d & 16) != 16 || (t0Var = this.f23540i) == t0.f23947t) {
                this.f23540i = t0Var4;
            } else {
                s0 s0VarR2 = t0.r(t0Var);
                s0VarR2.i(t0Var4);
                this.f23540i = s0VarR2.g();
            }
            this.f23535d |= 16;
        }
        if ((b1Var.f23576c & 32) == 32) {
            int i15 = b1Var.f23582i;
            this.f23535d = 32 | this.f23535d;
            this.f23541j = i15;
        }
        if (!b1Var.f23583j.isEmpty()) {
            if (this.f23542k.isEmpty()) {
                this.f23542k = b1Var.f23583j;
                this.f23535d &= -65;
            } else {
                if ((this.f23535d & 64) != 64) {
                    this.f23542k = new ArrayList(this.f23542k);
                    this.f23535d |= 64;
                }
                this.f23542k.addAll(b1Var.f23583j);
            }
        }
        if ((b1Var.f23576c & 64) == 64) {
            e eVar2 = b1Var.f23584k;
            if ((this.f23535d & 128) != 128 || (eVar = this.f23543l) == e.f23630p) {
                this.f23543l = eVar2;
            } else {
                c cVarJ = e.j(eVar);
                cVarJ.h(eVar2);
                this.f23543l = cVarJ.f();
            }
            this.f23535d |= 128;
        }
        f(b1Var);
        this.f3948a = this.f3948a.i(b1Var.f23575b);
    }
}
