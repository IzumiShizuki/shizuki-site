package uh;

import q1.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f22062c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(y yVar, int i10) {
        super(1);
        this.f22061b = i10;
        this.f22062c = yVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f22061b) {
            case 0:
                i0 i0Var = (i0) obj;
                jc.l.e(i0Var, "$this$graphicsLayer");
                i0Var.m(p1.b.f(this.f22062c.e()));
                break;
            case 1:
                i0 i0Var2 = (i0) obj;
                jc.l.e(i0Var2, "$this$graphicsLayer");
                i0Var2.l(p1.b.e(this.f22062c.e()));
                break;
            case 2:
                i0 i0Var3 = (i0) obj;
                jc.l.e(i0Var3, "$this$graphicsLayer");
                i0Var3.m(p1.b.f(((p1.b) this.f22062c.f22088s.e()).f16481a));
                break;
            default:
                i0 i0Var4 = (i0) obj;
                jc.l.e(i0Var4, "$this$graphicsLayer");
                i0Var4.l(p1.b.e(((p1.b) this.f22062c.f22088s.e()).f16481a));
                break;
        }
        return ub.a0.f21526a;
    }
}
