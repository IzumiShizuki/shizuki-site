package bd;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends n0 implements yc.j0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public se.w f2661m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final q0 f2662n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(yc.k0 k0Var, zc.h hVar, yc.x xVar, ld.o oVar, boolean z10, boolean z11, boolean z12, int i10, q0 q0Var, yc.m0 m0Var) {
        super(xVar, oVar, k0Var, hVar, be.e.g("<get-" + k0Var.getName() + ">"), z10, z11, z12, i10, m0Var);
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
        this.f2662n = q0Var != null ? q0Var : this;
    }

    public static /* synthetic */ void U0(int i10) {
        String str = (i10 == 6 || i10 == 7 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 6 || i10 == 7 || i10 == 8) ? 2 : 3];
        switch (i10) {
            case 1:
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
            case 7:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i10 == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i10 == 7) {
            objArr[1] = "getValueParameters";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // yc.c, yc.b
    public final Collection A() {
        return E1(true);
    }

    @Override // bd.q, bd.p, yc.k, yc.b
    /* JADX INFO: renamed from: F1, reason: merged with bridge method [inline-methods] */
    public final q0 a() {
        q0 q0Var = this.f2662n;
        if (q0Var != null) {
            return q0Var;
        }
        U0(8);
        throw null;
    }

    public final void G1(se.w wVar) {
        if (wVar == null) {
            wVar = D1().b();
        }
        this.f2661m = wVar;
    }

    @Override // yc.k
    public final Object a0(yc.m mVar, Object obj) {
        return mVar.i(this, obj);
    }

    @Override // yc.b
    public final se.w n() {
        return this.f2661m;
    }

    @Override // yc.b
    public final List o0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        U0(7);
        throw null;
    }
}
