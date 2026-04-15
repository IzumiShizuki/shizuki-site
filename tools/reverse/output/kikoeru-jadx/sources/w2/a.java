package w2;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends MetricAffectingSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f23308b;

    public /* synthetic */ a(float f10, int i10) {
        this.f23307a = i10;
        this.f23308b = f10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f23307a) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f23308b);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f23308b);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f23307a) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f23308b);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f23308b);
                break;
        }
    }
}
