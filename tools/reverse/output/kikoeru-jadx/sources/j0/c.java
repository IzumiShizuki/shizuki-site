package j0;

import a0.f0;
import android.graphics.Rect;
import ba.u0;
import h0.d1;
import h0.x;
import hf.a0;
import hf.r1;
import hf.z;
import j2.l1;
import j2.n1;
import j2.u2;
import java.lang.ref.WeakReference;
import lf.h0;
import lf.o0;
import lf.p0;
import t2.i0;
import t2.k0;
import y2.t;
import y2.y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f9586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r1 f9587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q f9588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o0 f9589d;

    @Override // y2.t
    public final void a() {
        j(null);
    }

    @Override // y2.t
    public final void b() {
        u2 u2Var;
        m mVar = this.f9586a;
        if (mVar == null || (u2Var = (u2) i2.f.i(mVar, l1.f9874p)) == null) {
            return;
        }
        ((n1) u2Var).b();
    }

    @Override // y2.t
    public final void c() throws Throwable {
        r1 r1Var = this.f9587b;
        if (r1Var != null) {
            r1Var.g(null);
        }
        this.f9587b = null;
        h0 h0VarI = i();
        if (h0VarI != null) {
            ((o0) h0VarI).i();
        }
    }

    @Override // y2.t
    public final void d(y yVar, y2.j jVar, cg.b bVar, x xVar) {
        j(new d1(yVar, this, jVar, bVar, xVar));
    }

    @Override // y2.t
    public final void e(y yVar, y2.r rVar, i0 i0Var, f0 f0Var, p1.c cVar, p1.c cVar2) {
        q qVar = this.f9588c;
        if (qVar != null) {
            n nVar = qVar.f9647m;
            synchronized (nVar.f9618c) {
                try {
                    nVar.f9625j = yVar;
                    nVar.f9627l = rVar;
                    nVar.f9626k = i0Var;
                    nVar.f9628m = cVar;
                    nVar.f9629n = cVar2;
                    if (nVar.f9620e || nVar.f9619d) {
                        nVar.a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // y2.t
    public final void f() {
        u2 u2Var;
        m mVar = this.f9586a;
        if (mVar == null || (u2Var = (u2) i2.f.i(mVar, l1.f9874p)) == null) {
            return;
        }
        ((n1) u2Var).a();
    }

    @Override // y2.t
    public final void g(y yVar, y yVar2) {
        q qVar = this.f9588c;
        if (qVar != null) {
            boolean z10 = (k0.a(qVar.f9642h.f25435b, yVar2.f25435b) && jc.l.a(qVar.f9642h.f25436c, yVar2.f25436c)) ? false : true;
            qVar.f9642h = yVar2;
            int size = qVar.f9644j.size();
            for (int i10 = 0; i10 < size; i10++) {
                r rVar = (r) ((WeakReference) qVar.f9644j.get(i10)).get();
                if (rVar != null) {
                    rVar.f9654g = yVar2;
                }
            }
            n nVar = qVar.f9647m;
            synchronized (nVar.f9618c) {
                nVar.f9625j = null;
                nVar.f9627l = null;
                nVar.f9626k = null;
                nVar.f9628m = null;
                nVar.f9629n = null;
            }
            if (jc.l.a(yVar, yVar2)) {
                if (z10) {
                    l lVar = qVar.f9636b;
                    int iE = k0.e(yVar2.f25435b);
                    int iD = k0.d(yVar2.f25435b);
                    k0 k0Var = qVar.f9642h.f25436c;
                    int iE2 = k0Var != null ? k0.e(k0Var.f20358a) : -1;
                    k0 k0Var2 = qVar.f9642h.f25436c;
                    lVar.a().updateSelection(lVar.f9611b, iE, iD, iE2, k0Var2 != null ? k0.d(k0Var2.f20358a) : -1);
                    return;
                }
                return;
            }
            if (yVar != null && (!jc.l.a(yVar.f25434a.f20320b, yVar2.f25434a.f20320b) || (k0.a(yVar.f25435b, yVar2.f25435b) && !jc.l.a(yVar.f25436c, yVar2.f25436c)))) {
                l lVar2 = qVar.f9636b;
                lVar2.a().restartInput(lVar2.f9611b);
                return;
            }
            int size2 = qVar.f9644j.size();
            for (int i11 = 0; i11 < size2; i11++) {
                r rVar2 = (r) ((WeakReference) qVar.f9644j.get(i11)).get();
                if (rVar2 != null) {
                    y yVar3 = qVar.f9642h;
                    l lVar3 = qVar.f9636b;
                    if (rVar2.f9658k) {
                        rVar2.f9654g = yVar3;
                        if (rVar2.f9656i) {
                            lVar3.a().updateExtractedText(lVar3.f9611b, rVar2.f9655h, a2.c.v(yVar3));
                        }
                        k0 k0Var3 = yVar3.f25436c;
                        long j10 = yVar3.f25435b;
                        int iE3 = k0Var3 != null ? k0.e(k0Var3.f20358a) : -1;
                        k0 k0Var4 = yVar3.f25436c;
                        lVar3.a().updateSelection(lVar3.f9611b, k0.e(j10), k0.d(j10), iE3, k0Var4 != null ? k0.d(k0Var4.f20358a) : -1);
                    }
                }
            }
        }
    }

    @Override // y2.t
    public final void h(p1.c cVar) {
        Rect rect;
        q qVar = this.f9588c;
        if (qVar != null) {
            qVar.f9646l = new Rect(lc.b.R(cVar.f16483a), lc.b.R(cVar.f16484b), lc.b.R(cVar.f16485c), lc.b.R(cVar.f16486d));
            if (!qVar.f9644j.isEmpty() || (rect = qVar.f9646l) == null) {
                return;
            }
            qVar.f9635a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    public final h0 i() {
        o0 o0Var = this.f9589d;
        if (o0Var != null) {
            return o0Var;
        }
        if (!i0.b.f8635a) {
            return null;
        }
        o0 o0VarA = p0.a((1 & 1) != 0 ? 0 : 1, (1 & 2) == 0 ? 16 : 0, kf.a.f11338c);
        this.f9589d = o0VarA;
        return o0VarA;
    }

    public final void j(d1 d1Var) {
        m mVar = this.f9586a;
        if (mVar == null) {
            return;
        }
        r1 r1VarY = null;
        e.j jVar = new e.j(d1Var, this, mVar, r1VarY, 9);
        if (mVar.f9703n) {
            r1VarY = a0.y(mVar.n0(), null, z.f8619d, new u0(mVar, jVar, r1VarY, 20), 1);
        }
        this.f9587b = r1VarY;
    }

    public final void k(m mVar) {
        if (this.f9586a != mVar) {
            x.a.c("Expected textInputModifierNode to be " + mVar + " but was " + this.f9586a);
        }
        this.f9586a = null;
    }
}
