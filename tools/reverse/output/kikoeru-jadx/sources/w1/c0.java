package w1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ic.k f23147a;

    public abstract void a(s1.d dVar);

    public ic.k b() {
        return this.f23147a;
    }

    public final void c() {
        ic.k kVarB = b();
        if (kVarB != null) {
            kVarB.a(this);
        }
    }

    public void d(q.a0 a0Var) {
        this.f23147a = a0Var;
    }
}
