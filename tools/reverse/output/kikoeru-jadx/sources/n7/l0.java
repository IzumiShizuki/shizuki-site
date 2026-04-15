package n7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n[] f15530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m0 f15531f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a0 f15532g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15533h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15534i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f15535j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15536k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n[] f15537l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m0 f15538m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ a0 f15539n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(n[] nVarArr, m0 m0Var, a0 a0Var, yb.c cVar) {
        super(2, cVar);
        this.f15537l = nVarArr;
        this.f15538m = m0Var;
        this.f15539n = a0Var;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        return new l0(this.f15537l, this.f15538m, this.f15539n, cVar);
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        return ((l0) o((p7.l) obj, (yb.c) obj2)).u(ub.a0.f21526a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        if (n7.m0.b(r6, r5, r11, r10) == r9) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
    
        r4 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0075 -> B:27:0x0076). Please report as a decompilation issue!!! */
    @Override // ac.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.f15536k
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L22
            if (r0 == r2) goto La
            if (r0 != r1) goto L1a
        La:
            int r0 = r10.f15535j
            int r3 = r10.f15534i
            int r4 = r10.f15533h
            n7.a0 r5 = r10.f15532g
            n7.m0 r6 = r10.f15531f
            n7.n[] r7 = r10.f15530e
            ub.a.f(r11)
            goto L58
        L1a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L22:
            ub.a.f(r11)
            n7.n[] r11 = r10.f15537l
            int r0 = r11.length
            r3 = 0
            n7.m0 r4 = r10.f15538m
            n7.a0 r5 = r10.f15539n
            r7 = r11
            r6 = r4
            r11 = 0
        L30:
            if (r3 >= r0) goto L78
            r4 = r7[r3]
            int r8 = r11 + 1
            int r4 = r4.ordinal()
            if (r4 == 0) goto L75
            zb.a r9 = zb.a.f26667a
            if (r4 == r2) goto L60
            if (r4 != r1) goto L5a
            r10.f15530e = r7
            r10.f15531f = r6
            r10.f15532g = r5
            r10.f15533h = r8
            r10.f15534i = r3
            r10.f15535j = r0
            r10.f15536k = r1
            java.lang.Object r11 = n7.m0.c(r6, r5, r11, r10)
            if (r11 != r9) goto L57
            goto L74
        L57:
            r4 = r8
        L58:
            r11 = r4
            goto L76
        L5a:
            ce.j0 r11 = new ce.j0
            r11.<init>()
            throw r11
        L60:
            r10.f15530e = r7
            r10.f15531f = r6
            r10.f15532g = r5
            r10.f15533h = r8
            r10.f15534i = r3
            r10.f15535j = r0
            r10.f15536k = r2
            java.lang.Object r11 = n7.m0.b(r6, r5, r11, r10)
            if (r11 != r9) goto L57
        L74:
            return r9
        L75:
            r11 = r8
        L76:
            int r3 = r3 + r2
            goto L30
        L78:
            ub.a0 r11 = ub.a0.f21526a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.l0.u(java.lang.Object):java.lang.Object");
    }
}
