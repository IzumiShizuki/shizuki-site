package u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b2 extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f20825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f20826f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ long f20827g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c2 f20828h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(c2 c2Var, yb.c cVar) {
        super(2, cVar);
        this.f20828h = c2Var;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        b2 b2Var = new b2(this.f20828h, cVar);
        b2Var.f20827g = ((f3.q) obj).f6675a;
        return b2Var;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        long j10 = ((f3.q) obj).f6675a;
        b2 b2Var = new b2(this.f20828h, (yb.c) obj2);
        b2Var.f20827g = j10;
        return b2Var.u(ub.a0.f21526a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    @Override // ac.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.f20826f
            r1 = 3
            r2 = 2
            r3 = 1
            u.c2 r4 = r14.f20828h
            zb.a r5 = zb.a.f26667a
            if (r0 == 0) goto L2f
            if (r0 == r3) goto L29
            if (r0 == r2) goto L21
            if (r0 != r1) goto L19
            long r0 = r14.f20825e
            long r2 = r14.f20827g
            ub.a.f(r15)
            goto L71
        L19:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L21:
            long r2 = r14.f20825e
            long r6 = r14.f20827g
            ub.a.f(r15)
            goto L57
        L29:
            long r6 = r14.f20827g
            ub.a.f(r15)
            goto L41
        L2f:
            ub.a.f(r15)
            long r6 = r14.f20827g
            b2.d r15 = r4.f20849f
            r14.f20827g = r6
            r14.f20826f = r3
            java.lang.Object r15 = r15.b(r6, r14)
            if (r15 != r5) goto L41
            goto L6e
        L41:
            f3.q r15 = (f3.q) r15
            long r8 = r15.f6675a
            long r8 = f3.q.d(r6, r8)
            r14.f20827g = r6
            r14.f20825e = r8
            r14.f20826f = r2
            java.lang.Object r15 = r4.b(r8, r14)
            if (r15 != r5) goto L56
            goto L6e
        L56:
            r2 = r8
        L57:
            f3.q r15 = (f3.q) r15
            long r11 = r15.f6675a
            b2.d r8 = r4.f20849f
            long r9 = f3.q.d(r2, r11)
            r14.f20827g = r6
            r14.f20825e = r11
            r14.f20826f = r1
            r13 = r14
            java.lang.Object r15 = r8.a(r9, r11, r13)
            if (r15 != r5) goto L6f
        L6e:
            return r5
        L6f:
            r2 = r6
            r0 = r11
        L71:
            f3.q r15 = (f3.q) r15
            long r4 = r15.f6675a
            long r0 = f3.q.d(r0, r4)
            long r0 = f3.q.d(r2, r0)
            f3.q r15 = new f3.q
            r15.<init>(r0)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: u.b2.u(java.lang.Object):java.lang.Object");
    }
}
