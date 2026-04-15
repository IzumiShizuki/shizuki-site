package q7;

import ac.i;
import ic.k;
import ic.n;
import n7.a0;
import n7.z;
import p7.s;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d implements a0, s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f17899a;

    public d(a aVar) {
        this.f17899a = aVar;
    }

    @Override // n7.q
    public final Object a(String str, k kVar, ac.c cVar) {
        g gVarD0 = this.f17899a.d0(str);
        try {
            Object objA = kVar.a(gVarD0);
            gh.g.m(gVarD0, null);
            return objA;
        } finally {
        }
    }

    @Override // n7.a0
    public final Object b(i iVar) {
        return Boolean.valueOf(this.f17899a.f17892a.T());
    }

    @Override // p7.s
    public final z7.a c() {
        return this.f17899a;
    }

    @Override // n7.a0
    public final Object d(z zVar, n nVar, i iVar) {
        return e(zVar, nVar, iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(n7.z r5, ic.n r6, ac.c r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof q7.c
            if (r0 == 0) goto L13
            r0 = r7
            q7.c r0 = (q7.c) r0
            int r1 = r0.f17898h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17898h = r1
            goto L18
        L13:
            q7.c r0 = new q7.c
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f17896f
            int r1 = r0.f17898h
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            a8.a r5 = r0.f17895e
            q7.d r6 = r0.f17894d
            ub.a.f(r7)     // Catch: java.lang.Throwable -> L29
            goto L72
        L29:
            r7 = move-exception
            goto L87
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            ub.a.f(r7)
            q7.a r7 = r4.f17899a
            a8.a r7 = r7.f17892a
            r7.T()
            int r5 = r5.ordinal()
            if (r5 == 0) goto L56
            if (r5 == r2) goto L52
            r1 = 2
            if (r5 != r1) goto L4c
            r7.h()
            goto L59
        L4c:
            ce.j0 r5 = new ce.j0
            r5.<init>()
            throw r5
        L52:
            r7.C()
            goto L59
        L56:
            r7.r()
        L59:
            p7.l r5 = new p7.l     // Catch: java.lang.Throwable -> L82
            r1 = 1
            r5.<init>(r1, r4)     // Catch: java.lang.Throwable -> L82
            r0.f17894d = r4     // Catch: java.lang.Throwable -> L82
            r0.f17895e = r7     // Catch: java.lang.Throwable -> L82
            r0.f17898h = r2     // Catch: java.lang.Throwable -> L82
            java.lang.Object r5 = r6.q(r5, r0)     // Catch: java.lang.Throwable -> L82
            zb.a r6 = zb.a.f26667a
            if (r5 != r6) goto L6e
            return r6
        L6e:
            r6 = r7
            r7 = r5
            r5 = r6
            r6 = r4
        L72:
            r5.A()     // Catch: java.lang.Throwable -> L29
            r5.I()
            boolean r5 = r5.T()
            if (r5 != 0) goto L81
            r6.getClass()
        L81:
            return r7
        L82:
            r5 = move-exception
            r6 = r7
            r7 = r5
            r5 = r6
            r6 = r4
        L87:
            r5.I()
            boolean r5 = r5.T()
            if (r5 != 0) goto L93
            r6.getClass()
        L93:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.d.e(n7.z, ic.n, ac.c):java.lang.Object");
    }
}
