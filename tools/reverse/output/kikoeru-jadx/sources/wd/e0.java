package wd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends ce.l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f23648e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f23649f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f23650g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public z0 f23651h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g1 f23652i;

    public static e0 h() {
        e0 e0Var = new e0();
        List list = Collections.EMPTY_LIST;
        e0Var.f23648e = list;
        e0Var.f23649f = list;
        e0Var.f23650g = list;
        e0Var.f23651h = z0.f24067g;
        e0Var.f23652i = g1.f23698e;
        return e0Var;
    }

    @Override // ce.k
    public final ce.b c() {
        f0 f0VarG = g();
        if (f0VarG.b()) {
            return f0VarG;
        }
        throw new ce.j0();
    }

    public final Object clone() {
        e0 e0VarH = h();
        e0VarH.i(g());
        return e0VarH;
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
            wd.a r1 = wd.f0.f23667l     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            wd.f0 r1 = new wd.f0     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            ce.b r4 = r3.f3972a     // Catch: java.lang.Throwable -> Lf
            wd.f0 r4 = (wd.f0) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: wd.e0.d(ce.f, ce.i):ce.k");
    }

    @Override // ce.k
    public final /* bridge */ /* synthetic */ ce.k e(ce.p pVar) {
        i((f0) pVar);
        return this;
    }

    public final f0 g() {
        f0 f0Var = new f0(this);
        int i10 = this.f23647d;
        if ((i10 & 1) == 1) {
            this.f23648e = Collections.unmodifiableList(this.f23648e);
            this.f23647d &= -2;
        }
        f0Var.f23670d = this.f23648e;
        if ((this.f23647d & 2) == 2) {
            this.f23649f = Collections.unmodifiableList(this.f23649f);
            this.f23647d &= -3;
        }
        f0Var.f23671e = this.f23649f;
        if ((this.f23647d & 4) == 4) {
            this.f23650g = Collections.unmodifiableList(this.f23650g);
            this.f23647d &= -5;
        }
        f0Var.f23672f = this.f23650g;
        int i11 = (i10 & 8) != 8 ? 0 : 1;
        f0Var.f23673g = this.f23651h;
        if ((i10 & 16) == 16) {
            i11 |= 2;
        }
        f0Var.f23674h = this.f23652i;
        f0Var.f23669c = i11;
        return f0Var;
    }

    public final void i(f0 f0Var) {
        g1 g1Var;
        z0 z0Var;
        if (f0Var == f0.f23666k) {
            return;
        }
        if (!f0Var.f23670d.isEmpty()) {
            if (this.f23648e.isEmpty()) {
                this.f23648e = f0Var.f23670d;
                this.f23647d &= -2;
            } else {
                if ((this.f23647d & 1) != 1) {
                    this.f23648e = new ArrayList(this.f23648e);
                    this.f23647d |= 1;
                }
                this.f23648e.addAll(f0Var.f23670d);
            }
        }
        if (!f0Var.f23671e.isEmpty()) {
            if (this.f23649f.isEmpty()) {
                this.f23649f = f0Var.f23671e;
                this.f23647d &= -3;
            } else {
                if ((this.f23647d & 2) != 2) {
                    this.f23649f = new ArrayList(this.f23649f);
                    this.f23647d |= 2;
                }
                this.f23649f.addAll(f0Var.f23671e);
            }
        }
        if (!f0Var.f23672f.isEmpty()) {
            if (this.f23650g.isEmpty()) {
                this.f23650g = f0Var.f23672f;
                this.f23647d &= -5;
            } else {
                if ((this.f23647d & 4) != 4) {
                    this.f23650g = new ArrayList(this.f23650g);
                    this.f23647d |= 4;
                }
                this.f23650g.addAll(f0Var.f23672f);
            }
        }
        if ((f0Var.f23669c & 1) == 1) {
            z0 z0Var2 = f0Var.f23673g;
            if ((this.f23647d & 8) != 8 || (z0Var = this.f23651h) == z0.f24067g) {
                this.f23651h = z0Var2;
            } else {
                g gVarI = z0.i(z0Var);
                gVarI.j(z0Var2);
                this.f23651h = gVarI.g();
            }
            this.f23647d |= 8;
        }
        if ((f0Var.f23669c & 2) == 2) {
            g1 g1Var2 = f0Var.f23674h;
            if ((this.f23647d & 16) != 16 || (g1Var = this.f23652i) == g1.f23698e) {
                this.f23652i = g1Var2;
            } else {
                o oVar = new o(2);
                oVar.f23878d = Collections.EMPTY_LIST;
                oVar.m(g1Var);
                oVar.m(g1Var2);
                this.f23652i = oVar.i();
            }
            this.f23647d |= 16;
        }
        f(f0Var);
        this.f3948a = this.f3948a.i(f0Var.f23668b);
    }
}
