package bd;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class n0 extends q implements yc.j0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f2617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final yc.x f2618g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final yc.k0 f2619h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f2620i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f2621j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ld.o f2622k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public yc.t f2623l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(yc.x xVar, ld.o oVar, yc.k0 k0Var, zc.h hVar, be.e eVar, boolean z10, boolean z11, boolean z12, int i10, yc.m0 m0Var) {
        super(k0Var.y(), hVar, eVar, m0Var);
        if (xVar == null) {
            U0(0);
            throw null;
        }
        if (oVar == null) {
            U0(1);
            throw null;
        }
        if (hVar == null) {
            U0(3);
            throw null;
        }
        if (m0Var == null) {
            U0(5);
            throw null;
        }
        this.f2623l = null;
        this.f2618g = xVar;
        this.f2622k = oVar;
        this.f2619h = k0Var;
        this.f2616e = z10;
        this.f2617f = z11;
        this.f2620i = z12;
        this.f2621j = i10;
    }

    public static /* synthetic */ void U0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 6:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 6:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i11 = 2;
                break;
            case 7:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i10) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                objArr[1] = "substitute";
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                objArr[1] = "getTypeParameters";
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i10) {
            case 6:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 6:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(str2);
            case 7:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public final yc.k0 D1() {
        yc.k0 k0Var = this.f2619h;
        if (k0Var != null) {
            return k0Var;
        }
        U0(13);
        throw null;
    }

    @Override // yc.b
    public final Object E0(yc.a aVar) {
        return null;
    }

    public final ArrayList E1(boolean z10) {
        ArrayList arrayList = new ArrayList(0);
        for (yc.k0 k0Var : D1().A()) {
            zc.a aVarD = z10 ? k0Var.d() : k0Var.e();
            if (aVarD != null) {
                arrayList.add(aVarD);
            }
        }
        return arrayList;
    }

    @Override // yc.c
    public final yc.c F0(yc.e eVar, yc.x xVar, ld.o oVar) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // yc.t
    public final boolean G0() {
        return false;
    }

    @Override // yc.c
    public final void H0(Collection collection) {
        if (collection != null) {
            return;
        }
        U0(16);
        throw null;
    }

    @Override // yc.t
    public final boolean I() {
        return false;
    }

    @Override // yc.t
    public final boolean L0() {
        return false;
    }

    @Override // yc.w
    public final boolean O0() {
        return false;
    }

    @Override // yc.w
    public final boolean P() {
        return this.f2617f;
    }

    @Override // yc.t
    public final boolean R0() {
        return false;
    }

    @Override // yc.b
    public final boolean Z() {
        return false;
    }

    @Override // yc.w
    public final boolean c0() {
        return false;
    }

    @Override // yc.n
    public final ld.o f() {
        ld.o oVar = this.f2622k;
        if (oVar != null) {
            return oVar;
        }
        U0(11);
        throw null;
    }

    @Override // yc.b
    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        U0(9);
        throw null;
    }

    @Override // yc.t, yc.o0
    public final yc.t h(se.r0 r0Var) {
        if (r0Var != null) {
            return this;
        }
        U0(7);
        throw null;
    }

    @Override // yc.t
    public final boolean h0() {
        return false;
    }

    @Override // yc.t
    public final boolean i0() {
        return false;
    }

    @Override // yc.c
    public final int j() {
        int i10 = this.f2621j;
        if (i10 != 0) {
            return i10;
        }
        U0(6);
        throw null;
    }

    @Override // yc.t
    public final boolean l() {
        return this.f2620i;
    }

    @Override // yc.t
    public final yc.t r0() {
        return this.f2623l;
    }

    @Override // yc.w
    public final yc.x s() {
        yc.x xVar = this.f2618g;
        if (xVar != null) {
            return xVar;
        }
        U0(10);
        throw null;
    }

    @Override // yc.b
    public final a0 s0() {
        return D1().s0();
    }

    @Override // yc.b
    public final a0 v0() {
        return D1().v0();
    }

    @Override // yc.b
    public final List z0() {
        List listZ0 = D1().z0();
        if (listZ0 != null) {
            return listZ0;
        }
        U0(14);
        throw null;
    }

    @Override // yc.o0
    public final /* bridge */ /* synthetic */ yc.l h(se.r0 r0Var) {
        h(r0Var);
        return this;
    }
}
