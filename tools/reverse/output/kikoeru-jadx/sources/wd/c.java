package wd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends ce.k implements ce.x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f23588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f23589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f23590e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f23591f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23592g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f23593h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23594i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h f23595j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f23596k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f23597l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f23598m;

    public static c g() {
        c cVar = new c();
        cVar.f23588c = d.f23608b;
        cVar.f23595j = h.f23704g;
        cVar.f23596k = Collections.EMPTY_LIST;
        return cVar;
    }

    @Override // ce.k
    public final ce.b c() {
        e eVarF = f();
        if (eVarF.b()) {
            return eVarF;
        }
        throw new ce.j0();
    }

    public final Object clone() {
        c cVarG = g();
        cVarG.h(f());
        return cVarG;
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
            wd.a r1 = wd.e.f23631q     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            wd.e r1 = new wd.e     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r2.h(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            ce.b r4 = r3.f3972a     // Catch: java.lang.Throwable -> Lf
            wd.e r4 = (wd.e) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: wd.c.d(ce.f, ce.i):ce.k");
    }

    @Override // ce.k
    public final /* bridge */ /* synthetic */ ce.k e(ce.p pVar) {
        h((e) pVar);
        return this;
    }

    public final e f() {
        e eVar = new e(this);
        int i10 = this.f23587b;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        eVar.f23634c = this.f23588c;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        eVar.f23635d = this.f23589d;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        eVar.f23636e = this.f23590e;
        if ((i10 & 8) == 8) {
            i11 |= 8;
        }
        eVar.f23637f = this.f23591f;
        if ((i10 & 16) == 16) {
            i11 |= 16;
        }
        eVar.f23638g = this.f23592g;
        if ((i10 & 32) == 32) {
            i11 |= 32;
        }
        eVar.f23639h = this.f23593h;
        if ((i10 & 64) == 64) {
            i11 |= 64;
        }
        eVar.f23640i = this.f23594i;
        if ((i10 & 128) == 128) {
            i11 |= 128;
        }
        eVar.f23641j = this.f23595j;
        if ((i10 & 256) == 256) {
            this.f23596k = Collections.unmodifiableList(this.f23596k);
            this.f23587b &= -257;
        }
        eVar.f23642k = this.f23596k;
        if ((i10 & 512) == 512) {
            i11 |= 256;
        }
        eVar.f23643l = this.f23597l;
        if ((i10 & 1024) == 1024) {
            i11 |= 512;
        }
        eVar.f23644m = this.f23598m;
        eVar.f23633b = i11;
        return eVar;
    }

    public final void h(e eVar) {
        h hVar;
        if (eVar == e.f23630p) {
            return;
        }
        if ((eVar.f23633b & 1) == 1) {
            d dVar = eVar.f23634c;
            dVar.getClass();
            this.f23587b = 1 | this.f23587b;
            this.f23588c = dVar;
        }
        int i10 = eVar.f23633b;
        if ((i10 & 2) == 2) {
            long j10 = eVar.f23635d;
            this.f23587b |= 2;
            this.f23589d = j10;
        }
        if ((i10 & 4) == 4) {
            float f10 = eVar.f23636e;
            this.f23587b = 4 | this.f23587b;
            this.f23590e = f10;
        }
        if ((i10 & 8) == 8) {
            double d10 = eVar.f23637f;
            this.f23587b |= 8;
            this.f23591f = d10;
        }
        if ((i10 & 16) == 16) {
            int i11 = eVar.f23638g;
            this.f23587b = 16 | this.f23587b;
            this.f23592g = i11;
        }
        if ((i10 & 32) == 32) {
            int i12 = eVar.f23639h;
            this.f23587b = 32 | this.f23587b;
            this.f23593h = i12;
        }
        if ((i10 & 64) == 64) {
            int i13 = eVar.f23640i;
            this.f23587b = 64 | this.f23587b;
            this.f23594i = i13;
        }
        if ((i10 & 128) == 128) {
            h hVar2 = eVar.f23641j;
            if ((this.f23587b & 128) != 128 || (hVar = this.f23595j) == h.f23704g) {
                this.f23595j = hVar2;
            } else {
                g gVar = new g(0);
                gVar.f23691d = Collections.EMPTY_LIST;
                gVar.i(hVar);
                gVar.i(hVar2);
                this.f23595j = gVar.f();
            }
            this.f23587b |= 128;
        }
        if (!eVar.f23642k.isEmpty()) {
            if (this.f23596k.isEmpty()) {
                this.f23596k = eVar.f23642k;
                this.f23587b &= -257;
            } else {
                if ((this.f23587b & 256) != 256) {
                    this.f23596k = new ArrayList(this.f23596k);
                    this.f23587b |= 256;
                }
                this.f23596k.addAll(eVar.f23642k);
            }
        }
        int i14 = eVar.f23633b;
        if ((i14 & 256) == 256) {
            int i15 = eVar.f23643l;
            this.f23587b |= 512;
            this.f23597l = i15;
        }
        if ((i14 & 512) == 512) {
            int i16 = eVar.f23644m;
            this.f23587b |= 1024;
            this.f23598m = i16;
        }
        this.f3948a = this.f3948a.i(eVar.f23632a);
    }
}
