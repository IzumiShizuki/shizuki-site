package w2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i extends ReplacementSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Paint.FontMetricsInt f23327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f23330d;

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f23327a;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        l.k("fontMetrics");
        throw null;
    }

    public final int b() {
        if (!this.f23330d) {
            z2.a.b("PlaceholderSpan is not laid out yet.");
        }
        return this.f23329c;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        this.f23330d = true;
        paint.getTextSize();
        this.f23327a = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            z2.a.a("Invalid fontMetrics: line height can not be negative.");
        }
        this.f23328b = (int) Math.ceil(0.0f);
        this.f23329c = (int) Math.ceil(0.0f);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            if (fontMetricsInt.ascent > (-b())) {
                fontMetricsInt.ascent = -b();
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        if (!this.f23330d) {
            z2.a.b("PlaceholderSpan is not laid out yet.");
        }
        return this.f23328b;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
    }
}
