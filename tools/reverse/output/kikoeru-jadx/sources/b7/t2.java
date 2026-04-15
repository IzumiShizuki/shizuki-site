package b7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t2 implements p4.g, p4.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2101b;

    public /* synthetic */ t2(int i10, boolean z10) {
        this.f2100a = i10;
        this.f2101b = z10;
    }

    @Override // p4.k
    public void a(Object obj) {
        switch (this.f2100a) {
            case 3:
                ((m4.w0) obj).t(this.f2101b);
                break;
            default:
                ((m4.w0) obj).J(this.f2101b);
                break;
        }
    }

    @Override // p4.g
    public void accept(Object obj) {
        switch (this.f2100a) {
            case 0:
                z3 z3Var = (z3) obj;
                z3Var.r0();
                ((v4.v) z3Var.f2227a).c2(this.f2101b);
                break;
            case 1:
                ((z3) obj).j0(this.f2101b);
                break;
            default:
                ((z3) obj).o0(this.f2101b);
                break;
        }
    }
}
