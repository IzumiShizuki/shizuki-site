package m0;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t4 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f13653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a f13654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13655c;

    public t4(View view, ic.a aVar) {
        this.f13653a = view;
        this.f13654b = aVar;
        view.addOnAttachStateChangeListener(this);
        if (this.f13655c || !view.isAttachedToWindow()) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.f13655c = true;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f13654b.b();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.f13655c) {
            return;
        }
        View view2 = this.f13653a;
        if (view2.isAttachedToWindow()) {
            view2.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f13655c = true;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.f13655c) {
            this.f13653a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f13655c = false;
        }
    }
}
