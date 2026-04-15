package o;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends ac.h implements ic.n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d1.c f16012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n0 f16013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long[] f16014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16015f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f16016g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f16017h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16018i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f16019j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f16020k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f16021l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n0 f16022m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ d1.c f16023n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(n0 n0Var, d1.c cVar, yb.c cVar2) {
        super(2, cVar2);
        this.f16022m = n0Var;
        this.f16023n = cVar;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        m0 m0Var = new m0(this.f16022m, this.f16023n, cVar);
        m0Var.f16021l = obj;
        return m0Var;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        return ((m0) o((df.l) obj, (yb.c) obj2)).u(ub.a0.f21526a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0050 -> B:22:0x00a0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0052 -> B:14:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006e -> B:19:0x0095). Please report as a decompilation issue!!! */
    @Override // ac.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            int r1 = r0.f16020k
            r2 = 0
            r3 = 8
            r4 = 1
            if (r1 == 0) goto L2d
            if (r1 != r4) goto L25
            int r1 = r0.f16018i
            int r5 = r0.f16017h
            long r6 = r0.f16019j
            int r8 = r0.f16016g
            int r9 = r0.f16015f
            long[] r10 = r0.f16014e
            o.n0 r11 = r0.f16013d
            d1.c r12 = r0.f16012c
            java.lang.Object r13 = r0.f16021l
            df.l r13 = (df.l) r13
            ub.a.f(r22)
            goto L95
        L25:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2d:
            ub.a.f(r22)
            java.lang.Object r1 = r0.f16021l
            df.l r1 = (df.l) r1
            o.n0 r5 = r0.f16022m
            o.l0 r6 = r5.f16026b
            long[] r6 = r6.f16002a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto La5
            d1.c r8 = r0.f16023n
            r9 = 0
        L42:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 == 0) goto La0
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r1
            r1 = 0
            r19 = r10
            r11 = r5
            r10 = r6
            r5 = r12
            r12 = r8
            r8 = r9
            r9 = r7
            r6 = r19
        L65:
            if (r1 >= r5) goto L98
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r6
            r16 = 128(0x80, double:6.3E-322)
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 >= 0) goto L95
            int r2 = r8 << 3
            int r2 = r2 + r1
            r12.f5444c = r2
            o.l0 r3 = r11.f16026b
            java.lang.Object[] r3 = r3.f16003b
            r2 = r3[r2]
            r0.f16021l = r13
            r0.f16012c = r12
            r0.f16013d = r11
            r0.f16014e = r10
            r0.f16015f = r9
            r0.f16016g = r8
            r0.f16019j = r6
            r0.f16017h = r5
            r0.f16018i = r1
            r0.f16020k = r4
            r13.b(r2, r0)
            zb.a r1 = zb.a.f26667a
            return r1
        L95:
            long r6 = r6 >> r3
            int r1 = r1 + r4
            goto L65
        L98:
            if (r5 != r3) goto La5
            r7 = r9
            r6 = r10
            r5 = r11
            r1 = r13
            r9 = r8
            r8 = r12
        La0:
            if (r9 == r7) goto La5
            int r9 = r9 + 1
            goto L42
        La5:
            ub.a0 r1 = ub.a0.f21526a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.m0.u(java.lang.Object):java.lang.Object");
    }
}
