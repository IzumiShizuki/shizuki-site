package b7;

import android.graphics.Insets;
import android.util.CloseGuard;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class u0 {
    public static /* synthetic */ CloseGuard g() {
        return new CloseGuard();
    }

    public static /* bridge */ /* synthetic */ CloseGuard h(Object obj) {
        return (CloseGuard) obj;
    }

    public static /* synthetic */ WindowInsetsAnimation.Bounds i(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    public static /* synthetic */ WindowInsetsAnimation j(int i10, Interpolator interpolator, long j10) {
        return new WindowInsetsAnimation(i10, interpolator, j10);
    }

    public static /* synthetic */ void m() {
    }
}
