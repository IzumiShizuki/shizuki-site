package w2;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends MetricAffectingSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f23310b;

    public /* synthetic */ b(int i10, Object obj) {
        this.f23309a = i10;
        this.f23310b = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f23309a) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f23310b);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f23310b);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f23309a) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f23310b);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f23310b);
                break;
        }
    }
}
