package com.tencent.bugly.beta.ui;

import android.view.View;
import android.view.animation.Animation;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseDialogFrag f4428a;

    public c(BaseDialogFrag baseDialogFrag) {
        this.f4428a = baseDialogFrag;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        BaseDialogFrag baseDialogFrag = this.f4428a;
        View view = baseDialogFrag.mLayoutContainer;
        if (view != null) {
            view.setVisibility(8);
        }
        super/*com.tencent.bugly.beta.ui.BaseFrag*/.close();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
