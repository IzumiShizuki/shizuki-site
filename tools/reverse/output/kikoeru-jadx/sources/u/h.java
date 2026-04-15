package u;

import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f20921e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public jc.v f20922f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f20923g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f20924h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f20925i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f20926j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k1 f20927k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(float f10, i iVar, y1 y1Var, yb.c cVar) {
        super(2, cVar);
        this.f20924h = f10;
        this.f20926j = iVar;
        this.f20927k = y1Var;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f20921e) {
            case 0:
                return new h(this.f20924h, (i) this.f20926j, (y1) this.f20927k, cVar);
            default:
                return new h((v.f) this.f20925i, this.f20924h, (ic.k) this.f20926j, this.f20927k, cVar);
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        hf.y yVar = (hf.y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f20921e) {
        }
        return ((h) o(yVar, cVar)).u(ub.a0.f21526a);
    }

    @Override // ac.a
    public final Object u(Object obj) {
        jc.v vVar;
        r.k kVar;
        zb.a aVar;
        float f10;
        float fSignum;
        jc.v vVar2;
        Object objB;
        float f11;
        float f12;
        h hVar = this;
        int i10 = hVar.f20921e;
        zb.a aVar2 = zb.a.f26667a;
        float f13 = hVar.f20924h;
        Object obj2 = hVar.f20926j;
        switch (i10) {
            case 0:
                int i11 = hVar.f20923g;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kVar = (r.k) hVar.f20925i;
                    vVar = hVar.f20922f;
                    try {
                        ub.a.f(obj);
                    } catch (CancellationException unused) {
                        vVar.f10835a = ((Number) kVar.a()).floatValue();
                    }
                    f13 = vVar.f10835a;
                    break;
                } else {
                    ub.a.f(obj);
                    if (Math.abs(f13) > 1.0f) {
                        vVar = new jc.v();
                        vVar.f10835a = f13;
                        jc.v vVar3 = new jc.v();
                        r.k kVarB = r.d.b(0.0f, f13, 28);
                        try {
                            i iVar = (i) obj2;
                            r.t tVar = iVar.f20940a;
                            cg.b bVar = new cg.b(vVar3, (y1) hVar.f20927k, vVar, iVar);
                            hVar.f20922f = vVar;
                            hVar.f20925i = kVarB;
                            hVar.f20923g = 1;
                            if (r.d.f(kVarB, tVar, false, bVar, hVar) == aVar2) {
                                return aVar2;
                            }
                        } catch (CancellationException unused2) {
                            kVar = kVarB;
                            vVar.f10835a = ((Number) kVar.a()).floatValue();
                        }
                        f13 = vVar.f10835a;
                    }
                }
                return new Float(f13);
            default:
                ic.k kVar2 = (ic.k) obj2;
                v.f fVar = (v.f) hVar.f20925i;
                m0.w wVar = fVar.f22107a;
                int i12 = hVar.f20923g;
                if (i12 == 0) {
                    ub.a.f(obj);
                    r.t tVar2 = fVar.f22108b;
                    r.v1 v1Var = r.w1.f18620a;
                    float f14 = ((r.l) new b0.w1(16, tVar2.f18575a).P(new r.l(0.0f), new r.l(f13))).f18474a;
                    d0.d dVar = (d0.d) wVar.f13782b;
                    x0.e1 e1Var = dVar.f5323p;
                    int iM = ((d0.w) e1Var.getValue()).f5413c + dVar.m();
                    if (iM == 0) {
                        aVar = aVar2;
                        fSignum = 0.0f;
                        f10 = 0.0f;
                    } else {
                        int i13 = f13 < 0.0f ? dVar.f5312e + 1 : dVar.f5312e;
                        int iK = nh.b.k(((int) (f14 / iM)) + i13, 0, dVar.l());
                        dVar.m();
                        int i14 = ((d0.w) e1Var.getValue()).f5413c;
                        long j10 = i13;
                        aVar = aVar2;
                        f10 = 0.0f;
                        long j11 = 1;
                        long j12 = j10 - j11;
                        int i15 = (int) (j12 < 0 ? 0L : j12);
                        long j13 = j10 + j11;
                        if (j13 > 2147483647L) {
                            j13 = 2147483647L;
                        }
                        int iAbs = Math.abs((nh.b.k(nh.b.k(iK, i15, (int) j13), 0, dVar.l()) - i13) * iM) - iM;
                        if (iAbs < 0) {
                            iAbs = 0;
                        }
                        fSignum = iAbs == 0 ? iAbs : Math.signum(f13) * iAbs;
                    }
                    if (Float.isNaN(fSignum)) {
                        x.a.c("calculateApproachOffset returned NaN. Please use a valid value.");
                    }
                    vVar2 = new jc.v();
                    float fSignum2 = Math.signum(f13) * Math.abs(fSignum);
                    vVar2.f10835a = fSignum2;
                    kVar2.a(new Float(fSignum2));
                    float f15 = vVar2.f10835a;
                    v.c cVar = new v.c(vVar2, kVar2, 1);
                    hVar = this;
                    hVar.f20922f = vVar2;
                    hVar.f20923g = 1;
                    objB = v.f.b(fVar, hVar.f20927k, f15, hVar.f20924h, cVar, hVar);
                    aVar2 = aVar;
                    if (objB != aVar2) {
                    }
                    return aVar2;
                }
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                    return obj;
                }
                jc.v vVar4 = hVar.f20922f;
                ub.a.f(obj);
                vVar2 = vVar4;
                f10 = 0.0f;
                objB = obj;
                r.k kVar3 = (r.k) objB;
                float fFloatValue = ((Number) kVar3.a()).floatValue();
                d0.d dVar2 = (d0.d) wVar.f13782b;
                v.k kVar4 = dVar2.k().f5423m;
                List list = dVar2.k().f5411a;
                int size = list.size();
                float f16 = Float.NEGATIVE_INFINITY;
                float f17 = Float.POSITIVE_INFINITY;
                for (int i16 = 0; i16 < size; i16++) {
                    d0.j jVar = (d0.j) list.get(i16);
                    android.support.v4.media.session.b.H(dVar2.k());
                    int i17 = dVar2.k().f5416f;
                    int i18 = dVar2.k().f5414d;
                    int i19 = dVar2.k().f5412b;
                    int i20 = jVar.f5357l;
                    dVar2.l();
                    kVar4.getClass();
                    float f18 = i20 - 0;
                    if (f18 <= f10 && f18 > f16) {
                        f16 = f18;
                    }
                    if (f18 >= f10 && f18 < f17) {
                        f17 = f18;
                    }
                }
                if (f16 == Float.NEGATIVE_INFINITY) {
                    f16 = f17;
                }
                if (f17 == Float.POSITIVE_INFINITY) {
                    f17 = f16;
                }
                if (!dVar2.d()) {
                    if (ud.b.u(dVar2, fFloatValue)) {
                        f16 = 0.0f;
                    }
                    f17 = 0.0f;
                }
                if (dVar2.c()) {
                    f11 = f16;
                    f12 = f17;
                } else if (ud.b.u(dVar2, fFloatValue)) {
                    f12 = f17;
                    f11 = 0.0f;
                } else {
                    f11 = 0.0f;
                    f12 = 0.0f;
                }
                float fFloatValue2 = ((Number) ((cg.d0) wVar.f13783c).g(Float.valueOf(fFloatValue), Float.valueOf(f11), Float.valueOf(f12))).floatValue();
                if (fFloatValue2 != f11 && fFloatValue2 != f12 && fFloatValue2 != f10) {
                    x.a.c("Final Snapping Offset Should Be one of " + f11 + ", " + f12 + " or 0.0");
                }
                if (fFloatValue2 == Float.POSITIVE_INFINITY || fFloatValue2 == Float.NEGATIVE_INFINITY) {
                    fFloatValue2 = 0.0f;
                }
                if (Float.isNaN(fFloatValue2)) {
                    x.a.c("calculateSnapOffset returned NaN. Please use a valid value.");
                }
                vVar2.f10835a = fFloatValue2;
                r.k kVarL = r.d.l(kVar3, 0.0f, 0.0f, 30);
                r.z0 z0Var = fVar.f22109c;
                v.c cVar2 = new v.c(vVar2, kVar2, 0);
                hVar.f20922f = null;
                hVar.f20923g = 2;
                Object objC = v.j.c(hVar.f20927k, fFloatValue2, fFloatValue2, kVarL, z0Var, cVar2, this);
                if (objC != aVar2) {
                    return objC;
                }
                return aVar2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(v.f fVar, float f10, ic.k kVar, k1 k1Var, yb.c cVar) {
        super(2, cVar);
        this.f20925i = fVar;
        this.f20924h = f10;
        this.f20926j = kVar;
        this.f20927k = k1Var;
    }
}
