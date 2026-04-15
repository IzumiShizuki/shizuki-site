package s;

import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f19314a = ViewConfiguration.getScrollFriction();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final double f19315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final double f19316c;

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        f19315b = dLog;
        f19316c = dLog - 1.0d;
    }
}
