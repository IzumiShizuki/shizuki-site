package b7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u2 implements p4.g, p4.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f2112b;

    public /* synthetic */ u2(float f10, int i10) {
        this.f2111a = i10;
        this.f2112b = f10;
    }

    @Override // p4.k
    public void a(Object obj) {
        ((m4.w0) obj).p(this.f2112b);
    }

    @Override // p4.g
    public void accept(Object obj) {
        switch (this.f2111a) {
            case 0:
                ((z3) obj).m0(this.f2112b);
                break;
            default:
                z3 z3Var = (z3) obj;
                z3Var.r0();
                v4.v vVar = (v4.v) z3Var.f2227a;
                vVar.m2();
                float fH = p4.c0.h(this.f2112b, 0.0f, 1.0f);
                if (vVar.U != fH) {
                    vVar.U = fH;
                    vVar.a2(1, 2, Float.valueOf(vVar.f22700z.f22445g * fH));
                    vVar.f22683m.e(22, new u2(fH, 2));
                    break;
                }
                break;
        }
    }
}
