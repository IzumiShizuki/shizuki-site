package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l2 implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13226a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f13227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13229d;

    public /* synthetic */ l2(q9.o oVar, boolean z10, bg.p pVar) {
        this.f13228c = oVar;
        this.f13227b = z10;
        this.f13229d = pVar;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f13226a) {
            case 0:
                t2 t2Var = (t2) this.f13228c;
                hf.y yVar = (hf.y) this.f13229d;
                if (this.f13227b && ((Boolean) t2Var.f13649a.f13848d.a(u2.f13690a)).booleanValue()) {
                    hf.a0.y(yVar, null, null, new o2(t2Var, null, 0), 3);
                }
                return ub.a0.f21526a;
            default:
                q9.o oVar = (q9.o) this.f13228c;
                return new q9.q((bg.p0) oVar.f18056e.getValue(), (bg.u) oVar.f18057f.getValue(), (bg.d) oVar.f18058g.getValue(), this.f13227b, (bg.p) this.f13229d);
        }
    }

    public /* synthetic */ l2(boolean z10, t2 t2Var, hf.y yVar) {
        this.f13227b = z10;
        this.f13228c = t2Var;
        this.f13229d = yVar;
    }
}
