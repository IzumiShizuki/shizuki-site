package bd;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class q extends p implements yc.l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yc.k f2659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yc.m0 f2660d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(yc.k kVar, zc.h hVar, be.e eVar, yc.m0 m0Var) {
        super(hVar, eVar);
        if (kVar == null) {
            U0(0);
            throw null;
        }
        if (hVar == null) {
            U0(1);
            throw null;
        }
        if (eVar == null) {
            U0(2);
            throw null;
        }
        if (m0Var == null) {
            U0(3);
            throw null;
        }
        this.f2659c = kVar;
        this.f2660d = m0Var;
    }

    public static /* synthetic */ void U0(int i10) {
        String str = (i10 == 4 || i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getOriginal";
        } else if (i10 == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i10 != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 4 && i10 != 5 && i10 != 6) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public yc.m0 m() {
        yc.m0 m0Var = this.f2660d;
        if (m0Var != null) {
            return m0Var;
        }
        U0(6);
        throw null;
    }

    public yc.k y() {
        yc.k kVar = this.f2659c;
        if (kVar != null) {
            return kVar;
        }
        U0(5);
        throw null;
    }

    @Override // bd.p, yc.k, yc.b
    /* JADX INFO: renamed from: C1 */
    public yc.l a() {
        return this;
    }
}
