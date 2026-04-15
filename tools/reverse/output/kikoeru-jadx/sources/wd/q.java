package wd;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q extends ce.k implements ce.x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Serializable f23897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f23898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ce.p f23899f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Serializable f23900g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Serializable f23901h;

    public /* synthetic */ q(int i10) {
        this.f23895b = i10;
    }

    public static q h() {
        q qVar = new q(0);
        qVar.f23897d = s.f23922b;
        qVar.f23898e = Collections.EMPTY_LIST;
        qVar.f23899f = z.f24054l;
        qVar.f23900g = t.f23942b;
        qVar.f23901h = r.f23908b;
        return qVar;
    }

    public static q i() {
        q qVar = new q(1);
        qVar.f23897d = zd.b.f26739g;
        zd.c cVar = zd.c.f26747g;
        qVar.f23898e = cVar;
        qVar.f23899f = cVar;
        qVar.f23900g = cVar;
        qVar.f23901h = cVar;
        return qVar;
    }

    @Override // ce.k
    public final ce.b c() {
        switch (this.f23895b) {
            case 0:
                u uVarF = f();
                if (uVarF.b()) {
                    return uVarF;
                }
                throw new ce.j0();
            default:
                zd.d dVarG = g();
                dVarG.b();
                return dVarG;
        }
    }

    public final Object clone() {
        switch (this.f23895b) {
            case 0:
                q qVarH = h();
                qVarH.j(f());
                return qVarH;
            default:
                q qVarI = i();
                qVarI.k(g());
                return qVarI;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003f  */
    @Override // ce.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ce.k d(ce.f r3, ce.i r4) throws java.lang.Throwable {
        /*
            r2 = this;
            int r0 = r2.f23895b
            switch(r0) {
                case 0: goto L24;
                default: goto L5;
            }
        L5:
            r0 = 0
            wd.a r1 = zd.d.f26756k     // Catch: java.lang.Throwable -> L14 ce.s -> L16
            r1.getClass()     // Catch: java.lang.Throwable -> L14 ce.s -> L16
            zd.d r1 = new zd.d     // Catch: java.lang.Throwable -> L14 ce.s -> L16
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L14 ce.s -> L16
            r2.k(r1)
            return r2
        L14:
            r3 = move-exception
            goto L1e
        L16:
            r3 = move-exception
            ce.b r4 = r3.f3972a     // Catch: java.lang.Throwable -> L14
            zd.d r4 = (zd.d) r4     // Catch: java.lang.Throwable -> L14
            throw r3     // Catch: java.lang.Throwable -> L1c
        L1c:
            r3 = move-exception
            r0 = r4
        L1e:
            if (r0 == 0) goto L23
            r2.k(r0)
        L23:
            throw r3
        L24:
            r0 = 0
            wd.a r1 = wd.u.f23968k     // Catch: java.lang.Throwable -> L33 ce.s -> L35
            r1.getClass()     // Catch: java.lang.Throwable -> L33 ce.s -> L35
            wd.u r1 = new wd.u     // Catch: java.lang.Throwable -> L33 ce.s -> L35
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L33 ce.s -> L35
            r2.j(r1)
            return r2
        L33:
            r3 = move-exception
            goto L3d
        L35:
            r3 = move-exception
            ce.b r4 = r3.f3972a     // Catch: java.lang.Throwable -> L33
            wd.u r4 = (wd.u) r4     // Catch: java.lang.Throwable -> L33
            throw r3     // Catch: java.lang.Throwable -> L3b
        L3b:
            r3 = move-exception
            r0 = r4
        L3d:
            if (r0 == 0) goto L42
            r2.j(r0)
        L42:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: wd.q.d(ce.f, ce.i):ce.k");
    }

    @Override // ce.k
    public final /* bridge */ /* synthetic */ ce.k e(ce.p pVar) {
        switch (this.f23895b) {
            case 0:
                j((u) pVar);
                break;
            default:
                k((zd.d) pVar);
                break;
        }
        return this;
    }

    public u f() {
        u uVar = new u(this);
        int i10 = this.f23896c;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        uVar.f23971c = (s) this.f23897d;
        if ((i10 & 2) == 2) {
            this.f23898e = Collections.unmodifiableList((List) this.f23898e);
            this.f23896c &= -3;
        }
        uVar.f23972d = (List) this.f23898e;
        if ((i10 & 4) == 4) {
            i11 |= 2;
        }
        uVar.f23973e = (z) this.f23899f;
        if ((i10 & 8) == 8) {
            i11 |= 4;
        }
        uVar.f23974f = (t) this.f23900g;
        if ((i10 & 16) == 16) {
            i11 |= 8;
        }
        uVar.f23975g = (r) this.f23901h;
        uVar.f23970b = i11;
        return uVar;
    }

    public zd.d g() {
        zd.d dVar = new zd.d(this);
        int i10 = this.f23896c;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        dVar.f26759c = (zd.b) this.f23897d;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        dVar.f26760d = (zd.c) this.f23898e;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        dVar.f26761e = (zd.c) this.f23899f;
        if ((i10 & 8) == 8) {
            i11 |= 8;
        }
        dVar.f26762f = (zd.c) this.f23900g;
        if ((i10 & 16) == 16) {
            i11 |= 16;
        }
        dVar.f26763g = (zd.c) this.f23901h;
        dVar.f26758b = i11;
        return dVar;
    }

    public void j(u uVar) {
        z zVar;
        if (uVar == u.f23967j) {
            return;
        }
        if ((uVar.f23970b & 1) == 1) {
            s sVar = uVar.f23971c;
            sVar.getClass();
            this.f23896c = 1 | this.f23896c;
            this.f23897d = sVar;
        }
        if (!uVar.f23972d.isEmpty()) {
            if (((List) this.f23898e).isEmpty()) {
                this.f23898e = uVar.f23972d;
                this.f23896c &= -3;
            } else {
                if ((this.f23896c & 2) != 2) {
                    this.f23898e = new ArrayList((List) this.f23898e);
                    this.f23896c |= 2;
                }
                ((List) this.f23898e).addAll(uVar.f23972d);
            }
        }
        if ((uVar.f23970b & 2) == 2) {
            z zVar2 = uVar.f23973e;
            if ((this.f23896c & 4) != 4 || (zVar = (z) this.f23899f) == z.f24054l) {
                this.f23899f = zVar2;
            } else {
                x xVarG = x.g();
                xVarG.h(zVar);
                xVarG.h(zVar2);
                this.f23899f = xVarG.f();
            }
            this.f23896c |= 4;
        }
        if ((uVar.f23970b & 4) == 4) {
            t tVar = uVar.f23974f;
            tVar.getClass();
            this.f23896c |= 8;
            this.f23900g = tVar;
        }
        if ((uVar.f23970b & 8) == 8) {
            r rVar = uVar.f23975g;
            rVar.getClass();
            this.f23896c |= 16;
            this.f23901h = rVar;
        }
        this.f3948a = this.f3948a.i(uVar.f23969a);
    }

    public void k(zd.d dVar) {
        zd.c cVar;
        zd.c cVar2;
        zd.c cVar3;
        zd.c cVar4;
        zd.b bVar;
        if (dVar == zd.d.f26755j) {
            return;
        }
        if ((dVar.f26758b & 1) == 1) {
            zd.b bVar2 = dVar.f26759c;
            if ((this.f23896c & 1) != 1 || (bVar = (zd.b) this.f23897d) == zd.b.f26739g) {
                this.f23897d = bVar2;
            } else {
                zd.a aVar = new zd.a(0);
                aVar.h(bVar);
                aVar.h(bVar2);
                this.f23897d = aVar.f();
            }
            this.f23896c |= 1;
        }
        if ((dVar.f26758b & 2) == 2) {
            zd.c cVar5 = dVar.f26760d;
            if ((this.f23896c & 2) != 2 || (cVar4 = (zd.c) this.f23898e) == zd.c.f26747g) {
                this.f23898e = cVar5;
            } else {
                zd.a aVarI = zd.c.i(cVar4);
                aVarI.i(cVar5);
                this.f23898e = aVarI.g();
            }
            this.f23896c |= 2;
        }
        if (dVar.i()) {
            zd.c cVar6 = dVar.f26761e;
            if ((this.f23896c & 4) != 4 || (cVar3 = (zd.c) this.f23899f) == zd.c.f26747g) {
                this.f23899f = cVar6;
            } else {
                zd.a aVarI2 = zd.c.i(cVar3);
                aVarI2.i(cVar6);
                this.f23899f = aVarI2.g();
            }
            this.f23896c |= 4;
        }
        if ((dVar.f26758b & 8) == 8) {
            zd.c cVar7 = dVar.f26762f;
            if ((this.f23896c & 8) != 8 || (cVar2 = (zd.c) this.f23900g) == zd.c.f26747g) {
                this.f23900g = cVar7;
            } else {
                zd.a aVarI3 = zd.c.i(cVar2);
                aVarI3.i(cVar7);
                this.f23900g = aVarI3.g();
            }
            this.f23896c |= 8;
        }
        if ((dVar.f26758b & 16) == 16) {
            zd.c cVar8 = dVar.f26763g;
            if ((this.f23896c & 16) != 16 || (cVar = (zd.c) this.f23901h) == zd.c.f26747g) {
                this.f23901h = cVar8;
            } else {
                zd.a aVarI4 = zd.c.i(cVar);
                aVarI4.i(cVar8);
                this.f23901h = aVarI4.g();
            }
            this.f23896c |= 16;
        }
        this.f3948a = this.f3948a.i(dVar.f26757a);
    }
}
