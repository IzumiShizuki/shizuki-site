package se;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(re.o oVar) {
        super(oVar);
        if (oVar != null) {
        } else {
            l(0);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void l(int r9) {
        /*
            r0 = 4
            r1 = 3
            r2 = 1
            if (r9 == r2) goto Lc
            if (r9 == r1) goto Lc
            if (r9 == r0) goto Lc
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Le
        Lc:
            java.lang.String r3 = "@NotNull method %s.%s must not return null"
        Le:
            r4 = 2
            if (r9 == r2) goto L17
            if (r9 == r1) goto L17
            if (r9 == r0) goto L17
            r5 = 3
            goto L18
        L17:
            r5 = 2
        L18:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor"
            r7 = 0
            if (r9 == r2) goto L2f
            if (r9 == r4) goto L2a
            if (r9 == r1) goto L2f
            if (r9 == r0) goto L2f
            java.lang.String r8 = "storageManager"
            r5[r7] = r8
            goto L31
        L2a:
            java.lang.String r8 = "classifier"
            r5[r7] = r8
            goto L31
        L2f:
            r5[r7] = r6
        L31:
            if (r9 == r2) goto L3f
            if (r9 == r1) goto L3a
            if (r9 == r0) goto L3a
            r5[r2] = r6
            goto L43
        L3a:
            java.lang.String r6 = "getAdditionalNeighboursInSupertypeGraph"
            r5[r2] = r6
            goto L43
        L3f:
            java.lang.String r6 = "getBuiltIns"
            r5[r2] = r6
        L43:
            if (r9 == r2) goto L54
            if (r9 == r4) goto L50
            if (r9 == r1) goto L54
            if (r9 == r0) goto L54
            java.lang.String r6 = "<init>"
            r5[r4] = r6
            goto L54
        L50:
            java.lang.String r6 = "isSameClassifier"
            r5[r4] = r6
        L54:
            java.lang.String r3 = java.lang.String.format(r3, r5)
            if (r9 == r2) goto L64
            if (r9 == r1) goto L64
            if (r9 == r0) goto L64
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r3)
            goto L69
        L64:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
        L69:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: se.b.l(int):void");
    }

    @Override // se.f
    public final w c() {
        yc.e eVarH = h();
        if (eVarH == null) {
            vc.i.a(107);
            throw null;
        }
        be.e eVar = vc.i.f22839e;
        if (vc.i.b(eVarH, vc.n.f22865a) || vc.i.b(eVarH, vc.n.f22867b)) {
            return null;
        }
        return g().e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072 A[RETURN] */
    @Override // se.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(yc.h r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof yc.e
            r1 = 0
            if (r0 == 0) goto L73
            yc.e r0 = r5.h()
            java.lang.String r2 = "first"
            jc.l.e(r0, r2)
            be.e r2 = r0.getName()
            be.e r3 = r6.getName()
            boolean r2 = jc.l.a(r2, r3)
            r3 = 1
            if (r2 != 0) goto L1f
        L1d:
            r6 = 0
            goto L70
        L1f:
            yc.k r0 = r0.y()
            yc.k r6 = r6.y()
        L27:
            if (r0 == 0) goto L51
            if (r6 == 0) goto L51
            boolean r2 = r0 instanceof yc.y
            if (r2 == 0) goto L32
            boolean r6 = r6 instanceof yc.y
            goto L70
        L32:
            boolean r2 = r6 instanceof yc.y
            if (r2 == 0) goto L37
            goto L1d
        L37:
            boolean r2 = r0 instanceof yc.d0
            if (r2 == 0) goto L53
            boolean r2 = r6 instanceof yc.d0
            if (r2 == 0) goto L1d
            yc.d0 r0 = (yc.d0) r0
            bd.j0 r0 = (bd.j0) r0
            be.c r0 = r0.f2596e
            yc.d0 r6 = (yc.d0) r6
            bd.j0 r6 = (bd.j0) r6
            be.c r6 = r6.f2596e
            boolean r6 = jc.l.a(r0, r6)
            if (r6 == 0) goto L1d
        L51:
            r6 = 1
            goto L70
        L53:
            boolean r2 = r6 instanceof yc.d0
            if (r2 == 0) goto L58
            goto L1d
        L58:
            be.e r2 = r0.getName()
            be.e r4 = r6.getName()
            boolean r2 = jc.l.a(r2, r4)
            if (r2 != 0) goto L67
            goto L1d
        L67:
            yc.k r0 = r0.y()
            yc.k r6 = r6.y()
            goto L27
        L70:
            if (r6 == 0) goto L73
            return r3
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: se.b.f(yc.h):boolean");
    }

    @Override // se.k0
    public final vc.i g() {
        vc.i iVarE = ie.d.e(h());
        if (iVarE != null) {
            return iVarE;
        }
        l(1);
        throw null;
    }

    @Override // se.k0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public abstract yc.e h();
}
