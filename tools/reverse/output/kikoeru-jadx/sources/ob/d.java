package ob;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.tencent.bugly.crashreport.biz.f;
import com.tencent.bugly.proguard.X;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        String name = activity != null ? activity.getClass().getName() : "unknown";
        if (f.f4555l == null || f.f4555l.getName().equals(name)) {
            X.a(">>> %s onCreated <<<", name);
            com.tencent.bugly.crashreport.common.info.a aVarM = com.tencent.bugly.crashreport.common.info.a.m();
            if (aVarM != null) {
                aVarM.f4589na.add(f.b(name, "onCreated"));
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        String name = activity != null ? activity.getClass().getName() : "unknown";
        if (f.f4555l == null || f.f4555l.getName().equals(name)) {
            X.a(">>> %s onDestroyed <<<", name);
            com.tencent.bugly.crashreport.common.info.a aVarM = com.tencent.bugly.crashreport.common.info.a.m();
            if (aVarM != null) {
                aVarM.f4589na.add(f.b(name, "onDestroyed"));
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        String name = activity != null ? activity.getClass().getName() : "unknown";
        if (f.f4555l == null || f.f4555l.getName().equals(name)) {
            X.a(">>> %s onPaused <<<", name);
            com.tencent.bugly.crashreport.common.info.a aVarM = com.tencent.bugly.crashreport.common.info.a.m();
            if (aVarM == null) {
                return;
            }
            aVarM.f4589na.add(f.b(name, "onPaused"));
            aVarM.a(false);
            long jCurrentTimeMillis = System.currentTimeMillis();
            aVarM.Y = jCurrentTimeMillis;
            aVarM.Z = jCurrentTimeMillis - aVarM.X;
            long unused = f.f4550g = jCurrentTimeMillis;
            if (aVarM.Z < 0) {
                aVarM.Z = 0L;
            }
            if (activity != null) {
                aVarM.W = "background";
            } else {
                aVarM.W = "unknown";
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        String name = activity != null ? activity.getClass().getName() : "unknown";
        if (f.f4555l == null || f.f4555l.getName().equals(name)) {
            X.a(">>> %s onResumed <<<", name);
            com.tencent.bugly.crashreport.common.info.a aVarM = com.tencent.bugly.crashreport.common.info.a.m();
            if (aVarM == null) {
                return;
            }
            aVarM.f4589na.add(f.b(name, "onResumed"));
            aVarM.a(true);
            aVarM.W = name;
            long jCurrentTimeMillis = System.currentTimeMillis();
            aVarM.X = jCurrentTimeMillis;
            aVarM.f4564aa = jCurrentTimeMillis - f.f4551h;
            long j10 = aVarM.X - f.f4550g;
            if (j10 > (f.f4548e > 0 ? f.f4548e : f.f4547d)) {
                aVarM.F();
                f.i();
                X.c("[session] launch app one times (app in background %d seconds and over %d seconds)", Long.valueOf(j10 / 1000), Long.valueOf(f.f4547d / 1000));
                if (f.f4549f % f.f4545b == 0) {
                    f.f4552i.a(4, f.f4556m, 0L);
                    return;
                }
                f.f4552i.a(4, false, 0L);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (jCurrentTimeMillis2 - f.f4553j > f.f4546c) {
                    long unused = f.f4553j = jCurrentTimeMillis2;
                    X.c("add a timer to upload hot start user info", new Object[0]);
                    if (f.f4556m) {
                        f.f4552i.a(f.f4546c);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
