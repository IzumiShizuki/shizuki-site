package r5;

import java.util.ArrayList;
import m4.p0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f18786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f18791f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f18792g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f18793h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f18794i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f18795j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f18796k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f18797l;

    public d(ArrayList arrayList, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f10, String str) {
        this.f18786a = arrayList;
        this.f18787b = i10;
        this.f18788c = i11;
        this.f18789d = i12;
        this.f18790e = i13;
        this.f18791f = i14;
        this.f18792g = i15;
        this.f18793h = i16;
        this.f18794i = i17;
        this.f18795j = i18;
        this.f18796k = f10;
        this.f18797l = str;
    }

    public static d a(p4.s sVar) throws p0 {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        float f10;
        try {
            sVar.H(4);
            int iU = (sVar.u() & 3) + 1;
            if (iU == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iU2 = sVar.u() & 31;
            for (int i18 = 0; i18 < iU2; i18++) {
                int iA = sVar.A();
                int i19 = sVar.f16612b;
                sVar.H(iA);
                byte[] bArr = sVar.f16611a;
                byte[] bArr2 = new byte[iA + 4];
                System.arraycopy(p4.d.f16565a, 0, bArr2, 0, 4);
                System.arraycopy(bArr, i19, bArr2, 4, iA);
                arrayList.add(bArr2);
            }
            int iU3 = sVar.u();
            for (int i20 = 0; i20 < iU3; i20++) {
                int iA2 = sVar.A();
                int i21 = sVar.f16612b;
                sVar.H(iA2);
                byte[] bArr3 = sVar.f16611a;
                byte[] bArr4 = new byte[iA2 + 4];
                System.arraycopy(p4.d.f16565a, 0, bArr4, 0, 4);
                System.arraycopy(bArr3, i21, bArr4, 4, iA2);
                arrayList.add(bArr4);
            }
            if (iU2 > 0) {
                q4.o oVarJ = q4.p.j((byte[]) arrayList.get(0), 4, ((byte[]) arrayList.get(0)).length);
                int i22 = oVarJ.f17755e;
                int i23 = oVarJ.f17756f;
                int i24 = oVarJ.f17758h + 8;
                int i25 = oVarJ.f17759i + 8;
                int i26 = oVarJ.f17766p;
                int i27 = oVarJ.f17767q;
                int i28 = oVarJ.f17768r;
                int i29 = oVarJ.f17769s;
                float f11 = oVarJ.f17757g;
                int i30 = oVarJ.f17751a;
                int i31 = oVarJ.f17752b;
                int i32 = oVarJ.f17753c;
                byte[] bArr5 = p4.d.f16565a;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i30), Integer.valueOf(i31), Integer.valueOf(i32));
                i17 = i29;
                f10 = f11;
                i15 = i27;
                i16 = i28;
                i13 = i25;
                i14 = i26;
                i11 = i23;
                i12 = i24;
                i10 = i22;
            } else {
                str = null;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                i15 = -1;
                i16 = -1;
                i17 = 16;
                f10 = 1.0f;
            }
            return new d(arrayList, iU, i10, i11, i12, i13, i14, i15, i16, i17, f10, str);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw p0.a(e10, "Error parsing AVC config");
        }
    }
}
