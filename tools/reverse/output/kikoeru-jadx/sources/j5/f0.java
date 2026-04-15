package j5;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f0 implements p4.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ah.j f10254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f10255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f10256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10257d;

    public /* synthetic */ f0(ah.j jVar, u uVar, z zVar, int i10) {
        this.f10254a = jVar;
        this.f10255b = uVar;
        this.f10256c = zVar;
        this.f10257d = i10;
    }

    @Override // p4.g
    public final void accept(Object obj) {
        j0 j0Var = (j0) obj;
        ah.j jVar = this.f10254a;
        j0Var.k(jVar.f390b, (d0) jVar.f391c, this.f10255b, this.f10256c, this.f10257d);
    }
}
