package pf;

import hf.w0;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class h extends w0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f17142c;

    @Override // hf.u
    public final void e0(yb.h hVar, Runnable runnable) {
        c.i(this.f17142c, runnable, 6);
    }

    @Override // hf.u
    public final void f0(yb.h hVar, Runnable runnable) {
        c.i(this.f17142c, runnable, 2);
    }

    @Override // hf.w0
    public final Executor i0() {
        return this.f17142c;
    }
}
