package bd;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class z0 extends q implements yc.t0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public se.w f2737e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(yc.k kVar, zc.h hVar, be.e eVar, se.w wVar, yc.m0 m0Var) {
        super(kVar, hVar, eVar, m0Var);
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
        if (m0Var == null) {
            U0(3);
            throw null;
        }
        this.f2737e = wVar;
    }

    public static /* synthetic */ void U0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                objArr[1] = "getTypeParameters";
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                objArr[1] = "getContextReceiverParameters";
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // yc.b
    public boolean Z() {
        return false;
    }

    @Override // androidx.lifecycle.q, me.d
    public final se.w b() {
        se.w wVar = this.f2737e;
        if (wVar != null) {
            return wVar;
        }
        U0(4);
        throw null;
    }

    public List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        U0(8);
        throw null;
    }

    public se.w n() {
        se.w wVarB = b();
        if (wVarB != null) {
            return wVarB;
        }
        U0(10);
        throw null;
    }

    @Override // yc.b
    public final List o0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        U0(6);
        throw null;
    }

    public a0 s0() {
        return null;
    }

    public a0 v0() {
        return null;
    }
}
