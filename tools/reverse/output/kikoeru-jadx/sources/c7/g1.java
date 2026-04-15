package c7;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class g1 implements f1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f3632c = l1.f3661b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f3633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ContentResolver f3634b;

    public g1(Context context) {
        this.f3633a = context;
        this.f3634b = context.getContentResolver();
        this.f3633a = context;
    }

    @Override // c7.f1
    public boolean a(j1 j1Var) {
        if (this.f3633a.checkPermission("android.permission.MEDIA_CONTENT_CONTROL", j1Var.f3653b, j1Var.f3654c) == 0) {
            return true;
        }
        boolean z10 = false;
        try {
            if (this.f3633a.getPackageManager().getApplicationInfo(j1Var.f3652a, 0) != null) {
                if (b(j1Var, "android.permission.STATUS_BAR_SERVICE") || b(j1Var, "android.permission.MEDIA_CONTENT_CONTROL") || j1Var.f3654c == 1000) {
                    z10 = true;
                    break;
                }
                String string = Settings.Secure.getString(this.f3634b, "enabled_notification_listeners");
                if (string != null) {
                    for (String str : string.split(":")) {
                        ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                        if (componentNameUnflattenFromString != null && componentNameUnflattenFromString.getPackageName().equals(j1Var.f3652a)) {
                            z10 = true;
                            break;
                        }
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            if (f3632c) {
                Log.d("MediaSessionManager", "Package " + j1Var.f3652a + " doesn't exist");
            }
        }
        return z10;
    }

    public final boolean b(j1 j1Var, String str) {
        int i10 = j1Var.f3653b;
        return i10 < 0 ? this.f3633a.getPackageManager().checkPermission(str, j1Var.f3652a) == 0 : this.f3633a.checkPermission(str, i10, j1Var.f3654c) == 0;
    }
}
