package se;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19990b;

    public t0(String str) {
        this.f19990b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void K(int r9) {
        /*
            r0 = 4
            r1 = 1
            if (r9 == r1) goto L9
            if (r9 == r0) goto L9
            java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Lb
        L9:
            java.lang.String r2 = "@NotNull method %s.%s must not return null"
        Lb:
            r3 = 3
            r4 = 2
            if (r9 == r1) goto L13
            if (r9 == r0) goto L13
            r5 = 3
            goto L14
        L13:
            r5 = 2
        L14:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType"
            r7 = 0
            if (r9 == r1) goto L30
            if (r9 == r4) goto L2b
            if (r9 == r3) goto L26
            if (r9 == r0) goto L30
            java.lang.String r8 = "newAttributes"
            r5[r7] = r8
            goto L32
        L26:
            java.lang.String r8 = "kotlinTypeRefiner"
            r5[r7] = r8
            goto L32
        L2b:
            java.lang.String r8 = "delegate"
            r5[r7] = r8
            goto L32
        L30:
            r5[r7] = r6
        L32:
            java.lang.String r7 = "refine"
            if (r9 == r1) goto L3e
            if (r9 == r0) goto L3b
            r5[r1] = r6
            goto L42
        L3b:
            r5[r1] = r7
            goto L42
        L3e:
            java.lang.String r6 = "toString"
            r5[r1] = r6
        L42:
            if (r9 == r1) goto L56
            if (r9 == r4) goto L52
            if (r9 == r3) goto L4f
            if (r9 == r0) goto L56
            java.lang.String r3 = "replaceAttributes"
            r5[r4] = r3
            goto L56
        L4f:
            r5[r4] = r7
            goto L56
        L52:
            java.lang.String r3 = "replaceDelegate"
            r5[r4] = r3
        L56:
            java.lang.String r2 = java.lang.String.format(r2, r5)
            if (r9 == r1) goto L64
            if (r9 == r0) goto L64
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r2)
            goto L69
        L64:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r2)
        L69:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: se.t0.K(int):void");
    }

    @Override // se.m, se.w0
    public final w0 B(te.f fVar) {
        if (fVar != null) {
            return this;
        }
        K(3);
        throw null;
    }

    @Override // se.a0, se.w0
    public final /* bridge */ /* synthetic */ w0 C(h0 h0Var) {
        C(h0Var);
        throw null;
    }

    @Override // se.a0
    /* JADX INFO: renamed from: D */
    public final a0 z(boolean z10) {
        throw new IllegalStateException(this.f19990b);
    }

    @Override // se.a0
    /* JADX INFO: renamed from: F */
    public final a0 C(h0 h0Var) {
        if (h0Var != null) {
            throw new IllegalStateException(this.f19990b);
        }
        K(0);
        throw null;
    }

    @Override // se.m
    public final a0 G() {
        throw new IllegalStateException(this.f19990b);
    }

    @Override // se.m
    /* JADX INFO: renamed from: H */
    public final a0 B(te.f fVar) {
        if (fVar != null) {
            return this;
        }
        K(3);
        throw null;
    }

    @Override // se.m
    public final m J(a0 a0Var) {
        throw new IllegalStateException(this.f19990b);
    }

    @Override // se.a0
    public final String toString() {
        String str = this.f19990b;
        if (str != null) {
            return str;
        }
        K(1);
        throw null;
    }

    @Override // se.m, se.w
    public final w v(te.f fVar) {
        if (fVar != null) {
            return this;
        }
        K(3);
        throw null;
    }

    @Override // se.a0, se.w0
    public final /* bridge */ /* synthetic */ w0 z(boolean z10) {
        z(z10);
        throw null;
    }
}
