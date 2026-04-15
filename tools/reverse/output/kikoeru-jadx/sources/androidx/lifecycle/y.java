package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v f823b;

    public final void a(x xVar, o oVar) {
        p pVarA = oVar.a();
        p pVar = this.f822a;
        jc.l.e(pVar, "state1");
        if (pVarA.compareTo(pVar) < 0) {
            pVar = pVarA;
        }
        this.f822a = pVar;
        this.f823b.i(xVar, oVar);
        this.f822a = pVarA;
    }
}
