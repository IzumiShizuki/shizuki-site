package wd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o extends ce.k implements ce.x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f23878d;

    public /* synthetic */ o(int i10) {
        this.f23876b = i10;
    }

    @Override // ce.k
    public final ce.b c() {
        switch (this.f23876b) {
            case 0:
                p pVarF = f();
                if (pVarF.b()) {
                    return pVarF;
                }
                throw new ce.j0();
            case 1:
                n0 n0VarG = g();
                if (n0VarG.b()) {
                    return n0VarG;
                }
                throw new ce.j0();
            case 2:
                g1 g1VarI = i();
                g1VarI.b();
                return g1VarI;
            default:
                o0 o0VarH = h();
                o0VarH.b();
                return o0VarH;
        }
    }

    public final Object clone() {
        switch (this.f23876b) {
            case 0:
                o oVar = new o(0);
                oVar.f23878d = Collections.EMPTY_LIST;
                oVar.j(f());
                return oVar;
            case 1:
                o oVar2 = new o(1);
                oVar2.f23878d = Collections.EMPTY_LIST;
                oVar2.k(g());
                return oVar2;
            case 2:
                o oVar3 = new o(2);
                oVar3.f23878d = Collections.EMPTY_LIST;
                oVar3.m(i());
                return oVar3;
            default:
                o oVar4 = new o(3);
                oVar4.f23878d = ce.t.f3984b;
                oVar4.l(h());
                return oVar4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x007d  */
    @Override // ce.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ce.k d(ce.f r3, ce.i r4) throws java.lang.Throwable {
        /*
            r2 = this;
            int r0 = r2.f23876b
            switch(r0) {
                case 0: goto L62;
                case 1: goto L43;
                case 2: goto L24;
                default: goto L5;
            }
        L5:
            r4 = 0
            wd.a r0 = wd.o0.f23880f     // Catch: java.lang.Throwable -> L14 ce.s -> L16
            r0.getClass()     // Catch: java.lang.Throwable -> L14 ce.s -> L16
            wd.o0 r0 = new wd.o0     // Catch: java.lang.Throwable -> L14 ce.s -> L16
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L14 ce.s -> L16
            r2.l(r0)
            return r2
        L14:
            r3 = move-exception
            goto L1e
        L16:
            r3 = move-exception
            ce.b r0 = r3.f3972a     // Catch: java.lang.Throwable -> L14
            wd.o0 r0 = (wd.o0) r0     // Catch: java.lang.Throwable -> L14
            throw r3     // Catch: java.lang.Throwable -> L1c
        L1c:
            r3 = move-exception
            r4 = r0
        L1e:
            if (r4 == 0) goto L23
            r2.l(r4)
        L23:
            throw r3
        L24:
            r0 = 0
            wd.a r1 = wd.g1.f23699f     // Catch: java.lang.Throwable -> L33 ce.s -> L35
            r1.getClass()     // Catch: java.lang.Throwable -> L33 ce.s -> L35
            wd.g1 r1 = new wd.g1     // Catch: java.lang.Throwable -> L33 ce.s -> L35
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L33 ce.s -> L35
            r2.m(r1)
            return r2
        L33:
            r3 = move-exception
            goto L3d
        L35:
            r3 = move-exception
            ce.b r4 = r3.f3972a     // Catch: java.lang.Throwable -> L33
            wd.g1 r4 = (wd.g1) r4     // Catch: java.lang.Throwable -> L33
            throw r3     // Catch: java.lang.Throwable -> L3b
        L3b:
            r3 = move-exception
            r0 = r4
        L3d:
            if (r0 == 0) goto L42
            r2.m(r0)
        L42:
            throw r3
        L43:
            r0 = 0
            wd.a r1 = wd.n0.f23871f     // Catch: java.lang.Throwable -> L52 ce.s -> L54
            r1.getClass()     // Catch: java.lang.Throwable -> L52 ce.s -> L54
            wd.n0 r1 = new wd.n0     // Catch: java.lang.Throwable -> L52 ce.s -> L54
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L52 ce.s -> L54
            r2.k(r1)
            return r2
        L52:
            r3 = move-exception
            goto L5c
        L54:
            r3 = move-exception
            ce.b r4 = r3.f3972a     // Catch: java.lang.Throwable -> L52
            wd.n0 r4 = (wd.n0) r4     // Catch: java.lang.Throwable -> L52
            throw r3     // Catch: java.lang.Throwable -> L5a
        L5a:
            r3 = move-exception
            r0 = r4
        L5c:
            if (r0 == 0) goto L61
            r2.k(r0)
        L61:
            throw r3
        L62:
            r0 = 0
            wd.a r1 = wd.p.f23886f     // Catch: java.lang.Throwable -> L71 ce.s -> L73
            r1.getClass()     // Catch: java.lang.Throwable -> L71 ce.s -> L73
            wd.p r1 = new wd.p     // Catch: java.lang.Throwable -> L71 ce.s -> L73
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L71 ce.s -> L73
            r2.j(r1)
            return r2
        L71:
            r3 = move-exception
            goto L7b
        L73:
            r3 = move-exception
            ce.b r4 = r3.f3972a     // Catch: java.lang.Throwable -> L71
            wd.p r4 = (wd.p) r4     // Catch: java.lang.Throwable -> L71
            throw r3     // Catch: java.lang.Throwable -> L79
        L79:
            r3 = move-exception
            r0 = r4
        L7b:
            if (r0 == 0) goto L80
            r2.j(r0)
        L80:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: wd.o.d(ce.f, ce.i):ce.k");
    }

    @Override // ce.k
    public final /* bridge */ /* synthetic */ ce.k e(ce.p pVar) {
        switch (this.f23876b) {
            case 0:
                j((p) pVar);
                break;
            case 1:
                k((n0) pVar);
                break;
            case 2:
                m((g1) pVar);
                break;
            default:
                l((o0) pVar);
                break;
        }
        return this;
    }

    public p f() {
        p pVar = new p(this);
        if ((this.f23877c & 1) == 1) {
            this.f23878d = Collections.unmodifiableList(this.f23878d);
            this.f23877c &= -2;
        }
        pVar.f23888b = this.f23878d;
        return pVar;
    }

    public n0 g() {
        n0 n0Var = new n0(this);
        if ((this.f23877c & 1) == 1) {
            this.f23878d = Collections.unmodifiableList(this.f23878d);
            this.f23877c &= -2;
        }
        n0Var.f23873b = this.f23878d;
        return n0Var;
    }

    public o0 h() {
        o0 o0Var = new o0(this);
        if ((this.f23877c & 1) == 1) {
            this.f23878d = ((ce.u) this.f23878d).h();
            this.f23877c &= -2;
        }
        o0Var.f23882b = (ce.u) this.f23878d;
        return o0Var;
    }

    public g1 i() {
        g1 g1Var = new g1(this);
        if ((this.f23877c & 1) == 1) {
            this.f23878d = Collections.unmodifiableList(this.f23878d);
            this.f23877c &= -2;
        }
        g1Var.f23701b = this.f23878d;
        return g1Var;
    }

    public void j(p pVar) {
        if (pVar == p.f23885e) {
            return;
        }
        if (!pVar.f23888b.isEmpty()) {
            if (this.f23878d.isEmpty()) {
                this.f23878d = pVar.f23888b;
                this.f23877c &= -2;
            } else {
                if ((this.f23877c & 1) != 1) {
                    this.f23878d = new ArrayList(this.f23878d);
                    this.f23877c |= 1;
                }
                this.f23878d.addAll(pVar.f23888b);
            }
        }
        this.f3948a = this.f3948a.i(pVar.f23887a);
    }

    public void k(n0 n0Var) {
        if (n0Var == n0.f23870e) {
            return;
        }
        if (!n0Var.f23873b.isEmpty()) {
            if (this.f23878d.isEmpty()) {
                this.f23878d = n0Var.f23873b;
                this.f23877c &= -2;
            } else {
                if ((this.f23877c & 1) != 1) {
                    this.f23878d = new ArrayList(this.f23878d);
                    this.f23877c |= 1;
                }
                this.f23878d.addAll(n0Var.f23873b);
            }
        }
        this.f3948a = this.f3948a.i(n0Var.f23872a);
    }

    public void l(o0 o0Var) {
        if (o0Var == o0.f23879e) {
            return;
        }
        if (!o0Var.f23882b.isEmpty()) {
            if (((ce.u) this.f23878d).isEmpty()) {
                this.f23878d = o0Var.f23882b;
                this.f23877c &= -2;
            } else {
                if ((this.f23877c & 1) != 1) {
                    this.f23878d = new ce.t((ce.u) this.f23878d);
                    this.f23877c |= 1;
                }
                ((ce.u) this.f23878d).addAll(o0Var.f23882b);
            }
        }
        this.f3948a = this.f3948a.i(o0Var.f23881a);
    }

    public void m(g1 g1Var) {
        if (g1Var == g1.f23698e) {
            return;
        }
        if (!g1Var.f23701b.isEmpty()) {
            if (this.f23878d.isEmpty()) {
                this.f23878d = g1Var.f23701b;
                this.f23877c &= -2;
            } else {
                if ((this.f23877c & 1) != 1) {
                    this.f23878d = new ArrayList(this.f23878d);
                    this.f23877c |= 1;
                }
                this.f23878d.addAll(g1Var.f23701b);
            }
        }
        this.f3948a = this.f3948a.i(g1Var.f23700a);
    }
}
