package zg;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f26918a;

    public q(o oVar) {
        jc.l.e(oVar, "connection");
        this.f26918a = oVar;
    }

    @Override // zg.s
    public final boolean a() {
        return true;
    }

    @Override // zg.s
    public final s b() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // zg.s
    public final o c() {
        return this.f26918a;
    }

    @Override // zg.s, ah.e
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // zg.s
    public final r d() {
        throw new IllegalStateException("already connected");
    }

    @Override // zg.s
    public final r g() {
        throw new IllegalStateException("already connected");
    }
}
