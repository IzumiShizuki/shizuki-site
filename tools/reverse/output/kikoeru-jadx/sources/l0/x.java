package l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x extends jc.m implements ic.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0 f11657c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(s0 s0Var, int i10) {
        super(0);
        this.f11656b = i10;
        this.f11657c = s0Var;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f11656b) {
            case 0:
                p1.b bVar = (p1.b) this.f11657c.f11624n.getValue();
                break;
            case 1:
                p1.b bVar2 = (p1.b) this.f11657c.f11625o.getValue();
                break;
            case 2:
                s0 s0Var = this.f11657c;
                s0Var.f11629s = true;
                s0Var.p();
                s0Var.f11626p.setValue(null);
                s0Var.f11627q.setValue(null);
                break;
            default:
                this.f11657c.i();
                break;
        }
        return ub.a0.f21526a;
    }
}
