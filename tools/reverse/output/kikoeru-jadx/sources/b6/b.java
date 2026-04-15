package b6;

import gh.g;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import m4.n0;
import p4.r;
import p4.s;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1608b;

    public static c6.a V(s sVar) {
        String strP = sVar.p();
        strP.getClass();
        String strP2 = sVar.p();
        strP2.getClass();
        return new c6.a(strP, strP2, sVar.o(), sVar.o(), Arrays.copyOfRange(sVar.f16611a, sVar.f16612b, sVar.f16613c));
    }

    @Override // gh.g
    public final n0 t(a6.a aVar, ByteBuffer byteBuffer) {
        switch (this.f1608b) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                r rVar = new r(byteBuffer.array(), byteBuffer.limit());
                int i10 = 12;
                rVar.t(12);
                int iF = (rVar.f() + rVar.i(12)) - 4;
                rVar.t(44);
                rVar.u(rVar.i(12));
                rVar.t(16);
                ArrayList arrayList = new ArrayList();
                while (rVar.f() < iF) {
                    rVar.t(48);
                    int i11 = rVar.i(8);
                    rVar.t(4);
                    int iF2 = rVar.f() + rVar.i(i10);
                    String str = null;
                    String str2 = null;
                    while (rVar.f() < iF2) {
                        int i12 = rVar.i(8);
                        int i13 = rVar.i(8);
                        int iF3 = rVar.f() + i13;
                        if (i12 == 2) {
                            int i14 = rVar.i(16);
                            rVar.t(8);
                            if (i14 == 3) {
                                while (rVar.f() < iF3) {
                                    int i15 = rVar.i(8);
                                    Charset charset = StandardCharsets.US_ASCII;
                                    byte[] bArr = new byte[i15];
                                    rVar.l(bArr, i15);
                                    String str3 = new String(bArr, charset);
                                    int i16 = rVar.i(8);
                                    for (int i17 = 0; i17 < i16; i17++) {
                                        rVar.u(rVar.i(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (i12 == 21) {
                            Charset charset2 = StandardCharsets.US_ASCII;
                            byte[] bArr2 = new byte[i13];
                            rVar.l(bArr2, i13);
                            str2 = new String(bArr2, charset2);
                        }
                        rVar.q(iF3 * 8);
                    }
                    rVar.q(iF2 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new a(i11, str.concat(str2)));
                    }
                    i10 = 12;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new n0(arrayList);
            default:
                return new n0(V(new s(byteBuffer.array(), byteBuffer.limit())));
        }
    }
}
