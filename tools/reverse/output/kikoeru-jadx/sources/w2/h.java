package w2;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h implements LineHeightSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f23315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f23317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f23318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f23319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f23320f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23321g = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f23322h = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23323i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f23324j = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f23325k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f23326l;

    public h(float f10, int i10, boolean z10, boolean z11, float f11, boolean z12) {
        this.f23315a = f10;
        this.f23316b = i10;
        this.f23317c = z10;
        this.f23318d = z11;
        this.f23319e = f11;
        this.f23320f = z12;
        if ((0.0f > f11 || f11 > 1.0f) && f11 != -1.0f) {
            z2.a.b("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        int i14 = fontMetricsInt.descent;
        int i15 = fontMetricsInt.ascent;
        if (i14 - i15 <= 0) {
            return;
        }
        boolean z10 = i10 == 0;
        boolean z11 = i11 == this.f23316b;
        boolean z12 = this.f23318d;
        boolean z13 = this.f23317c;
        if (z10 && z11 && z13 && z12) {
            return;
        }
        if (this.f23321g == Integer.MIN_VALUE) {
            int i16 = i14 - i15;
            int iCeil = (int) Math.ceil(this.f23315a);
            int i17 = iCeil - i16;
            if (!this.f23320f || i17 > 0) {
                float fAbs = this.f23319e;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int iCeil2 = (int) (i17 <= 0 ? Math.ceil(i17 * fAbs) : Math.ceil((1.0f - fAbs) * i17));
                int i18 = fontMetricsInt.descent;
                int i19 = iCeil2 + i18;
                this.f23323i = i19;
                int i20 = i19 - iCeil;
                this.f23322h = i20;
                if (z13) {
                    i20 = fontMetricsInt.ascent;
                }
                this.f23321g = i20;
                if (z12) {
                    i19 = i18;
                }
                this.f23324j = i19;
                this.f23325k = fontMetricsInt.ascent - i20;
                this.f23326l = i19 - i18;
            } else {
                int i21 = fontMetricsInt.ascent;
                this.f23322h = i21;
                int i22 = fontMetricsInt.descent;
                this.f23323i = i22;
                this.f23321g = i21;
                this.f23324j = i22;
                this.f23325k = 0;
                this.f23326l = 0;
            }
        }
        fontMetricsInt.ascent = z10 ? this.f23321g : this.f23322h;
        fontMetricsInt.descent = z11 ? this.f23324j : this.f23323i;
    }
}
