package b7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b3 implements p4.g, p4.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1658c;

    public /* synthetic */ b3(int i10, int i11, int i12) {
        this.f1656a = i12;
        this.f1657b = i10;
        this.f1658c = i11;
    }

    @Override // p4.k
    public void a(Object obj) {
        ((m4.w0) obj).P(this.f1657b, this.f1658c);
    }

    @Override // p4.g
    public void accept(Object obj) {
        switch (this.f1656a) {
            case 0:
                ((z3) obj).l0(this.f1657b, this.f1658c);
                break;
            default:
                z3 z3Var = (z3) obj;
                z3Var.r0();
                androidx.lifecycle.q qVar = (androidx.lifecycle.q) z3Var.f2227a;
                int i10 = this.f1657b;
                int i11 = this.f1658c;
                if (i10 != i11) {
                    ((v4.v) qVar).T1(i10, i10 + 1, i11);
                }
                break;
        }
    }
}
