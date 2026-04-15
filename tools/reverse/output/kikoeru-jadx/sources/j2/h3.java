package j2;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h3 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f9823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.t1 f9824b;

    public h3(View view, x0.t1 t1Var) {
        this.f9823a = view;
        this.f9824b = t1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f9823a.removeOnAttachStateChangeListener(this);
        this.f9824b.x();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
