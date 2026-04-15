package b0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0 f1367b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v0 f1370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1371f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1368c = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x0.e1 f1372g = x0.v.v(null);

    public v0(Object obj, w0 w0Var) {
        this.f1366a = obj;
        this.f1367b = w0Var;
    }

    public final v0 a() {
        if (this.f1371f) {
            x.a.c("Pin should not be called on an already disposed item ");
        }
        if (this.f1369d == 0) {
            this.f1367b.f1392a.add(this);
            v0 v0Var = (v0) this.f1372g.getValue();
            if (v0Var != null) {
                v0Var.a();
            } else {
                v0Var = null;
            }
            this.f1370e = v0Var;
        }
        this.f1369d++;
        return this;
    }

    public final void b() {
        if (this.f1371f) {
            return;
        }
        if (this.f1369d <= 0) {
            x.a.c("Release should only be called once");
        }
        int i10 = this.f1369d - 1;
        this.f1369d = i10;
        if (i10 == 0) {
            this.f1367b.f1392a.remove(this);
            v0 v0Var = this.f1370e;
            if (v0Var != null) {
                v0Var.b();
            }
            this.f1370e = null;
        }
    }
}
