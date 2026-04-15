package bd;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends n0 implements yc.j0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public y0 f2664m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r0 f2665n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(yc.k0 k0Var, zc.h hVar, yc.x xVar, ld.o oVar, boolean z10, boolean z11, boolean z12, int i10, r0 r0Var, yc.m0 m0Var) {
        super(xVar, oVar, k0Var, hVar, be.e.g("<set-" + k0Var.getName() + ">"), z10, z11, z12, i10, m0Var);
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
        if (i10 == 0) {
            U0(4);
            throw null;
        }
        if (m0Var == null) {
            U0(5);
            throw null;
        }
        this.f2665n = r0Var != null ? r0Var : this;
    }

    public static y0 F1(r0 r0Var, se.w wVar, zc.h hVar) {
        if (wVar == null) {
            U0(8);
            throw null;
        }
        if (hVar != null) {
            return new y0(r0Var, null, 0, hVar, be.g.f2761g, wVar, false, false, false, null, yc.m0.p0);
        }
        U0(9);
        throw null;
    }

    public static /* synthetic */ void U0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 11:
            case 12:
            case 13:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                objArr[0] = "type";
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i10) {
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i10) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                objArr[2] = "createSetterParameter";
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // yc.c, yc.b
    public final Collection A() {
        return E1(false);
    }

    @Override // bd.q, bd.p, yc.k, yc.b
    /* JADX INFO: renamed from: G1, reason: merged with bridge method [inline-methods] */
    public final r0 a() {
        r0 r0Var = this.f2665n;
        if (r0Var != null) {
            return r0Var;
        }
        U0(13);
        throw null;
    }

    @Override // yc.k
    public final Object a0(yc.m mVar, Object obj) {
        return mVar.w(this, obj);
    }

    @Override // yc.b
    public final se.w n() {
        return ie.d.e(this).w();
    }

    @Override // yc.b
    public final List o0() {
        y0 y0Var = this.f2664m;
        if (y0Var == null) {
            throw new IllegalStateException();
        }
        List listSingletonList = Collections.singletonList(y0Var);
        if (listSingletonList != null) {
            return listSingletonList;
        }
        U0(11);
        throw null;
    }
}
