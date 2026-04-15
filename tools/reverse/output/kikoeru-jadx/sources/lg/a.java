package lg;

import ah.j;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.io.ByteArrayOutputStream;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ng.a f12534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f12535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f12537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f12538e;

    @Override // lg.b
    public final int g(byte[] bArr, int i10, int i11) throws og.a {
        int[] iArr;
        byte[] bArr2 = bArr;
        byte[] bArr3 = this.f12538e;
        byte[] bArr4 = this.f12537d;
        int i12 = i10;
        while (true) {
            int i13 = i10 + i11;
            if (i12 >= i13) {
                return i11;
            }
            int i14 = i12 + 16;
            int i15 = 16;
            int i16 = i14 <= i13 ? 16 : i13 - i12;
            j jVar = this.f12535b;
            ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) jVar.f392d;
            try {
                if (byteArrayOutputStream.size() + i16 > 4096) {
                    jVar.i(0);
                }
                byteArrayOutputStream.write(bArr2, i12, i16);
                int i17 = this.f12536c;
                bArr4[0] = (byte) i17;
                bArr4[1] = (byte) (i17 >> 8);
                bArr4[2] = (byte) (i17 >> 16);
                int i18 = 24;
                bArr4[3] = (byte) (i17 >> 24);
                for (int i19 = 4; i19 <= 15; i19++) {
                    bArr4[i19] = 0;
                }
                ng.a aVar = this.f12534a;
                int[][] iArr2 = aVar.f15871b;
                if (iArr2 == null) {
                    throw new og.a("AES engine not initialised");
                }
                if (16 > bArr4.length) {
                    throw new og.a("input buffer too short");
                }
                if (16 > bArr3.length) {
                    throw new og.a("output buffer too short");
                }
                int i20 = bArr4[0] & 255;
                aVar.f15872c = i20;
                int i21 = i20 | ((bArr4[1] & 255) << 8);
                aVar.f15872c = i21;
                int i22 = i21 | ((bArr4[2] & 255) << 16);
                aVar.f15872c = i22;
                int i23 = i22 | (bArr4[3] << 24);
                aVar.f15872c = i23;
                int i24 = bArr4[4] & 255;
                aVar.f15873d = i24;
                int i25 = i24 | ((bArr4[5] & 255) << 8);
                aVar.f15873d = i25;
                int i26 = i25 | ((bArr4[6] & 255) << 16);
                aVar.f15873d = i26;
                int i27 = i26 | (bArr4[7] << 24);
                aVar.f15873d = i27;
                int i28 = bArr4[8] & 255;
                aVar.f15874e = i28;
                int i29 = i28 | ((bArr4[9] & 255) << 8);
                aVar.f15874e = i29;
                int i30 = i29 | ((bArr4[10] & 255) << 16);
                aVar.f15874e = i30;
                int i31 = i30 | (bArr4[11] << 24);
                aVar.f15874e = i31;
                int i32 = bArr4[12] & 255;
                aVar.f15875f = i32;
                int i33 = ((bArr4[13] & 255) << 8) | i32;
                aVar.f15875f = i33;
                int i34 = i33 | ((bArr4[14] & 255) << 16);
                aVar.f15875f = i34;
                int i35 = i34 | (bArr4[15] << 24);
                aVar.f15875f = i35;
                int[] iArr3 = iArr2[0];
                aVar.f15872c = i23 ^ iArr3[0];
                aVar.f15873d = iArr3[1] ^ i27;
                aVar.f15874e = iArr3[2] ^ i31;
                aVar.f15875f = iArr3[3] ^ i35;
                int i36 = 1;
                while (true) {
                    int i37 = aVar.f15870a - 1;
                    iArr = ng.a.f15869i;
                    if (i36 >= i37) {
                        break;
                    }
                    int iA = (((iArr[aVar.f15872c & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK] ^ ng.a.a(iArr[(aVar.f15873d >> 8) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK], i18)) ^ ng.a.a(iArr[(aVar.f15874e >> i15) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK], i15)) ^ ng.a.a(iArr[(aVar.f15875f >> i18) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK], 8)) ^ iArr2[i36][0];
                    int iA2 = (((iArr[aVar.f15873d & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK] ^ ng.a.a(iArr[(aVar.f15874e >> 8) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK], i18)) ^ ng.a.a(iArr[(aVar.f15875f >> i15) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK], i15)) ^ ng.a.a(iArr[(aVar.f15872c >> i18) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK], 8)) ^ iArr2[i36][1];
                    int iA3 = (((ng.a.a(iArr[(aVar.f15875f >> 8) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK], i18) ^ iArr[aVar.f15874e & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK]) ^ ng.a.a(iArr[(aVar.f15872c >> 16) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK], 16)) ^ ng.a.a(iArr[(aVar.f15873d >> 24) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK], 8)) ^ iArr2[i36][2];
                    int i38 = i36 + 1;
                    int iA4 = (((iArr[aVar.f15875f & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK] ^ ng.a.a(iArr[(aVar.f15872c >> 8) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK], 24)) ^ ng.a.a(iArr[(aVar.f15873d >> 16) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK], 16)) ^ ng.a.a(iArr[(aVar.f15874e >> 24) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK], 8)) ^ iArr2[i36][3];
                    aVar.f15872c = (((ng.a.a(iArr[(iA2 >> 8) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK], 24) ^ iArr[iA & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK]) ^ ng.a.a(iArr[(iA3 >> 16) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK], 16)) ^ ng.a.a(iArr[(iA4 >> 24) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK], 8)) ^ iArr2[i38][0];
                    aVar.f15873d = (((iArr[iA2 & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK] ^ ng.a.a(iArr[(iA3 >> 8) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK], 24)) ^ ng.a.a(iArr[(iA4 >> 16) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK], 16)) ^ ng.a.a(iArr[(iA >> 24) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK], 8)) ^ iArr2[i38][1];
                    aVar.f15874e = (((iArr[iA3 & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK] ^ ng.a.a(iArr[(iA4 >> 8) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK], 24)) ^ ng.a.a(iArr[(iA >> 16) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK], 16)) ^ ng.a.a(iArr[(iA2 >> 24) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK], 8)) ^ iArr2[i38][2];
                    i36 += 2;
                    aVar.f15875f = (((iArr[iA4 & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK] ^ ng.a.a(iArr[(iA >> 8) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK], 24)) ^ ng.a.a(iArr[(iA2 >> 16) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK], 16)) ^ ng.a.a(iArr[(iA3 >> 24) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK], 8)) ^ iArr2[i38][3];
                    bArr3 = bArr3;
                    bArr4 = bArr4;
                    i15 = 16;
                    i18 = 24;
                }
                byte[] bArr5 = bArr3;
                byte[] bArr6 = bArr4;
                int iA5 = (((iArr[aVar.f15872c & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK] ^ ng.a.a(iArr[(aVar.f15873d >> 8) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK], 24)) ^ ng.a.a(iArr[(aVar.f15874e >> 16) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK], 16)) ^ ng.a.a(iArr[(aVar.f15875f >> 24) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK], 8)) ^ iArr2[i36][0];
                int iA6 = (((iArr[aVar.f15873d & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK] ^ ng.a.a(iArr[(aVar.f15874e >> 8) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK], 24)) ^ ng.a.a(iArr[(aVar.f15875f >> 16) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK], 16)) ^ ng.a.a(iArr[(aVar.f15872c >> 24) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK], 8)) ^ iArr2[i36][1];
                int iA7 = (((iArr[aVar.f15874e & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK] ^ ng.a.a(iArr[(aVar.f15875f >> 8) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK], 24)) ^ ng.a.a(iArr[(aVar.f15872c >> 16) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK], 16)) ^ ng.a.a(iArr[(aVar.f15873d >> 24) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK], 8)) ^ iArr2[i36][2];
                int i39 = i36 + 1;
                int iA8 = (((iArr[aVar.f15875f & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK] ^ ng.a.a(iArr[(aVar.f15872c >> 8) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK], 24)) ^ ng.a.a(iArr[(aVar.f15873d >> 16) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK], 16)) ^ ng.a.a(iArr[(aVar.f15874e >> 24) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK], 8)) ^ iArr2[i36][3];
                int i40 = iA5 & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK;
                byte[] bArr7 = ng.a.f15867g;
                int i41 = (((bArr7[i40] & 255) ^ ((bArr7[(iA6 >> 8) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK] & 255) << 8)) ^ ((bArr7[(iA7 >> 16) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK] & 255) << 16)) ^ (bArr7[(iA8 >> 24) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK] << 24);
                int[] iArr4 = iArr2[i39];
                int i42 = iArr4[0] ^ i41;
                aVar.f15872c = i42;
                int i43 = ((((bArr7[iA6 & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK] & 255) ^ ((bArr7[(iA7 >> 8) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK] & 255) << 8)) ^ ((bArr7[(iA8 >> 16) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK] & 255) << 16)) ^ (bArr7[(iA5 >> 24) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK] << 24)) ^ iArr4[1];
                aVar.f15873d = i43;
                int i44 = ((((bArr7[iA7 & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK] & 255) ^ ((bArr7[(iA8 >> 8) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK] & 255) << 8)) ^ ((bArr7[(iA5 >> 16) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK] & 255) << 16)) ^ (bArr7[(iA6 >> 24) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK] << 24)) ^ iArr4[2];
                aVar.f15874e = i44;
                int i45 = (((((bArr7[(iA5 >> 8) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK] & 255) << 8) ^ (bArr7[iA8 & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK] & 255)) ^ ((bArr7[(iA6 >> 16) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK] & 255) << 16)) ^ (bArr7[(iA7 >> 24) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK] << 24)) ^ iArr4[3];
                aVar.f15875f = i45;
                bArr5[0] = (byte) i42;
                bArr5[1] = (byte) (i42 >> 8);
                bArr5[2] = (byte) (i42 >> 16);
                bArr5[3] = (byte) (i42 >> 24);
                bArr5[4] = (byte) i43;
                bArr5[5] = (byte) (i43 >> 8);
                bArr5[6] = (byte) (i43 >> 16);
                bArr5[7] = (byte) (i43 >> 24);
                bArr5[8] = (byte) i44;
                bArr5[9] = (byte) (i44 >> 8);
                bArr5[10] = (byte) (i44 >> 16);
                bArr5[11] = (byte) (i44 >> 24);
                bArr5[12] = (byte) i45;
                bArr5[13] = (byte) (i45 >> 8);
                bArr5[14] = (byte) (i45 >> 16);
                bArr5[15] = (byte) (i45 >> 24);
                for (int i46 = 0; i46 < i16; i46++) {
                    int i47 = i12 + i46;
                    bArr[i47] = (byte) (bArr[i47] ^ bArr5[i46]);
                }
                this.f12536c++;
                bArr2 = bArr;
                i12 = i14;
                bArr3 = bArr5;
                bArr4 = bArr6;
            } catch (IllegalStateException e10) {
                throw new RuntimeException(e10);
            }
        }
    }
}
