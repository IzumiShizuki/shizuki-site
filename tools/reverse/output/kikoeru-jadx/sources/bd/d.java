package bd;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class d extends k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(re.o oVar, yc.k kVar, zc.h hVar, be.e eVar, se.x0 x0Var, boolean z10, int i10, yc.n0 n0Var) {
        super(oVar, kVar, hVar, eVar, x0Var, z10, i10, n0Var);
        if (oVar == null) {
            U0(0);
            throw null;
        }
        if (kVar == null) {
            U0(1);
            throw null;
        }
        if (n0Var != null) {
        } else {
            U0(6);
            throw null;
        }
    }

    public static /* synthetic */ void U0(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // bd.p
    public final String toString() {
        String str = "";
        String str2 = this.f2599f ? "reified " : "";
        if (e0() != se.x0.INVARIANT) {
            str = e0() + " ";
        }
        return str2 + str + getName();
    }
}
