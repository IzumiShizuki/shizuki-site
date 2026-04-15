package bd;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j extends se.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yc.n0 f2594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f2595d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, re.o oVar, yc.n0 n0Var) {
        super(oVar);
        if (oVar == null) {
            l(0);
            throw null;
        }
        this.f2595d = kVar;
        this.f2594c = n0Var;
    }

    public static /* synthetic */ void l(int i10) {
        String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) ? 2 : 3];
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                break;
            case 6:
                objArr[0] = "type";
                break;
            case 7:
                objArr[0] = "supertypes";
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                objArr[0] = "classifier";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i10 == 1) {
            objArr[1] = "computeSupertypes";
        } else if (i10 == 2) {
            objArr[1] = "getParameters";
        } else if (i10 == 3) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i10 == 4) {
            objArr[1] = "getBuiltIns";
        } else if (i10 == 5) {
            objArr[1] = "getSupertypeLoopChecker";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
        } else {
            objArr[1] = "processSupertypesWithoutCycles";
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                break;
            case 6:
                objArr[2] = "reportSupertypeLoopError";
                break;
            case 7:
                objArr[2] = "processSupertypesWithoutCycles";
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                objArr[2] = "isSameClassifier";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5 && i10 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // se.f
    public final Collection b() {
        List listE1 = this.f2595d.E1();
        if (listE1 != null) {
            return listE1;
        }
        l(1);
        throw null;
    }

    @Override // se.f
    public final se.w c() {
        return ue.l.c(ue.k.CYCLIC_UPPER_BOUNDS, new String[0]);
    }

    @Override // se.f
    public final yc.n0 d() {
        yc.n0 n0Var = this.f2594c;
        if (n0Var != null) {
            return n0Var;
        }
        l(5);
        throw null;
    }

    @Override // se.f
    public final boolean f(yc.h hVar) {
        if (!(hVar instanceof yc.q0)) {
            return false;
        }
        return ee.c.f6523a.d(this.f2595d, (yc.q0) hVar, true, ee.a.f6519a);
    }

    @Override // se.k0
    public final vc.i g() {
        vc.i iVarE = ie.d.e(this.f2595d);
        if (iVarE != null) {
            return iVarE;
        }
        l(4);
        throw null;
    }

    @Override // se.k0
    public final yc.h h() {
        k kVar = this.f2595d;
        if (kVar != null) {
            return kVar;
        }
        l(3);
        throw null;
    }

    @Override // se.k0
    public final boolean j() {
        return true;
    }

    @Override // se.f
    public final List k(List list) {
        List listD1 = this.f2595d.D1(list);
        if (listD1 != null) {
            return listD1;
        }
        l(8);
        throw null;
    }

    @Override // se.k0
    public final List o() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        l(2);
        throw null;
    }

    public final String toString() {
        return this.f2595d.getName().f2751a;
    }
}
