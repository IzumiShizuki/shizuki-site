package h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends jc.m implements ic.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c1 f7927c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(c1 c1Var, int i10) {
        super(0);
        this.f7926b = i10;
        this.f7927c = c1Var;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f7926b) {
            case 0:
                this.f7927c.b();
                break;
            default:
                this.f7927c.onCancel();
                break;
        }
        return ub.a0.f21526a;
    }
}
