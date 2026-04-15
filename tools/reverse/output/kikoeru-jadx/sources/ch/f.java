package ch;

import java.io.EOFException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lh.f f4176a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4178c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4183h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4177b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4179d = 4096;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d[] f4180e = new d[8];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4181f = 7;

    public f(lh.f fVar) {
        this.f4176a = fVar;
    }

    public final void a(int i10) {
        int i11;
        if (i10 > 0) {
            int length = this.f4180e.length - 1;
            int i12 = 0;
            while (true) {
                i11 = this.f4181f;
                if (length < i11 || i10 <= 0) {
                    break;
                }
                d dVar = this.f4180e[length];
                jc.l.b(dVar);
                i10 -= dVar.f4167c;
                int i13 = this.f4183h;
                d dVar2 = this.f4180e[length];
                jc.l.b(dVar2);
                this.f4183h = i13 - dVar2.f4167c;
                this.f4182g--;
                i12++;
                length--;
            }
            d[] dVarArr = this.f4180e;
            int i14 = i11 + 1;
            System.arraycopy(dVarArr, i14, dVarArr, i14 + i12, this.f4182g);
            d[] dVarArr2 = this.f4180e;
            int i15 = this.f4181f + 1;
            Arrays.fill(dVarArr2, i15, i15 + i12, (Object) null);
            this.f4181f += i12;
        }
    }

    public final void b(d dVar) {
        int i10 = dVar.f4167c;
        int i11 = this.f4179d;
        if (i10 > i11) {
            d[] dVarArr = this.f4180e;
            vb.l.p0(0, dVarArr.length, dVarArr);
            this.f4181f = this.f4180e.length - 1;
            this.f4182g = 0;
            this.f4183h = 0;
            return;
        }
        a((this.f4183h + i10) - i11);
        int i12 = this.f4182g + 1;
        d[] dVarArr2 = this.f4180e;
        if (i12 > dVarArr2.length) {
            d[] dVarArr3 = new d[dVarArr2.length * 2];
            System.arraycopy(dVarArr2, 0, dVarArr3, dVarArr2.length, dVarArr2.length);
            this.f4181f = this.f4180e.length - 1;
            this.f4180e = dVarArr3;
        }
        int i13 = this.f4181f;
        this.f4181f = i13 - 1;
        this.f4180e[i13] = dVar;
        this.f4182g++;
        this.f4183h += i10;
    }

    public final void c(lh.i iVar) throws EOFException {
        jc.l.e(iVar, "data");
        int[] iArr = a0.f4143a;
        int iD = iVar.d();
        long j10 = 0;
        long j11 = 0;
        for (int i10 = 0; i10 < iD; i10++) {
            byte bI = iVar.i(i10);
            byte[] bArr = wg.e.f24227a;
            j11 += (long) a0.f4144b[bI & 255];
        }
        int i11 = (int) ((j11 + ((long) 7)) >> 3);
        int iD2 = iVar.d();
        lh.f fVar = this.f4176a;
        if (i11 >= iD2) {
            e(iVar.d(), 127, 0);
            fVar.X(iVar);
            return;
        }
        lh.f fVar2 = new lh.f();
        int[] iArr2 = a0.f4143a;
        int iD3 = iVar.d();
        int i12 = 0;
        for (int i13 = 0; i13 < iD3; i13++) {
            byte bI2 = iVar.i(i13);
            byte[] bArr2 = wg.e.f24227a;
            int i14 = bI2 & 255;
            int i15 = a0.f4143a[i14];
            byte b10 = a0.f4144b[i14];
            j10 = (j10 << b10) | ((long) i15);
            i12 += b10;
            while (i12 >= 8) {
                i12 -= 8;
                fVar2.e0((int) (j10 >> i12));
            }
        }
        if (i12 > 0) {
            fVar2.e0((int) ((j10 << (8 - i12)) | (255 >>> i12)));
        }
        lh.i iVarJ = fVar2.j(fVar2.f12571b);
        e(iVarJ.d(), 127, 128);
        fVar.X(iVarJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.util.ArrayList r14) throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.f.d(java.util.ArrayList):void");
    }

    public final void e(int i10, int i11, int i12) {
        lh.f fVar = this.f4176a;
        if (i10 < i11) {
            fVar.e0(i10 | i12);
            return;
        }
        fVar.e0(i12 | i11);
        int i13 = i10 - i11;
        while (i13 >= 128) {
            fVar.e0(128 | (i13 & 127));
            i13 >>>= 7;
        }
        fVar.e0(i13);
    }
}
