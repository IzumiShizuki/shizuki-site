package lh;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class o implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f12598a;

    public o(h0 h0Var) {
        jc.l.e(h0Var, "delegate");
        this.f12598a = h0Var;
    }

    @Override // lh.h0
    public long W(f fVar, long j10) {
        jc.l.e(fVar, "sink");
        return this.f12598a.W(fVar, j10);
    }

    @Override // lh.h0
    public final j0 a() {
        return this.f12598a.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f12598a.close();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f12598a + ')';
    }
}
