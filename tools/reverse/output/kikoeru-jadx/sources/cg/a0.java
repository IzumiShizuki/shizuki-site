package cg;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f3996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3997d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(v vVar, int i10, int i11) {
        super(2);
        this.f3995b = i11;
        this.f3996c = vVar;
        this.f3997d = i10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        int i10 = this.f3995b;
        x0.o oVar = (x0.o) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                a2.c.j(this.f3996c, oVar, x0.v.D(this.f3997d | 1));
                break;
            default:
                a2.c.l(this.f3996c, oVar, x0.v.D(this.f3997d | 1));
                break;
        }
        return ub.a0.f21526a;
    }
}
