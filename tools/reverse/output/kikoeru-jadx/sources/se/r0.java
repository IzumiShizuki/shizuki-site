package se;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements ve.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r0 f19980b = new r0(p0.f19977a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f19981a;

    public r0(p0 p0Var) {
        this.f19981a = p0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r13) {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: se.r0.a(int):void");
    }

    public static x0 b(x0 x0Var, x0 x0Var2) {
        if (x0Var == null) {
            a(38);
            throw null;
        }
        if (x0Var2 == null) {
            a(39);
            throw null;
        }
        x0 x0Var3 = x0.INVARIANT;
        if (x0Var == x0Var3) {
            if (x0Var2 != null) {
                return x0Var2;
            }
            a(40);
            throw null;
        }
        if (x0Var2 == x0Var3) {
            if (x0Var != null) {
                return x0Var;
            }
            a(41);
            throw null;
        }
        if (x0Var == x0Var2) {
            if (x0Var2 != null) {
                return x0Var2;
            }
            a(42);
            throw null;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + x0Var + "' and projection kind '" + x0Var2 + "' cannot be combined");
    }

    public static int c(x0 x0Var, x0 x0Var2) {
        x0 x0Var3 = x0.OUT_VARIANCE;
        x0 x0Var4 = x0.IN_VARIANCE;
        if (x0Var == x0Var4 && x0Var2 == x0Var3) {
            return 3;
        }
        return (x0Var == x0Var3 && x0Var2 == x0Var4) ? 2 : 1;
    }

    public static r0 d(w wVar) {
        if (wVar == null) {
            a(6);
            throw null;
        }
        return new r0(l0.f19970b.g(wVar.t(), wVar.q()));
    }

    public static r0 e(p0 p0Var, p0 p0Var2) {
        if (p0Var == null) {
            a(3);
            throw null;
        }
        if (p0Var2 == null) {
            a(4);
            throw null;
        }
        if (p0Var.e()) {
            p0Var = p0Var2;
        } else if (!p0Var2.e()) {
            p0Var = new o(p0Var, p0Var2);
        }
        return new r0(p0Var);
    }

    public static String h(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th2) {
            if (bf.m.i(th2)) {
                throw th2;
            }
            return "[Exception while computing toString(): " + th2 + "]";
        }
    }

    public final p0 f() {
        p0 p0Var = this.f19981a;
        if (p0Var != null) {
            return p0Var;
        }
        a(8);
        throw null;
    }

    public final w g(w wVar, x0 x0Var) {
        if (wVar == null) {
            a(9);
            throw null;
        }
        if (this.f19981a.e()) {
            return wVar;
        }
        try {
            w wVarB = j(new f0(wVar, x0Var), null, 0).b();
            if (wVarB != null) {
                return wVarB;
            }
            a(12);
            throw null;
        } catch (q0 e10) {
            return ue.l.c(ue.k.UNABLE_TO_SUBSTITUTE_TYPE, e10.getMessage());
        }
    }

    public final w i(w wVar, x0 x0Var) {
        if (wVar == null) {
            a(14);
            throw null;
        }
        if (x0Var == null) {
            a(15);
            throw null;
        }
        n0 f0Var = new f0(f().f(wVar, x0Var), x0Var);
        p0 p0Var = this.f19981a;
        if (!p0Var.e()) {
            try {
                f0Var = j(f0Var, null, 0);
            } catch (q0 unused) {
                f0Var = null;
            }
        }
        if (p0Var.a() || p0Var.b()) {
            boolean zB = p0Var.b();
            if (f0Var == null) {
                f0Var = null;
            } else if (!f0Var.c()) {
                w wVarB = f0Var.b();
                jc.l.d(wVarB, "getType(...)");
                if (u0.c(wVarB, xe.b.f24978a, null)) {
                    x0 x0VarA = f0Var.a();
                    jc.l.d(x0VarA, "getProjectionKind(...)");
                    if (x0VarA == x0.OUT_VARIANCE) {
                        f0Var = new f0((w) ud.n.a(wVarB).f24977b, x0VarA);
                    } else if (zB) {
                        f0Var = new f0((w) ud.n.a(wVarB).f24976a, x0VarA);
                    } else {
                        xe.c cVar = new xe.c();
                        r0 r0Var = new r0(cVar);
                        if (!cVar.e()) {
                            try {
                                f0Var = r0Var.j(f0Var, null, 0);
                            } catch (q0 unused2) {
                                f0Var = null;
                            }
                        }
                    }
                }
            }
        }
        if (f0Var == null) {
            return null;
        }
        return f0Var.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0130  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final se.n0 j(se.n0 r17, yc.q0 r18, int r19) throws se.q0 {
        /*
            Method dump skipped, instruction units count: 789
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: se.r0.j(se.n0, yc.q0, int):se.n0");
    }
}
