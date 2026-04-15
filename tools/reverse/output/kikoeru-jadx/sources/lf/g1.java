package lf;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g1 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f12407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0.x f12408b;

    public g1(o0 o0Var, b0.x xVar) {
        this.f12407a = o0Var;
        this.f12408b = xVar;
    }

    @Override // lf.l0
    public final List a() {
        return this.f12407a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // lf.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(lf.g r5, yb.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof lf.f1
            if (r0 == 0) goto L13
            r0 = r6
            lf.f1 r0 = (lf.f1) r0
            int r1 = r0.f12403f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12403f = r1
            goto L18
        L13:
            lf.f1 r0 = new lf.f1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f12401d
            int r1 = r0.f12403f
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 == r2) goto L29
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L29:
            ub.a.f(r6)
            ce.j0 r5 = new ce.j0
            r5.<init>()
            throw r5
        L32:
            ub.a.f(r6)
            lf.e1 r6 = new lf.e1
            b0.x r1 = r4.f12408b
            r6.<init>(r5, r1)
            r0.f12403f = r2
            lf.o0 r5 = r4.f12407a
            r5.b(r6, r0)
            zb.a r5 = zb.a.f26667a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.g1.b(lf.g, yb.c):java.lang.Object");
    }
}
