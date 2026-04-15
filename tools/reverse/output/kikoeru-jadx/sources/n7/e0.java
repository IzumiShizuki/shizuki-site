package n7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements lf.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jc.y f15473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lf.g f15475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String[] f15476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int[] f15477e;

    public e0(jc.y yVar, boolean z10, lf.g gVar, String[] strArr, int[] iArr) {
        this.f15473a = yVar;
        this.f15474b = z10;
        this.f15475c = gVar;
        this.f15476d = strArr;
        this.f15477e = iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r5.n(r15, r0) == r6) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009a, code lost:
    
        if (r5.n(r15, r0) == r6) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009c, code lost:
    
        return r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // lf.g
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(int[] r14, yb.c r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof n7.d0
            if (r0 == 0) goto L13
            r0 = r15
            n7.d0 r0 = (n7.d0) r0
            int r1 = r0.f15458h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15458h = r1
            goto L18
        L13:
            n7.d0 r0 = new n7.d0
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.f15456f
            int r1 = r0.f15458h
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 == r3) goto L2d
            if (r1 != r2) goto L25
            goto L2d
        L25:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L2d:
            int[] r14 = r0.f15455e
            n7.e0 r0 = r0.f15454d
            ub.a.f(r15)
            goto L9e
        L35:
            ub.a.f(r15)
            jc.y r15 = r13.f15473a
            java.lang.Object r1 = r15.f10838a
            java.lang.String[] r4 = r13.f15476d
            lf.g r5 = r13.f15475c
            zb.a r6 = zb.a.f26667a
            if (r1 != 0) goto L59
            boolean r15 = r13.f15474b
            if (r15 == 0) goto L9d
            java.util.Set r15 = vb.l.N0(r4)
            r0.f15454d = r13
            r0.f15455e = r14
            r0.f15458h = r3
            java.lang.Object r15 = r5.n(r15, r0)
            if (r15 != r6) goto L9d
            goto L9c
        L59:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r3 = r4.length
            r7 = 0
            r8 = 0
        L61:
            if (r7 >= r3) goto L86
            r9 = r4[r7]
            int r10 = r8 + 1
            java.lang.Object r11 = r15.f10838a
            if (r11 == 0) goto L7e
            int[] r11 = (int[]) r11
            int[] r12 = r13.f15477e
            r8 = r12[r8]
            r11 = r11[r8]
            r8 = r14[r8]
            if (r11 == r8) goto L7a
            r1.add(r9)
        L7a:
            int r7 = r7 + 1
            r8 = r10
            goto L61
        L7e:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "Required value was null."
            r14.<init>(r15)
            throw r14
        L86:
            boolean r15 = r1.isEmpty()
            if (r15 != 0) goto L9d
            java.util.Set r15 = vb.m.K0(r1)
            r0.f15454d = r13
            r0.f15455e = r14
            r0.f15458h = r2
            java.lang.Object r15 = r5.n(r15, r0)
            if (r15 != r6) goto L9d
        L9c:
            return r6
        L9d:
            r0 = r13
        L9e:
            jc.y r15 = r0.f15473a
            r15.f10838a = r14
            ub.a0 r14 = ub.a0.f21526a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.e0.n(int[], yb.c):java.lang.Object");
    }
}
