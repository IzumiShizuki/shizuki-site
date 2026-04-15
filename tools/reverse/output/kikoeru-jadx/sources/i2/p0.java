package i2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends jc.m implements ic.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f8815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f8816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f8817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t1 f8818e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(q0 q0Var, long j10, long j11, t1 t1Var) {
        super(0);
        this.f8815b = q0Var;
        this.f8816c = j10;
        this.f8817d = j11;
        this.f8818e = t1Var;
    }

    @Override // ic.a
    public final Object b() {
        q0 q0Var = this.f8815b;
        q0Var.x0().f8811a = false;
        q0Var.x0().f8812b = this.f8816c;
        q0Var.x0().f8813c = this.f8817d;
        ic.k kVarK = this.f8818e.f8854a.k();
        if (kVarK != null) {
            kVarK.a(q0Var.x0());
        }
        return ub.a0.f21526a;
    }
}
