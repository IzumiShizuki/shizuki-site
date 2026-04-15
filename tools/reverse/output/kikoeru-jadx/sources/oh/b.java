package oh;

import ph.f;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f16466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte f16470f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f16471g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ph.b[] f16472h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f16473i;

    public final void a() {
        ph.b[] bVarArr;
        if (this.f16468d) {
            if (this.f16471g != null) {
                this.f16466b = true;
                return;
            }
            int i10 = this.f16465a;
            if (i10 != 3) {
                if (i10 != 2 && i10 == 1 && this.f16469e) {
                    this.f16471g = a.A;
                    return;
                }
                return;
            }
            int i11 = 0;
            int i12 = 0;
            float f10 = 0.0f;
            while (true) {
                bVarArr = this.f16472h;
                if (i11 >= bVarArr.length) {
                    break;
                }
                float fB = bVarArr[i11].b();
                if (fB > f10) {
                    i12 = i11;
                    f10 = fB;
                }
                i11++;
            }
            if (f10 > 0.2f) {
                this.f16471g = bVarArr[i12].a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(byte[] r21) {
        /*
            Method dump skipped, instruction units count: 938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oh.b.b(byte[]):void");
    }

    public final void c() {
        int i10 = 0;
        this.f16466b = false;
        this.f16467c = true;
        this.f16471g = null;
        this.f16468d = false;
        this.f16465a = 1;
        this.f16470f = (byte) 0;
        f fVar = this.f16473i;
        if (fVar != null) {
            fVar.d();
        }
        while (true) {
            ph.b[] bVarArr = this.f16472h;
            if (i10 >= bVarArr.length) {
                return;
            }
            ph.b bVar = bVarArr[i10];
            if (bVar != null) {
                bVar.d();
            }
            i10++;
        }
    }
}
