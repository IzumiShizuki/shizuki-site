package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f7 implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c2 f12998b;

    public /* synthetic */ f7(c2 c2Var, int i10) {
        this.f12997a = i10;
        this.f12998b = c2Var;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f12997a) {
            case 0:
                return new f3.j((((long) lc.b.R(((Number) this.f12998b.f12778e.getValue()).floatValue())) << 32) | (((long) 0) & 4294967295L));
            default:
                float fFloatValue = ((Float) obj).floatValue();
                c2 c2Var = this.f12998b;
                x0.a1 a1Var = c2Var.f12780g;
                float fE = a1Var.e() + fFloatValue;
                float fJ = nh.b.j(fE, c2Var.f12784k, c2Var.f12785l);
                float f10 = fE - fJ;
                j5 j5Var = (j5) c2Var.f12788o.getValue();
                float fSin = 0.0f;
                if (j5Var != null) {
                    float f11 = f10 < 0.0f ? j5Var.f13137b : j5Var.f13138c;
                    if (f11 != 0.0f) {
                        float f12 = j5Var.f13136a;
                        float f13 = f10 / f12;
                        if (f13 < -1.0f) {
                            f13 = -1.0f;
                        }
                        if (f13 > 1.0f) {
                            f13 = 1.0f;
                        }
                        fSin = ((float) Math.sin((f13 * 3.1415927f) / 2)) * (f12 / f11);
                    }
                }
                c2Var.f12778e.f(fJ + fSin);
                c2Var.f12779f.f(f10);
                a1Var.f(fE);
                return ub.a0.f21526a;
        }
    }
}
