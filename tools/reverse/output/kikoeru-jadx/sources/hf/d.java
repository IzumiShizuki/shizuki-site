package hf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c[] f8531a;

    public d(c[] cVarArr) {
        this.f8531a = cVarArr;
    }

    public final void a() {
        for (c cVar : this.f8531a) {
            n0 n0Var = cVar.f8526f;
            if (n0Var == null) {
                jc.l.k("handle");
                throw null;
            }
            n0Var.a();
        }
    }

    @Override // hf.i
    public final void b(Throwable th2) {
        a();
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f8531a + ']';
    }
}
