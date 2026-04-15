package ba;

import x0.n2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ic.k f2347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n2 f2348c;

    public /* synthetic */ f(ic.k kVar, n2 n2Var, int i10) {
        this.f2346a = i10;
        this.f2347b = kVar;
        this.f2348c = n2Var;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f2346a) {
            case 0:
                this.f2347b.a((String) this.f2348c.getValue());
                break;
            default:
                this.f2347b.a((String) this.f2348c.getValue());
                break;
        }
        return ub.a0.f21526a;
    }
}
