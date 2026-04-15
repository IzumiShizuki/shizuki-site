package wd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends ce.l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o0 f23694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n0 f23695f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f0 f23696g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f23697h;

    public static g0 h() {
        g0 g0Var = new g0();
        g0Var.f23694e = o0.f23879e;
        g0Var.f23695f = n0.f23870e;
        g0Var.f23696g = f0.f23666k;
        g0Var.f23697h = Collections.EMPTY_LIST;
        return g0Var;
    }

    @Override // ce.k
    public final ce.b c() {
        h0 h0VarG = g();
        if (h0VarG.b()) {
            return h0VarG;
        }
        throw new ce.j0();
    }

    public final Object clone() {
        g0 g0VarH = h();
        g0VarH.i(g());
        return g0VarH;
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
            wd.a r1 = wd.h0.f23713k     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            wd.h0 r1 = new wd.h0     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            ce.b r4 = r3.f3972a     // Catch: java.lang.Throwable -> Lf
            wd.h0 r4 = (wd.h0) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: wd.g0.d(ce.f, ce.i):ce.k");
    }

    @Override // ce.k
    public final /* bridge */ /* synthetic */ ce.k e(ce.p pVar) {
        i((h0) pVar);
        return this;
    }

    public final h0 g() {
        h0 h0Var = new h0(this);
        int i10 = this.f23693d;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        h0Var.f23716d = this.f23694e;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        h0Var.f23717e = this.f23695f;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        h0Var.f23718f = this.f23696g;
        if ((i10 & 8) == 8) {
            this.f23697h = Collections.unmodifiableList(this.f23697h);
            this.f23693d &= -9;
        }
        h0Var.f23719g = this.f23697h;
        h0Var.f23715c = i11;
        return h0Var;
    }

    public final void i(h0 h0Var) {
        f0 f0Var;
        n0 n0Var;
        o0 o0Var;
        if (h0Var == h0.f23712j) {
            return;
        }
        if ((h0Var.f23715c & 1) == 1) {
            o0 o0Var2 = h0Var.f23716d;
            if ((this.f23693d & 1) != 1 || (o0Var = this.f23694e) == o0.f23879e) {
                this.f23694e = o0Var2;
            } else {
                o oVar = new o(3);
                oVar.f23878d = ce.t.f3984b;
                oVar.l(o0Var);
                oVar.l(o0Var2);
                this.f23694e = oVar.h();
            }
            this.f23693d |= 1;
        }
        if ((h0Var.f23715c & 2) == 2) {
            n0 n0Var2 = h0Var.f23717e;
            if ((this.f23693d & 2) != 2 || (n0Var = this.f23695f) == n0.f23870e) {
                this.f23695f = n0Var2;
            } else {
                o oVar2 = new o(1);
                oVar2.f23878d = Collections.EMPTY_LIST;
                oVar2.k(n0Var);
                oVar2.k(n0Var2);
                this.f23695f = oVar2.g();
            }
            this.f23693d |= 2;
        }
        if ((h0Var.f23715c & 4) == 4) {
            f0 f0Var2 = h0Var.f23718f;
            if ((this.f23693d & 4) != 4 || (f0Var = this.f23696g) == f0.f23666k) {
                this.f23696g = f0Var2;
            } else {
                e0 e0VarH = e0.h();
                e0VarH.i(f0Var);
                e0VarH.i(f0Var2);
                this.f23696g = e0VarH.g();
            }
            this.f23693d |= 4;
        }
        if (!h0Var.f23719g.isEmpty()) {
            if (this.f23697h.isEmpty()) {
                this.f23697h = h0Var.f23719g;
                this.f23693d &= -9;
            } else {
                if ((this.f23693d & 8) != 8) {
                    this.f23697h = new ArrayList(this.f23697h);
                    this.f23693d |= 8;
                }
                this.f23697h.addAll(h0Var.f23719g);
            }
        }
        f(h0Var);
        this.f3948a = this.f3948a.i(h0Var.f23714b);
    }
}
