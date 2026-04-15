package cg;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o0 f4052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4053d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(o0 o0Var, int i10, int i11) {
        super(2);
        this.f4051b = i11;
        this.f4052c = o0Var;
        this.f4053d = i10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        int i10 = this.f4051b;
        x0.o oVar = (x0.o) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                gh.g.a(this.f4052c, oVar, x0.v.D(this.f4053d | 1));
                break;
            default:
                gh.g.g(this.f4052c, oVar, x0.v.D(this.f4053d | 1));
                break;
        }
        return ub.a0.f21526a;
    }
}
