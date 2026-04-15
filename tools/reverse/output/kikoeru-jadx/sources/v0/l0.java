package v0;

import s.v0;
import s.y0;
import x0.a1;
import x0.b1;
import x0.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements u.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a f22256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oc.a f22257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a1 f22258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ic.k f22259d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f22262g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a1 f22266k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a1 f22267l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m0.v f22268m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y0 f22269n;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f22260e = new float[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b1 f22261f = new b1(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a1 f22263h = new a1(0.0f);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e1 f22264i = x0.v.v(Boolean.FALSE);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r2.a f22265j = new r2.a(10, this);

    public l0(float f10, ic.a aVar, oc.a aVar2) {
        this.f22256a = aVar;
        this.f22257b = aVar2;
        this.f22258c = new a1(f10);
        float f11 = aVar2.f16305a;
        float f12 = aVar2.f16306b - f11;
        this.f22266k = new a1(android.support.v4.media.session.b.L(0.0f, 0.0f, nh.b.j(f12 == 0.0f ? 0.0f : (f10 - f11) / f12, 0.0f, 1.0f)));
        this.f22267l = new a1(0.0f);
        this.f22268m = new m0.v(3, this);
        this.f22269n = new y0();
    }

    public final void a(float f10) {
        float fE = this.f22261f.e();
        a1 a1Var = this.f22263h;
        float f11 = 2;
        float fMax = Math.max(fE - (a1Var.e() / f11), 0.0f);
        float fMin = Math.min(a1Var.e() / f11, fMax);
        a1 a1Var2 = this.f22266k;
        float fE2 = a1Var2.e() + f10;
        a1 a1Var3 = this.f22267l;
        a1Var2.f(a1Var3.e() + fE2);
        a1Var3.f(0.0f);
        float fE3 = k0.e(a1Var2.e(), fMin, fMax, this.f22260e);
        oc.a aVar = this.f22257b;
        float f12 = fMax - fMin;
        float fL = android.support.v4.media.session.b.L(aVar.f16305a, aVar.f16306b, nh.b.j(f12 == 0.0f ? 0.0f : (fE3 - fMin) / f12, 0.0f, 1.0f));
        if (fL == this.f22258c.e()) {
            return;
        }
        ic.k kVar = this.f22259d;
        if (kVar != null) {
            kVar.a(Float.valueOf(fL));
        } else {
            c(fL);
        }
    }

    public final float b() {
        oc.a aVar = this.f22257b;
        float f10 = aVar.f16305a;
        float f11 = aVar.f16306b;
        float fJ = nh.b.j(this.f22258c.e(), f10, f11);
        float f12 = f11 - f10;
        return nh.b.j(f12 == 0.0f ? 0.0f : (fJ - f10) / f12, 0.0f, 1.0f);
    }

    public final void c(float f10) {
        oc.a aVar = this.f22257b;
        float f11 = aVar.f16305a;
        float f12 = aVar.f16306b;
        this.f22258c.f(k0.e(nh.b.j(f10, f11, f12), f11, f12, this.f22260e));
    }

    @Override // u.o0
    public final Object d(v0 v0Var, ic.n nVar, yb.c cVar) {
        Object objK = hf.a0.k(new q.q(this, v0Var, nVar, (yb.c) null), cVar);
        return objK == zb.a.f26667a ? objK : ub.a0.f21526a;
    }
}
