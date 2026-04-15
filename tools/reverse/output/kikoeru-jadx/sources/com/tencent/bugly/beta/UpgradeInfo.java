package com.tencent.bugly.beta;

import com.tencent.bugly.proguard.B;
import com.tencent.bugly.proguard.C0015x;
import com.tencent.bugly.proguard.C0016y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class UpgradeInfo {
    public String apkMd5;
    public String apkUrl;
    public long fileSize;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public String f4354id;
    public String imageUrl;
    public String newFeature;
    public long popInterval;
    public int popTimes;
    public long publishTime;
    public int publishType;
    public String title;
    public int updateType;
    public int upgradeType;
    public int versionCode;
    public String versionName;

    public UpgradeInfo(B b10) {
        this.f4354id = "";
        this.title = "";
        this.newFeature = "";
        this.publishTime = 0L;
        this.publishType = 0;
        this.upgradeType = 1;
        this.popTimes = 0;
        this.popInterval = 0L;
        this.versionName = "";
        if (b10 != null) {
            this.f4354id = b10.f4837r;
            this.title = b10.f4825f;
            this.newFeature = b10.f4826g;
            this.publishTime = b10.f4827h;
            this.publishType = b10.f4828i;
            this.upgradeType = b10.f4831l;
            this.popTimes = b10.f4832m;
            this.popInterval = b10.f4833n;
            C0016y c0016y = b10.f4829j;
            this.versionCode = c0016y.f5152d;
            this.versionName = c0016y.f5153e;
            this.apkMd5 = c0016y.f5158j;
            C0015x c0015x = b10.f4830k;
            this.apkUrl = c0015x.f5145c;
            this.fileSize = c0015x.f5147e;
            this.imageUrl = b10.f4836q.get("IMG_title");
            this.updateType = b10.f4840u;
        }
    }
}
