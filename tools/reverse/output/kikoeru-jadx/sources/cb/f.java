package cb;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f3852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f3853b;

    public f(e0 e0Var, y yVar) {
        this.f3852a = e0Var;
        this.f3853b = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f3852a.f3872a != this) {
            return;
        }
        if (p.f3870f.w(this.f3852a, this, p.h(this.f3853b))) {
            p.e(this.f3852a, false);
        }
    }
}
