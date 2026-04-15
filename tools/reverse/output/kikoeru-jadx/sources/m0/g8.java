package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g8 implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f13035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13036c;

    public /* synthetic */ g8(float f10, Object obj, int i10) {
        this.f13034a = i10;
        this.f13035b = f10;
        this.f13036c = obj;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f13034a) {
            case 0:
                x0.w0 w0Var = (x0.w0) this.f13036c;
                p1.e eVar = (p1.e) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (eVar.f16495a >> 32));
                float f10 = this.f13035b;
                float f11 = fIntBitsToFloat * f10;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (eVar.f16495a & 4294967295L)) * f10;
                if (Float.intBitsToFloat((int) (((p1.e) w0Var.getValue()).f16495a >> 32)) != f11 || Float.intBitsToFloat((int) (((p1.e) w0Var.getValue()).f16495a & 4294967295L)) != fIntBitsToFloat2) {
                    w0Var.setValue(new p1.e((((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L)));
                }
                break;
            default:
                s.o oVar = (s.o) this.f13036c;
                i2.l0 l0Var = (i2.l0) obj;
                l0Var.b();
                s1.b bVar = l0Var.f8782a;
                float f12 = this.f13035b;
                if (!f3.f.a(f12, 0.0f)) {
                    float fA = bVar.a();
                    c7.e1 e1Var = bVar.f19346b;
                    float f13 = fA * f12;
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (e1Var.D() & 4294967295L)) - (f13 / 2);
                    q.t0.l(l0Var, oVar.f19236b, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (e1Var.D() >> 32)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat3))), f13, 0.0f, 496);
                }
                break;
        }
        return ub.a0.f21526a;
    }
}
