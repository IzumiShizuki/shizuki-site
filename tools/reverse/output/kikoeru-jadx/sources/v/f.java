package v;

import jc.l;
import m0.w;
import r.t;
import r.z0;
import u.m1;
import u.p0;
import u.y1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f22107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f22108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z0 f22109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m1 f22110d = androidx.compose.foundation.gestures.a.f522b;

    public f(w wVar, t tVar, z0 z0Var) {
        this.f22107a = wVar;
        this.f22108b = tVar;
        this.f22109c = z0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(v.f r9, u.k1 r10, float r11, float r12, v.c r13, ac.c r14) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v.f.b(v.f, u.k1, float, float, v.c, ac.c):java.lang.Object");
    }

    @Override // u.p0
    public final Object a(y1 y1Var, float f10, yb.c cVar) {
        return d(y1Var, f10, u.d.f20861h, (ac.c) cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(u.k1 r10, float r11, ic.k r12, ac.c r13) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r13 instanceof v.b
            if (r0 == 0) goto L13
            r0 = r13
            v.b r0 = (v.b) r0
            int r1 = r0.f22097g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22097g = r1
            goto L18
        L13:
            v.b r0 = new v.b
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.f22095e
            int r1 = r0.f22097g
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            ic.k r12 = r0.f22094d
            ub.a.f(r13)
            r4 = r9
            goto L4d
        L28:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L30:
            ub.a.f(r13)
            u.h r3 = new u.h
            r8 = 0
            r4 = r9
            r7 = r10
            r5 = r11
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            r0.f22094d = r6
            r0.f22097g = r2
            u.m1 r10 = r4.f22110d
            java.lang.Object r13 = hf.a0.H(r10, r3, r0)
            zb.a r10 = zb.a.f26667a
            if (r13 != r10) goto L4c
            return r10
        L4c:
            r12 = r6
        L4d:
            v.a r13 = (v.a) r13
            java.lang.Float r10 = new java.lang.Float
            r11 = 0
            r10.<init>(r11)
            r12.a(r10)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: v.f.c(u.k1, float, ic.k, ac.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(u.k1 r5, float r6, ic.k r7, ac.c r8) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r8 instanceof v.d
            if (r0 == 0) goto L13
            r0 = r8
            v.d r0 = (v.d) r0
            int r1 = r0.f22103f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22103f = r1
            goto L18
        L13:
            v.d r0 = new v.d
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f22101d
            int r1 = r0.f22103f
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            ub.a.f(r8)
            goto L3b
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            ub.a.f(r8)
            r0.f22103f = r2
            java.lang.Object r8 = r4.c(r5, r6, r7, r0)
            zb.a r5 = zb.a.f26667a
            if (r8 != r5) goto L3b
            return r5
        L3b:
            v.a r8 = (v.a) r8
            java.lang.Float r5 = r8.f22092a
            float r5 = r5.floatValue()
            r.k r6 = r8.f22093b
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L4b
            goto L55
        L4b:
            java.lang.Object r5 = r6.a()
            java.lang.Number r5 = (java.lang.Number) r5
            float r7 = r5.floatValue()
        L55:
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: v.f.d(u.k1, float, ic.k, ac.c):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return fVar.f22109c.equals(this.f22109c) && l.a(fVar.f22108b, this.f22108b) && fVar.f22107a.equals(this.f22107a);
    }

    public final int hashCode() {
        return this.f22107a.hashCode() + ((this.f22108b.hashCode() + (this.f22109c.hashCode() * 31)) * 31);
    }
}
