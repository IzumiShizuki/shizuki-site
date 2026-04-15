package b0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j1 extends jc.m implements ic.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m1 f1277c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1(m1 m1Var, int i10) {
        super(0);
        this.f1276b = i10;
        this.f1277c = m1Var;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f1276b) {
            case 0:
                m1 m1Var = this.f1277c;
                return Float.valueOf(m1Var.f1304p.a() - m1Var.f1304p.c());
            case 1:
                return Float.valueOf(this.f1277c.f1304p.b());
            default:
                return Float.valueOf(this.f1277c.f1304p.d());
        }
    }
}
