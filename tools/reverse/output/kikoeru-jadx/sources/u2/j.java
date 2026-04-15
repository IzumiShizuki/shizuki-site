package u2;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j extends Canvas {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f21247a;

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            return canvas.clipOutPath(path);
        }
        jc.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rectF) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            return canvas.clipOutRect(rectF);
        }
        jc.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            return canvas.clipPath(path, op);
        }
        jc.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF, Region.Op op) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            return canvas.clipRect(rectF, op);
        }
        jc.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.concat(matrix);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.disableZ();
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i10, int i11, int i12, int i13) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawARGB(i10, i11, i12, i13);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f10, float f11, boolean z10, Paint paint) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawArc(rectF, f10, f11, z10, paint);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f10, float f11, Paint paint) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, f10, f11, paint);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i10, int i11, float[] fArr, int i12, int[] iArr, int i13, Paint paint) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawBitmapMesh(bitmap, i10, i11, fArr, i12, iArr, i13, paint);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f10, float f11, float f12, Paint paint) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawCircle(f10, f11, f12, paint);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i10) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawColor(i10);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f10, float f11, RectF rectF2, float f12, float f13, Paint paint) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawDoubleRoundRect(rectF, f10, f11, rectF2, f12, f13, paint);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i10, float[] fArr, int i11, int i12, Font font, Paint paint) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawGlyphs(iArr, i10, fArr, i11, i12, font, paint);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f10, float f11, float f12, float f13, Paint paint) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawLine(f10, f11, f12, f13, paint);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i10, int i11, Paint paint) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawLines(fArr, i10, i11, paint);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF rectF, Paint paint) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawOval(rectF, paint);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawPaint(paint);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawPatch(ninePatch, rect, paint);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawPath(path, paint);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawPicture(picture);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f10, float f11, Paint paint) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawPoint(f10, f11, paint);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i10, int i11, Paint paint) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawPoints(fArr, i10, i11, paint);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] cArr, int i10, int i11, float[] fArr, Paint paint) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawPosText(cArr, i10, i11, fArr, paint);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i10, int i11, int i12) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawRGB(i10, i11, i12);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawRect(rectF, paint);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawRenderNode(renderNode);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF, float f10, float f11, Paint paint) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawRoundRect(rectF, f10, f11, paint);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i10, int i11, float f10, float f11, Paint paint) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawText(cArr, i10, i11, f10, f11, paint);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i10, int i11, Path path, float f10, float f11, Paint paint) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawTextOnPath(cArr, i10, i11, path, f10, f11, paint);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, Paint paint) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawTextRun(cArr, i10, i11, i12, i13, f10, f11, z10, paint);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i10, float[] fArr, int i11, float[] fArr2, int i12, int[] iArr, int i13, short[] sArr, int i14, int i15, Paint paint) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawVertices(vertexMode, i10, fArr, i11, fArr2, i12, iArr, i13, sArr, i14, i15, paint);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.enableZ();
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect rect) {
        Canvas canvas = this.f21247a;
        if (canvas == null) {
            jc.l.k("nativeCanvas");
            throw null;
        }
        boolean clipBounds = canvas.getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            return canvas.getDensity();
        }
        jc.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            return canvas.getDrawFilter();
        }
        jc.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            return canvas.getHeight();
        }
        jc.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(Matrix matrix) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.getMatrix(matrix);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            return canvas.getMaximumBitmapHeight();
        }
        jc.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            return canvas.getMaximumBitmapWidth();
        }
        jc.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            return canvas.getSaveCount();
        }
        jc.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            return canvas.getWidth();
        }
        jc.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            return canvas.isOpaque();
        }
        jc.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            return canvas.quickReject(rectF, edgeType);
        }
        jc.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.restore();
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i10) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.restoreToCount(i10);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f10) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.rotate(f10);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int save() {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            return canvas.save();
        }
        jc.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint, int i10) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint, i10);
        }
        jc.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i10, int i11) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i10, i11);
        }
        jc.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void scale(float f10, float f11) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.scale(f10, f11);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.setBitmap(bitmap);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i10) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.setDensity(i10);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.setDrawFilter(drawFilter);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.setMatrix(matrix);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void skew(float f10, float f11) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.skew(f10, f11);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void translate(float f10, float f11) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.translate(f10, f11);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            return canvas.clipPath(path);
        }
        jc.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect, Region.Op op) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            return canvas.clipRect(rect, op);
        }
        jc.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, Paint paint) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawArc(f10, f11, f12, f13, f14, f15, z10, paint);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rectF, paint);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j10) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawColor(j10);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, Paint paint) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawLines(fArr, paint);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f10, float f11, float f12, float f13, Paint paint) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawOval(f10, f11, f12, f13, paint);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF rectF) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawPicture(picture, rectF);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, Paint paint) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawPoints(fArr, paint);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawPosText(str, fArr, paint);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect rect, Paint paint) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawRect(rect, paint);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f10, float f11, float f12, float f13, float f14, float f15, Paint paint) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawRoundRect(f10, f11, f12, f13, f14, f15, paint);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, float f10, float f11, Paint paint) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawText(str, f10, f11, paint);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String str, Path path, float f10, float f11, Paint paint) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawTextOnPath(str, path, f10, f11, paint);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            return canvas.quickReject(rectF);
        }
        jc.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint);
        }
        jc.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i10) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i10);
        }
        jc.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            return canvas.clipRect(rectF);
        }
        jc.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rect2, paint);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect rect) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawPicture(picture, rect);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f10, float f11, float f12, float f13, Paint paint) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawRect(f10, f11, f12, f13, paint);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, int i10, int i11, float f10, float f11, Paint paint) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawText(str, i10, i11, f10, f11, paint);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f10, float f11, float f12, float f13, Paint paint, int i10) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            return canvas.saveLayer(f10, f11, f12, f13, paint, i10);
        }
        jc.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f10, float f11, float f12, float f13, int i10, int i11) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f10, f11, f12, f13, i10, i11);
        }
        jc.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            return canvas.clipOutRect(rect);
        }
        jc.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            return canvas.clipRect(rect);
        }
        jc.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i10, int i11, float f10, float f11, int i12, int i13, boolean z10, Paint paint) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i10, i11, f10, f11, i12, i13, z10, paint);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawPatch(ninePatch, rectF, paint);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i10, int i11, float f10, float f11, Paint paint) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawText(charSequence, i10, i11, f10, f11, paint);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, Paint paint) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawTextRun(charSequence, i10, i11, i12, i13, f10, f11, z10, paint);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f10, float f11, float f12, float f13, Paint paint) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            return canvas.saveLayer(f10, f11, f12, f13, paint);
        }
        jc.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f10, float f11, float f12, float f13, int i10) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f10, f11, f12, f13, i10);
        }
        jc.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f10, float f11, float f12, float f13, Region.Op op) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            return canvas.clipRect(f10, f11, f12, f13, op);
        }
        jc.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, Paint paint) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i10, i11, i12, i13, i14, i15, z10, paint);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i10, PorterDuff.Mode mode) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawColor(i10, mode);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            return canvas.quickReject(path, edgeType);
        }
        jc.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f10, float f11, float f12, float f13) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            return canvas.clipRect(f10, f11, f12, f13);
        }
        jc.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, matrix, paint);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i10, BlendMode blendMode) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawColor(i10, blendMode);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            return canvas.quickReject(path);
        }
        jc.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f10, float f11, float f12, float f13) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            return canvas.clipOutRect(f10, f11, f12, f13);
        }
        jc.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i10, int i11, int i12, int i13) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            return canvas.clipRect(i10, i11, i12, i13);
        }
        jc.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, Paint paint) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawTextRun(measuredText, i10, i11, i12, i13, f10, f11, z10, paint);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j10, BlendMode blendMode) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            canvas.drawColor(j10, blendMode);
        } else {
            jc.l.k("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f10, float f11, float f12, float f13, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            return canvas.quickReject(f10, f11, f12, f13, edgeType);
        }
        jc.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i10, int i11, int i12, int i13) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            return canvas.clipOutRect(i10, i11, i12, i13);
        }
        jc.l.k("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f10, float f11, float f12, float f13) {
        Canvas canvas = this.f21247a;
        if (canvas != null) {
            return canvas.quickReject(f10, f11, f12, f13);
        }
        jc.l.k("nativeCanvas");
        throw null;
    }
}
