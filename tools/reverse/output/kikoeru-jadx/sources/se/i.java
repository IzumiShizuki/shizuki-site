package se;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bd.e0 f19952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f19953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Collection f19954e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(bd.e0 e0Var, List list, Collection collection, re.o oVar) {
        super(oVar);
        if (list == null) {
            l(1);
            throw null;
        }
        if (collection == null) {
            l(2);
            throw null;
        }
        if (oVar == null) {
            l(3);
            throw null;
        }
        this.f19952c = e0Var;
        this.f19953d = Collections.unmodifiableList(new ArrayList(list));
        this.f19954e = Collections.unmodifiableCollection(collection);
    }

    public static /* synthetic */ void l(int i10) {
        String str = (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getParameters";
        } else if (i10 == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i10 == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i10 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // se.f
    public final Collection b() {
        Collection collection = this.f19954e;
        if (collection != null) {
            return collection;
        }
        l(6);
        throw null;
    }

    @Override // se.f
    public final yc.n0 d() {
        return yc.n0.f26123c;
    }

    @Override // se.k0
    public final boolean j() {
        return true;
    }

    @Override // se.b
    /* JADX INFO: renamed from: m */
    public final yc.e h() {
        bd.e0 e0Var = this.f19952c;
        if (e0Var != null) {
            return e0Var;
        }
        l(5);
        throw null;
    }

    @Override // se.k0
    public final List o() {
        List list = this.f19953d;
        if (list != null) {
            return list;
        }
        l(4);
        throw null;
    }

    public final String toString() {
        return ee.e.g(this.f19952c).f2747a;
    }
}
