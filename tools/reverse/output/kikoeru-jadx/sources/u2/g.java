package u2;

import android.os.Build;
import r5.p;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f21229a;

    static {
        f21229a = Build.VERSION.SDK_INT >= 23 ? new p(4) : new p(5);
    }
}
