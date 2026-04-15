package com.tencent.bugly.beta.download;

import com.tencent.bugly.beta.global.e;
import com.tencent.bugly.beta.ui.NetNotifyDialog;
import com.tencent.bugly.beta.ui.UiManager;
import com.tencent.bugly.crashreport.common.info.b;
import com.tencent.bugly.proguard.A;
import com.tencent.bugly.proguard.C0012p;
import com.tencent.bugly.proguard.X;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f4367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object[] f4368b;

    public d(int i10, Object... objArr) {
        this.f4367a = i10;
        this.f4368b = objArr;
    }

    public synchronized void a(int i10, int i11) {
        try {
            int i12 = this.f4367a;
            if (i12 != 1) {
                if (i12 == 2) {
                    Object[] objArr = this.f4368b;
                    DownloadTask downloadTask = (DownloadTask) objArr[0];
                    NetNotifyDialog netNotifyDialog = (NetNotifyDialog) objArr[2];
                    if (i11 == 1) {
                        downloadTask.download();
                        X.a("continue download", new Object[0]);
                        this.f4368b[1] = Boolean.FALSE;
                        netNotifyDialog.close();
                    } else if (i10 == 1 || ((Boolean) objArr[1]).booleanValue()) {
                        e eVar = e.f4381b;
                        if (!eVar.U && !eVar.V) {
                            downloadTask.stop();
                            X.a("wifi network change to mobile network, stop download", new Object[0]);
                            this.f4368b[1] = Boolean.TRUE;
                            if (b.c(e.f4381b.f4407v) != null) {
                                UiManager.show(netNotifyDialog, true);
                                this.f4368b[1] = Boolean.FALSE;
                            }
                        }
                    }
                }
            } else if (i11 == 1 || i11 == 3 || i11 == 4) {
                ArrayList arrayList = (ArrayList) C0012p.f5037a.b();
                if (arrayList != null && !arrayList.isEmpty()) {
                    com.tencent.bugly.beta.upgrade.b.f4440a.a(new A(arrayList), true);
                }
            }
        } catch (Exception e10) {
            if (!X.a(e10)) {
                e10.printStackTrace();
            }
        } finally {
        }
    }
}
