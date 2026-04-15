package bd;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class k extends q implements yc.q0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final se.x0 f2598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f2599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f2600g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final re.i f2601h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final re.i f2602i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final re.l f2603j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(re.o oVar, yc.k kVar, zc.h hVar, be.e eVar, se.x0 x0Var, boolean z10, int i10, yc.n0 n0Var) {
        super(kVar, hVar, eVar, yc.m0.p0);
        if (oVar == null) {
            U0(0);
            throw null;
        }
        if (kVar == null) {
            U0(1);
            throw null;
        }
        if (hVar == null) {
            U0(2);
            throw null;
        }
        if (eVar == null) {
            U0(3);
            throw null;
        }
        if (x0Var == null) {
            U0(4);
            throw null;
        }
        if (n0Var == null) {
            U0(6);
            throw null;
        }
        this.f2598e = x0Var;
        this.f2599f = z10;
        this.f2600g = i10;
        ba.u uVar = new ba.u(this, oVar, n0Var);
        re.l lVar = (re.l) oVar;
        this.f2601h = new re.i(lVar, uVar);
        this.f2602i = new re.i(lVar, new i(0, this, eVar));
        this.f2603j = lVar;
    }

    public static /* synthetic */ void U0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 7:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 7:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 11:
            case 13:
            case 14:
                i11 = 2;
                break;
            case 12:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i10) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                objArr[1] = "getUpperBounds";
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                objArr[1] = "getTypeConstructor";
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i10) {
            case 7:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 7:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // yc.h
    public final se.a0 E() {
        se.a0 a0Var = (se.a0) this.f2602i.b();
        if (a0Var != null) {
            return a0Var;
        }
        U0(10);
        throw null;
    }

    public abstract List E1();

    @Override // yc.h
    public final se.k0 Q() {
        se.k0 k0Var = (se.k0) this.f2601h.b();
        if (k0Var != null) {
            return k0Var;
        }
        U0(9);
        throw null;
    }

    @Override // yc.q0
    public final boolean Y() {
        return this.f2599f;
    }

    @Override // bd.q, bd.p, yc.k, yc.b
    public final yc.h a() {
        return this;
    }

    @Override // yc.k
    public final Object a0(yc.m mVar, Object obj) {
        return mVar.L(this, obj);
    }

    @Override // yc.q0
    public final se.x0 e0() {
        se.x0 x0Var = this.f2598e;
        if (x0Var != null) {
            return x0Var;
        }
        U0(7);
        throw null;
    }

    @Override // yc.q0
    public final int getIndex() {
        return this.f2600g;
    }

    @Override // yc.q0
    public final List getUpperBounds() {
        List listI = ((j) Q()).i();
        if (listI != null) {
            return listI;
        }
        U0(8);
        throw null;
    }

    @Override // yc.q0
    public final re.o t0() {
        re.l lVar = this.f2603j;
        if (lVar != null) {
            return lVar;
        }
        U0(14);
        throw null;
    }

    @Override // yc.q0
    public final boolean x0() {
        return false;
    }

    @Override // bd.q, bd.p, yc.k, yc.b
    public final yc.k a() {
        return this;
    }

    @Override // bd.q, bd.p, yc.k, yc.b
    public final yc.q0 a() {
        return this;
    }

    @Override // bd.q
    /* JADX INFO: renamed from: C1 */
    public final yc.l a() {
        return this;
    }

    public List D1(List list) {
        return list;
    }
}
