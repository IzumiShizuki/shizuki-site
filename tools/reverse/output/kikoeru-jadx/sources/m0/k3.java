package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f13177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f13178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f13179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f13180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r.c f13181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public w.j f13182f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public w.j f13183g;

    public k3(float f10, float f11, float f12, float f13) {
        this.f13177a = f10;
        this.f13178b = f11;
        this.f13179c = f12;
        this.f13180d = f13;
        this.f13181e = new r.c(new f3.f(f10), r.w1.f18622c, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r6v0, types: [w.j] */
    /* JADX WARN: Type inference failed for: r6v1, types: [w.j] */
    /* JADX WARN: Type inference failed for: r6v2, types: [w.j] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, ub.a0] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(w.j r6, ac.c r7) {
        /*
            r5 = this;
            r.c r0 = r5.f13181e
            boolean r1 = r7 instanceof m0.i3
            if (r1 == 0) goto L15
            r1 = r7
            m0.i3 r1 = (m0.i3) r1
            int r2 = r1.f13092g
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f13092g = r2
            goto L1a
        L15:
            m0.i3 r1 = new m0.i3
            r1.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r1.f13090e
            int r2 = r1.f13092g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            w.j r6 = r1.f13089d
            ub.a.f(r7)     // Catch: java.lang.Throwable -> L29
            goto L6e
        L29:
            r7 = move-exception
            goto L73
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            ub.a.f(r7)
            boolean r7 = r6 instanceof w.m
            if (r7 == 0) goto L3d
            float r7 = r5.f13178b
            goto L4d
        L3d:
            boolean r7 = r6 instanceof w.h
            if (r7 == 0) goto L44
            float r7 = r5.f13179c
            goto L4d
        L44:
            boolean r7 = r6 instanceof w.f
            if (r7 == 0) goto L4b
            float r7 = r5.f13180d
            goto L4d
        L4b:
            float r7 = r5.f13177a
        L4d:
            r5.f13183g = r6
            x0.e1 r2 = r0.f18335e     // Catch: java.lang.Throwable -> L29
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L29
            f3.f r2 = (f3.f) r2     // Catch: java.lang.Throwable -> L29
            float r2 = r2.f6657a     // Catch: java.lang.Throwable -> L29
            boolean r2 = f3.f.a(r2, r7)     // Catch: java.lang.Throwable -> L29
            if (r2 != 0) goto L6e
            w.j r2 = r5.f13182f     // Catch: java.lang.Throwable -> L29
            r1.f13089d = r6     // Catch: java.lang.Throwable -> L29
            r1.f13092g = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r7 = m0.w2.a(r0, r7, r2, r6, r1)     // Catch: java.lang.Throwable -> L29
            zb.a r0 = zb.a.f26667a
            if (r7 != r0) goto L6e
            return r0
        L6e:
            r5.f13182f = r6
            ub.a0 r6 = ub.a0.f21526a
            return r6
        L73:
            r5.f13182f = r6
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.k3.a(w.j, ac.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(ac.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof m0.j3
            if (r0 == 0) goto L13
            r0 = r5
            m0.j3 r0 = (m0.j3) r0
            int r1 = r0.f13132f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13132f = r1
            goto L18
        L13:
            m0.j3 r0 = new m0.j3
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f13130d
            int r1 = r0.f13132f
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            ub.a.f(r5)     // Catch: java.lang.Throwable -> L25
            goto L6d
        L25:
            r5 = move-exception
            goto L72
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            ub.a.f(r5)
            w.j r5 = r4.f13183g
            boolean r1 = r5 instanceof w.m
            if (r1 == 0) goto L3b
            float r5 = r4.f13178b
            goto L4b
        L3b:
            boolean r1 = r5 instanceof w.h
            if (r1 == 0) goto L42
            float r5 = r4.f13179c
            goto L4b
        L42:
            boolean r5 = r5 instanceof w.f
            if (r5 == 0) goto L49
            float r5 = r4.f13180d
            goto L4b
        L49:
            float r5 = r4.f13177a
        L4b:
            r.c r1 = r4.f13181e
            x0.e1 r3 = r1.f18335e
            java.lang.Object r3 = r3.getValue()
            f3.f r3 = (f3.f) r3
            float r3 = r3.f6657a
            boolean r3 = f3.f.a(r3, r5)
            if (r3 != 0) goto L77
            f3.f r3 = new f3.f     // Catch: java.lang.Throwable -> L25
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L25
            r0.f13132f = r2     // Catch: java.lang.Throwable -> L25
            java.lang.Object r5 = r1.f(r3, r0)     // Catch: java.lang.Throwable -> L25
            zb.a r0 = zb.a.f26667a
            if (r5 != r0) goto L6d
            return r0
        L6d:
            w.j r5 = r4.f13183g
            r4.f13182f = r5
            goto L77
        L72:
            w.j r0 = r4.f13183g
            r4.f13182f = r0
            throw r5
        L77:
            ub.a0 r5 = ub.a0.f21526a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.k3.b(ac.c):java.lang.Object");
    }
}
