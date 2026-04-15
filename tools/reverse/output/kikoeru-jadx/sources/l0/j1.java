package l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j1 extends jc.m implements ic.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1 f11516c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1(l1 l1Var, int i10) {
        super(0);
        this.f11515b = i10;
        this.f11516c = l1Var;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ic.a, jc.m] */
    @Override // ic.a
    public final Object b() {
        switch (this.f11515b) {
            case 0:
                ?? r0 = this.f11516c.f11531g;
                if (r0 != 0) {
                    r0.b();
                }
                break;
            case 1:
                l1 l1Var = this.f11516c;
                hf.y yVar = l1Var.f11533i;
                if (yVar != null) {
                    hf.a0.y(yVar, null, hf.z.f8619d, new k1(l1Var, null, 0), 1);
                }
                l1Var.l();
                break;
            case 2:
                l1 l1Var2 = this.f11516c;
                hf.y yVar2 = l1Var2.f11533i;
                if (yVar2 != null) {
                    hf.a0.y(yVar2, null, hf.z.f8619d, new k1(l1Var2, null, 1), 1);
                }
                l1Var2.l();
                break;
            case 3:
                l1 l1Var3 = this.f11516c;
                hf.y yVar3 = l1Var3.f11533i;
                if (yVar3 != null) {
                    hf.a0.y(yVar3, null, hf.z.f8619d, new k1(l1Var3, null, 2), 1);
                }
                l1Var3.l();
                break;
            default:
                this.f11516c.n();
                break;
        }
        return ub.a0.f21526a;
    }
}
