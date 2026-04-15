package com.tencent.bugly.proguard;

import android.text.TextUtils;
import com.tencent.bugly.beta.download.BetaReceiver;
import com.tencent.bugly.beta.download.DownloadTask;
import com.tencent.bugly.beta.ui.BetaNotifyManager;
import java.io.File;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0014w extends DownloadTask implements Runnable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private File f5140k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f5141l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f5142m;

    public RunnableC0014w(String str, String str2, long j10, long j11, String str3) {
        super(str, "", "", str3);
        this.f5141l = 0L;
        this.f5142m = 0L;
        File file = new File(str2);
        this.f5140k = file;
        this.f4356b = file.getParent();
        this.f4357c = this.f5140k.getName();
        this.f4359e = j10;
        this.f4360f = j11;
        getStatus();
    }

    private String a(HttpURLConnection httpURLConnection) {
        List<String> list;
        try {
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (!TextUtils.isEmpty(this.f4357c)) {
            return this.f4357c;
        }
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        if (headerFields != null) {
            for (String str : headerFields.keySet()) {
                if (str != null && (list = headerFields.get(str)) != null) {
                    for (String str2 : list) {
                        if (str2 != null && "content-disposition".equals(str.toLowerCase())) {
                            Matcher matcher = Pattern.compile(".*filename=(.*)").matcher(str2.toLowerCase());
                            if (matcher.find()) {
                                return matcher.group(1);
                            }
                        }
                    }
                }
            }
        }
        String strSubstring = getDownloadUrl().substring(getDownloadUrl().lastIndexOf(47) + 1);
        if (!TextUtils.isEmpty(strSubstring)) {
            return strSubstring;
        }
        return UUID.randomUUID() + ".apk";
    }

    public void b() {
        this.f5141l = (System.currentTimeMillis() - this.f5142m) + this.f5141l;
        C0012p.f5037a.b(this);
        this.f5142m = System.currentTimeMillis();
        BetaNotifyManager.instance.postDownloadNotify();
        com.tencent.bugly.beta.utils.e.a(new com.tencent.bugly.beta.global.d(9, this.f4358d, this));
    }

    @Override // com.tencent.bugly.beta.download.DownloadTask
    public void delete(boolean z10) {
        stop();
        if (z10) {
            if (getSaveFile() != null && getSaveFile().exists() && !getSaveFile().isDirectory()) {
                getSaveFile().delete();
            }
            C0012p.f5037a.a(this);
        }
        BetaReceiver.netListeners.remove(getDownloadUrl());
        this.f4357c = null;
        this.f4359e = 0L;
        this.f4360f = 0L;
        this.f4363i = 4;
    }

    @Override // com.tencent.bugly.beta.download.DownloadTask
    public void download() {
        if (getStatus() == 1) {
            a();
            return;
        }
        if (getStatus() == 2) {
            return;
        }
        if (getSaveFile() == null || !getSaveFile().exists()) {
            this.f4359e = 0L;
            this.f4360f = 0L;
            this.f5141l = 0L;
        } else {
            this.f4359e = getSaveFile().length();
        }
        if (this.f4361g) {
            BetaNotifyManager.instance.initNotify(this);
        }
        this.f5142m = System.currentTimeMillis();
        this.f4363i = 2;
        v.f5137a.f5138b.put(getDownloadUrl(), this);
        v.f5137a.a(this);
    }

    @Override // com.tencent.bugly.beta.download.DownloadTask
    public long getCostTime() {
        return this.f5141l;
    }

    @Override // com.tencent.bugly.beta.download.DownloadTask
    public File getSaveFile() {
        return this.f5140k;
    }

    @Override // com.tencent.bugly.beta.download.DownloadTask
    public int getStatus() {
        if (getSaveFile() != null && getSaveFile().exists() && getSaveFile().length() == this.f4360f && !v.f5137a.f5138b.contains(this)) {
            this.f4359e = this.f4360f;
            this.f4363i = 1;
        }
        if (getSaveFile() != null && getSaveFile().exists() && getSaveFile().length() > 0 && getSaveFile().length() < this.f4360f && !v.f5137a.f5138b.contains(this)) {
            this.f4359e = getSaveFile().length();
            this.f4363i = 3;
        }
        if ((getSaveFile() == null || !getSaveFile().exists()) && !v.f5137a.f5138b.contains(this)) {
            this.f4363i = 0;
        }
        return this.f4363i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0195, code lost:
    
        if (r5 == null) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0197, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0167, code lost:
    
        if (r0 < 3) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x016b, code lost:
    
        com.tencent.bugly.proguard.X.a(com.tencent.bugly.proguard.RunnableC0014w.class, "have retry %d times", 3);
     */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0163 A[Catch: all -> 0x00f1, Exception -> 0x00f3, TryCatch #10 {Exception -> 0x00f3, blocks: (B:33:0x0099, B:50:0x00e3, B:72:0x0127, B:78:0x0138, B:93:0x0163, B:94:0x0166, B:90:0x015b, B:97:0x016b), top: B:123:0x015b, outer: #2 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.RunnableC0014w.run():void");
    }

    @Override // com.tencent.bugly.beta.download.DownloadTask
    public void stop() {
        if (this.f4363i != 5) {
            this.f4363i = 3;
        }
    }

    public RunnableC0014w(String str, String str2, String str3, String str4) {
        super(str, str2, str3, str4);
        this.f5141l = 0L;
        this.f5142m = 0L;
        getStatus();
    }

    public void a(int i10, String str) {
        this.f4363i = 5;
        BetaNotifyManager.instance.postDownloadNotify();
        v.f5137a.f5138b.remove(getDownloadUrl());
        com.tencent.bugly.beta.utils.e.a(new com.tencent.bugly.beta.global.d(10, this.f4358d, this, Integer.valueOf(i10), str));
    }

    public void a() {
        this.f4363i = 1;
        b();
        v.f5137a.f5138b.remove(getDownloadUrl());
        BetaReceiver.netListeners.remove(getDownloadUrl());
        com.tencent.bugly.beta.utils.e.a(new com.tencent.bugly.beta.global.d(8, this.f4358d, this));
    }
}
