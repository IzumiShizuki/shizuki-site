package wg;

import jc.l;
import lh.h;
import lh.h0;
import lh.j0;
import ug.f0;
import ug.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends f0 implements h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f24224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f24225c;

    public c(v vVar, long j10) {
        this.f24224b = vVar;
        this.f24225c = j10;
    }

    @Override // lh.h0
    public final long W(lh.f fVar, long j10) {
        l.e(fVar, "sink");
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // lh.h0
    public final j0 a() {
        return j0.f12579d;
    }

    @Override // ug.f0
    public final long g() {
        return this.f24225c;
    }

    @Override // ug.f0
    public final v i() {
        return this.f24224b;
    }

    @Override // ug.f0
    public final h k() {
        return g8.a.l(this);
    }

    @Override // ug.f0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
