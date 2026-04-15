package wf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w1 extends e1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w1 f24202c = new w1(x1.f24207a);

    @Override // wf.a
    public final int h(Object obj) {
        long[] jArr = ((ub.w) obj).f21561a;
        jc.l.e(jArr, "$this$collectionSize");
        return jArr.length;
    }

    @Override // wf.r, wf.a
    public final void j(vf.a aVar, int i10, Object obj) {
        v1 v1Var = (v1) obj;
        jc.l.e(v1Var, "builder");
        long jU = aVar.s(this.f24113b, i10).u();
        v1Var.b(v1Var.d() + 1);
        long[] jArr = v1Var.f24193a;
        int i11 = v1Var.f24194b;
        v1Var.f24194b = i11 + 1;
        jArr[i11] = jU;
    }

    @Override // wf.a
    public final Object k(Object obj) {
        long[] jArr = ((ub.w) obj).f21561a;
        jc.l.e(jArr, "$this$toBuilder");
        v1 v1Var = new v1();
        v1Var.f24193a = jArr;
        v1Var.f24194b = jArr.length;
        v1Var.b(10);
        return v1Var;
    }

    @Override // wf.e1
    public final Object n() {
        return new ub.w(new long[0]);
    }

    @Override // wf.e1
    public final void o(yf.t tVar, Object obj, int i10) {
        long[] jArr = ((ub.w) obj).f21561a;
        jc.l.e(tVar, "encoder");
        for (int i11 = 0; i11 < i10; i11++) {
            tVar.k(this.f24113b, i11).n(jArr[i11]);
        }
    }
}
