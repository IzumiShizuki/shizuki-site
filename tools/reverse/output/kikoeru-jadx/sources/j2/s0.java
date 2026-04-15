package j2;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements Choreographer.FrameCallback, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t0 f9979a;

    public s0(t0 t0Var) {
        this.f9979a = t0Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        this.f9979a.f9995d.removeCallbacks(this);
        t0.i0(this.f9979a);
        t0 t0Var = this.f9979a;
        synchronized (t0Var.f9996e) {
            if (t0Var.f10001j) {
                t0Var.f10001j = false;
                ArrayList arrayList = t0Var.f9998g;
                t0Var.f9998g = t0Var.f9999h;
                t0Var.f9999h = arrayList;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((Choreographer.FrameCallback) arrayList.get(i10)).doFrame(j10);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        t0.i0(this.f9979a);
        t0 t0Var = this.f9979a;
        synchronized (t0Var.f9996e) {
            if (t0Var.f9998g.isEmpty()) {
                t0Var.f9994c.removeFrameCallback(this);
                t0Var.f10001j = false;
            }
        }
    }
}
