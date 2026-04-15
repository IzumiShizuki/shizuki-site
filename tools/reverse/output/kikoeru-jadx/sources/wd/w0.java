package wd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends ce.l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24017e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24018f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f24019g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x0 f24020h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f24021i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f24022j;

    public static w0 h() {
        w0 w0Var = new w0();
        w0Var.f24020h = x0.f24033d;
        List list = Collections.EMPTY_LIST;
        w0Var.f24021i = list;
        w0Var.f24022j = list;
        return w0Var;
    }

    @Override // ce.k
    public final ce.b c() {
        y0 y0VarG = g();
        if (y0VarG.b()) {
            return y0VarG;
        }
        throw new ce.j0();
    }

    public final Object clone() {
        w0 w0VarH = h();
        w0VarH.i(g());
        return w0VarH;
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
            wd.a r1 = wd.y0.f24042n     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            wd.y0 r1 = new wd.y0     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            ce.b r4 = r3.f3972a     // Catch: java.lang.Throwable -> Lf
            wd.y0 r4 = (wd.y0) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: wd.w0.d(ce.f, ce.i):ce.k");
    }

    @Override // ce.k
    public final /* bridge */ /* synthetic */ ce.k e(ce.p pVar) {
        i((y0) pVar);
        return this;
    }

    public final y0 g() {
        y0 y0Var = new y0(this);
        int i10 = this.f24016d;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        y0Var.f24045d = this.f24017e;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        y0Var.f24046e = this.f24018f;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        y0Var.f24047f = this.f24019g;
        if ((i10 & 8) == 8) {
            i11 |= 8;
        }
        y0Var.f24048g = this.f24020h;
        if ((i10 & 16) == 16) {
            this.f24021i = Collections.unmodifiableList(this.f24021i);
            this.f24016d &= -17;
        }
        y0Var.f24049h = this.f24021i;
        if ((this.f24016d & 32) == 32) {
            this.f24022j = Collections.unmodifiableList(this.f24022j);
            this.f24016d &= -33;
        }
        y0Var.f24050i = this.f24022j;
        y0Var.f24044c = i11;
        return y0Var;
    }

    public final void i(y0 y0Var) {
        if (y0Var == y0.f24041m) {
            return;
        }
        int i10 = y0Var.f24044c;
        if ((i10 & 1) == 1) {
            int i11 = y0Var.f24045d;
            this.f24016d = 1 | this.f24016d;
            this.f24017e = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = y0Var.f24046e;
            this.f24016d = 2 | this.f24016d;
            this.f24018f = i12;
        }
        if ((i10 & 4) == 4) {
            boolean z10 = y0Var.f24047f;
            this.f24016d = 4 | this.f24016d;
            this.f24019g = z10;
        }
        if ((i10 & 8) == 8) {
            x0 x0Var = y0Var.f24048g;
            x0Var.getClass();
            this.f24016d = 8 | this.f24016d;
            this.f24020h = x0Var;
        }
        if (!y0Var.f24049h.isEmpty()) {
            if (this.f24021i.isEmpty()) {
                this.f24021i = y0Var.f24049h;
                this.f24016d &= -17;
            } else {
                if ((this.f24016d & 16) != 16) {
                    this.f24021i = new ArrayList(this.f24021i);
                    this.f24016d |= 16;
                }
                this.f24021i.addAll(y0Var.f24049h);
            }
        }
        if (!y0Var.f24050i.isEmpty()) {
            if (this.f24022j.isEmpty()) {
                this.f24022j = y0Var.f24050i;
                this.f24016d &= -33;
            } else {
                if ((this.f24016d & 32) != 32) {
                    this.f24022j = new ArrayList(this.f24022j);
                    this.f24016d |= 32;
                }
                this.f24022j.addAll(y0Var.f24050i);
            }
        }
        f(y0Var);
        this.f3948a = this.f3948a.i(y0Var.f24043b);
    }
}
