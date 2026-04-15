package com.tencent.bugly.proguard;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ H f5066c;

    public q(H h10, int i10, int i11) {
        this.f5066c = h10;
        this.f5064a = i10;
        this.f5065b = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        E e10;
        String str;
        String str2;
        int i10 = this.f5064a;
        H h10 = this.f5066c;
        try {
            if (TextUtils.isEmpty(h10.f4862d)) {
                return;
            }
            List<E> listC = h10.c(i10);
            if (listC == null) {
                listC = new ArrayList();
            }
            if (h10.f4863e.get(Integer.valueOf(i10)) == null) {
                h10.f4863e.put(Integer.valueOf(i10), new HashMap());
            }
            Object obj = ((Map) h10.f4863e.get(Integer.valueOf(i10))).get(h10.f4862d);
            int i11 = this.f5065b;
            if (obj == null) {
                e10 = new E();
                e10.f4852a = i10;
                e10.f4858g = H.f4860b;
                e10.f4853b = h10.f4862d;
                e10.f4857f = com.tencent.bugly.crashreport.common.info.a.m().E;
                e10.f4856e = com.tencent.bugly.crashreport.common.info.a.m().f4584l;
                e10.f4854c = System.currentTimeMillis();
                e10.f4855d = i11;
                ((Map) h10.f4863e.get(Integer.valueOf(i10))).put(h10.f4862d, e10);
            } else {
                e10 = (E) ((Map) h10.f4863e.get(Integer.valueOf(i10))).get(h10.f4862d);
                e10.f4855d = i11;
            }
            ArrayList arrayList = new ArrayList();
            boolean z10 = false;
            for (E e11 : listC) {
                if (e11.f4858g == e10.f4858g && (str2 = e11.f4853b) != null && str2.equalsIgnoreCase(e10.f4853b)) {
                    e11.f4855d = e10.f4855d;
                    z10 = true;
                }
                String str3 = e11.f4856e;
                if ((str3 != null && !str3.equalsIgnoreCase(e10.f4856e)) || (((str = e11.f4857f) != null && !str.equalsIgnoreCase(e10.f4857f)) || e11.f4855d <= 0)) {
                    arrayList.add(e11);
                }
            }
            listC.removeAll(arrayList);
            if (!z10) {
                listC.add(e10);
            }
            h10.a(i10, listC);
        } catch (Exception unused) {
            X.b("saveCrashRecord failed", new Object[0]);
        }
    }
}
