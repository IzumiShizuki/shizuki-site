package bh;

import lh.a0;
import lh.f0;
import lh.j0;
import lh.p;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f3013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f3015c;

    public c(h hVar) {
        this.f3015c = hVar;
        this.f3013a = new p(((a0) hVar.f3028c.f20620d).f12541a.a());
    }

    @Override // lh.f0
    public final void H(lh.f fVar, long j10) {
        if (this.f3014b) {
            throw new IllegalStateException("closed");
        }
        if (j10 == 0) {
            return;
        }
        a0 a0Var = (a0) this.f3015c.f3028c.f20620d;
        if (a0Var.f12543c) {
            throw new IllegalStateException("closed");
        }
        a0Var.f12542b.g0(j10);
        a0Var.b();
        a0Var.E("\r\n");
        a0Var.H(fVar, j10);
        a0Var.E("\r\n");
    }

    @Override // lh.f0
    public final j0 a() {
        return this.f3013a;
    }

    @Override // lh.f0, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f3014b) {
            return;
        }
        this.f3014b = true;
        ((a0) this.f3015c.f3028c.f20620d).E("0\r\n\r\n");
        p pVar = this.f3013a;
        j0 j0Var = pVar.f12599e;
        pVar.f12599e = j0.f12579d;
        j0Var.a();
        j0Var.b();
        this.f3015c.f3029d = 3;
    }

    @Override // lh.f0, java.io.Flushable
    public final synchronized void flush() {
        if (this.f3014b) {
            return;
        }
        ((a0) this.f3015c.f3028c.f20620d).flush();
    }
}
