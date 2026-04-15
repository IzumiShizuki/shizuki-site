package com.tencent.bugly.proguard;

import android.content.ContentValues;
import android.text.TextUtils;
import com.tencent.bugly.beta.download.DownloadTask;
import com.tencent.bugly.beta.download.c;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class v implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static v f5137a = new v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ConcurrentHashMap<String, DownloadTask> f5138b = new ConcurrentHashMap<>(3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ScheduledExecutorService f5139c;

    public v() {
        this.f5139c = null;
        try {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(3, new b0(1));
            this.f5139c = scheduledExecutorServiceNewScheduledThreadPool;
            if (scheduledExecutorServiceNewScheduledThreadPool.isShutdown()) {
                throw new IllegalArgumentException("ScheduledExecutorService is not available!");
            }
        } catch (Exception e10) {
            X.b(e10);
        }
    }

    @Override // com.tencent.bugly.beta.download.c
    public DownloadTask a(String str, String str2, String str3, String str4) {
        RunnableC0014w runnableC0014w = null;
        if (TextUtils.isEmpty(str)) {
            X.b("downloadUrl is null!", new Object[0]);
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            X.b("saveDir is null!", new Object[0]);
            return null;
        }
        if (this.f5138b.get(str) != null) {
            return this.f5138b.get(str);
        }
        ContentValues contentValuesC = C0012p.f5037a.c(str);
        if (contentValuesC != null && contentValuesC.get("_dUrl") != null && contentValuesC.getAsString("_sFile") != null && contentValuesC.getAsLong("_sLen") != null && contentValuesC.getAsLong("_tLen") != null && contentValuesC.getAsString("_MD5") != null) {
            RunnableC0014w runnableC0014w2 = new RunnableC0014w((String) contentValuesC.get("_dUrl"), contentValuesC.getAsString("_sFile"), contentValuesC.getAsLong("_sLen").longValue(), contentValuesC.getAsLong("_tLen").longValue(), contentValuesC.getAsString("_MD5"));
            if (contentValuesC.getAsLong("_DLTIME") != null) {
                runnableC0014w2.f5141l = contentValuesC.getAsLong("_DLTIME").longValue();
            }
            runnableC0014w = runnableC0014w2;
        }
        return runnableC0014w == null ? new RunnableC0014w(str, str2, str3, str4) : runnableC0014w;
    }

    public synchronized boolean a(Runnable runnable) {
        ScheduledExecutorService scheduledExecutorService = this.f5139c;
        if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
            if (runnable == null) {
                X.e("async task = null", new Object[0]);
                return false;
            }
            X.e("task start %s", runnable.getClass().getName());
            this.f5139c.execute(runnable);
            return true;
        }
        X.e("async handler was closed , should not post task!", new Object[0]);
        return false;
    }
}
