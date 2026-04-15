package wf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z1 extends e1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z1 f24219c = new z1(a2.f24081a);

    @Override // wf.a
    public final int h(Object obj) {
        short[] sArr = ((ub.z) obj).f21564a;
        jc.l.e(sArr, "$this$collectionSize");
        return sArr.length;
    }

    @Override // wf.r, wf.a
    public final void j(vf.a aVar, int i10, Object obj) {
        y1 y1Var = (y1) obj;
        jc.l.e(y1Var, "builder");
        short sA = aVar.s(this.f24113b, i10).A();
        y1Var.b(y1Var.d() + 1);
        short[] sArr = y1Var.f24212a;
        int i11 = y1Var.f24213b;
        y1Var.f24213b = i11 + 1;
        sArr[i11] = sA;
    }

    @Override // wf.a
    public final Object k(Object obj) {
        short[] sArr = ((ub.z) obj).f21564a;
        jc.l.e(sArr, "$this$toBuilder");
        y1 y1Var = new y1();
        y1Var.f24212a = sArr;
        y1Var.f24213b = sArr.length;
        y1Var.b(10);
        return y1Var;
    }

    @Override // wf.e1
    public final Object n() {
        return new ub.z(new short[0]);
    }

    @Override // wf.e1
    public final void o(yf.t tVar, Object obj, int i10) {
        short[] sArr = ((ub.z) obj).f21564a;
        jc.l.e(tVar, "encoder");
        for (int i11 = 0; i11 < i10; i11++) {
            tVar.k(this.f24113b, i11).t(sArr[i11]);
        }
    }
}
