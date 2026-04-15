package q9;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hf.y f17973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r0 f17974c;

    public /* synthetic */ c(int i10, hf.y yVar, r0 r0Var) {
        this.f17972a = i10;
        this.f17973b = yVar;
        this.f17974c = r0Var;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f17972a) {
            case 0:
                hf.a0.y(this.f17973b, null, null, new l(this.f17974c, null, 1), 3);
                break;
            case 1:
                hf.a0.y(this.f17973b, null, null, new l(this.f17974c, null, 0), 3);
                break;
            default:
                r0 r0Var = this.f17974c;
                r0Var.f18089f.setValue(null);
                hf.a0.y(this.f17973b, null, null, new l(r0Var, null, 2), 3);
                break;
        }
        return ub.a0.f21526a;
    }

    public /* synthetic */ c(r0 r0Var, hf.y yVar) {
        this.f17972a = 2;
        this.f17974c = r0Var;
        this.f17973b = yVar;
    }
}
