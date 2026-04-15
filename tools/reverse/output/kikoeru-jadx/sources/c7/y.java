package c7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y extends x {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f0 f3754h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(f0 f0Var) {
        super(f0Var);
        this.f3754h = f0Var;
    }

    @Override // b0.w1
    public final k1 N() {
        f0 f0Var = this.f3754h;
        s sVar = f0Var.f3627f;
        if (sVar == null) {
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }
        if (sVar != f0Var.f3624c) {
            return sVar.f3722d;
        }
        t tVar = (t) this.f1396d;
        tVar.getClass();
        return new k1(tVar.getCurrentBrowserInfo());
    }
}
