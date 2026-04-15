package b0;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t0 f1408a;

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        jc.l.d(lowerCase, "toLowerCase(...)");
        f1408a = lowerCase.equals("robolectric") ? new t0() : null;
    }
}
