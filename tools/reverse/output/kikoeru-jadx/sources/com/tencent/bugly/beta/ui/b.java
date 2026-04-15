package com.tencent.bugly.beta.ui;

import android.view.View;
import android.view.animation.AlphaAnimation;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AlphaAnimation f4426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseDialogFrag f4427b;

    public b(BaseDialogFrag baseDialogFrag, AlphaAnimation alphaAnimation) {
        this.f4427b = baseDialogFrag;
        this.f4426a = alphaAnimation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.f4427b.mLayoutContainer;
        if (view != null) {
            view.startAnimation(this.f4426a);
        }
    }
}
