package d0;

import x0.a1;
import x0.b1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends jc.m implements ic.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f5305c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(f0 f0Var, int i10) {
        super(0);
        this.f5304b = i10;
        this.f5305c = f0Var;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f5304b) {
            case 0:
                f0 f0Var = this.f5305c;
                return Integer.valueOf(f0Var.f5318k.a() ? f0Var.f5327t.e() : f0Var.j());
            default:
                f0 f0Var2 = this.f5305c;
                b1 b1Var = f0Var2.f5326s;
                return Integer.valueOf(f0Var2.i(!f0Var2.f5318k.a() ? f0Var2.j() : b1Var.e() != -1 ? b1Var.e() : Math.abs(((a1) f0Var2.f5311d.f5433d).e()) >= Math.abs(Math.min(f0Var2.f5324q.Q(j0.f5359a), ((float) f0Var2.m()) / 2.0f) / ((float) f0Var2.m())) ? ((Boolean) f0Var2.F.getValue()).booleanValue() ? f0Var2.f5312e + 1 : f0Var2.f5312e : f0Var2.j()));
        }
    }
}
