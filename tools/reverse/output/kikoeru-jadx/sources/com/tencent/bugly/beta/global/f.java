package com.tencent.bugly.beta.global;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.bugly.beta.download.DownloadTask;
import com.tencent.bugly.proguard.C0012p;
import com.tencent.bugly.proguard.X;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static f f4412a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Runnable> f4413b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Map<String, DownloadTask> f4414c = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Handler f4415d = new Handler(Looper.getMainLooper());

    public synchronized void a(Runnable runnable, int i10) {
        try {
            if (this.f4414c.size() == 0) {
                runnable.run();
            } else {
                d dVar = new d(6, Boolean.FALSE, runnable);
                this.f4415d.postDelayed(dVar, i10);
                a(dVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void b() {
        synchronized (this) {
            try {
                Iterator<Runnable> it = this.f4413b.iterator();
                while (it.hasNext()) {
                    it.next().run();
                }
                Iterator<DownloadTask> it2 = this.f4414c.values().iterator();
                while (it2.hasNext()) {
                    it2.next().delete(false);
                }
                this.f4413b.clear();
                this.f4414c.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized void a(Runnable runnable) {
        try {
            if (this.f4414c.size() == 0) {
                runnable.run();
            } else {
                this.f4413b.add(runnable);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void a(com.tencent.bugly.beta.download.c cVar, Map<String, String> map) {
        DownloadTask downloadTaskA;
        if (cVar == null) {
            return;
        }
        if (map != null && !map.isEmpty()) {
            Iterator<DownloadTask> it = this.f4414c.values().iterator();
            while (it.hasNext()) {
                it.next().delete(true);
            }
            this.f4414c.clear();
            com.tencent.bugly.beta.download.a aVar = new com.tencent.bugly.beta.download.a(1, this, this.f4414c);
            for (String str : ResBean.f4370b) {
                if (!map.containsKey(str)) {
                    this.f4414c.clear();
                    ResBean resBean = new ResBean();
                    ResBean.f4369a = resBean;
                    a.a("rb.bch", resBean);
                    return;
                }
                String str2 = map.get(str);
                if (str.startsWith("IMG_") && !TextUtils.isEmpty(str2)) {
                    ResBean.f4369a.a(str, "");
                    Iterator<DownloadTask> it2 = this.f4414c.values().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            downloadTaskA = it2.next();
                            if (downloadTaskA.getDownloadUrl().equals(str2)) {
                                break;
                            }
                        } else {
                            downloadTaskA = null;
                            break;
                        }
                    }
                    if (downloadTaskA == null) {
                        downloadTaskA = cVar.a(str2, e.f4381b.f4406u.getAbsolutePath(), null, null);
                    }
                    if (downloadTaskA != null) {
                        downloadTaskA.addListener(aVar);
                        downloadTaskA.setNeededNotify(false);
                        this.f4414c.put(str, downloadTaskA);
                    }
                } else {
                    ResBean.f4369a.a(str, str2);
                }
            }
            a.a("rb.bch", ResBean.f4369a);
            if (this.f4414c.isEmpty()) {
                return;
            }
            Iterator<DownloadTask> it3 = this.f4414c.values().iterator();
            while (it3.hasNext()) {
                it3.next().download();
            }
            return;
        }
        this.f4414c.clear();
        ResBean resBean2 = new ResBean();
        ResBean.f4369a = resBean2;
        a.a("rb.bch", resBean2);
    }

    public void a() {
        ArrayList arrayList = new ArrayList();
        for (String str : ResBean.f4370b) {
            String strA = ResBean.f4369a.a(str);
            if (str.startsWith("IMG_") && !TextUtils.isEmpty(strA)) {
                arrayList.add(strA);
            }
        }
        File[] fileArrListFiles = e.f4381b.f4406u.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
            return;
        }
        for (File file : fileArrListFiles) {
            Iterator it = arrayList.iterator();
            boolean z10 = true;
            while (it.hasNext()) {
                if (file.getAbsolutePath().equals((String) it.next())) {
                    z10 = false;
                }
            }
            if (z10) {
                C0012p.f5037a.b(file.getAbsolutePath());
                if (!file.delete()) {
                    X.b("cannot deleteCache file:%s", file.getAbsolutePath());
                }
            }
        }
    }
}
