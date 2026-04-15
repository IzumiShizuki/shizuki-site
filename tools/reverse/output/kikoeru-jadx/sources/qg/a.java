package qg;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import javax.crypto.Mac;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f18260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f18261f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18262g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18263h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18264i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f18265j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f18266k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f18267l;

    @Override // qg.b
    public final void b(InputStream inputStream, int i10) throws IOException {
        byte[] bArr = new byte[10];
        if (n7.d.x(inputStream, bArr) != 10) {
            throw new og.a("Invalid AES Mac bytes. Could not read sufficient data");
        }
        ah.j jVar = ((lg.a) this.f18269b).f12535b;
        if (((ByteArrayOutputStream) jVar.f392d).size() > 0) {
            jVar.i(i10);
        }
        byte[] bArr2 = new byte[10];
        System.arraycopy(((Mac) jVar.f391c).doFinal(), 0, bArr2, 0, 10);
        if (!Arrays.equals(bArr, bArr2)) {
            throw new IOException("Reached end of data for this entry, but aes verification failed");
        }
    }

    @Override // qg.b
    public final lg.b g(rg.f fVar, char[] cArr, boolean z10) throws IOException {
        int i10;
        rg.a aVar = fVar.B;
        if (aVar == null) {
            throw new IOException("invalid aes extra data record");
        }
        int i11 = aVar.f19035p;
        if (i11 == 0) {
            throw new IOException("Invalid aes key strength in aes extra data record");
        }
        int iU = t0.u(i11);
        byte[] bArr = new byte[iU];
        i(bArr);
        byte[] bArr2 = new byte[2];
        i(bArr2);
        lg.a aVar2 = new lg.a();
        aVar2.f12536c = 1;
        aVar2.f12537d = new byte[16];
        aVar2.f12538e = new byte[16];
        if (cArr == null || cArr.length <= 0) {
            throw new og.a("empty or null password provided for AES decryption");
        }
        int i12 = aVar.f19035p;
        int i13 = 32;
        if (i12 == 1) {
            i10 = 16;
        } else if (i12 == 2) {
            i10 = 24;
        } else {
            if (i12 != 3) {
                throw null;
            }
            i10 = 32;
        }
        if (i12 == 1) {
            i13 = 16;
        } else if (i12 == 2) {
            i13 = 24;
        } else if (i12 != 3) {
            throw null;
        }
        int i14 = i10 + i13;
        int i15 = i14 + 2;
        byte[] bArrG = n7.d.g(cArr, z10);
        ah.j jVar = new ah.j((byte) 0, 11);
        jVar.x(bArrG);
        int i16 = i15 == 0 ? jVar.f390b : i15;
        int i17 = jVar.f390b;
        int i18 = (i16 / i17) + (i16 % i17 > 0 ? 1 : 0);
        int i19 = i16 - ((i18 - 1) * i17);
        byte[] bArr3 = new byte[i18 * i17];
        int i20 = 0;
        int i21 = 1;
        while (i21 <= i18) {
            int i22 = i18;
            int i23 = jVar.f390b;
            int i24 = i13;
            byte[] bArr4 = new byte[i23];
            lg.a aVar3 = aVar2;
            byte[] bArr5 = new byte[iU + 4];
            int i25 = i10;
            System.arraycopy(bArr, 0, bArr5, 0, iU);
            bArr5[iU] = (byte) (i21 / 16777216);
            bArr5[iU + 1] = (byte) (i21 / 65536);
            bArr5[iU + 2] = (byte) (i21 / 256);
            bArr5[iU + 3] = (byte) i21;
            int i26 = iU;
            byte[] bArrDoFinal = bArr5;
            int i27 = 0;
            while (i27 < 1000) {
                if (((ByteArrayOutputStream) jVar.f392d).size() > 0) {
                    jVar.i(0);
                }
                bArrDoFinal = ((Mac) jVar.f391c).doFinal(bArrDoFinal);
                int i28 = 0;
                while (i28 < i23) {
                    bArr4[i28] = (byte) (bArr4[i28] ^ bArrDoFinal[i28]);
                    i28++;
                    i27 = i27;
                }
                i27++;
            }
            System.arraycopy(bArr4, 0, bArr3, i20, i23);
            i20 += i17;
            i21++;
            i18 = i22;
            i13 = i24;
            aVar2 = aVar3;
            i10 = i25;
            iU = i26;
        }
        lg.a aVar4 = aVar2;
        int i29 = i13;
        int i30 = i10;
        if (i19 < i17) {
            byte[] bArr6 = new byte[i16];
            System.arraycopy(bArr3, 0, bArr6, 0, i16);
            bArr3 = bArr6;
        }
        if (bArr3.length != i15) {
            throw new og.a(String.format("Derived Key invalid for Key Length [%d] MAC Length [%d]", Integer.valueOf(i30), Integer.valueOf(i29)));
        }
        byte[] bArr7 = new byte[2];
        System.arraycopy(bArr3, i14, bArr7, 0, 2);
        if (!Arrays.equals(bArr2, bArr7)) {
            throw new og.a("Wrong Password");
        }
        byte[] bArr8 = new byte[i30];
        System.arraycopy(bArr3, 0, bArr8, 0, i30);
        ng.a aVar5 = new ng.a();
        aVar5.f15871b = null;
        int i31 = i30 / 4;
        if ((i31 != 4 && i31 != 6 && i31 != 8) || i31 * 4 != i30) {
            throw new og.a("invalid key length (not 128/192/256)");
        }
        aVar5.f15870a = i31 + 6;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i31 + 7, 4);
        int i32 = 0;
        int i33 = 0;
        while (i32 < i30) {
            iArr[i33 >> 2][i33 & 3] = (bArr8[i32] & 255) | ((bArr8[i32 + 1] & 255) << 8) | ((bArr8[i32 + 2] & 255) << 16) | (bArr8[i32 + 3] << 24);
            i32 += 4;
            i33++;
        }
        int i34 = (aVar5.f15870a + 1) << 2;
        for (int i35 = i31; i35 < i34; i35++) {
            int i36 = i35 - 1;
            int iB = iArr[i36 >> 2][i36 & 3];
            int i37 = i35 % i31;
            if (i37 == 0) {
                iB = ng.a.b(ng.a.a(iB, 8)) ^ ng.a.f15868h[(i35 / i31) - 1];
            } else if (i31 > 6 && i37 == 4) {
                iB = ng.a.b(iB);
            }
            int i38 = i35 - i31;
            iArr[i35 >> 2][i35 & 3] = iB ^ iArr[i38 >> 2][i38 & 3];
        }
        aVar5.f15871b = iArr;
        aVar4.f12534a = aVar5;
        byte[] bArr9 = new byte[i29];
        System.arraycopy(bArr3, i30, bArr9, 0, i29);
        ah.j jVar2 = new ah.j((byte) 0, 11);
        jVar2.x(bArr9);
        aVar4.f12535b = jVar2;
        return aVar4;
    }

    public final void k(byte[] bArr, int i10) {
        int i11 = this.f18264i;
        int i12 = this.f18263h;
        if (i11 >= i12) {
            i11 = i12;
        }
        this.f18267l = i11;
        System.arraycopy(this.f18261f, this.f18262g, bArr, i10, i11);
        int i13 = this.f18267l;
        int i14 = this.f18262g + i13;
        this.f18262g = i14;
        if (i14 >= 15) {
            this.f18262g = 15;
        }
        int i15 = this.f18263h - i13;
        this.f18263h = i15;
        if (i15 <= 0) {
            this.f18263h = 0;
        }
        this.f18266k += i13;
        this.f18264i -= i13;
        this.f18265j += i13;
    }

    @Override // qg.b, java.io.InputStream
    public final int read() {
        byte[] bArr = this.f18260e;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0];
    }

    @Override // qg.b, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    @Override // qg.b, java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int read(byte[] r4, int r5, int r6) {
        /*
            r3 = this;
            r3.f18264i = r6
            r3.f18265j = r5
            r0 = 0
            r3.f18266k = r0
            int r1 = r3.f18263h
            if (r1 == 0) goto L13
            r3.k(r4, r5)
            int r5 = r3.f18266k
            if (r5 != r6) goto L13
            return r5
        L13:
            int r5 = r3.f18264i
            r1 = 16
            r2 = -1
            if (r5 >= r1) goto L38
            byte[] r5 = r3.f18261f
            int r1 = r5.length
            int r5 = super.read(r5, r0, r1)
            r3.f18262g = r0
            if (r5 != r2) goto L2c
            r3.f18263h = r0
            int r4 = r3.f18266k
            if (r4 <= 0) goto L4a
            return r4
        L2c:
            r3.f18263h = r5
            int r5 = r3.f18265j
            r3.k(r4, r5)
            int r5 = r3.f18266k
            if (r5 != r6) goto L38
            return r5
        L38:
            int r5 = r3.f18265j
            int r6 = r3.f18264i
            int r0 = r6 % 16
            int r6 = r6 - r0
            int r4 = super.read(r4, r5, r6)
            if (r4 != r2) goto L4b
            int r4 = r3.f18266k
            if (r4 <= 0) goto L4a
            return r4
        L4a:
            return r2
        L4b:
            int r5 = r3.f18266k
            int r4 = r4 + r5
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: qg.a.read(byte[], int, int):int");
    }
}
