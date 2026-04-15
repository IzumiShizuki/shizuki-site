package h1;

import java.util.Arrays;
import java.util.HashMap;
import o.l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c f7996o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f7997p;

    public d(long j10, k kVar, ic.k kVar2, ic.k kVar3, c cVar) {
        super(j10, kVar, kVar2, kVar3);
        this.f7996o = cVar;
        cVar.k();
    }

    @Override // h1.c, h1.g
    public final void c() {
        if (this.f8010c) {
            return;
        }
        super.c();
        if (this.f7997p) {
            return;
        }
        this.f7997p = true;
        this.f7996o.l();
    }

    @Override // h1.c
    public final t w() throws Throwable {
        d dVar;
        c cVar = this.f7996o;
        if (cVar.f7994m || cVar.f8010c) {
            return new h();
        }
        l0 l0Var = this.f7989h;
        long j10 = this.f8009b;
        HashMap mapC = l0Var != null ? n.c(cVar.g(), this, this.f7996o.d()) : null;
        synchronized (n.f8051c) {
            try {
                n.d(this);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                if (l0Var == null || l0Var.f16005d == 0) {
                    dVar = this;
                    a();
                } else {
                    dVar = this;
                    t tVarZ = dVar.z(this.f7996o.g(), l0Var, mapC, this.f7996o.d());
                    if (!tVarZ.equals(i.f8017c)) {
                        return tVarZ;
                    }
                    l0 l0VarX = dVar.f7996o.x();
                    if (l0VarX != null) {
                        l0VarX.k(l0Var);
                    } else {
                        dVar.f7996o.C(l0Var);
                        dVar.f7989h = null;
                    }
                }
                if (jc.l.h(dVar.f7996o.g(), j10) < 0) {
                    dVar.f7996o.v();
                }
                c cVar2 = dVar.f7996o;
                cVar2.r(cVar2.d().i(j10).a(dVar.f7991j));
                dVar.f7996o.A(j10);
                c cVar3 = dVar.f7996o;
                int i10 = dVar.f8011d;
                dVar.f8011d = -1;
                if (i10 >= 0) {
                    int[] iArr = cVar3.f7992k;
                    jc.l.e(iArr, "<this>");
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i10;
                    cVar3.f7992k = iArrCopyOf;
                } else {
                    cVar3.getClass();
                }
                dVar.f7996o.B(dVar.f7991j);
                c cVar4 = dVar.f7996o;
                int[] iArr2 = dVar.f7992k;
                cVar4.getClass();
                if (iArr2.length != 0) {
                    int[] iArr3 = cVar4.f7992k;
                    if (iArr3.length != 0) {
                        int length2 = iArr3.length;
                        int length3 = iArr2.length;
                        int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                        System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                        jc.l.b(iArrCopyOf2);
                        iArr2 = iArrCopyOf2;
                    }
                    cVar4.f7992k = iArr2;
                }
                dVar.f7994m = true;
                if (!dVar.f7997p) {
                    dVar.f7997p = true;
                    dVar.f7996o.l();
                }
                return i.f8017c;
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }
}
