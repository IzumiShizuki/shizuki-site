package zg;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f26860a;

    public i(Throwable th2) {
        this.f26860a = new r(this, th2, 2);
    }

    @Override // zg.s
    public final boolean a() {
        return false;
    }

    @Override // zg.s
    public final s b() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // zg.s
    public final o c() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // zg.s, ah.e
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // zg.s
    public final r d() {
        return this.f26860a;
    }

    @Override // zg.s
    public final r g() {
        return this.f26860a;
    }
}
