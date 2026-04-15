package wf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f extends e1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f24114c = new f(g.f24118a);

    @Override // wf.a
    public final int h(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        jc.l.e(zArr, "<this>");
        return zArr.length;
    }

    @Override // wf.r, wf.a
    public final void j(vf.a aVar, int i10, Object obj) {
        e eVar = (e) obj;
        jc.l.e(eVar, "builder");
        boolean zO = aVar.o(this.f24113b, i10);
        eVar.b(eVar.d() + 1);
        boolean[] zArr = eVar.f24107a;
        int i11 = eVar.f24108b;
        eVar.f24108b = i11 + 1;
        zArr[i11] = zO;
    }

    @Override // wf.a
    public final Object k(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        jc.l.e(zArr, "<this>");
        e eVar = new e();
        eVar.f24107a = zArr;
        eVar.f24108b = zArr.length;
        eVar.b(10);
        return eVar;
    }

    @Override // wf.e1
    public final Object n() {
        return new boolean[0];
    }

    @Override // wf.e1
    public final void o(yf.t tVar, Object obj, int i10) {
        boolean[] zArr = (boolean[]) obj;
        jc.l.e(tVar, "encoder");
        jc.l.e(zArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            tVar.c(this.f24113b, i11, zArr[i11]);
        }
    }
}
