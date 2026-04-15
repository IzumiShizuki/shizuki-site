package zd;

import ce.k;
import ce.p;
import ce.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends k implements x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f26767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f26768d;

    @Override // ce.k
    public final ce.b c() {
        i iVarF = f();
        iVarF.b();
        return iVarF;
    }

    public final Object clone() {
        e eVar = new e();
        List list = Collections.EMPTY_LIST;
        eVar.f26767c = list;
        eVar.f26768d = list;
        eVar.g(f());
        return eVar;
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
            wd.a r1 = zd.i.f26796h     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            zd.i r1 = new zd.i     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf ce.s -> L11
            r2.g(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            ce.b r4 = r3.f3972a     // Catch: java.lang.Throwable -> Lf
            zd.i r4 = (zd.i) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.g(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: zd.e.d(ce.f, ce.i):ce.k");
    }

    @Override // ce.k
    public final /* bridge */ /* synthetic */ k e(p pVar) {
        g((i) pVar);
        return this;
    }

    public final i f() {
        i iVar = new i(this);
        if ((this.f26766b & 1) == 1) {
            this.f26767c = Collections.unmodifiableList(this.f26767c);
            this.f26766b &= -2;
        }
        iVar.f26798b = this.f26767c;
        if ((this.f26766b & 2) == 2) {
            this.f26768d = Collections.unmodifiableList(this.f26768d);
            this.f26766b &= -3;
        }
        iVar.f26799c = this.f26768d;
        return iVar;
    }

    public final void g(i iVar) {
        if (iVar == i.f26795g) {
            return;
        }
        if (!iVar.f26798b.isEmpty()) {
            if (this.f26767c.isEmpty()) {
                this.f26767c = iVar.f26798b;
                this.f26766b &= -2;
            } else {
                if ((this.f26766b & 1) != 1) {
                    this.f26767c = new ArrayList(this.f26767c);
                    this.f26766b |= 1;
                }
                this.f26767c.addAll(iVar.f26798b);
            }
        }
        if (!iVar.f26799c.isEmpty()) {
            if (this.f26768d.isEmpty()) {
                this.f26768d = iVar.f26799c;
                this.f26766b &= -3;
            } else {
                if ((this.f26766b & 2) != 2) {
                    this.f26768d = new ArrayList(this.f26768d);
                    this.f26766b |= 2;
                }
                this.f26768d.addAll(iVar.f26799c);
            }
        }
        this.f3948a = this.f3948a.i(iVar.f26797a);
    }
}
