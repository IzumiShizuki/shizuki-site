package gb;

import eb.z;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile z f7470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f7471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f7472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eb.m f7473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lb.a f7474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f7475f;

    public f(g gVar, boolean z10, boolean z11, eb.m mVar, lb.a aVar) {
        this.f7475f = gVar;
        this.f7471b = z10;
        this.f7472c = z11;
        this.f7473d = mVar;
        this.f7474e = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084 A[SYNTHETIC] */
    @Override // eb.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(mb.a r10) throws java.io.IOException {
        /*
            r9 = this;
            boolean r0 = r9.f7471b
            if (r0 == 0) goto L9
            r10.n0()
            r10 = 0
            return r10
        L9:
            eb.z r0 = r9.f7470a
            if (r0 == 0) goto Lf
            goto L8c
        Lf:
            eb.m r0 = r9.f7473d
            gb.g r1 = r9.f7475f
            lb.a r2 = r9.f7474e
            hb.i r3 = r0.f6464d
            r3.getClass()
            java.util.concurrent.ConcurrentHashMap r4 = r3.f8316b
            hb.h r5 = hb.i.f8314c
            if (r1 != r5) goto L21
            goto L62
        L21:
            java.lang.Class r5 = r2.f12165a
            java.lang.Object r6 = r4.get(r5)
            eb.a0 r6 = (eb.a0) r6
            if (r6 == 0) goto L2e
            if (r6 != r1) goto L63
            goto L62
        L2e:
            java.lang.Class<fb.a> r6 = fb.a.class
            java.lang.annotation.Annotation r6 = r5.getAnnotation(r6)
            fb.a r6 = (fb.a) r6
            if (r6 != 0) goto L39
            goto L63
        L39:
            java.lang.Class r6 = r6.value()
            java.lang.Class<eb.a0> r7 = eb.a0.class
            boolean r7 = r7.isAssignableFrom(r6)
            if (r7 != 0) goto L46
            goto L63
        L46:
            g5.w r7 = r3.f8315a
            lb.a r8 = new lb.a
            r8.<init>(r6)
            gb.o r6 = r7.u(r8)
            java.lang.Object r6 = r6.k()
            eb.a0 r6 = (eb.a0) r6
            java.lang.Object r4 = r4.putIfAbsent(r5, r6)
            eb.a0 r4 = (eb.a0) r4
            if (r4 == 0) goto L60
            r6 = r4
        L60:
            if (r6 != r1) goto L63
        L62:
            r1 = r3
        L63:
            java.util.List r3 = r0.f6465e
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
        L6a:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L84
            java.lang.Object r5 = r3.next()
            eb.a0 r5 = (eb.a0) r5
            if (r4 != 0) goto L7c
            if (r5 != r1) goto L6a
            r4 = 1
            goto L6a
        L7c:
            eb.z r5 = r5.a(r0, r2)
            if (r5 == 0) goto L6a
            r0 = r5
            goto L8a
        L84:
            if (r4 != 0) goto L91
            eb.z r0 = r0.c(r2)
        L8a:
            r9.f7470a = r0
        L8c:
            java.lang.Object r10 = r0.a(r10)
            return r10
        L91:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "GSON cannot serialize or deserialize "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.f.a(mb.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083 A[SYNTHETIC] */
    @Override // eb.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(mb.b r10, java.lang.Object r11) throws java.io.IOException {
        /*
            r9 = this;
            boolean r0 = r9.f7472c
            if (r0 == 0) goto L8
            r10.y()
            return
        L8:
            eb.z r0 = r9.f7470a
            if (r0 == 0) goto Le
            goto L8b
        Le:
            eb.m r0 = r9.f7473d
            gb.g r1 = r9.f7475f
            lb.a r2 = r9.f7474e
            hb.i r3 = r0.f6464d
            r3.getClass()
            java.util.concurrent.ConcurrentHashMap r4 = r3.f8316b
            hb.h r5 = hb.i.f8314c
            if (r1 != r5) goto L20
            goto L61
        L20:
            java.lang.Class r5 = r2.f12165a
            java.lang.Object r6 = r4.get(r5)
            eb.a0 r6 = (eb.a0) r6
            if (r6 == 0) goto L2d
            if (r6 != r1) goto L62
            goto L61
        L2d:
            java.lang.Class<fb.a> r6 = fb.a.class
            java.lang.annotation.Annotation r6 = r5.getAnnotation(r6)
            fb.a r6 = (fb.a) r6
            if (r6 != 0) goto L38
            goto L62
        L38:
            java.lang.Class r6 = r6.value()
            java.lang.Class<eb.a0> r7 = eb.a0.class
            boolean r7 = r7.isAssignableFrom(r6)
            if (r7 != 0) goto L45
            goto L62
        L45:
            g5.w r7 = r3.f8315a
            lb.a r8 = new lb.a
            r8.<init>(r6)
            gb.o r6 = r7.u(r8)
            java.lang.Object r6 = r6.k()
            eb.a0 r6 = (eb.a0) r6
            java.lang.Object r4 = r4.putIfAbsent(r5, r6)
            eb.a0 r4 = (eb.a0) r4
            if (r4 == 0) goto L5f
            r6 = r4
        L5f:
            if (r6 != r1) goto L62
        L61:
            r1 = r3
        L62:
            java.util.List r3 = r0.f6465e
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
        L69:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L83
            java.lang.Object r5 = r3.next()
            eb.a0 r5 = (eb.a0) r5
            if (r4 != 0) goto L7b
            if (r5 != r1) goto L69
            r4 = 1
            goto L69
        L7b:
            eb.z r5 = r5.a(r0, r2)
            if (r5 == 0) goto L69
            r0 = r5
            goto L89
        L83:
            if (r4 != 0) goto L8f
            eb.z r0 = r0.c(r2)
        L89:
            r9.f7470a = r0
        L8b:
            r0.b(r10, r11)
            return
        L8f:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "GSON cannot serialize or deserialize "
            r11.<init>(r0)
            r11.append(r2)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.f.b(mb.b, java.lang.Object):void");
    }
}
