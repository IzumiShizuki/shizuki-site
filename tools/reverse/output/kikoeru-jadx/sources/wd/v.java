package wd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v extends ce.l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f23991f;

    @Override // ce.k
    public final ce.b c() {
        w wVarG = g();
        if (wVarG.b()) {
            return wVarG;
        }
        throw new ce.j0();
    }

    public final Object clone() {
        v vVar = new v();
        vVar.f23991f = Collections.EMPTY_LIST;
        vVar.h(g());
        return vVar;
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
            wd.a r1 = wd.w.f24009i     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            wd.w r1 = new wd.w     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r2.h(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            ce.b r4 = r3.f3972a     // Catch: java.lang.Throwable -> Lf
            wd.w r4 = (wd.w) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: wd.v.d(ce.f, ce.i):ce.k");
    }

    @Override // ce.k
    public final /* bridge */ /* synthetic */ ce.k e(ce.p pVar) {
        h((w) pVar);
        return this;
    }

    public final w g() {
        w wVar = new w(this);
        int i10 = this.f23989d;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        wVar.f24012d = this.f23990e;
        if ((i10 & 2) == 2) {
            this.f23991f = Collections.unmodifiableList(this.f23991f);
            this.f23989d &= -3;
        }
        wVar.f24013e = this.f23991f;
        wVar.f24011c = i11;
        return wVar;
    }

    public final void h(w wVar) {
        if (wVar == w.f24008h) {
            return;
        }
        if ((wVar.f24011c & 1) == 1) {
            int i10 = wVar.f24012d;
            this.f23989d = 1 | this.f23989d;
            this.f23990e = i10;
        }
        if (!wVar.f24013e.isEmpty()) {
            if (this.f23991f.isEmpty()) {
                this.f23991f = wVar.f24013e;
                this.f23989d &= -3;
            } else {
                if ((this.f23989d & 2) != 2) {
                    this.f23991f = new ArrayList(this.f23991f);
                    this.f23989d |= 2;
                }
                this.f23991f.addAll(wVar.f24013e);
            }
        }
        f(wVar);
        this.f3948a = this.f3948a.i(wVar.f24010b);
    }
}
