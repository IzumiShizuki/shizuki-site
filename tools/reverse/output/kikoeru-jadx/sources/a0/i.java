package a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i extends jc.m implements ic.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.f f66b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f67c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(f1.f fVar, int i10) {
        super(3);
        this.f66b = fVar;
        this.f67c = i10;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        d dVar = (d) obj;
        x0.o oVar = (x0.o) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= oVar.f(dVar) ? 4 : 2;
        }
        if (oVar.N(iIntValue & 1, (iIntValue & 19) != 18)) {
            this.f66b.l(dVar, Integer.valueOf(this.f67c), oVar, Integer.valueOf(iIntValue & 14));
        } else {
            oVar.Q();
        }
        return ub.a0.f21526a;
    }
}
