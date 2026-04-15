package c7;

import android.content.Context;
import android.os.Build;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f3661b = Log.isLoggable("MediaSessionManager", 3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f3662c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile l1 f3663d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g1 f3664a;

    public static l1 a(Context context) {
        l1 l1Var;
        if (context == null) {
            throw new IllegalArgumentException("context cannot be null");
        }
        synchronized (f3662c) {
            try {
                if (f3663d == null) {
                    Context applicationContext = context.getApplicationContext();
                    l1 l1Var2 = new l1();
                    if (Build.VERSION.SDK_INT >= 28) {
                        i1 i1Var = new i1(applicationContext);
                        l1Var2.f3664a = i1Var;
                    } else {
                        l1Var2.f3664a = new g1(applicationContext);
                    }
                    f3663d = l1Var2;
                }
                l1Var = f3663d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return l1Var;
    }

    public final boolean b(k1 k1Var) {
        if (k1Var != null) {
            return this.f3664a.a(k1Var.f3655a);
        }
        throw new IllegalArgumentException("userInfo should not be null");
    }
}
