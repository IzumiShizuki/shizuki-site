package f8;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayDeque;
import n7.b0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q extends h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final PorterDuff.Mode f6917j = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o f6918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuffColorFilter f6919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ColorFilter f6920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6922f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f6923g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Matrix f6924h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Rect f6925i;

    public q() {
        this.f6922f = true;
        this.f6923g = new float[9];
        this.f6924h = new Matrix();
        this.f6925i = new Rect();
        o oVar = new o();
        oVar.f6906c = null;
        oVar.f6907d = f6917j;
        oVar.f6905b = new n();
        this.f6918b = oVar;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f6862a;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f6862a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f6925i;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f6920d;
        if (colorFilter == null) {
            colorFilter = this.f6919c;
        }
        Matrix matrix = this.f6924h;
        canvas.getMatrix(matrix);
        float[] fArr = this.f6923g;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, (int) (rect.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && b0.n(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        o oVar = this.f6918b;
        Bitmap bitmap = oVar.f6909f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != oVar.f6909f.getHeight()) {
            oVar.f6909f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            oVar.f6914k = true;
        }
        if (this.f6922f) {
            o oVar2 = this.f6918b;
            if (oVar2.f6914k || oVar2.f6910g != oVar2.f6906c || oVar2.f6911h != oVar2.f6907d || oVar2.f6913j != oVar2.f6908e || oVar2.f6912i != oVar2.f6905b.getRootAlpha()) {
                o oVar3 = this.f6918b;
                oVar3.f6909f.eraseColor(0);
                Canvas canvas2 = new Canvas(oVar3.f6909f);
                n nVar = oVar3.f6905b;
                nVar.a(nVar.f6895g, n.f6888p, canvas2, iMin, iMin2);
                o oVar4 = this.f6918b;
                oVar4.f6910g = oVar4.f6906c;
                oVar4.f6911h = oVar4.f6907d;
                oVar4.f6912i = oVar4.f6905b.getRootAlpha();
                oVar4.f6913j = oVar4.f6908e;
                oVar4.f6914k = false;
            }
        } else {
            o oVar5 = this.f6918b;
            oVar5.f6909f.eraseColor(0);
            Canvas canvas3 = new Canvas(oVar5.f6909f);
            n nVar2 = oVar5.f6905b;
            nVar2.a(nVar2.f6895g, n.f6888p, canvas3, iMin, iMin2);
        }
        o oVar6 = this.f6918b;
        if (oVar6.f6905b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (oVar6.f6915l == null) {
                Paint paint2 = new Paint();
                oVar6.f6915l = paint2;
                paint2.setFilterBitmap(true);
            }
            oVar6.f6915l.setAlpha(oVar6.f6905b.getRootAlpha());
            oVar6.f6915l.setColorFilter(colorFilter);
            paint = oVar6.f6915l;
        }
        canvas.drawBitmap(oVar6.f6909f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f6862a;
        return drawable != null ? drawable.getAlpha() : this.f6918b.f6905b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f6862a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f6918b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f6862a;
        return drawable != null ? drawable.getColorFilter() : this.f6920d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f6862a != null && Build.VERSION.SDK_INT >= 24) {
            return new p(this.f6862a.getConstantState());
        }
        this.f6918b.f6904a = getChangingConfigurations();
        return this.f6918b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f6862a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f6918b.f6905b.f6897i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f6862a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f6918b.f6905b.f6896h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f6862a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f6862a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f6862a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f6862a;
        return drawable != null ? drawable.isAutoMirrored() : this.f6918b.f6908e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f6862a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        o oVar = this.f6918b;
        if (oVar == null) {
            return false;
        }
        n nVar = oVar.f6905b;
        if (nVar.f6902n == null) {
            nVar.f6902n = Boolean.valueOf(nVar.f6895g.a());
        }
        if (nVar.f6902n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f6918b.f6906c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f6862a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f6921e && super.mutate() == this) {
            o oVar = this.f6918b;
            o oVar2 = new o();
            oVar2.f6906c = null;
            oVar2.f6907d = f6917j;
            if (oVar != null) {
                oVar2.f6904a = oVar.f6904a;
                n nVar = new n(oVar.f6905b);
                oVar2.f6905b = nVar;
                if (oVar.f6905b.f6893e != null) {
                    nVar.f6893e = new Paint(oVar.f6905b.f6893e);
                }
                if (oVar.f6905b.f6892d != null) {
                    oVar2.f6905b.f6892d = new Paint(oVar.f6905b.f6892d);
                }
                oVar2.f6906c = oVar.f6906c;
                oVar2.f6907d = oVar.f6907d;
                oVar2.f6908e = oVar.f6908e;
            }
            this.f6918b = oVar2;
            this.f6921e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f6862a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.f6862a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        o oVar = this.f6918b;
        ColorStateList colorStateList = oVar.f6906c;
        if (colorStateList == null || (mode = oVar.f6907d) == null) {
            z10 = false;
        } else {
            this.f6919c = a(colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        n nVar = oVar.f6905b;
        if (nVar.f6902n == null) {
            nVar.f6902n = Boolean.valueOf(nVar.f6895g.a());
        }
        if (nVar.f6902n.booleanValue()) {
            boolean zB = oVar.f6905b.f6895g.b(iArr);
            oVar.f6914k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f6862a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Drawable drawable = this.f6862a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f6918b.f6905b.getRootAlpha() != i10) {
            this.f6918b.f6905b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f6862a;
        if (drawable != null) {
            drawable.setAutoMirrored(z10);
        } else {
            this.f6918b.f6908e = z10;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f6862a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f6920d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        Drawable drawable = this.f6862a;
        if (drawable != null) {
            b0.z(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f6862a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        o oVar = this.f6918b;
        if (oVar.f6906c != colorStateList) {
            oVar.f6906c = colorStateList;
            this.f6919c = a(colorStateList, oVar.f6907d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f6862a;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        o oVar = this.f6918b;
        if (oVar.f6907d != mode) {
            oVar.f6907d = mode;
            this.f6919c = a(oVar.f6906c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f6862a;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f6862a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i10;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f6862a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        o oVar = this.f6918b;
        oVar.f6905b = new n();
        TypedArray typedArrayG = o3.b.g(resources, theme, attributeSet, a.f6839a);
        o oVar2 = this.f6918b;
        n nVar = oVar2.f6905b;
        int i11 = !o3.b.d(xmlPullParser, "tintMode") ? -1 : typedArrayG.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i11 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i11 != 5) {
            if (i11 != 9) {
                switch (i11) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        oVar2.f6907d = mode;
        ColorStateList colorStateListA = o3.b.a(typedArrayG, xmlPullParser, theme);
        if (colorStateListA != null) {
            oVar2.f6906c = colorStateListA;
        }
        boolean z10 = oVar2.f6908e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z10 = typedArrayG.getBoolean(5, z10);
        }
        oVar2.f6908e = z10;
        float f10 = nVar.f6898j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f10 = typedArrayG.getFloat(7, f10);
        }
        nVar.f6898j = f10;
        float f11 = nVar.f6899k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f11 = typedArrayG.getFloat(8, f11);
        }
        nVar.f6899k = f11;
        if (nVar.f6898j <= 0.0f) {
            throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f11 > 0.0f) {
            nVar.f6896h = typedArrayG.getDimension(3, nVar.f6896h);
            int i12 = 2;
            float dimension = typedArrayG.getDimension(2, nVar.f6897i);
            nVar.f6897i = dimension;
            if (nVar.f6896h <= 0.0f) {
                throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = nVar.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = typedArrayG.getFloat(4, alpha);
                }
                nVar.setAlpha(alpha);
                String string = typedArrayG.getString(0);
                if (string != null) {
                    nVar.f6901m = string;
                    nVar.f6903o.put(string, nVar);
                }
                typedArrayG.recycle();
                oVar.f6904a = getChangingConfigurations();
                int i13 = 1;
                oVar.f6914k = true;
                o oVar3 = this.f6918b;
                n nVar2 = oVar3.f6905b;
                ArrayDeque arrayDeque = new ArrayDeque();
                k kVar = nVar2.f6895g;
                o.e eVar = nVar2.f6903o;
                arrayDeque.push(kVar);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z11 = true;
                for (int i14 = 3; eventType != i13 && (xmlPullParser.getDepth() >= depth || eventType != i14); i14 = 3) {
                    if (eventType == i12) {
                        String name = xmlPullParser.getName();
                        k kVar2 = (k) arrayDeque.peek();
                        i10 = depth;
                        if ("path".equals(name)) {
                            j jVar = new j();
                            jVar.f6864e = 0.0f;
                            jVar.f6866g = 1.0f;
                            jVar.f6867h = 1.0f;
                            jVar.f6868i = 0.0f;
                            jVar.f6869j = 1.0f;
                            jVar.f6870k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            jVar.f6871l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            jVar.f6872m = join2;
                            jVar.f6873n = 4.0f;
                            TypedArray typedArrayG2 = o3.b.g(resources, theme, attributeSet, a.f6841c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = typedArrayG2.getString(0);
                                if (string2 != null) {
                                    jVar.f6886b = string2;
                                }
                                String string3 = typedArrayG2.getString(2);
                                if (string3 != null) {
                                    jVar.f6885a = n7.d.j(string3);
                                }
                                jVar.f6865f = o3.b.b(typedArrayG2, xmlPullParser, theme, "fillColor", 1);
                                float f12 = jVar.f6867h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f12 = typedArrayG2.getFloat(12, f12);
                                }
                                jVar.f6867h = f12;
                                int i15 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayG2.getInt(8, -1) : -1;
                                Paint.Cap cap3 = jVar.f6871l;
                                if (i15 == 0) {
                                    cap = cap2;
                                } else if (i15 != 1) {
                                    cap = i15 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                jVar.f6871l = cap;
                                int i16 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayG2.getInt(9, -1) : -1;
                                Paint.Join join3 = jVar.f6872m;
                                if (i16 == 0) {
                                    join = join2;
                                } else if (i16 != 1) {
                                    join = i16 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                jVar.f6872m = join;
                                float f13 = jVar.f6873n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f13 = typedArrayG2.getFloat(10, f13);
                                }
                                jVar.f6873n = f13;
                                jVar.f6863d = o3.b.b(typedArrayG2, xmlPullParser, theme, "strokeColor", 3);
                                float f14 = jVar.f6866g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f14 = typedArrayG2.getFloat(11, f14);
                                }
                                jVar.f6866g = f14;
                                float f15 = jVar.f6864e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f15 = typedArrayG2.getFloat(4, f15);
                                }
                                jVar.f6864e = f15;
                                float f16 = jVar.f6869j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f16 = typedArrayG2.getFloat(6, f16);
                                }
                                jVar.f6869j = f16;
                                float f17 = jVar.f6870k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f17 = typedArrayG2.getFloat(7, f17);
                                }
                                jVar.f6870k = f17;
                                float f18 = jVar.f6868i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f18 = typedArrayG2.getFloat(5, f18);
                                }
                                jVar.f6868i = f18;
                                int i17 = jVar.f6887c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i17 = typedArrayG2.getInt(13, i17);
                                }
                                jVar.f6887c = i17;
                            }
                            typedArrayG2.recycle();
                            kVar2.f6875b.add(jVar);
                            if (jVar.getPathName() != null) {
                                eVar.put(jVar.getPathName(), jVar);
                            }
                            oVar3.f6904a = oVar3.f6904a;
                            z11 = false;
                        } else if ("clip-path".equals(name)) {
                            i iVar = new i();
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                TypedArray typedArrayG3 = o3.b.g(resources, theme, attributeSet, a.f6842d);
                                String string4 = typedArrayG3.getString(0);
                                if (string4 != null) {
                                    iVar.f6886b = string4;
                                }
                                String string5 = typedArrayG3.getString(1);
                                if (string5 != null) {
                                    iVar.f6885a = n7.d.j(string5);
                                }
                                iVar.f6887c = !o3.b.d(xmlPullParser, "fillType") ? 0 : typedArrayG3.getInt(2, 0);
                                typedArrayG3.recycle();
                            }
                            kVar2.f6875b.add(iVar);
                            if (iVar.getPathName() != null) {
                                eVar.put(iVar.getPathName(), iVar);
                            }
                            oVar3.f6904a = oVar3.f6904a;
                        } else if ("group".equals(name)) {
                            k kVar3 = new k();
                            TypedArray typedArrayG4 = o3.b.g(resources, theme, attributeSet, a.f6840b);
                            float f19 = kVar3.f6876c;
                            if (o3.b.d(xmlPullParser, "rotation")) {
                                f19 = typedArrayG4.getFloat(5, f19);
                            }
                            kVar3.f6876c = f19;
                            kVar3.f6877d = typedArrayG4.getFloat(1, kVar3.f6877d);
                            kVar3.f6878e = typedArrayG4.getFloat(2, kVar3.f6878e);
                            float f20 = kVar3.f6879f;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                f20 = typedArrayG4.getFloat(3, f20);
                            }
                            kVar3.f6879f = f20;
                            float f21 = kVar3.f6880g;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                f21 = typedArrayG4.getFloat(4, f21);
                            }
                            kVar3.f6880g = f21;
                            float f22 = kVar3.f6881h;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                f22 = typedArrayG4.getFloat(6, f22);
                            }
                            kVar3.f6881h = f22;
                            float f23 = kVar3.f6882i;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                f23 = typedArrayG4.getFloat(7, f23);
                            }
                            kVar3.f6882i = f23;
                            String string6 = typedArrayG4.getString(0);
                            if (string6 != null) {
                                kVar3.f6884k = string6;
                            }
                            kVar3.c();
                            typedArrayG4.recycle();
                            kVar2.f6875b.add(kVar3);
                            arrayDeque.push(kVar3);
                            if (kVar3.getGroupName() != null) {
                                eVar.put(kVar3.getGroupName(), kVar3);
                            }
                            oVar3.f6904a = oVar3.f6904a;
                        }
                    } else {
                        i10 = depth;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    depth = i10;
                    i13 = 1;
                    i12 = 2;
                }
                if (!z11) {
                    this.f6919c = a(oVar.f6906c, oVar.f6907d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public q(o oVar) {
        this.f6922f = true;
        this.f6923g = new float[9];
        this.f6924h = new Matrix();
        this.f6925i = new Rect();
        this.f6918b = oVar;
        this.f6919c = a(oVar.f6906c, oVar.f6907d);
    }
}
