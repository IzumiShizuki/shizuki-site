package com.tencent.bugly.beta.download;

import android.os.Build;
import android.util.Log;
import com.tencent.bugly.beta.global.ResBean;
import com.tencent.bugly.beta.global.e;
import com.tencent.bugly.beta.global.f;
import com.tencent.bugly.beta.tinker.TinkerManager;
import com.tencent.bugly.beta.ui.UpgradeDialog;
import com.tencent.bugly.beta.upgrade.BetaGrayStrategy;
import com.tencent.bugly.beta.upgrade.UpgradeStateListener;
import com.tencent.bugly.beta.upgrade.b;
import com.tencent.bugly.proguard.B;
import com.tencent.bugly.proguard.C0012p;
import com.tencent.bugly.proguard.X;
import com.tencent.bugly.proguard.r;
import com.tencent.bugly.proguard.z;
import java.io.File;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class a implements DownloadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f4365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object[] f4366b;

    public a(int i10, Object... objArr) {
        this.f4365a = i10;
        this.f4366b = objArr;
    }

    @Override // com.tencent.bugly.beta.download.DownloadListener
    public void onCompleted(DownloadTask downloadTask) throws Throwable {
        try {
            int i10 = this.f4365a;
            if (i10 == 1) {
                synchronized (this.f4366b[0]) {
                    try {
                        Map map = (Map) this.f4366b[1];
                        if (map.size() == 0) {
                            return;
                        }
                        Iterator it = map.values().iterator();
                        int i11 = 0;
                        while (it.hasNext()) {
                            if (((DownloadTask) it.next()).getStatus() == 1) {
                                i11++;
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(i11);
                        sb.append(" has completed");
                        X.a(sb.toString(), new Object[0]);
                        if (i11 < map.size()) {
                            return;
                        }
                        for (String str : map.keySet()) {
                            if (((DownloadTask) map.get(str)).getSaveFile() != null && ((DownloadTask) map.get(str)).getSaveFile().exists()) {
                                ResBean.f4369a.a(str, ((DownloadTask) map.get(str)).getSaveFile().getAbsolutePath());
                            }
                        }
                        com.tencent.bugly.beta.global.a.a("rb.bch", ResBean.f4369a);
                        f fVar = (f) this.f4366b[0];
                        fVar.a();
                        fVar.b();
                        return;
                    } finally {
                    }
                }
            }
            if (i10 == 2) {
                ((UpgradeDialog) this.f4366b[0]).updateBtn(downloadTask);
                return;
            }
            if (i10 != 3) {
                if (i10 != 4) {
                    return;
                }
                Object[] objArr = this.f4366b;
                r rVar = (r) objArr[0];
                Integer num = (Integer) objArr[1];
                BetaGrayStrategy betaGrayStrategy = rVar.f5078b;
                if (betaGrayStrategy == null || betaGrayStrategy.f4429a == null) {
                    return;
                }
                X.c("patch download success !!!", new Object[0]);
                File saveFile = downloadTask.getSaveFile();
                if (com.tencent.bugly.beta.global.a.a(saveFile, betaGrayStrategy.f4429a.f4830k.f5144b, "SHA")) {
                    this.f4366b[1] = 0;
                    if (!com.tencent.bugly.beta.global.a.a(saveFile, e.f4381b.J)) {
                        X.c("copy file failed", new Object[0]);
                        TinkerManager.getInstance().onDownloadFailure("copy file failure.");
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder("copy ");
                    sb2.append(saveFile.getAbsolutePath());
                    sb2.append(" to ");
                    sb2.append(e.f4381b.J.getAbsolutePath());
                    sb2.append(" success!");
                    X.a(sb2.toString(), new Object[0]);
                    if (rVar.f5079c != null) {
                        X.a("delete temp file", new Object[0]);
                        rVar.f5079c.delete(true);
                    }
                    com.tencent.bugly.beta.global.a.b("UPLOAD_PATCH_RESULT", false);
                    TinkerManager.getInstance().onDownloadSuccess(e.f4381b.J.getAbsolutePath(), e.f4381b.X);
                    return;
                }
                if (num.intValue() >= 2) {
                    this.f4366b[1] = 0;
                    onFailed(downloadTask, 2080, "file sha1 verify fail");
                    downloadTask.delete(true);
                    TinkerManager.getInstance().onDownloadFailure("retry download patch too many times.");
                    return;
                }
                this.f4366b[1] = Integer.valueOf(num.intValue() + 1);
                downloadTask.delete(true);
                e eVar = e.f4381b;
                DownloadTask downloadTaskA = eVar.f4404s.a(betaGrayStrategy.f4429a.f4830k.f5145c, eVar.f4408w.getAbsolutePath(), null, betaGrayStrategy.f4429a.f4830k.f5145c);
                rVar.f5079c = downloadTaskA;
                downloadTaskA.setDownloadType(3);
                rVar.f5079c.setNeededNotify(false);
                rVar.f5079c.addListener(this);
                BetaReceiver.addTask(rVar.f5079c);
                rVar.f5079c.download();
                return;
            }
            com.tencent.bugly.beta.upgrade.d dVar = (com.tencent.bugly.beta.upgrade.d) this.f4366b[0];
            BetaGrayStrategy betaGrayStrategy2 = dVar.f4442b;
            if (betaGrayStrategy2 != null && betaGrayStrategy2.f4429a != null) {
                UpgradeStateListener upgradeStateListener = dVar.f4446f;
                if (upgradeStateListener != null) {
                    com.tencent.bugly.beta.utils.e.a(new com.tencent.bugly.beta.global.d(18, upgradeStateListener, 3, Boolean.valueOf(dVar.f4447g)));
                }
                X.c("apk download completed", new Object[0]);
                long jCurrentTimeMillis = System.currentTimeMillis();
                long costTime = downloadTask.getCostTime();
                B b10 = betaGrayStrategy2.f4429a;
                z zVar = new z("download", jCurrentTimeMillis, (byte) 0, costTime, b10.f4829j, b10.f4837r, b10.f4840u, null);
                if (C0012p.f5037a.a(zVar)) {
                    b.f4440a.a(zVar, true);
                }
                if (e.f4381b.f4391fa) {
                    File saveFile2 = downloadTask.getSaveFile();
                    Integer num2 = (Integer) this.f4366b[1];
                    if (com.tencent.bugly.beta.global.a.a(e.f4381b.f4407v, saveFile2, betaGrayStrategy2.f4429a.f4830k.f5144b)) {
                        this.f4366b[1] = 0;
                        C0012p c0012p = C0012p.f5037a;
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        B b11 = betaGrayStrategy2.f4429a;
                        c0012p.a(new z("install", jCurrentTimeMillis2, (byte) 0, 0L, b11.f4829j, b11.f4837r, b11.f4840u, null));
                        return;
                    }
                    if (num2.intValue() >= 2) {
                        this.f4366b[1] = 0;
                        onFailed(downloadTask, 2080, "file md5 verify fail");
                        downloadTask.delete(true);
                        return;
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        this.f4366b[1] = 0;
                        onFailed(downloadTask, 2080, "安装失败，请检查您的App是否兼容7.0设备");
                        downloadTask.delete(true);
                        return;
                    }
                    this.f4366b[1] = Integer.valueOf(num2.intValue() + 1);
                    downloadTask.delete(true);
                    e eVar2 = e.f4381b;
                    DownloadTask downloadTaskA2 = eVar2.f4404s.a(betaGrayStrategy2.f4429a.f4830k.f5145c, eVar2.f4408w.getAbsolutePath(), null, betaGrayStrategy2.f4429a.f4830k.f5145c);
                    dVar.f4443c = downloadTaskA2;
                    downloadTaskA2.setDownloadType(1);
                    UpgradeDialog.instance.setUpgradeInfo(betaGrayStrategy2.f4429a, dVar.f4443c);
                    dVar.f4443c.addListener(this);
                    BetaReceiver.addTask(dVar.f4443c);
                    dVar.f4443c.download();
                }
            }
        } catch (Exception e10) {
            if (X.a(e10)) {
                return;
            }
            e10.printStackTrace();
        }
    }

    @Override // com.tencent.bugly.beta.download.DownloadListener
    public void onFailed(DownloadTask downloadTask, int i10, String str) {
        try {
            int i11 = this.f4365a;
            if (i11 == 1) {
                synchronized (this.f4366b[0]) {
                    f fVar = (f) this.f4366b[0];
                    fVar.a();
                    fVar.b();
                }
                return;
            }
            if (i11 == 2) {
                ((UpgradeDialog) this.f4366b[0]).updateBtn(downloadTask);
                return;
            }
            if (i11 == 3) {
                com.tencent.bugly.beta.upgrade.d dVar = (com.tencent.bugly.beta.upgrade.d) this.f4366b[0];
                if (downloadTask != null) {
                    C0012p c0012p = C0012p.f5037a;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long costTime = downloadTask.getCostTime();
                    B b10 = dVar.f4442b.f4429a;
                    c0012p.a(new z("download", jCurrentTimeMillis, (byte) 1, costTime, b10.f4829j, b10.f4837r, b10.f4840u, null));
                }
                X.b("upgrade failed：(%d)%s", Integer.valueOf(i10), str);
                Log.e(X.f4917b, "download fail, please try later");
                return;
            }
            if (i11 != 4) {
                return;
            }
            r rVar = (r) this.f4366b[0];
            if (downloadTask != null) {
                C0012p c0012p2 = C0012p.f5037a;
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                long costTime2 = downloadTask.getCostTime();
                B b11 = rVar.f5078b.f4429a;
                c0012p2.a(new z("download", jCurrentTimeMillis2, (byte) 1, costTime2, b11.f4829j, b11.f4837r, b11.f4840u, null));
            }
            X.b("hotfix download failed：(%d)%s", Integer.valueOf(i10), str);
            TinkerManager.getInstance().onDownloadFailure(str);
        } catch (Exception e10) {
            if (X.a(e10)) {
                return;
            }
            e10.printStackTrace();
        }
    }

    @Override // com.tencent.bugly.beta.download.DownloadListener
    public void onReceive(DownloadTask downloadTask) {
        if (this.f4365a != 2) {
            return;
        }
        ((UpgradeDialog) this.f4366b[0]).updateBtn(downloadTask);
    }
}
