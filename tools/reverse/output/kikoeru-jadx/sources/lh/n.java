package lh;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class n implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f12597a;

    public n(f0 f0Var) {
        jc.l.e(f0Var, "delegate");
        this.f12597a = f0Var;
    }

    @Override // lh.f0
    public void H(f fVar, long j10) {
        this.f12597a.H(fVar, j10);
    }

    @Override // lh.f0
    public final j0 a() {
        return this.f12597a.a();
    }

    @Override // lh.f0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f12597a.close();
    }

    @Override // lh.f0, java.io.Flushable
    public void flush() {
        this.f12597a.flush();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f12597a + ')';
    }
}
