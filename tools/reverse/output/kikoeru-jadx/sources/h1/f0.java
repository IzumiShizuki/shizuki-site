package h1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class f0 implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1.a f8007a = new f1.a(0);

    public final boolean c(int i10) {
        return (i10 & this.f8007a.get()) != 0;
    }

    public final void d(int i10) {
        f1.a aVar;
        int i11;
        do {
            aVar = this.f8007a;
            i11 = aVar.get();
            if ((i11 & i10) != 0) {
                return;
            }
        } while (!aVar.compareAndSet(i11, i11 | i10));
    }

    @Override // h1.e0
    public /* synthetic */ g0 j(g0 g0Var, g0 g0Var2, g0 g0Var3) {
        return null;
    }
}
