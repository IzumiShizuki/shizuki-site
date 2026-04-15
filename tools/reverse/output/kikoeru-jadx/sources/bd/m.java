package bd;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class m extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yc.k f2607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final yc.m0 f2608f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(re.o oVar, yc.k kVar, be.e eVar, yc.m0 m0Var) {
        super(oVar, eVar);
        if (oVar == null) {
            k(0);
            throw null;
        }
        if (kVar == null) {
            k(1);
            throw null;
        }
        if (eVar == null) {
            k(2);
            throw null;
        }
        this.f2607e = kVar;
        this.f2608f = m0Var;
    }

    public static /* synthetic */ void k(int i10) {
        String str = (i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i10 == 2) {
            objArr[0] = "name";
        } else if (i10 == 3) {
            objArr[0] = "source";
        } else if (i10 == 4 || i10 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i10 == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 4 && i10 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // yc.w
    public boolean P() {
        return false;
    }

    @Override // yc.l
    public final yc.m0 m() {
        yc.m0 m0Var = this.f2608f;
        if (m0Var != null) {
            return m0Var;
        }
        k(5);
        throw null;
    }

    @Override // yc.k
    public final yc.k y() {
        yc.k kVar = this.f2607e;
        if (kVar != null) {
            return kVar;
        }
        k(4);
        throw null;
    }
}
