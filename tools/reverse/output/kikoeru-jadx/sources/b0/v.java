package b0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t1.b f1364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f1365d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(t1.b bVar, a0 a0Var, int i10) {
        super(1);
        this.f1363b = i10;
        this.f1364c = bVar;
        this.f1365d = a0Var;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f1363b) {
            case 0:
                this.f1364c.f(((Number) ((r.c) obj).e()).floatValue());
                this.f1365d.f1174c.b();
                break;
            default:
                this.f1364c.f(((Number) ((r.c) obj).e()).floatValue());
                this.f1365d.f1174c.b();
                break;
        }
        return ub.a0.f21526a;
    }
}
