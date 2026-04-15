package yg;

import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jc.l;
import wg.g;
import xg.e;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f26347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f26349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f26350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f26351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f26352f;

    public b(c cVar, String str) {
        l.e(str, "name");
        this.f26347a = cVar;
        this.f26348b = str;
        this.f26351e = new ArrayList();
    }

    public static void c(b bVar, String str, ic.a aVar) {
        bVar.getClass();
        l.e(str, "name");
        l.e(aVar, "block");
        bVar.d(new e(str, aVar), 0L);
    }

    public final void a() {
        c cVar = this.f26347a;
        TimeZone timeZone = g.f24231a;
        synchronized (cVar) {
            if (b()) {
                this.f26347a.c(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.f26350d;
        if (aVar != null && aVar.f26344b) {
            this.f26352f = true;
        }
        ArrayList arrayList = this.f26351e;
        boolean z10 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f26344b) {
                Logger logger = this.f26347a.f26356b;
                a aVar2 = (a) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    ua.l.H(logger, aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z10 = true;
            }
        }
        return z10;
    }

    public final void d(a aVar, long j10) {
        l.e(aVar, "task");
        synchronized (this.f26347a) {
            if (!this.f26349c) {
                if (f(aVar, j10, false)) {
                    this.f26347a.c(this);
                }
            } else if (aVar.f26344b) {
                Logger logger = this.f26347a.f26356b;
                if (logger.isLoggable(Level.FINE)) {
                    ua.l.H(logger, aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                Logger logger2 = this.f26347a.f26356b;
                if (logger2.isLoggable(Level.FINE)) {
                    ua.l.H(logger2, aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(yg.a r13, long r14, boolean r16) {
        /*
            r12 = this;
            yg.c r0 = r12.f26347a
            java.util.logging.Logger r0 = r0.f26356b
            java.lang.String r1 = "task"
            jc.l.e(r13, r1)
            yg.b r1 = r13.f26345c
            if (r1 != r12) goto Le
            goto L12
        Le:
            if (r1 != 0) goto L8a
            r13.f26345c = r12
        L12:
            long r1 = java.lang.System.nanoTime()
            long r3 = r1 + r14
            java.util.ArrayList r5 = r12.f26351e
            int r6 = r5.indexOf(r13)
            r7 = 0
            r8 = -1
            if (r6 == r8) goto L39
            long r9 = r13.f26346d
            int r11 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r11 > 0) goto L36
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            boolean r1 = r0.isLoggable(r1)
            if (r1 == 0) goto L89
            java.lang.String r1 = "already scheduled"
            ua.l.H(r0, r13, r12, r1)
            return r7
        L36:
            r5.remove(r6)
        L39:
            r13.f26346d = r3
            java.util.logging.Level r6 = java.util.logging.Level.FINE
            boolean r6 = r0.isLoggable(r6)
            if (r6 == 0) goto L5f
            if (r16 == 0) goto L51
            long r3 = r3 - r1
            java.lang.String r3 = ua.l.P(r3)
            java.lang.String r4 = "run again after "
            java.lang.String r3 = r4.concat(r3)
            goto L5c
        L51:
            long r3 = r3 - r1
            java.lang.String r3 = ua.l.P(r3)
            java.lang.String r4 = "scheduled after "
            java.lang.String r3 = r4.concat(r3)
        L5c:
            ua.l.H(r0, r13, r12, r3)
        L5f:
            java.util.Iterator r0 = r5.iterator()
            r3 = 0
        L64:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L7b
            java.lang.Object r4 = r0.next()
            yg.a r4 = (yg.a) r4
            long r9 = r4.f26346d
            long r9 = r9 - r1
            int r4 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r4 <= 0) goto L78
            goto L7c
        L78:
            int r3 = r3 + 1
            goto L64
        L7b:
            r3 = -1
        L7c:
            if (r3 != r8) goto L82
            int r3 = r5.size()
        L82:
            r5.add(r3, r13)
            if (r3 != 0) goto L89
            r13 = 1
            return r13
        L89:
            return r7
        L8a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "task is in multiple queues"
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.b.f(yg.a, long, boolean):boolean");
    }

    public final void g() {
        c cVar = this.f26347a;
        TimeZone timeZone = g.f24231a;
        synchronized (cVar) {
            this.f26349c = true;
            if (b()) {
                this.f26347a.c(this);
            }
        }
    }

    public final String toString() {
        return this.f26348b;
    }
}
