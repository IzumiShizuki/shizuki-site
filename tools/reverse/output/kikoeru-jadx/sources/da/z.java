package da;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ic.a f5859b;

    public /* synthetic */ z(int i10, ic.a aVar) {
        this.f5858a = i10;
        this.f5859b = aVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f5858a) {
            case 0:
                this.f5859b.b();
                return ub.a0.f21526a;
            case 1:
                ((Boolean) obj).booleanValue();
                this.f5859b.b();
                return ub.a0.f21526a;
            case 2:
                jc.l.e(obj, "it");
                return this.f5859b.b();
            case 3:
                this.f5859b.b();
                return ub.a0.f21526a;
            case 4:
                this.f5859b.b();
                return ub.a0.f21526a;
            case 5:
                this.f5859b.b();
                return ub.a0.f21526a;
            default:
                return new f3.j((((long) lc.b.R(((Number) this.f5859b.b()).floatValue())) << 32) | (((long) 0) & 4294967295L));
        }
    }
}
