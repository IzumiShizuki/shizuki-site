package b7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j0 implements p4.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m4.r0 f1872b;

    public /* synthetic */ j0(int i10, m4.r0 r0Var) {
        this.f1871a = i10;
        this.f1872b = r0Var;
    }

    @Override // p4.k
    public final void a(Object obj) {
        switch (this.f1871a) {
            case 0:
                ((m4.w0) obj).O(this.f1872b);
                break;
            case 1:
                ((m4.w0) obj).i(this.f1872b);
                break;
            case 2:
                ((m4.w0) obj).O(this.f1872b);
                break;
            case 3:
                ((m4.w0) obj).i(this.f1872b);
                break;
            default:
                ((w4.i) obj).f23386n = this.f1872b;
                break;
        }
    }

    public /* synthetic */ j0(w4.a aVar, m4.r0 r0Var) {
        this.f1871a = 4;
        this.f1872b = r0Var;
    }
}
