package zg;

import ch.c0;
import ch.d0;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import tc.b0;
import ug.g0;
import ug.x;
import ug.y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o extends ch.n implements ah.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yg.c f26886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0 f26887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Socket f26888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Socket f26889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ug.q f26890f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y f26891g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b0 f26892h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ch.p f26893i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f26894j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f26895k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f26896l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f26897m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f26898n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f26899o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f26900p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f26901q;

    public o(yg.c cVar, h9.b bVar, g0 g0Var, Socket socket, Socket socket2, ug.q qVar, y yVar, b0 b0Var) {
        jc.l.e(cVar, "taskRunner");
        jc.l.e(bVar, "connectionPool");
        jc.l.e(g0Var, "route");
        jc.l.e(socket, "rawSocket");
        jc.l.e(socket2, "javaNetSocket");
        jc.l.e(yVar, "protocol");
        jc.l.e(b0Var, "socket");
        this.f26886b = cVar;
        this.f26887c = g0Var;
        this.f26888d = socket;
        this.f26889e = socket2;
        this.f26890f = qVar;
        this.f26891g = yVar;
        this.f26892h = b0Var;
        this.f26899o = 1;
        this.f26900p = new ArrayList();
        this.f26901q = Long.MAX_VALUE;
    }

    public static void c(x xVar, g0 g0Var, IOException iOException) {
        jc.l.e(g0Var, "failedRoute");
        jc.l.e(iOException, "failure");
        if (g0Var.f21795b.type() != Proxy.Type.DIRECT) {
            ug.a aVar = g0Var.f21794a;
            aVar.f21715g.connectFailed(aVar.f21716h.i(), g0Var.f21795b.address(), iOException);
        }
        xa.h hVar = xVar.B;
        synchronized (hVar) {
            ((LinkedHashSet) hVar.f24888a).add(g0Var);
        }
    }

    @Override // ch.n
    public final void a(ch.p pVar, c0 c0Var) {
        jc.l.e(c0Var, "settings");
        synchronized (this) {
            this.f26899o = (c0Var.f4157a & 8) != 0 ? c0Var.f4158b[3] : Integer.MAX_VALUE;
        }
    }

    @Override // ch.n
    public final void b(ch.x xVar) {
        xVar.c(ch.b.f4151g, null);
    }

    @Override // ah.e
    public final void cancel() {
        wg.g.b(this.f26888d);
    }

    public final void d() {
        synchronized (this) {
            this.f26897m++;
        }
    }

    @Override // ah.e
    public final void e(n nVar, IOException iOException) {
        synchronized (this) {
            try {
                if (!(iOException instanceof d0)) {
                    if (!(this.f26893i != null) || (iOException instanceof ch.a)) {
                        this.f26894j = true;
                        if (this.f26897m == 0) {
                            if (iOException != null) {
                                c(nVar.f26868a, this.f26887c, iOException);
                            }
                            this.f26896l++;
                        }
                    }
                } else if (((d0) iOException).f4168a == ch.b.f4151g) {
                    int i10 = this.f26898n + 1;
                    this.f26898n = i10;
                    if (i10 > 1) {
                        this.f26894j = true;
                        this.f26896l++;
                    }
                } else if (((d0) iOException).f4168a != ch.b.f4152h || !nVar.f26883p) {
                    this.f26894j = true;
                    this.f26896l++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ah.e
    public final void f() {
        synchronized (this) {
            this.f26894j = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(ug.a r11, java.util.List r12) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zg.o.g(ug.a, java.util.List):boolean");
    }

    @Override // ah.e
    public final g0 h() {
        return this.f26887c;
    }

    public final boolean i(boolean z10) {
        long j10;
        TimeZone timeZone = wg.g.f24231a;
        long jNanoTime = System.nanoTime();
        if (this.f26888d.isClosed() || this.f26889e.isClosed() || this.f26889e.isInputShutdown() || this.f26889e.isOutputShutdown()) {
            return false;
        }
        ch.p pVar = this.f26893i;
        if (pVar != null) {
            return pVar.i(jNanoTime);
        }
        synchronized (this) {
            j10 = jNanoTime - this.f26901q;
        }
        if (j10 < 10000000000L || !z10) {
            return true;
        }
        Socket socket = this.f26889e;
        lh.b0 b0Var = (lh.b0) this.f26892h.f20619c;
        jc.l.e(socket, "<this>");
        jc.l.e(b0Var, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !b0Var.b();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final void j() throws SocketException {
        this.f26901q = System.nanoTime();
        y yVar = this.f26891g;
        if (yVar == y.f21937f || yVar == y.f21938g) {
            this.f26889e.setSoTimeout(0);
            ch.c cVar = ch.c.f4156a;
            ch.l lVar = new ch.l(this.f26886b);
            b0 b0Var = this.f26892h;
            String str = this.f26887c.f21794a.f21716h.f21872d;
            jc.l.e(b0Var, "socket");
            jc.l.e(str, "peerName");
            lVar.f4202c = b0Var;
            String str2 = wg.g.f24232b + ' ' + str;
            jc.l.e(str2, "<set-?>");
            lVar.f4203d = str2;
            lVar.f4204e = this;
            lVar.f4205f = cVar;
            ch.p pVar = new ch.p(lVar);
            this.f26893i = pVar;
            c0 c0Var = ch.p.f4210z;
            this.f26899o = (c0Var.f4157a & 8) != 0 ? c0Var.f4158b[3] : Integer.MAX_VALUE;
            ch.y yVar2 = pVar.f4233w;
            synchronized (yVar2) {
                try {
                    if (yVar2.f4282d) {
                        throw new IOException("closed");
                    }
                    Logger logger = ch.y.f4278f;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(wg.g.c(">> CONNECTION " + ch.h.f4186a.e(), new Object[0]));
                    }
                    yVar2.f4279a.J(ch.h.f4186a);
                    yVar2.f4279a.flush();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            pVar.f4233w.u(pVar.f4227q);
            if (pVar.f4227q.a() != 65535) {
                pVar.f4233w.y(0, r2 - 65535);
            }
            yg.b.c(pVar.f4217g.d(), pVar.f4213c, pVar.f4234x);
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        g0 g0Var = this.f26887c;
        sb.append(g0Var.f21794a.f21716h.f21872d);
        sb.append(':');
        sb.append(g0Var.f21794a.f21716h.f21873e);
        sb.append(", proxy=");
        sb.append(g0Var.f21795b);
        sb.append(" hostAddress=");
        sb.append(g0Var.f21796c);
        sb.append(" cipherSuite=");
        ug.q qVar = this.f26890f;
        if (qVar == null || (obj = qVar.f21856b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f26891g);
        sb.append('}');
        return sb.toString();
    }
}
