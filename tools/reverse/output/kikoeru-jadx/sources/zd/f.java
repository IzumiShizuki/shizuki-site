package zd;

import ce.k;
import ce.p;
import ce.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f extends k implements x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f26772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g f26773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f26774g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f26775h;

    public static f g() {
        f fVar = new f();
        fVar.f26770c = 1;
        fVar.f26772e = "";
        fVar.f26773f = g.f26776b;
        List list = Collections.EMPTY_LIST;
        fVar.f26774g = list;
        fVar.f26775h = list;
        return fVar;
    }

    @Override // ce.k
    public final ce.b c() {
        h hVarF = f();
        hVarF.b();
        return hVarF;
    }

    public final Object clone() {
        f fVarG = g();
        fVarG.h(f());
        return fVarG;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // ce.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ce.k d(ce.f r2, ce.i r3) throws java.lang.Throwable {
        /*
            r1 = this;
            r3 = 0
            wd.a r0 = zd.h.f26782n     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r0.getClass()     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            zd.h r0 = new zd.h     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r1.h(r0)
            return r1
        Lf:
            r2 = move-exception
            goto L19
        L11:
            r2 = move-exception
            ce.b r0 = r2.f3972a     // Catch: java.lang.Throwable -> Lf
            zd.h r0 = (zd.h) r0     // Catch: java.lang.Throwable -> Lf
            throw r2     // Catch: java.lang.Throwable -> L17
        L17:
            r2 = move-exception
            r3 = r0
        L19:
            if (r3 == 0) goto L1e
            r1.h(r3)
        L1e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: zd.f.d(ce.f, ce.i):ce.k");
    }

    @Override // ce.k
    public final /* bridge */ /* synthetic */ k e(p pVar) {
        h((h) pVar);
        return this;
    }

    public final h f() {
        h hVar = new h(this);
        int i10 = this.f26769b;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        hVar.f26785c = this.f26770c;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        hVar.f26786d = this.f26771d;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        hVar.f26787e = this.f26772e;
        if ((i10 & 8) == 8) {
            i11 |= 8;
        }
        hVar.f26788f = this.f26773f;
        if ((i10 & 16) == 16) {
            this.f26774g = Collections.unmodifiableList(this.f26774g);
            this.f26769b &= -17;
        }
        hVar.f26789g = this.f26774g;
        if ((this.f26769b & 32) == 32) {
            this.f26775h = Collections.unmodifiableList(this.f26775h);
            this.f26769b &= -33;
        }
        hVar.f26791i = this.f26775h;
        hVar.f26784b = i11;
        return hVar;
    }

    public final void h(h hVar) {
        if (hVar == h.f26781m) {
            return;
        }
        int i10 = hVar.f26784b;
        if ((i10 & 1) == 1) {
            int i11 = hVar.f26785c;
            this.f26769b = 1 | this.f26769b;
            this.f26770c = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = hVar.f26786d;
            this.f26769b = 2 | this.f26769b;
            this.f26771d = i12;
        }
        if ((i10 & 4) == 4) {
            this.f26769b |= 4;
            this.f26772e = hVar.f26787e;
        }
        if ((i10 & 8) == 8) {
            g gVar = hVar.f26788f;
            gVar.getClass();
            this.f26769b = 8 | this.f26769b;
            this.f26773f = gVar;
        }
        if (!hVar.f26789g.isEmpty()) {
            if (this.f26774g.isEmpty()) {
                this.f26774g = hVar.f26789g;
                this.f26769b &= -17;
            } else {
                if ((this.f26769b & 16) != 16) {
                    this.f26774g = new ArrayList(this.f26774g);
                    this.f26769b |= 16;
                }
                this.f26774g.addAll(hVar.f26789g);
            }
        }
        if (!hVar.f26791i.isEmpty()) {
            if (this.f26775h.isEmpty()) {
                this.f26775h = hVar.f26791i;
                this.f26769b &= -33;
            } else {
                if ((this.f26769b & 32) != 32) {
                    this.f26775h = new ArrayList(this.f26775h);
                    this.f26769b |= 32;
                }
                this.f26775h.addAll(hVar.f26791i);
            }
        }
        this.f3948a = this.f3948a.i(hVar.f26783a);
    }
}
