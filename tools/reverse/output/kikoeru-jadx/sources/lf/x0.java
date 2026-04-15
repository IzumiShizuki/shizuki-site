package lf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends ac.i implements ic.o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ g f12521f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ int f12522g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y0 f12523h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(y0 y0Var, yb.c cVar) {
        super(3, cVar);
        this.f12523h = y0Var;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        x0 x0Var = new x0(this.f12523h, (yb.c) obj3);
        x0Var.f12521f = (g) obj;
        x0Var.f12522g = iIntValue;
        return x0Var.u(ub.a0.f21526a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (r0.n(lf.r0.f12484a, r9) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        if (r0.n(lf.r0.f12486c, r9) != r6) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064 A[PHI: r0
      0x0064: PHI (r0v3 lf.g) = (r0v2 lf.g), (r0v6 lf.g) binds: [B:25:0x0061, B:13:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074 A[PHI: r0
      0x0074: PHI (r0v4 lf.g) = (r0v3 lf.g), (r0v7 lf.g) binds: [B:28:0x0071, B:12:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // ac.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.f12520e
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            zb.a r6 = zb.a.f26667a
            if (r0 == 0) goto L34
            if (r0 == r5) goto L30
            if (r0 == r4) goto L2a
            if (r0 == r3) goto L24
            if (r0 == r2) goto L1e
            if (r0 != r1) goto L16
            goto L30
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1e:
            lf.g r0 = r9.f12521f
            ub.a.f(r10)
            goto L74
        L24:
            lf.g r0 = r9.f12521f
            ub.a.f(r10)
            goto L64
        L2a:
            lf.g r0 = r9.f12521f
            ub.a.f(r10)
            goto L57
        L30:
            ub.a.f(r10)
            goto L82
        L34:
            ub.a.f(r10)
            lf.g r0 = r9.f12521f
            int r10 = r9.f12522g
            if (r10 <= 0) goto L48
            r9.f12520e = r5
            lf.r0 r10 = lf.r0.f12484a
            java.lang.Object r10 = r0.n(r10, r9)
            if (r10 != r6) goto L82
            goto L81
        L48:
            lf.y0 r10 = r9.f12523h
            long r7 = r10.f12528a
            r9.f12521f = r0
            r9.f12520e = r4
            java.lang.Object r10 = hf.a0.l(r7, r9)
            if (r10 != r6) goto L57
            goto L81
        L57:
            r9.f12521f = r0
            r9.f12520e = r3
            lf.r0 r10 = lf.r0.f12485b
            java.lang.Object r10 = r0.n(r10, r9)
            if (r10 != r6) goto L64
            goto L81
        L64:
            r9.f12521f = r0
            r9.f12520e = r2
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r10 = hf.a0.l(r2, r9)
            if (r10 != r6) goto L74
            goto L81
        L74:
            r10 = 0
            r9.f12521f = r10
            r9.f12520e = r1
            lf.r0 r10 = lf.r0.f12486c
            java.lang.Object r10 = r0.n(r10, r9)
            if (r10 != r6) goto L82
        L81:
            return r6
        L82:
            ub.a0 r10 = ub.a0.f21526a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.x0.u(java.lang.Object):java.lang.Object");
    }
}
