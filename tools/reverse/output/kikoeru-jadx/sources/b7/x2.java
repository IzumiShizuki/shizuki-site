package b7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x2 implements p4.g, p4.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2179b;

    public /* synthetic */ x2(int i10, int i11) {
        this.f2178a = i11;
        this.f2179b = i10;
    }

    @Override // p4.k
    public void a(Object obj) {
        switch (this.f2178a) {
            case 4:
                ((m4.w0) obj).d(this.f2179b);
                break;
            default:
                w4.i iVar = (w4.i) obj;
                iVar.getClass();
                int i10 = this.f2179b;
                if (i10 == 1) {
                    iVar.f23393u = true;
                }
                iVar.f23383k = i10;
                break;
        }
    }

    @Override // p4.g
    public void accept(Object obj) {
        switch (this.f2178a) {
            case 0:
                ((z3) obj).j(this.f2179b);
                break;
            case 1:
                ((z3) obj).S(this.f2179b);
                break;
            case 2:
                ((z3) obj).n0(this.f2179b);
                break;
            default:
                ((z3) obj).k0(this.f2179b);
                break;
        }
    }

    public /* synthetic */ x2(w4.a aVar, int i10, m4.x0 x0Var, m4.x0 x0Var2) {
        this.f2178a = 5;
        this.f2179b = i10;
    }
}
