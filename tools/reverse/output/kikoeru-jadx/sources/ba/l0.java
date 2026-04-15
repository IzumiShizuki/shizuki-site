package ba;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l0 implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0 f2404b;

    public /* synthetic */ l0(z0 z0Var, int i10) {
        this.f2403a = i10;
        this.f2404b = z0Var;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f2403a) {
            case 0:
                hg.b bVarP = pc.f0.P(gg.c.a(), "showUnsupportedOrderWarn", Boolean.TRUE, jc.z.a(Boolean.TYPE));
                Boolean bool = Boolean.FALSE;
                bVarP.d(bool);
                this.f2404b.f2530i.setValue(bool);
                return ub.a0.f21526a;
            case 1:
                this.f2404b.f2530i.setValue(Boolean.FALSE);
                return ub.a0.f21526a;
            case 2:
                this.f2404b.f2530i.setValue(Boolean.FALSE);
                return ub.a0.f21526a;
            case 3:
                return new f1(androidx.lifecycle.m0.h(this.f2404b), "MAIN_PAGE_DEFAULT");
            case 4:
                return new f1(androidx.lifecycle.m0.h(this.f2404b), "MAIN_PAGE_POPULAR");
            default:
                return new f1(androidx.lifecycle.m0.h(this.f2404b), "MAIN_PAGE_RECOMMEND");
        }
    }
}
