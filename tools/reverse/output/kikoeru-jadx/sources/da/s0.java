package da;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s0 implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ub.e f5797c;

    public /* synthetic */ s0(boolean z10, ic.a aVar) {
        this.f5795a = 0;
        this.f5796b = z10;
        this.f5797c = aVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f5795a) {
            case 0:
                ic.a aVar = (ic.a) this.f5797c;
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zF = oVar.f(aVar);
                    Object objK = oVar.K();
                    if (zF || objK == x0.k.f24334a) {
                        objK = new z(1, aVar);
                        oVar.h0(objK);
                    }
                    m0.z0.a(this.f5796b, (ic.k) objK, null, false, null, oVar, 0, 60);
                } else {
                    oVar.Q();
                }
                return ub.a0.f21526a;
            case 1:
                ((Integer) obj2).getClass();
                a2.c.d(this.f5796b, (ic.a) this.f5797c, (x0.o) obj, x0.v.D(1));
                break;
            default:
                ((Integer) obj2).getClass();
                android.support.v4.media.session.b.l(this.f5796b, (ic.n) this.f5797c, (x0.o) obj, x0.v.D(1));
                break;
        }
        return ub.a0.f21526a;
    }

    public /* synthetic */ s0(boolean z10, ub.e eVar, int i10, int i11) {
        this.f5795a = i11;
        this.f5796b = z10;
        this.f5797c = eVar;
    }
}
