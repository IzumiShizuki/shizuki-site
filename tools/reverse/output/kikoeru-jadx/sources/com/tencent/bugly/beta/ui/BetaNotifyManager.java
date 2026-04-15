package com.tencent.bugly.beta.ui;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.os.Build;
import b7.l;
import com.tencent.bugly.beta.Beta;
import com.tencent.bugly.beta.download.BetaReceiver;
import com.tencent.bugly.beta.download.DownloadTask;
import com.tencent.bugly.beta.global.e;
import com.tencent.bugly.proguard.B;
import com.tencent.bugly.proguard.X;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class BetaNotifyManager {
    private static final String CHANNEL_DESCRIPTION = "bugly upgrade";
    private static final String CHANNEL_ID = "001";
    private static final String CHANNEL_NAME = "bugly_upgrade";
    private static final int NOTIFICATION_DOWNLOAD_ID = 1000;
    private static final int NOTIFICATION_UPGRADE_ID = 1001;
    private static final long NOTIFY_LEN = 307200;
    public static final int REQUEST_CODE_DOWNLOAD = 1;
    public static final int REQUEST_CODE_UPGRADE = 2;
    public static BetaNotifyManager instance = new BetaNotifyManager();
    public BaseFrag fragment;
    private long lastLen;
    private m3.c mBuilder;
    private Notification mNotification;
    public B strategy;
    public DownloadTask task;
    private boolean hasNotification = true;
    private Context mContext = e.f4381b.f4407v;
    public String intentFilter = this.mContext.getPackageName() + ".beta.DOWNLOAD_NOTIFY";
    private NotificationManager mManager = (NotificationManager) this.mContext.getSystemService("notification");

    private BetaNotifyManager() {
        this.mContext.registerReceiver(new BetaReceiver(), new IntentFilter(this.intentFilter));
        adaptNotificationChannel();
    }

    private void adaptNotificationChannel() {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannelA = l.a();
            notificationChannelA.setDescription("bugly upgrade");
            notificationChannelA.enableVibration(false);
            notificationChannelA.setVibrationPattern(new long[]{0});
            this.mManager.createNotificationChannel(notificationChannelA);
        }
    }

    public void initNotify(DownloadTask downloadTask) {
        ApplicationInfo applicationInfo;
        this.task = downloadTask;
        this.lastLen = downloadTask.getSavedLength();
        boolean zIsNeededNotify = downloadTask.isNeededNotify();
        this.hasNotification = zIsNeededNotify;
        if (zIsNeededNotify && e.f4381b.T) {
            this.mManager.cancel(NOTIFICATION_DOWNLOAD_ID);
            Intent intent = new Intent(this.intentFilter);
            intent.putExtra("request", 1);
            if (this.mBuilder == null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    try {
                        this.mBuilder = new m3.c(this.mContext, CHANNEL_ID);
                    } catch (Throwable unused) {
                        this.mBuilder = new m3.c(this.mContext, null);
                    }
                } else {
                    this.mBuilder = new m3.c(this.mContext, null);
                }
            }
            m3.c cVar = this.mBuilder;
            cVar.f14054u.tickerText = m3.c.b(Beta.strNotificationDownloading + e.f4381b.B);
            cVar.f14038e = m3.c.b(e.f4381b.B);
            cVar.f14039f = m3.c.b(String.format(Locale.getDefault(), "%s %d%%", Beta.strNotificationDownloading, Integer.valueOf((int) (this.task.getTotalLength() != 0 ? (this.task.getSavedLength() * 100) / this.task.getTotalLength() : 0L))));
            cVar.f14040g = PendingIntent.getBroadcast(this.mContext, 1, intent, 268435456);
            cVar.c(16, false);
            e eVar = e.f4381b;
            int i10 = eVar.f4394i;
            if (i10 > 0) {
                this.mBuilder.f14054u.icon = i10;
            } else {
                PackageInfo packageInfo = eVar.C;
                if (packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null) {
                    this.mBuilder.f14054u.icon = applicationInfo.icon;
                }
            }
            try {
                if (eVar.f4395j > 0 && this.mContext.getResources().getDrawable(e.f4381b.f4395j) != null) {
                    this.mBuilder.d(com.tencent.bugly.beta.global.a.a(this.mContext.getResources().getDrawable(e.f4381b.f4395j)));
                }
            } catch (Resources.NotFoundException e10) {
                X.b(BetaNotifyManager.class, "[initNotify] " + e10.getMessage(), new Object[0]);
            }
            Notification notificationA = this.mBuilder.a();
            this.mNotification = notificationA;
            this.mManager.notify(NOTIFICATION_DOWNLOAD_ID, notificationA);
        }
    }

    public void postDownloadNotify() {
        DownloadTask downloadTask;
        if (this.hasNotification && (downloadTask = this.task) != null && e.f4381b.T) {
            if (downloadTask.getSavedLength() - this.lastLen > NOTIFY_LEN || this.task.getStatus() == 1 || this.task.getStatus() == 5 || this.task.getStatus() == 3) {
                this.lastLen = this.task.getSavedLength();
                if (this.task.getStatus() == 1) {
                    m3.c cVar = this.mBuilder;
                    cVar.c(16, true);
                    cVar.f14039f = m3.c.b(Beta.strNotificationClickToInstall);
                    cVar.f14038e = m3.c.b(e.f4381b.B + " " + Beta.strNotificationDownloadSucc);
                } else if (this.task.getStatus() == 5) {
                    m3.c cVar2 = this.mBuilder;
                    cVar2.c(16, false);
                    cVar2.f14039f = m3.c.b(Beta.strNotificationClickToRetry);
                    cVar2.f14038e = m3.c.b(e.f4381b.B + " " + Beta.strNotificationDownloadError);
                } else {
                    if (this.task.getStatus() == 2) {
                        m3.c cVar3 = this.mBuilder;
                        String str = e.f4381b.B;
                        cVar3.getClass();
                        cVar3.f14038e = m3.c.b(str);
                        cVar3.f14039f = m3.c.b(String.format(Locale.getDefault(), "%s %d%%", Beta.strNotificationDownloading, Integer.valueOf((int) (this.task.getTotalLength() != 0 ? (this.task.getSavedLength() * 100) / this.task.getTotalLength() : 0L))));
                        cVar3.c(16, false);
                    } else if (this.task.getStatus() == 3) {
                        m3.c cVar4 = this.mBuilder;
                        String str2 = e.f4381b.B;
                        cVar4.getClass();
                        cVar4.f14038e = m3.c.b(str2);
                        cVar4.f14039f = m3.c.b(String.format(Locale.getDefault(), "%s %d%%", Beta.strNotificationClickToContinue, Integer.valueOf((int) (this.task.getTotalLength() != 0 ? (this.task.getSavedLength() * 100) / this.task.getTotalLength() : 0L))));
                        cVar4.c(16, false);
                    }
                }
                Notification notificationA = this.mBuilder.a();
                this.mNotification = notificationA;
                this.mManager.notify(NOTIFICATION_DOWNLOAD_ID, notificationA);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00bb A[Catch: all -> 0x0030, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x001d, B:15:0x003d, B:14:0x0033, B:16:0x0046, B:18:0x00bb, B:24:0x00d2, B:26:0x00d6, B:28:0x00e6, B:29:0x00fd, B:19:0x00c2, B:21:0x00c6, B:23:0x00ca, B:8:0x0024, B:10:0x002a), top: B:34:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c2 A[Catch: all -> 0x0030, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x001d, B:15:0x003d, B:14:0x0033, B:16:0x0046, B:18:0x00bb, B:24:0x00d2, B:26:0x00d6, B:28:0x00e6, B:29:0x00fd, B:19:0x00c2, B:21:0x00c6, B:23:0x00ca, B:8:0x0024, B:10:0x002a), top: B:34:0x0001, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void postUpgradeNotify(com.tencent.bugly.proguard.B r7, com.tencent.bugly.beta.ui.BaseFrag r8) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.beta.ui.BetaNotifyManager.postUpgradeNotify(com.tencent.bugly.proguard.B, com.tencent.bugly.beta.ui.BaseFrag):void");
    }
}
