package bd;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends k {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f2680k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2681l;

    /* JADX WARN: Illegal instructions before constructor call */
    public w0(yc.k kVar, zc.h hVar, boolean z10, se.x0 x0Var, be.e eVar, int i10, re.o oVar) {
        yc.n0 n0Var = yc.n0.f26123c;
        if (kVar == null) {
            U0(19);
            throw null;
        }
        if (hVar == null) {
            U0(20);
            throw null;
        }
        if (x0Var == null) {
            U0(21);
            throw null;
        }
        if (eVar == null) {
            U0(22);
            throw null;
        }
        if (oVar == null) {
            U0(25);
            throw null;
        }
        super(oVar, kVar, hVar, eVar, x0Var, z10, i10, n0Var);
        this.f2680k = new ArrayList(1);
        this.f2681l = false;
    }

    public static w0 F1(yc.k kVar, zc.h hVar, boolean z10, se.x0 x0Var, be.e eVar, int i10, re.o oVar) {
        if (kVar == null) {
            U0(6);
            throw null;
        }
        if (hVar == null) {
            U0(7);
            throw null;
        }
        if (x0Var == null) {
            U0(8);
            throw null;
        }
        if (eVar == null) {
            U0(9);
            throw null;
        }
        if (oVar != null) {
            return new w0(kVar, hVar, z10, x0Var, eVar, i10, oVar);
        }
        U0(11);
        throw null;
    }

    public static w0 G1(c cVar, se.x0 x0Var, be.e eVar, int i10, re.o oVar) {
        if (oVar == null) {
            U0(4);
            throw null;
        }
        w0 w0VarF1 = F1(cVar, zc.g.f26696a, false, x0Var, eVar, i10, oVar);
        se.a0 a0VarO = ie.d.e(cVar).o();
        if (w0VarF1.f2681l) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + w0VarF1.H1());
        }
        if (!se.c.l(a0VarO)) {
            w0VarF1.f2680k.add(a0VarO);
        }
        if (!w0VarF1.f2681l) {
            w0VarF1.f2681l = true;
            return w0VarF1;
        }
        throw new IllegalStateException("Type parameter descriptor is already initialized: " + w0VarF1.H1());
    }

    public static /* synthetic */ void U0(int i10) {
        String str = (i10 == 5 || i10 == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 5 || i10 == 28) ? 2 : 3];
        switch (i10) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i10 == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i10 != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i10) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 5 && i10 != 28) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // bd.k
    public final List E1() {
        if (!this.f2681l) {
            throw new IllegalStateException("Type parameter descriptor is not initialized: " + H1());
        }
        ArrayList arrayList = this.f2680k;
        if (arrayList != null) {
            return arrayList;
        }
        U0(28);
        throw null;
    }

    public final String H1() {
        return getName() + " declared in " + ee.e.g(y());
    }
}
