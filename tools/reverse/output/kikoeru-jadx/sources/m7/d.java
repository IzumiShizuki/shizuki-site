package m7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f14834a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f14835b;

    public d(f fVar) {
        this.f14835b = fVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f14834a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f14834a) {
            this.f14834a = false;
            return;
        }
        f fVar = this.f14835b;
        if (((Float) fVar.f14866u.getAnimatedValue()).floatValue() == 0.0f) {
            fVar.f14867v = 0;
            fVar.d(0);
        } else {
            fVar.f14867v = 2;
            fVar.f14859n.invalidate();
        }
    }
}
