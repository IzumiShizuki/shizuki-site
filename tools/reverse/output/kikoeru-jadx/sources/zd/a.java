package zd;

import ce.k;
import ce.p;
import ce.x;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends k implements x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26738e;

    public /* synthetic */ a(int i10) {
        this.f26735b = i10;
    }

    @Override // ce.k
    public final ce.b c() {
        switch (this.f26735b) {
            case 0:
                b bVarF = f();
                bVarF.b();
                return bVarF;
            default:
                c cVarG = g();
                cVarG.b();
                return cVarG;
        }
    }

    public final Object clone() {
        switch (this.f26735b) {
            case 0:
                a aVar = new a(0);
                aVar.h(f());
                return aVar;
            default:
                a aVar2 = new a(1);
                aVar2.i(g());
                return aVar2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003f  */
    @Override // ce.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ce.k d(ce.f r2, ce.i r3) throws java.lang.Throwable {
        /*
            r1 = this;
            int r3 = r1.f26735b
            switch(r3) {
                case 0: goto L24;
                default: goto L5;
            }
        L5:
            r3 = 0
            wd.a r0 = zd.c.f26748h     // Catch: java.lang.Throwable -> L14 ce.s -> L16
            r0.getClass()     // Catch: java.lang.Throwable -> L14 ce.s -> L16
            zd.c r0 = new zd.c     // Catch: java.lang.Throwable -> L14 ce.s -> L16
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L14 ce.s -> L16
            r1.i(r0)
            return r1
        L14:
            r2 = move-exception
            goto L1e
        L16:
            r2 = move-exception
            ce.b r0 = r2.f3972a     // Catch: java.lang.Throwable -> L14
            zd.c r0 = (zd.c) r0     // Catch: java.lang.Throwable -> L14
            throw r2     // Catch: java.lang.Throwable -> L1c
        L1c:
            r2 = move-exception
            r3 = r0
        L1e:
            if (r3 == 0) goto L23
            r1.i(r3)
        L23:
            throw r2
        L24:
            r3 = 0
            wd.a r0 = zd.b.f26740h     // Catch: java.lang.Throwable -> L33 ce.s -> L35
            r0.getClass()     // Catch: java.lang.Throwable -> L33 ce.s -> L35
            zd.b r0 = new zd.b     // Catch: java.lang.Throwable -> L33 ce.s -> L35
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L33 ce.s -> L35
            r1.h(r0)
            return r1
        L33:
            r2 = move-exception
            goto L3d
        L35:
            r2 = move-exception
            ce.b r0 = r2.f3972a     // Catch: java.lang.Throwable -> L33
            zd.b r0 = (zd.b) r0     // Catch: java.lang.Throwable -> L33
            throw r2     // Catch: java.lang.Throwable -> L3b
        L3b:
            r2 = move-exception
            r3 = r0
        L3d:
            if (r3 == 0) goto L42
            r1.h(r3)
        L42:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: zd.a.d(ce.f, ce.i):ce.k");
    }

    @Override // ce.k
    public final /* bridge */ /* synthetic */ k e(p pVar) {
        switch (this.f26735b) {
            case 0:
                h((b) pVar);
                break;
            default:
                i((c) pVar);
                break;
        }
        return this;
    }

    public b f() {
        b bVar = new b(this);
        int i10 = this.f26736c;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        bVar.f26743c = this.f26737d;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        bVar.f26744d = this.f26738e;
        bVar.f26742b = i11;
        return bVar;
    }

    public c g() {
        c cVar = new c(this);
        int i10 = this.f26736c;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        cVar.f26751c = this.f26737d;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        cVar.f26752d = this.f26738e;
        cVar.f26750b = i11;
        return cVar;
    }

    public void h(b bVar) {
        if (bVar == b.f26739g) {
            return;
        }
        int i10 = bVar.f26742b;
        if ((i10 & 1) == 1) {
            int i11 = bVar.f26743c;
            this.f26736c = 1 | this.f26736c;
            this.f26737d = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = bVar.f26744d;
            this.f26736c = 2 | this.f26736c;
            this.f26738e = i12;
        }
        this.f3948a = this.f3948a.i(bVar.f26741a);
    }

    public void i(c cVar) {
        if (cVar == c.f26747g) {
            return;
        }
        int i10 = cVar.f26750b;
        if ((i10 & 1) == 1) {
            int i11 = cVar.f26751c;
            this.f26736c = 1 | this.f26736c;
            this.f26737d = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = cVar.f26752d;
            this.f26736c = 2 | this.f26736c;
            this.f26738e = i12;
        }
        this.f3948a = this.f3948a.i(cVar.f26749a);
    }
}
