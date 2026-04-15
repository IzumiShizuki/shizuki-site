package v;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.concurrent.CancellationException;
import u.k1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f22127a = TinkerReport.KEY_LOADED_SUCC_COST_500_LESS;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(u.k1 r9, float r10, r.k r11, r.t r12, ic.k r13, ac.c r14) {
        /*
            boolean r0 = r14 instanceof v.g
            if (r0 == 0) goto L13
            r0 = r14
            v.g r0 = (v.g) r0
            int r1 = r0.f22115h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22115h = r1
            goto L18
        L13:
            v.g r0 = new v.g
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f22114g
            int r1 = r0.f22115h
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            float r10 = r0.f22111d
            jc.v r9 = r0.f22113f
            r.k r11 = r0.f22112e
            ub.a.f(r14)
            goto L6a
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            ub.a.f(r14)
            jc.v r5 = new jc.v
            r5.<init>()
            java.lang.Object r14 = r11.a()
            java.lang.Number r14 = (java.lang.Number) r14
            float r14 = r14.floatValue()
            r1 = 0
            int r14 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r14 != 0) goto L4c
            r14 = 1
            goto L4d
        L4c:
            r14 = 0
        L4d:
            r14 = r14 ^ r2
            v.h r3 = new v.h
            r8 = 0
            r6 = r9
            r4 = r10
            r7 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            r0.f22112e = r11
            r0.f22113f = r5
            r0.f22111d = r4
            r0.f22115h = r2
            java.lang.Object r9 = r.d.f(r11, r12, r14, r3, r0)
            zb.a r10 = zb.a.f26667a
            if (r9 != r10) goto L68
            return r10
        L68:
            r10 = r4
            r9 = r5
        L6a:
            v.a r12 = new v.a
            float r9 = r9.f10835a
            float r10 = r10 - r9
            java.lang.Float r9 = new java.lang.Float
            r9.<init>(r10)
            r12.<init>(r9, r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: v.j.a(u.k1, float, r.k, r.t, ic.k, ac.c):java.lang.Object");
    }

    public static final void b(r.i iVar, k1 k1Var, ic.k kVar, float f10) {
        float fA;
        try {
            fA = k1Var.a(f10);
        } catch (CancellationException unused) {
            iVar.a();
            fA = 0.0f;
        }
        kVar.a(Float.valueOf(fA));
        if (Math.abs(f10 - fA) > 0.5f) {
            iVar.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(u.k1 r16, float r17, float r18, r.k r19, r.z0 r20, ic.k r21, ac.c r22) {
        /*
            r0 = r17
            r1 = r22
            boolean r2 = r1 instanceof v.i
            if (r2 == 0) goto L18
            r2 = r1
            v.i r2 = (v.i) r2
            int r3 = r2.f22126i
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f22126i = r3
        L16:
            r8 = r2
            goto L1e
        L18:
            v.i r2 = new v.i
            r2.<init>(r1)
            goto L16
        L1e:
            java.lang.Object r1 = r8.f22125h
            int r2 = r8.f22126i
            r9 = 0
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            float r0 = r8.f22122e
            float r2 = r8.f22121d
            jc.v r3 = r8.f22124g
            r.k r4 = r8.f22123f
            ub.a.f(r1)
            r1 = r0
            r0 = r2
            goto L90
        L36:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3e:
            ub.a.f(r1)
            jc.v r12 = new jc.v
            r12.<init>()
            java.lang.Object r1 = r19.a()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r0)
            java.lang.Object r2 = r19.a()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 != 0) goto L65
            r2 = 1
            goto L66
        L65:
            r2 = 0
        L66:
            r6 = r2 ^ 1
            v.h r10 = new v.h
            r15 = 1
            r13 = r16
            r11 = r18
            r14 = r21
            r10.<init>(r11, r12, r13, r14, r15)
            r2 = r19
            r8.f22123f = r2
            r8.f22124g = r12
            r8.f22121d = r0
            r8.f22122e = r1
            r8.f22126i = r3
            r5 = r20
            r3 = r2
            r7 = r10
            java.lang.Object r2 = r.d.h(r3, r4, r5, r6, r7, r8)
            zb.a r3 = zb.a.f26667a
            if (r2 != r3) goto L8d
            return r3
        L8d:
            r4 = r19
            r3 = r12
        L90:
            java.lang.Object r2 = r4.a()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r1 = d(r2, r1)
            v.a r2 = new v.a
            float r3 = r3.f10835a
            float r0 = r0 - r3
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r0)
            r0 = 29
            r.k r0 = r.d.l(r4, r9, r1, r0)
            r2.<init>(r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: v.j.c(u.k1, float, float, r.k, r.z0, ic.k, ac.c):java.lang.Object");
    }

    public static final float d(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        return (f11 <= 0.0f ? f10 >= f11 : f10 <= f11) ? f10 : f11;
    }
}
