package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j4 implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i7.p2 f13134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hf.y f13135c;

    public /* synthetic */ j4(i7.p2 p2Var, hf.y yVar, int i10) {
        this.f13133a = i10;
        this.f13134b = p2Var;
        this.f13135c = yVar;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f13133a) {
            case 0:
                i7.p2 p2Var = this.f13134b;
                if (((Boolean) ((x) p2Var.f9258a).f13848d.a(r4.f13550c)).booleanValue()) {
                    hf.a0.y(this.f13135c, null, null, new p4(p2Var, null, 3), 3);
                }
                break;
            case 1:
                i7.p2 p2Var2 = this.f13134b;
                if (((Boolean) ((x) p2Var2.f9258a).f13848d.a(r4.f13548a)).booleanValue()) {
                    hf.a0.y(this.f13135c, null, null, new p4(p2Var2, null, 0), 3);
                }
                break;
            case 2:
                i7.p2 p2Var3 = this.f13134b;
                if (((Boolean) ((x) p2Var3.f9258a).f13848d.a(r4.f13548a)).booleanValue()) {
                    hf.a0.y(this.f13135c, null, null, new p4(p2Var3, null, 1), 3);
                }
                break;
            default:
                i7.p2 p2Var4 = this.f13134b;
                if (((Boolean) ((x) p2Var4.f9258a).f13848d.a(r4.f13549b)).booleanValue()) {
                    hf.a0.y(this.f13135c, null, null, new p4(p2Var4, null, 2), 3);
                }
                break;
        }
        return Boolean.TRUE;
    }
}
