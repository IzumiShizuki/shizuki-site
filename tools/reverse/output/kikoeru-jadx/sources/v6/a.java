package v6;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.tencent.bugly.beta.tinker.TinkerReport;
import j2.h0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import o4.b;
import o6.d;
import o6.k;
import o6.l;
import p4.c;
import p4.c0;
import p4.g;
import p4.s;
import ya.a1;
import ya.g0;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f22734a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f22735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f22738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f22739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f22740g;

    public a(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f22736c = 0;
            this.f22737d = -1;
            this.f22738e = "sans-serif";
            this.f22735b = false;
            this.f22739f = 0.85f;
            this.f22740g = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f22736c = bArr[24];
        this.f22737d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f22738e = "Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
        int i10 = bArr[25] * 20;
        this.f22740g = i10;
        boolean z10 = (bArr[0] & 32) != 0;
        this.f22735b = z10;
        if (z10) {
            this.f22739f = c0.h(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10, 0.0f, 0.95f);
        } else {
            this.f22739f = 0.85f;
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK) << 24)), i12, i13, i14 | 33);
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            boolean z10 = (i10 & 1) != 0;
            boolean z11 = (i10 & 2) != 0;
            if (z10) {
                if (z11) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                }
            } else if (z11) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            }
            boolean z12 = (i10 & 4) != 0;
            if (z12) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            }
            if (z12 || z10 || z11) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
        }
    }

    @Override // o6.l
    public final /* synthetic */ d f(byte[] bArr, int i10, int i11) {
        return h0.a(this, bArr, i11);
    }

    @Override // o6.l
    public final int u() {
        return 2;
    }

    @Override // o6.l
    public final void w(byte[] bArr, int i10, int i11, k kVar, g gVar) {
        String strS;
        int i12;
        s sVar = this.f22734a;
        sVar.E(bArr, i10 + i11);
        sVar.G(i10);
        int i13 = 1;
        int i14 = 2;
        c.c(sVar.a() >= 2);
        int iA = sVar.A();
        if (iA == 0) {
            strS = "";
        } else {
            int i15 = sVar.f16612b;
            Charset charsetC = sVar.C();
            int i16 = iA - (sVar.f16612b - i15);
            if (charsetC == null) {
                charsetC = StandardCharsets.UTF_8;
            }
            strS = sVar.s(i16, charsetC);
        }
        if (strS.isEmpty()) {
            g0 g0Var = i0.f25998b;
            gVar.accept(new o6.a(-9223372036854775807L, -9223372036854775807L, a1.f25946e));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strS);
        b(spannableStringBuilder, this.f22736c, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.f22737d, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.f22738e;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fH = this.f22739f;
        while (sVar.a() >= 8) {
            int i17 = sVar.f16612b;
            int iG = sVar.g();
            int iG2 = sVar.g();
            if (iG2 == 1937013100) {
                c.c(sVar.a() >= i14);
                int iA2 = sVar.A();
                int i18 = 0;
                while (i18 < iA2) {
                    c.c(sVar.a() >= 12);
                    int iA3 = sVar.A();
                    int iA4 = sVar.A();
                    sVar.H(i14);
                    int i19 = i18;
                    int iU = sVar.u();
                    sVar.H(i13);
                    int iG3 = sVar.g();
                    if (iA4 > spannableStringBuilder.length()) {
                        StringBuilder sbO = h0.o(iA4, "Truncating styl end (", ") to cueText.length() (");
                        sbO.append(spannableStringBuilder.length());
                        sbO.append(").");
                        c.B("Tx3gParser", sbO.toString());
                        iA4 = spannableStringBuilder.length();
                    }
                    if (iA3 >= iA4) {
                        c.B("Tx3gParser", "Ignoring styl with start (" + iA3 + ") >= end (" + iA4 + ").");
                        i12 = i19;
                    } else {
                        i12 = i19;
                        int i20 = iA4;
                        b(spannableStringBuilder, iU, this.f22736c, iA3, i20, 0);
                        a(spannableStringBuilder, iG3, this.f22737d, iA3, i20, 0);
                    }
                    i18 = i12 + 1;
                    i13 = 1;
                    i14 = 2;
                }
            } else {
                if (iG2 == 1952608120 && this.f22735b) {
                    c.c(sVar.a() >= 2);
                    fH = c0.h(sVar.A() / this.f22740g, 0.0f, 0.95f);
                }
                sVar.G(i17 + iG);
                i13 = 1;
                i14 = 2;
            }
            sVar.G(i17 + iG);
            i13 = 1;
            i14 = 2;
        }
        gVar.accept(new o6.a(-9223372036854775807L, -9223372036854775807L, i0.u(new b(spannableStringBuilder, null, null, null, fH, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f))));
    }

    @Override // o6.l
    public final /* synthetic */ void reset() {
    }
}
