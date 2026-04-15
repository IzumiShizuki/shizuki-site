package wf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q1 extends e1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q1 f24169c = new q1(r1.f24173a);

    @Override // wf.a
    public final int h(Object obj) {
        byte[] bArr = ((ub.s) obj).f21557a;
        jc.l.e(bArr, "$this$collectionSize");
        return bArr.length;
    }

    @Override // wf.r, wf.a
    public final void j(vf.a aVar, int i10, Object obj) {
        p1 p1Var = (p1) obj;
        jc.l.e(p1Var, "builder");
        byte bZ = aVar.s(this.f24113b, i10).z();
        p1Var.b(p1Var.d() + 1);
        byte[] bArr = p1Var.f24164a;
        int i11 = p1Var.f24165b;
        p1Var.f24165b = i11 + 1;
        bArr[i11] = bZ;
    }

    @Override // wf.a
    public final Object k(Object obj) {
        byte[] bArr = ((ub.s) obj).f21557a;
        jc.l.e(bArr, "$this$toBuilder");
        p1 p1Var = new p1();
        p1Var.f24164a = bArr;
        p1Var.f24165b = bArr.length;
        p1Var.b(10);
        return p1Var;
    }

    @Override // wf.e1
    public final Object n() {
        return new ub.s(new byte[0]);
    }

    @Override // wf.e1
    public final void o(yf.t tVar, Object obj, int i10) {
        byte[] bArr = ((ub.s) obj).f21557a;
        jc.l.e(tVar, "encoder");
        for (int i11 = 0; i11 < i10; i11++) {
            tVar.k(this.f24113b, i11).d(bArr[i11]);
        }
    }
}
