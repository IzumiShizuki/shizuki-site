package c2;

import i2.b2;
import i2.d2;
import i2.u1;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class g extends j1.p implements d2, u1, i2.l {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public i2.o f3266o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a f3267p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f3268q;

    public g(a aVar, i2.o oVar) {
        this.f3266o = oVar;
        this.f3267p = aVar;
    }

    public final void B0() {
        a aVar;
        jc.y yVar = new jc.y();
        i2.f.B(this, new f(1));
        g gVar = (g) yVar.f10838a;
        if (gVar == null || (aVar = gVar.f3267p) == null) {
            aVar = this.f3267p;
        }
        C0(aVar);
    }

    public abstract void C0(q qVar);

    public final void D0() {
        jc.u uVar = new jc.u();
        uVar.f10834a = true;
        i2.f.C(this, new e(uVar, 0));
        if (uVar.f10834a) {
            B0();
        }
    }

    public abstract boolean E0(int i10);

    public final void F0() {
        if (this.f3268q) {
            this.f3268q = false;
            if (this.f9703n) {
                jc.y yVar = new jc.y();
                i2.f.B(this, new b0.u1(yVar, 2));
                g gVar = (g) yVar.f10838a;
                if (gVar != null) {
                    gVar.B0();
                } else {
                    C0(null);
                }
            }
        }
    }

    @Override // i2.u1
    public final /* synthetic */ boolean d0() {
        return false;
    }

    @Override // i2.u1
    public final void h0() {
        z();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    @Override // i2.u1
    public final void j(l lVar, m mVar, long j10) {
        if (mVar == m.f3315b) {
            ?? r32 = lVar.f3309a;
            int size = ((Collection) r32).size();
            for (int i10 = 0; i10 < size; i10++) {
                if (E0(((t) r32.get(i10)).f3330i)) {
                    int i11 = lVar.f3313e;
                    if (i11 == 4) {
                        this.f3268q = true;
                        D0();
                        return;
                    } else {
                        if (i11 == 5) {
                            F0();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // i2.u1
    public final long l() {
        i2.o oVar = this.f3266o;
        if (oVar == null) {
            return b2.f8652a;
        }
        f3.c cVar = i2.f.y(this).f8766y;
        int i10 = b2.f8653b;
        return i2.d.c(cVar.a0(oVar.f8807a), cVar.a0(oVar.f8808b), cVar.a0(oVar.f8809c), cVar.a0(oVar.f8810d));
    }

    @Override // j1.p
    public final void s0() {
        z();
    }

    @Override // j1.p
    public final void t0() {
        F0();
    }

    @Override // i2.u1
    public final void z() {
        F0();
    }

    @Override // i2.u1
    public final /* synthetic */ void H() {
    }
}
