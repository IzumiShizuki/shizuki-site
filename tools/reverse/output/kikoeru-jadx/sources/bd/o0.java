package bd;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public yc.k f2626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yc.x f2627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ld.o f2628c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2630e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a0 f2633h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final be.e f2634i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final se.w f2635j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p0 f2636k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public yc.k0 f2629d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public se.p0 f2631f = se.p0.f19977a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2632g = true;

    public o0(p0 p0Var) {
        this.f2636k = p0Var;
        this.f2626a = p0Var.y();
        this.f2627b = p0Var.s();
        this.f2628c = p0Var.f();
        this.f2630e = p0Var.j();
        this.f2633h = p0Var.f2652t;
        this.f2634i = p0Var.getName();
        this.f2635j = p0Var.b();
    }

    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 9 || i10 == 11 || i10 == 19 || i10 == 13 || i10 == 14 || i10 == 16 || i10 == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 9 || i10 == 11 || i10 == 19 || i10 == 13 || i10 == 14 || i10 == 16 || i10 == 17) ? 2 : 3];
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case 11:
            case 13:
            case 14:
            case 16:
            case 17:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                break;
            case 4:
                objArr[0] = "type";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                objArr[0] = "visibility";
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                objArr[0] = "kind";
                break;
            case 12:
                objArr[0] = "typeParameters";
                break;
            case 15:
                objArr[0] = "substitution";
                break;
            case 18:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "owner";
                break;
        }
        if (i10 == 1) {
            objArr[1] = "setOwner";
        } else if (i10 == 2) {
            objArr[1] = "setOriginal";
        } else if (i10 == 3) {
            objArr[1] = "setPreserveSourceElement";
        } else if (i10 == 5) {
            objArr[1] = "setReturnType";
        } else if (i10 == 7) {
            objArr[1] = "setModality";
        } else if (i10 == 9) {
            objArr[1] = "setVisibility";
        } else if (i10 == 11) {
            objArr[1] = "setKind";
        } else if (i10 == 19) {
            objArr[1] = "setName";
        } else if (i10 == 13) {
            objArr[1] = "setTypeParameters";
        } else if (i10 == 14) {
            objArr[1] = "setDispatchReceiverParameter";
        } else if (i10 == 16) {
            objArr[1] = "setSubstitution";
        } else if (i10 != 17) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
        } else {
            objArr[1] = "setCopyOverrides";
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case 11:
            case 13:
            case 14:
            case 16:
            case 17:
            case 19:
                break;
            case 4:
                objArr[2] = "setReturnType";
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                objArr[2] = "setVisibility";
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                objArr[2] = "setKind";
                break;
            case 12:
                objArr[2] = "setTypeParameters";
                break;
            case 15:
                objArr[2] = "setSubstitution";
                break;
            case 18:
                objArr[2] = "setName";
                break;
            default:
                objArr[2] = "setOwner";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 5 && i10 != 7 && i10 != 9 && i10 != 11 && i10 != 19 && i10 != 13 && i10 != 14 && i10 != 16 && i10 != 17) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [bd.n0, bd.r0, yc.t] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [bd.q0] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4, types: [bd.r0] */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v20, types: [bd.n0, bd.q0] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r4v13, types: [bd.w] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [se.w] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r6v12, types: [bd.w] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r9v0, types: [bd.p0, yc.b, yc.k, yc.k0] */
    public final p0 b() {
        a0 a0Var;
        a0 a0Var2;
        ?? q0Var;
        ?? r0Var;
        se.r0 r0Var2;
        ic.a aVar;
        a0 a0Var3;
        a0 a0Var4;
        Iterator it;
        se.w wVarI;
        yc.k kVar = this.f2626a;
        yc.x xVar = this.f2627b;
        ld.o oVar = this.f2628c;
        yc.k0 k0Var = this.f2629d;
        int i10 = this.f2630e;
        be.e eVar = this.f2634i;
        p0 p0Var = this.f2636k;
        ?? F1 = p0Var.F1(kVar, xVar, oVar, k0Var, i10, eVar);
        List typeParameters = p0Var.getTypeParameters();
        ArrayList arrayList = new ArrayList(((ArrayList) typeParameters).size());
        se.r0 r0VarB = se.c.B(typeParameters, this.f2631f, F1, arrayList);
        se.w wVar = this.f2635j;
        se.x0 x0Var = se.x0.OUT_VARIANCE;
        se.w wVarI2 = r0VarB.i(wVar, x0Var);
        a0 a0Var5 = null;
        if (wVarI2 != null) {
            se.x0 x0Var2 = se.x0.IN_VARIANCE;
            se.w wVarI3 = r0VarB.i(wVar, x0Var2);
            if (wVarI3 != null) {
                F1.J1(wVarI3);
            }
            a0 a0Var6 = this.f2633h;
            if (a0Var6 != null) {
                a0 a0VarH = a0Var6.h(r0VarB);
                if (a0VarH != null) {
                    a0Var = a0VarH;
                }
            } else {
                a0Var = null;
            }
            a0 a0Var7 = p0Var.f2653u;
            if (a0Var7 == null || (wVarI = r0VarB.i(a0Var7.b(), x0Var2)) == null) {
                a0Var2 = null;
            } else {
                a0Var7.D1();
                a0Var2 = new a0(F1, new me.b(F1, wVarI), a0Var7.getAnnotations());
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = p0Var.f2651s.iterator();
            while (it2.hasNext()) {
                a0 a0Var8 = (a0) it2.next();
                se.w wVarI4 = r0VarB.i(a0Var8.b(), x0Var2);
                if (wVarI4 == null) {
                    it = it2;
                    a0Var3 = a0Var5;
                    a0Var4 = a0Var3;
                } else {
                    a0Var4 = a0Var5;
                    it = it2;
                    be.e eVarB1 = ((me.a) a0Var8.D1()).B1();
                    a0Var8.D1();
                    a0Var3 = new a0(F1, new me.a((yc.b) F1, wVarI4, eVarB1), a0Var8.getAnnotations());
                }
                if (a0Var3 != null) {
                    arrayList2.add(a0Var3);
                }
                it2 = it;
                a0Var5 = a0Var4;
            }
            ?? r19 = a0Var5;
            F1.K1(wVarI2, arrayList, a0Var, a0Var2, arrayList2);
            q0 q0Var2 = p0Var.f2655w;
            yc.n0 n0Var = yc.m0.p0;
            if (q0Var2 == null) {
                q0Var = r19;
            } else {
                zc.h annotations = q0Var2.getAnnotations();
                yc.x xVar2 = this.f2627b;
                ld.o oVarF = p0Var.f2655w.f();
                if (this.f2630e == 2 && yc.o.e(yc.o.f(oVarF.f12236a.c()))) {
                    oVarF = yc.o.f26132h;
                }
                ld.o oVar2 = oVarF;
                q0 q0Var3 = p0Var.f2655w;
                boolean z10 = q0Var3.f2616e;
                boolean z11 = q0Var3.f2617f;
                boolean z12 = q0Var3.f2620i;
                int i11 = this.f2630e;
                yc.k0 k0Var2 = this.f2629d;
                q0Var = new q0(F1, annotations, xVar2, oVar2, z10, z11, z12, i11, k0Var2 == null ? r19 : k0Var2.d(), n0Var);
            }
            if (q0Var != 0) {
                q0 q0Var4 = p0Var.f2655w;
                se.w wVar2 = q0Var4.f2661m;
                q0Var.f2623l = p0.G1(r0VarB, q0Var4);
                q0Var.G1(wVar2 != null ? r0VarB.i(wVar2, x0Var) : r19);
            }
            r0 r0Var3 = p0Var.f2656x;
            if (r0Var3 == null) {
                r0Var = r19;
            } else {
                zc.h annotations2 = r0Var3.getAnnotations();
                yc.x xVar3 = this.f2627b;
                ld.o oVarF2 = p0Var.f2656x.f();
                if (this.f2630e == 2 && yc.o.e(yc.o.f(oVarF2.f12236a.c()))) {
                    oVarF2 = yc.o.f26132h;
                }
                ld.o oVar3 = oVarF2;
                r0 r0Var4 = p0Var.f2656x;
                boolean z13 = r0Var4.f2616e;
                boolean z14 = r0Var4.f2617f;
                boolean z15 = r0Var4.f2620i;
                int i12 = this.f2630e;
                yc.k0 k0Var3 = this.f2629d;
                r0Var = new r0(F1, annotations2, xVar3, oVar3, z13, z14, z15, i12, k0Var3 == null ? r19 : k0Var3.e(), n0Var);
            }
            if (r0Var != 0) {
                r0Var2 = r0VarB;
                List listH1 = z.H1(r0Var, p0Var.f2656x.o0(), r0Var2, false, false, null);
                if (listH1 == null) {
                    listH1 = Collections.singletonList(r0.F1(r0Var, ie.d.e(this.f2626a).n(), ((y0) p0Var.f2656x.o0().get(0)).getAnnotations()));
                }
                if (listH1.size() != 1) {
                    throw new IllegalStateException();
                }
                r0Var.f2623l = p0.G1(r0Var2, p0Var.f2656x);
                y0 y0Var = (y0) listH1.get(0);
                if (y0Var == null) {
                    r0.U0(6);
                    throw r19;
                }
                r0Var.f2664m = y0Var;
            } else {
                r0Var2 = r0VarB;
            }
            w wVar3 = p0Var.f2657y;
            ?? wVar4 = wVar3 == null ? r19 : new w(wVar3.getAnnotations(), F1);
            w wVar5 = p0Var.f2658z;
            F1.H1(q0Var, r0Var, wVar4, wVar5 == null ? r19 : new w(wVar5.getAnnotations(), F1));
            if (this.f2632g) {
                int i13 = bf.j.f2808c;
                bf.j jVarE = bf.m.e();
                Iterator it3 = p0Var.A().iterator();
                while (it3.hasNext()) {
                    jVarE.add(((yc.k0) it3.next()).h(r0Var2));
                }
                F1.f2643k = jVarE;
            }
            if (p0Var.S() && (aVar = p0Var.f2640h) != null) {
                F1.I1(p0Var.f2639g, aVar);
            }
            return F1;
        }
        return null;
    }
}
