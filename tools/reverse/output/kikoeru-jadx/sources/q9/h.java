package q9;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f18011b;

    public /* synthetic */ h(o oVar, int i10) {
        this.f18010a = i10;
        this.f18011b = oVar;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f18010a) {
            case 0:
                this.f18011b.f18055d.setValue(Boolean.FALSE);
                break;
            case 1:
                this.f18011b.f18055d.setValue(Boolean.TRUE);
                break;
            default:
                this.f18011b.f18060i.setValue(Boolean.TRUE);
                break;
        }
        return ub.a0.f21526a;
    }
}
