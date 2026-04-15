package l8;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.ArrayList;
import lc.b;
import q.t0;
import t8.g;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f11874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f11877d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f11879f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f11880g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11881h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11882i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f11883j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Drawable f11884k;

    public a(Drawable drawable, g gVar, int i10, boolean z10) {
        this.f11874a = gVar;
        this.f11875b = i10;
        this.f11876c = z10;
        this.f11878e = a(null, drawable != null ? Integer.valueOf(drawable.getIntrinsicWidth()) : null);
        this.f11879f = a(null, drawable != null ? Integer.valueOf(drawable.getIntrinsicHeight()) : null);
        this.f11881h = TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK;
        this.f11883j = null;
        Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
        this.f11884k = drawableMutate;
        if (i10 <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
        Drawable drawable2 = this.f11883j;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
        if (drawableMutate != null) {
            drawableMutate.setCallback(this);
        }
    }

    public final int a(Integer num, Integer num2) {
        if ((num != null && num.intValue() == -1) || (num2 != null && num2.intValue() == -1)) {
            return -1;
        }
        return Math.max(num != null ? num.intValue() : -1, num2 != null ? num2.intValue() : -1);
    }

    public final void b(Drawable drawable, Rect rect) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            return;
        }
        int iWidth = rect.width();
        int iHeight = rect.height();
        double dO = gh.g.o(intrinsicWidth, intrinsicHeight, iWidth, iHeight, this.f11874a);
        double d10 = 2;
        int iQ = b.Q((((double) iWidth) - (((double) intrinsicWidth) * dO)) / d10);
        int iQ2 = b.Q((((double) iHeight) - (dO * ((double) intrinsicHeight))) / d10);
        drawable.setBounds(rect.left + iQ, rect.top + iQ2, rect.right - iQ, rect.bottom - iQ2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iSave;
        Drawable drawable;
        int i10 = this.f11882i;
        if (i10 == 0) {
            Drawable drawable2 = this.f11883j;
            if (drawable2 != null) {
                drawable2.setAlpha(this.f11881h);
                iSave = canvas.save();
                try {
                    drawable2.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        Drawable drawable3 = this.f11884k;
        if (i10 == 2) {
            if (drawable3 != null) {
                drawable3.setAlpha(this.f11881h);
                iSave = canvas.save();
                try {
                    drawable3.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        double dUptimeMillis = (SystemClock.uptimeMillis() - this.f11880g) / ((double) this.f11875b);
        double dI = nh.b.i(dUptimeMillis, 0.0d, 1.0d);
        int i11 = this.f11881h;
        int i12 = (int) (dI * ((double) i11));
        if (this.f11876c) {
            i11 -= i12;
        }
        boolean z10 = dUptimeMillis >= 1.0d;
        if (!z10 && (drawable = this.f11883j) != null) {
            drawable.setAlpha(i11);
            iSave = canvas.save();
            try {
                drawable.draw(canvas);
            } finally {
            }
        }
        if (drawable3 != null) {
            drawable3.setAlpha(i12);
            iSave = canvas.save();
            try {
                drawable3.draw(canvas);
            } finally {
            }
        }
        if (!z10) {
            invalidateSelf();
            return;
        }
        this.f11882i = 2;
        this.f11883j = null;
        ArrayList arrayList = this.f11877d;
        if (arrayList.size() > 0) {
            throw t0.A(0, arrayList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f11881h;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        int i10 = this.f11882i;
        if (i10 == 0) {
            Drawable drawable = this.f11883j;
            if (drawable != null) {
                return drawable.getColorFilter();
            }
            return null;
        }
        Drawable drawable2 = this.f11884k;
        if (i10 != 1) {
            if (i10 == 2 && drawable2 != null) {
                return drawable2.getColorFilter();
            }
            return null;
        }
        if (drawable2 != null && (colorFilter = drawable2.getColorFilter()) != null) {
            return colorFilter;
        }
        Drawable drawable3 = this.f11883j;
        if (drawable3 != null) {
            return drawable3.getColorFilter();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f11879f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f11878e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f11883j;
        int i10 = this.f11882i;
        if (i10 == 0) {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            return -2;
        }
        Drawable drawable2 = this.f11884k;
        if (i10 == 2) {
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        }
        if (drawable != null && drawable2 != null) {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        }
        if (drawable != null) {
            return drawable.getOpacity();
        }
        if (drawable2 != null) {
            return drawable2.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f11882i == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f11883j;
        if (drawable != null) {
            b(drawable, rect);
        }
        Drawable drawable2 = this.f11884k;
        if (drawable2 != null) {
            b(drawable2, rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.f11883j;
        boolean level = drawable != null ? drawable.setLevel(i10) : false;
        Drawable drawable2 = this.f11884k;
        return level || (drawable2 != null ? drawable2.setLevel(i10) : false);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f11883j;
        boolean state = drawable != null ? drawable.setState(iArr) : false;
        Drawable drawable2 = this.f11884k;
        return state || (drawable2 != null ? drawable2.setState(iArr) : false);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (i10 < 0 || i10 >= 256) {
            throw new IllegalArgumentException(t0.B(i10, "Invalid alpha: ").toString());
        }
        this.f11881h = i10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f11883j;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.f11884k;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        Drawable drawable = this.f11883j;
        if (drawable != null) {
            drawable.setTint(i10);
        }
        Drawable drawable2 = this.f11884k;
        if (drawable2 != null) {
            drawable2.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintBlendMode(BlendMode blendMode) {
        Drawable drawable = this.f11883j;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.f11884k;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f11883j;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.f11884k;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f11883j;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.f11884k;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Object obj = this.f11883j;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.start();
        }
        Object obj2 = this.f11884k;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.f11882i != 0) {
            return;
        }
        this.f11882i = 1;
        this.f11880g = SystemClock.uptimeMillis();
        ArrayList arrayList = this.f11877d;
        if (arrayList.size() > 0) {
            throw t0.A(0, arrayList);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Object obj = this.f11883j;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.stop();
        }
        Object obj2 = this.f11884k;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.f11882i != 2) {
            this.f11882i = 2;
            this.f11883j = null;
            ArrayList arrayList = this.f11877d;
            if (arrayList.size() > 0) {
                throw t0.A(0, arrayList);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
