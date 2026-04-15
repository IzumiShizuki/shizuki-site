package n4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f15303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f15304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f15305e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f15306f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f15307g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d f15308h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15309i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h f15310j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ByteBuffer f15311k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ShortBuffer f15312l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ByteBuffer f15313m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f15314n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f15315o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f15316p;

    @Override // n4.f
    public final ByteBuffer a() {
        h hVar = this.f15310j;
        if (hVar != null) {
            int i10 = hVar.f15280b;
            p4.c.i(hVar.f15291m >= 0);
            int i11 = hVar.f15291m * i10 * 2;
            if (i11 > 0) {
                if (this.f15311k.capacity() < i11) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
                    this.f15311k = byteBufferOrder;
                    this.f15312l = byteBufferOrder.asShortBuffer();
                } else {
                    this.f15311k.clear();
                    this.f15312l.clear();
                }
                ShortBuffer shortBuffer = this.f15312l;
                p4.c.i(hVar.f15291m >= 0);
                int iMin = Math.min(shortBuffer.remaining() / i10, hVar.f15291m);
                int i12 = iMin * i10;
                shortBuffer.put(hVar.f15290l, 0, i12);
                int i13 = hVar.f15291m - iMin;
                hVar.f15291m = i13;
                short[] sArr = hVar.f15290l;
                System.arraycopy(sArr, i12, sArr, 0, i13 * i10);
                this.f15315o += (long) i11;
                this.f15311k.limit(i11);
                this.f15313m = this.f15311k;
            }
        }
        ByteBuffer byteBuffer = this.f15313m;
        this.f15313m = f.f15271a;
        return byteBuffer;
    }

    @Override // n4.f
    public final boolean b() {
        if (this.f15306f.f15267a != -1) {
            return Math.abs(this.f15303c - 1.0f) >= 1.0E-4f || Math.abs(this.f15304d - 1.0f) >= 1.0E-4f || this.f15306f.f15267a != this.f15305e.f15267a;
        }
        return false;
    }

    @Override // n4.f
    public final void c(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            h hVar = this.f15310j;
            hVar.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f15314n += (long) iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i10 = hVar.f15280b;
            int i11 = iRemaining2 / i10;
            short[] sArrC = hVar.c(hVar.f15288j, hVar.f15289k, i11);
            hVar.f15288j = sArrC;
            shortBufferAsShortBuffer.get(sArrC, hVar.f15289k * i10, ((i11 * i10) * 2) / 2);
            hVar.f15289k += i11;
            hVar.f();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // n4.f
    public final d d(d dVar) throws e {
        if (dVar.f15269c != 2) {
            throw new e(dVar);
        }
        int i10 = this.f15302b;
        if (i10 == -1) {
            i10 = dVar.f15267a;
        }
        this.f15305e = dVar;
        d dVar2 = new d(i10, dVar.f15268b, 2);
        this.f15306f = dVar2;
        this.f15309i = true;
        return dVar2;
    }

    @Override // n4.f
    public final void e() {
        h hVar = this.f15310j;
        if (hVar != null) {
            int i10 = hVar.f15289k;
            float f10 = hVar.f15281c;
            float f11 = hVar.f15282d;
            double d10 = f10 / f11;
            double d11 = hVar.f15283e * f11;
            int i11 = hVar.f15296r;
            int i12 = hVar.f15291m + ((int) ((((((((double) (i10 - i11)) / d10) + ((double) i11)) + hVar.f15301w) + ((double) hVar.f15293o)) / d11) + 0.5d));
            hVar.f15301w = 0.0d;
            short[] sArr = hVar.f15288j;
            int i13 = hVar.f15286h * 2;
            hVar.f15288j = hVar.c(sArr, i10, i13 + i10);
            int i14 = 0;
            while (true) {
                int i15 = hVar.f15280b;
                if (i14 >= i13 * i15) {
                    break;
                }
                hVar.f15288j[(i15 * i10) + i14] = 0;
                i14++;
            }
            hVar.f15289k = i13 + hVar.f15289k;
            hVar.f();
            if (hVar.f15291m > i12) {
                hVar.f15291m = Math.max(i12, 0);
            }
            hVar.f15289k = 0;
            hVar.f15296r = 0;
            hVar.f15293o = 0;
        }
        this.f15316p = true;
    }

    @Override // n4.f
    public final boolean f() {
        if (this.f15316p) {
            h hVar = this.f15310j;
            if (hVar != null) {
                p4.c.i(hVar.f15291m >= 0);
                if (hVar.f15291m * hVar.f15280b * 2 == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // n4.f
    public final void flush() {
        if (b()) {
            d dVar = this.f15305e;
            this.f15307g = dVar;
            d dVar2 = this.f15306f;
            this.f15308h = dVar2;
            if (this.f15309i) {
                this.f15310j = new h(this.f15303c, this.f15304d, dVar.f15267a, dVar.f15268b, dVar2.f15267a);
            } else {
                h hVar = this.f15310j;
                if (hVar != null) {
                    hVar.f15289k = 0;
                    hVar.f15291m = 0;
                    hVar.f15293o = 0;
                    hVar.f15294p = 0;
                    hVar.f15295q = 0;
                    hVar.f15296r = 0;
                    hVar.f15297s = 0;
                    hVar.f15298t = 0;
                    hVar.f15299u = 0;
                    hVar.f15300v = 0;
                    hVar.f15301w = 0.0d;
                }
            }
        }
        this.f15313m = f.f15271a;
        this.f15314n = 0L;
        this.f15315o = 0L;
        this.f15316p = false;
    }

    @Override // n4.f
    public final void reset() {
        this.f15303c = 1.0f;
        this.f15304d = 1.0f;
        d dVar = d.f15266e;
        this.f15305e = dVar;
        this.f15306f = dVar;
        this.f15307g = dVar;
        this.f15308h = dVar;
        ByteBuffer byteBuffer = f.f15271a;
        this.f15311k = byteBuffer;
        this.f15312l = byteBuffer.asShortBuffer();
        this.f15313m = byteBuffer;
        this.f15302b = -1;
        this.f15309i = false;
        this.f15310j = null;
        this.f15314n = 0L;
        this.f15315o = 0L;
        this.f15316p = false;
    }
}
