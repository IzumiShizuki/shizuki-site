package ph;

import ch.z;
import r.y1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final th.k f17224e = new th.k(new y1(th.k.f20786f), 16, new y1(th.k.f20787g), th.k.f20788h, oh.a.f16459u);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z f17225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17227d;

    @Override // ph.b
    public final String a() {
        return oh.a.f16459u;
    }

    @Override // ph.b
    public final float b() {
        float f10 = 0.99f;
        if (this.f17227d >= 6) {
            return 0.99f;
        }
        for (int i10 = 0; i10 < this.f17227d; i10++) {
            f10 *= 0.5f;
        }
        return 1.0f - f10;
    }

    @Override // ph.b
    public final int c(byte[] bArr, int i10) {
        z zVar = this.f17225b;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            int iR = zVar.r(bArr[i11]);
            if (iR == 1) {
                this.f17226c = 3;
                break;
            }
            if (iR == 2) {
                this.f17226c = 2;
                break;
            }
            if (iR == 0 && zVar.f4285b >= 2) {
                this.f17227d++;
            }
            i11++;
        }
        if (this.f17226c == 1 && b() > 0.95f) {
            this.f17226c = 2;
        }
        return this.f17226c;
    }

    @Override // ph.b
    public final void d() {
        this.f17225b.f4284a = 0;
        this.f17227d = 0;
        this.f17226c = 1;
    }
}
