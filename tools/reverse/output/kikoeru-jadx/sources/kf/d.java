package kf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d extends jc.j implements ic.o {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f11343i = new d(3, f.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
    
        return ub.a0.f21526a;
     */
    @Override // ic.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            r8 = this;
            r0 = r9
            kf.f r0 = (kf.f) r0
            r5 = r10
            qf.f r5 = (qf.f) r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r9 = kf.f.f11345b
            r0.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = kf.f.f11350g
            java.lang.Object r9 = r9.get(r0)
            kf.n r9 = (kf.n) r9
        L13:
            boolean r10 = r0.x()
            if (r10 == 0) goto L20
            app.nekogram.translator.r r9 = kf.h.f11367l
            qf.e r5 = (qf.e) r5
            r5.f18248e = r9
            goto L73
        L20:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r10 = kf.f.f11346c
            long r3 = r10.getAndIncrement(r0)
            int r10 = kf.h.f11357b
            long r10 = (long) r10
            long r1 = r3 / r10
            long r10 = r3 % r10
            int r11 = (int) r10
            long r6 = r9.f15854c
            int r10 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r10 == 0) goto L3e
            kf.n r10 = r0.q(r1, r9)
            if (r10 != 0) goto L3b
            goto L13
        L3b:
            r1 = r10
        L3c:
            r2 = r11
            goto L40
        L3e:
            r1 = r9
            goto L3c
        L40:
            java.lang.Object r9 = r0.F(r1, r2, r3, r5)
            r10 = r1
            app.nekogram.translator.r r11 = kf.h.f11368m
            if (r9 != r11) goto L57
            boolean r9 = r5 instanceof hf.c2
            if (r9 == 0) goto L50
            hf.c2 r5 = (hf.c2) r5
            goto L51
        L50:
            r5 = 0
        L51:
            if (r5 == 0) goto L73
            r5.a(r10, r2)
            goto L73
        L57:
            app.nekogram.translator.r r11 = kf.h.f11370o
            if (r9 != r11) goto L68
            long r1 = r0.u()
            int r9 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r9 >= 0) goto L66
            r10.a()
        L66:
            r9 = r10
            goto L13
        L68:
            app.nekogram.translator.r r11 = kf.h.f11369n
            if (r9 == r11) goto L76
            r10.a()
            qf.e r5 = (qf.e) r5
            r5.f18248e = r9
        L73:
            ub.a0 r9 = ub.a0.f21526a
            return r9
        L76:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "unexpected"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.d.g(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
