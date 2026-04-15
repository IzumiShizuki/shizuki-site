package s;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j1 extends jc.m implements ic.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1 f19192c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1(l1 l1Var, int i10) {
        super(0);
        this.f19191b = i10;
        this.f19192c = l1Var;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f19191b) {
            case 0:
                return Float.valueOf(this.f19192c.f19217o.f19241a.e());
            default:
                return Float.valueOf(this.f19192c.f19217o.f19244d.e());
        }
    }
}
