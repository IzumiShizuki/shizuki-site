package zg;

import b0.w1;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import ug.t;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ug.i f26863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile AtomicInteger f26864b = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f26865c;

    public k(n nVar, ug.i iVar) {
        this.f26865c = nVar;
        this.f26863a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w1 w1Var;
        String str = "OkHttp " + ((t) this.f26865c.f26869b.f1650b).h();
        n nVar = this.f26865c;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(str);
        try {
            nVar.f26871d.h();
            boolean z10 = false;
            try {
                try {
                } catch (Throwable th2) {
                    w1 w1Var2 = nVar.f26868a.f21907a;
                    w1Var2.getClass();
                    w1.Z(w1Var2, null, null, this, 3);
                    throw th2;
                }
            } catch (IOException e10) {
                e = e10;
            } catch (Throwable th3) {
                th = th3;
            }
            try {
                this.f26863a.s(nVar, nVar.h());
                w1Var = nVar.f26868a.f21907a;
            } catch (IOException e11) {
                e = e11;
                z10 = true;
                if (z10) {
                    fh.e eVar = fh.e.f7102a;
                    fh.e.f7102a.j("Callback failure for " + n.a(nVar), 4, e);
                } else {
                    this.f26863a.r(nVar, e);
                }
                w1Var = nVar.f26868a.f21907a;
            } catch (Throwable th4) {
                th = th4;
                z10 = true;
                nVar.d();
                if (!z10) {
                    IOException iOException = new IOException("canceled due to " + th);
                    iOException.initCause(th);
                    this.f26863a.r(nVar, iOException);
                }
                if (!(th instanceof InterruptedException)) {
                    throw th;
                }
                Thread.currentThread().interrupt();
                w1Var = nVar.f26868a.f21907a;
            }
            w1Var.getClass();
            w1.Z(w1Var, null, null, this, 3);
        } finally {
            threadCurrentThread.setName(name);
        }
    }
}
