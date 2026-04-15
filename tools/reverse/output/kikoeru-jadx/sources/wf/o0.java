package wf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends e1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o0 f24155c = new o0(p0.f24162a);

    @Override // wf.a
    public final int h(Object obj) {
        long[] jArr = (long[]) obj;
        jc.l.e(jArr, "<this>");
        return jArr.length;
    }

    @Override // wf.r, wf.a
    public final void j(vf.a aVar, int i10, Object obj) {
        n0 n0Var = (n0) obj;
        jc.l.e(n0Var, "builder");
        long jY = aVar.y(this.f24113b, i10);
        n0Var.b(n0Var.d() + 1);
        long[] jArr = n0Var.f24150a;
        int i11 = n0Var.f24151b;
        n0Var.f24151b = i11 + 1;
        jArr[i11] = jY;
    }

    @Override // wf.a
    public final Object k(Object obj) {
        long[] jArr = (long[]) obj;
        jc.l.e(jArr, "<this>");
        n0 n0Var = new n0();
        n0Var.f24150a = jArr;
        n0Var.f24151b = jArr.length;
        n0Var.b(10);
        return n0Var;
    }

    @Override // wf.e1
    public final Object n() {
        return new long[0];
    }

    @Override // wf.e1
    public final void o(yf.t tVar, Object obj, int i10) {
        long[] jArr = (long[]) obj;
        jc.l.e(tVar, "encoder");
        jc.l.e(jArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            tVar.o(this.f24113b, i11, jArr[i11]);
        }
    }
}
