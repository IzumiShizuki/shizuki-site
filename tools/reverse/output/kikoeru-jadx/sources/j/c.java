package j;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import gh.g;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ObjectAnimator f9556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9557c;

    public c(AnimationDrawable animationDrawable, boolean z10, boolean z11) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i10 = z10 ? numberOfFrames - 1 : 0;
        int i11 = z10 ? 0 : numberOfFrames - 1;
        d dVar = new d();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        dVar.f9559b = numberOfFrames2;
        int[] iArr = dVar.f9558a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            dVar.f9558a = new int[numberOfFrames2];
        }
        int[] iArr2 = dVar.f9558a;
        int i12 = 0;
        for (int i13 = 0; i13 < numberOfFrames2; i13++) {
            int duration = animationDrawable.getDuration(z10 ? (numberOfFrames2 - i13) - 1 : i13);
            iArr2[i13] = duration;
            i12 += duration;
        }
        dVar.f9560c = i12;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i10, i11);
        k.a.a(objectAnimatorOfInt, true);
        objectAnimatorOfInt.setDuration(dVar.f9560c);
        objectAnimatorOfInt.setInterpolator(dVar);
        this.f9557c = z11;
        this.f9556b = objectAnimatorOfInt;
    }

    @Override // gh.g
    public final void M() {
        this.f9556b.reverse();
    }

    @Override // gh.g
    public final void O() {
        this.f9556b.start();
    }

    @Override // gh.g
    public final void P() {
        this.f9556b.cancel();
    }

    @Override // gh.g
    public final boolean i() {
        return this.f9557c;
    }
}
