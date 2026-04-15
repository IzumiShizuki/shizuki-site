package f8;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import x0.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Drawable.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f6851b;

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f6850a) {
            case 0:
                ((e) this.f6851b).invalidateSelf();
                break;
            case 1:
                break;
            default:
                jc.l.e(drawable, "d");
                va.a aVar = (va.a) this.f6851b;
                e1 e1Var = aVar.f22802g;
                e1Var.setValue(Integer.valueOf(((Number) e1Var.getValue()).intValue() + 1));
                Drawable drawable2 = aVar.f22801f;
                Object obj = va.c.f22806a;
                aVar.f22803h.setValue(new p1.e((drawable2.getIntrinsicWidth() < 0 || drawable2.getIntrinsicHeight() < 0) ? 9205357640488583168L : nh.a.d(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight())));
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, ub.h] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        switch (this.f6850a) {
            case 0:
                ((e) this.f6851b).scheduleSelf(runnable, j10);
                break;
            case 1:
                Drawable.Callback callback = (Drawable.Callback) this.f6851b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j10);
                }
                break;
            default:
                jc.l.e(drawable, "d");
                jc.l.e(runnable, "what");
                ((Handler) va.c.f22806a.getValue()).postAtTime(runnable, j10);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, ub.h] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f6850a) {
            case 0:
                ((e) this.f6851b).unscheduleSelf(runnable);
                break;
            case 1:
                Drawable.Callback callback = (Drawable.Callback) this.f6851b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                }
                break;
            default:
                jc.l.e(drawable, "d");
                jc.l.e(runnable, "what");
                ((Handler) va.c.f22806a.getValue()).removeCallbacks(runnable);
                break;
        }
    }

    public /* synthetic */ b(int i10, Object obj) {
        this.f6850a = i10;
        this.f6851b = obj;
    }

    private final void a(Drawable drawable) {
    }
}
