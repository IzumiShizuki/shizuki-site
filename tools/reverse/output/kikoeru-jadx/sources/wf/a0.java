package wf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends e1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0 f24078c = new a0(b0.f24083a);

    @Override // wf.a
    public final int h(Object obj) {
        float[] fArr = (float[]) obj;
        jc.l.e(fArr, "<this>");
        return fArr.length;
    }

    @Override // wf.r, wf.a
    public final void j(vf.a aVar, int i10, Object obj) {
        z zVar = (z) obj;
        jc.l.e(zVar, "builder");
        float fC = aVar.C(this.f24113b, i10);
        zVar.b(zVar.d() + 1);
        float[] fArr = zVar.f24214a;
        int i11 = zVar.f24215b;
        zVar.f24215b = i11 + 1;
        fArr[i11] = fC;
    }

    @Override // wf.a
    public final Object k(Object obj) {
        float[] fArr = (float[]) obj;
        jc.l.e(fArr, "<this>");
        z zVar = new z();
        zVar.f24214a = fArr;
        zVar.f24215b = fArr.length;
        zVar.b(10);
        return zVar;
    }

    @Override // wf.e1
    public final Object n() {
        return new float[0];
    }

    @Override // wf.e1
    public final void o(yf.t tVar, Object obj, int i10) {
        float[] fArr = (float[]) obj;
        jc.l.e(tVar, "encoder");
        jc.l.e(fArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            tVar.i(this.f24113b, i11, fArr[i11]);
        }
    }
}
