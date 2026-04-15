package u3;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f21291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f21292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c7.c0 f21293c;

    public g(View view, c7.c0 c0Var) {
        this.f21291a = view;
        this.f21292b = view.getViewTreeObserver();
        this.f21293c = c0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f21292b.isAlive();
        View view = this.f21291a;
        if (zIsAlive) {
            this.f21292b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f21293c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f21292b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f21292b.isAlive();
        View view2 = this.f21291a;
        if (zIsAlive) {
            this.f21292b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
