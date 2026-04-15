package bd;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends p implements yc.i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2542c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yc.k f2543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final me.d f2544e;

    public a0(yc.e eVar) {
        super(zc.g.f26696a, be.g.f2758d);
        this.f2543d = eVar;
        this.f2544e = new me.c(eVar);
    }

    public static /* synthetic */ void C1(int i10) {
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
            case 11:
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
            case 11:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                objArr[1] = "getVisibility";
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i10) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 11:
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
            case 11:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static /* synthetic */ void U0(int i10) {
        String str = (i10 == 1 || i10 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2) ? 2 : 3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i10 != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i10 == 1) {
            objArr[1] = "getValue";
        } else if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static /* synthetic */ void V0(int i10) {
        String str = (i10 == 7 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 7 || i10 == 8) ? 2 : 3];
        switch (i10) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = "name";
                break;
            case 7:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                objArr[0] = "newOwner";
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                objArr[0] = "outType";
                break;
        }
        if (i10 == 7) {
            objArr[1] = "getValue";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i10) {
            case 7:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                objArr[2] = "copy";
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 7 && i10 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // yc.b
    public final Collection A() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        C1(8);
        throw null;
    }

    public final me.d D1() {
        switch (this.f2542c) {
            case 0:
                me.c cVar = (me.c) this.f2544e;
                if (cVar != null) {
                    return cVar;
                }
                U0(1);
                throw null;
            default:
                androidx.lifecycle.q qVar = (androidx.lifecycle.q) this.f2544e;
                if (qVar != null) {
                    return qVar;
                }
                V0(7);
                throw null;
        }
    }

    @Override // yc.o0
    /* JADX INFO: renamed from: E1, reason: merged with bridge method [inline-methods] */
    public final a0 h(se.r0 r0Var) {
        if (r0Var == null) {
            C1(3);
            throw null;
        }
        if (!r0Var.f19981a.e()) {
            se.w wVarI = y() instanceof yc.e ? r0Var.i(b(), se.x0.OUT_VARIANCE) : r0Var.i(b(), se.x0.INVARIANT);
            if (wVarI == null) {
                return null;
            }
            if (wVarI != b()) {
                return new a0(y(), new me.e(wVarI), getAnnotations());
            }
        }
        return this;
    }

    @Override // yc.b
    public final boolean Z() {
        return false;
    }

    @Override // bd.p, yc.k, yc.b
    public final yc.b a() {
        return this;
    }

    @Override // yc.k
    public final Object a0(yc.m mVar, Object obj) {
        return mVar.o(this, obj);
    }

    @Override // androidx.lifecycle.q, me.d
    public final se.w b() {
        se.w wVarB = D1().b();
        if (wVarB != null) {
            return wVarB;
        }
        C1(6);
        throw null;
    }

    @Override // yc.n
    public final ld.o f() {
        ld.o oVar = yc.o.f26130f;
        if (oVar != null) {
            return oVar;
        }
        C1(9);
        throw null;
    }

    @Override // yc.b
    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        C1(5);
        throw null;
    }

    @Override // yc.l
    public final yc.m0 m() {
        return yc.m0.p0;
    }

    @Override // yc.b
    public final se.w n() {
        return b();
    }

    @Override // yc.b
    public final List o0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        C1(7);
        throw null;
    }

    @Override // yc.b
    public final a0 s0() {
        return null;
    }

    @Override // bd.p
    public String toString() {
        switch (this.f2542c) {
            case 0:
                return "class " + ((yc.e) this.f2543d).getName() + "::this";
            default:
                return super.toString();
        }
    }

    @Override // yc.b
    public final a0 v0() {
        return null;
    }

    @Override // yc.k
    public final yc.k y() {
        switch (this.f2542c) {
            case 0:
                yc.e eVar = (yc.e) this.f2543d;
                if (eVar != null) {
                    return eVar;
                }
                U0(2);
                throw null;
            default:
                yc.k kVar = this.f2543d;
                if (kVar != null) {
                    return kVar;
                }
                V0(8);
                throw null;
        }
    }

    @Override // bd.p, yc.k, yc.b
    public final yc.k a() {
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(yc.k kVar, androidx.lifecycle.q qVar, zc.h hVar) {
        this(kVar, qVar, hVar, be.g.f2758d);
        if (kVar == null) {
            V0(0);
            throw null;
        }
        if (hVar != null) {
        } else {
            V0(2);
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(yc.k kVar, androidx.lifecycle.q qVar, zc.h hVar, be.e eVar) {
        super(hVar, eVar);
        if (kVar == null) {
            V0(3);
            throw null;
        }
        if (hVar == null) {
            V0(5);
            throw null;
        }
        if (eVar != null) {
            this.f2543d = kVar;
            this.f2544e = qVar;
            return;
        }
        V0(6);
        throw null;
    }
}
