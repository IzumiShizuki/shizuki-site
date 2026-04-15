package c2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0.e f3307a = new z0.e(new j[16]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o.g0 f3308b = new o.g0(10);

    public boolean a(o.s sVar, g2.c0 c0Var, b7.n nVar, boolean z10) {
        z0.e eVar = this.f3307a;
        Object[] objArr = eVar.f26372a;
        int i10 = eVar.f26374c;
        boolean z11 = false;
        for (int i11 = 0; i11 < i10; i11++) {
            z11 = ((j) objArr[i11]).a(sVar, c0Var, nVar, z10) || z11;
        }
        return z11;
    }

    public void b(b7.n nVar) {
        z0.e eVar = this.f3307a;
        int i10 = eVar.f26374c;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            }
            if (((j) eVar.f26372a[i10]).f3289d.f5449b == 0) {
                eVar.k(i10);
            }
        }
    }
}
