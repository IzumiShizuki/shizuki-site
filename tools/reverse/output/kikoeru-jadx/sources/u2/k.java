package u2;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f21248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextUtils.TruncateAt f21249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f21250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f21251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ce.g f21252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Layout f21253f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f21254g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f21255h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f21256i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f21257j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f21258k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f21259l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Paint.FontMetricsInt f21260m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f21261n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final w2.h[] f21262o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Rect f21263p = new Rect();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ch.l f21264q;

    /* JADX WARN: Removed duplicated region for block: B:100:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0137 A[PHI: r12
      0x0137: PHI (r12v6 int) = (r12v5 int), (r12v8 int) binds: [B:63:0x0144, B:59:0x0130] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k(java.lang.CharSequence r23, float r24, android.text.TextPaint r25, int r26, android.text.TextUtils.TruncateAt r27, int r28, boolean r29, int r30, int r31, int r32, int r33, int r34, int r35, u2.f r36) {
        /*
            Method dump skipped, instruction units count: 800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.k.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, boolean, int, int, int, int, int, int, u2.f):void");
    }

    public final int a() {
        boolean z10 = this.f21251d;
        Layout layout = this.f21253f;
        return (z10 ? layout.getLineBottom(this.f21254g - 1) : layout.getHeight()) + this.f21255h + this.f21256i + this.f21261n;
    }

    public final float b(int i10) {
        if (i10 == this.f21254g - 1) {
            return this.f21257j + this.f21258k;
        }
        return 0.0f;
    }

    public final ch.l c() {
        ch.l lVar = this.f21264q;
        if (lVar != null) {
            return lVar;
        }
        ch.l lVar2 = new ch.l(this.f21253f);
        this.f21264q = lVar2;
        return lVar2;
    }

    public final float d(int i10) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.f21255h + ((i10 != this.f21254g + (-1) || (fontMetricsInt = this.f21260m) == null) ? this.f21253f.getLineBaseline(i10) : g(i10) - fontMetricsInt.ascent);
    }

    public final float e(int i10) {
        Paint.FontMetricsInt fontMetricsInt;
        int i11 = this.f21254g;
        int i12 = i11 - 1;
        Layout layout = this.f21253f;
        if (i10 != i12 || (fontMetricsInt = this.f21260m) == null) {
            return this.f21255h + layout.getLineBottom(i10) + (i10 == i11 + (-1) ? this.f21256i : 0);
        }
        return layout.getLineBottom(i10 - 1) + fontMetricsInt.bottom;
    }

    public final int f(int i10) {
        j jVar = l.f21265a;
        Layout layout = this.f21253f;
        return (layout.getEllipsisCount(i10) <= 0 || this.f21249b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i10) : layout.getText().length();
    }

    public final float g(int i10) {
        return this.f21253f.getLineTop(i10) + (i10 == 0 ? 0 : this.f21255h);
    }

    public final float h(int i10, boolean z10) {
        return b(this.f21253f.getLineForOffset(i10)) + c().t(true, i10, z10);
    }

    public final float i(int i10, boolean z10) {
        return b(this.f21253f.getLineForOffset(i10)) + c().t(false, i10, z10);
    }

    public final ce.g j() {
        ce.g gVar = this.f21252e;
        if (gVar != null) {
            return gVar;
        }
        Layout layout = this.f21253f;
        ce.g gVar2 = new ce.g(layout.getText(), layout.getText().length(), this.f21248a.getTextLocale());
        this.f21252e = gVar2;
        return gVar2;
    }
}
