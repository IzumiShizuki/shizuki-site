package v4;

import android.os.Looper;
import m4.i1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0 f22706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0 f22707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f22709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Looper f22710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f22711f;

    public x0(v0 v0Var, w0 w0Var, i1 i1Var, int i10, Looper looper) {
        this.f22707b = v0Var;
        this.f22706a = w0Var;
        this.f22710e = looper;
    }

    public final synchronized void a(boolean z10) {
        notifyAll();
    }

    public final void b() {
        p4.c.i(!this.f22711f);
        this.f22711f = true;
        c0 c0Var = (c0) this.f22707b;
        synchronized (c0Var) {
            if (!c0Var.B && c0Var.f22417j.getThread().isAlive()) {
                c0Var.f22415h.a(14, this).b();
                return;
            }
            p4.c.B("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            a(false);
        }
    }
}
