package b2;

import b0.d0;
import hf.y;
import jc.m;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f1455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f1456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f1457c = new d0(1, this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y f1458d;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        if (r15 == r7) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0080, code lost:
    
        if (r15 == r7) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
    
        return r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r11, long r13, ac.c r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof b2.b
            if (r0 == 0) goto L14
            r0 = r15
            b2.b r0 = (b2.b) r0
            int r1 = r0.f1451f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f1451f = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            b2.b r0 = new b2.b
            r0.<init>(r10, r15)
            goto L12
        L1a:
            java.lang.Object r15 = r6.f1449d
            int r0 = r6.f1451f
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L36
            if (r0 == r2) goto L32
            if (r0 != r1) goto L2a
            ub.a.f(r15)
            goto L83
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            ub.a.f(r15)
            goto L5f
        L36:
            ub.a.f(r15)
            b2.g r15 = r10.f1455a
            r0 = 0
            if (r15 == 0) goto L49
            boolean r3 = r15.f9703n
            if (r3 == 0) goto L49
            i2.d2 r15 = i2.f.j(r15)
            b2.g r15 = (b2.g) r15
            goto L4a
        L49:
            r15 = r0
        L4a:
            r3 = 0
            zb.a r7 = zb.a.f26667a
            if (r15 != 0) goto L64
            b2.g r1 = r10.f1456b
            if (r1 == 0) goto L89
            r6.f1451f = r2
            r2 = r11
            r4 = r13
            java.lang.Object r15 = r1.D(r2, r4, r6)
            if (r15 != r7) goto L5f
            goto L82
        L5f:
            f3.q r15 = (f3.q) r15
            long r3 = r15.f6675a
            goto L89
        L64:
            r8 = r3
            r2 = r11
            r11 = r8
            r4 = r13
            b2.g r13 = r10.f1455a
            if (r13 == 0) goto L77
            boolean r14 = r13.f9703n
            if (r14 == 0) goto L77
            i2.d2 r13 = i2.f.j(r13)
            r0 = r13
            b2.g r0 = (b2.g) r0
        L77:
            if (r0 == 0) goto L88
            r6.f1451f = r1
            r1 = r0
            java.lang.Object r15 = r1.D(r2, r4, r6)
            if (r15 != r7) goto L83
        L82:
            return r7
        L83:
            f3.q r15 = (f3.q) r15
            long r3 = r15.f6675a
            goto L89
        L88:
            r3 = r11
        L89:
            f3.q r11 = new f3.q
            r11.<init>(r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.d.a(long, long, ac.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r5, ac.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof b2.c
            if (r0 == 0) goto L13
            r0 = r7
            b2.c r0 = (b2.c) r0
            int r1 = r0.f1454f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1454f = r1
            goto L18
        L13:
            b2.c r0 = new b2.c
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f1452d
            int r1 = r0.f1454f
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            ub.a.f(r7)
            goto L4d
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            ub.a.f(r7)
            b2.g r7 = r4.f1455a
            r1 = 0
            if (r7 == 0) goto L40
            boolean r3 = r7.f9703n
            if (r3 == 0) goto L40
            i2.d2 r7 = i2.f.j(r7)
            r1 = r7
            b2.g r1 = (b2.g) r1
        L40:
            if (r1 == 0) goto L52
            r0.f1454f = r2
            java.lang.Object r7 = r1.V(r5, r0)
            zb.a r5 = zb.a.f26667a
            if (r7 != r5) goto L4d
            return r5
        L4d:
            f3.q r7 = (f3.q) r7
            long r5 = r7.f6675a
            goto L54
        L52:
            r5 = 0
        L54:
            f3.q r7 = new f3.q
            r7.<init>(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.d.b(long, ac.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ic.a, jc.m] */
    public final y c() {
        y yVar = (y) this.f1457c.b();
        if (yVar != null) {
            return yVar;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
