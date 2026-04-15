package u;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i7.k f21015a = new i7.k(3, null, 3);

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e A[LOOP:0: B:19:0x004c->B:20:0x004e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003c -> B:18:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(c2.i0 r7, ac.a r8) {
        /*
            boolean r0 = r8 instanceof u.g2
            if (r0 == 0) goto L13
            r0 = r8
            u.g2 r0 = (u.g2) r0
            int r1 = r0.f20920f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20920f = r1
            goto L18
        L13:
            u.g2 r0 = new u.g2
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f20919e
            int r1 = r0.f20920f
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            c2.i0 r7 = r0.f20918d
            ub.a.f(r8)
            goto L3f
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            ub.a.f(r8)
        L32:
            r0.f20918d = r7
            r0.f20920f = r2
            java.lang.Object r8 = a0.c.y(r7, r0)
            zb.a r1 = zb.a.f26667a
            if (r8 != r1) goto L3f
            return r1
        L3f:
            c2.l r8 = (c2.l) r8
            java.lang.Object r1 = r8.f3309a
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            r4 = 0
            r5 = 0
        L4c:
            if (r5 >= r3) goto L5a
            java.lang.Object r6 = r1.get(r5)
            c2.t r6 = (c2.t) r6
            r6.a()
            int r5 = r5 + 1
            goto L4c
        L5a:
            java.lang.Object r8 = r8.f3309a
            r1 = r8
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
        L63:
            if (r4 >= r1) goto L73
            java.lang.Object r3 = r8.get(r4)
            c2.t r3 = (c2.t) r3
            boolean r3 = r3.f3325d
            if (r3 == 0) goto L70
            goto L32
        L70:
            int r4 = r4 + 1
            goto L63
        L73:
            ub.a0 r7 = ub.a0.f21526a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u.n2.a(c2.i0, ac.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(c2.i0 r5, boolean r6, c2.m r7, yb.c r8) {
        /*
            boolean r0 = r8 instanceof u.d2
            if (r0 == 0) goto L13
            r0 = r8
            u.d2 r0 = (u.d2) r0
            int r1 = r0.f20878h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20878h = r1
            goto L18
        L13:
            u.d2 r0 = new u.d2
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f20877g
            int r1 = r0.f20878h
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            boolean r5 = r0.f20876f
            c2.m r6 = r0.f20875e
            c2.i0 r7 = r0.f20874d
            ub.a.f(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            ub.a.f(r8)
        L3a:
            r0.f20874d = r5
            r0.f20875e = r7
            r0.f20876f = r6
            r0.f20878h = r2
            java.lang.Object r8 = r5.b(r7, r0)
            zb.a r1 = zb.a.f26667a
            if (r8 != r1) goto L4b
            return r1
        L4b:
            c2.l r8 = (c2.l) r8
            r1 = 0
            boolean r3 = g(r8, r6, r1)
            if (r3 == 0) goto L3a
            java.lang.Object r5 = r8.f3309a
            java.lang.Object r5 = r5.get(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u.n2.b(c2.i0, boolean, c2.m, yb.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0043 -> B:18:0x0046). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(c2.i0 r5, c2.m r6, ac.a r7) {
        /*
            boolean r0 = r7 instanceof u.e2
            if (r0 == 0) goto L13
            r0 = r7
            u.e2 r0 = (u.e2) r0
            int r1 = r0.f20888g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20888g = r1
            goto L18
        L13:
            u.e2 r0 = new u.e2
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f20887f
            int r1 = r0.f20888g
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            c2.m r5 = r0.f20886e
            c2.i0 r6 = r0.f20885d
            ub.a.f(r7)
            r4 = r6
            r6 = r5
            r5 = r4
            goto L46
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            ub.a.f(r7)
        L37:
            r0.f20885d = r5
            r0.f20886e = r6
            r0.f20888g = r2
            java.lang.Object r7 = r5.b(r6, r0)
            zb.a r1 = zb.a.f26667a
            if (r7 != r1) goto L46
            return r1
        L46:
            c2.l r7 = (c2.l) r7
            r1 = 0
            boolean r3 = g(r7, r1, r2)
            if (r3 == 0) goto L37
            java.lang.Object r5 = r7.f3309a
            java.lang.Object r5 = r5.get(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u.n2.d(c2.i0, c2.m, ac.a):java.lang.Object");
    }

    public static final Object e(c2.x xVar, ic.k kVar, ic.k kVar2, ic.o oVar, ic.k kVar3, yb.c cVar) {
        Object objK = hf.a0.k(new cg.g(xVar, oVar, kVar2, kVar, kVar3, null, 5), cVar);
        return objK == zb.a.f26667a ? objK : ub.a0.f21526a;
    }

    public static /* synthetic */ Object f(c2.x xVar, ic.k kVar, ic.k kVar2, ic.o oVar, ic.k kVar3, yb.c cVar, int i10) {
        if ((i10 & 1) != 0) {
            kVar = null;
        }
        if ((i10 & 2) != 0) {
            kVar2 = null;
        }
        if ((i10 & 4) != 0) {
            oVar = f21015a;
        }
        if ((i10 & 8) != 0) {
            kVar3 = null;
        }
        return e(xVar, kVar, kVar2, oVar, kVar3, cVar);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.List] */
    public static final boolean g(c2.l lVar, boolean z10, boolean z11) {
        if (z11) {
            ?? r72 = lVar.f3309a;
            int size = ((Collection) r72).size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    if (((c2.t) r72.get(i10)).f3330i != 2) {
                        break;
                    }
                    i10++;
                } else if ((lVar.f3312d & 33) == 0) {
                    return false;
                }
            }
        }
        ?? r52 = lVar.f3309a;
        int size2 = ((Collection) r52).size();
        int i11 = 0;
        while (true) {
            boolean zA = true;
            if (i11 >= size2) {
                return true;
            }
            c2.t tVar = (c2.t) r52.get(i11);
            if (!z10) {
                zA = c2.s.a(tVar);
            } else if (tVar.b() || tVar.f3329h || !tVar.f3325d) {
                zA = false;
            }
            if (!zA) {
                return false;
            }
            i11++;
        }
    }

    public static hf.r1 h(hf.y yVar, hf.d1 d1Var, ic.n nVar) {
        return hf.a0.y(yVar, null, hf.z.f8619d, new q.q(d1Var, nVar, null), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(c2.i0 r7, c2.m r8, ac.a r9) {
        /*
            boolean r0 = r9 instanceof u.l2
            if (r0 == 0) goto L13
            r0 = r9
            u.l2 r0 = (u.l2) r0
            int r1 = r0.f21001f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21001f = r1
            goto L18
        L13:
            u.l2 r0 = new u.l2
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f21000e
            int r1 = r0.f21001f
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            jc.y r7 = r0.f20999d
            ub.a.f(r9)     // Catch: c2.n -> L5b
            goto L58
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            ub.a.f(r9)
            jc.y r9 = new jc.y
            r9.<init>()
            u.u0 r1 = u.u0.f21100a
            r9.f10838a = r1
            j2.z2 r1 = r7.d()     // Catch: c2.n -> L5b
            long r3 = r1.b()     // Catch: c2.n -> L5b
            h0.x0 r1 = new h0.x0     // Catch: c2.n -> L5b
            r5 = 0
            r6 = 4
            r1.<init>(r8, r9, r5, r6)     // Catch: c2.n -> L5b
            r0.f20999d = r9     // Catch: c2.n -> L5b
            r0.f21001f = r2     // Catch: c2.n -> L5b
            java.lang.Object r7 = r7.f(r3, r1, r0)     // Catch: c2.n -> L5b
            zb.a r8 = zb.a.f26667a
            if (r7 != r8) goto L57
            return r8
        L57:
            r7 = r9
        L58:
            java.lang.Object r7 = r7.f10838a
            return r7
        L5b:
            u.w0 r7 = u.w0.f21116a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u.n2.i(c2.i0, c2.m, ac.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a4, code lost:
    
        if (r15 == r5) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00a4 -> B:13:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(c2.i0 r13, c2.m r14, ac.a r15) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u.n2.j(c2.i0, c2.m, ac.a):java.lang.Object");
    }
}
