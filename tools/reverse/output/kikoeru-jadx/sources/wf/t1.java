package wf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t1 extends e1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t1 f24185c = new t1(u1.f24188a);

    @Override // wf.a
    public final int h(Object obj) {
        int[] iArr = ((ub.u) obj).f21559a;
        jc.l.e(iArr, "$this$collectionSize");
        return iArr.length;
    }

    @Override // wf.r, wf.a
    public final void j(vf.a aVar, int i10, Object obj) {
        s1 s1Var = (s1) obj;
        jc.l.e(s1Var, "builder");
        int iM = aVar.s(this.f24113b, i10).m();
        s1Var.b(s1Var.d() + 1);
        int[] iArr = s1Var.f24181a;
        int i11 = s1Var.f24182b;
        s1Var.f24182b = i11 + 1;
        iArr[i11] = iM;
    }

    @Override // wf.a
    public final Object k(Object obj) {
        int[] iArr = ((ub.u) obj).f21559a;
        jc.l.e(iArr, "$this$toBuilder");
        s1 s1Var = new s1();
        s1Var.f24181a = iArr;
        s1Var.f24182b = iArr.length;
        s1Var.b(10);
        return s1Var;
    }

    @Override // wf.e1
    public final Object n() {
        return new ub.u(new int[0]);
    }

    @Override // wf.e1
    public final void o(yf.t tVar, Object obj, int i10) {
        int[] iArr = ((ub.u) obj).f21559a;
        jc.l.e(tVar, "encoder");
        for (int i11 = 0; i11 < i10; i11++) {
            tVar.k(this.f24113b, i11).l(iArr[i11]);
        }
    }
}
