package wd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g extends ce.k implements ce.x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f23691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23692e;

    public /* synthetic */ g(int i10) {
        this.f23689b = i10;
    }

    public static g h() {
        g gVar = new g(1);
        gVar.f23691d = Collections.EMPTY_LIST;
        gVar.f23692e = -1;
        return gVar;
    }

    @Override // ce.k
    public final ce.b c() {
        switch (this.f23689b) {
            case 0:
                h hVarF = f();
                if (hVarF.b()) {
                    return hVarF;
                }
                throw new ce.j0();
            default:
                z0 z0VarG = g();
                if (z0VarG.b()) {
                    return z0VarG;
                }
                throw new ce.j0();
        }
    }

    public final Object clone() {
        switch (this.f23689b) {
            case 0:
                g gVar = new g(0);
                gVar.f23691d = Collections.EMPTY_LIST;
                gVar.i(f());
                return gVar;
            default:
                g gVarH = h();
                gVarH.j(g());
                return gVarH;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003d  */
    @Override // ce.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ce.k d(ce.f r3, ce.i r4) throws java.lang.Throwable {
        /*
            r2 = this;
            int r0 = r2.f23689b
            switch(r0) {
                case 0: goto L24;
                default: goto L5;
            }
        L5:
            r0 = 0
            wd.a r1 = wd.z0.f24068h     // Catch: java.lang.Throwable -> L14 ce.s -> L16
            r1.getClass()     // Catch: java.lang.Throwable -> L14 ce.s -> L16
            wd.z0 r1 = new wd.z0     // Catch: java.lang.Throwable -> L14 ce.s -> L16
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L14 ce.s -> L16
            r2.j(r1)
            return r2
        L14:
            r3 = move-exception
            goto L1e
        L16:
            r3 = move-exception
            ce.b r4 = r3.f3972a     // Catch: java.lang.Throwable -> L14
            wd.z0 r4 = (wd.z0) r4     // Catch: java.lang.Throwable -> L14
            throw r3     // Catch: java.lang.Throwable -> L1c
        L1c:
            r3 = move-exception
            r0 = r4
        L1e:
            if (r0 == 0) goto L23
            r2.j(r0)
        L23:
            throw r3
        L24:
            r0 = 0
            wd.a r1 = wd.h.f23705h     // Catch: java.lang.Throwable -> L31 ce.s -> L33
            java.lang.Object r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> L31 ce.s -> L33
            wd.h r3 = (wd.h) r3     // Catch: java.lang.Throwable -> L31 ce.s -> L33
            r2.i(r3)
            return r2
        L31:
            r3 = move-exception
            goto L3b
        L33:
            r3 = move-exception
            ce.b r4 = r3.f3972a     // Catch: java.lang.Throwable -> L31
            wd.h r4 = (wd.h) r4     // Catch: java.lang.Throwable -> L31
            throw r3     // Catch: java.lang.Throwable -> L39
        L39:
            r3 = move-exception
            r0 = r4
        L3b:
            if (r0 == 0) goto L40
            r2.i(r0)
        L40:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: wd.g.d(ce.f, ce.i):ce.k");
    }

    @Override // ce.k
    public final /* bridge */ /* synthetic */ ce.k e(ce.p pVar) {
        switch (this.f23689b) {
            case 0:
                i((h) pVar);
                break;
            default:
                j((z0) pVar);
                break;
        }
        return this;
    }

    public h f() {
        h hVar = new h(this);
        int i10 = this.f23690c;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        hVar.f23708c = this.f23692e;
        if ((i10 & 2) == 2) {
            this.f23691d = Collections.unmodifiableList(this.f23691d);
            this.f23690c &= -3;
        }
        hVar.f23709d = this.f23691d;
        hVar.f23707b = i11;
        return hVar;
    }

    public z0 g() {
        z0 z0Var = new z0(this);
        int i10 = this.f23690c;
        if ((i10 & 1) == 1) {
            this.f23691d = Collections.unmodifiableList(this.f23691d);
            this.f23690c &= -2;
        }
        z0Var.f24071c = this.f23691d;
        int i11 = (i10 & 2) != 2 ? 0 : 1;
        z0Var.f24072d = this.f23692e;
        z0Var.f24070b = i11;
        return z0Var;
    }

    public void i(h hVar) {
        if (hVar == h.f23704g) {
            return;
        }
        if ((hVar.f23707b & 1) == 1) {
            int i10 = hVar.f23708c;
            this.f23690c = 1 | this.f23690c;
            this.f23692e = i10;
        }
        if (!hVar.f23709d.isEmpty()) {
            if (this.f23691d.isEmpty()) {
                this.f23691d = hVar.f23709d;
                this.f23690c &= -3;
            } else {
                if ((this.f23690c & 2) != 2) {
                    this.f23691d = new ArrayList(this.f23691d);
                    this.f23690c |= 2;
                }
                this.f23691d.addAll(hVar.f23709d);
            }
        }
        this.f3948a = this.f3948a.i(hVar.f23706a);
    }

    public void j(z0 z0Var) {
        if (z0Var == z0.f24067g) {
            return;
        }
        if (!z0Var.f24071c.isEmpty()) {
            if (this.f23691d.isEmpty()) {
                this.f23691d = z0Var.f24071c;
                this.f23690c &= -2;
            } else {
                if ((this.f23690c & 1) != 1) {
                    this.f23691d = new ArrayList(this.f23691d);
                    this.f23690c |= 1;
                }
                this.f23691d.addAll(z0Var.f24071c);
            }
        }
        if ((z0Var.f24070b & 1) == 1) {
            int i10 = z0Var.f24072d;
            this.f23690c |= 2;
            this.f23692e = i10;
        }
        this.f3948a = this.f3948a.i(z0Var.f24069a);
    }
}
