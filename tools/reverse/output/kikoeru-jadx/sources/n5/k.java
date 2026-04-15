package n5;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import b7.q0;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k extends Handler implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f15360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f15361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f15362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IOException f15363e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15364f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Thread f15365g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15366h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f15367i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f15368j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, Looper looper, l lVar, j jVar, int i10, long j10) {
        super(looper);
        this.f15368j = oVar;
        this.f15360b = lVar;
        this.f15362d = jVar;
        this.f15359a = i10;
        this.f15361c = j10;
    }

    public final void a(boolean z10) {
        this.f15367i = z10;
        this.f15363e = null;
        if (hasMessages(1)) {
            this.f15366h = true;
            removeMessages(1);
            if (!z10) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f15366h = true;
                    this.f15360b.l();
                    Thread thread = this.f15365g;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (z10) {
            this.f15368j.f15373b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            j jVar = this.f15362d;
            jVar.getClass();
            jVar.s(this.f15360b, jElapsedRealtime, jElapsedRealtime - this.f15361c, true);
            this.f15362d = null;
        }
    }

    public final void b() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = jElapsedRealtime - this.f15361c;
        j jVar = this.f15362d;
        jVar.getClass();
        jVar.r(this.f15360b, jElapsedRealtime, j10, this.f15364f);
        this.f15363e = null;
        o oVar = this.f15368j;
        o5.a aVar = oVar.f15372a;
        k kVar = oVar.f15373b;
        kVar.getClass();
        aVar.execute(kVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f15367i) {
            return;
        }
        int i10 = message.what;
        if (i10 == 1) {
            b();
            return;
        }
        if (i10 == 4) {
            throw ((Error) message.obj);
        }
        this.f15368j.f15373b = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = jElapsedRealtime - this.f15361c;
        j jVar = this.f15362d;
        jVar.getClass();
        if (this.f15366h) {
            jVar.s(this.f15360b, jElapsedRealtime, j10, false);
            return;
        }
        int i11 = message.what;
        if (i11 == 2) {
            try {
                jVar.k(this.f15360b, jElapsedRealtime, j10);
                return;
            } catch (RuntimeException e10) {
                p4.c.o("LoadTask", "Unexpected exception handling load completed", e10);
                this.f15368j.f15374c = new n(e10);
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f15363e = iOException;
        int i12 = this.f15364f + 1;
        this.f15364f = i12;
        q0 q0VarV = jVar.v(this.f15360b, jElapsedRealtime, j10, iOException, i12);
        int i13 = q0VarV.f2038b;
        if (i13 == 3) {
            this.f15368j.f15374c = this.f15363e;
            return;
        }
        if (i13 != 2) {
            if (i13 == 1) {
                this.f15364f = 1;
            }
            long jMin = q0VarV.f2037a;
            if (jMin == -9223372036854775807L) {
                jMin = Math.min((this.f15364f - 1) * 1000, 5000);
            }
            o oVar = this.f15368j;
            p4.c.i(oVar.f15373b == null);
            oVar.f15373b = this;
            if (jMin > 0) {
                sendEmptyMessageDelayed(1, jMin);
            } else {
                b();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        try {
            synchronized (this) {
                z10 = this.f15366h;
                this.f15365g = Thread.currentThread();
            }
            if (!z10) {
                Trace.beginSection("load:".concat(this.f15360b.getClass().getSimpleName()));
                try {
                    this.f15360b.i();
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
            synchronized (this) {
                this.f15365g = null;
                Thread.interrupted();
            }
            if (this.f15367i) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e10) {
            if (this.f15367i) {
                return;
            }
            obtainMessage(3, e10).sendToTarget();
        } catch (Exception e11) {
            if (this.f15367i) {
                return;
            }
            p4.c.o("LoadTask", "Unexpected exception loading stream", e11);
            obtainMessage(3, new n(e11)).sendToTarget();
        } catch (OutOfMemoryError e12) {
            if (this.f15367i) {
                return;
            }
            p4.c.o("LoadTask", "OutOfMemory error loading stream", e12);
            obtainMessage(3, new n(e12)).sendToTarget();
        } catch (Error e13) {
            if (!this.f15367i) {
                p4.c.o("LoadTask", "Unexpected error loading stream", e13);
                obtainMessage(4, e13).sendToTarget();
            }
            throw e13;
        }
    }
}
