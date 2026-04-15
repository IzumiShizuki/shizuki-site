package u3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e0 f21344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f21345b;

    public x(View view, e0 e0Var) {
        this.f21344a = e0Var;
        this.f21345b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        e0 e0Var = this.f21344a;
        e0Var.f21286a.e(1.0f);
        z.f(this.f21345b, e0Var);
    }
}
