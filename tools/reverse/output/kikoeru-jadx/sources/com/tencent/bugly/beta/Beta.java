package com.tencent.bugly.beta;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.a;
import com.tencent.bugly.beta.download.DownloadListener;
import com.tencent.bugly.beta.download.DownloadTask;
import com.tencent.bugly.beta.global.ResBean;
import com.tencent.bugly.beta.global.f;
import com.tencent.bugly.beta.interfaces.BetaPatchListener;
import com.tencent.bugly.beta.tinker.TinkerApplicationLike;
import com.tencent.bugly.beta.tinker.TinkerManager;
import com.tencent.bugly.beta.ui.UILifecycleListener;
import com.tencent.bugly.beta.ui.UpgradeDialog;
import com.tencent.bugly.beta.upgrade.ActiveListener;
import com.tencent.bugly.beta.upgrade.BetaGrayStrategy;
import com.tencent.bugly.beta.upgrade.UpgradeListener;
import com.tencent.bugly.beta.upgrade.UpgradeStateListener;
import com.tencent.bugly.beta.upgrade.d;
import com.tencent.bugly.beta.utils.e;
import com.tencent.bugly.proguard.B;
import com.tencent.bugly.proguard.C0012p;
import com.tencent.bugly.proguard.C0013t;
import com.tencent.bugly.proguard.C0015x;
import com.tencent.bugly.proguard.C0016y;
import com.tencent.bugly.proguard.H;
import com.tencent.bugly.proguard.W;
import com.tencent.bugly.proguard.X;
import com.tencent.bugly.proguard.ca;
import com.tencent.bugly.proguard.r;
import com.tencent.bugly.proguard.v;
import com.tencent.bugly.proguard.z;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class Beta extends a {
    public static final String TAG_CANCEL_BUTTON = "beta_cancel_button";
    public static final String TAG_CONFIRM_BUTTON = "beta_confirm_button";
    public static final String TAG_IMG_BANNER = "beta_upgrade_banner";
    public static final String TAG_TIP_MESSAGE = "beta_tip_message";
    public static final String TAG_TITLE = "beta_title";
    public static final String TAG_UPGRADE_FEATURE = "beta_upgrade_feature";
    public static final String TAG_UPGRADE_INFO = "beta_upgrade_info";
    public static ActiveListener activeListener = null;
    public static boolean autoCheckAppUpgrade = false;
    public static boolean autoCheckHotfix = false;
    public static boolean autoCheckUpgrade = true;
    public static boolean autoInit = true;
    public static BetaPatchListener betaPatchListener = null;
    public static int defaultBannerId = 0;
    public static DownloadListener downloadListener = null;
    public static long initDelay = 3000;
    public static String initProcessName = null;
    public static int largeIconId = 0;
    public static boolean showInterruptedStrategy = true;
    public static int smallIconId = 0;
    public static File storageDir = null;
    public static String strNetworkTipsCancelBtn = "取消";
    public static String strNetworkTipsConfirmBtn = "继续下载";
    public static String strNetworkTipsMessage = "你已切换到移动网络，是否继续当前下载？";
    public static String strNetworkTipsTitle = "网络提示";
    public static String strNotificationClickToContinue = "继续下载";
    public static String strNotificationClickToInstall = "点击安装";
    public static String strNotificationClickToRetry = "点击重试";
    public static String strNotificationClickToView = "点击查看";
    public static String strNotificationDownloadError = "下载失败";
    public static String strNotificationDownloadSucc = "下载完成";
    public static String strNotificationDownloading = "正在下载";
    public static String strNotificationHaveNewVersion = "有新版本";
    public static String strToastCheckUpgradeError = "检查新版本失败，请稍后重试";
    public static String strToastCheckingUpgrade = "正在检查，请稍候...";
    public static String strToastYourAreTheLatestVersion = "你已经是最新版了";
    public static String strUpgradeDialogCancelBtn = "下次再说";
    public static String strUpgradeDialogContinueBtn = "继续";
    public static String strUpgradeDialogFeatureLabel = "更新说明";
    public static String strUpgradeDialogFileSizeLabel = "包大小";
    public static String strUpgradeDialogInstallBtn = "安装";
    public static String strUpgradeDialogRetryBtn = "重试";
    public static String strUpgradeDialogUpdateTimeLabel = "更新时间";
    public static String strUpgradeDialogUpgradeBtn = "立即更新";
    public static String strUpgradeDialogVersionLabel = "版本";
    public static int tipsDialogLayoutId;
    public static long upgradeCheckPeriod;
    public static int upgradeDialogLayoutId;
    public static UILifecycleListener<UpgradeInfo> upgradeDialogLifecycleListener;
    public static UpgradeListener upgradeListener;
    public static UpgradeStateListener upgradeStateListener;
    public static List<Class<? extends Activity>> canShowUpgradeActs = Collections.synchronizedList(new ArrayList());
    public static List<Class<? extends Activity>> canNotShowUpgradeActs = Collections.synchronizedList(new ArrayList());
    public static boolean enableHotfix = false;
    public static boolean enableNotification = true;
    public static boolean autoDownloadOnWifi = false;
    public static boolean canShowApkInfo = true;
    public static boolean canAutoDownloadPatch = true;
    public static boolean canAutoPatch = true;
    public static String appVersionName = null;
    public static int appVersionCode = Integer.MIN_VALUE;
    public static String appChannel = null;
    public static boolean canNotifyUserRestart = false;
    public static List<String> soBlackList = Collections.synchronizedList(new ArrayList());
    public static boolean dialogFullScreen = false;
    public static boolean autoInstallApk = true;
    public static boolean autoDownloadOn4g = false;
    public static boolean setPatchRestartOnScreenOff = true;
    public static boolean enableActiveH5Alert = true;
    public static Beta instance = new Beta();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static DownloadTask f4353a = null;

    private static void a(boolean z10, boolean z11, int i10) {
        try {
            if (z10) {
                d.f4441a.a(z10, z11, i10);
                UpgradeStateListener upgradeStateListener2 = upgradeStateListener;
                if (upgradeStateListener2 != null) {
                    e.a(new com.tencent.bugly.beta.global.d(18, upgradeStateListener2, 2, Boolean.valueOf(z10)));
                    return;
                } else {
                    e.a(new com.tencent.bugly.beta.global.d(5, strToastCheckingUpgrade));
                    return;
                }
            }
            if (i10 != 0 && i10 != 1) {
                if (i10 == 3) {
                    r.f5077a.a(z10, z11, 3);
                    return;
                }
                return;
            }
            BetaGrayStrategy betaGrayStrategy = (BetaGrayStrategy) com.tencent.bugly.beta.global.a.a("app.upgrade.strategy.bch", BetaGrayStrategy.CREATOR);
            if (betaGrayStrategy == null || betaGrayStrategy.f4429a == null || System.currentTimeMillis() - betaGrayStrategy.f4433e > com.tencent.bugly.beta.global.e.f4381b.f4386d) {
                d.f4441a.a(z10, z11, i10);
            } else {
                d.f4441a.a(z10, z11, 0, null, "");
            }
        } catch (Exception e10) {
            if (X.a(e10)) {
                return;
            }
            e10.printStackTrace();
        }
    }

    public static void applyDownloadedPatch() throws Throwable {
        if (new File(com.tencent.bugly.beta.global.e.f4381b.J.getAbsolutePath()).exists()) {
            TinkerManager.getInstance().applyPatch(com.tencent.bugly.beta.global.e.f4381b.J.getAbsolutePath(), true);
        } else {
            X.b(Beta.class, "[applyDownloadedPatch] patch file not exist", new Object[0]);
        }
    }

    public static void applyTinkerPatch(Context context, String str) {
        TinkerManager.getInstance().applyPatch(context, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void cancelDownload() {
        /*
            com.tencent.bugly.beta.upgrade.d r0 = com.tencent.bugly.beta.upgrade.d.f4441a
            com.tencent.bugly.beta.global.d r1 = r0.f4450j
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L25
            java.lang.Object[] r1 = r1.f4379b
            r5 = r1[r4]
            com.tencent.bugly.beta.download.DownloadTask r6 = r0.f4443c
            if (r5 != r6) goto L25
            r5 = r1[r3]
            com.tencent.bugly.beta.upgrade.BetaGrayStrategy r0 = r0.f4442b
            if (r5 != r0) goto L25
            r0 = r1[r2]
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            com.tencent.bugly.beta.upgrade.d r1 = com.tencent.bugly.beta.upgrade.d.f4441a
            boolean r1 = r1.f4447g
            if (r0 == r1) goto L43
        L25:
            com.tencent.bugly.beta.upgrade.d r0 = com.tencent.bugly.beta.upgrade.d.f4441a
            com.tencent.bugly.beta.global.d r1 = new com.tencent.bugly.beta.global.d
            com.tencent.bugly.beta.download.DownloadTask r5 = r0.f4443c
            com.tencent.bugly.beta.upgrade.BetaGrayStrategy r6 = r0.f4442b
            boolean r7 = r0.f4447g
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r4] = r5
            r8[r3] = r6
            r8[r2] = r7
            r2 = 14
            r1.<init>(r2, r8)
            r0.f4450j = r1
        L43:
            com.tencent.bugly.beta.upgrade.d r0 = com.tencent.bugly.beta.upgrade.d.f4441a
            com.tencent.bugly.beta.global.d r0 = r0.f4450j
            r0.run()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.beta.Beta.cancelDownload():void");
    }

    public static void checkAppUpgrade() {
        a(true, false, 1);
    }

    public static void checkHotFix() {
        a(false, false, 3);
    }

    public static void checkUpgrade() {
        checkUpgrade(true, false);
    }

    public static void cleanTinkerPatch(boolean z10) {
        com.tencent.bugly.beta.global.a.b("IS_PATCH_ROLL_BACK", false);
        TinkerManager.getInstance().cleanPatch(z10);
    }

    public static void downloadPatch() {
        r rVar = r.f5077a;
        rVar.f5078b = rVar.a((B) null);
        try {
            r rVar2 = r.f5077a;
            BetaGrayStrategy betaGrayStrategy = rVar2.f5078b;
            if (betaGrayStrategy != null) {
                rVar2.a(0, betaGrayStrategy.f4429a, true);
            }
        } catch (Exception unused) {
        }
    }

    public static UpgradeInfo getAppUpgradeInfo() {
        try {
            d.f4441a.f4442b = (BetaGrayStrategy) com.tencent.bugly.beta.global.a.a("app.upgrade.strategy.bch", BetaGrayStrategy.CREATOR);
            BetaGrayStrategy betaGrayStrategy = d.f4441a.f4442b;
            if (betaGrayStrategy != null) {
                return new UpgradeInfo(betaGrayStrategy.f4429a);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static UpgradeInfo getHotfixUpgradeInfo() {
        try {
            r.f5077a.f5078b = (BetaGrayStrategy) com.tencent.bugly.beta.global.a.a("hotfix.strategy.bch", BetaGrayStrategy.CREATOR);
            BetaGrayStrategy betaGrayStrategy = r.f5077a.f5078b;
            if (betaGrayStrategy != null) {
                return new UpgradeInfo(betaGrayStrategy.f4429a);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static Beta getInstance() {
        Beta beta = instance;
        beta.f4347id = 1002;
        beta.version = "1.5.23";
        beta.versionKey = "G10";
        return beta;
    }

    public static DownloadTask getStrategyTask() {
        if (f4353a == null) {
            d.f4441a.f4442b = (BetaGrayStrategy) com.tencent.bugly.beta.global.a.a("app.upgrade.strategy.bch", BetaGrayStrategy.CREATOR);
            if (d.f4441a.f4442b != null) {
                DownloadTask downloadTaskA = com.tencent.bugly.beta.global.e.f4381b.f4404s.a(d.f4441a.f4442b.f4429a.f4830k.f5145c, com.tencent.bugly.beta.global.e.f4381b.f4408w.getAbsolutePath(), null, d.f4441a.f4442b.f4429a.f4830k.f5144b);
                f4353a = downloadTaskA;
                downloadTaskA.setDownloadType(1);
                d.f4441a.f4443c = f4353a;
            }
        }
        return d.f4441a.f4443c;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003b A[Catch: Exception -> 0x0043, TRY_LEAVE, TryCatch #0 {Exception -> 0x0043, blocks: (B:3:0x0003, B:5:0x000d, B:7:0x0015, B:10:0x001b, B:12:0x001f, B:26:0x003b, B:16:0x002a, B:20:0x0031), top: B:30:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.tencent.bugly.beta.UpgradeInfo getUpgradeInfo() {
        /*
            java.lang.String r0 = "hotfix.strategy.bch"
            r1 = 0
            android.os.Parcelable$Creator<com.tencent.bugly.beta.upgrade.BetaGrayStrategy> r2 = com.tencent.bugly.beta.upgrade.BetaGrayStrategy.CREATOR     // Catch: java.lang.Exception -> L43
            android.os.Parcelable r0 = com.tencent.bugly.beta.global.a.a(r0, r2)     // Catch: java.lang.Exception -> L43
            com.tencent.bugly.beta.upgrade.BetaGrayStrategy r0 = (com.tencent.bugly.beta.upgrade.BetaGrayStrategy) r0     // Catch: java.lang.Exception -> L43
            java.lang.String r3 = "app.upgrade.strategy.bch"
            android.os.Parcelable r2 = com.tencent.bugly.beta.global.a.a(r3, r2)     // Catch: java.lang.Exception -> L43
            com.tencent.bugly.beta.upgrade.BetaGrayStrategy r2 = (com.tencent.bugly.beta.upgrade.BetaGrayStrategy) r2     // Catch: java.lang.Exception -> L43
            if (r0 == 0) goto L28
            com.tencent.bugly.proguard.B r3 = r0.f4429a     // Catch: java.lang.Exception -> L43
            if (r3 == 0) goto L28
            if (r2 == 0) goto L28
            com.tencent.bugly.proguard.B r3 = r2.f4429a     // Catch: java.lang.Exception -> L43
            if (r3 == 0) goto L28
            long r3 = r0.f4433e     // Catch: java.lang.Exception -> L43
            long r5 = r2.f4433e     // Catch: java.lang.Exception -> L43
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L38
            goto L39
        L28:
            if (r0 == 0) goto L38
            com.tencent.bugly.proguard.B r3 = r0.f4429a     // Catch: java.lang.Exception -> L43
            if (r3 != 0) goto L2f
            goto L38
        L2f:
            if (r2 == 0) goto L39
            com.tencent.bugly.proguard.B r2 = r2.f4429a     // Catch: java.lang.Exception -> L43
            if (r2 != 0) goto L36
            goto L39
        L36:
            r0 = r1
            goto L39
        L38:
            r0 = r2
        L39:
            if (r0 == 0) goto L43
            com.tencent.bugly.beta.UpgradeInfo r2 = new com.tencent.bugly.beta.UpgradeInfo     // Catch: java.lang.Exception -> L43
            com.tencent.bugly.proguard.B r0 = r0.f4429a     // Catch: java.lang.Exception -> L43
            r2.<init>(r0)     // Catch: java.lang.Exception -> L43
            return r2
        L43:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.beta.Beta.getUpgradeInfo():com.tencent.bugly.beta.UpgradeInfo");
    }

    public static synchronized B getUpgradeStrategy() {
        d.f4441a.f4442b = (BetaGrayStrategy) com.tencent.bugly.beta.global.a.a("app.upgrade.strategy.bch", BetaGrayStrategy.CREATOR);
        try {
            BetaGrayStrategy betaGrayStrategy = d.f4441a.f4442b;
            if (betaGrayStrategy != null) {
                return (B) betaGrayStrategy.f4429a.clone();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static synchronized void init(Context context, boolean z10) {
        try {
            X.c("Beta init start....", new Object[0]);
            H hA = H.a();
            int i10 = instance.f4347id;
            int i11 = com.tencent.bugly.beta.global.e.f4380a + 1;
            com.tencent.bugly.beta.global.e.f4380a = i11;
            hA.a(i10, i11);
            if (TextUtils.isEmpty(initProcessName)) {
                initProcessName = context.getPackageName();
            }
            X.c("Beta will init at: %s", initProcessName);
            String str = com.tencent.bugly.crashreport.common.info.a.m().f4576h;
            X.c("current process: %s", str);
            if (TextUtils.equals(initProcessName, str)) {
                com.tencent.bugly.beta.global.e eVar = com.tencent.bugly.beta.global.e.f4381b;
                if (!TextUtils.isEmpty(eVar.f4410y)) {
                    X.e("Beta has been initialized [apkMD5 : %s]", eVar.f4410y);
                    return;
                }
                X.c("current upgrade sdk version:1.5.23", new Object[0]);
                eVar.G = z10;
                long j10 = upgradeCheckPeriod;
                if (j10 < 0) {
                    X.e("upgradeCheckPeriod cannot be negative", new Object[0]);
                } else {
                    eVar.f4386d = j10;
                    X.c("setted upgradeCheckPeriod: %d", Long.valueOf(j10));
                }
                long j11 = initDelay;
                if (j11 < 0) {
                    X.e("initDelay cannot be negative", new Object[0]);
                } else {
                    eVar.f4384c = j11;
                    X.c("setted initDelay: %d", Long.valueOf(j11));
                }
                if (smallIconId != 0) {
                    try {
                        if (context.getResources().getDrawable(smallIconId) != null) {
                            int i12 = smallIconId;
                            eVar.f4394i = i12;
                            X.c("setted smallIconId: %d", Integer.valueOf(i12));
                        }
                    } catch (Exception e10) {
                        X.b("smallIconId is not available:\n %s", e10.toString());
                    }
                }
                if (largeIconId != 0) {
                    try {
                        if (context.getResources().getDrawable(largeIconId) != null) {
                            int i13 = largeIconId;
                            eVar.f4395j = i13;
                            X.c("setted largeIconId: %d", Integer.valueOf(i13));
                        }
                    } catch (Exception e11) {
                        X.b("largeIconId is not available:\n %s", e11.toString());
                    }
                }
                if (defaultBannerId != 0) {
                    try {
                        if (context.getResources().getDrawable(defaultBannerId) != null) {
                            int i14 = defaultBannerId;
                            eVar.f4396k = i14;
                            X.c("setted defaultBannerId: %d", Integer.valueOf(i14));
                        }
                    } catch (Exception e12) {
                        X.b("defaultBannerId is not available:\n %s", e12.toString());
                    }
                }
                if (upgradeDialogLayoutId != 0) {
                    try {
                        XmlResourceParser layout = context.getResources().getLayout(upgradeDialogLayoutId);
                        if (layout != null) {
                            int i15 = upgradeDialogLayoutId;
                            eVar.f4397l = i15;
                            X.c("setted upgradeDialogLayoutId: %d", Integer.valueOf(i15));
                            layout.close();
                        }
                    } catch (Exception e13) {
                        X.b("upgradeDialogLayoutId is not available:\n %s", e13.toString());
                    }
                }
                if (tipsDialogLayoutId != 0) {
                    try {
                        XmlResourceParser layout2 = context.getResources().getLayout(tipsDialogLayoutId);
                        if (layout2 != null) {
                            int i16 = tipsDialogLayoutId;
                            eVar.f4398m = i16;
                            X.c("setted tipsDialogLayoutId: %d", Integer.valueOf(i16));
                            layout2.close();
                        }
                    } catch (Exception e14) {
                        X.b("tipsDialogLayoutId is not available:\n %s", e14.toString());
                    }
                }
                UILifecycleListener<UpgradeInfo> uILifecycleListener = upgradeDialogLifecycleListener;
                if (uILifecycleListener != null) {
                    try {
                        eVar.f4399n = uILifecycleListener;
                        X.c("setted upgradeDialogLifecycleListener:%s" + upgradeDialogLifecycleListener, new Object[0]);
                    } catch (Exception e15) {
                        X.b("upgradeDialogLifecycleListener is not available:\n %", e15.toString());
                    }
                }
                List<Class<? extends Activity>> list = canShowUpgradeActs;
                if (list != null && !list.isEmpty()) {
                    for (Class<? extends Activity> cls : canShowUpgradeActs) {
                        if (cls != null) {
                            eVar.f4401p.add(cls);
                        }
                    }
                    X.c("setted canShowUpgradeActs: %s", eVar.f4401p);
                }
                List<Class<? extends Activity>> list2 = canNotShowUpgradeActs;
                if (list2 != null && !list2.isEmpty()) {
                    for (Class<? extends Activity> cls2 : canNotShowUpgradeActs) {
                        if (cls2 != null) {
                            eVar.f4402q.add(cls2);
                        }
                    }
                    X.c("setted canNotShowUpgradeActs: %s", eVar.f4402q);
                }
                boolean z11 = autoCheckUpgrade;
                eVar.f4388e = z11;
                eVar.f4390f = autoCheckAppUpgrade;
                eVar.f4392g = autoCheckHotfix;
                X.c("autoCheckUpgrade %s", z11 ? "is opened" : "is closed");
                X.c("autoCheckAppUpgrade %s", eVar.f4390f ? "is opened" : "is closed");
                X.c("autoCheckHotfix %s", eVar.f4392g ? "is opened" : "is closed");
                boolean z12 = autoInstallApk;
                eVar.f4391fa = z12;
                X.c("autoInstallApk %s", z12 ? "is opened" : "is closed");
                boolean z13 = autoDownloadOn4g;
                eVar.V = z13;
                X.c("autoDownloadOn4g %s", z13 ? "is opened" : "is closed");
                boolean z14 = showInterruptedStrategy;
                eVar.f4393h = z14;
                X.c("showInterruptedStrategy %s", z14 ? "is opened" : "is closed");
                X.c("isDIY %s", upgradeListener != null ? "is opened" : "is closed");
                File file = storageDir;
                if (file != null) {
                    if (file.exists() || storageDir.mkdirs()) {
                        File file2 = storageDir;
                        eVar.f4400o = file2;
                        X.c("setted storageDir: %s", file2.getAbsolutePath());
                    } else {
                        X.c("storageDir is not exists: %s", storageDir.getAbsolutePath());
                    }
                }
                if (eVar.f4404s == null) {
                    eVar.f4404s = v.f5137a;
                }
                if (TextUtils.isEmpty(eVar.f4409x)) {
                    eVar.f4409x = com.tencent.bugly.crashreport.common.info.a.m().e();
                }
                eVar.T = enableNotification;
                X.c("enableNotification %s", enableNotification + "");
                eVar.U = autoDownloadOnWifi;
                X.c("autoDownloadOnWifi %s", autoDownloadOnWifi + "");
                eVar.W = canShowApkInfo;
                X.c("canShowApkInfo %s", canShowApkInfo + "");
                eVar.X = canAutoPatch;
                X.c("canAutoPatch %s", canAutoPatch + "");
                eVar.Y = betaPatchListener;
                eVar.A = appVersionName;
                eVar.f4411z = appVersionCode;
                eVar.Z = canNotifyUserRestart;
                X.c("canNotifyUserRestart %s", canNotifyUserRestart + "");
                eVar.f4382aa = canAutoDownloadPatch;
                X.c("canAutoDownloadPatch %s", canAutoDownloadPatch + "");
                eVar.f4383ba = enableHotfix;
                X.c("enableHotfix %s", enableHotfix + "");
                List<String> list3 = soBlackList;
                if (list3 != null && !list3.isEmpty()) {
                    for (String str2 : soBlackList) {
                        if (str2 != null) {
                            eVar.f4385ca.add(str2);
                        }
                    }
                    X.c("setted soBlackList: %s", eVar.f4385ca);
                }
                String str3 = appChannel;
                if (str3 != null) {
                    eVar.R = str3;
                    X.c("Beta channel %s", str3);
                }
                eVar.a(context);
                ResBean resBean = (ResBean) com.tencent.bugly.beta.global.a.a("rb.bch", ResBean.CREATOR);
                ResBean.f4369a = resBean;
                if (resBean == null) {
                    ResBean.f4369a = new ResBean();
                }
                d dVar = d.f4441a;
                dVar.f4445e = upgradeListener;
                dVar.f4446f = upgradeStateListener;
                dVar.f4444d = downloadListener;
                if (getStrategyTask() != null && downloadListener != null) {
                    getStrategyTask().addListener(d.f4441a.f4444d);
                }
                if (enableHotfix) {
                    X.c("enableHotfix %s", "1");
                    ca.c("D4", "1");
                    C0013t.a(context);
                }
                Resources resources = context.getResources();
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                Configuration configuration = resources.getConfiguration();
                Locale locale = Locale.getDefault();
                configuration.locale = locale;
                if (locale.equals(Locale.US) || configuration.locale.equals(Locale.ENGLISH)) {
                    strToastYourAreTheLatestVersion = context.getResources().getString(R.string.strToastYourAreTheLatestVersion);
                    strToastCheckUpgradeError = context.getResources().getString(R.string.strToastCheckUpgradeError);
                    strToastCheckingUpgrade = context.getResources().getString(R.string.strToastCheckingUpgrade);
                    strNotificationDownloading = context.getResources().getString(R.string.strNotificationDownloading);
                    strNotificationClickToView = context.getResources().getString(R.string.strNotificationClickToView);
                    strNotificationClickToInstall = context.getResources().getString(R.string.strNotificationClickToInstall);
                    strNotificationClickToContinue = context.getResources().getString(R.string.strNotificationClickToContinue);
                    strNotificationClickToRetry = context.getResources().getString(R.string.strNotificationClickToRetry);
                    strNotificationDownloadSucc = context.getResources().getString(R.string.strNotificationDownloadSucc);
                    strNotificationDownloadError = context.getResources().getString(R.string.strNotificationDownloadError);
                    strNotificationHaveNewVersion = context.getResources().getString(R.string.strNotificationHaveNewVersion);
                    strNetworkTipsMessage = context.getResources().getString(R.string.strNetworkTipsMessage);
                    strNetworkTipsTitle = context.getResources().getString(R.string.strNetworkTipsTitle);
                    strNetworkTipsConfirmBtn = context.getResources().getString(R.string.strNetworkTipsConfirmBtn);
                    strNetworkTipsCancelBtn = context.getResources().getString(R.string.strNetworkTipsCancelBtn);
                    strUpgradeDialogVersionLabel = context.getResources().getString(R.string.strUpgradeDialogVersionLabel);
                    strUpgradeDialogFileSizeLabel = context.getResources().getString(R.string.strUpgradeDialogFileSizeLabel);
                    strUpgradeDialogUpdateTimeLabel = context.getResources().getString(R.string.strUpgradeDialogUpdateTimeLabel);
                    strUpgradeDialogFeatureLabel = context.getResources().getString(R.string.strUpgradeDialogFeatureLabel);
                    strUpgradeDialogUpgradeBtn = context.getResources().getString(R.string.strUpgradeDialogUpgradeBtn);
                    strUpgradeDialogInstallBtn = context.getResources().getString(R.string.strUpgradeDialogInstallBtn);
                    strUpgradeDialogRetryBtn = context.getResources().getString(R.string.strUpgradeDialogRetryBtn);
                    strUpgradeDialogContinueBtn = context.getResources().getString(R.string.strUpgradeDialogContinueBtn);
                    strUpgradeDialogCancelBtn = context.getResources().getString(R.string.strUpgradeDialogCancelBtn);
                }
                resources.updateConfiguration(configuration, displayMetrics);
                W.c().a(new com.tencent.bugly.beta.global.d(1, new Object[0]), eVar.f4384c);
                H hA2 = H.a();
                int i17 = instance.f4347id;
                int i18 = com.tencent.bugly.beta.global.e.f4380a - 1;
                com.tencent.bugly.beta.global.e.f4380a = i18;
                hA2.a(i17, i18);
                X.c("Beta init finished...", new Object[0]);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static synchronized void installApk(File file) {
        B upgradeStrategy;
        try {
            upgradeStrategy = getUpgradeStrategy();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (upgradeStrategy != null && com.tencent.bugly.beta.global.a.a(com.tencent.bugly.beta.global.e.f4381b.f4407v, file, upgradeStrategy.f4830k.f5144b)) {
            C0012p.f5037a.a(new z("install", System.currentTimeMillis(), (byte) 0, 0L, upgradeStrategy.f4829j, upgradeStrategy.f4837r, upgradeStrategy.f4840u, null));
        }
    }

    public static void installTinker() {
        enableHotfix = true;
        installTinker(TinkerApplicationLike.getTinkerPatchApplicationLike());
    }

    public static void loadArmLibrary(Context context, String str) {
        TinkerManager.loadArmLibrary(context, str);
    }

    public static void loadArmV7Library(Context context, String str) {
        TinkerManager.loadArmV7Library(context, str);
    }

    public static void loadLibrary(String str) {
        boolean zLoadLibraryFromTinker;
        com.tencent.bugly.beta.global.e eVar = com.tencent.bugly.beta.global.e.f4381b;
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    if (!com.tencent.bugly.beta.global.a.a("LoadSoFileResult", true)) {
                        System.loadLibrary(str);
                        com.tencent.bugly.beta.global.a.b("IS_PATCH_ROLL_BACK", true);
                        cleanTinkerPatch(true);
                        return;
                    }
                    com.tencent.bugly.beta.global.a.b("LoadSoFileResult", false);
                    String strA = com.tencent.bugly.beta.global.a.a(str, "");
                    boolean zA = com.tencent.bugly.beta.global.a.a("PatchResult", false);
                    if (TextUtils.isEmpty(strA) || !zA) {
                        zLoadLibraryFromTinker = false;
                    } else {
                        zLoadLibraryFromTinker = TinkerManager.loadLibraryFromTinker(eVar.f4407v, "lib/" + strA, str);
                    }
                    if (!zLoadLibraryFromTinker) {
                        System.loadLibrary(str);
                    }
                    com.tencent.bugly.beta.global.a.b("LoadSoFileResult", true);
                    return;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                com.tencent.bugly.beta.global.a.b("LoadSoFileResult", false);
                return;
            }
        }
        X.b("libName is invalid", new Object[0]);
    }

    public static void loadLibraryFromTinker(Context context, String str, String str2) {
        TinkerManager.loadLibraryFromTinker(context, str, str2);
    }

    public static synchronized void onUpgradeReceived(String str, int i10, String str2, long j10, int i11, int i12, String str3, String str4, long j11, String str5, String str6, int i13, int i14, long j12, String str7, boolean z10, boolean z11, int i15, String str8, long j13) {
        try {
            HashMap map = new HashMap();
            map.put("IMG_title", str6);
            map.put("VAL_style", String.valueOf(i13));
            d.f4441a.a(z10, z11, i15, new B(str, str2, j10, 0, new C0016y(com.tencent.bugly.beta.global.e.f4381b.f4409x, (byte) 1, i12, str3, i11, "", 1L, "", str5, "", ""), new C0015x(str5, str4, "", j11, ""), (byte) i10, i14, j12, null, "", map, str7, 1, j13, 1), str8 == null ? "" : str8);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static void registerDownloadListener(DownloadListener downloadListener2) {
        DownloadTask downloadTask;
        com.tencent.bugly.beta.global.e.f4381b.f4405t = downloadListener2;
        if (downloadListener2 == null || (downloadTask = d.f4441a.f4443c) == null) {
            return;
        }
        downloadTask.addListener(downloadListener2);
    }

    public static synchronized void saveInstallEvent(boolean z10) {
        B upgradeStrategy;
        try {
            upgradeStrategy = getUpgradeStrategy();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (upgradeStrategy != null && z10) {
            C0012p.f5037a.a(new z("install", System.currentTimeMillis(), (byte) 0, 0L, upgradeStrategy.f4829j, upgradeStrategy.f4837r, upgradeStrategy.f4840u, null));
            X.c("安装事件保存成功", new Object[0]);
        }
    }

    public static synchronized void showUpgradeDialog(String str, int i10, String str2, long j10, int i11, int i12, String str3, String str4, long j11, String str5, String str6, int i13, DownloadListener downloadListener2, Runnable runnable, Runnable runnable2, boolean z10) {
        try {
            HashMap map = new HashMap();
            map.put("IMG_title", str6);
            map.put("VAL_style", String.valueOf(i13));
            B b10 = new B(str, str2, j10, 0, new C0016y(com.tencent.bugly.beta.global.e.f4381b.f4409x, (byte) 1, i12, str3, i11, "", 1L, "", str5, "1.5.23", ""), new C0015x(str5, str4, "", j11, ""), (byte) i10, 0, 0L, null, "", map, null, 1, System.currentTimeMillis(), 1);
            DownloadTask downloadTask = f4353a;
            if (downloadTask != null && !downloadTask.getDownloadUrl().equals(str4)) {
                f4353a.delete(true);
                f4353a = null;
            }
            if (f4353a == null) {
                com.tencent.bugly.beta.global.e eVar = com.tencent.bugly.beta.global.e.f4381b;
                DownloadTask downloadTaskA = eVar.f4404s.a(b10.f4830k.f5145c, eVar.f4408w.getAbsolutePath(), null, b10.f4830k.f5144b);
                f4353a = downloadTaskA;
                downloadTaskA.setDownloadType(1);
            }
            f4353a.addListener(downloadListener2);
            UpgradeDialog.instance.setUpgradeInfo(b10, f4353a);
            UpgradeDialog upgradeDialog = UpgradeDialog.instance;
            upgradeDialog.upgradeRunnable = runnable;
            upgradeDialog.cancelRunnable = runnable2;
            f.f4412a.a(com.tencent.bugly.beta.global.e.f4381b.f4404s, b10.f4836q);
            if (z10) {
                f.f4412a.a(new com.tencent.bugly.beta.global.d(2, UpgradeDialog.instance, Boolean.valueOf(b10.f4831l == 2)), 3000);
            } else {
                f.f4412a.a(new com.tencent.bugly.beta.global.d(2, UpgradeDialog.instance, Boolean.valueOf(b10.f4831l == 2)));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static DownloadTask startDownload() {
        d dVar = d.f4441a;
        com.tencent.bugly.beta.global.d dVar2 = dVar.f4449i;
        if (dVar2 == null || dVar2.f4379b[0] != dVar.f4443c) {
            dVar.f4449i = new com.tencent.bugly.beta.global.d(13, dVar.f4443c, dVar.f4442b);
        }
        d.f4441a.f4449i.run();
        return d.f4441a.f4443c;
    }

    public static void unInit() {
        if (com.tencent.bugly.beta.global.a.a("IS_PATCH_ROLL_BACK", false)) {
            com.tencent.bugly.beta.global.a.b("IS_PATCH_ROLL_BACK", false);
            TinkerManager.getInstance().cleanPatch(true);
        }
    }

    public static void unregisterDownloadListener() {
        DownloadTask downloadTask = d.f4441a.f4443c;
        if (downloadTask != null) {
            downloadTask.removeListener(com.tencent.bugly.beta.global.e.f4381b.f4405t);
        }
        com.tencent.bugly.beta.global.e.f4381b.f4405t = null;
    }

    @Override // com.tencent.bugly.a
    public String[] getTables() {
        return new String[]{"dl_1002", "ge_1002", "st_1002"};
    }

    @Override // com.tencent.bugly.a
    public void onDbUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        int i12;
        String str;
        Cursor cursorQuery;
        String str2 = " , ";
        int i13 = i10;
        while (i13 < i11) {
            if (i13 != 10) {
                i12 = i13;
                str = str2;
            } else {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.setLength(0);
                    sb.append(" CREATE TABLE  IF NOT EXISTS ");
                    sb.append("st_1002");
                    sb.append(" ( ");
                    sb.append("_id");
                    sb.append(" ");
                    sb.append("integer");
                    sb.append(str2);
                    sb.append("_tp");
                    sb.append(" ");
                    sb.append("text");
                    sb.append(str2);
                    sb.append("_tm");
                    sb.append(" ");
                    sb.append("int");
                    sb.append(str2);
                    sb.append("_dt");
                    sb.append(" ");
                    sb.append("blob");
                    sb.append(",primary key(");
                    sb.append("_id");
                    sb.append(",");
                    sb.append("_tp");
                    sb.append(" )) ");
                    X.a("create %s", sb.toString());
                    sQLiteDatabase.execSQL(sb.toString());
                } catch (Throwable th2) {
                    if (!X.a(th2)) {
                        th2.printStackTrace();
                    }
                }
                i12 = i13;
                str = str2;
                try {
                    cursorQuery = sQLiteDatabase.query("t_pf", null, "_id = 1002", null, null, null, null);
                    if (cursorQuery == null) {
                        if (cursorQuery != null) {
                            return;
                        } else {
                            return;
                        }
                    }
                    while (cursorQuery.moveToNext()) {
                        try {
                            ContentValues contentValues = new ContentValues();
                            if (cursorQuery.getLong(cursorQuery.getColumnIndex("_id")) > 0) {
                                contentValues.put("_id", Long.valueOf(cursorQuery.getLong(cursorQuery.getColumnIndex("_id"))));
                            }
                            contentValues.put("_tm", Long.valueOf(cursorQuery.getLong(cursorQuery.getColumnIndex("_tm"))));
                            contentValues.put("_tp", cursorQuery.getString(cursorQuery.getColumnIndex("_tp")));
                            contentValues.put("_dt", cursorQuery.getBlob(cursorQuery.getColumnIndex("_dt")));
                            sQLiteDatabase.replace("st_1002", null, contentValues);
                        } catch (Throwable th3) {
                            th = th3;
                            try {
                                if (!X.a(th)) {
                                    th.printStackTrace();
                                }
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                            } finally {
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                            }
                        }
                    }
                    cursorQuery.close();
                } catch (Throwable th4) {
                    th = th4;
                    cursorQuery = null;
                }
            }
            i13 = i12 + 1;
            str2 = str;
        }
    }

    public static void checkAppUpgrade(boolean z10, boolean z11) {
        a(z10, z11, 1);
    }

    public static void checkUpgrade(boolean z10, boolean z11) {
        a(z10, z11, 0);
    }

    public static void installTinker(Object obj) {
        enableHotfix = true;
        TinkerManager.setPatchRestartOnScreenOff(setPatchRestartOnScreenOff);
        X.c("setPatchRestartOnScreenOff %s", setPatchRestartOnScreenOff + "");
        TinkerManager.installTinker(obj);
    }

    public static void installTinker(Object obj, Object obj2, Object obj3, Object obj4, TinkerManager.TinkerPatchResultListener tinkerPatchResultListener, Object obj5) {
        enableHotfix = true;
        TinkerManager.installTinker(obj, obj2, obj3, obj4, tinkerPatchResultListener, obj5);
    }

    @Override // com.tencent.bugly.a
    public void onDbDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    @Override // com.tencent.bugly.a
    public synchronized void init(Context context, boolean z10, BuglyStrategy buglyStrategy) {
        com.tencent.bugly.crashreport.common.info.a.m().a("G10", "1.5.23");
        if (autoInit) {
            init(context, z10);
        }
    }
}
