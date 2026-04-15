package h1;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import x0.k1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jc.m f8089a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8091c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public androidx.media3.exoplayer.offline.g f8096h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public x f8097i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f8090b = new AtomicReference(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a9.r f8092d = new a9.r(6, this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e7.y f8093e = new e7.y(5, this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z0.e f8094f = new z0.e(new x[16]);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f8095g = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f8098j = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public y(ic.k kVar) {
        this.f8089a = (jc.m) kVar;
    }

    public final void a() {
        synchronized (this.f8095g) {
            z0.e eVar = this.f8094f;
            Object[] objArr = eVar.f26372a;
            int i10 = eVar.f26374c;
            for (int i11 = 0; i11 < i10; i11++) {
                x xVar = (x) objArr[i11];
                xVar.f8081e.a();
                xVar.f8082f.a();
                xVar.f8087k.a();
                xVar.f8088l.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object r24) {
        /*
            r23 = this;
            r1 = r23
            r0 = r24
            java.lang.Object r2 = r1.f8095g
            monitor-enter(r2)
            z0.e r3 = r1.f8094f     // Catch: java.lang.Throwable -> L90
            int r4 = r3.f26374c     // Catch: java.lang.Throwable -> L90
            r6 = 0
            r7 = 0
        Ld:
            if (r6 >= r4) goto L98
            java.lang.Object[] r8 = r3.f26372a     // Catch: java.lang.Throwable -> L90
            r8 = r8[r6]     // Catch: java.lang.Throwable -> L90
            h1.x r8 = (h1.x) r8     // Catch: java.lang.Throwable -> L90
            o.k0 r9 = r8.f8082f     // Catch: java.lang.Throwable -> L90
            java.lang.Object r9 = r9.k(r0)     // Catch: java.lang.Throwable -> L90
            o.f0 r9 = (o.f0) r9     // Catch: java.lang.Throwable -> L90
            if (r9 != 0) goto L22
        L1f:
            r16 = r6
            goto L7a
        L22:
            java.lang.Object[] r10 = r9.f15954b     // Catch: java.lang.Throwable -> L90
            int[] r11 = r9.f15955c     // Catch: java.lang.Throwable -> L90
            long[] r9 = r9.f15953a     // Catch: java.lang.Throwable -> L90
            int r12 = r9.length     // Catch: java.lang.Throwable -> L90
            int r12 = r12 + (-2)
            if (r12 < 0) goto L1f
            r13 = 0
        L2e:
            r14 = r9[r13]     // Catch: java.lang.Throwable -> L90
            r16 = r6
            long r5 = ~r14     // Catch: java.lang.Throwable -> L90
            r17 = 7
            long r5 = r5 << r17
            long r5 = r5 & r14
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r17
            int r19 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r19 == 0) goto L71
            int r5 = r13 - r12
            int r5 = ~r5     // Catch: java.lang.Throwable -> L90
            int r5 = r5 >>> 31
            r6 = 8
            int r5 = 8 - r5
            r6 = 0
            r17 = 8
        L4f:
            if (r6 >= r5) goto L6d
            r18 = 255(0xff, double:1.26E-321)
            long r18 = r14 & r18
            r20 = 128(0x80, double:6.3E-322)
            int r22 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r22 >= 0) goto L66
            int r18 = r13 << 3
            int r18 = r18 + r6
            r1 = r10[r18]     // Catch: java.lang.Throwable -> L90
            r18 = r11[r18]     // Catch: java.lang.Throwable -> L90
            r8.d(r0, r1)     // Catch: java.lang.Throwable -> L90
        L66:
            long r14 = r14 >> r17
            int r6 = r6 + 1
            r1 = r23
            goto L4f
        L6d:
            r1 = 8
            if (r5 != r1) goto L7a
        L71:
            if (r13 == r12) goto L7a
            int r13 = r13 + 1
            r1 = r23
            r6 = r16
            goto L2e
        L7a:
            o.k0 r1 = r8.f8082f     // Catch: java.lang.Throwable -> L90
            boolean r1 = r1.j()     // Catch: java.lang.Throwable -> L90
            if (r1 != 0) goto L85
            int r7 = r7 + 1
            goto L92
        L85:
            if (r7 <= 0) goto L92
            java.lang.Object[] r1 = r3.f26372a     // Catch: java.lang.Throwable -> L90
            int r6 = r16 - r7
            r5 = r1[r16]     // Catch: java.lang.Throwable -> L90
            r1[r6] = r5     // Catch: java.lang.Throwable -> L90
            goto L92
        L90:
            r0 = move-exception
            goto La3
        L92:
            int r6 = r16 + 1
            r1 = r23
            goto Ld
        L98:
            java.lang.Object[] r0 = r3.f26372a     // Catch: java.lang.Throwable -> L90
            int r1 = r4 - r7
            vb.l.p0(r1, r4, r0)     // Catch: java.lang.Throwable -> L90
            r3.f26374c = r1     // Catch: java.lang.Throwable -> L90
            monitor-exit(r2)
            return
        La3:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.y.b(java.lang.Object):void");
    }

    public final boolean c() {
        boolean z10;
        Set set;
        Set set2;
        synchronized (this.f8095g) {
            z10 = this.f8091c;
        }
        if (z10) {
            return false;
        }
        boolean z11 = false;
        while (true) {
            AtomicReference atomicReference = this.f8090b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                Object obj2 = null;
                Object objSubList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        x0.p.d("Unexpected notification");
                        throw new ce.j0();
                    }
                    List list = (List) obj;
                    Set set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set2 = set3;
                    obj2 = objSubList;
                }
                while (!atomicReference.compareAndSet(obj, obj2)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set = set2;
                break;
            }
            if (set == null) {
                return z11;
            }
            synchronized (this.f8095g) {
                z0.e eVar = this.f8094f;
                Object[] objArr = eVar.f26372a;
                int i10 = eVar.f26374c;
                for (int i11 = 0; i11 < i10; i11++) {
                    z11 = ((x) objArr[i11]).b(set) || z11;
                }
            }
        }
    }

    public final void d(Object obj, ic.k kVar, ic.a aVar) {
        Object obj2;
        x xVar;
        synchronized (this.f8095g) {
            z0.e eVar = this.f8094f;
            Object[] objArr = eVar.f26372a;
            int i10 = eVar.f26374c;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i11];
                if (((x) obj2).f8077a == kVar) {
                    break;
                } else {
                    i11++;
                }
            }
            xVar = (x) obj2;
            if (xVar == null) {
                jc.l.c(kVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
                jc.c0.c(1, kVar);
                xVar = new x(kVar);
                eVar.b(xVar);
            }
        }
        x xVar2 = this.f8097i;
        long j10 = this.f8098j;
        if (j10 != -1 && j10 != f1.g.c()) {
            k1.a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j10 + "), currentThread={id=" + f1.g.c() + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
        }
        try {
            this.f8097i = xVar;
            this.f8098j = f1.g.c();
            xVar.a(obj, this.f8093e, aVar);
        } finally {
            this.f8097i = xVar2;
            this.f8098j = j10;
        }
    }

    public final void e() {
        a9.r rVar = this.f8092d;
        n.f(n.f8049a);
        synchronized (n.f8051c) {
            n.f8056h = vb.m.r0((Collection) n.f8056h, rVar);
        }
        this.f8096h = new androidx.media3.exoplayer.offline.g(13, rVar);
    }
}
