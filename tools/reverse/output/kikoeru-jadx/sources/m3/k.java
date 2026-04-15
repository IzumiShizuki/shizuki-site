package m3;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f14071d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static j f14074g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NotificationManager f14076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f14070c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static HashSet f14072e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f14073f = new Object();

    public k(Context context) {
        this.f14075a = context;
        this.f14076b = (NotificationManager) context.getSystemService("notification");
    }

    public final boolean a() {
        Method method;
        Integer num;
        if (Build.VERSION.SDK_INT >= 24) {
            return d.a(this.f14076b);
        }
        Context context = this.f14075a;
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = context.getApplicationContext().getPackageName();
        int i10 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
            num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            num.getClass();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
        }
        return ((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i10), packageName)).intValue() == 0;
    }
}
