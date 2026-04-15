package j;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import c7.r;
import n7.b0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class f extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f9568m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f9569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Rect f9570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f9571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f9572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9574f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9575g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9576h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public r f9577i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f9578j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f9579k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f8.b f9580l;

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f9574f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f9571c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L38
            long r9 = r13.f9578j
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L3a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f9573e
            r3.setAlpha(r9)
            r13.f9578j = r6
            goto L3a
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            j.b r9 = r13.f9569a
            int r9 = r9.f9554y
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f9573e
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L3b
        L38:
            r13.f9578j = r6
        L3a:
            r3 = 0
        L3b:
            android.graphics.drawable.Drawable r9 = r13.f9572d
            if (r9 == 0) goto L65
            long r10 = r13.f9579k
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L67
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L52
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f9572d = r0
            r13.f9579k = r6
            goto L67
        L52:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            j.b r4 = r13.f9569a
            int r4 = r4.f9555z
            int r3 = r3 / r4
            int r4 = r13.f9573e
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L68
        L65:
            r13.f9579k = r6
        L67:
            r0 = r3
        L68:
            if (r14 == 0) goto L74
            if (r0 == 0) goto L74
            c7.r r14 = r13.f9577i
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j.f.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        b bVar = this.f9569a;
        if (theme == null) {
            bVar.getClass();
            return;
        }
        bVar.c();
        int i10 = bVar.f9537h;
        Drawable[] drawableArr = bVar.f9536g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable != null && drawable.canApplyTheme()) {
                drawableArr[i11].applyTheme(theme);
                bVar.f9534e |= drawableArr[i11].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            bVar.f9531b = resources;
            int i12 = resources.getDisplayMetrics().densityDpi;
            if (i12 == 0) {
                i12 = 160;
            }
            int i13 = bVar.f9532c;
            bVar.f9532c = i12;
            if (i13 != i12) {
                bVar.f9542m = false;
                bVar.f9539j = false;
            }
        }
    }

    public final void b(Drawable drawable) {
        if (this.f9580l == null) {
            this.f9580l = new f8.b();
        }
        f8.b bVar = this.f9580l;
        bVar.f6851b = drawable.getCallback();
        drawable.setCallback(bVar);
        try {
            if (this.f9569a.f9554y <= 0 && this.f9574f) {
                drawable.setAlpha(this.f9573e);
            }
            b bVar2 = this.f9569a;
            if (bVar2.C) {
                drawable.setColorFilter(bVar2.B);
            } else {
                if (bVar2.F) {
                    drawable.setTintList(bVar2.D);
                }
                b bVar3 = this.f9569a;
                if (bVar3.G) {
                    drawable.setTintMode(bVar3.E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f9569a.f9552w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                b0.y(drawable, b0.n(this));
            }
            drawable.setAutoMirrored(this.f9569a.A);
            Rect rect = this.f9570b;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
            f8.b bVar4 = this.f9580l;
            Drawable.Callback callback = (Drawable.Callback) bVar4.f6851b;
            bVar4.f6851b = null;
            drawable.setCallback(callback);
        } catch (Throwable th2) {
            f8.b bVar5 = this.f9580l;
            Drawable.Callback callback2 = (Drawable.Callback) bVar5.f6851b;
            bVar5.f6851b = null;
            drawable.setCallback(callback2);
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(int r10) {
        /*
            r9 = this;
            int r0 = r9.f9575g
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            j.b r0 = r9.f9569a
            int r0 = r0.f9555z
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f9572d
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f9571c
            if (r0 == 0) goto L29
            r9.f9572d = r0
            j.b r0 = r9.f9569a
            int r0 = r0.f9555z
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f9579k = r0
            goto L35
        L29:
            r9.f9572d = r4
            r9.f9579k = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f9571c
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            j.b r0 = r9.f9569a
            int r1 = r0.f9537h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.d(r10)
            r9.f9571c = r0
            r9.f9575g = r10
            if (r0 == 0) goto L5a
            j.b r10 = r9.f9569a
            int r10 = r10.f9554y
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f9578j = r2
        L51:
            r9.b(r0)
            goto L5a
        L55:
            r9.f9571c = r4
            r10 = -1
            r9.f9575g = r10
        L5a:
            long r0 = r9.f9578j
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L67
            long r0 = r9.f9579k
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L7d
        L67:
            c7.r r0 = r9.f9577i
            if (r0 != 0) goto L77
            c7.r r0 = new c7.r
            r1 = r9
            j.e r1 = (j.e) r1
            r2 = 3
            r0.<init>(r2, r1)
            r9.f9577i = r0
            goto L7a
        L77:
            r9.unscheduleSelf(r0)
        L7a:
            r9.a(r10)
        L7d:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: j.f.c(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f9569a.canApplyTheme();
    }

    public abstract void d(b bVar);

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f9571c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f9572d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f9573e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f9569a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z10;
        b bVar = this.f9569a;
        if (!bVar.f9550u) {
            bVar.c();
            bVar.f9550u = true;
            int i10 = bVar.f9537h;
            Drawable[] drawableArr = bVar.f9536g;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    bVar.f9551v = true;
                    z10 = true;
                    break;
                }
                if (drawableArr[i11].getConstantState() == null) {
                    bVar.f9551v = false;
                    z10 = false;
                    break;
                }
                i11++;
            }
        } else {
            z10 = bVar.f9551v;
        }
        if (!z10) {
            return null;
        }
        this.f9569a.f9533d = getChangingConfigurations();
        return this.f9569a;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f9571c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f9570b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        b bVar = this.f9569a;
        if (bVar.f9541l) {
            if (!bVar.f9542m) {
                bVar.b();
            }
            return bVar.f9544o;
        }
        Drawable drawable = this.f9571c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        b bVar = this.f9569a;
        if (bVar.f9541l) {
            if (!bVar.f9542m) {
                bVar.b();
            }
            return bVar.f9543n;
        }
        Drawable drawable = this.f9571c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        b bVar = this.f9569a;
        if (bVar.f9541l) {
            if (!bVar.f9542m) {
                bVar.b();
            }
            return bVar.f9546q;
        }
        Drawable drawable = this.f9571c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        b bVar = this.f9569a;
        if (bVar.f9541l) {
            if (!bVar.f9542m) {
                bVar.b();
            }
            return bVar.f9545p;
        }
        Drawable drawable = this.f9571c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f9571c;
        if (drawable != null && drawable.isVisible()) {
            b bVar = this.f9569a;
            if (bVar.f9547r) {
                return bVar.f9548s;
            }
            bVar.c();
            int i10 = bVar.f9537h;
            Drawable[] drawableArr = bVar.f9536g;
            opacity = i10 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i11 = 1; i11 < i10; i11++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i11].getOpacity());
            }
            bVar.f9548s = opacity;
            bVar.f9547r = true;
        }
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f9571c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        b bVar = this.f9569a;
        Rect rect2 = null;
        boolean padding = false;
        if (!bVar.f9538i) {
            Rect rect3 = bVar.f9540k;
            if (rect3 != null || bVar.f9539j) {
                rect2 = rect3;
            } else {
                bVar.c();
                Rect rect4 = new Rect();
                int i10 = bVar.f9537h;
                Drawable[] drawableArr = bVar.f9536g;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (drawableArr[i11].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i12 = rect4.left;
                        if (i12 > rect2.left) {
                            rect2.left = i12;
                        }
                        int i13 = rect4.top;
                        if (i13 > rect2.top) {
                            rect2.top = i13;
                        }
                        int i14 = rect4.right;
                        if (i14 > rect2.right) {
                            rect2.right = i14;
                        }
                        int i15 = rect4.bottom;
                        if (i15 > rect2.bottom) {
                            rect2.bottom = i15;
                        }
                    }
                }
                bVar.f9539j = true;
                bVar.f9540k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                padding = true;
            }
        } else {
            Drawable drawable = this.f9571c;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.f9569a.A && b0.n(this) == 1) {
            int i16 = rect.left;
            rect.left = rect.right;
            rect.right = i16;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        b bVar = this.f9569a;
        if (bVar != null) {
            bVar.f9547r = false;
            bVar.f9549t = false;
        }
        if (drawable != this.f9571c || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f9569a.A;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z10;
        Drawable drawable = this.f9572d;
        boolean z11 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f9572d = null;
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f9571c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f9574f) {
                this.f9571c.setAlpha(this.f9573e);
            }
        }
        if (this.f9579k != 0) {
            this.f9579k = 0L;
            z10 = true;
        }
        if (this.f9578j != 0) {
            this.f9578j = 0L;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f9576h && super.mutate() == this) {
            e eVar = (e) this;
            b bVar = new b(eVar.f9563p, eVar, null);
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            d(bVar);
            this.f9576h = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f9572d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f9571c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i10) {
        b bVar = this.f9569a;
        int i11 = this.f9575g;
        int i12 = bVar.f9537h;
        Drawable[] drawableArr = bVar.f9536g;
        boolean z10 = false;
        for (int i13 = 0; i13 < i12; i13++) {
            Drawable drawable = drawableArr[i13];
            if (drawable != null) {
                boolean zY = Build.VERSION.SDK_INT >= 23 ? b0.y(drawable, i10) : false;
                if (i13 == i11) {
                    z10 = zY;
                }
            }
        }
        bVar.f9553x = i10;
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.f9572d;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f9571c;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        if (drawable != this.f9571c || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.f9574f && this.f9573e == i10) {
            return;
        }
        this.f9574f = true;
        this.f9573e = i10;
        Drawable drawable = this.f9571c;
        if (drawable != null) {
            if (this.f9578j == 0) {
                drawable.setAlpha(i10);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        b bVar = this.f9569a;
        if (bVar.A != z10) {
            bVar.A = z10;
            Drawable drawable = this.f9571c;
            if (drawable != null) {
                drawable.setAutoMirrored(z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        b bVar = this.f9569a;
        bVar.C = true;
        if (bVar.B != colorFilter) {
            bVar.B = colorFilter;
            Drawable drawable = this.f9571c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z10) {
        b bVar = this.f9569a;
        if (bVar.f9552w != z10) {
            bVar.f9552w = z10;
            Drawable drawable = this.f9571c;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f10, float f11) {
        Drawable drawable = this.f9571c;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f9570b;
        if (rect == null) {
            this.f9570b = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f9571c;
        if (drawable != null) {
            drawable.setHotspotBounds(i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        b bVar = this.f9569a;
        bVar.F = true;
        if (bVar.D != colorStateList) {
            bVar.D = colorStateList;
            this.f9571c.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f9569a;
        bVar.G = true;
        if (bVar.E != mode) {
            bVar.E = mode;
            this.f9571c.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.f9572d;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.f9571c;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f9571c || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
