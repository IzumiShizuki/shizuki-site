package rh;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f19077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f19078d;

    public b() {
        d();
    }

    public final float a() {
        int i10;
        int i11 = this.f19076b;
        if (i11 <= 0 || (i10 = this.f19075a) <= 4) {
            return 0.01f;
        }
        if (i11 != i10) {
            float f10 = i10 / ((i11 - i10) * this.f19078d);
            if (f10 < 0.99f) {
                return f10;
            }
        }
        return 0.99f;
    }

    public abstract int b(byte[] bArr, int i10);

    public final void c(byte[] bArr, int i10, int i11) {
        int iB = i11 == 2 ? b(bArr, i10) : -1;
        if (iB >= 0) {
            this.f19076b++;
            int[] iArr = this.f19077c;
            if (iB >= iArr.length || 512 <= iArr[iB]) {
                return;
            }
            this.f19075a++;
        }
    }

    public final void d() {
        this.f19076b = 0;
        this.f19075a = 0;
    }
}
