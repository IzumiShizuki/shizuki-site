package wf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i extends e1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f24128c = new i(j.f24134a);

    @Override // wf.a
    public final int h(Object obj) {
        byte[] bArr = (byte[]) obj;
        jc.l.e(bArr, "<this>");
        return bArr.length;
    }

    @Override // wf.r, wf.a
    public final void j(vf.a aVar, int i10, Object obj) {
        h hVar = (h) obj;
        jc.l.e(hVar, "builder");
        byte bN = aVar.n(this.f24113b, i10);
        hVar.b(hVar.d() + 1);
        byte[] bArr = hVar.f24122a;
        int i11 = hVar.f24123b;
        hVar.f24123b = i11 + 1;
        bArr[i11] = bN;
    }

    @Override // wf.a
    public final Object k(Object obj) {
        byte[] bArr = (byte[]) obj;
        jc.l.e(bArr, "<this>");
        h hVar = new h();
        hVar.f24122a = bArr;
        hVar.f24123b = bArr.length;
        hVar.b(10);
        return hVar;
    }

    @Override // wf.e1
    public final Object n() {
        return new byte[0];
    }

    @Override // wf.e1
    public final void o(yf.t tVar, Object obj, int i10) {
        byte[] bArr = (byte[]) obj;
        jc.l.e(tVar, "encoder");
        jc.l.e(bArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            byte b10 = bArr[i11];
            d1 d1Var = this.f24113b;
            jc.l.e(d1Var, "descriptor");
            tVar.g(d1Var, i11);
            tVar.d(b10);
        }
    }
}
