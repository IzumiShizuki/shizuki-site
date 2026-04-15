package ch;

import b0.w1;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p implements Closeable {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final c0 f4210z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f4211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f4212b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4216f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final yg.c f4217g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final yg.b f4218h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final yg.b f4219i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final yg.b f4220j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b0 f4221k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f4222l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f4223m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f4224n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f4225o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f4226p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c0 f4227q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c0 f4228r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final dh.a f4229s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f4230t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f4231u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final tc.b0 f4232v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f4233w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final bd.i f4234x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final LinkedHashSet f4235y;

    static {
        c0 c0Var = new c0();
        c0Var.c(4, 65535);
        c0Var.c(5, 16384);
        f4210z = c0Var;
    }

    public p(l lVar) {
        this.f4211a = (n) lVar.f4204e;
        String str = (String) lVar.f4203d;
        if (str == null) {
            jc.l.k("connectionName");
            throw null;
        }
        this.f4213c = str;
        this.f4215e = 3;
        yg.c cVar = (yg.c) lVar.f4201b;
        this.f4217g = cVar;
        this.f4218h = cVar.d();
        this.f4219i = cVar.d();
        this.f4220j = cVar.d();
        this.f4221k = b0.f4155a;
        this.f4226p = (c) lVar.f4205f;
        c0 c0Var = new c0();
        c0Var.c(4, 16777216);
        this.f4227q = c0Var;
        this.f4228r = f4210z;
        this.f4229s = new dh.a(0);
        this.f4231u = r0.a();
        tc.b0 b0Var = (tc.b0) lVar.f4202c;
        if (b0Var == null) {
            jc.l.k("socket");
            throw null;
        }
        this.f4232v = b0Var;
        this.f4233w = new y((lh.a0) b0Var.f20620d);
        this.f4234x = new bd.i(3, this, new t((lh.b0) b0Var.f20619c));
        this.f4235y = new LinkedHashSet();
    }

    public final void b(b bVar, b bVar2, IOException iOException) {
        int i10;
        Object[] array;
        TimeZone timeZone = wg.g.f24231a;
        try {
            n(bVar);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f4212b.isEmpty()) {
                array = null;
            } else {
                array = this.f4212b.values().toArray(new x[0]);
                this.f4212b.clear();
            }
        }
        x[] xVarArr = (x[]) array;
        if (xVarArr != null) {
            for (x xVar : xVarArr) {
                try {
                    xVar.c(bVar2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f4233w.close();
        } catch (IOException unused3) {
        }
        try {
            ((Socket) ((w1) this.f4232v.f20618b).f1395c).close();
        } catch (IOException unused4) {
        }
        this.f4218h.g();
        this.f4219i.g();
        this.f4220j.g();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b(b.f4147c, b.f4152h, null);
    }

    public final void flush() {
        this.f4233w.flush();
    }

    public final x g(int i10) {
        x xVar;
        synchronized (this) {
            xVar = (x) this.f4212b.get(Integer.valueOf(i10));
        }
        return xVar;
    }

    public final boolean i(long j10) {
        synchronized (this) {
            if (this.f4216f) {
                return false;
            }
            if (this.f4224n < this.f4223m) {
                if (j10 >= this.f4225o) {
                    return false;
                }
            }
            return true;
        }
    }

    public final x k(int i10) {
        x xVar;
        synchronized (this) {
            xVar = (x) this.f4212b.remove(Integer.valueOf(i10));
            notifyAll();
        }
        return xVar;
    }

    public final void n(b bVar) {
        synchronized (this.f4233w) {
            synchronized (this) {
                if (this.f4216f) {
                    return;
                }
                this.f4216f = true;
                this.f4233w.k(this.f4214d, bVar, wg.e.f24227a);
            }
        }
    }

    public final void o(long j10) {
        synchronized (this) {
            try {
                dh.a.b(this.f4229s, j10, 0L, 2);
                long jA = this.f4229s.a();
                if (jA >= this.f4227q.a() / 2) {
                    y(0, jA);
                    dh.a.b(this.f4229s, 0L, jA, 1);
                }
                c cVar = this.f4226p;
                dh.a aVar = this.f4229s;
                cVar.getClass();
                jc.l.e(aVar, "windowCounter");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r5 - r3), r8.f4233w.f4281c);
        r6 = r3;
        r8.f4230t += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(int r9, boolean r10, lh.f r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto Ld
            ch.y r12 = r8.f4233w
            r12.g(r10, r9, r11, r0)
            return
        Ld:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L68
            monitor-enter(r8)
        L12:
            long r3 = r8.f4230t     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            long r5 = r8.f4231u     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L34
            java.util.LinkedHashMap r3 = r8.f4212b     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            if (r3 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            goto L12
        L2a:
            r9 = move-exception
            goto L66
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
        L34:
            long r5 = r5 - r3
            long r3 = java.lang.Math.min(r12, r5)     // Catch: java.lang.Throwable -> L2a
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L2a
            ch.y r3 = r8.f4233w     // Catch: java.lang.Throwable -> L2a
            int r3 = r3.f4281c     // Catch: java.lang.Throwable -> L2a
            int r3 = java.lang.Math.min(r4, r3)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.f4230t     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r3     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.f4230t = r4     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            ch.y r4 = r8.f4233w
            if (r10 == 0) goto L54
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L54
            r5 = 1
            goto L55
        L54:
            r5 = 0
        L55:
            r4.g(r5, r9, r11, r3)
            goto Ld
        L59:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L66:
            monitor-exit(r8)
            throw r9
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.p.q(int, boolean, lh.f, long):void");
    }

    public final void u(int i10, b bVar) {
        yg.b.c(this.f4218h, this.f4213c + '[' + i10 + "] writeSynReset", new ba.d0(this, i10, bVar, 1));
    }

    public final void y(final int i10, final long j10) {
        yg.b.c(this.f4218h, this.f4213c + '[' + i10 + "] windowUpdate", new ic.a() { // from class: ch.i
            @Override // ic.a
            public final Object b() {
                p pVar = this.f4190a;
                try {
                    pVar.f4233w.y(i10, j10);
                } catch (IOException e10) {
                    b bVar = b.f4148d;
                    pVar.b(bVar, bVar, e10);
                }
                return ub.a0.f21526a;
            }
        });
    }
}
