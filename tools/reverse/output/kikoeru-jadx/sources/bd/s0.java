package bd;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class s0 extends z {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(yc.k kVar, s0 s0Var, zc.h hVar, be.e eVar, int i10, yc.m0 m0Var) {
        super(i10, eVar, kVar, s0Var, m0Var, hVar);
        if (kVar == null) {
            U0(0);
            throw null;
        }
        if (hVar == null) {
            U0(1);
            throw null;
        }
        if (eVar == null) {
            U0(2);
            throw null;
        }
        if (i10 == 0) {
            U0(3);
            throw null;
        }
        if (m0Var != null) {
        } else {
            U0(4);
            throw null;
        }
    }

    public static s0 O1(c cVar, be.e eVar, int i10, yc.m0 m0Var) {
        if (cVar == null) {
            U0(5);
            throw null;
        }
        if (eVar == null) {
            U0(7);
            throw null;
        }
        if (i10 == 0) {
            U0(8);
            throw null;
        }
        if (m0Var != null) {
            return new s0(cVar, null, zc.g.f26696a, eVar, i10, m0Var);
        }
        U0(9);
        throw null;
    }

    public static /* synthetic */ void U0(int i10) {
        String str = (i10 == 13 || i10 == 18 || i10 == 23 || i10 == 24 || i10 == 29 || i10 == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 13 || i10 == 18 || i10 == 23 || i10 == 24 || i10 == 29 || i10 == 30) ? 2 : 3];
        switch (i10) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i10 == 13 || i10 == 18 || i10 == 23) {
            objArr[1] = "initialize";
        } else if (i10 == 24) {
            objArr[1] = "getOriginal";
        } else if (i10 == 29) {
            objArr[1] = "copy";
        } else if (i10 != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                objArr[2] = "create";
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 13 && i10 != 18 && i10 != 23 && i10 != 24 && i10 != 29 && i10 != 30) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // bd.z
    public z F1(int i10, be.e eVar, yc.k kVar, yc.t tVar, yc.m0 m0Var, zc.h hVar) {
        if (kVar == null) {
            U0(25);
            throw null;
        }
        if (i10 == 0) {
            U0(26);
            throw null;
        }
        if (hVar == null) {
            U0(27);
            throw null;
        }
        s0 s0Var = (s0) tVar;
        if (eVar == null) {
            eVar = getName();
        }
        return new s0(kVar, s0Var, hVar, eVar, i10, m0Var);
    }

    @Override // bd.z, yc.t
    public yc.s M0() {
        return J1(se.r0.f19980b);
    }

    @Override // bd.z, bd.q, bd.p, yc.k, yc.b
    /* JADX INFO: renamed from: P1, reason: merged with bridge method [inline-methods] */
    public final s0 a() {
        s0 s0Var = (s0) super.a();
        if (s0Var != null) {
            return s0Var;
        }
        U0(24);
        throw null;
    }

    @Override // bd.z
    /* JADX INFO: renamed from: Q1, reason: merged with bridge method [inline-methods] */
    public final s0 I1(a0 a0Var, a0 a0Var2, List list, List list2, List list3, se.w wVar, yc.x xVar, ld.o oVar) {
        if (list == null) {
            U0(14);
            throw null;
        }
        if (list2 == null) {
            U0(15);
            throw null;
        }
        if (list3 == null) {
            U0(16);
            throw null;
        }
        if (oVar != null) {
            return R1(a0Var, a0Var2, list, list2, list3, wVar, xVar, oVar, null);
        }
        U0(17);
        throw null;
    }

    public s0 R1(a0 a0Var, a0 a0Var2, List list, List list2, List list3, se.w wVar, yc.x xVar, ld.o oVar, Map map) {
        if (list == null) {
            U0(19);
            throw null;
        }
        if (list2 == null) {
            U0(20);
            throw null;
        }
        if (list3 == null) {
            U0(21);
            throw null;
        }
        if (oVar == null) {
            U0(22);
            throw null;
        }
        super.I1(a0Var, a0Var2, list, list2, list3, wVar, xVar, oVar);
        if (map != null && !map.isEmpty()) {
            this.C = new LinkedHashMap(map);
        }
        return this;
    }
}
