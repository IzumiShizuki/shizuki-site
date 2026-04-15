package l0;

import x0.n2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends jc.m implements ic.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n2 f11581c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(n2 n2Var, int i10) {
        super(0);
        this.f11580b = i10;
        this.f11581c = n2Var;
    }

    @Override // ic.a
    public final Object b() {
        int i10 = this.f11580b;
        n2 n2Var = this.f11581c;
        switch (i10) {
            case 0:
                break;
            default:
                r.m mVar = p0.f11591a;
                break;
        }
        return new p1.b(((p1.b) n2Var.getValue()).f16481a);
    }
}
