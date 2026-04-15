package c7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class x extends v {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f0 f3753g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(f0 f0Var) {
        super(f0Var);
        this.f3753g = f0Var;
    }

    @Override // c7.v, b0.w1
    public final void Y() {
        w wVar = new w(this, this.f3753g);
        this.f1396d = wVar;
        wVar.onCreate();
    }
}
