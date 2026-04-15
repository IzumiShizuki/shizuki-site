package l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends ac.h implements ic.n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f11486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ic.k f11487f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(int i10, ic.k kVar, yb.c cVar) {
        super(2, cVar);
        this.f11484c = i10;
        this.f11487f = kVar;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f11484c) {
            case 0:
                g0 g0Var = new g0(0, this.f11487f, cVar);
                g0Var.f11486e = obj;
                return g0Var;
            default:
                g0 g0Var2 = new g0(1, this.f11487f, cVar);
                g0Var2.f11486e = obj;
                return g0Var2;
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        c2.i0 i0Var = (c2.i0) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f11484c) {
            case 0:
                ((g0) o(i0Var, cVar)).u(ub.a0.f21526a);
                return zb.a.f26667a;
            default:
                return ((g0) o(i0Var, cVar)).u(ub.a0.f21526a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008e A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x008c -> B:33:0x008f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // ac.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f11484c
            switch(r0) {
                case 0: goto L61;
                default: goto L5;
            }
        L5:
            int r0 = r6.f11485d
            r1 = 2
            r2 = 1
            zb.a r3 = zb.a.f26667a
            if (r0 == 0) goto L25
            if (r0 == r2) goto L1d
            if (r0 != r1) goto L15
            ub.a.f(r7)
            goto L57
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            java.lang.Object r0 = r6.f11486e
            c2.i0 r0 = (c2.i0) r0
            ub.a.f(r7)
            goto L38
        L25:
            ub.a.f(r7)
            java.lang.Object r7 = r6.f11486e
            r0 = r7
            c2.i0 r0 = (c2.i0) r0
            r6.f11486e = r0
            r6.f11485d = r2
            java.lang.Object r7 = nd.h.c(r0, r6)
            if (r7 != r3) goto L38
            goto L60
        L38:
            c2.t r7 = (c2.t) r7
            r7.a()
            long r4 = r7.f3324c
            p1.b r7 = new p1.b
            r7.<init>(r4)
            ic.k r2 = r6.f11487f
            r2.a(r7)
            r7 = 0
            r6.f11486e = r7
            r6.f11485d = r1
            c2.m r7 = c2.m.f3315b
            java.lang.Object r7 = u.n2.j(r0, r7, r6)
            if (r7 != r3) goto L57
            goto L60
        L57:
            c2.t r7 = (c2.t) r7
            if (r7 == 0) goto L5e
            r7.a()
        L5e:
            ub.a0 r3 = ub.a0.f21526a
        L60:
            return r3
        L61:
            int r0 = r6.f11485d
            r1 = 1
            if (r0 == 0) goto L78
            if (r0 != r1) goto L70
            java.lang.Object r0 = r6.f11486e
            c2.i0 r0 = (c2.i0) r0
            ub.a.f(r7)
            goto L8f
        L70:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L78:
            ub.a.f(r7)
            java.lang.Object r7 = r6.f11486e
            c2.i0 r7 = (c2.i0) r7
            r0 = r7
        L80:
            r6.f11486e = r0
            r6.f11485d = r1
            c2.m r7 = c2.m.f3314a
            java.lang.Object r7 = r0.b(r7, r6)
            zb.a r2 = zb.a.f26667a
            if (r7 != r2) goto L8f
            return r2
        L8f:
            c2.l r7 = (c2.l) r7
            boolean r7 = l0.u0.v(r7)
            r7 = r7 ^ r1
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            ic.k r2 = r6.f11487f
            r2.a(r7)
            goto L80
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.g0.u(java.lang.Object):java.lang.Object");
    }
}
