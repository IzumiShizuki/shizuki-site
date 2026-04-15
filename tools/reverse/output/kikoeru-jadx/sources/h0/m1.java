package h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m1 extends jc.m implements ic.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f7782c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1(p1 p1Var, int i10) {
        super(0);
        this.f7781b = i10;
        this.f7782c = p1Var;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f7781b) {
            case 0:
                return Boolean.valueOf(this.f7782c.f7802a.e() > 0.0f);
            default:
                p1 p1Var = this.f7782c;
                return Boolean.valueOf(p1Var.f7802a.e() < p1Var.f7803b.e());
        }
    }
}
