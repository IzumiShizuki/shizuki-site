package wf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o extends e1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f24154c = new o(p.f24160a);

    @Override // wf.a
    public final int h(Object obj) {
        char[] cArr = (char[]) obj;
        jc.l.e(cArr, "<this>");
        return cArr.length;
    }

    @Override // wf.r, wf.a
    public final void j(vf.a aVar, int i10, Object obj) {
        n nVar = (n) obj;
        jc.l.e(nVar, "builder");
        char cW = aVar.w(this.f24113b, i10);
        nVar.b(nVar.d() + 1);
        char[] cArr = nVar.f24148a;
        int i11 = nVar.f24149b;
        nVar.f24149b = i11 + 1;
        cArr[i11] = cW;
    }

    @Override // wf.a
    public final Object k(Object obj) {
        char[] cArr = (char[]) obj;
        jc.l.e(cArr, "<this>");
        n nVar = new n();
        nVar.f24148a = cArr;
        nVar.f24149b = cArr.length;
        nVar.b(10);
        return nVar;
    }

    @Override // wf.e1
    public final Object n() {
        return new char[0];
    }

    @Override // wf.e1
    public final void o(yf.t tVar, Object obj, int i10) {
        char[] cArr = (char[]) obj;
        jc.l.e(tVar, "encoder");
        jc.l.e(cArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            char c3 = cArr[i11];
            d1 d1Var = this.f24113b;
            jc.l.e(d1Var, "descriptor");
            tVar.g(d1Var, i11);
            tVar.e(c3);
        }
    }
}
