package u2;

import android.os.Build;
import android.text.BoringLayout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f21221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextPaint f21222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f21224d = Float.NaN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f21225e = Float.NaN;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public BoringLayout.Metrics f21226f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f21227g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f21228h;

    public f(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f21221a = charSequence;
        this.f21222b = textPaint;
        this.f21223c = i10;
    }

    public final BoringLayout.Metrics a() {
        if (!this.f21227g) {
            TextDirectionHeuristic textDirectionHeuristicA = l.a(this.f21223c);
            int i10 = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.f21221a;
            TextPaint textPaint = this.f21222b;
            this.f21226f = i10 >= 33 ? BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristicA, true, null) : !textDirectionHeuristicA.isRtl(charSequence, 0, charSequence.length()) ? BoringLayout.isBoring(charSequence, textPaint, null) : null;
            this.f21227g = true;
        }
        return this.f21226f;
    }

    public final CharSequence b() {
        CharacterStyle[] characterStyleArr;
        CharSequence charSequence = this.f21228h;
        if (charSequence == null) {
            charSequence = this.f21221a;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (nd.h.o(spanned, CharacterStyle.class) && (characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence.length(), CharacterStyle.class)) != null && characterStyleArr.length != 0) {
                    jc.b bVarA = jc.k.a(characterStyleArr);
                    SpannableString spannableString = null;
                    while (bVarA.hasNext()) {
                        CharacterStyle characterStyle = (CharacterStyle) bVarA.next();
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            if (spannableString == null) {
                                spannableString = new SpannableString(charSequence);
                            }
                            spannableString.removeSpan(characterStyle);
                        }
                    }
                    if (spannableString != null) {
                        charSequence = spannableString;
                    }
                }
            }
            this.f21228h = charSequence;
        }
        return charSequence;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float c() {
        /*
            r5 = this;
            float r0 = r5.f21224d
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lb
            float r0 = r5.f21224d
            return r0
        Lb:
            android.text.BoringLayout$Metrics r0 = r5.a()
            if (r0 == 0) goto L14
            int r0 = r0.width
            goto L15
        L14:
            r0 = -1
        L15:
            float r0 = (float) r0
            android.text.TextPaint r1 = r5.f21222b
            r2 = 0
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 >= 0) goto L34
            java.lang.CharSequence r0 = r5.b()
            int r0 = r0.length()
            java.lang.CharSequence r3 = r5.b()
            r4 = 0
            float r0 = android.text.Layout.getDesiredWidth(r3, r4, r0, r1)
            double r3 = (double) r0
            double r3 = java.lang.Math.ceil(r3)
            float r0 = (float) r3
        L34:
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L39
            goto L5d
        L39:
            java.lang.CharSequence r3 = r5.f21221a
            boolean r4 = r3 instanceof android.text.Spanned
            if (r4 == 0) goto L51
            android.text.Spanned r3 = (android.text.Spanned) r3
            java.lang.Class<w2.f> r4 = w2.f.class
            boolean r4 = nd.h.o(r3, r4)
            if (r4 != 0) goto L5a
            java.lang.Class<w2.e> r4 = w2.e.class
            boolean r3 = nd.h.o(r3, r4)
            if (r3 != 0) goto L5a
        L51:
            float r1 = r1.getLetterSpacing()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L5a
            goto L5d
        L5a:
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
        L5d:
            r5.f21224d = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.f.c():float");
    }
}
