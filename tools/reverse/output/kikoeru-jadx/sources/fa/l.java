package fa;

import hf.l0;
import hf.y;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f7012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ic.k f7013c;

    public /* synthetic */ l(y yVar, ic.k kVar, int i10) {
        this.f7011a = i10;
        switch (i10) {
            case 1:
                break;
            default:
                j9.u uVar = j9.u.f10753a;
                break;
        }
        this.f7012b = yVar;
        this.f7013c = kVar;
    }

    @Override // ic.a
    public final Object b() {
        int i10 = this.f7011a;
        a0 a0Var = a0.f21526a;
        ic.k kVar = this.f7013c;
        y yVar = this.f7012b;
        switch (i10) {
            case 0:
                j9.u uVar = j9.u.f10753a;
                pf.e eVar = l0.f8566a;
                hf.a0.y(yVar, pf.d.f17138c, null, new p(kVar, null), 2);
                break;
            default:
                n9.b.c(yVar, kVar, null);
                break;
        }
        return a0Var;
    }
}
