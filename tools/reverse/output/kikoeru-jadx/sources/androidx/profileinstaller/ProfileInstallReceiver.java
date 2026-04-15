package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import i7.p2;
import java.io.File;
import k7.b;
import k7.d;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            d.t(context, new b(0), new p2(this), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if (!"WRITE_SKIP_FILE".equals(string)) {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                        setResultCode(11);
                        return;
                    }
                    return;
                }
                p2 p2Var = new p2(this);
                try {
                    d.e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    p2Var.f(10, null);
                    return;
                } catch (PackageManager.NameNotFoundException e10) {
                    p2Var.f(7, e10);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            p2 p2Var2 = new p2(this);
            if (Build.VERSION.SDK_INT < 24) {
                p2Var2.f(13, null);
                return;
            } else {
                Process.sendSignal(Process.myPid(), 10);
                p2Var2.f(12, null);
                return;
            }
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        p2 p2Var3 = new p2(this);
        if (!"DROP_SHADER_CACHE".equals(string2)) {
            p2Var3.f(16, null);
            return;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (d.c(i10 >= 34 ? context.createDeviceProtectedStorageContext().getCacheDir() : i10 >= 24 ? context.createDeviceProtectedStorageContext().getCodeCacheDir() : i10 == 23 ? context.getCodeCacheDir() : context.getCacheDir())) {
            p2Var3.f(14, null);
        } else {
            p2Var3.f(15, null);
        }
    }
}
