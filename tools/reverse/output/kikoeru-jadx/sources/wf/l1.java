package wf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l1 extends e1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l1 f24143c = new l1(m1.f24146a);

    @Override // wf.a
    public final int h(Object obj) {
        short[] sArr = (short[]) obj;
        jc.l.e(sArr, "<this>");
        return sArr.length;
    }

    @Override // wf.r, wf.a
    public final void j(vf.a aVar, int i10, Object obj) {
        k1 k1Var = (k1) obj;
        jc.l.e(k1Var, "builder");
        short sX = aVar.x(this.f24113b, i10);
        k1Var.b(k1Var.d() + 1);
        short[] sArr = k1Var.f24140a;
        int i11 = k1Var.f24141b;
        k1Var.f24141b = i11 + 1;
        sArr[i11] = sX;
    }

    @Override // wf.a
    public final Object k(Object obj) {
        short[] sArr = (short[]) obj;
        jc.l.e(sArr, "<this>");
        k1 k1Var = new k1();
        k1Var.f24140a = sArr;
        k1Var.f24141b = sArr.length;
        k1Var.b(10);
        return k1Var;
    }

    @Override // wf.e1
    public final Object n() {
        return new short[0];
    }

    @Override // wf.e1
    public final void o(yf.t tVar, Object obj, int i10) {
        short[] sArr = (short[]) obj;
        jc.l.e(tVar, "encoder");
        jc.l.e(sArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            short s10 = sArr[i11];
            d1 d1Var = this.f24113b;
            jc.l.e(d1Var, "descriptor");
            tVar.g(d1Var, i11);
            tVar.t(s10);
        }
    }
}
