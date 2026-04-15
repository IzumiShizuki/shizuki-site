package ba;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0 implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.w0 f2442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ic.a f2443c;

    public /* synthetic */ o0(x0.w0 w0Var, ic.a aVar, int i10) {
        this.f2441a = i10;
        this.f2442b = w0Var;
        this.f2443c = aVar;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f2441a) {
            case 0:
                this.f2442b.setValue(Boolean.FALSE);
                this.f2443c.b();
                break;
            case 1:
                return Boolean.valueOf(((Boolean) this.f2442b.getValue()).booleanValue() || ((Boolean) this.f2443c.b()).booleanValue());
            case 2:
                this.f2442b.setValue(Boolean.FALSE);
                this.f2443c.b();
                break;
            default:
                this.f2442b.setValue(Boolean.FALSE);
                this.f2443c.b();
                break;
        }
        return ub.a0.f21526a;
    }
}
