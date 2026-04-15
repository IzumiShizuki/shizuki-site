package nd;

import bd.l;
import bd.z;
import com.tencent.bugly.beta.tinker.TinkerReport;
import ee.m;
import java.util.ArrayList;
import se.w;
import vb.r;
import y2.o;
import yc.k;
import yc.m0;
import yc.t;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends l implements a {
    public Boolean E;
    public Boolean F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(yc.e eVar, b bVar, zc.h hVar, boolean z10, int i10, m0 m0Var) {
        super(eVar, bVar, hVar, z10, i10, m0Var);
        if (eVar == null) {
            U0(0);
            throw null;
        }
        if (hVar == null) {
            U0(1);
            throw null;
        }
        if (i10 == 0) {
            U0(2);
            throw null;
        }
        if (m0Var == null) {
            U0(3);
            throw null;
        }
        this.E = null;
        this.F = null;
    }

    public static /* synthetic */ void U0(int i10) {
        String str = (i10 == 11 || i10 == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 11 || i10 == 18) ? 2 : 3];
        switch (i10) {
            case 1:
            case 5:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i10 == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i10 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 11 && i10 != 18) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static b U1(yc.e eVar, zc.h hVar, boolean z10, dd.g gVar) {
        if (eVar != null) {
            return new b(eVar, null, hVar, z10, 1, gVar);
        }
        U0(4);
        throw null;
    }

    @Override // bd.l, bd.z
    public final /* bridge */ /* synthetic */ z F1(int i10, be.e eVar, k kVar, t tVar, m0 m0Var, zc.h hVar) {
        return V1(kVar, tVar, i10, hVar, m0Var);
    }

    @Override // bd.z
    public final void L1(boolean z10) {
        this.E = Boolean.valueOf(z10);
    }

    @Override // bd.z
    public final void M1(boolean z10) {
        this.F = Boolean.valueOf(z10);
    }

    @Override // nd.a
    public final a O(w wVar, ArrayList arrayList, w wVar2, ub.k kVar) {
        b bVarV1 = V1(y(), null, j(), getAnnotations(), m());
        bVarV1.I1(wVar == null ? null : m.k(bVarV1, wVar, zc.g.f26696a), this.f2720j, r.f22819a, getTypeParameters(), h.d(arrayList, o0(), bVarV1), wVar2, s(), f());
        if (kVar != null) {
            bVarV1.K1((yc.a) kVar.f21543a, kVar.f21544b);
        }
        return bVarV1;
    }

    @Override // bd.l
    /* JADX INFO: renamed from: O1 */
    public final /* bridge */ /* synthetic */ l F1(int i10, be.e eVar, k kVar, t tVar, m0 m0Var, zc.h hVar) {
        return V1(kVar, tVar, i10, hVar, m0Var);
    }

    public final b V1(k kVar, t tVar, int i10, zc.h hVar, m0 m0Var) {
        if (kVar == null) {
            U0(7);
            throw null;
        }
        if (i10 == 0) {
            U0(8);
            throw null;
        }
        if (hVar == null) {
            U0(9);
            throw null;
        }
        if (m0Var == null) {
            U0(10);
            throw null;
        }
        if (i10 != 1 && i10 != 4) {
            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + kVar + "\nkind: " + o.a(i10));
        }
        yc.e eVar = (yc.e) kVar;
        b bVar = (b) tVar;
        if (i10 == 0) {
            U0(13);
            throw null;
        }
        b bVar2 = new b(eVar, bVar, hVar, this.D, i10, m0Var);
        Boolean bool = this.E;
        bool.getClass();
        bVar2.E = bool;
        Boolean bool2 = this.F;
        bool2.getClass();
        bVar2.F = bool2;
        return bVar2;
    }

    @Override // bd.z, yc.b
    public final boolean Z() {
        return this.F.booleanValue();
    }
}
