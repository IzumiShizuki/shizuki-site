package a3;

import android.os.Build;
import c7.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f198a;

    static {
        f198a = Build.VERSION.SDK_INT >= 24 ? new e1(1) : new pe.d(1);
    }
}
