package ph;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte f17195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f17196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l f17197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l f17198g;

    public static boolean e(byte b10) {
        int i10 = b10 & 255;
        return i10 == 234 || i10 == 237 || i10 == 239 || i10 == 243 || i10 == 245;
    }

    @Override // ph.b
    public final String a() {
        int i10 = this.f17193b - this.f17194c;
        if (i10 >= 5) {
            return oh.a.f16458t;
        }
        if (i10 <= -5) {
            return oh.a.f16444f;
        }
        float fB = this.f17197f.b() - this.f17198g.b();
        return fB > 0.01f ? oh.a.f16458t : fB < -0.01f ? oh.a.f16444f : i10 < 0 ? oh.a.f16444f : oh.a.f16458t;
    }

    @Override // ph.b
    public final float b() {
        return 0.0f;
    }

    @Override // ph.b
    public final int c(byte[] bArr, int i10) {
        if (((this.f17197f.f17215b == 3 && this.f17198g.f17215b == 3) ? (char) 3 : (char) 1) == 3) {
            return 3;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            byte b10 = bArr[i11];
            if (b10 == 32) {
                if (this.f17196e != 32) {
                    if (e(this.f17195d)) {
                        this.f17193b++;
                    } else {
                        int i12 = this.f17195d & 255;
                        if (i12 == 235 || i12 == 238 || i12 == 240 || i12 == 244) {
                            this.f17194c++;
                        }
                    }
                }
            } else if (this.f17196e == 32 && e(this.f17195d) && b10 != 32) {
                this.f17194c++;
            }
            this.f17196e = this.f17195d;
            this.f17195d = b10;
        }
        return 1;
    }

    @Override // ph.b
    public final void d() {
        this.f17193b = 0;
        this.f17194c = 0;
        this.f17195d = (byte) 32;
        this.f17196e = (byte) 32;
    }
}
