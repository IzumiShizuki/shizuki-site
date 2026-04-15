package u;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final StackTraceElement[] f21117a = new StackTraceElement[0];

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.List] */
    public static final boolean a(c2.i0 i0Var) {
        ?? r52 = i0Var.f3287f.f3301t.f3309a;
        int size = ((Collection) r52).size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            if (((c2.t) r52.get(i10)).f3325d) {
                z10 = true;
                break;
            }
            i10++;
        }
        return !z10;
    }

    public static final float b(long j10) {
        if (Float.intBitsToFloat((int) (j10 >> 32)) == 0.0f && Float.intBitsToFloat((int) (j10 & 4294967295L)) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(Float.intBitsToFloat(r1), Float.intBitsToFloat((int) (j10 & 4294967295L))))) * 180.0f) / 3.1415927f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(u.v1 r4, float r5, r.x r6, ac.c r7) {
        /*
            boolean r0 = r7 instanceof u.j1
            if (r0 == 0) goto L13
            r0 = r7
            u.j1 r0 = (u.j1) r0
            int r1 = r0.f20963f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20963f = r1
            goto L18
        L13:
            u.j1 r0 = new u.j1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f20962e
            int r1 = r0.f20963f
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            jc.v r4 = r0.f20961d
            ub.a.f(r7)
            goto L4d
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            ub.a.f(r7)
            jc.v r7 = new jc.v
            r7.<init>()
            m0.l7 r1 = new m0.l7
            r3 = 0
            r1.<init>(r5, r6, r7, r3)
            r0.f20961d = r7
            r0.f20963f = r2
            s.v0 r5 = s.v0.f19292a
            java.lang.Object r4 = r4.b(r5, r1, r0)
            zb.a r5 = zb.a.f26667a
            if (r4 != r5) goto L4c
            return r5
        L4c:
            r4 = r7
        L4d:
            float r4 = r4.f10835a
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u.w1.c(u.v1, float, r.x, ac.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        if (a(r6) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0049 -> B:19:0x004c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(c2.i0 r6, c2.m r7, ac.a r8) {
        /*
            boolean r0 = r8 instanceof u.r0
            if (r0 == 0) goto L13
            r0 = r8
            u.r0 r0 = (u.r0) r0
            int r1 = r0.f21064g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21064g = r1
            goto L18
        L13:
            u.r0 r0 = new u.r0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f21063f
            int r1 = r0.f21064g
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            c2.m r6 = r0.f21062e
            c2.i0 r7 = r0.f21061d
            ub.a.f(r8)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L4c
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            ub.a.f(r8)
            boolean r8 = a(r6)
            if (r8 != 0) goto L68
        L3d:
            r0.f21061d = r6
            r0.f21062e = r7
            r0.f21064g = r2
            java.lang.Object r8 = r6.b(r7, r0)
            zb.a r1 = zb.a.f26667a
            if (r8 != r1) goto L4c
            return r1
        L4c:
            c2.l r8 = (c2.l) r8
            java.lang.Object r8 = r8.f3309a
            r1 = r8
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r3 = 0
        L58:
            if (r3 >= r1) goto L68
            java.lang.Object r4 = r8.get(r3)
            c2.t r4 = (c2.t) r4
            boolean r4 = r4.f3325d
            if (r4 == 0) goto L65
            goto L3d
        L65:
            int r3 = r3 + 1
            goto L58
        L68:
            ub.a0 r6 = ub.a0.f21526a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: u.w1.d(c2.i0, c2.m, ac.a):java.lang.Object");
    }

    public static final Object e(c2.x xVar, ic.n nVar, yb.c cVar) {
        Object objB0 = ((c2.j0) xVar).B0(new h0.x0(cVar.s(), nVar, (yb.c) null), cVar);
        return objB0 == zb.a.f26667a ? objB0 : ub.a0.f21526a;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    public static final long f(c2.l lVar, boolean z10) {
        ?? r72 = lVar.f3309a;
        int size = ((Collection) r72).size();
        long jI = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            c2.t tVar = (c2.t) r72.get(i11);
            if (tVar.f3325d && tVar.f3329h) {
                jI = p1.b.i(jI, z10 ? tVar.f3324c : tVar.f3328g);
                i10++;
            }
        }
        if (i10 == 0) {
            return 9205357640488583168L;
        }
        return p1.b.b(i10, jI);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    public static final float g(c2.l lVar, boolean z10) {
        long jF = f(lVar, z10);
        float fD = 0.0f;
        if (p1.b.c(jF, 9205357640488583168L)) {
            return 0.0f;
        }
        ?? r82 = lVar.f3309a;
        int size = ((Collection) r82).size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            c2.t tVar = (c2.t) r82.get(i11);
            if (tVar.f3325d && tVar.f3329h) {
                i10++;
                fD = p1.b.d(p1.b.h(z10 ? tVar.f3324c : tVar.f3328g, jF)) + fD;
            }
        }
        return fD / i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x008d, code lost:
    
        if (r3 != r4) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b3, code lost:
    
        if (r3 != r4) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0047, code lost:
    
        if (r12 != r4) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0047, code lost:
    
        if (r12 != r4) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v0, types: [c2.x] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10, types: [yb.h] */
    /* JADX WARN: Type inference failed for: r10v12, types: [yb.h] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v2, types: [yb.h] */
    /* JADX WARN: Type inference failed for: r10v3, types: [yb.h] */
    /* JADX WARN: Type inference failed for: r10v4, types: [c2.x, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r11v0, types: [ua.h] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v2, types: [ic.n] */
    /* JADX WARN: Type inference failed for: r11v3, types: [ic.n] */
    /* JADX WARN: Type inference failed for: r11v4, types: [ic.n] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7, types: [ic.n] */
    /* JADX WARN: Type inference failed for: r11v9, types: [ic.n] */
    /* JADX WARN: Type inference failed for: r12v10, types: [yb.h] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11, types: [c2.x] */
    /* JADX WARN: Type inference failed for: r1v12, types: [c2.x] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2, types: [c2.x] */
    /* JADX WARN: Type inference failed for: r1v3, types: [c2.x] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(c2.x r10, ua.h r11, ac.c r12) {
        /*
            boolean r0 = r12 instanceof u.s0
            if (r0 == 0) goto L13
            r0 = r12
            u.s0 r0 = (u.s0) r0
            int r1 = r0.f21079h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21079h = r1
            goto L18
        L13:
            u.s0 r0 = new u.s0
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f21078g
            int r1 = r0.f21079h
            r2 = 0
            ub.a0 r3 = ub.a0.f21526a
            zb.a r4 = zb.a.f26667a
            r5 = 3
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L56
            if (r1 == r7) goto L4c
            if (r1 == r6) goto L3e
            if (r1 != r5) goto L36
            yb.h r10 = r0.f21077f
            ic.n r11 = r0.f21076e
            c2.x r1 = r0.f21075d
            ub.a.f(r12)
            goto L47
        L36:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3e:
            yb.h r10 = r0.f21077f
            ic.n r11 = r0.f21076e
            c2.x r1 = r0.f21075d
            ub.a.f(r12)     // Catch: java.util.concurrent.CancellationException -> L4a
        L47:
            r12 = r10
            r10 = r1
            goto L5e
        L4a:
            r12 = move-exception
            goto L95
        L4c:
            yb.h r10 = r0.f21077f
            ic.n r11 = r0.f21076e
            c2.x r1 = r0.f21075d
            ub.a.f(r12)     // Catch: java.util.concurrent.CancellationException -> L4a
            goto L75
        L56:
            ub.a.f(r12)
            yb.h r12 = r0.f302b
            jc.l.b(r12)
        L5e:
            boolean r1 = hf.a0.w(r12)
            if (r1 == 0) goto Lb7
            r0.f21075d = r10     // Catch: java.util.concurrent.CancellationException -> L90
            r0.f21076e = r11     // Catch: java.util.concurrent.CancellationException -> L90
            r0.f21077f = r12     // Catch: java.util.concurrent.CancellationException -> L90
            r0.f21079h = r7     // Catch: java.util.concurrent.CancellationException -> L90
            java.lang.Object r1 = r11.q(r10, r0)     // Catch: java.util.concurrent.CancellationException -> L90
            if (r1 != r4) goto L73
            goto Lb5
        L73:
            r1 = r10
            r10 = r12
        L75:
            r0.f21075d = r1     // Catch: java.util.concurrent.CancellationException -> L4a
            r0.f21076e = r11     // Catch: java.util.concurrent.CancellationException -> L4a
            r0.f21077f = r10     // Catch: java.util.concurrent.CancellationException -> L4a
            r0.f21079h = r6     // Catch: java.util.concurrent.CancellationException -> L4a
            u.q0 r12 = new u.q0     // Catch: java.util.concurrent.CancellationException -> L4a
            r12.<init>(r6, r2)     // Catch: java.util.concurrent.CancellationException -> L4a
            r8 = r1
            c2.j0 r8 = (c2.j0) r8     // Catch: java.util.concurrent.CancellationException -> L4a
            java.lang.Object r12 = r8.B0(r12, r0)     // Catch: java.util.concurrent.CancellationException -> L4a
            if (r12 != r4) goto L8c
            goto L8d
        L8c:
            r12 = r3
        L8d:
            if (r12 != r4) goto L47
            goto Lb5
        L90:
            r1 = move-exception
            r9 = r1
            r1 = r10
            r10 = r12
            r12 = r9
        L95:
            boolean r8 = hf.a0.w(r10)
            if (r8 == 0) goto Lb6
            r0.f21075d = r1
            r0.f21076e = r11
            r0.f21077f = r10
            r0.f21079h = r5
            u.q0 r12 = new u.q0
            r12.<init>(r6, r2)
            r8 = r1
            c2.j0 r8 = (c2.j0) r8
            java.lang.Object r12 = r8.B0(r12, r0)
            if (r12 != r4) goto Lb2
            goto Lb3
        Lb2:
            r12 = r3
        Lb3:
            if (r12 != r4) goto L47
        Lb5:
            return r4
        Lb6:
            throw r12
        Lb7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: u.w1.h(c2.x, ua.h, ac.c):java.lang.Object");
    }
}
