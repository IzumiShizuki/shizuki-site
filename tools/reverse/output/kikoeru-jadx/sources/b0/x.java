package b0;

import com.tencent.bugly.beta.tinker.TinkerReport;
import i7.p2;
import java.util.ArrayList;
import m0.a4;
import m0.a6;
import m0.k3;
import x0.n2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f1400g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f1401h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1402i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i10, Object obj, yb.c cVar) {
        super(2, cVar);
        this.f1398e = i10;
        this.f1402i = obj;
    }

    private final Object A(Object obj) {
        int i10 = this.f1399f;
        if (i10 == 0) {
            ub.a.f(obj);
            a4 a4Var = (a4) this.f1400g;
            ic.o oVar = (ic.o) this.f1401h;
            m0.u uVar = ((m0.x) this.f1402i).f13858n;
            this.f1399f = 1;
            Object objG = oVar.g(uVar, a4Var, this);
            zb.a aVar = zb.a.f26667a;
            if (objG == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ub.a.f(obj);
        }
        return ub.a0.f21526a;
    }

    private final Object B(Object obj) {
        int i10 = this.f1399f;
        if (i10 == 0) {
            ub.a.f(obj);
            ub.k kVar = (ub.k) this.f1400g;
            a4 a4Var = (a4) kVar.f21543a;
            Object obj2 = kVar.f21544b;
            ic.p pVar = (ic.p) this.f1401h;
            m0.u uVar = ((m0.x) this.f1402i).f13858n;
            this.f1399f = 1;
            Object objL = pVar.l(uVar, a4Var, obj2, this);
            zb.a aVar = zb.a.f26667a;
            if (objL == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ub.a.f(obj);
        }
        return ub.a0.f21526a;
    }

    private final Object C(Object obj) throws Throwable {
        int i10 = this.f1399f;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ub.a.f(obj);
            return ub.a0.f21526a;
        }
        ub.a.f(obj);
        hf.y yVar = (hf.y) this.f1400g;
        ArrayList arrayList = new ArrayList();
        lf.o0 o0Var = ((w.k) this.f1401h).f22978a;
        f7.v vVar = new f7.v(arrayList, yVar, (k3) this.f1402i, 7);
        this.f1399f = 1;
        o0Var.getClass();
        lf.o0.m(o0Var, vVar, this);
        return zb.a.f26667a;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [ac.i, ic.n] */
    private final Object D(Object obj) {
        a6 a6Var = (a6) this.f1400g;
        x0.e1 e1Var = a6Var.f12656b;
        int i10 = this.f1399f;
        if (i10 == 0) {
            ub.a.f(obj);
            e1Var.setValue(Boolean.TRUE);
            s.y0 y0Var = a6Var.f12658d;
            m0.v vVar = a6Var.f12657c;
            s.v0 v0Var = (s.v0) this.f1401h;
            ?? r72 = (ac.i) this.f1402i;
            this.f1399f = 1;
            y0Var.getClass();
            Object objK = hf.a0.k(new s.x0(v0Var, y0Var, r72, vVar, null), this);
            zb.a aVar = zb.a.f26667a;
            if (objK == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ub.a.f(obj);
        }
        e1Var.setValue(Boolean.FALSE);
        return ub.a0.f21526a;
    }

    private final Object E(Object obj) {
        x xVar;
        int i10 = this.f1399f;
        if (i10 == 0) {
            ub.a.f(obj);
            r.c cVar = (r.c) this.f1400g;
            Float f10 = new Float(1.0f);
            r.u1 u1Var = (r.u1) this.f1401h;
            this.f1399f = 1;
            xVar = this;
            Object objD = r.c.d(cVar, f10, u1Var, null, xVar, 12);
            zb.a aVar = zb.a.f26667a;
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ub.a.f(obj);
            xVar = this;
        }
        ((ic.a) xVar.f1402i).b();
        return ub.a0.f21526a;
    }

    private final Object F(Object obj) {
        jc.y yVar = (jc.y) this.f1400g;
        int i10 = this.f1399f;
        if (i10 == 0) {
            ub.a.f(obj);
            ((x0.w0) yVar.f10838a).setValue(Boolean.TRUE);
            m9.c cVar = (m9.c) this.f1401h;
            ic.a aVar = (ic.a) this.f1402i;
            this.f1399f = 1;
            Object objX = cVar.x(aVar, this);
            zb.a aVar2 = zb.a.f26667a;
            if (objX == aVar2) {
                return aVar2;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ub.a.f(obj);
            ((ub.n) obj).getClass();
        }
        ((x0.w0) yVar.f10838a).setValue(Boolean.FALSE);
        return ub.a0.f21526a;
    }

    private final Object G(Object obj) throws Throwable {
        int i10 = this.f1399f;
        ub.a0 a0Var = ub.a0.f21526a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ub.a.f(obj);
            return a0Var;
        }
        ub.a.f(obj);
        hf.y yVar = (hf.y) this.f1400g;
        lf.g gVar = (lf.g) this.f1401h;
        kf.t tVarH = ((mf.e) this.f1402i).h(yVar);
        this.f1399f = 1;
        Object objL = lf.p0.l(gVar, tVarH, true, this);
        zb.a aVar = zb.a.f26667a;
        if (objL != aVar) {
            objL = a0Var;
        }
        return objL == aVar ? aVar : a0Var;
    }

    private final Object H(Object obj) {
        int i10 = this.f1399f;
        if (i10 == 0) {
            ub.a.f(obj);
            hf.y yVar = (hf.y) this.f1400g;
            lf.k kVar = (lf.k) this.f1401h;
            lf.g gVar = (lf.g) this.f1402i;
            this.f1399f = 1;
            Object objG = kVar.g(yVar, gVar, this);
            zb.a aVar = zb.a.f26667a;
            if (objG == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ub.a.f(obj);
        }
        return ub.a0.f21526a;
    }

    private final Object I(Object obj) {
        jc.y yVar;
        int i10 = this.f1399f;
        if (i10 == 0) {
            ub.a.f(obj);
            yVar = (jc.y) this.f1401h;
            p7.j jVar = (p7.j) this.f1402i;
            this.f1400g = yVar;
            this.f1399f = 1;
            obj = jVar.a(this);
            zb.a aVar = zb.a.f26667a;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yVar = (jc.y) this.f1400g;
            ub.a.f(obj);
        }
        yVar.f10838a = obj;
        return ub.a0.f21526a;
    }

    private final Object x(Object obj) throws Throwable {
        int i10 = this.f1399f;
        if (i10 == 0) {
            ub.a.f(obj);
            hf.y yVar = (hf.y) this.f1400g;
            jc.y yVar2 = new jc.y();
            i7.n nVarB = x0.v.B((ic.a) this.f1401h);
            f7.v vVar = new f7.v(yVar2, yVar, (ic.n) this.f1402i, 6);
            this.f1399f = 1;
            Object objB = nVarB.b(vVar, this);
            zb.a aVar = zb.a.f26667a;
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ub.a.f(obj);
        }
        return ub.a0.f21526a;
    }

    private final Object y(Object obj) {
        int i10 = this.f1399f;
        if (i10 == 0) {
            ub.a.f(obj);
            ic.n nVar = (ic.n) this.f1400g;
            Object obj2 = this.f1401h;
            this.f1399f = 1;
            Object objQ = nVar.q(obj2, this);
            zb.a aVar = zb.a.f26667a;
            if (objQ == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ub.a.f(obj);
        }
        hf.a0.h((hf.y) this.f1402i, new m0.l());
        return ub.a0.f21526a;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [ac.i, ic.o] */
    /* JADX WARN: Type inference failed for: r1v24, types: [ac.i, ic.n] */
    /* JADX WARN: Type inference failed for: r1v3, types: [ac.i, ic.n] */
    /* JADX WARN: Type inference failed for: r1v9, types: [ac.i, ic.n] */
    /* JADX WARN: Type inference failed for: r2v13, types: [ac.i, ic.n] */
    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f1398e) {
            case 0:
                return new x((a0) this.f1400g, (r.x) this.f1401h, (t1.b) this.f1402i, cVar, 0);
            case 1:
                return new x((o1.i) this.f1400g, (x0.w0) this.f1401h, (x0.w0) this.f1402i, cVar, 1);
            case 2:
                return new x((ba.z0) this.f1400g, (String) this.f1401h, (String) this.f1402i, cVar, 2);
            case 3:
                return new x((ba.z0) this.f1400g, (ba.f1) this.f1401h, (x0.w0) this.f1402i, cVar, 3);
            case 4:
                return new x((e0.f) this.f1400g, (i2.g1) this.f1401h, (s1) this.f1402i, cVar, 4);
            case 5:
                return new x((r.w0) this.f1400g, (x0.w0) this.f1401h, (x0.a1) this.f1402i, cVar, 5);
            case 6:
                return new x((x0.w0) this.f1401h, (l0.l1) this.f1402i, cVar, 6);
            case 7:
                x xVar = new x(7, (ch.l) this.f1402i, cVar);
                xVar.f1401h = obj;
                return xVar;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                x xVar2 = new x((hf.f1) this.f1401h, (ic.n) this.f1402i, cVar);
                xVar2.f1400g = obj;
                return xVar2;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                x xVar3 = new x((ic.o) this.f1401h, (i7.e) this.f1402i, cVar);
                xVar3.f1400g = obj;
                return xVar3;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                x xVar4 = new x((kf.f) this.f1401h, (i7.d1) this.f1402i, cVar, 10);
                xVar4.f1400g = obj;
                return xVar4;
            case 11:
                return new x((i7.k0) this.f1400g, (j7.a) this.f1401h, (i7.l1) this.f1402i, cVar, 11);
            case 12:
                x xVar5 = new x((kf.f) this.f1401h, (ic.n) this.f1402i, cVar);
                xVar5.f1400g = obj;
                return xVar5;
            case 13:
                x xVar6 = new x((p2) this.f1401h, (ic.k) this.f1402i, cVar, 13);
                xVar6.f1400g = obj;
                return xVar6;
            case 14:
                return new x(14, (kf.f) this.f1402i, cVar);
            case 15:
                x xVar7 = new x((n2) this.f1401h, (r.c) this.f1402i, cVar, 15);
                xVar7.f1400g = obj;
                return xVar7;
            case 16:
                return new x(16, (l0.l1) this.f1402i, cVar);
            case 17:
                return new x((bg.a2) this.f1401h, (x0.w0) this.f1402i, cVar, 17);
            case 18:
                return new x((ic.n) this.f1400g, this.f1401h, (hf.y) this.f1402i, cVar, 18);
            case 19:
                x xVar8 = new x((ic.a) this.f1401h, (ic.n) this.f1402i, cVar, 19);
                xVar8.f1400g = obj;
                return xVar8;
            case 20:
                x xVar9 = new x((ic.o) this.f1401h, (m0.x) this.f1402i, cVar, 20);
                xVar9.f1400g = obj;
                return xVar9;
            case 21:
                x xVar10 = new x((ic.p) this.f1401h, (m0.x) this.f1402i, cVar, 21);
                xVar10.f1400g = obj;
                return xVar10;
            case 22:
                x xVar11 = new x((w.k) this.f1401h, (k3) this.f1402i, cVar, 22);
                xVar11.f1400g = obj;
                return xVar11;
            case 23:
                return new x((a6) this.f1400g, (s.v0) this.f1401h, (ic.n) this.f1402i, cVar);
            case 24:
                return new x((r.c) this.f1400g, (r.u1) this.f1401h, (ic.a) this.f1402i, cVar, 24);
            case 25:
                return new x((jc.y) this.f1400g, (m9.c) this.f1401h, (ic.a) this.f1402i, cVar, 25);
            case 26:
                x xVar12 = new x((lf.g) this.f1401h, (mf.e) this.f1402i, cVar, 26);
                xVar12.f1400g = obj;
                return xVar12;
            case 27:
                x xVar13 = new x((lf.k) this.f1401h, (lf.g) this.f1402i, cVar, 27);
                xVar13.f1400g = obj;
                return xVar13;
            case 28:
                return new x((jc.y) this.f1401h, (p7.j) this.f1402i, cVar, 28);
            default:
                x xVar14 = new x((hf.q) this.f1401h, (ic.n) this.f1402i, cVar);
                xVar14.f1400g = obj;
                return xVar14;
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f1398e) {
        }
        return ((x) o((hf.y) obj, (yb.c) obj2)).u(ub.a0.f21526a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:281:0x0513, code lost:
    
        if (j7.a.a(r0, r1, r2, r3, true, r5, r6, r8, r25) == r11) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0551, code lost:
    
        if (r10 != r11) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x065d, code lost:
    
        if (r10 != r11) goto L343;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b5 A[PHI: r7 r12
      0x01b5: PHI (r7v26 l0.j1) = (r7v23 l0.j1), (r7v43 l0.j1) binds: [B:87:0x016a, B:104:0x01a8] A[DONT_GENERATE, DONT_INLINE]
      0x01b5: PHI (r12v22 l0.j1) = (r12v19 l0.j1), (r12v25 l0.j1) binds: [B:87:0x016a, B:104:0x01a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x039d A[Catch: all -> 0x0370, TryCatch #1 {all -> 0x0370, blocks: (B:177:0x036a, B:188:0x0395, B:190:0x039d, B:191:0x03aa, B:198:0x03ba, B:185:0x0388, B:200:0x03bd, B:202:0x03c2, B:203:0x03c3, B:184:0x0383, B:192:0x03ab, B:194:0x03b1), top: B:576:0x035e, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0717 A[LOOP:2: B:379:0x0711->B:381:0x0717, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0817  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0981  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x098b  */
    /* JADX WARN: Removed duplicated region for block: B:610:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:614:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:617:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:618:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v98, types: [ac.i, ic.n] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v114 */
    /* JADX WARN: Type inference failed for: r2v115 */
    /* JADX WARN: Type inference failed for: r2v35, types: [ac.i, ic.n] */
    /* JADX WARN: Type inference failed for: r2v37, types: [ac.i, ic.o] */
    /* JADX WARN: Type inference failed for: r2v72, types: [kf.t] */
    /* JADX WARN: Type inference failed for: r2v74, types: [kf.f] */
    /* JADX WARN: Type inference failed for: r2v75, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v76, types: [kf.t] */
    /* JADX WARN: Type inference failed for: r3v75, types: [ac.i, ic.n] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Enum, yb.c] */
    /* JADX WARN: Type inference failed for: r6v11, types: [i7.c0] */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:186:0x0392 -> B:188:0x0395). Please report as a decompilation issue!!! */
    @Override // ac.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.x.u(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x(hf.q qVar, ic.n nVar, yb.c cVar) {
        super(2, cVar);
        this.f1398e = 29;
        this.f1401h = qVar;
        this.f1402i = (ac.i) nVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x(hf.f1 f1Var, ic.n nVar, yb.c cVar) {
        super(2, cVar);
        this.f1398e = 8;
        this.f1401h = f1Var;
        this.f1402i = (ac.i) nVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x(ic.o oVar, i7.e eVar, yb.c cVar) {
        super(2, cVar);
        this.f1398e = 9;
        this.f1401h = (ac.i) oVar;
        this.f1402i = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(Object obj, Object obj2, Object obj3, yb.c cVar, int i10) {
        super(2, cVar);
        this.f1398e = i10;
        this.f1400g = obj;
        this.f1401h = obj2;
        this.f1402i = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(Object obj, Object obj2, yb.c cVar, int i10) {
        super(2, cVar);
        this.f1398e = i10;
        this.f1401h = obj;
        this.f1402i = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x(kf.f fVar, ic.n nVar, yb.c cVar) {
        super(2, cVar);
        this.f1398e = 12;
        this.f1401h = fVar;
        this.f1402i = (ac.i) nVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x(a6 a6Var, s.v0 v0Var, ic.n nVar, yb.c cVar) {
        super(2, cVar);
        this.f1398e = 23;
        this.f1400g = a6Var;
        this.f1401h = v0Var;
        this.f1402i = (ac.i) nVar;
    }
}
