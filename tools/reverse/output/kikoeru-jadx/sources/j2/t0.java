package j2;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends hf.u {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ub.p f9992m = ub.a.d(m0.f9889h);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ah.c f9993n = new ah.c(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Choreographer f9994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f9995d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f10000i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f10001j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final v0 f10003l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f9996e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final vb.j f9997f = new vb.j();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f9998g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f9999h = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final s0 f10002k = new s0(this);

    public t0(Choreographer choreographer, Handler handler) {
        this.f9994c = choreographer;
        this.f9995d = handler;
        this.f10003l = new v0(choreographer, this);
    }

    public static final void i0(t0 t0Var) {
        boolean z10;
        do {
            Runnable runnableJ0 = t0Var.j0();
            while (runnableJ0 != null) {
                runnableJ0.run();
                runnableJ0 = t0Var.j0();
            }
            synchronized (t0Var.f9996e) {
                if (t0Var.f9997f.isEmpty()) {
                    z10 = false;
                    t0Var.f10000i = false;
                } else {
                    z10 = true;
                }
            }
        } while (z10);
    }

    @Override // hf.u
    public final void e0(yb.h hVar, Runnable runnable) {
        synchronized (this.f9996e) {
            this.f9997f.addLast(runnable);
            if (!this.f10000i) {
                this.f10000i = true;
                this.f9995d.post(this.f10002k);
                if (!this.f10001j) {
                    this.f10001j = true;
                    this.f9994c.postFrameCallback(this.f10002k);
                }
            }
        }
    }

    public final Runnable j0() {
        Runnable runnable;
        synchronized (this.f9996e) {
            vb.j jVar = this.f9997f;
            runnable = (Runnable) (jVar.isEmpty() ? null : jVar.removeFirst());
        }
        return runnable;
    }
}
