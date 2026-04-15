package c7;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f3673b = Log.isLoggable("MediaBrowserCompat", 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f3674a;

    public o(Context context, ComponentName componentName, e1 e1Var, Bundle bundle) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            this.f3674a = new l(context, componentName, e1Var, bundle);
        } else if (i10 >= 23) {
            this.f3674a = new k(context, componentName, e1Var, bundle);
        } else {
            this.f3674a = new j(context, componentName, e1Var, bundle);
        }
    }
}
