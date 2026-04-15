package d7;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public int A;
    public int B;
    public int C;
    public int D;
    public StaticLayout E;
    public StaticLayout F;
    public int G;
    public int H;
    public int I;
    public Rect J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f5507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f5508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f5509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f5510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f5511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextPaint f5512f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f5513g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f5514h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f5515i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Layout.Alignment f5516j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Bitmap f5517k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f5518l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f5519m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f5520n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f5521o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f5522p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f5523q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f5524r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f5525s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f5526t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f5527u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f5528v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f5529w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f5530x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f5531y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f5532z;

    public i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f5511e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f5510d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f5507a = fRound;
        this.f5508b = fRound;
        this.f5509c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f5512f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f5513g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f5514h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public final void a(Canvas canvas, boolean z10) {
        Canvas canvas2;
        if (!z10) {
            this.J.getClass();
            this.f5517k.getClass();
            canvas.drawBitmap(this.f5517k, (Rect) null, this.J, this.f5514h);
            return;
        }
        StaticLayout staticLayout = this.E;
        StaticLayout staticLayout2 = this.F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.G, this.H);
        if (Color.alpha(this.f5527u) > 0) {
            int i10 = this.f5527u;
            Paint paint = this.f5513g;
            paint.setColor(i10);
            canvas2 = canvas;
            canvas2.drawRect(-this.I, 0.0f, staticLayout.getWidth() + this.I, staticLayout.getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        int i11 = this.f5529w;
        TextPaint textPaint = this.f5512f;
        if (i11 == 1) {
            textPaint.setStrokeJoin(Paint.Join.ROUND);
            textPaint.setStrokeWidth(this.f5507a);
            textPaint.setColor(this.f5528v);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas2);
        } else {
            float f10 = this.f5508b;
            if (i11 == 2) {
                float f11 = this.f5509c;
                textPaint.setShadowLayer(f10, f11, f11, this.f5528v);
            } else if (i11 == 3 || i11 == 4) {
                boolean z11 = i11 == 3;
                int i12 = z11 ? -1 : this.f5528v;
                int i13 = z11 ? this.f5528v : -1;
                float f12 = f10 / 2.0f;
                textPaint.setColor(this.f5525s);
                textPaint.setStyle(Paint.Style.FILL);
                float f13 = -f12;
                textPaint.setShadowLayer(f10, f13, f13, i12);
                staticLayout2.draw(canvas2);
                textPaint.setShadowLayer(f10, f12, f12, i13);
            }
        }
        textPaint.setColor(this.f5525s);
        textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas2);
        textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas2.restoreToCount(iSave);
    }
}
