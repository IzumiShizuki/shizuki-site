package s;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f19285c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(w wVar, int i10) {
        super(1);
        this.f19284b = i10;
        this.f19285c = wVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f19284b) {
            case 0:
                long j10 = ((p1.b) obj).f16481a;
                ic.a aVar = this.f19285c.I;
                if (aVar != null) {
                    aVar.b();
                }
                break;
            case 1:
                long j11 = ((p1.b) obj).f16481a;
                w wVar = this.f19285c;
                ic.a aVar2 = wVar.H;
                if (aVar2 != null) {
                    aVar2.b();
                }
                if (wVar.J) {
                    ((y1.a) i2.f.i(wVar, j2.l1.f9870l)).a(0);
                }
                break;
            default:
                long j12 = ((p1.b) obj).f16481a;
                w wVar2 = this.f19285c;
                if (wVar2.f19123u) {
                    wVar2.f19124v.b();
                }
                break;
        }
        return ub.a0.f21526a;
    }
}
