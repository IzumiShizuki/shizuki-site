package ch;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.TimeZone;
import lh.f0;
import lh.g0;
import lh.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f4266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dh.a f4267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f4268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f4269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque f4270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v f4272h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u f4273i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w f4274j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final w f4275k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b f4276l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IOException f4277m;

    public x(int i10, p pVar, boolean z10, boolean z11, ug.r rVar) {
        jc.l.e(pVar, "connection");
        this.f4265a = i10;
        this.f4266b = pVar;
        this.f4267c = new dh.a(i10);
        this.f4269e = pVar.f4228r.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f4270f = arrayDeque;
        this.f4272h = new v(this, pVar.f4227q.a(), z11);
        this.f4273i = new u(this, z10);
        this.f4274j = new w(this);
        this.f4275k = new w(this);
        if (rVar == null) {
            if (!g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (g()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(rVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r2 = this;
            java.util.TimeZone r0 = wg.g.f24231a
            monitor-enter(r2)
            ch.v r0 = r2.f4272h     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.f4259b     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1c
            boolean r0 = r0.f4262e     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            ch.u r0 = r2.f4273i     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.f4254a     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1a
            boolean r0 = r0.f4256c     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            goto L1a
        L18:
            r0 = move-exception
            goto L35
        L1a:
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            boolean r1 = r2.h()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2)
            if (r0 == 0) goto L2b
            ch.b r0 = ch.b.f4152h
            r1 = 0
            r2.c(r0, r1)
            return
        L2b:
            if (r1 != 0) goto L34
            ch.p r0 = r2.f4266b
            int r1 = r2.f4265a
            r0.k(r1)
        L34:
            return
        L35:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.x.a():void");
    }

    public final void b() throws IOException {
        u uVar = this.f4273i;
        if (uVar.f4256c) {
            throw new IOException("stream closed");
        }
        if (uVar.f4254a) {
            throw new IOException("stream finished");
        }
        if (f() != null) {
            IOException iOException = this.f4277m;
            if (iOException != null) {
                throw iOException;
            }
            b bVarF = f();
            jc.l.b(bVarF);
            throw new d0(bVarF);
        }
    }

    public final void c(b bVar, IOException iOException) {
        if (d(bVar, iOException)) {
            this.f4266b.f4233w.q(this.f4265a, bVar);
        }
    }

    public final boolean d(b bVar, IOException iOException) {
        TimeZone timeZone = wg.g.f24231a;
        synchronized (this) {
            if (f() != null) {
                return false;
            }
            this.f4276l = bVar;
            this.f4277m = iOException;
            notifyAll();
            if (this.f4272h.f4259b) {
                if (this.f4273i.f4254a) {
                    return false;
                }
            }
            this.f4266b.k(this.f4265a);
            return true;
        }
    }

    public final void e(b bVar) {
        if (d(bVar, null)) {
            this.f4266b.u(this.f4265a, bVar);
        }
    }

    public final b f() {
        b bVar;
        synchronized (this) {
            bVar = this.f4276l;
        }
        return bVar;
    }

    public final boolean g() {
        boolean z10 = (this.f4265a & 1) == 1;
        this.f4266b.getClass();
        return true == z10;
    }

    public final boolean h() {
        synchronized (this) {
            try {
                if (f() != null) {
                    return false;
                }
                v vVar = this.f4272h;
                if (vVar.f4259b || vVar.f4262e) {
                    u uVar = this.f4273i;
                    if (uVar.f4254a || uVar.f4256c) {
                        if (this.f4271g) {
                            return false;
                        }
                    }
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i(ug.r rVar, boolean z10) {
        boolean zH;
        jc.l.e(rVar, "headers");
        TimeZone timeZone = wg.g.f24231a;
        synchronized (this) {
            try {
                if (this.f4271g && rVar.a(":status") == null && rVar.a(":method") == null) {
                    this.f4272h.getClass();
                } else {
                    this.f4271g = true;
                    this.f4270f.add(rVar);
                }
                if (z10) {
                    this.f4272h.f4259b = true;
                }
                zH = h();
                notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zH) {
            return;
        }
        this.f4266b.k(this.f4265a);
    }

    public final void j(b bVar) {
        synchronized (this) {
            if (f() == null) {
                this.f4276l = bVar;
                notifyAll();
            }
        }
    }

    @Override // lh.g0
    public final h0 m() {
        return this.f4272h;
    }

    @Override // lh.g0
    public final f0 v() {
        return this.f4273i;
    }
}
