package q4;

import j2.h0;
import java.util.ArrayList;
import java.util.Arrays;
import m4.k0;
import m4.m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f17705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17707d;

    public a(String str, byte[] bArr, int i10, int i11) {
        boolean z10;
        byte b10;
        str.getClass();
        switch (str) {
            case "com.android.capture.fps":
                if (i11 == 23 && bArr.length == 4) {
                    z10 = true;
                }
                p4.c.c(z10);
                break;
            case "auxiliary.tracks.interleaved":
                if (i11 == 75 && bArr.length == 1 && ((b10 = bArr[0]) == 0 || b10 == 1)) {
                    z10 = true;
                }
                p4.c.c(z10);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i11 == 78 && bArr.length == 8) {
                    z10 = true;
                }
                p4.c.c(z10);
                break;
            case "auxiliary.tracks.map":
                p4.c.c(i11 == 0);
                break;
        }
        this.f17704a = str;
        this.f17705b = bArr;
        this.f17706c = i10;
        this.f17707d = i11;
    }

    @Override // m4.m0
    public final /* synthetic */ m4.q a() {
        return null;
    }

    @Override // m4.m0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final ArrayList d() {
        p4.c.h("Metadata is not an auxiliary tracks map", this.f17704a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.f17705b;
        byte b10 = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < b10; i10++) {
            arrayList.add(Integer.valueOf(bArr[i10 + 2]));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f17704a.equals(aVar.f17704a) && Arrays.equals(this.f17705b, aVar.f17705b) && this.f17706c == aVar.f17706c && this.f17707d == aVar.f17707d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f17705b) + h0.e(527, 31, this.f17704a)) * 31) + this.f17706c) * 31) + this.f17707d;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r6 = this;
            java.lang.String r0 = r6.f17704a
            r1 = 0
            byte[] r2 = r6.f17705b
            int r3 = r6.f17707d
            if (r3 == 0) goto L51
            r4 = 1
            if (r3 == r4) goto L4c
            r4 = 23
            if (r3 == r4) goto L3f
            r4 = 67
            if (r3 == r4) goto L36
            r4 = 75
            if (r3 == r4) goto L2c
            r4 = 78
            if (r3 == r4) goto L1d
            goto L7a
        L1d:
            p4.s r1 = new p4.s
            r1.<init>(r2)
            long r1 = r1.z()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto La8
        L2c:
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto La8
        L36:
            int r1 = g8.a.v(r2)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto La8
        L3f:
            int r1 = g8.a.v(r2)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto La8
        L4c:
            java.lang.String r1 = p4.c0.p(r2)
            goto La8
        L51:
            java.lang.String r3 = "auxiliary.tracks.map"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L7a
            java.util.ArrayList r1 = r6.d()
            java.lang.String r2 = "track types = "
            java.lang.StringBuilder r2 = j2.h0.p(r2)
            app.nekogram.translator.r r3 = new app.nekogram.translator.r
            r4 = 44
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
            r3.a(r2, r1)
            java.lang.String r1 = r2.toString()
            goto La8
        L7a:
            int r3 = p4.c0.f16548a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r4 = r2.length
            int r4 = r4 * 2
            r3.<init>(r4)
        L84:
            int r4 = r2.length
            if (r1 >= r4) goto La4
            r4 = r2[r1]
            int r4 = r4 >> 4
            r4 = r4 & 15
            r5 = 16
            char r4 = java.lang.Character.forDigit(r4, r5)
            r3.append(r4)
            r4 = r2[r1]
            r4 = r4 & 15
            char r4 = java.lang.Character.forDigit(r4, r5)
            r3.append(r4)
            int r1 = r1 + 1
            goto L84
        La4:
            java.lang.String r1 = r3.toString()
        La8:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "mdta: key="
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = ", value="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.a.toString():java.lang.String");
    }

    @Override // m4.m0
    public final /* synthetic */ void b(k0 k0Var) {
    }
}
