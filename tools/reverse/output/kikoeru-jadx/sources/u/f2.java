package u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f2 extends ac.h implements ic.n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f20896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f20898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c2.t f20899f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(c2.t tVar, yb.c cVar) {
        super(2, cVar);
        this.f20899f = tVar;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        f2 f2Var = new f2(this.f20899f, cVar);
        f2Var.f20898e = obj;
        return f2Var;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        return ((f2) o((c2.i0) obj, (yb.c) obj2)).u(ub.a0.f21526a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003d -> B:12:0x0040). Please report as a decompilation issue!!! */
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
    public final java.lang.Object u(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f20897d
            r1 = 1
            if (r0 == 0) goto L19
            if (r0 != r1) goto L11
            long r2 = r7.f20896c
            java.lang.Object r0 = r7.f20898e
            c2.i0 r0 = (c2.i0) r0
            ub.a.f(r8)
            goto L40
        L11:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L19:
            ub.a.f(r8)
            java.lang.Object r8 = r7.f20898e
            c2.i0 r8 = (c2.i0) r8
            c2.t r0 = r7.f20899f
            long r2 = r0.f3323b
            j2.z2 r0 = r8.d()
            r0.getClass()
            r4 = 40
            long r4 = r4 + r2
            r0 = r8
            r2 = r4
        L30:
            r7.f20898e = r0
            r7.f20896c = r2
            r7.f20897d = r1
            r8 = 3
            java.lang.Object r8 = u.n2.c(r0, r7, r8)
            zb.a r4 = zb.a.f26667a
            if (r8 != r4) goto L40
            return r4
        L40:
            c2.t r8 = (c2.t) r8
            long r4 = r8.f3323b
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 < 0) goto L30
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: u.f2.u(java.lang.Object):java.lang.Object");
    }
}
