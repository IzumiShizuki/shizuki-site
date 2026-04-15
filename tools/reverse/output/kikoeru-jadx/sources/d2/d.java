package d2;

import ce.j0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f5455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a[] f5457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f5459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f5460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f5461h;

    public /* synthetic */ d() {
        this(false, c.f5451a);
    }

    public final void a(float f10, long j10) {
        int i10 = (this.f5458e + 1) % 20;
        this.f5458e = i10;
        a[] aVarArr = this.f5457d;
        a aVar = aVarArr[i10];
        if (aVar != null) {
            aVar.f5446a = j10;
            aVar.f5447b = f10;
        } else {
            a aVar2 = new a();
            aVar2.f5446a = j10;
            aVar2.f5447b = f10;
            aVarArr[i10] = aVar2;
        }
    }

    public final float b(float f10) {
        c cVar;
        float[] fArr;
        float[] fArr2;
        boolean z10;
        int i10;
        float f11;
        float fSignum;
        float f12 = f10;
        float f13 = 0.0f;
        if (f12 <= 0.0f) {
            f2.a.b("maximumVelocity should be a positive value. You specified=" + f12);
        }
        int i11 = this.f5458e;
        a[] aVarArr = this.f5457d;
        a aVar = aVarArr[i11];
        if (aVar == null) {
            f11 = 0.0f;
        } else {
            int i12 = 0;
            a aVar2 = aVar;
            while (true) {
                a aVar3 = aVarArr[i11];
                boolean z11 = this.f5454a;
                cVar = this.f5455b;
                fArr = this.f5459f;
                fArr2 = this.f5460g;
                if (aVar3 == null) {
                    z10 = z11;
                    i10 = 1;
                    f11 = 0.0f;
                    break;
                }
                long j10 = aVar.f5446a;
                int i13 = i11;
                f11 = 0.0f;
                long j11 = aVar3.f5446a;
                float f14 = j10 - j11;
                z10 = z11;
                i10 = 1;
                float fAbs = Math.abs(j11 - aVar2.f5446a);
                aVar2 = (cVar == c.f5451a || z10) ? aVar3 : aVar;
                if (f14 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i12] = aVar3.f5447b;
                fArr2[i12] = -f14;
                i11 = (i13 == 0 ? 20 : i13) - 1;
                i12++;
                if (i12 >= 20) {
                    break;
                }
            }
            if (i12 >= this.f5456c) {
                int iOrdinal = cVar.ordinal();
                if (iOrdinal == 0) {
                    try {
                        float[] fArr3 = this.f5461h;
                        lc.b.K(fArr2, fArr, i12, fArr3);
                        fSignum = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        fSignum = 0.0f;
                    }
                } else {
                    if (iOrdinal != i10) {
                        throw new j0();
                    }
                    int i14 = i12 - i10;
                    float f15 = fArr2[i14];
                    int i15 = i14;
                    float fAbs2 = 0.0f;
                    while (i15 > 0) {
                        int i16 = i15 - 1;
                        float f16 = fArr2[i16];
                        if (f15 != f16) {
                            float f17 = (z10 ? -fArr[i16] : fArr[i15] - fArr[i16]) / (f15 - f16);
                            fAbs2 += Math.abs(f17) * (f17 - (Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2))));
                            if (i15 == i14) {
                                fAbs2 *= 0.5f;
                            }
                        }
                        i15--;
                        f15 = f16;
                    }
                    fSignum = Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2));
                }
                f13 = fSignum * 1000;
            } else {
                f13 = 0.0f;
            }
        }
        if (f13 == f11 || Float.isNaN(f13)) {
            return 0.0f;
        }
        if (f13 <= f11) {
            f12 = -f12;
            if (f13 >= f12) {
                return f13;
            }
        } else if (f13 <= f12) {
            f12 = f13;
        }
        return f12;
    }

    public d(boolean z10, c cVar) {
        int i10;
        this.f5454a = z10;
        this.f5455b = cVar;
        if (z10 && cVar.equals(c.f5451a)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int iOrdinal = cVar.ordinal();
        if (iOrdinal == 0) {
            i10 = 3;
        } else {
            if (iOrdinal != 1) {
                throw new j0();
            }
            i10 = 2;
        }
        this.f5456c = i10;
        this.f5457d = new a[20];
        this.f5459f = new float[20];
        this.f5460g = new float[20];
        this.f5461h = new float[3];
    }

    public d(int i10) {
        this(true, c.f5452b);
    }
}
