package v0;

import x0.a1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0 f22241c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(l0 l0Var, int i10) {
        super(1);
        this.f22240b = i10;
        this.f22241c = l0Var;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        boolean z10;
        switch (this.f22240b) {
            case 0:
                float fFloatValue = ((Number) obj).floatValue();
                l0 l0Var = this.f22241c;
                oc.a aVar = l0Var.f22257b;
                float fJ = nh.b.j(fFloatValue, aVar.f16305a, aVar.f16306b);
                a1 a1Var = l0Var.f22258c;
                if (fJ == a1Var.e()) {
                    z10 = false;
                } else {
                    if (fJ != a1Var.e()) {
                        ic.k kVar = l0Var.f22259d;
                        if (kVar != null) {
                            kVar.a(Float.valueOf(fJ));
                        } else {
                            l0Var.c(fJ);
                        }
                    }
                    ic.a aVar2 = l0Var.f22256a;
                    if (aVar2 != null) {
                        aVar2.b();
                    }
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            default:
                long j10 = ((p1.b) obj).f16481a;
                l0 l0Var2 = this.f22241c;
                l0Var2.a(0.0f);
                l0Var2.f22265j.b();
                return ub.a0.f21526a;
        }
    }
}
