package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x6 implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.f f13894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ic.n f13895c;

    public /* synthetic */ x6(f1.f fVar, ic.n nVar, int i10, int i11) {
        this.f13893a = i11;
        this.f13894b = fVar;
        this.f13895c = nVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        int i10 = this.f13893a;
        x0.o oVar = (x0.o) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                a7.b(this.f13894b, this.f13895c, oVar, x0.v.D(1));
                break;
            default:
                a7.a(this.f13894b, this.f13895c, oVar, x0.v.D(1));
                break;
        }
        return ub.a0.f21526a;
    }
}
