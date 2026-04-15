package b7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i3 implements p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3 f1861b;

    public /* synthetic */ i3(p3 p3Var, int i10) {
        this.f1860a = i10;
        this.f1861b = p3Var;
    }

    @Override // b7.p3
    public final Object h(c2 c2Var, final t1 t1Var, final int i10) {
        switch (this.f1860a) {
            case 0:
                if (c2Var != null) {
                    throw new ClassCastException();
                }
                final int i11 = 0;
                q3.D0(null, t1Var, i10, this.f1861b, new p4.g() { // from class: b7.j3
                    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
                    @Override // p4.g
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void accept(java.lang.Object r17) {
                        /*
                            r16 = this;
                            r1 = r16
                            int r0 = r3
                            r2 = 1
                            r3 = -1
                            java.lang.String r4 = "MediaSessionStub"
                            int r5 = r2
                            b7.t1 r6 = r1
                            switch(r0) {
                                case 0: goto L48;
                                default: goto Lf;
                            }
                        Lf:
                            r0 = r17
                            cb.y r0 = (cb.y) r0
                            java.lang.Object r0 = r0.get()     // Catch: java.lang.InterruptedException -> L1f java.util.concurrent.ExecutionException -> L21 java.util.concurrent.CancellationException -> L23
                            b7.i4 r0 = (b7.i4) r0     // Catch: java.lang.InterruptedException -> L1f java.util.concurrent.ExecutionException -> L21 java.util.concurrent.CancellationException -> L23
                            java.lang.String r7 = "SessionResult must not be null"
                            p4.c.g(r0, r7)     // Catch: java.lang.InterruptedException -> L1f java.util.concurrent.ExecutionException -> L21 java.util.concurrent.CancellationException -> L23
                            goto L44
                        L1f:
                            r0 = move-exception
                            goto L25
                        L21:
                            r0 = move-exception
                            goto L25
                        L23:
                            r0 = move-exception
                            goto L3a
                        L25:
                            java.lang.String r2 = "Session operation failed"
                            p4.c.C(r4, r2, r0)
                            b7.i4 r2 = new b7.i4
                            java.lang.Throwable r0 = r0.getCause()
                            boolean r0 = r0 instanceof java.lang.UnsupportedOperationException
                            if (r0 == 0) goto L35
                            r3 = -6
                        L35:
                            r2.<init>(r3)
                            r0 = r2
                            goto L44
                        L3a:
                            java.lang.String r3 = "Session operation cancelled"
                            p4.c.C(r4, r3, r0)
                            b7.i4 r0 = new b7.i4
                            r0.<init>(r2)
                        L44:
                            b7.q3.H0(r6, r5, r0)
                            return
                        L48:
                            java.lang.String r7 = "no error message provided"
                            r0 = r17
                            cb.y r0 = (cb.y) r0
                            java.lang.Object r0 = r0.get()     // Catch: java.lang.InterruptedException -> L5a java.util.concurrent.ExecutionException -> L5c java.util.concurrent.CancellationException -> L5e
                            b7.y r0 = (b7.y) r0     // Catch: java.lang.InterruptedException -> L5a java.util.concurrent.ExecutionException -> L5c java.util.concurrent.CancellationException -> L5e
                            java.lang.String r8 = "LibraryResult must not be null"
                            p4.c.g(r0, r8)     // Catch: java.lang.InterruptedException -> L5a java.util.concurrent.ExecutionException -> L5c java.util.concurrent.CancellationException -> L5e
                            goto L9b
                        L5a:
                            r0 = move-exception
                            goto L60
                        L5c:
                            r0 = move-exception
                            goto L60
                        L5e:
                            r0 = move-exception
                            goto L7e
                        L60:
                            java.lang.String r2 = "Library operation failed"
                            p4.c.C(r4, r2, r0)
                            java.lang.String r0 = b7.y.f2187g
                            b7.g4 r13 = new b7.g4
                            android.os.Bundle r0 = android.os.Bundle.EMPTY
                            r13.<init>(r7, r3, r0)
                            b7.y r8 = new b7.y
                            long r10 = android.os.SystemClock.elapsedRealtime()
                            r14 = 0
                            r15 = 4
                            int r9 = r13.f1797a
                            r12 = 0
                            r8.<init>(r9, r10, r12, r13, r14, r15)
                        L7c:
                            r0 = r8
                            goto L9b
                        L7e:
                            java.lang.String r3 = "Library operation cancelled"
                            p4.c.C(r4, r3, r0)
                            java.lang.String r0 = b7.y.f2187g
                            b7.g4 r13 = new b7.g4
                            android.os.Bundle r0 = android.os.Bundle.EMPTY
                            r13.<init>(r7, r2, r0)
                            b7.y r8 = new b7.y
                            long r10 = android.os.SystemClock.elapsedRealtime()
                            r14 = 0
                            r15 = 4
                            int r9 = r13.f1797a
                            r12 = 0
                            r8.<init>(r9, r10, r12, r13, r14, r15)
                            goto L7c
                        L9b:
                            b7.s1 r2 = r6.f2098d     // Catch: android.os.RemoteException -> La4
                            p4.c.j(r2)     // Catch: android.os.RemoteException -> La4
                            r2.e(r5, r0)     // Catch: android.os.RemoteException -> La4
                            goto Lb6
                        La4:
                            r0 = move-exception
                            java.lang.StringBuilder r2 = new java.lang.StringBuilder
                            java.lang.String r3 = "Failed to send result to browser "
                            r2.<init>(r3)
                            r2.append(r6)
                            java.lang.String r2 = r2.toString()
                            p4.c.C(r4, r2, r0)
                        Lb6:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: b7.j3.accept(java.lang.Object):void");
                    }
                });
                throw null;
            default:
                final int i12 = 1;
                return q3.D0(c2Var, t1Var, i10, this.f1861b, new p4.g() { // from class: b7.j3
                    @Override // p4.g
                    public final void accept(Object v5) {
                        /*
                            this = this;
                            r1 = r16
                            int r0 = r3
                            r2 = 1
                            r3 = -1
                            java.lang.String r4 = "MediaSessionStub"
                            int r5 = r2
                            b7.t1 r6 = r1
                            switch(r0) {
                                case 0: goto L48;
                                default: goto Lf;
                            }
                        Lf:
                            r0 = r17
                            cb.y r0 = (cb.y) r0
                            java.lang.Object r0 = r0.get()     // Catch: java.lang.InterruptedException -> L1f java.util.concurrent.ExecutionException -> L21 java.util.concurrent.CancellationException -> L23
                            b7.i4 r0 = (b7.i4) r0     // Catch: java.lang.InterruptedException -> L1f java.util.concurrent.ExecutionException -> L21 java.util.concurrent.CancellationException -> L23
                            java.lang.String r7 = "SessionResult must not be null"
                            p4.c.g(r0, r7)     // Catch: java.lang.InterruptedException -> L1f java.util.concurrent.ExecutionException -> L21 java.util.concurrent.CancellationException -> L23
                            goto L44
                        L1f:
                            r0 = move-exception
                            goto L25
                        L21:
                            r0 = move-exception
                            goto L25
                        L23:
                            r0 = move-exception
                            goto L3a
                        L25:
                            java.lang.String r2 = "Session operation failed"
                            p4.c.C(r4, r2, r0)
                            b7.i4 r2 = new b7.i4
                            java.lang.Throwable r0 = r0.getCause()
                            boolean r0 = r0 instanceof java.lang.UnsupportedOperationException
                            if (r0 == 0) goto L35
                            r3 = -6
                        L35:
                            r2.<init>(r3)
                            r0 = r2
                            goto L44
                        L3a:
                            java.lang.String r3 = "Session operation cancelled"
                            p4.c.C(r4, r3, r0)
                            b7.i4 r0 = new b7.i4
                            r0.<init>(r2)
                        L44:
                            b7.q3.H0(r6, r5, r0)
                            return
                        L48:
                            java.lang.String r7 = "no error message provided"
                            r0 = r17
                            cb.y r0 = (cb.y) r0
                            java.lang.Object r0 = r0.get()     // Catch: java.lang.InterruptedException -> L5a java.util.concurrent.ExecutionException -> L5c java.util.concurrent.CancellationException -> L5e
                            b7.y r0 = (b7.y) r0     // Catch: java.lang.InterruptedException -> L5a java.util.concurrent.ExecutionException -> L5c java.util.concurrent.CancellationException -> L5e
                            java.lang.String r8 = "LibraryResult must not be null"
                            p4.c.g(r0, r8)     // Catch: java.lang.InterruptedException -> L5a java.util.concurrent.ExecutionException -> L5c java.util.concurrent.CancellationException -> L5e
                            goto L9b
                        L5a:
                            r0 = move-exception
                            goto L60
                        L5c:
                            r0 = move-exception
                            goto L60
                        L5e:
                            r0 = move-exception
                            goto L7e
                        L60:
                            java.lang.String r2 = "Library operation failed"
                            p4.c.C(r4, r2, r0)
                            java.lang.String r0 = b7.y.f2187g
                            b7.g4 r13 = new b7.g4
                            android.os.Bundle r0 = android.os.Bundle.EMPTY
                            r13.<init>(r7, r3, r0)
                            b7.y r8 = new b7.y
                            long r10 = android.os.SystemClock.elapsedRealtime()
                            r14 = 0
                            r15 = 4
                            int r9 = r13.f1797a
                            r12 = 0
                            r8.<init>(r9, r10, r12, r13, r14, r15)
                        L7c:
                            r0 = r8
                            goto L9b
                        L7e:
                            java.lang.String r3 = "Library operation cancelled"
                            p4.c.C(r4, r3, r0)
                            java.lang.String r0 = b7.y.f2187g
                            b7.g4 r13 = new b7.g4
                            android.os.Bundle r0 = android.os.Bundle.EMPTY
                            r13.<init>(r7, r2, r0)
                            b7.y r8 = new b7.y
                            long r10 = android.os.SystemClock.elapsedRealtime()
                            r14 = 0
                            r15 = 4
                            int r9 = r13.f1797a
                            r12 = 0
                            r8.<init>(r9, r10, r12, r13, r14, r15)
                            goto L7c
                        L9b:
                            b7.s1 r2 = r6.f2098d     // Catch: android.os.RemoteException -> La4
                            p4.c.j(r2)     // Catch: android.os.RemoteException -> La4
                            r2.e(r5, r0)     // Catch: android.os.RemoteException -> La4
                            goto Lb6
                        La4:
                            r0 = move-exception
                            java.lang.StringBuilder r2 = new java.lang.StringBuilder
                            java.lang.String r3 = "Failed to send result to browser "
                            r2.<init>(r3)
                            r2.append(r6)
                            java.lang.String r2 = r2.toString()
                            p4.c.C(r4, r2, r0)
                        Lb6:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: b7.j3.accept(java.lang.Object):void");
                    }
                });
        }
    }
}
