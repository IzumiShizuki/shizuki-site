package se;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19942a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f19943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f19944c;

    public f0(w wVar, x0 x0Var) {
        if (x0Var == null) {
            e(0);
            throw null;
        }
        if (wVar == null) {
            e(1);
            throw null;
        }
        this.f19943b = x0Var;
        this.f19944c = wVar;
    }

    public static /* synthetic */ void e(int i10) {
        String str = (i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5) ? 2 : 3];
        switch (i10) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i10 == 3) {
            objArr[2] = "replaceType";
        } else if (i10 != 4 && i10 != 5) {
            if (i10 != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // se.n0
    public final x0 a() {
        switch (this.f19942a) {
            case 0:
                return x0.OUT_VARIANCE;
            default:
                x0 x0Var = (x0) this.f19943b;
                if (x0Var != null) {
                    return x0Var;
                }
                e(4);
                throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ub.h] */
    @Override // se.n0
    public final w b() {
        switch (this.f19942a) {
            case 0:
                return (w) this.f19944c.getValue();
            default:
                w wVar = (w) this.f19944c;
                if (wVar != null) {
                    return wVar;
                }
                e(5);
                throw null;
        }
    }

    @Override // se.n0
    public final boolean c() {
        switch (this.f19942a) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // se.n0
    public final n0 d(te.f fVar) {
        switch (this.f19942a) {
            case 0:
                jc.l.e(fVar, "kotlinTypeRefiner");
                return this;
            default:
                if (fVar == null) {
                    e(6);
                    throw null;
                }
                x0 x0Var = (x0) this.f19943b;
                w wVar = (w) this.f19944c;
                fVar.getClass();
                jc.l.e(wVar, "type");
                return new f0(wVar, x0Var);
        }
    }

    public f0(yc.q0 q0Var) {
        jc.l.e(q0Var, "typeParameter");
        this.f19943b = q0Var;
        this.f19944c = ub.a.c(ub.i.f21540a, new bd.e(25, this));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f0(w wVar) {
        this(wVar, x0.INVARIANT);
        if (wVar != null) {
        } else {
            e(2);
            throw null;
        }
    }
}
