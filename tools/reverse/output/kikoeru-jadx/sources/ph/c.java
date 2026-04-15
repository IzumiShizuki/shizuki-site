package ph;

import ch.z;
import java.util.Arrays;
import r.y1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final th.b f17164g = new th.b(new y1(th.b.f20759f), 6, new y1(th.b.f20760g), th.b.f20761h, oh.a.f16447i);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z f17165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public qh.a f17167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public rh.c f17168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f17169f;

    @Override // ph.b
    public final String a() {
        return oh.a.f16447i;
    }

    @Override // ph.b
    public final float b() {
        int i10 = this.f17167d.f18307b;
        return Math.max(i10 > 4 ? (i10 - r0.f18306a[0]) / i10 : -1.0f, this.f17168e.a());
    }

    @Override // ph.b
    public final int c(byte[] bArr, int i10) {
        rh.c cVar = this.f17168e;
        z zVar = this.f17165b;
        qh.a aVar = this.f17167d;
        byte[] bArr2 = this.f17169f;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            int iR = zVar.r(bArr[i11]);
            if (iR == 1) {
                this.f17166c = 3;
                break;
            }
            if (iR == 2) {
                this.f17166c = 2;
                break;
            }
            if (iR == 0) {
                int i12 = zVar.f4285b;
                if (i11 == 0) {
                    bArr2[1] = bArr[0];
                    aVar.a(bArr2, 0, i12);
                    cVar.c(bArr2, 0, i12);
                } else {
                    int i13 = i11 - 1;
                    aVar.a(bArr, i13, i12);
                    cVar.c(bArr, i13, i12);
                }
            }
            i11++;
        }
        bArr2[0] = bArr[i10 - 1];
        if (this.f17166c == 1 && aVar.f18307b > 100 && b() > 0.95f) {
            this.f17166c = 2;
        }
        return this.f17166c;
    }

    @Override // ph.b
    public final void d() {
        this.f17165b.f4284a = 0;
        this.f17166c = 1;
        this.f17167d.b();
        this.f17168e.d();
        Arrays.fill(this.f17169f, (byte) 0);
    }
}
