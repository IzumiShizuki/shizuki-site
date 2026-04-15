package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w0 implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.n2 f13786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0.n2 f13789f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f13790g;

    public /* synthetic */ w0(Object obj, x0.n2 n2Var, Object obj2, Object obj3, x0.n2 n2Var2, Object obj4, int i10) {
        this.f13784a = i10;
        this.f13785b = obj;
        this.f13786c = n2Var;
        this.f13787d = obj2;
        this.f13788e = obj3;
        this.f13789f = n2Var2;
        this.f13790g = obj4;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        x0.n2 n2Var;
        int i10 = this.f13784a;
        ub.a0 a0Var = ub.a0.f21526a;
        Object obj2 = this.f13790g;
        x0.n2 n2Var2 = this.f13789f;
        Object obj3 = this.f13788e;
        Object obj4 = this.f13787d;
        x0.n2 n2Var3 = this.f13786c;
        Object obj5 = this.f13785b;
        switch (i10) {
            case 0:
                v0 v0Var = (v0) obj5;
                x0.n2 n2Var4 = (x0.n2) obj3;
                x0.n2 n2Var5 = (x0.n2) obj2;
                s1.d dVar = (s1.d) obj;
                float fFloor = (float) Math.floor(dVar.Q(z0.f13984d));
                long j10 = ((q1.q) n2Var3.getValue()).f17577a;
                long j11 = ((q1.q) ((x0.n2) obj4).getValue()).f17577a;
                float fQ = dVar.Q(z0.f13985e);
                float f10 = fFloor / 2.0f;
                s1.h hVar = new s1.h(fFloor, 0.0f, 0, 0, 30);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.e() >> 32));
                boolean zC = q1.q.c(j10, j11);
                s1.g gVar = s1.g.f19351a;
                if (zC) {
                    dVar.e0(j10, (226 & 2) != 0 ? 0L : 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(fQ)) << 32) | (((long) Float.floatToRawIntBits(fQ)) & 4294967295L), (226 & 16) != 0 ? s1.g.f19351a : gVar);
                    n2Var = n2Var5;
                } else {
                    n2Var = n2Var5;
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fFloor)) << 32) | (((long) Float.floatToRawIntBits(fFloor)) & 4294967295L);
                    float f11 = fIntBitsToFloat - (2 * fFloor);
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L);
                    float fMax = Math.max(0.0f, fQ - fFloor);
                    dVar.e0(j10, (226 & 2) != 0 ? 0L : jFloatToRawIntBits, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L), (226 & 16) != 0 ? s1.g.f19351a : gVar);
                    float f12 = fIntBitsToFloat - fFloor;
                    float f13 = fQ - f10;
                    dVar.e0(j11, (226 & 2) != 0 ? 0L : (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L), (((long) Float.floatToRawIntBits(f12)) << 32) | (((long) Float.floatToRawIntBits(f12)) & 4294967295L), (((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(f13)) & 4294967295L), (226 & 16) != 0 ? s1.g.f19351a : hVar);
                }
                long j12 = ((q1.q) n2Var4.getValue()).f17577a;
                float fFloatValue = ((Number) n2Var2.getValue()).floatValue();
                float fFloatValue2 = ((Number) n2Var.getValue()).floatValue();
                s1.h hVar2 = new s1.h(fFloor, 0.0f, 2, 0, 26);
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (dVar.e() >> 32));
                float fL = android.support.v4.media.session.b.L(0.4f, 0.5f, fFloatValue2);
                float fL2 = android.support.v4.media.session.b.L(0.7f, 0.5f, fFloatValue2);
                float fL3 = android.support.v4.media.session.b.L(0.5f, 0.5f, fFloatValue2);
                float fL4 = android.support.v4.media.session.b.L(0.3f, 0.5f, fFloatValue2);
                v0Var.f13719a.d();
                q1.h hVar3 = v0Var.f13719a;
                hVar3.f17511a.moveTo(0.2f * fIntBitsToFloat2, fL3 * fIntBitsToFloat2);
                hVar3.b(fL * fIntBitsToFloat2, fL2 * fIntBitsToFloat2);
                hVar3.b(0.8f * fIntBitsToFloat2, fIntBitsToFloat2 * fL4);
                q1.i iVar = v0Var.f13720b;
                iVar.f17519a.setPath(hVar3 != null ? hVar3.f17511a : null, false);
                q1.h hVar4 = v0Var.f13721c;
                hVar4.d();
                iVar.a(0.0f, iVar.f17519a.getLength() * fFloatValue, hVar4);
                q.t0.o(dVar, v0Var.f13721c, j12, 0.0f, hVar2, 52);
                break;
            default:
                x0.a1 a1Var = (x0.a1) obj5;
                x0.a1 a1Var2 = (x0.a1) n2Var3;
                jc.v vVar = (jc.v) obj4;
                jc.v vVar2 = (jc.v) obj3;
                oc.a aVar = (oc.a) obj2;
                a1Var.f(a1Var2.e() + a1Var.e() + ((Float) obj).floatValue());
                a1Var2.f(0.0f);
                float fJ = nh.b.j(a1Var.e(), vVar.f10835a, vVar2.f10835a);
                ic.k kVar = (ic.k) ((x0.w0) n2Var2).getValue();
                float f14 = vVar.f10835a;
                float f15 = vVar2.f10835a;
                float f16 = aVar.f16305a;
                float f17 = aVar.f16306b;
                float f18 = t6.f13667a;
                float f19 = f15 - f14;
                float f20 = f19 == 0.0f ? 0.0f : (fJ - f14) / f19;
                float f21 = f20 >= 0.0f ? f20 : 0.0f;
                if (f21 > 1.0f) {
                    f21 = 1.0f;
                }
                kVar.a(Float.valueOf(android.support.v4.media.session.b.L(f16, f17, f21)));
                break;
        }
        return a0Var;
    }
}
