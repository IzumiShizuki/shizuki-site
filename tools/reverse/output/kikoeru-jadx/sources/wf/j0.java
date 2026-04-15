package wf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends e1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j0 f24136c = new j0(k0.f24138a);

    @Override // wf.a
    public final int h(Object obj) {
        int[] iArr = (int[]) obj;
        jc.l.e(iArr, "<this>");
        return iArr.length;
    }

    @Override // wf.r, wf.a
    public final void j(vf.a aVar, int i10, Object obj) {
        i0 i0Var = (i0) obj;
        jc.l.e(i0Var, "builder");
        int iT = aVar.t(this.f24113b, i10);
        i0Var.b(i0Var.d() + 1);
        int[] iArr = i0Var.f24129a;
        int i11 = i0Var.f24130b;
        i0Var.f24130b = i11 + 1;
        iArr[i11] = iT;
    }

    @Override // wf.a
    public final Object k(Object obj) {
        int[] iArr = (int[]) obj;
        jc.l.e(iArr, "<this>");
        i0 i0Var = new i0();
        i0Var.f24129a = iArr;
        i0Var.f24130b = iArr.length;
        i0Var.b(10);
        return i0Var;
    }

    @Override // wf.e1
    public final Object n() {
        return new int[0];
    }

    @Override // wf.e1
    public final void o(yf.t tVar, Object obj, int i10) {
        int[] iArr = (int[]) obj;
        jc.l.e(tVar, "encoder");
        jc.l.e(iArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            tVar.m(i11, iArr[i11], this.f24113b);
        }
    }
}
