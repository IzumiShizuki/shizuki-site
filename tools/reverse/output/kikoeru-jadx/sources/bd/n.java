package bd;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class n extends m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final yc.x f2610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final yc.f f2611h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final se.i f2612i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public le.o f2613j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Set f2614k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public l f2615l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(yc.k kVar, be.e eVar, yc.x xVar, yc.f fVar, Collection collection, re.o oVar) {
        super(oVar, kVar, eVar, yc.m0.p0);
        if (kVar == null) {
            k(0);
            throw null;
        }
        if (eVar == null) {
            k(1);
            throw null;
        }
        if (oVar == null) {
            k(6);
            throw null;
        }
        this.f2610g = xVar;
        this.f2611h = fVar;
        this.f2612i = new se.i(this, Collections.EMPTY_LIST, collection, oVar);
    }

    public static /* synthetic */ void k(int i10) {
        String str;
        int i11;
        switch (i10) {
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
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
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                objArr[0] = "constructors";
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                objArr[1] = "getAnnotations";
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i10) {
            case 7:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                objArr[2] = "initialize";
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 12:
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
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        k(18);
        throw null;
    }

    @Override // yc.w
    public final boolean O0() {
        return false;
    }

    @Override // yc.h
    public final se.k0 Q() {
        se.i iVar = this.f2612i;
        if (iVar != null) {
            return iVar;
        }
        k(10);
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
        Set set = this.f2614k;
        if (set != null) {
            return set;
        }
        k(11);
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
        ld.o oVar = yc.o.f26129e;
        if (oVar != null) {
            return oVar;
        }
        k(17);
        throw null;
    }

    @Override // zc.a
    public final zc.h getAnnotations() {
        return zc.g.f26696a;
    }

    @Override // bd.e0
    public final le.o i(te.f fVar) {
        le.o oVar = this.f2613j;
        if (oVar != null) {
            return oVar;
        }
        k(13);
        throw null;
    }

    @Override // yc.e
    public final yc.f j() {
        yc.f fVar = this.f2611h;
        if (fVar != null) {
            return fVar;
        }
        k(15);
        throw null;
    }

    @Override // yc.e
    public final l j0() {
        return this.f2615l;
    }

    @Override // yc.e
    public final le.o k0() {
        return le.n.f12335b;
    }

    @Override // yc.e
    public final boolean l() {
        return false;
    }

    public final void q(le.o oVar, Set set, l lVar) {
        this.f2613j = oVar;
        this.f2614k = set;
        this.f2615l = lVar;
    }

    @Override // yc.e, yc.w
    public final yc.x s() {
        yc.x xVar = this.f2610g;
        if (xVar != null) {
            return xVar;
        }
        k(16);
        throw null;
    }

    public String toString() {
        return "class " + getName();
    }

    @Override // yc.e
    public final boolean w() {
        return false;
    }
}
