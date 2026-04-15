package bd;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final yc.f f2587g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public yc.x f2588h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ld.o f2589i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public se.i f2590j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f2591k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f2592l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final re.o f2593m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(r rVar, be.e eVar, re.o oVar) {
        super(oVar, rVar, eVar, yc.m0.p0);
        if (oVar == null) {
            k(4);
            throw null;
        }
        this.f2592l = new ArrayList();
        this.f2593m = oVar;
        this.f2587g = yc.f.f26110b;
    }

    public static /* synthetic */ void k(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 5:
            case 7:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 5:
            case 7:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i11 = 2;
                break;
            case 6:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case 12:
            case 14:
            case 16:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                objArr[1] = "getKind";
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i10) {
            case 5:
            case 7:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 5:
            case 7:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 6:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case 12:
            case 14:
            case 16:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // yc.e
    public final yc.r0 J0() {
        return null;
    }

    @Override // yc.e, yc.i
    public final List L() {
        ArrayList arrayList = this.f2591k;
        if (arrayList != null) {
            return arrayList;
        }
        k(15);
        throw null;
    }

    @Override // yc.w
    public final boolean O0() {
        return false;
    }

    @Override // yc.h
    public final se.k0 Q() {
        se.i iVar = this.f2590j;
        if (iVar != null) {
            return iVar;
        }
        k(11);
        throw null;
    }

    @Override // yc.e
    public final boolean R() {
        return false;
    }

    @Override // yc.e
    public final boolean S0() {
        return false;
    }

    @Override // yc.e
    public final Collection T() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        k(13);
        throw null;
    }

    @Override // yc.e
    public final boolean W() {
        return false;
    }

    @Override // yc.w
    public final boolean c0() {
        return false;
    }

    @Override // yc.i
    public final boolean d0() {
        return false;
    }

    @Override // yc.e, yc.w, yc.n
    public final ld.o f() {
        ld.o oVar = this.f2589i;
        if (oVar != null) {
            return oVar;
        }
        k(10);
        throw null;
    }

    @Override // zc.a
    public final zc.h getAnnotations() {
        return zc.g.f26696a;
    }

    @Override // bd.e0
    public final le.o i(te.f fVar) {
        return le.n.f12335b;
    }

    @Override // yc.e
    public final yc.f j() {
        yc.f fVar = this.f2587g;
        if (fVar != null) {
            return fVar;
        }
        k(8);
        throw null;
    }

    @Override // yc.e
    public final l j0() {
        return null;
    }

    @Override // yc.e
    public final le.o k0() {
        return le.n.f12335b;
    }

    @Override // yc.e
    public final boolean l() {
        return false;
    }

    @Override // yc.e, yc.w
    public final yc.x s() {
        yc.x xVar = this.f2588h;
        if (xVar != null) {
            return xVar;
        }
        k(7);
        throw null;
    }

    public final String toString() {
        return p.B1(this);
    }

    @Override // yc.e
    public final boolean w() {
        return false;
    }
}
