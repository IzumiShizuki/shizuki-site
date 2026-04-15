package bd;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v extends m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final se.i f2676g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u f2677h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final re.m f2678i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final zc.h f2679j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(re.o oVar, yc.e eVar, se.a0 a0Var, be.e eVar2, re.m mVar, zc.h hVar, yc.m0 m0Var) {
        super(oVar, eVar, eVar2, m0Var);
        if (oVar == null) {
            k(6);
            throw null;
        }
        if (eVar == null) {
            k(7);
            throw null;
        }
        if (a0Var == null) {
            k(8);
            throw null;
        }
        if (eVar2 == null) {
            k(9);
            throw null;
        }
        if (mVar == null) {
            k(10);
            throw null;
        }
        this.f2679j = hVar;
        this.f2676g = new se.i(this, Collections.EMPTY_LIST, Collections.singleton(a0Var), oVar);
        this.f2677h = new u(this, oVar);
        this.f2678i = mVar;
    }

    public static /* synthetic */ void k(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                objArr[0] = "name";
                break;
            case 3:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i10) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i10) {
            case 6:
            case 7:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static v q(re.o oVar, yc.e eVar, be.e eVar2, re.i iVar, zc.h hVar, yc.m0 m0Var) {
        if (oVar == null) {
            k(0);
            throw null;
        }
        if (eVar == null) {
            k(1);
            throw null;
        }
        if (eVar2 == null) {
            k(2);
            throw null;
        }
        if (iVar != null) {
            return new v(oVar, eVar, eVar.E(), eVar2, iVar, hVar, m0Var);
        }
        k(3);
        throw null;
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
        k(22);
        throw null;
    }

    @Override // yc.w
    public final boolean O0() {
        return false;
    }

    @Override // yc.h
    public final se.k0 Q() {
        se.i iVar = this.f2676g;
        if (iVar != null) {
            return iVar;
        }
        k(17);
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
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        k(16);
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
        k(20);
        throw null;
    }

    @Override // zc.a
    public final zc.h getAnnotations() {
        zc.h hVar = this.f2679j;
        if (hVar != null) {
            return hVar;
        }
        k(21);
        throw null;
    }

    @Override // bd.e0
    public final le.o i(te.f fVar) {
        u uVar = this.f2677h;
        if (uVar != null) {
            return uVar;
        }
        k(14);
        throw null;
    }

    @Override // yc.e
    public final yc.f j() {
        return yc.f.f26112d;
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
        return yc.x.f26155b;
    }

    public final String toString() {
        return "enum entry " + getName();
    }

    @Override // yc.e
    public final boolean w() {
        return false;
    }
}
