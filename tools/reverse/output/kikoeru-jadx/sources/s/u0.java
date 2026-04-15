package s;

import android.os.Build;
import androidx.compose.foundation.MagnifierElement;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q2.w f19286a = new q2.w("MagnifierPositionInRoot");

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static j1.q b(ic.k kVar, ic.k kVar2, e1 e1Var) {
        return a() ? new MagnifierElement(kVar, kVar2, e1Var) : j1.n.f9689a;
    }
}
