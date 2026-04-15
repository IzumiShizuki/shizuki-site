package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c8 implements ic.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12807a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x1 f12808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f12809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f12810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w.k f12811e;

    public c8(x1 x1Var, boolean z10, boolean z11, w.k kVar) {
        this.f12808b = x1Var;
        this.f12809c = z10;
        this.f12810d = z11;
        this.f12811e = kVar;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        switch (this.f12807a) {
            case 0:
                x0.o oVar = (x0.o) obj2;
                ((Number) obj3).intValue();
                oVar.W(1398930845);
                s.o oVar2 = (s.o) lc.b.g(this.f12809c, this.f12810d, this.f12811e, this.f12808b, d8.f12877e, d8.f12876d, oVar, 0).getValue();
                float f10 = r8.f13576a;
                j1.q qVarC = androidx.compose.ui.draw.a.c(j1.n.f9689a, new g8(oVar2.f19235a, oVar2, 1));
                oVar.p(false);
                return qVarC;
            default:
                s3 s3Var = (s3) obj;
                x0.o oVar3 = (x0.o) obj2;
                ((Number) obj3).intValue();
                oVar3.W(1423138213);
                boolean z10 = s3Var == s3.f13596b ? false : this.f12810d;
                oVar3.W(727091888);
                x0.w0 w0VarI = ud.b.i(this.f12811e, oVar3, 0);
                x1 x1Var = this.f12808b;
                x0.w0 w0VarY = x0.v.y(new q1.q(!this.f12809c ? x1Var.f13879r : z10 ? x1Var.f13880s : ((Boolean) w0VarI.getValue()).booleanValue() ? x1Var.f13877p : x1Var.f13878q), oVar3);
                oVar3.p(false);
                long j10 = ((q1.q) w0VarY.getValue()).f17577a;
                oVar3.p(false);
                return new q1.q(j10);
        }
    }

    public c8(boolean z10, boolean z11, w.k kVar, x1 x1Var) {
        d8 d8Var = d8.f12873a;
        d8 d8Var2 = d8.f12873a;
        this.f12809c = z10;
        this.f12810d = z11;
        this.f12811e = kVar;
        this.f12808b = x1Var;
    }
}
