package nf;

import hf.h0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final app.nekogram.translator.r f15814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final app.nekogram.translator.r f15815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final app.nekogram.translator.r f15816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final app.nekogram.translator.r f15817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m9.d f15818e = new m9.d(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m9.d f15819f = new m9.d(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m9.d f15820g = new m9.d(5);

    static {
        int i10 = 7;
        f15814a = new app.nekogram.translator.r(i10, "CLOSED");
        f15815b = new app.nekogram.translator.r(i10, "UNDEFINED");
        f15816c = new app.nekogram.translator.r(i10, "REUSABLE_CLAIMED");
        f15817d = new app.nekogram.translator.r(i10, "NO_THREAD_ELEMENTS");
    }

    public static final void a(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException(t0.B(i10, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final Object b(r rVar, long j10, ic.n nVar) {
        while (true) {
            if (rVar.f15854c >= j10 && !rVar.d()) {
                return rVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f15821a;
            Object obj = atomicReferenceFieldUpdater.get(rVar);
            app.nekogram.translator.r rVar2 = f15814a;
            if (obj == rVar2) {
                return rVar2;
            }
            r rVar3 = (r) ((c) obj);
            if (rVar3 == null) {
                rVar3 = (r) nVar.q(Long.valueOf(rVar.f15854c + 1), rVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(rVar, null, rVar3)) {
                    if (atomicReferenceFieldUpdater.get(rVar) != null) {
                        break;
                    }
                }
                if (rVar.d()) {
                    rVar.e();
                }
            }
            rVar = rVar3;
        }
    }

    public static final r c(Object obj) {
        if (obj != f15814a) {
            return (r) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(Throwable th2, yb.h hVar) {
        Throwable runtimeException;
        Iterator it = e.f15824a.iterator();
        while (it.hasNext()) {
            try {
                ((hf.w) it.next()).o(th2, hVar);
            } catch (Throwable th3) {
                if (th2 == th3) {
                    runtimeException = th2;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    ub.a.a(runtimeException, th2);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            ub.a.a(th2, new f(hVar));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
    }

    public static final boolean e(Object obj) {
        return obj == f15814a;
    }

    public static final Object f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void g(yb.h hVar, Object obj) {
        if (obj == f15817d) {
            return;
        }
        if (!(obj instanceof x)) {
            Object objY = hVar.y(f15819f, null);
            jc.l.c(objY, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((u) objY).a(obj);
            return;
        }
        x xVar = (x) obj;
        u[] uVarArr = xVar.f15865c;
        int length = uVarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            u uVar = uVarArr[length];
            jc.l.b(uVar);
            uVar.a(xVar.f15864b[length]);
            if (i10 < 0) {
                return;
            } else {
                length = i10;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008a A[Catch: all -> 0x0069, DONT_GENERATE, TryCatch #2 {all -> 0x0069, blocks: (B:16:0x0049, B:18:0x0057, B:20:0x005d, B:33:0x008d, B:23:0x006b, B:25:0x0079, B:30:0x0084, B:32:0x008a, B:38:0x009a, B:41:0x00a3, B:40:0x00a0, B:28:0x007f), top: B:54:0x0049, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(java.lang.Object r9, yb.c r10) throws hf.h0 {
        /*
            boolean r0 = r10 instanceof nf.g
            if (r0 == 0) goto Lae
            nf.g r10 = (nf.g) r10
            hf.u r0 = r10.f15827d
            ac.c r1 = r10.f15828e
            java.lang.Throwable r2 = ub.n.a(r9)
            if (r2 != 0) goto L12
            r3 = r9
            goto L18
        L12:
            hf.s r3 = new hf.s
            r4 = 0
            r3.<init>(r2, r4)
        L18:
            yb.h r2 = r1.s()
            boolean r2 = j(r0, r2)
            r4 = 1
            if (r2 == 0) goto L2f
            r10.f15829f = r3
            r10.f8552c = r4
            yb.h r9 = r1.s()
            i(r0, r9, r10)
            return
        L2f:
            hf.v0 r0 = hf.u1.a()
            long r5 = r0.f8601c
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L46
            r10.f15829f = r3
            r10.f8552c = r4
            r0.j0(r10)
            goto La8
        L46:
            r0.l0(r4)
            yb.h r2 = r1.s()     // Catch: java.lang.Throwable -> L69
            hf.v r3 = hf.v.f8599b     // Catch: java.lang.Throwable -> L69
            yb.f r2 = r2.R(r3)     // Catch: java.lang.Throwable -> L69
            hf.d1 r2 = (hf.d1) r2     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto L6b
            boolean r3 = r2.b()     // Catch: java.lang.Throwable -> L69
            if (r3 != 0) goto L6b
            java.util.concurrent.CancellationException r9 = r2.u()     // Catch: java.lang.Throwable -> L69
            ub.m r9 = ub.a.b(r9)     // Catch: java.lang.Throwable -> L69
            r10.h(r9)     // Catch: java.lang.Throwable -> L69
            goto L8d
        L69:
            r9 = move-exception
            goto La4
        L6b:
            java.lang.Object r2 = r10.f15830g     // Catch: java.lang.Throwable -> L69
            yb.h r3 = r1.s()     // Catch: java.lang.Throwable -> L69
            java.lang.Object r2 = n(r3, r2)     // Catch: java.lang.Throwable -> L69
            app.nekogram.translator.r r5 = nf.b.f15817d     // Catch: java.lang.Throwable -> L69
            if (r2 == r5) goto L7e
            hf.a2 r5 = hf.a0.G(r1, r3, r2)     // Catch: java.lang.Throwable -> L69
            goto L7f
        L7e:
            r5 = 0
        L7f:
            r1.h(r9)     // Catch: java.lang.Throwable -> L97
            if (r5 == 0) goto L8a
            boolean r9 = r5.p0()     // Catch: java.lang.Throwable -> L69
            if (r9 == 0) goto L8d
        L8a:
            g(r3, r2)     // Catch: java.lang.Throwable -> L69
        L8d:
            boolean r9 = r0.n0()     // Catch: java.lang.Throwable -> L69
            if (r9 != 0) goto L8d
        L93:
            r0.i0(r4)
            goto La8
        L97:
            r9 = move-exception
            if (r5 == 0) goto La0
            boolean r1 = r5.p0()     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto La3
        La0:
            g(r3, r2)     // Catch: java.lang.Throwable -> L69
        La3:
            throw r9     // Catch: java.lang.Throwable -> L69
        La4:
            r10.g(r9)     // Catch: java.lang.Throwable -> La9
            goto L93
        La8:
            return
        La9:
            r9 = move-exception
            r0.i0(r4)
            throw r9
        Lae:
            r10.h(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nf.b.h(java.lang.Object, yb.c):void");
    }

    public static final void i(hf.u uVar, yb.h hVar, Runnable runnable) throws h0 {
        try {
            uVar.e0(hVar, runnable);
        } catch (Throwable th2) {
            throw new h0(th2, uVar, hVar);
        }
    }

    public static final boolean j(hf.u uVar, yb.h hVar) throws h0 {
        try {
            return uVar.g0(hVar);
        } catch (Throwable th2) {
            throw new h0(th2, uVar, hVar);
        }
    }

    public static final long k(String str, long j10, long j11, long j12) {
        String property;
        int i10 = t.f15856a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j10;
        }
        Long lM0 = ef.u.m0(property);
        if (lM0 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lM0.longValue();
        if (j11 <= jLongValue && jLongValue <= j12) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j11 + ".." + j12 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int l(int i10, int i11, String str) {
        return (int) k(str, i10, 1, (i11 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final Object m(yb.h hVar) {
        Object objY = hVar.y(f15818e, 0);
        jc.l.b(objY);
        return objY;
    }

    public static final Object n(yb.h hVar, Object obj) {
        if (obj == null) {
            obj = m(hVar);
        }
        if (obj == 0) {
            return f15817d;
        }
        if (!(obj instanceof Integer)) {
            return ((u) obj).c(hVar);
        }
        return hVar.y(f15820g, new x(((Number) obj).intValue(), hVar));
    }
}
