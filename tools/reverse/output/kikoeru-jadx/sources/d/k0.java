package d;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5222d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5223e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(e7.a0 a0Var) {
        super(false);
        this.f5223e = a0Var;
    }

    @Override // d.b0
    public final void b() {
        switch (this.f5222d) {
            case 0:
                ((j3.a) this.f5223e).a(this);
                break;
            default:
                ((e7.a0) this.f5223e).c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(j3.a aVar) {
        super(true);
        this.f5223e = aVar;
    }
}
