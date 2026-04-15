package u0;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import java.lang.reflect.Method;
import q1.h0;
import q1.q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i extends View {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f21195f = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f21196g = new int[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f21197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f21198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f21199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a9.m f21200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ic.a f21201e;

    private final void setRippleState(boolean z10) throws InterruptedException {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f21200d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l10 = this.f21199c;
        long jLongValue = jCurrentAnimationTimeMillis - (l10 != null ? l10.longValue() : 0L);
        if (z10 || jLongValue >= 5) {
            int[] iArr = z10 ? f21195f : f21196g;
            m mVar = this.f21197a;
            if (mVar != null) {
                mVar.setState(iArr);
            }
        } else {
            a9.m mVar2 = new a9.m(20, this);
            this.f21200d = mVar2;
            postDelayed(mVar2, 50L);
        }
        this.f21199c = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(i iVar) {
        m mVar = iVar.f21197a;
        if (mVar != null) {
            mVar.setState(f21196g);
        }
        iVar.f21200d = null;
    }

    public final void b(w.m mVar, boolean z10, long j10, int i10, long j11, float f10, ic.a aVar) throws InterruptedException {
        if (this.f21197a == null || !Boolean.valueOf(z10).equals(this.f21198b)) {
            m mVar2 = new m(z10);
            setBackground(mVar2);
            this.f21197a = mVar2;
            this.f21198b = Boolean.valueOf(z10);
        }
        m mVar3 = this.f21197a;
        jc.l.b(mVar3);
        this.f21201e = aVar;
        e(j10, i10, j11, f10);
        if (z10) {
            mVar3.setHotspot(p1.b.e(mVar.f22980a), p1.b.f(mVar.f22980a));
        } else {
            mVar3.setHotspot(mVar3.getBounds().centerX(), mVar3.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() throws InterruptedException {
        this.f21201e = null;
        a9.m mVar = this.f21200d;
        if (mVar != null) {
            removeCallbacks(mVar);
            a9.m mVar2 = this.f21200d;
            jc.l.b(mVar2);
            mVar2.run();
        } else {
            m mVar3 = this.f21197a;
            if (mVar3 != null) {
                mVar3.setState(f21196g);
            }
        }
        m mVar4 = this.f21197a;
        if (mVar4 == null) {
            return;
        }
        mVar4.setVisible(false, false);
        unscheduleDrawable(mVar4);
    }

    public final void d() throws InterruptedException {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) throws InterruptedException {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            c();
        }
    }

    public final void e(long j10, int i10, long j11, float f10) {
        m mVar = this.f21197a;
        if (mVar == null) {
            return;
        }
        Integer num = mVar.f21211c;
        if (num == null || num.intValue() != i10) {
            mVar.f21211c = Integer.valueOf(i10);
            if (Build.VERSION.SDK_INT < 23) {
                try {
                    if (!m.f21208f) {
                        m.f21208f = true;
                        m.f21207e = RippleDrawable.class.getDeclaredMethod("setMaxRadius", Integer.TYPE);
                    }
                    Method method = m.f21207e;
                    if (method != null) {
                        method.invoke(mVar, Integer.valueOf(i10));
                    }
                } catch (Exception unused) {
                }
            } else {
                mVar.setRadius(i10);
            }
        }
        if (Build.VERSION.SDK_INT < 28) {
            f10 *= 2;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        long jB = q.b(f10, j11);
        q qVar = mVar.f21210b;
        if (!(qVar == null ? false : q.c(qVar.f17577a, jB))) {
            mVar.f21210b = new q(jB);
            mVar.setColor(ColorStateList.valueOf(h0.B(jB)));
        }
        Rect rect = new Rect(0, 0, lc.b.R(p1.e.d(j10)), lc.b.R(p1.e.b(j10)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        mVar.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        ic.a aVar = this.f21201e;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
