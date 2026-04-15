package bh;

import lh.a0;
import lh.f0;
import lh.j0;
import lh.p;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f3021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f3023c;

    public f(h hVar) {
        this.f3023c = hVar;
        this.f3021a = new p(((a0) hVar.f3028c.f20620d).f12541a.a());
    }

    @Override // lh.f0
    public final void H(lh.f fVar, long j10) {
        if (this.f3022b) {
            throw new IllegalStateException("closed");
        }
        wg.e.a(fVar.f12571b, 0L, j10);
        ((a0) this.f3023c.f3028c.f20620d).H(fVar, j10);
    }

    @Override // lh.f0
    public final j0 a() {
        return this.f3021a;
    }

    @Override // lh.f0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3022b) {
            return;
        }
        this.f3022b = true;
        p pVar = this.f3021a;
        j0 j0Var = pVar.f12599e;
        pVar.f12599e = j0.f12579d;
        j0Var.a();
        j0Var.b();
        this.f3023c.f3029d = 3;
    }

    @Override // lh.f0, java.io.Flushable
    public final void flush() {
        if (this.f3022b) {
            return;
        }
        ((a0) this.f3023c.f3028c.f20620d).flush();
    }
}
