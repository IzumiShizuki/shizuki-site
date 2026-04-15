package h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f7601c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(long j10, int i10) {
        super(1);
        this.f7600b = i10;
        this.f7601c = j10;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f7600b) {
            case 0:
                n1.c cVar = (n1.c) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (cVar.f15238a.e() >> 32)) / 2.0f;
                return cVar.b(new b0.g1(fIntBitsToFloat, l0.u0.q(cVar, fIntBitsToFloat), new q1.k(this.f7601c, 5), 1));
            default:
                ((q2.k) obj).l(l0.k0.f11522c, new l0.j0(h0.f7646a, this.f7601c, l0.i0.f11501b, true));
                return ub.a0.f21526a;
        }
    }
}
