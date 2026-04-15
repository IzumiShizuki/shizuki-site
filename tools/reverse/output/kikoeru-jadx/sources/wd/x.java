package wd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x extends ce.k implements ce.x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y f24026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t0 f24027f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24028g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f24029h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f24030i;

    public static x g() {
        x xVar = new x();
        xVar.f24026e = y.f24036b;
        xVar.f24027f = t0.f23947t;
        List list = Collections.EMPTY_LIST;
        xVar.f24029h = list;
        xVar.f24030i = list;
        return xVar;
    }

    @Override // ce.k
    public final ce.b c() {
        z zVarF = f();
        if (zVarF.b()) {
            return zVarF;
        }
        throw new ce.j0();
    }

    public final Object clone() {
        x xVarG = g();
        xVarG.h(f());
        return xVarG;
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
            wd.a r1 = wd.z.f24055m     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            wd.z r1 = new wd.z     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r2.h(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            ce.b r4 = r3.f3972a     // Catch: java.lang.Throwable -> Lf
            wd.z r4 = (wd.z) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.h(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: wd.x.d(ce.f, ce.i):ce.k");
    }

    @Override // ce.k
    public final /* bridge */ /* synthetic */ ce.k e(ce.p pVar) {
        h((z) pVar);
        return this;
    }

    public final z f() {
        z zVar = new z(this);
        int i10 = this.f24023b;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        zVar.f24058c = this.f24024c;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        zVar.f24059d = this.f24025d;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        zVar.f24060e = this.f24026e;
        if ((i10 & 8) == 8) {
            i11 |= 8;
        }
        zVar.f24061f = this.f24027f;
        if ((i10 & 16) == 16) {
            i11 |= 16;
        }
        zVar.f24062g = this.f24028g;
        if ((i10 & 32) == 32) {
            this.f24029h = Collections.unmodifiableList(this.f24029h);
            this.f24023b &= -33;
        }
        zVar.f24063h = this.f24029h;
        if ((this.f24023b & 64) == 64) {
            this.f24030i = Collections.unmodifiableList(this.f24030i);
            this.f24023b &= -65;
        }
        zVar.f24064i = this.f24030i;
        zVar.f24057b = i11;
        return zVar;
    }

    public final void h(z zVar) {
        t0 t0Var;
        if (zVar == z.f24054l) {
            return;
        }
        int i10 = zVar.f24057b;
        if ((i10 & 1) == 1) {
            int i11 = zVar.f24058c;
            this.f24023b = 1 | this.f24023b;
            this.f24024c = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = zVar.f24059d;
            this.f24023b = 2 | this.f24023b;
            this.f24025d = i12;
        }
        if ((i10 & 4) == 4) {
            y yVar = zVar.f24060e;
            yVar.getClass();
            this.f24023b = 4 | this.f24023b;
            this.f24026e = yVar;
        }
        if ((zVar.f24057b & 8) == 8) {
            t0 t0Var2 = zVar.f24061f;
            if ((this.f24023b & 8) != 8 || (t0Var = this.f24027f) == t0.f23947t) {
                this.f24027f = t0Var2;
            } else {
                s0 s0VarR = t0.r(t0Var);
                s0VarR.i(t0Var2);
                this.f24027f = s0VarR.g();
            }
            this.f24023b |= 8;
        }
        if ((zVar.f24057b & 16) == 16) {
            int i13 = zVar.f24062g;
            this.f24023b = 16 | this.f24023b;
            this.f24028g = i13;
        }
        if (!zVar.f24063h.isEmpty()) {
            if (this.f24029h.isEmpty()) {
                this.f24029h = zVar.f24063h;
                this.f24023b &= -33;
            } else {
                if ((this.f24023b & 32) != 32) {
                    this.f24029h = new ArrayList(this.f24029h);
                    this.f24023b |= 32;
                }
                this.f24029h.addAll(zVar.f24063h);
            }
        }
        if (!zVar.f24064i.isEmpty()) {
            if (this.f24030i.isEmpty()) {
                this.f24030i = zVar.f24064i;
                this.f24023b &= -65;
            } else {
                if ((this.f24023b & 64) != 64) {
                    this.f24030i = new ArrayList(this.f24030i);
                    this.f24023b |= 64;
                }
                this.f24030i.addAll(zVar.f24064i);
            }
        }
        this.f3948a = this.f3948a.i(zVar.f24056a);
    }
}
