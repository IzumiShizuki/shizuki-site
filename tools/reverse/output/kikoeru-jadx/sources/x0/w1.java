package x0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w1 extends yb.a implements hf.w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i1.c f24517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x1 f24518c;

    /* JADX WARN: Illegal instructions before constructor call */
    public w1(i1.c cVar, x1 x1Var) {
        hf.v vVar = hf.v.f8598a;
        this.f24517b = cVar;
        this.f24518c = x1Var;
        super(vVar);
    }

    @Override // hf.w
    public final void o(Throwable th2, yb.h hVar) throws Throwable {
        i1.c cVar = this.f24517b;
        x1 x1Var = this.f24518c;
        pc.f0.V(th2, new a9.d(12, cVar, x1Var));
        hf.w wVar = (hf.w) x1Var.f24520a.R(hf.v.f8598a);
        if (wVar == null) {
            throw th2;
        }
        wVar.o(th2, hVar);
    }
}
