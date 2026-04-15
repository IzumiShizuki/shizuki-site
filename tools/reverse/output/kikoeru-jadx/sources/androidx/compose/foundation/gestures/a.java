package androidx.compose.foundation.gestures;

import j1.q;
import u.e1;
import u.m1;
import u.n1;
import u.o1;
import w.k;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n1 f521a = new n1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m1 f522b = new m1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o1 f523c = new o1();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(u.c2 r10, long r11, ac.c r13) {
        /*
            boolean r0 = r13 instanceof u.p1
            if (r0 == 0) goto L13
            r0 = r13
            u.p1 r0 = (u.p1) r0
            int r1 = r0.f21029g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21029g = r1
            goto L18
        L13:
            u.p1 r0 = new u.p1
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f21028f
            int r1 = r0.f21029g
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            jc.v r10 = r0.f21027e
            u.c2 r11 = r0.f21026d
            ub.a.f(r13)
            r7 = r10
            r10 = r11
            goto L56
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            ub.a.f(r13)
            jc.v r7 = new jc.v
            r7.<init>()
            b0.z r3 = new b0.z
            r8 = 0
            r9 = 4
            r4 = r10
            r5 = r11
            r3.<init>(r4, r5, r7, r8, r9)
            r0.f21026d = r4
            r0.f21027e = r7
            r0.f21029g = r2
            s.v0 r10 = s.v0.f19292a
            java.lang.Object r10 = r4.f(r10, r3, r0)
            zb.a r11 = zb.a.f26667a
            if (r10 != r11) goto L55
            return r11
        L55:
            r10 = r4
        L56:
            float r11 = r7.f10835a
            long r10 = r10.h(r11)
            p1.b r12 = new p1.b
            r12.<init>(r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.a.a(u.c2, long, ac.c):java.lang.Object");
    }

    public static q b(h0.n1 n1Var, e1 e1Var, boolean z10, boolean z11, k kVar) {
        return new ScrollableElement(n1Var, e1Var, z10, z11, kVar);
    }
}
