package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p0 implements ic.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f13431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.f f13432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ic.n f13433c;

    public p0(boolean z10, f1.f fVar, f1.f fVar2) {
        this.f13431a = z10;
        this.f13432b = fVar;
        this.f13433c = fVar2;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj).floatValue();
        x0.o oVar = (x0.o) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= oVar.c(fFloatValue) ? 4 : 2;
        }
        if (oVar.N(iIntValue & 1, (iIntValue & 19) != 18)) {
            if (this.f13431a) {
                fFloatValue = 1.0f;
            }
            r0.d(this.f13432b, this.f13433c, fFloatValue, oVar, 0);
        } else {
            oVar.Q();
        }
        return ub.a0.f21526a;
    }
}
