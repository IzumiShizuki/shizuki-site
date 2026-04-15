package da;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hf.y f5725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0.z f5726c;

    public /* synthetic */ l(hf.y yVar, c0.z zVar, int i10) {
        this.f5724a = i10;
        this.f5725b = yVar;
        this.f5726c = zVar;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f5724a) {
            case 0:
                hf.a0.y(this.f5725b, null, null, new c0.y(this.f5726c, (yb.c) null, 1), 3);
                break;
            default:
                hf.a0.y(this.f5725b, null, null, new c0.y(this.f5726c, (yb.c) null, 2), 3);
                break;
        }
        return ub.a0.f21526a;
    }
}
