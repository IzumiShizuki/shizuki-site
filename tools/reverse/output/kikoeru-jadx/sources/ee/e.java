package ee;

import bd.c0;
import bd.j0;
import bd.r0;
import com.tencent.bugly.beta.tinker.TinkerReport;
import com.tencent.bugly.beta.tinker.TinkerUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import se.k0;
import se.w;
import yc.d0;
import yc.h0;
import yc.n0;
import yc.o;
import yc.x;
import yc.y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f6524a = 0;

    static {
        new be.c("kotlin.jvm.JvmName");
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 7:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case TinkerReport.KEY_TRY_APPLY_DISABLE /* 71 */:
            case TinkerReport.KEY_TRY_APPLY_GOOGLEPLAY /* 75 */:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 7:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case TinkerReport.KEY_TRY_APPLY_DISABLE /* 71 */:
            case TinkerReport.KEY_TRY_APPLY_GOOGLEPLAY /* 75 */:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 60:
            case 63:
            case TinkerReport.KEY_TRY_APPLY_JIT /* 81 */:
            case 94:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case TinkerReport.KEY_TRY_APPLY_DISABLE /* 71 */:
            case TinkerReport.KEY_TRY_APPLY_GOOGLEPLAY /* 75 */:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case TinkerUtils.MIN_MEMORY_HEAP_SIZE /* 45 */:
            case 66:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 67:
            case 68:
            case 69:
            case TinkerReport.KEY_TRY_APPLY_ROM_SPACE /* 76 */:
            case TinkerReport.KEY_TRY_APPLY_ALREADY_APPLY /* 77 */:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 65:
                objArr[0] = "variable";
                break;
            case TinkerReport.KEY_TRY_APPLY_UPGRADE /* 70 */:
                objArr[0] = "f";
                break;
            case TinkerReport.KEY_TRY_APPLY_RUNNING /* 72 */:
                objArr[0] = "current";
                break;
            case TinkerReport.KEY_TRY_APPLY_INSERVICE /* 73 */:
                objArr[0] = "result";
                break;
            case TinkerReport.KEY_TRY_APPLY_NOT_EXIST /* 74 */:
                objArr[0] = "memberDescriptor";
                break;
            case TinkerReport.KEY_TRY_APPLY_MEMORY_LIMIT /* 78 */:
            case TinkerReport.KEY_TRY_APPLY_CRASH_LIMIT /* 79 */:
            case TinkerReport.KEY_TRY_APPLY_CONDITION_NOT_SATISFIED /* 80 */:
                objArr[0] = "annotated";
                break;
            case 84:
            case 86:
            case 89:
            case 91:
                objArr[0] = "scope";
                break;
            case 87:
            case 90:
            case 92:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 59:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 61:
            case 62:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 64:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case TinkerReport.KEY_TRY_APPLY_DISABLE /* 71 */:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case TinkerReport.KEY_TRY_APPLY_GOOGLEPLAY /* 75 */:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 82:
            case 83:
                objArr[1] = "getContainingSourceFile";
                break;
            case 85:
                objArr[1] = "getAllDescriptors";
                break;
            case 88:
                objArr[1] = "getFunctionByName";
                break;
            case 93:
                objArr[1] = "getPropertyByName";
                break;
            case 95:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i10) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case TinkerReport.KEY_TRY_APPLY_DISABLE /* 71 */:
            case TinkerReport.KEY_TRY_APPLY_GOOGLEPLAY /* 75 */:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case TinkerUtils.MIN_MEMORY_HEAP_SIZE /* 45 */:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 60:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 63:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 65:
            case 66:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 67:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 69:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case TinkerReport.KEY_TRY_APPLY_UPGRADE /* 70 */:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case TinkerReport.KEY_TRY_APPLY_RUNNING /* 72 */:
            case TinkerReport.KEY_TRY_APPLY_INSERVICE /* 73 */:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case TinkerReport.KEY_TRY_APPLY_NOT_EXIST /* 74 */:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case TinkerReport.KEY_TRY_APPLY_ROM_SPACE /* 76 */:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case TinkerReport.KEY_TRY_APPLY_ALREADY_APPLY /* 77 */:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case TinkerReport.KEY_TRY_APPLY_MEMORY_LIMIT /* 78 */:
                objArr[2] = "getJvmName";
                break;
            case TinkerReport.KEY_TRY_APPLY_CRASH_LIMIT /* 79 */:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case TinkerReport.KEY_TRY_APPLY_CONDITION_NOT_SATISFIED /* 80 */:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case TinkerReport.KEY_TRY_APPLY_JIT /* 81 */:
                objArr[2] = "getContainingSourceFile";
                break;
            case 84:
                objArr[2] = "getAllDescriptors";
                break;
            case 86:
            case 87:
                objArr[2] = "getFunctionByName";
                break;
            case 89:
            case 90:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 91:
            case 92:
                objArr[2] = "getPropertyByName";
                break;
            case 94:
                objArr[2] = "getDirectMember";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 7:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case TinkerReport.KEY_TRY_APPLY_DISABLE /* 71 */:
            case TinkerReport.KEY_TRY_APPLY_GOOGLEPLAY /* 75 */:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static void b(yc.b bVar, LinkedHashSet linkedHashSet) {
        if (bVar == null) {
            a(72);
            throw null;
        }
        if (linkedHashSet.contains(bVar)) {
            return;
        }
        Iterator it = bVar.a().A().iterator();
        while (it.hasNext()) {
            yc.b bVarA = ((yc.b) it.next()).a();
            b(bVarA, linkedHashSet);
            linkedHashSet.add(bVarA);
        }
    }

    public static yc.e c(w wVar) {
        if (wVar == null) {
            a(45);
            throw null;
        }
        k0 k0VarT = wVar.t();
        if (k0VarT == null) {
            a(46);
            throw null;
        }
        yc.e eVar = (yc.e) k0VarT.h();
        if (eVar != null) {
            return eVar;
        }
        a(47);
        throw null;
    }

    public static y d(yc.k kVar) {
        if (kVar == null) {
            a(21);
            throw null;
        }
        y yVarE = e(kVar);
        if (yVarE != null) {
            return yVarE;
        }
        a(22);
        throw null;
    }

    public static y e(yc.k kVar) {
        if (kVar == null) {
            a(23);
            throw null;
        }
        while (kVar != null) {
            if (kVar instanceof y) {
                return (y) kVar;
            }
            if (kVar instanceof h0) {
                return ((c0) ((h0) kVar)).f2554c;
            }
            kVar = kVar.y();
        }
        return null;
    }

    public static n0 f(yc.k kVar) {
        n0 n0Var = n0.f26122b;
        if (kVar == null) {
            a(81);
            throw null;
        }
        if (kVar instanceof r0) {
            kVar = ((r0) kVar).D1();
        }
        if (kVar instanceof yc.l) {
            ((yc.l) kVar).m().getClass();
        }
        return n0Var;
    }

    public static be.d g(yc.k kVar) {
        if (kVar != null) {
            be.c cVarH = h(kVar);
            return cVarH != null ? cVarH.f2744a : g(kVar.y()).a(kVar.getName());
        }
        a(2);
        throw null;
    }

    public static be.c h(yc.k kVar) {
        if (kVar == null) {
            a(5);
            throw null;
        }
        if ((kVar instanceof y) || ue.l.f(kVar)) {
            return be.c.f2743c;
        }
        if (kVar instanceof h0) {
            return ((c0) ((h0) kVar)).f2555d;
        }
        if (kVar instanceof d0) {
            return ((j0) ((d0) kVar)).f2596e;
        }
        return null;
    }

    public static yc.k i(yc.k kVar, Class cls, boolean z10) {
        if (kVar == null) {
            return null;
        }
        if (z10) {
            kVar = kVar.y();
        }
        while (kVar != null) {
            if (cls.isInstance(kVar)) {
                return kVar;
            }
            kVar = kVar.y();
        }
        return null;
    }

    public static yc.e j(yc.e eVar) {
        if (eVar == null) {
            a(44);
            throw null;
        }
        Iterator it = eVar.Q().i().iterator();
        while (it.hasNext()) {
            yc.e eVarC = c((w) it.next());
            if (eVarC.j() != yc.f.f26110b) {
                return eVarC;
            }
        }
        return null;
    }

    public static boolean k(yc.k kVar) {
        return m(kVar, yc.f.f26109a) && kVar.getName().equals(be.g.f2755a);
    }

    public static boolean l(yc.k kVar) {
        return m(kVar, yc.f.f26114f) && ((yc.e) kVar).R();
    }

    public static boolean m(yc.k kVar, yc.f fVar) {
        return (kVar instanceof yc.e) && ((yc.e) kVar).j() == fVar;
    }

    public static boolean n(yc.k kVar) {
        if (kVar == null) {
            a(1);
            throw null;
        }
        while (kVar != null) {
            if (k(kVar) || ((kVar instanceof yc.n) && ((yc.n) kVar).f() == o.f26130f)) {
                return true;
            }
            kVar = kVar.y();
        }
        return false;
    }

    public static boolean o(w wVar, yc.k kVar) {
        if (wVar == null) {
            a(30);
            throw null;
        }
        if (kVar == null) {
            a(31);
            throw null;
        }
        yc.h hVarH = wVar.t().h();
        if (hVarH == null) {
            return false;
        }
        yc.k kVarA = hVarH.a();
        return (kVarA instanceof yc.h) && (kVar instanceof yc.h) && ((yc.h) kVar).Q().equals(((yc.h) kVarA).Q());
    }

    public static boolean p(yc.k kVar) {
        return (m(kVar, yc.f.f26109a) || m(kVar, yc.f.f26110b)) && ((yc.e) kVar).s() == x.f26156c;
    }

    public static boolean q(w wVar, yc.k kVar) {
        if (wVar == null) {
            a(32);
            throw null;
        }
        if (kVar == null) {
            a(33);
            throw null;
        }
        if (o(wVar, kVar)) {
            return true;
        }
        Iterator it = wVar.t().i().iterator();
        while (it.hasNext()) {
            if (q((w) it.next(), kVar)) {
                return true;
            }
        }
        return false;
    }

    public static boolean r(yc.k kVar) {
        return kVar != null && (kVar.y() instanceof d0);
    }

    public static yc.c s(yc.c cVar) {
        if (cVar == null) {
            a(58);
            throw null;
        }
        while (cVar.j() == 2) {
            Collection collectionA = cVar.A();
            if (collectionA.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + cVar);
            }
            cVar = (yc.c) collectionA.iterator().next();
        }
        return cVar;
    }
}
