package t1;

import android.os.Build;
import android.view.Surface;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f20165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f20166d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Method f20168f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f20169g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ c f20163a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f20164b = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f20167e = new c();

    public boolean a() {
        Method method;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            return true;
        }
        if (i10 != 22) {
            return false;
        }
        synchronized (this) {
            method = null;
            try {
                Method declaredMethod = f20168f;
                if (!f20169g) {
                    f20169g = true;
                    declaredMethod = Surface.class.getDeclaredMethod("lockHardwareCanvas", null);
                    declaredMethod.setAccessible(true);
                    f20168f = declaredMethod;
                }
                method = declaredMethod;
            } catch (Throwable unused) {
                f20168f = null;
            }
        }
        return method != null;
    }
}
