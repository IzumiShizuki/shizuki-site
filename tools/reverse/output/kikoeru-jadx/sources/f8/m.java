package f8;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class m extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p3.d[] f6885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f6886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6887c;

    public m() {
        this.f6885a = null;
        this.f6887c = 0;
    }

    public p3.d[] getPathData() {
        return this.f6885a;
    }

    public String getPathName() {
        return this.f6886b;
    }

    public void setPathData(p3.d[] dVarArr) {
        if (!n7.d.d(this.f6885a, dVarArr)) {
            this.f6885a = n7.d.m(dVarArr);
            return;
        }
        p3.d[] dVarArr2 = this.f6885a;
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            dVarArr2[i10].f16530a = dVarArr[i10].f16530a;
            int i11 = 0;
            while (true) {
                float[] fArr = dVarArr[i10].f16531b;
                if (i11 < fArr.length) {
                    dVarArr2[i10].f16531b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public m(m mVar) {
        this.f6885a = null;
        this.f6887c = 0;
        this.f6886b = mVar.f6886b;
        this.f6885a = n7.d.m(mVar.f6885a);
    }
}
