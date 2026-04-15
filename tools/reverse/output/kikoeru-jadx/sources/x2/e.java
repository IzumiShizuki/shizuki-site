package x2;

import e7.y;
import hf.a0;
import hf.t1;
import r.y1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r5.p f24551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f24552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v2.e f24553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f24554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y1 f24555e;

    public e(r5.p pVar, a aVar) {
        v2.e eVar = f.f24556a;
        v2.e eVar2 = f.f24556a;
        h hVar = new h();
        g gVar = h.f24557a;
        jf.d dVar = b3.g.f1497a;
        gVar.getClass();
        a0.b(ud.b.C(gVar, dVar).G(yb.i.f26088a).G(new t1(null)));
        y1 y1Var = new y1(26);
        this.f24551a = pVar;
        this.f24552b = aVar;
        this.f24553c = eVar;
        this.f24554d = hVar;
        this.f24555e = y1Var;
        new y(24, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0086 A[Catch: Exception -> 0x008e, TRY_ENTER, TryCatch #1 {Exception -> 0x008e, blocks: (B:15:0x0028, B:17:0x003b, B:20:0x0040, B:22:0x0044, B:28:0x005d, B:45:0x0086, B:46:0x008d, B:24:0x004d, B:25:0x004f, B:26:0x0052, B:27:0x0058), top: B:54:0x0028 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final x2.p a(x2.o r7) {
        /*
            r6 = this;
            v2.e r0 = r6.f24553c
            java.lang.Object r1 = r0.f22364b
            pe.d r1 = (pe.d) r1
            monitor-enter(r1)
            java.lang.Object r2 = r0.f22365c     // Catch: java.lang.Throwable -> L24
            o.u r2 = (o.u) r2     // Catch: java.lang.Throwable -> L24
            java.lang.Object r2 = r2.b(r7)     // Catch: java.lang.Throwable -> L24
            x2.p r2 = (x2.p) r2     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L27
            boolean r3 = r2.f24576b     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L19
            monitor-exit(r1)
            return r2
        L19:
            java.lang.Object r2 = r0.f22365c     // Catch: java.lang.Throwable -> L24
            o.u r2 = (o.u) r2     // Catch: java.lang.Throwable -> L24
            java.lang.Object r2 = r2.d(r7)     // Catch: java.lang.Throwable -> L24
            x2.p r2 = (x2.p) r2     // Catch: java.lang.Throwable -> L24
            goto L27
        L24:
            r7 = move-exception
            goto L97
        L27:
            monitor-exit(r1)
            x2.h r1 = r6.f24554d     // Catch: java.lang.Exception -> L8e
            r1.getClass()     // Catch: java.lang.Exception -> L8e
            x2.n r1 = r7.f24570a     // Catch: java.lang.Exception -> L8e
            r.y1 r2 = r6.f24555e     // Catch: java.lang.Exception -> L8e
            java.lang.Object r2 = r2.f18634b     // Catch: java.lang.Exception -> L8e
            r5.p r2 = (r5.p) r2     // Catch: java.lang.Exception -> L8e
            int r3 = r7.f24572c     // Catch: java.lang.Exception -> L8e
            x2.k r4 = r7.f24571b     // Catch: java.lang.Exception -> L8e
            if (r1 == 0) goto L4d
            boolean r5 = r1 instanceof x2.b     // Catch: java.lang.Exception -> L8e
            if (r5 == 0) goto L40
            goto L4d
        L40:
            boolean r5 = r1 instanceof x2.m     // Catch: java.lang.Exception -> L8e
            if (r5 == 0) goto L4b
            x2.m r1 = (x2.m) r1     // Catch: java.lang.Exception -> L8e
            android.graphics.Typeface r1 = r2.e(r1, r4, r3)     // Catch: java.lang.Exception -> L8e
            goto L5d
        L4b:
            r1 = 0
            goto L63
        L4d:
            int r1 = r2.f18860a     // Catch: java.lang.Exception -> L8e
            switch(r1) {
                case 14: goto L58;
                default: goto L52;
            }     // Catch: java.lang.Exception -> L8e
        L52:
            r1 = 0
            android.graphics.Typeface r1 = r5.p.d(r1, r4, r3)     // Catch: java.lang.Exception -> L8e
            goto L5d
        L58:
            r1 = 0
            android.graphics.Typeface r1 = r5.p.c(r1, r4, r3)     // Catch: java.lang.Exception -> L8e
        L5d:
            x2.p r2 = new x2.p     // Catch: java.lang.Exception -> L8e
            r2.<init>(r1)     // Catch: java.lang.Exception -> L8e
            r1 = r2
        L63:
            if (r1 == 0) goto L86
            java.lang.Object r2 = r0.f22364b
            pe.d r2 = (pe.d) r2
            monitor-enter(r2)
            java.lang.Object r3 = r0.f22365c     // Catch: java.lang.Throwable -> L80
            o.u r3 = (o.u) r3     // Catch: java.lang.Throwable -> L80
            java.lang.Object r3 = r3.b(r7)     // Catch: java.lang.Throwable -> L80
            if (r3 != 0) goto L82
            boolean r3 = r1.f24576b     // Catch: java.lang.Throwable -> L80
            if (r3 == 0) goto L82
            java.lang.Object r0 = r0.f22365c     // Catch: java.lang.Throwable -> L80
            o.u r0 = (o.u) r0     // Catch: java.lang.Throwable -> L80
            r0.c(r7, r1)     // Catch: java.lang.Throwable -> L80
            goto L82
        L80:
            r7 = move-exception
            goto L84
        L82:
            monitor-exit(r2)
            return r1
        L84:
            monitor-exit(r2)
            throw r7
        L86:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L8e
            java.lang.String r0 = "Could not load font"
            r7.<init>(r0)     // Catch: java.lang.Exception -> L8e
            throw r7     // Catch: java.lang.Exception -> L8e
        L8e:
            r7 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Could not load font"
            r0.<init>(r1, r7)
            throw r0
        L97:
            monitor-exit(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.e.a(x2.o):x2.p");
    }

    public final p b(n nVar, k kVar, int i10, int i11) {
        a aVar = this.f24552b;
        aVar.getClass();
        int i12 = aVar.f24550a;
        k kVar2 = (i12 == 0 || i12 == Integer.MAX_VALUE) ? kVar : new k(nh.b.k(kVar.f24566a + i12, 1, 1000));
        this.f24551a.getClass();
        return a(new o(nVar, kVar2, i10, i11, null));
    }
}
