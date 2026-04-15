package k4;

import hf.a0;
import hf.y;
import jc.l;
import yb.h;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements AutoCloseable, y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f11023a;

    public a(h hVar) {
        l.e(hVar, "coroutineContext");
        this.f11023a = hVar;
    }

    @Override // hf.y
    public final h O() {
        return this.f11023a;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        a0.i(this.f11023a, null);
    }
}
