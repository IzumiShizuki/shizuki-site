package c9;

import ef.n;
import j2.h0;
import java.nio.charset.Charset;
import java.util.Arrays;
import jc.l;
import na.w;
import ub.p;
import xf.r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f3806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f3807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f3808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f3809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f3810h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f3811i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f3812j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p f3813k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p f3814l;

    public f(int i10, long j10, String str, byte[] bArr, String str2, byte[] bArr2, String str3, long j11, String str4, String str5) {
        l.e(str, "sourceId");
        l.e(bArr, "nameBin");
        l.e(bArr2, "lyricBin");
        l.e(str4, "documentUri");
        l.e(str5, "zipInnerPath");
        this.f3803a = i10;
        this.f3804b = j10;
        this.f3805c = str;
        this.f3806d = bArr;
        this.f3807e = str2;
        this.f3808f = bArr2;
        this.f3809g = str3;
        this.f3810h = j11;
        this.f3811i = str4;
        this.f3812j = str5;
        final int i11 = 0;
        this.f3813k = ub.a.d(new ic.a(this) { // from class: c9.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f3802b;

            {
                this.f3802b = this;
            }

            @Override // ic.a
            public final Object b() {
                int i12 = i11;
                f fVar = this.f3802b;
                switch (i12) {
                    case 0:
                        byte[] bArr3 = fVar.f3806d;
                        String strName = fVar.f3807e;
                        if (strName == null) {
                            strName = ef.a.f6541a.name();
                        }
                        Charset charsetForName = Charset.forName(strName);
                        l.d(charsetForName, "forName(...)");
                        r rVar = w.f15765a;
                        l.e(bArr3, "<this>");
                        String str6 = new String(bArr3, charsetForName);
                        return n.Q0('/', str6, str6);
                    default:
                        byte[] bArr4 = fVar.f3808f;
                        String strName2 = fVar.f3809g;
                        if (strName2 == null) {
                            strName2 = ef.a.f6541a.name();
                        }
                        Charset charsetForName2 = Charset.forName(strName2);
                        l.d(charsetForName2, "forName(...)");
                        r rVar2 = w.f15765a;
                        l.e(bArr4, "<this>");
                        return new String(bArr4, charsetForName2);
                }
            }
        });
        final int i12 = 1;
        this.f3814l = ub.a.d(new ic.a(this) { // from class: c9.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f3802b;

            {
                this.f3802b = this;
            }

            @Override // ic.a
            public final Object b() {
                int i122 = i12;
                f fVar = this.f3802b;
                switch (i122) {
                    case 0:
                        byte[] bArr3 = fVar.f3806d;
                        String strName = fVar.f3807e;
                        if (strName == null) {
                            strName = ef.a.f6541a.name();
                        }
                        Charset charsetForName = Charset.forName(strName);
                        l.d(charsetForName, "forName(...)");
                        r rVar = w.f15765a;
                        l.e(bArr3, "<this>");
                        String str6 = new String(bArr3, charsetForName);
                        return n.Q0('/', str6, str6);
                    default:
                        byte[] bArr4 = fVar.f3808f;
                        String strName2 = fVar.f3809g;
                        if (strName2 == null) {
                            strName2 = ef.a.f6541a.name();
                        }
                        Charset charsetForName2 = Charset.forName(strName2);
                        l.d(charsetForName2, "forName(...)");
                        r rVar2 = w.f15765a;
                        l.e(bArr4, "<this>");
                        return new String(bArr4, charsetForName2);
                }
            }
        });
    }

    public static f a(f fVar, String str, String str2, int i10) {
        int i11 = fVar.f3803a;
        long j10 = fVar.f3804b;
        String str3 = fVar.f3805c;
        byte[] bArr = fVar.f3806d;
        if ((i10 & 16) != 0) {
            str = fVar.f3807e;
        }
        String str4 = str;
        byte[] bArr2 = fVar.f3808f;
        if ((i10 & 64) != 0) {
            str2 = fVar.f3809g;
        }
        long j11 = fVar.f3810h;
        String str5 = fVar.f3811i;
        String str6 = fVar.f3812j;
        l.e(str3, "sourceId");
        l.e(bArr, "nameBin");
        l.e(bArr2, "lyricBin");
        l.e(str5, "documentUri");
        l.e(str6, "zipInnerPath");
        return new f(i11, j10, str3, bArr, str4, bArr2, str2, j11, str5, str6);
    }

    public final String b() {
        return (String) this.f3813k.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f3803a == fVar.f3803a && this.f3804b == fVar.f3804b && l.a(this.f3805c, fVar.f3805c) && l.a(this.f3806d, fVar.f3806d) && l.a(this.f3807e, fVar.f3807e) && l.a(this.f3808f, fVar.f3808f) && l.a(this.f3809g, fVar.f3809g) && this.f3810h == fVar.f3810h && l.a(this.f3811i, fVar.f3811i) && l.a(this.f3812j, fVar.f3812j);
    }

    public final int hashCode() {
        int i10 = this.f3803a * 31;
        long j10 = this.f3804b;
        int iHashCode = (Arrays.hashCode(this.f3806d) + h0.e((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31, 31, this.f3805c)) * 31;
        String str = this.f3807e;
        int iHashCode2 = (Arrays.hashCode(this.f3808f) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.f3809g;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        long j11 = this.f3810h;
        return this.f3812j.hashCode() + h0.e((((iHashCode2 + iHashCode3) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31, 31, this.f3811i);
    }

    public final String toString() {
        String string = Arrays.toString(this.f3806d);
        String str = this.f3807e;
        String string2 = Arrays.toString(this.f3808f);
        String str2 = this.f3809g;
        StringBuilder sb = new StringBuilder("LyricBean(id=");
        sb.append(this.f3803a);
        sb.append(", rj=");
        sb.append(this.f3804b);
        h0.w(sb, ", sourceId=", this.f3805c, ", nameBin=", string);
        h0.w(sb, ", nameEnc=", str, ", lyricBin=", string2);
        sb.append(", lyricEnc=");
        sb.append(str2);
        sb.append(", duration=");
        sb.append(this.f3810h);
        sb.append(", documentUri=");
        sb.append(this.f3811i);
        sb.append(", zipInnerPath=");
        sb.append(this.f3812j);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ f(long j10, String str, byte[] bArr, String str2, byte[] bArr2, String str3, String str4, String str5, int i10) {
        this(0, j10, str, bArr, str2, bArr2, str3, 0L, str4, (i10 & 512) != 0 ? "" : str5);
    }
}
