package r;

import com.tencent.bugly.beta.tinker.TinkerReport;
import j2.n2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f18359a = new l(Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f18360b = new m(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f18361c = new n(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f18362d = new o(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f18363e = new l(Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m f18364f = new m(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final n f18365g = new n(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final o f18366h = new o(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float[] f18367i = new float[91];

    public static c a(float f10) {
        return new c(Float.valueOf(f10), w1.f18620a, Float.valueOf(0.01f), 8);
    }

    public static k b(float f10, float f11, int i10) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        return new k(w1.f18620a, Float.valueOf(f10), new l(f11), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final Object c(float f10, float f11, float f12, j jVar, ic.n nVar, ac.i iVar) {
        v1 v1Var = w1.f18620a;
        Float f13 = new Float(f10);
        Float f14 = new Float(f11);
        l lVar = new l(new Float(f12).floatValue());
        Object objD = d(new k(v1Var, f13, lVar, 56), new h1(jVar, v1Var, f13, f14, lVar), Long.MIN_VALUE, new n2(1, nVar), iVar);
        ub.a0 a0Var = ub.a0.f21526a;
        zb.a aVar = zb.a.f26667a;
        if (objD != aVar) {
            objD = a0Var;
        }
        return objD == aVar ? objD : a0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:8))(0)|7|9|(1:(3:13|90|14)(2:18|19))(8:21|(11:84|23|24|88|25|26|92|27|(2:29|(1:31)(2:32|33))(1:34)|(1:37)|65)(7:47|86|48|49|93|50|(7:52|53|95|54|55|56|(1:63)(2:58|(2:61|62)(1:60)))(2:70|71))|40|74|(1:77)|78|(1:82)|83)|38|93|50|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0181, code lost:
    
        if (x0.v.s(r9.s()).k(r5, r9) == r12) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x018b, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00c4, code lost:
    
        if (x0.v.s(r9.s()).k(new q.a0(r5), r9) == r12) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011f A[Catch: CancellationException -> 0x018a, TRY_LEAVE, TryCatch #5 {CancellationException -> 0x018a, blocks: (B:50:0x010a, B:52:0x011f), top: B:93:0x010a }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(r.k r23, r.f r24, long r25, ic.k r27, ac.c r28) {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r.d.d(r.k, r.f, long, ic.k, ac.c):java.lang.Object");
    }

    public static /* synthetic */ Object e(float f10, float f11, j jVar, ic.n nVar, ac.i iVar, int i10) {
        if ((i10 & 8) != 0) {
            jVar = q(7, null);
        }
        return c(f10, f11, 0.0f, jVar, nVar, iVar);
    }

    public static final Object f(k kVar, t tVar, boolean z10, ic.k kVar2, ac.c cVar) {
        Object objD = d(kVar, new s(tVar, kVar.f18467a, kVar.f18468b.getValue(), kVar.f18469c), z10 ? kVar.f18470d : Long.MIN_VALUE, kVar2, cVar);
        return objD == zb.a.f26667a ? objD : ub.a0.f21526a;
    }

    public static final c0 g(e0 e0Var, float f10, b0 b0Var, x0.o oVar) {
        return j(e0Var, Float.valueOf(0.0f), Float.valueOf(f10), w1.f18620a, b0Var, oVar, 33208, 0);
    }

    public static final Object h(k kVar, Float f10, j jVar, boolean z10, ic.k kVar2, ac.c cVar) {
        Object objD = d(kVar, new h1(jVar, kVar.f18467a, kVar.f18468b.getValue(), f10, kVar.f18469c), z10 ? kVar.f18470d : Long.MIN_VALUE, kVar2, cVar);
        return objD == zb.a.f26667a ? objD : ub.a0.f21526a;
    }

    public static /* synthetic */ Object i(k kVar, Float f10, z0 z0Var, boolean z10, ic.k kVar2, ac.c cVar, int i10) {
        if ((i10 & 2) != 0) {
            z0Var = q(7, null);
        }
        z0 z0Var2 = z0Var;
        if ((i10 & 8) != 0) {
            kVar2 = g1.f18413c;
        }
        return h(kVar, f10, z0Var2, z10, kVar2, cVar);
    }

    public static final c0 j(e0 e0Var, Number number, Number number2, v1 v1Var, b0 b0Var, x0.o oVar, int i10, int i11) {
        Object objK = oVar.K();
        x0.r0 r0Var = x0.k.f24334a;
        if (objK == r0Var) {
            c0 c0Var = new c0(e0Var, number, number2, v1Var, b0Var);
            oVar.h0(c0Var);
            objK = c0Var;
        }
        c0 c0Var2 = (c0) objK;
        boolean z10 = (((57344 & i10) ^ 24576) > 16384 && oVar.h(b0Var)) || (i10 & 24576) == 16384;
        Object objK2 = oVar.K();
        if (z10 || objK2 == r0Var) {
            j3.b bVar = new j3.b(number, c0Var2, number2, b0Var, 1);
            oVar.h0(bVar);
            objK2 = bVar;
        }
        x0.v.h((ic.a) objK2, oVar);
        boolean zH = oVar.h(e0Var);
        Object objK3 = oVar.K();
        if (zH || objK3 == r0Var) {
            objK3 = new b0.o1(29, e0Var, c0Var2);
            oVar.h0(objK3);
        }
        x0.v.c(c0Var2, (ic.k) objK3, oVar);
        return c0Var2;
    }

    public static final p k(p pVar) {
        p pVarC = pVar.c();
        int iB = pVarC.b();
        for (int i10 = 0; i10 < iB; i10++) {
            pVarC.e(pVar.a(i10), i10);
        }
        return pVarC;
    }

    public static k l(k kVar, float f10, float f11, int i10) {
        if ((i10 & 1) != 0) {
            f10 = ((Number) kVar.f18468b.getValue()).floatValue();
        }
        if ((i10 & 2) != 0) {
            f11 = ((l) kVar.f18469c).f18474a;
        }
        return new k(kVar.f18467a, Float.valueOf(f10), new l(f11), kVar.f18470d, kVar.f18471e, kVar.f18472f);
    }

    public static final void m(i iVar, long j10, float f10, f fVar, k kVar, ic.k kVar2) {
        long jB = f10 == 0.0f ? fVar.b() : (long) ((j10 - iVar.f18449c) / f10);
        iVar.f18453g = j10;
        iVar.f18451e.setValue(fVar.f(jB));
        iVar.f18452f = fVar.d(jB);
        if (fVar.e(jB)) {
            iVar.f18454h = iVar.f18453g;
            iVar.f18455i.setValue(Boolean.FALSE);
        }
        s(iVar, kVar);
        kVar2.a(iVar);
    }

    public static final float n(yb.h hVar) {
        j1.r rVar = (j1.r) hVar.R(j1.c.f9677p);
        float fD = rVar != null ? rVar.D() : 1.0f;
        if (fD >= 0.0f) {
            return fD;
        }
        n0.b("negative scale factor");
        return fD;
    }

    public static b0 o(u uVar) {
        return new b0(uVar, 0);
    }

    public static final e0 p(x0.o oVar) {
        Object objK = oVar.K();
        if (objK == x0.k.f24334a) {
            objK = new e0();
            oVar.h0(objK);
        }
        e0 e0Var = (e0) objK;
        e0Var.a(0, oVar);
        return e0Var;
    }

    public static z0 q(int i10, Object obj) {
        float f10 = (i10 & 1) != 0 ? 1.0f : 0.75f;
        float f11 = (i10 & 2) != 0 ? 1500.0f : 400.0f;
        if ((i10 & 4) != 0) {
            obj = null;
        }
        return new z0(f10, f11, obj);
    }

    public static u1 r(int i10, int i11, v vVar, int i12) {
        if ((i12 & 1) != 0) {
            i10 = TinkerReport.KEY_LOADED_MISMATCH_DEX;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            vVar = w.f18598a;
        }
        return new u1(i10, i11, vVar);
    }

    public static final void s(i iVar, k kVar) {
        kVar.f18468b.setValue(iVar.f18451e.getValue());
        p pVar = kVar.f18469c;
        p pVar2 = iVar.f18452f;
        int iB = pVar.b();
        for (int i10 = 0; i10 < iB; i10++) {
            pVar.e(pVar2.a(i10), i10);
        }
        kVar.f18471e = iVar.f18454h;
        kVar.f18470d = iVar.f18453g;
        kVar.f18472f = ((Boolean) iVar.f18455i.getValue()).booleanValue();
    }
}
