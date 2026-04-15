package ph;

import ch.z;
import java.util.Arrays;
import r.y1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final th.j f17209g = new th.j(new y1(th.j.f20783f), 6, new y1(th.j.f20784g), th.j.f20785h, oh.a.f16450l);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z f17210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public qh.a f17212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public rh.c f17213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f17214f;

    @Override // ph.b
    public final String a() {
        return oh.a.f16450l;
    }

    @Override // ph.b
    public final float b() {
        int i10 = this.f17212d.f18307b;
        return Math.max(i10 > 4 ? (i10 - r0.f18306a[0]) / i10 : -1.0f, this.f17213e.a());
    }

    @Override // ph.b
    public final int c(byte[] bArr, int i10) {
        rh.c cVar = this.f17213e;
        z zVar = this.f17210b;
        qh.a aVar = this.f17212d;
        byte[] bArr2 = this.f17214f;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            int iR = zVar.r(bArr[i11]);
            if (iR == 1) {
                this.f17211c = 3;
                break;
            }
            if (iR == 2) {
                this.f17211c = 2;
                break;
            }
            if (iR == 0) {
                int i12 = zVar.f4285b;
                if (i11 == 0) {
                    bArr2[1] = bArr[0];
                    aVar.a(bArr2, 2 - i12, i12);
                    cVar.c(bArr2, 0, i12);
                } else {
                    aVar.a(bArr, (i11 + 1) - i12, i12);
                    cVar.c(bArr, i11 - 1, i12);
                }
            }
            i11++;
        }
        bArr2[0] = bArr[i10 - 1];
        if (this.f17211c == 1 && aVar.f18307b > 100 && b() > 0.95f) {
            this.f17211c = 2;
        }
        return this.f17211c;
    }

    @Override // ph.b
    public final void d() {
        this.f17210b.f4284a = 0;
        this.f17211c = 1;
        this.f17212d.b();
        this.f17213e.d();
        Arrays.fill(this.f17214f, (byte) 0);
    }
}
