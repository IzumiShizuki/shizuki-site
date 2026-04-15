package wd;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends ce.k implements ce.x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f23547e;

    public /* synthetic */ b(int i10) {
        this.f23544b = i10;
    }

    @Override // ce.k
    public final ce.b c() {
        switch (this.f23544b) {
            case 0:
                f fVarF = f();
                if (fVarF.b()) {
                    return fVarF;
                }
                throw new ce.j0();
            default:
                l lVarG = g();
                if (lVarG.b()) {
                    return lVarG;
                }
                throw new ce.j0();
        }
    }

    public final Object clone() {
        switch (this.f23544b) {
            case 0:
                b bVar = new b(0);
                bVar.f23547e = e.f23630p;
                bVar.h(f());
                return bVar;
            default:
                b bVar2 = new b(1);
                bVar2.f23547e = ce.e.f3915a;
                bVar2.i(g());
                return bVar2;
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
            int r0 = r2.f23544b
            switch(r0) {
                case 0: goto L24;
                default: goto L5;
            }
        L5:
            r4 = 0
            wd.a r0 = wd.l.f23832h     // Catch: java.lang.Throwable -> L14 ce.s -> L16
            r0.getClass()     // Catch: java.lang.Throwable -> L14 ce.s -> L16
            wd.l r0 = new wd.l     // Catch: java.lang.Throwable -> L14 ce.s -> L16
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L14 ce.s -> L16
            r2.i(r0)
            return r2
        L14:
            r3 = move-exception
            goto L1e
        L16:
            r3 = move-exception
            ce.b r0 = r3.f3972a     // Catch: java.lang.Throwable -> L14
            wd.l r0 = (wd.l) r0     // Catch: java.lang.Throwable -> L14
            throw r3     // Catch: java.lang.Throwable -> L1c
        L1c:
            r3 = move-exception
            r4 = r0
        L1e:
            if (r4 == 0) goto L23
            r2.i(r4)
        L23:
            throw r3
        L24:
            r0 = 0
            wd.a r1 = wd.f.f23659h     // Catch: java.lang.Throwable -> L33 ce.s -> L35
            r1.getClass()     // Catch: java.lang.Throwable -> L33 ce.s -> L35
            wd.f r1 = new wd.f     // Catch: java.lang.Throwable -> L33 ce.s -> L35
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L33 ce.s -> L35
            r2.h(r1)
            return r2
        L33:
            r3 = move-exception
            goto L3d
        L35:
            r3 = move-exception
            ce.b r4 = r3.f3972a     // Catch: java.lang.Throwable -> L33
            wd.f r4 = (wd.f) r4     // Catch: java.lang.Throwable -> L33
            throw r3     // Catch: java.lang.Throwable -> L3b
        L3b:
            r3 = move-exception
            r0 = r4
        L3d:
            if (r0 == 0) goto L42
            r2.h(r0)
        L42:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: wd.b.d(ce.f, ce.i):ce.k");
    }

    @Override // ce.k
    public final /* bridge */ /* synthetic */ ce.k e(ce.p pVar) {
        switch (this.f23544b) {
            case 0:
                h((f) pVar);
                break;
            default:
                i((l) pVar);
                break;
        }
        return this;
    }

    public f f() {
        f fVar = new f(this);
        int i10 = this.f23545c;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        fVar.f23662c = this.f23546d;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        fVar.f23663d = (e) this.f23547e;
        fVar.f23661b = i11;
        return fVar;
    }

    public l g() {
        l lVar = new l(this);
        int i10 = this.f23545c;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        lVar.f23835c = this.f23546d;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        lVar.f23836d = (ce.w) this.f23547e;
        lVar.f23834b = i11;
        return lVar;
    }

    public void h(f fVar) {
        e eVar;
        if (fVar == f.f23658g) {
            return;
        }
        int i10 = fVar.f23661b;
        if ((i10 & 1) == 1) {
            int i11 = fVar.f23662c;
            this.f23545c = 1 | this.f23545c;
            this.f23546d = i11;
        }
        if ((i10 & 2) == 2) {
            e eVar2 = fVar.f23663d;
            if ((this.f23545c & 2) != 2 || (eVar = (e) this.f23547e) == e.f23630p) {
                this.f23547e = eVar2;
            } else {
                c cVarJ = e.j(eVar);
                cVarJ.h(eVar2);
                this.f23547e = cVarJ.f();
            }
            this.f23545c |= 2;
        }
        this.f3948a = this.f3948a.i(fVar.f23660a);
    }

    public void i(l lVar) {
        if (lVar == l.f23831g) {
            return;
        }
        int i10 = lVar.f23834b;
        if ((i10 & 1) == 1) {
            int i11 = lVar.f23835c;
            this.f23545c = 1 | this.f23545c;
            this.f23546d = i11;
        }
        if ((i10 & 2) == 2) {
            ce.w wVar = lVar.f23836d;
            wVar.getClass();
            this.f23545c = 2 | this.f23545c;
            this.f23547e = wVar;
        }
        this.f3948a = this.f3948a.i(lVar.f23833a);
    }
}
