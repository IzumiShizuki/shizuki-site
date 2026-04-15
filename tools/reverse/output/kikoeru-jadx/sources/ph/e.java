package ph;

import ch.z;
import java.util.Arrays;
import r.y1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final th.d f17175f = new th.d(new y1(th.d.f20765f), 7, new y1(th.d.f20766g), th.d.f20767h, oh.a.f16449k);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z f17176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public rh.a f17178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f17179e;

    @Override // ph.b
    public final String a() {
        return oh.a.f16449k;
    }

    @Override // ph.b
    public final float b() {
        return this.f17178d.a();
    }

    @Override // ph.b
    public final int c(byte[] bArr, int i10) {
        byte[] bArr2 = this.f17179e;
        z zVar = this.f17176b;
        rh.a aVar = this.f17178d;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            int iR = zVar.r(bArr[i11]);
            if (iR == 1) {
                this.f17177c = 3;
                break;
            }
            if (iR == 2) {
                this.f17177c = 2;
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
        if (this.f17177c == 1 && aVar.f19076b > 1024 && aVar.a() > 0.95f) {
            this.f17177c = 2;
        }
        return this.f17177c;
    }

    @Override // ph.b
    public final void d() {
        this.f17176b.f4284a = 0;
        this.f17177c = 1;
        this.f17178d.d();
        Arrays.fill(this.f17179e, (byte) 0);
    }
}
