package ch;

import android.util.SparseArray;
import b0.w1;
import h0.t1;
import r.a2;
import r.y1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z implements y2.r, l6.b, a2, x0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4286c;

    public z(h1.d0 d0Var) {
        this.f4286c = d0Var;
        this.f4284a = 0;
    }

    @Override // r.a2
    public int D() {
        return this.f4285b;
    }

    @Override // r.x1
    public r.p H(long j10, r.p pVar, r.p pVar2, r.p pVar3) {
        return ((w1) this.f4286c).H(j10, pVar, pVar2, pVar3);
    }

    @Override // r.a2
    public int I() {
        return this.f4284a;
    }

    @Override // r.x1
    public /* synthetic */ boolean a() {
        return false;
    }

    @Override // x0.c
    public void b(int i10, Object obj) {
        ((x0.c) this.f4286c).b(i10 + (this.f4285b == 0 ? this.f4284a : 0), obj);
    }

    @Override // x0.c
    public void c(Object obj) {
        this.f4285b++;
        ((x0.c) this.f4286c).c(obj);
    }

    @Override // x0.c
    public void d() {
        ((x0.c) this.f4286c).d();
    }

    @Override // x0.c
    public void e(int i10, int i11, int i12) {
        int i13 = this.f4285b == 0 ? this.f4284a : 0;
        ((x0.c) this.f4286c).e(i10 + i13, i11 + i13, i12);
    }

    @Override // x0.c
    public void f(int i10, int i11) {
        ((x0.c) this.f4286c).f(i10 + (this.f4285b == 0 ? this.f4284a : 0), i11);
    }

    @Override // r.x1
    public r.p g(long j10, r.p pVar, r.p pVar2, r.p pVar3) {
        return ((w1) this.f4286c).g(j10, pVar, pVar2, pVar3);
    }

    @Override // l6.b
    public int h() {
        return this.f4284a;
    }

    @Override // y2.r
    public int i(int i10) {
        int i11 = ((y2.r) this.f4286c).i(i10);
        if (i10 >= 0 && i10 <= this.f4285b) {
            t1.c(i11, this.f4284a, i10);
        }
        return i11;
    }

    @Override // x0.c
    public void j() {
        if (!(this.f4285b > 0)) {
            x0.p.c("OffsetApplier up called with no corresponding down");
        }
        this.f4285b--;
        ((x0.c) this.f4286c).j();
    }

    @Override // x0.c
    public void k(int i10, Object obj) {
        ((x0.c) this.f4286c).k(i10 + (this.f4285b == 0 ? this.f4284a : 0), obj);
    }

    @Override // l6.b
    public int m() {
        return this.f4285b;
    }

    @Override // r.x1
    public long n(r.p pVar, r.p pVar2, r.p pVar3) {
        return ((long) (I() + D())) * 1000000;
    }

    @Override // l6.b
    public int o() {
        int i10 = this.f4284a;
        return i10 == -1 ? ((p4.s) this.f4286c).y() : i10;
    }

    @Override // y2.r
    public int p(int i10) {
        int iP = ((y2.r) this.f4286c).p(i10);
        if (i10 >= 0 && i10 <= this.f4284a) {
            t1.b(iP, this.f4285b, i10);
        }
        return iP;
    }

    @Override // x0.c
    public void q(ic.n nVar, Object obj) {
        ((x0.c) this.f4286c).q(nVar, obj);
    }

    public int r(byte b10) {
        h1.d0 d0Var = (h1.d0) this.f4286c;
        int i10 = (((int[]) ((y1) d0Var.f7999b).f18634b)[(b10 & 255) >> 3] >> ((b10 & 7) << 2)) & 15;
        int i11 = this.f4284a;
        if (i11 == 0) {
            this.f4285b = ((int[]) d0Var.f8001d)[i10];
        }
        y1 y1Var = (y1) d0Var.f8000c;
        int i12 = (i11 * d0Var.f7998a) + i10;
        int i13 = (((int[]) y1Var.f18634b)[i12 >> 3] >> ((i12 & 7) << 2)) & 15;
        this.f4284a = i13;
        return i13;
    }

    @Override // r.x1
    public r.p t(r.p pVar, r.p pVar2, r.p pVar3) {
        return ((w1) this.f4286c).H(n(pVar, pVar2, pVar3), pVar, pVar2, pVar3);
    }

    public z(y2.r rVar, int i10, int i11) {
        this.f4286c = rVar;
        this.f4284a = i10;
        this.f4285b = i11;
    }

    public z(x0.c cVar, int i10) {
        this.f4286c = cVar;
        this.f4284a = i10;
    }

    public z() {
        this.f4286c = new z[256];
        this.f4284a = 0;
        this.f4285b = 0;
    }

    public z(int i10, int i11) {
        this.f4286c = null;
        this.f4284a = i10;
        int i12 = i11 & 7;
        this.f4285b = i12 == 0 ? 8 : i12;
    }

    public z(int i10, int i11, r.v vVar) {
        this.f4284a = i10;
        this.f4285b = i11;
        this.f4286c = new w1(new r.a0(i10, i11, vVar));
    }

    public z(int i10, int i11, SparseArray sparseArray) {
        this.f4284a = i10;
        this.f4285b = i11;
        this.f4286c = sparseArray;
    }

    public z(q4.c cVar, m4.q qVar) {
        p4.s sVar = cVar.f17711c;
        this.f4286c = sVar;
        sVar.G(12);
        int iY = sVar.y();
        if ("audio/raw".equals(qVar.f14544n)) {
            int iB = p4.c0.B(qVar.F, qVar.D);
            if (iY == 0 || iY % iB != 0) {
                p4.c.B("BoxParsers", "Audio sample size mismatch. stsd sample size: " + iB + ", stsz sample size: " + iY);
                iY = iB;
            }
        }
        this.f4284a = iY == 0 ? -1 : iY;
        this.f4285b = sVar.y();
    }

    @Override // x0.c
    public /* synthetic */ void l() {
    }
}
