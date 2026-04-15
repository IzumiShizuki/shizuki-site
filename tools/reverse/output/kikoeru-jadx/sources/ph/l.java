package ph;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sh.f f17216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f17217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public short f17218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17219f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f17220g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17221h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17222i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h f17223j;

    public l(sh.f fVar) {
        this.f17216c = fVar;
        this.f17217d = false;
        this.f17223j = null;
        this.f17220g = new int[4];
        d();
    }

    @Override // ph.b
    public final String a() {
        h hVar = this.f17223j;
        return hVar == null ? this.f17216c.f20050d : hVar.a();
    }

    @Override // ph.b
    public final float b() {
        int i10 = this.f17219f;
        if (i10 <= 0) {
            return 0.01f;
        }
        float f10 = ((((this.f17220g[3] * 1.0f) / i10) / this.f17216c.f20049c) * this.f17222i) / this.f17221h;
        if (f10 >= 1.0f) {
            return 0.99f;
        }
        return f10;
    }

    @Override // ph.b
    public final int c(byte[] bArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sh.f fVar = this.f17216c;
            byte[] bArr2 = fVar.f20048b;
            short s10 = fVar.f20047a[bArr[i11] & 255];
            if (s10 < 250) {
                this.f17221h++;
            }
            if (s10 < 64) {
                this.f17222i++;
                short s11 = this.f17218e;
                if (s11 < 64) {
                    this.f17219f++;
                    boolean z10 = this.f17217d;
                    int[] iArr = this.f17220g;
                    if (z10) {
                        byte b10 = bArr2[(s10 * 64) + s11];
                        iArr[b10] = iArr[b10] + 1;
                    } else {
                        byte b11 = bArr2[(s11 * 64) + s10];
                        iArr[b11] = iArr[b11] + 1;
                    }
                }
            }
            this.f17218e = s10;
        }
        if (this.f17215b == 1 && this.f17219f > 1024) {
            float fB = b();
            if (fB > 0.95f) {
                this.f17215b = 2;
            } else if (fB < 0.05f) {
                this.f17215b = 3;
            }
        }
        return this.f17215b;
    }

    @Override // ph.b
    public final void d() {
        this.f17215b = 1;
        this.f17218e = (short) 255;
        for (int i10 = 0; i10 < 4; i10++) {
            this.f17220g[i10] = 0;
        }
        this.f17219f = 0;
        this.f17221h = 0;
        this.f17222i = 0;
    }

    public l(sh.b bVar, boolean z10, h hVar) {
        this.f17216c = bVar;
        this.f17217d = z10;
        this.f17223j = hVar;
        this.f17220g = new int[4];
        d();
    }
}
