package zg;

import b0.w1;
import b5.d0;
import b7.b1;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ug.t;
import ug.x;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f26868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b1 f26869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h9.b f26870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f26871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f26872e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f26873f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h f26874g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public o f26875h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f26876i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d0 f26877j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f26878k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f26879l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f26880m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f26881n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f26882o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile boolean f26883p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile d0 f26884q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArrayList f26885r;

    public n(x xVar, b1 b1Var) {
        jc.l.e(b1Var, "originalRequest");
        this.f26868a = xVar;
        this.f26869b = b1Var;
        this.f26870c = (h9.b) xVar.D.f18634b;
        xVar.f21910d.getClass();
        m mVar = new m(this);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        mVar.g(0);
        this.f26871d = mVar;
        this.f26872e = new AtomicBoolean();
        this.f26882o = true;
        this.f26885r = new CopyOnWriteArrayList();
        new AtomicReference((ud.n) b1Var.f1654f);
    }

    public static final String a(n nVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(nVar.f26883p ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(((t) nVar.f26869b.f1650b).h());
        return sb.toString();
    }

    public final void b(o oVar) {
        jc.l.e(oVar, "connection");
        TimeZone timeZone = wg.g.f24231a;
        if (this.f26875h != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.f26875h = oVar;
        oVar.f26900p.add(new l(this, this.f26873f));
    }

    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket socketK;
        TimeZone timeZone = wg.g.f24231a;
        o oVar = this.f26875h;
        if (oVar != null) {
            synchronized (oVar) {
                socketK = k();
            }
            if (this.f26875h == null) {
                if (socketK != null) {
                    wg.g.b(socketK);
                }
            } else if (socketK != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.f26876i && this.f26871d.i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            jc.l.b(interruptedIOException);
        }
        return interruptedIOException;
    }

    public final Object clone() {
        return new n(this.f26868a, this.f26869b);
    }

    public final void d() {
        if (this.f26883p) {
            return;
        }
        this.f26883p = true;
        d0 d0Var = this.f26884q;
        if (d0Var != null) {
            ((ah.f) d0Var.f1523d).cancel();
        }
        Iterator it = this.f26885r.iterator();
        jc.l.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((s) it.next()).cancel();
        }
    }

    public final void e(ug.i iVar) {
        if (!this.f26872e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        fh.e eVar = fh.e.f7102a;
        this.f26873f = fh.e.f7102a.h();
        w1 w1Var = this.f26868a.f21907a;
        k kVar = new k(this, iVar);
        w1Var.getClass();
        w1.Z(w1Var, kVar, null, null, 6);
    }

    public final ug.d0 f() {
        if (!this.f26872e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f26871d.h();
        fh.e eVar = fh.e.f7102a;
        this.f26873f = fh.e.f7102a.h();
        try {
            w1 w1Var = this.f26868a.f21907a;
            synchronized (w1Var) {
                ((ArrayDeque) w1Var.f1394b).add(this);
            }
            return h();
        } finally {
            w1 w1Var2 = this.f26868a.f21907a;
            w1Var2.getClass();
            w1.Z(w1Var2, null, this, null, 5);
        }
    }

    public final void g(boolean z10) {
        d0 d0Var;
        synchronized (this) {
            if (!this.f26882o) {
                throw new IllegalStateException("released");
            }
        }
        if (z10 && (d0Var = this.f26884q) != null) {
            ((ah.f) d0Var.f1523d).cancel();
            ((n) d0Var.f1521b).i(d0Var, true, true, true, true, null);
        }
        this.f26877j = null;
    }

    public final ug.d0 h() {
        ArrayList arrayList = new ArrayList();
        vb.m.P(arrayList, this.f26868a.f21908b);
        arrayList.add(new a9.h(3, this.f26868a));
        arrayList.add(new a9.h(this.f26868a.f21916j));
        arrayList.add(new a9.h(4, this.f26868a.f21917k));
        arrayList.add(a.f26818a);
        vb.m.P(arrayList, this.f26868a.f21909c);
        arrayList.add(ah.b.f372a);
        b1 b1Var = this.f26869b;
        x xVar = this.f26868a;
        try {
            try {
                ug.d0 d0VarB = new ah.h(this, arrayList, 0, null, b1Var, xVar.f21929w, xVar.f21930x, xVar.f21931y).b(this.f26869b);
                if (this.f26883p) {
                    wg.e.b(d0VarB);
                    throw new IOException("Canceled");
                }
                j(null);
                return d0VarB;
            } catch (IOException e10) {
                IOException iOExceptionJ = j(e10);
                jc.l.c(iOExceptionJ, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionJ;
            }
        } catch (Throwable th2) {
            if (0 == 0) {
                j(null);
            }
            throw th2;
        }
    }

    public final IOException i(d0 d0Var, boolean z10, boolean z11, boolean z12, boolean z13, IOException iOException) {
        boolean z14;
        boolean z15;
        jc.l.e(d0Var, "exchange");
        if (d0Var.equals(this.f26884q)) {
            synchronized (this) {
                z14 = false;
                if (z10) {
                    try {
                        if (!this.f26878k) {
                            if ((z11 || !this.f26879l) && ((!z13 || !this.f26880m) && (!z12 || !this.f26881n))) {
                            }
                        }
                        if (z10) {
                            this.f26878k = false;
                        }
                        if (z11) {
                            this.f26879l = false;
                        }
                        if (z13) {
                            this.f26880m = false;
                        }
                        if (z12) {
                            this.f26881n = false;
                        }
                        boolean z16 = (this.f26878k || this.f26879l || this.f26880m || this.f26881n) ? false : true;
                        if (z16) {
                            if (!this.f26882o) {
                                z14 = true;
                            }
                        }
                        boolean z17 = z16;
                        z15 = z14;
                        z14 = z17;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } else {
                    z15 = z11 ? false : false;
                }
            }
            if (z14) {
                this.f26884q = null;
                o oVar = this.f26875h;
                if (oVar != null) {
                    oVar.d();
                }
            }
            if (z15) {
                return c(iOException);
            }
        }
        return iOException;
    }

    public final IOException j(IOException iOException) {
        boolean z10;
        synchronized (this) {
            z10 = false;
            if (this.f26882o) {
                this.f26882o = false;
                if (!this.f26878k && !this.f26879l && !this.f26880m) {
                    if (!this.f26881n) {
                        z10 = true;
                    }
                }
            }
        }
        return z10 ? c(iOException) : iOException;
    }

    public final Socket k() {
        o oVar = this.f26875h;
        jc.l.b(oVar);
        TimeZone timeZone = wg.g.f24231a;
        ArrayList arrayList = oVar.f26900p;
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (jc.l.a(((Reference) it.next()).get(), this)) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i10);
        this.f26875h = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        oVar.f26901q = System.nanoTime();
        h9.b bVar = this.f26870c;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) bVar.f8237d;
        yg.b bVar2 = (yg.b) bVar.f8235b;
        TimeZone timeZone2 = wg.g.f24231a;
        if (!oVar.f26894j) {
            bVar2.d((xg.e) bVar.f8236c, 0L);
            return null;
        }
        oVar.f26894j = true;
        concurrentLinkedQueue.remove(oVar);
        if (concurrentLinkedQueue.isEmpty()) {
            bVar2.a();
        }
        return oVar.f26889e;
    }
}
