package nd;

import bd.p0;
import bd.q0;
import bd.r0;
import bd.y0;
import com.tencent.bugly.beta.tinker.TinkerReport;
import ee.m;
import java.util.ArrayList;
import jc.l;
import ld.o;
import se.u0;
import se.w;
import td.t;
import ub.k;
import vb.r;
import vc.i;
import vc.s;
import yc.k0;
import yc.m0;
import yc.x;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class f extends p0 implements a {
    public final boolean A;
    public final k B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(yc.k kVar, zc.h hVar, x xVar, o oVar, boolean z10, be.e eVar, m0 m0Var, k0 k0Var, int i10, boolean z11, k kVar2) {
        super(kVar, k0Var, hVar, xVar, oVar, z10, eVar, i10, m0Var, false, false, false, false, false);
        if (kVar == null) {
            U0(0);
            throw null;
        }
        if (hVar == null) {
            U0(1);
            throw null;
        }
        if (xVar == null) {
            U0(2);
            throw null;
        }
        if (oVar == null) {
            U0(3);
            throw null;
        }
        if (eVar == null) {
            U0(4);
            throw null;
        }
        if (m0Var == null) {
            U0(5);
            throw null;
        }
        if (i10 == 0) {
            U0(6);
            throw null;
        }
        this.A = z11;
        this.B = kVar2;
    }

    public static f L1(yc.k kVar, od.c cVar, o oVar, boolean z10, be.e eVar, dd.g gVar, boolean z11) {
        if (kVar == null) {
            U0(7);
            throw null;
        }
        if (eVar != null) {
            return new f(kVar, cVar, x.f26155b, oVar, z10, eVar, gVar, null, 1, z11, null);
        }
        U0(11);
        throw null;
    }

    public static /* synthetic */ void U0(int i10) {
        String str = i10 != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 21 ? 3 : 2];
        switch (i10) {
            case 1:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                objArr[0] = "annotations";
                break;
            case 2:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                objArr[0] = "modality";
                break;
            case 3:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i10 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 7:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 == 21) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // bd.p0, yc.b
    public final Object E0(yc.a aVar) {
        k kVar = this.B;
        if (kVar == null || !((yc.a) kVar.f21543a).equals(aVar)) {
            return null;
        }
        return kVar.f21544b;
    }

    @Override // bd.p0
    public final p0 F1(yc.k kVar, x xVar, o oVar, k0 k0Var, int i10, be.e eVar) {
        if (kVar == null) {
            U0(13);
            throw null;
        }
        if (xVar == null) {
            U0(14);
            throw null;
        }
        if (oVar == null) {
            U0(15);
            throw null;
        }
        if (i10 == 0) {
            U0(16);
            throw null;
        }
        if (eVar == null) {
            U0(17);
            throw null;
        }
        return new f(kVar, getAnnotations(), xVar, oVar, this.f2638f, eVar, m0.p0, k0Var, i10, this.A, this.B);
    }

    @Override // nd.a
    public final a O(w wVar, ArrayList arrayList, w wVar2, k kVar) {
        w wVar3;
        q0 q0Var;
        r0 r0Var;
        k0 k0VarA = a() == this ? null : a();
        f fVar = new f(y(), getAnnotations(), s(), f(), this.f2638f, getName(), m(), k0VarA, j(), this.A, kVar);
        q0 q0Var2 = this.f2655w;
        if (q0Var2 != null) {
            q0 q0Var3 = new q0(fVar, q0Var2.getAnnotations(), q0Var2.s(), q0Var2.f(), q0Var2.f2616e, q0Var2.f2617f, q0Var2.f2620i, j(), k0VarA == null ? null : k0VarA.d(), q0Var2.m());
            q0Var3.f2623l = q0Var2.f2623l;
            wVar3 = wVar2;
            q0Var3.f2661m = wVar3;
            q0Var = q0Var3;
        } else {
            wVar3 = wVar2;
            q0Var = null;
        }
        r0 r0Var2 = this.f2656x;
        if (r0Var2 != null) {
            r0 r0Var3 = r0Var2;
            r0Var = new r0(fVar, r0Var2.getAnnotations(), r0Var3.s(), r0Var3.f(), r0Var3.f2616e, r0Var3.f2617f, r0Var3.f2620i, j(), k0VarA == null ? null : k0VarA.e(), r0Var2.m());
            r0Var.f2623l = r0Var.f2623l;
            y0 y0Var = (y0) r0Var2.o0().get(0);
            if (y0Var == null) {
                r0.U0(6);
                throw null;
            }
            r0Var.f2664m = y0Var;
        } else {
            r0Var = null;
        }
        fVar.H1(q0Var, r0Var, this.f2657y, this.f2658z);
        ic.a aVar = this.f2640h;
        if (aVar != null) {
            fVar.I1(this.f2639g, aVar);
        }
        fVar.H0(A());
        fVar.K1(wVar3, getTypeParameters(), this.f2652t, wVar != null ? m.k(this, wVar, zc.g.f26696a) : null, r.f22819a);
        return fVar;
    }

    @Override // bd.p0, yc.t0
    public final boolean S() {
        w wVarB = b();
        if (!this.A) {
            return false;
        }
        l.e(wVarB, "type");
        if (((!i.F(wVarB) && !s.a(wVarB)) || u0.e(wVarB)) && !i.G(wVarB)) {
            return false;
        }
        zc.i iVar = t.f20720a;
        be.c cVar = ld.w.f12272p;
        l.d(cVar, "ENHANCED_NULLABILITY_ANNOTATION");
        return !te.g.x(wVarB, cVar) || i.G(wVarB);
    }

    @Override // bd.z0, yc.b
    public final boolean Z() {
        return false;
    }

    @Override // bd.p0
    public final void J1(w wVar) {
    }
}
