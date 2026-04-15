package f8;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import n7.b0;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends h implements Animatable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f6858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f6859d = new b(0, this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f6857b = new c();

    public e(Context context) {
        this.f6858c = context;
    }

    @Override // f8.h, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f6862a;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f6862a;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f6862a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        c cVar = this.f6857b;
        cVar.f6852a.draw(canvas);
        if (cVar.f6853b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f6862a;
        return drawable != null ? drawable.getAlpha() : this.f6857b.f6852a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f6862a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f6857b.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f6862a;
        return drawable != null ? drawable.getColorFilter() : this.f6857b.f6852a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f6862a == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new d(this.f6862a.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f6862a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f6857b.f6852a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f6862a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f6857b.f6852a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f6862a;
        return drawable != null ? drawable.getOpacity() : this.f6857b.f6852a.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0182, code lost:
    
        if (r8.f6853b != null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0184, code lost:
    
        r8.f6853b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x018b, code lost:
    
        r8.f6853b.playTogether(r8.f6854c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0192, code lost:
    
        return;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void inflate(android.content.res.Resources r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f8.e.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f6862a;
        return drawable != null ? drawable.isAutoMirrored() : this.f6857b.f6852a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f6862a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f6857b.f6853b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f6862a;
        return drawable != null ? drawable.isStateful() : this.f6857b.f6852a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f6862a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f6862a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f6857b.f6852a.setBounds(rect);
        }
    }

    @Override // f8.h, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.f6862a;
        return drawable != null ? drawable.setLevel(i10) : this.f6857b.f6852a.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f6862a;
        return drawable != null ? drawable.setState(iArr) : this.f6857b.f6852a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Drawable drawable = this.f6862a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f6857b.f6852a.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f6862a;
        if (drawable != null) {
            drawable.setAutoMirrored(z10);
        } else {
            this.f6857b.f6852a.setAutoMirrored(z10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f6862a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f6857b.f6852a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        Drawable drawable = this.f6862a;
        if (drawable != null) {
            b0.z(drawable, i10);
        } else {
            this.f6857b.f6852a.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f6862a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f6857b.f6852a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f6862a;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f6857b.f6852a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f6862a;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f6857b.f6852a.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f6862a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        c cVar = this.f6857b;
        if (cVar.f6853b.isStarted()) {
            return;
        }
        cVar.f6853b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f6862a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f6857b.f6853b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws Throwable {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
