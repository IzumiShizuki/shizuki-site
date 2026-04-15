package m5;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements xa.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f14677a;

    /* JADX WARN: Removed duplicated region for block: B:43:0x0065 A[Catch: all -> 0x0092, FALL_THROUGH, TryCatch #0 {all -> 0x0092, blocks: (B:4:0x0007, B:6:0x000e, B:8:0x0012, B:12:0x001a, B:37:0x0059, B:39:0x005d, B:41:0x0061, B:43:0x0065, B:45:0x0069, B:47:0x006d, B:49:0x0071, B:51:0x007b, B:53:0x0087, B:59:0x0095), top: B:63:0x0007 }] */
    @Override // xa.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean apply(java.lang.Object r10) {
        /*
            r9 = this;
            m5.p r0 = r9.f14677a
            m4.q r10 = (m4.q) r10
            java.lang.Object r1 = r0.f14746c
            monitor-enter(r1)
            m5.j r2 = r0.f14750g     // Catch: java.lang.Throwable -> L92
            boolean r2 = r2.o0     // Catch: java.lang.Throwable -> L92
            r3 = 1
            if (r2 == 0) goto L95
            boolean r2 = r0.f14749f     // Catch: java.lang.Throwable -> L92
            if (r2 != 0) goto L95
            int r2 = r10.D     // Catch: java.lang.Throwable -> L92
            r4 = -1
            if (r2 == r4) goto L95
            r5 = 2
            if (r2 <= r5) goto L95
            java.lang.String r2 = r10.f14544n     // Catch: java.lang.Throwable -> L92
            r6 = 32
            r7 = 0
            if (r2 != 0) goto L22
            goto L65
        L22:
            int r8 = r2.hashCode()
            switch(r8) {
                case -2123537834: goto L4b;
                case 187078296: goto L40;
                case 187078297: goto L35;
                case 1504578661: goto L2a;
                default: goto L29;
            }
        L29:
            goto L55
        L2a:
            java.lang.String r5 = "audio/eac3"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L33
            goto L55
        L33:
            r4 = 3
            goto L55
        L35:
            java.lang.String r8 = "audio/ac4"
            boolean r2 = r2.equals(r8)
            if (r2 != 0) goto L3e
            goto L55
        L3e:
            r4 = 2
            goto L55
        L40:
            java.lang.String r5 = "audio/ac3"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L49
            goto L55
        L49:
            r4 = 1
            goto L55
        L4b:
            java.lang.String r5 = "audio/eac3-joc"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L54
            goto L55
        L54:
            r4 = 0
        L55:
            switch(r4) {
                case 0: goto L59;
                case 1: goto L59;
                case 2: goto L59;
                case 3: goto L59;
                default: goto L58;
            }
        L58:
            goto L65
        L59:
            int r2 = p4.c0.f16548a     // Catch: java.lang.Throwable -> L92
            if (r2 < r6) goto L95
            b5.d0 r2 = r0.f14751h     // Catch: java.lang.Throwable -> L92
            if (r2 == 0) goto L95
            boolean r2 = r2.f1520a     // Catch: java.lang.Throwable -> L92
            if (r2 == 0) goto L95
        L65:
            int r2 = p4.c0.f16548a     // Catch: java.lang.Throwable -> L92
            if (r2 < r6) goto L94
            b5.d0 r2 = r0.f14751h     // Catch: java.lang.Throwable -> L92
            if (r2 == 0) goto L94
            boolean r4 = r2.f1520a     // Catch: java.lang.Throwable -> L92
            if (r4 == 0) goto L94
            java.lang.Object r2 = r2.f1521b     // Catch: java.lang.Throwable -> L92
            android.media.Spatializer r2 = (android.media.Spatializer) r2     // Catch: java.lang.Throwable -> L92
            boolean r2 = m4.c.f(r2)     // Catch: java.lang.Throwable -> L92
            if (r2 == 0) goto L94
            b5.d0 r2 = r0.f14751h     // Catch: java.lang.Throwable -> L92
            java.lang.Object r2 = r2.f1521b     // Catch: java.lang.Throwable -> L92
            android.media.Spatializer r2 = (android.media.Spatializer) r2     // Catch: java.lang.Throwable -> L92
            boolean r2 = m4.c.i(r2)     // Catch: java.lang.Throwable -> L92
            if (r2 == 0) goto L94
            b5.d0 r2 = r0.f14751h     // Catch: java.lang.Throwable -> L92
            m4.d r0 = r0.f14752i     // Catch: java.lang.Throwable -> L92
            boolean r10 = r2.d(r0, r10)     // Catch: java.lang.Throwable -> L92
            if (r10 == 0) goto L94
            goto L95
        L92:
            r10 = move-exception
            goto L97
        L94:
            r3 = 0
        L95:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L92
            return r3
        L97:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L92
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.e.apply(java.lang.Object):boolean");
    }
}
