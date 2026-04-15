package i8;

import android.os.SystemClock;
import g2.n1;
import i2.l0;
import r.y1;
import x0.a1;
import x0.b1;
import x0.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t extends v1.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public v1.b f9458f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v1.b f9459g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g2.p f9460h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f9461i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f9462j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f9465m;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b1 f9463k = new b1(0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f9464l = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a1 f9466n = new a1(1.0f);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final e1 f9467o = x0.v.v(null);

    public t(v1.b bVar, v1.b bVar2, g2.p pVar, int i10, boolean z10) {
        this.f9458f = bVar;
        this.f9459g = bVar2;
        this.f9460h = pVar;
        this.f9461i = i10;
        this.f9462j = z10;
    }

    @Override // v1.b
    public final boolean b(float f10) {
        this.f9466n.f(f10);
        return true;
    }

    @Override // v1.b
    public final boolean e(q1.k kVar) {
        this.f9467o.setValue(kVar);
        return true;
    }

    @Override // v1.b
    public final long h() {
        v1.b bVar = this.f9458f;
        long jH = bVar != null ? bVar.h() : 0L;
        v1.b bVar2 = this.f9459g;
        long jH2 = bVar2 != null ? bVar2.h() : 0L;
        boolean z10 = jH != 9205357640488583168L;
        boolean z11 = jH2 != 9205357640488583168L;
        if (z10 && z11) {
            return nh.a.d(Math.max(p1.e.d(jH), p1.e.d(jH2)), Math.max(p1.e.b(jH), p1.e.b(jH2)));
        }
        return 9205357640488583168L;
    }

    @Override // v1.b
    public final void i(l0 l0Var) {
        boolean z10 = this.f9465m;
        a1 a1Var = this.f9466n;
        v1.b bVar = this.f9459g;
        if (z10) {
            j(l0Var, bVar, a1Var.e());
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f9464l == -1) {
            this.f9464l = jUptimeMillis;
        }
        float f10 = (jUptimeMillis - this.f9464l) / this.f9461i;
        float fE = a1Var.e() * nh.b.j(f10, 0.0f, 1.0f);
        float fE2 = this.f9462j ? a1Var.e() - fE : a1Var.e();
        this.f9465m = f10 >= 1.0f;
        j(l0Var, this.f9458f, fE2);
        j(l0Var, bVar, fE);
        if (this.f9465m) {
            this.f9458f = null;
        } else {
            b1 b1Var = this.f9463k;
            b1Var.f(b1Var.e() + 1);
        }
    }

    public final void j(l0 l0Var, v1.b bVar, float f10) {
        s1.b bVar2 = l0Var.f8782a;
        if (bVar == null || f10 <= 0.0f) {
            return;
        }
        long jE = l0Var.e();
        long jH = bVar.h();
        long jL = (jH == 9205357640488583168L || p1.e.e(jH) || jE == 9205357640488583168L || p1.e.e(jE)) ? jE : n1.l(jH, this.f9460h.a(jH, jE));
        e1 e1Var = this.f9467o;
        if (jE == 9205357640488583168L || p1.e.e(jE)) {
            bVar.g(l0Var, jL, f10, (q1.k) e1Var.getValue());
            return;
        }
        float f11 = 2;
        float fD = (p1.e.d(jE) - p1.e.d(jL)) / f11;
        float fB = (p1.e.b(jE) - p1.e.b(jL)) / f11;
        ((y1) bVar2.f19346b.f3618b).a0(fD, fB, fD, fB);
        bVar.g(l0Var, jL, f10, (q1.k) e1Var.getValue());
        y1 y1Var = (y1) bVar2.f19346b.f3618b;
        float f12 = -fD;
        float f13 = -fB;
        y1Var.a0(f12, f13, f12, f13);
    }
}
