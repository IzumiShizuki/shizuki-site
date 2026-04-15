package m7;

import android.animation.ValueAnimator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f14836a;

    public e(f fVar) {
        this.f14836a = fVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        f fVar = this.f14836a;
        fVar.f14847b.setAlpha(iFloatValue);
        fVar.f14848c.setAlpha(iFloatValue);
        fVar.f14859n.invalidate();
    }
}
