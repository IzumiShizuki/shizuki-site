package i7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1 f9235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f9236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j1 f9237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.media3.exoplayer.offline.u f9238d = new androidx.media3.exoplayer.offline.u(24);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.media3.exoplayer.offline.u f9239e = new androidx.media3.exoplayer.offline.u(24);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final lf.f f9240f = u.e(new ba.u0(11, this, (yb.c) null));

    public o0(i1 i1Var, Integer num, j1 j1Var) {
        this.f9235a = i1Var;
        this.f9236b = num;
        this.f9237c = j1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(i7.o0 r10, i7.h2 r11, ac.c r12) {
        /*
            boolean r0 = r12 instanceof i7.n0
            if (r0 == 0) goto L13
            r0 = r12
            i7.n0 r0 = (i7.n0) r0
            int r1 = r0.f9219h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9219h = r1
            goto L18
        L13:
            i7.n0 r0 = new i7.n0
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f9217f
            int r1 = r0.f9219h
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            i7.h2 r11 = r0.f9216e
            i7.o0 r10 = r0.f9215d
            ub.a.f(r12)
        L28:
            r3 = r10
            goto L46
        L2a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L32:
            ub.a.f(r12)
            i7.i1 r12 = r10.f9235a
            r0.f9215d = r10
            r0.f9216e = r11
            r0.f9219h = r2
            java.lang.Object r12 = r12.a(r0)
            zb.a r0 = zb.a.f26667a
            if (r12 != r0) goto L28
            return r0
        L46:
            i7.h2 r12 = (i7.h2) r12
            if (r12 == r11) goto Lb2
            d.i0 r1 = new d.i0
            r8 = 0
            r9 = 3
            r2 = 0
            java.lang.Class<i7.o0> r4 = i7.o0.class
            java.lang.String r5 = "invalidate"
            java.lang.String r6 = "invalidate()V"
            r7 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r12.d(r1)
            if (r11 == 0) goto L88
            d.i0 r1 = new d.i0
            r8 = 0
            r9 = 4
            r2 = 0
            java.lang.Class<i7.o0> r4 = i7.o0.class
            java.lang.String r5 = "invalidate"
            java.lang.String r6 = "invalidate()V"
            r7 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            b7.n r10 = r11.f9151a
            java.lang.Object r0 = r10.f1985c
            r2 = r0
            java.util.concurrent.locks.ReentrantLock r2 = (java.util.concurrent.locks.ReentrantLock) r2
            r2.lock()     // Catch: java.lang.Throwable -> L82
            java.lang.Object r10 = r10.f1986d     // Catch: java.lang.Throwable -> L82
            java.util.ArrayList r10 = (java.util.ArrayList) r10     // Catch: java.lang.Throwable -> L82
            r10.remove(r1)     // Catch: java.lang.Throwable -> L82
            r2.unlock()
            goto L88
        L82:
            r0 = move-exception
            r10 = r0
            r2.unlock()
            throw r10
        L88:
            if (r11 == 0) goto L8d
            r11.b()
        L8d:
            java.lang.String r10 = android.os.Build.ID
            if (r10 == 0) goto Lb1
            java.lang.String r10 = "Paging"
            r11 = 3
            boolean r11 = android.util.Log.isLoggable(r10, r11)
            if (r11 == 0) goto Lb1
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "Generated new PagingSource "
            r11.<init>(r0)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.String r0 = "message"
            jc.l.e(r11, r0)
            r0 = 0
            android.util.Log.d(r10, r11, r0)
        Lb1:
            return r12
        Lb2:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource."
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.o0.a(i7.o0, i7.h2, ac.c):java.lang.Object");
    }
}
