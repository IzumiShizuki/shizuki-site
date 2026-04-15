package q9;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18125a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f18126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bg.p f18127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf.y f18128d;

    public /* synthetic */ y(hf.y yVar, r0 r0Var, bg.p pVar) {
        this.f18128d = yVar;
        this.f18126b = r0Var;
        this.f18127c = pVar;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f18125a) {
            case 0:
                r0 r0Var = this.f18126b;
                yb.c cVar = null;
                l lVar = new l(r0Var, cVar, 3);
                hf.y yVar = this.f18128d;
                hf.a0.y(yVar, null, null, lVar, 3);
                hf.a0.y(yVar, null, null, new f0(this.f18127c, r0Var, cVar, 1), 3);
                break;
            default:
                r0 r0Var2 = this.f18126b;
                r0Var2.f18089f.setValue(this.f18127c);
                hf.a0.y(this.f18128d, null, null, new l(r0Var2, null, 4), 3);
                break;
        }
        return ub.a0.f21526a;
    }

    public /* synthetic */ y(r0 r0Var, bg.p pVar, hf.y yVar) {
        this.f18126b = r0Var;
        this.f18127c = pVar;
        this.f18128d = yVar;
    }
}
