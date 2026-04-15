package wd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m extends ce.l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f23846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f23847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f23848h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f23849i;

    public static m h() {
        m mVar = new m();
        mVar.f23845e = 6;
        List list = Collections.EMPTY_LIST;
        mVar.f23846f = list;
        mVar.f23847g = list;
        mVar.f23848h = list;
        mVar.f23849i = list;
        return mVar;
    }

    @Override // ce.k
    public final ce.b c() {
        n nVarG = g();
        if (nVarG.b()) {
            return nVarG;
        }
        throw new ce.j0();
    }

    public final Object clone() {
        m mVarH = h();
        mVarH.i(g());
        return mVarH;
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
            wd.a r1 = wd.n.f23860l     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            wd.n r1 = new wd.n     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            ce.b r4 = r3.f3972a     // Catch: java.lang.Throwable -> Lf
            wd.n r4 = (wd.n) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: wd.m.d(ce.f, ce.i):ce.k");
    }

    @Override // ce.k
    public final /* bridge */ /* synthetic */ ce.k e(ce.p pVar) {
        i((n) pVar);
        return this;
    }

    public final n g() {
        n nVar = new n(this);
        int i10 = this.f23844d;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        nVar.f23863d = this.f23845e;
        if ((i10 & 2) == 2) {
            this.f23846f = Collections.unmodifiableList(this.f23846f);
            this.f23844d &= -3;
        }
        nVar.f23864e = this.f23846f;
        if ((this.f23844d & 4) == 4) {
            this.f23847g = Collections.unmodifiableList(this.f23847g);
            this.f23844d &= -5;
        }
        nVar.f23865f = this.f23847g;
        if ((this.f23844d & 8) == 8) {
            this.f23848h = Collections.unmodifiableList(this.f23848h);
            this.f23844d &= -9;
        }
        nVar.f23866g = this.f23848h;
        if ((this.f23844d & 16) == 16) {
            this.f23849i = Collections.unmodifiableList(this.f23849i);
            this.f23844d &= -17;
        }
        nVar.f23867h = this.f23849i;
        nVar.f23862c = i11;
        return nVar;
    }

    public final void i(n nVar) {
        if (nVar == n.f23859k) {
            return;
        }
        if ((nVar.f23862c & 1) == 1) {
            int i10 = nVar.f23863d;
            this.f23844d = 1 | this.f23844d;
            this.f23845e = i10;
        }
        if (!nVar.f23864e.isEmpty()) {
            if (this.f23846f.isEmpty()) {
                this.f23846f = nVar.f23864e;
                this.f23844d &= -3;
            } else {
                if ((this.f23844d & 2) != 2) {
                    this.f23846f = new ArrayList(this.f23846f);
                    this.f23844d |= 2;
                }
                this.f23846f.addAll(nVar.f23864e);
            }
        }
        if (!nVar.f23865f.isEmpty()) {
            if (this.f23847g.isEmpty()) {
                this.f23847g = nVar.f23865f;
                this.f23844d &= -5;
            } else {
                if ((this.f23844d & 4) != 4) {
                    this.f23847g = new ArrayList(this.f23847g);
                    this.f23844d |= 4;
                }
                this.f23847g.addAll(nVar.f23865f);
            }
        }
        if (!nVar.f23866g.isEmpty()) {
            if (this.f23848h.isEmpty()) {
                this.f23848h = nVar.f23866g;
                this.f23844d &= -9;
            } else {
                if ((this.f23844d & 8) != 8) {
                    this.f23848h = new ArrayList(this.f23848h);
                    this.f23844d |= 8;
                }
                this.f23848h.addAll(nVar.f23866g);
            }
        }
        if (!nVar.f23867h.isEmpty()) {
            if (this.f23849i.isEmpty()) {
                this.f23849i = nVar.f23867h;
                this.f23844d &= -17;
            } else {
                if ((this.f23844d & 16) != 16) {
                    this.f23849i = new ArrayList(this.f23849i);
                    this.f23844d |= 16;
                }
                this.f23849i.addAll(nVar.f23867h);
            }
        }
        f(nVar);
        this.f3948a = this.f3948a.i(nVar.f23861b);
    }
}
