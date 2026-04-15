package j5;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g0 implements p4.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ah.j f10273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f10274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f10275d;

    public /* synthetic */ g0(ah.j jVar, u uVar, z zVar, int i10) {
        this.f10272a = i10;
        this.f10273b = jVar;
        this.f10274c = uVar;
        this.f10275d = zVar;
    }

    @Override // p4.g
    public final void accept(Object obj) {
        j0 j0Var = (j0) obj;
        switch (this.f10272a) {
            case 0:
                ah.j jVar = this.f10273b;
                j0Var.G(jVar.f390b, (d0) jVar.f391c, this.f10274c, this.f10275d);
                break;
            default:
                ah.j jVar2 = this.f10273b;
                j0Var.H(jVar2.f390b, (d0) jVar2.f391c, this.f10274c, this.f10275d);
                break;
        }
    }
}
