package com.tencent.bugly.beta.download;

import java.io.File;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class DownloadTask {
    public static final int COMPLETE = 1;
    public static final int DELETED = 4;
    public static final int DOWNLOADING = 2;
    public static final int FAILED = 5;
    public static final int INIT = 0;
    public static final int PAUSED = 3;
    public static final int TYPE_HOTFIX = 2;
    public static final int TYPE_UPGRADE = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f4355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f4356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f4357c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected long f4359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected long f4360f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected String f4362h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected List<DownloadListener> f4358d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected boolean f4361g = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f4363i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f4364j = 1;

    public DownloadTask(String str, String str2, String str3, String str4) {
        this.f4355a = str;
        this.f4356b = str2;
        this.f4357c = str3;
        this.f4362h = str4;
    }

    public void addListener(DownloadListener downloadListener) {
        if (downloadListener == null || this.f4358d.contains(downloadListener)) {
            return;
        }
        this.f4358d.add(downloadListener);
    }

    public abstract void delete(boolean z10);

    public abstract void download();

    public abstract long getCostTime();

    public int getDownloadType() {
        return this.f4364j;
    }

    public String getDownloadUrl() {
        return this.f4355a;
    }

    public String getMD5() {
        return this.f4362h;
    }

    public abstract File getSaveFile();

    public long getSavedLength() {
        return this.f4359e;
    }

    public abstract int getStatus();

    public long getTotalLength() {
        return this.f4360f;
    }

    public boolean isNeededNotify() {
        return this.f4361g;
    }

    public boolean removeListener(DownloadListener downloadListener) {
        return downloadListener != null && this.f4358d.remove(downloadListener);
    }

    public void setDownloadType(int i10) {
        this.f4364j = i10;
    }

    public void setNeededNotify(boolean z10) {
        this.f4361g = z10;
    }

    public void setSavedLength(long j10) {
        this.f4359e = j10;
    }

    public void setTotalLength(long j10) {
        this.f4360f = j10;
    }

    public abstract void stop();
}
