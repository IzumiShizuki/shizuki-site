package r5;

import b0.w1;
import java.util.Collections;
import java.util.List;
import m4.p0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f18880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f18885f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f18886g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f18887h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f18888i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f18889j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f18890k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f18891l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w1 f18892m;

    public w(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f10, int i18, String str, w1 w1Var) {
        this.f18880a = list;
        this.f18881b = i10;
        this.f18882c = i11;
        this.f18883d = i12;
        this.f18884e = i13;
        this.f18885f = i14;
        this.f18886g = i15;
        this.f18887h = i16;
        this.f18888i = i17;
        this.f18889j = f10;
        this.f18890k = i18;
        this.f18891l = str;
        this.f18892m = w1Var;
    }

    public static w a(p4.s sVar, boolean z10, w1 w1Var) {
        q4.k kVarG;
        int i10;
        int i11 = 4;
        try {
            if (z10) {
                sVar.H(4);
            } else {
                sVar.H(21);
            }
            int iU = sVar.u() & 3;
            int iU2 = sVar.u();
            int i12 = sVar.f16612b;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < iU2; i15++) {
                sVar.H(1);
                int iA = sVar.A();
                for (int i16 = 0; i16 < iA; i16++) {
                    int iA2 = sVar.A();
                    i14 += iA2 + 4;
                    sVar.H(iA2);
                }
            }
            sVar.G(i12);
            byte[] bArr = new byte[i14];
            w1 w1Var2 = w1Var;
            String strA = null;
            int i17 = 0;
            int i18 = 0;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            int i22 = -1;
            int i23 = -1;
            int i24 = -1;
            int i25 = -1;
            float f10 = 1.0f;
            int i26 = -1;
            while (i17 < iU2) {
                int iU3 = sVar.u() & 63;
                int iA3 = sVar.A();
                w1 w1VarI = w1Var2;
                int i27 = 0;
                while (i27 < iA3) {
                    int iA4 = sVar.A();
                    int i28 = iU;
                    System.arraycopy(q4.p.f17770a, i13, bArr, i18, i11);
                    int i29 = i18 + 4;
                    System.arraycopy(sVar.f16611a, sVar.f16612b, bArr, i29, iA4);
                    if (iU3 == 32 && i27 == 0) {
                        w1VarI = q4.p.i(bArr, i29, i29 + iA4);
                    } else {
                        if (iU3 == 33 && i27 == 0) {
                            q4.l lVarH = q4.p.h(bArr, i29, i29 + iA4, w1VarI);
                            i19 = lVarH.f17735a + 1;
                            i20 = lVarH.f17737c + 8;
                            i21 = lVarH.f17738d + 8;
                            int i30 = lVarH.f17743i;
                            int i31 = lVarH.f17744j;
                            i22 = i30;
                            int i32 = lVarH.f17745k;
                            float f11 = lVarH.f17741g;
                            int i33 = lVarH.f17742h;
                            q4.h hVar = lVarH.f17736b;
                            if (hVar != null) {
                                i10 = i33;
                                strA = p4.d.a(hVar.f17721a, hVar.f17722b, hVar.f17723c, hVar.f17724d, hVar.f17725e, hVar.f17726f);
                            } else {
                                i10 = i33;
                            }
                            i26 = i10;
                            f10 = f11;
                            i24 = i32;
                            i23 = i31;
                        } else if (iU3 == 39 && i27 == 0 && (kVarG = q4.p.g(bArr, i29, i29 + iA4)) != null && w1VarI != null) {
                            i13 = 0;
                            i25 = kVarG.f17734a == ((q4.g) ((ya.i0) w1VarI.f1395c).get(0)).f17720b ? 4 : 5;
                        }
                        i13 = 0;
                    }
                    i18 = i29 + iA4;
                    sVar.H(iA4);
                    i27++;
                    iU = i28;
                    i11 = 4;
                }
                i17++;
                w1Var2 = w1VarI;
                i11 = 4;
            }
            return new w(i14 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iU + 1, i19, i20, i21, i22, i23, i24, i25, f10, i26, strA, w1Var2);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw p0.a(e10, "Error parsing".concat(z10 ? "L-HEVC config" : "HEVC config"));
        }
    }
}
