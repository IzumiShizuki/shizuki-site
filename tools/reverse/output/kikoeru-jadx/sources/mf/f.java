package mf;

import lf.w0;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class f extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lf.f f15138d;

    public f(int i10, kf.a aVar, lf.f fVar, yb.h hVar) {
        super(hVar, i10, aVar);
        this.f15138d = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    @Override // mf.e, lf.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(lf.g r6, yb.c r7) {
        /*
            r5 = this;
            int r0 = r5.f15136b
            r1 = -3
            zb.a r2 = zb.a.f26667a
            if (r0 != r1) goto L6e
            yb.h r0 = r7.s()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            fa.a r3 = new fa.a
            r4 = 22
            r3.<init>(r4)
            yb.h r4 = r5.f15135a
            java.lang.Object r1 = r4.y(r3, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L27
            yb.h r1 = r0.G(r4)
            goto L2c
        L27:
            r1 = 0
            yb.h r1 = hf.a0.n(r0, r4, r1)
        L2c:
            boolean r3 = jc.l.a(r1, r0)
            if (r3 == 0) goto L39
            java.lang.Object r6 = r5.k(r6, r7)
            if (r6 != r2) goto L75
            return r6
        L39:
            yb.d r3 = yb.d.f26087a
            yb.f r4 = r1.R(r3)
            yb.f r0 = r0.R(r3)
            boolean r0 = jc.l.a(r4, r0)
            if (r0 == 0) goto L6e
            yb.h r0 = r7.s()
            boolean r3 = r6 instanceof mf.s
            if (r3 != 0) goto L5c
            boolean r3 = r6 instanceof mf.o
            if (r3 == 0) goto L56
            goto L5c
        L56:
            f7.v r3 = new f7.v
            r3.<init>(r6, r0)
            r6 = r3
        L5c:
            lf.w0 r0 = new lf.w0
            r3 = 0
            r4 = 7
            r0.<init>(r4, r5, r3)
            java.lang.Object r3 = nf.b.m(r1)
            java.lang.Object r6 = mf.c.a(r1, r6, r3, r0, r7)
            if (r6 != r2) goto L75
            return r6
        L6e:
            java.lang.Object r6 = super.b(r6, r7)
            if (r6 != r2) goto L75
            return r6
        L75:
            ub.a0 r6 = ub.a0.f21526a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mf.f.b(lf.g, yb.c):java.lang.Object");
    }

    @Override // mf.e
    public final Object e(kf.s sVar, w0 w0Var) {
        Object objK = k(new s(sVar), w0Var);
        return objK == zb.a.f26667a ? objK : a0.f21526a;
    }

    public abstract Object k(lf.g gVar, yb.c cVar);

    @Override // mf.e
    public final String toString() {
        return this.f15138d + " -> " + super.toString();
    }
}
