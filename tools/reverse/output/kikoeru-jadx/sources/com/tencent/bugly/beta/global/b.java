package com.tencent.bugly.beta.global;

import android.app.Activity;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.bugly.beta.Beta;
import com.tencent.bugly.beta.download.BetaReceiver;
import com.tencent.bugly.beta.download.DownloadTask;
import com.tencent.bugly.beta.tinker.TinkerReport;
import com.tencent.bugly.beta.ui.BaseDialogFrag;
import com.tencent.bugly.beta.ui.HotfixDialog;
import com.tencent.bugly.beta.ui.UpgradeDialog;
import com.tencent.bugly.proguard.B;
import com.tencent.bugly.proguard.C0012p;
import com.tencent.bugly.proguard.X;
import com.tencent.bugly.proguard.z;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f4374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object[] f4375b;

    public b(int i10, Object... objArr) {
        this.f4374a = i10;
        this.f4375b = objArr;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            switch (this.f4374a) {
                case 1:
                    if (((ViewGroup) this.f4375b[1]).getChildCount() <= 0) {
                        ((Activity) this.f4375b[0]).finish();
                        X.c("BetaAct closed by empty view", new Object[0]);
                    }
                    break;
                case 2:
                    ((BaseDialogFrag) this.f4375b[0]).close();
                    break;
                case 3:
                    Object obj = this.f4375b[1];
                    if (obj != null) {
                        ((DownloadTask) obj).download();
                    }
                    ((BaseDialogFrag) this.f4375b[0]).close();
                    break;
                case 4:
                    UpgradeDialog upgradeDialog = (UpgradeDialog) this.f4375b[0];
                    DownloadTask downloadTask = upgradeDialog.strategyTask;
                    B b10 = upgradeDialog.strategyDetail;
                    BetaReceiver.addTask(downloadTask);
                    Runnable runnable = upgradeDialog.upgradeRunnable;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (downloadTask.getStatus() == 1 && a.a(e.f4381b.f4407v, downloadTask.getSaveFile(), b10.f4830k.f5144b)) {
                        C0012p.f5037a.a(new z("install", System.currentTimeMillis(), (byte) 0, 0L, b10.f4829j, b10.f4837r, b10.f4840u, null));
                    } else {
                        downloadTask.download();
                    }
                    if (b10.f4831l != 2) {
                        upgradeDialog.close();
                    }
                    upgradeDialog.updateBtn(downloadTask);
                    break;
                case 5:
                    UpgradeDialog upgradeDialog2 = (UpgradeDialog) this.f4375b[0];
                    DownloadTask downloadTask2 = upgradeDialog2.strategyTask;
                    BetaReceiver.netListeners.remove(downloadTask2.getDownloadUrl());
                    downloadTask2.stop();
                    upgradeDialog2.updateBtn(downloadTask2);
                    break;
                case 6:
                    UpgradeDialog upgradeDialog3 = (UpgradeDialog) this.f4375b[0];
                    Runnable runnable2 = upgradeDialog3.cancelRunnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    upgradeDialog3.close();
                    break;
                case 7:
                    Process.killProcess(Process.myPid());
                    System.exit(0);
                    break;
                case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                    ((HotfixDialog) this.f4375b[0]).close();
                    break;
                case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                    Beta.installApk(Beta.getStrategyTask().getSaveFile());
                    Beta.saveInstallEvent(true);
                    break;
            }
        } catch (Exception e10) {
            if (X.a(e10)) {
                return;
            }
            e10.printStackTrace();
        }
    }
}
