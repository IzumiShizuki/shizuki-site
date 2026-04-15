package wf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t extends e1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f24183c = new t(u.f24186a);

    @Override // wf.a
    public final int h(Object obj) {
        double[] dArr = (double[]) obj;
        jc.l.e(dArr, "<this>");
        return dArr.length;
    }

    @Override // wf.r, wf.a
    public final void j(vf.a aVar, int i10, Object obj) {
        s sVar = (s) obj;
        jc.l.e(sVar, "builder");
        double dC = aVar.c(this.f24113b, i10);
        sVar.b(sVar.d() + 1);
        double[] dArr = sVar.f24175a;
        int i11 = sVar.f24176b;
        sVar.f24176b = i11 + 1;
        dArr[i11] = dC;
    }

    @Override // wf.a
    public final Object k(Object obj) {
        double[] dArr = (double[]) obj;
        jc.l.e(dArr, "<this>");
        s sVar = new s();
        sVar.f24175a = dArr;
        sVar.f24176b = dArr.length;
        sVar.b(10);
        return sVar;
    }

    @Override // wf.e1
    public final Object n() {
        return new double[0];
    }

    @Override // wf.e1
    public final void o(yf.t tVar, Object obj, int i10) {
        double[] dArr = (double[]) obj;
        jc.l.e(tVar, "encoder");
        jc.l.e(dArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            double d10 = dArr[i11];
            d1 d1Var = this.f24113b;
            jc.l.e(d1Var, "descriptor");
            tVar.g(d1Var, i11);
            tVar.f(d10);
        }
    }
}
