package h1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j extends ac.h implements ic.n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f8022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8025f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f8026g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k f8027h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, yb.c cVar) {
        super(2, cVar);
        this.f8027h = kVar;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        j jVar = new j(this.f8027h, cVar);
        jVar.f8026g = obj;
        return jVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        return ((j) o((df.l) obj, (yb.c) obj2)).u(ub.a0.f21526a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0080 -> B:27:0x0095). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00bd -> B:8:0x0029). Please report as a decompilation issue!!! */
    @Override // ac.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            h1.k r1 = r0.f8027h
            long r2 = r1.f8035a
            long r4 = r1.f8037c
            long r6 = r1.f8036b
            int r8 = r0.f8025f
            r9 = 0
            r12 = 3
            r13 = 2
            r14 = 64
            r16 = 0
            r18 = 1
            r10 = 1
            zb.a r11 = zb.a.f26667a
            if (r8 == 0) goto L4d
            if (r8 == r10) goto L3e
            if (r8 == r13) goto L34
            if (r8 != r12) goto L2c
            int r1 = r0.f8023d
            java.lang.Object r6 = r0.f8026g
            df.l r6 = (df.l) r6
            ub.a.f(r23)
        L29:
            r7 = 3
            goto Lc0
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L34:
            int r1 = r0.f8023d
            java.lang.Object r8 = r0.f8026g
            df.l r8 = (df.l) r8
            ub.a.f(r23)
            goto L95
        L3e:
            int r1 = r0.f8024e
            int r8 = r0.f8023d
            long[] r15 = r0.f8022c
            java.lang.Object r12 = r0.f8026g
            df.l r12 = (df.l) r12
            ub.a.f(r23)
            int r8 = r8 + r10
            goto L5b
        L4d:
            ub.a.f(r23)
            java.lang.Object r8 = r0.f8026g
            r12 = r8
            df.l r12 = (df.l) r12
            long[] r15 = r1.f8038d
            if (r15 == 0) goto L72
            int r1 = r15.length
            r8 = 0
        L5b:
            if (r8 >= r1) goto L72
            r2 = r15[r8]
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r2)
            r0.f8026g = r12
            r0.f8022c = r15
            r0.f8023d = r8
            r0.f8024e = r1
            r0.f8025f = r10
            r12.b(r4, r0)
            return r11
        L72:
            int r1 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r1 == 0) goto L98
            r8 = r12
            r1 = 0
        L78:
            if (r1 >= r14) goto L97
            long r20 = r18 << r1
            long r20 = r6 & r20
            int r12 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r12 == 0) goto L95
            long r2 = (long) r1
            long r4 = r4 + r2
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r4)
            r0.f8026g = r8
            r0.f8022c = r9
            r0.f8023d = r1
            r0.f8025f = r13
            r8.b(r2, r0)
            return r11
        L95:
            int r1 = r1 + r10
            goto L78
        L97:
            r12 = r8
        L98:
            int r1 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r1 == 0) goto Lc3
            r6 = r12
            r15 = 0
        L9e:
            if (r15 >= r14) goto Lc3
            long r7 = r18 << r15
            long r7 = r7 & r2
            int r1 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r1 == 0) goto Lbd
            long r1 = (long) r15
            long r4 = r4 + r1
            long r1 = (long) r14
            long r4 = r4 + r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r4)
            r0.f8026g = r6
            r0.f8022c = r9
            r0.f8023d = r15
            r7 = 3
            r0.f8025f = r7
            r6.b(r1, r0)
            return r11
        Lbd:
            r1 = r15
            goto L29
        Lc0:
            int r15 = r1 + 1
            goto L9e
        Lc3:
            ub.a0 r1 = ub.a0.f21526a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.j.u(java.lang.Object):java.lang.Object");
    }
}
