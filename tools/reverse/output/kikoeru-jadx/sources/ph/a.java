package ph;

import ch.z;
import java.util.Arrays;
import r.y1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final th.a f17158f = new th.a(new y1(th.a.f20756f), 5, new y1(th.a.f20757g), th.a.f20758h, oh.a.f16445g);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z f17159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public rh.a f17161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f17162e;

    @Override // ph.b
    public final String a() {
        return oh.a.f16445g;
    }

    @Override // ph.b
    public final float b() {
        return this.f17161d.a();
    }

    @Override // ph.b
    public final int c(byte[] bArr, int i10) {
        byte[] bArr2 = this.f17162e;
        z zVar = this.f17159b;
        rh.a aVar = this.f17161d;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            int iR = zVar.r(bArr[i11]);
            if (iR == 1) {
                this.f17160c = 3;
                break;
            }
            if (iR == 2) {
                this.f17160c = 2;
                break;
            }
            if (iR == 0) {
                int i12 = zVar.f4285b;
                if (i11 == 0) {
                    bArr2[1] = bArr[0];
                    aVar.c(bArr2, 0, i12);
                } else {
                    aVar.c(bArr, i11 - 1, i12);
                }
            }
            i11++;
        }
        bArr2[0] = bArr[i10 - 1];
        if (this.f17160c == 1 && aVar.f19076b > 1024 && aVar.a() > 0.95f) {
            this.f17160c = 2;
        }
        return this.f17160c;
    }

    @Override // ph.b
    public final void d() {
        this.f17159b.f4284a = 0;
        this.f17160c = 1;
        this.f17161d.d();
        Arrays.fill(this.f17162e, (byte) 0);
    }
}
