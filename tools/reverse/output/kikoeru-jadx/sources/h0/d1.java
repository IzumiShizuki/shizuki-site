package h0;

import j2.z2;
import u.c2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f7612f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f7613g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        super(1);
        this.f7608b = i10;
        this.f7610d = obj;
        this.f7611e = obj2;
        this.f7609c = obj3;
        this.f7612f = obj4;
        this.f7613g = obj5;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        int i10 = this.f7608b;
        ub.a0 a0Var = ub.a0.f21526a;
        Object obj2 = this.f7611e;
        Object obj3 = this.f7613g;
        Object obj4 = this.f7612f;
        Object obj5 = this.f7609c;
        Object obj6 = this.f7610d;
        switch (i10) {
            case 0:
                i2.l0 l0Var = (i2.l0) obj;
                l0Var.b();
                float fE = ((j0.h) obj6).f9606c.e();
                if (fE != 0.0f) {
                    long j10 = ((y2.y) obj5).f25435b;
                    int i11 = t2.k0.f20357c;
                    int iP = ((y2.r) obj2).p((int) (j10 >> 32));
                    r1 r1VarD = ((u0) obj4).d();
                    p1.c cVarC = r1VarD != null ? r1VarD.f7827a.c(iP) : new p1.c(0.0f, 0.0f, 0.0f, 0.0f);
                    float fFloor = (float) Math.floor(l0Var.Q(f1.f7628a));
                    float f10 = fFloor < 1.0f ? 1.0f : fFloor;
                    float f11 = f10 / 2;
                    float f12 = cVarC.f16483a + f11;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (l0Var.f8782a.f19346b.D() >> 32)) - f11;
                    if (f12 > fIntBitsToFloat) {
                        f12 = fIntBitsToFloat;
                    }
                    if (f12 >= f11) {
                        f11 = f12;
                    }
                    float fFloor2 = ((int) f10) % 2 == 1 ? ((float) Math.floor(f11)) + 0.5f : (float) Math.rint(f11);
                    q.t0.l(l0Var, (q1.n0) obj3, (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(cVarC.f16484b)) & 4294967295L), (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(cVarC.f16486d)) & 4294967295L), f10, fE, 432);
                }
                return a0Var;
            case 1:
                j0.q qVar = (j0.q) obj;
                j0.m mVar = ((j0.c) obj6).f9586a;
                qVar.f9642h = (y2.y) obj5;
                qVar.f9643i = (y2.j) obj2;
                qVar.f9637c = (cg.b) obj4;
                qVar.f9638d = (ic.k) obj3;
                qVar.f9639e = mVar != null ? mVar.f9613p : null;
                qVar.f9640f = mVar != null ? mVar.f9614q : null;
                qVar.f9641g = mVar != null ? (z2) i2.f.i(mVar, j2.l1.f9877s) : null;
                return a0Var;
            case 2:
                j3.u uVar = (j3.u) obj6;
                uVar.f10180n.addView(uVar, uVar.f10181o);
                uVar.k((ic.a) obj2, (j3.y) obj5, (String) obj4, (f3.m) obj3);
                return new b0.h0(11, uVar);
            case 3:
                float fFloatValue = ((Number) obj).floatValue();
                jc.v vVar = (jc.v) obj5;
                jc.y yVar = (jc.y) obj2;
                c0.s sVar = (c0.s) obj6;
                u.z0 z0VarH = c0.s.h((kf.f) sVar.f3160f);
                if (z0VarH != null) {
                    sVar.i(z0VarH);
                    u.z0 z0VarA = ((u.z0) yVar.f10838a).a(z0VarH);
                    yVar.f10838a = z0VarA;
                    c2 c2Var = (c2) obj4;
                    vVar.f10835a = c2Var.g(c2Var.e(z0VarA.f21148a));
                    ((jc.u) obj3).f10834a = !u.y0.a(r2 - fFloatValue);
                }
                return Boolean.valueOf(z0VarH != null);
            default:
                long j11 = ((p1.b) obj).f16481a;
                hf.a0.y((hf.y) obj6, null, null, new q.q((uh.j) obj5, (x0.w0) obj4, (x0.w0) obj3, (yb.c) null), 3);
                ((ic.k) obj2).a(new p1.b(j11));
                return a0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(y2.y yVar, j0.c cVar, y2.j jVar, cg.b bVar, ic.k kVar) {
        super(1);
        this.f7608b = 1;
        this.f7609c = yVar;
        this.f7610d = cVar;
        this.f7611e = jVar;
        this.f7612f = bVar;
        this.f7613g = kVar;
    }
}
