package b7;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.cnl.kikoeru.MainService;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f1917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f1918c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j4 f1919a;

    static {
        m4.j0.a("media3.session");
        int i10 = p4.c0.f16548a;
        f1917b = Integer.toString(0, 36);
        f1918c = Integer.toString(1, 36);
    }

    public k4(MainService mainService, ComponentName componentName) {
        int i10;
        int i11;
        PackageManager packageManager = mainService.getPackageManager();
        try {
            i10 = packageManager.getApplicationInfo(componentName.getPackageName(), 0).uid;
        } catch (PackageManager.NameNotFoundException unused) {
            i10 = -1;
        }
        if (a(packageManager, "androidx.media3.session.MediaLibraryService", componentName)) {
            i11 = 2;
        } else if (a(packageManager, "androidx.media3.session.MediaSessionService", componentName)) {
            i11 = 1;
        } else {
            if (!a(packageManager, "android.media.browse.MediaBrowserService", componentName)) {
                throw new IllegalArgumentException("Failed to resolve SessionToken for " + componentName + ". Manifest doesn't declare one of either MediaSessionService, MediaLibraryService, MediaBrowserService or MediaBrowserServiceCompat. Use service's full name.");
            }
            i11 = TinkerReport.KEY_APPLIED_UPGRADE_FAIL;
        }
        if (i11 != 101) {
            this.f1919a = new l4(i10, i11, 0, 0, componentName.getPackageName(), componentName.getClassName(), componentName, null, Bundle.EMPTY, null);
        } else {
            this.f1919a = new m4(componentName, i10);
        }
    }

    public static boolean a(PackageManager packageManager, String str, ComponentName componentName) {
        ServiceInfo serviceInfo;
        Intent intent = new Intent(str);
        intent.setPackage(componentName.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 128);
        if (listQueryIntentServices != null) {
            for (int i10 = 0; i10 < listQueryIntentServices.size(); i10++) {
                ResolveInfo resolveInfo = listQueryIntentServices.get(i10);
                if (resolveInfo != null && (serviceInfo = resolveInfo.serviceInfo) != null && TextUtils.equals(serviceInfo.name, componentName.getClassName())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        j4 j4Var = this.f1919a;
        boolean z10 = j4Var instanceof l4;
        String str = f1917b;
        if (z10) {
            bundle.putInt(str, 0);
        } else {
            bundle.putInt(str, 1);
        }
        bundle.putBundle(f1918c, j4Var.k());
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k4) {
            return this.f1919a.equals(((k4) obj).f1919a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1919a.hashCode();
    }

    public final String toString() {
        return this.f1919a.toString();
    }

    public k4(int i10, int i11, int i12, String str, t tVar, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        IBinder iBinderAsBinder = tVar.asBinder();
        bundle.getClass();
        this.f1919a = new l4(i10, 0, i11, i12, str, "", null, iBinderAsBinder, bundle, token);
    }
}
