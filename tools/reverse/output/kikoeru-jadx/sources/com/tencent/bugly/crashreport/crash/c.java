package com.tencent.bugly.crashreport.crash;

import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.proguard.I;
import com.tencent.bugly.proguard.J;
import com.tencent.bugly.proguard.X;
import com.tencent.bugly.proguard.ca;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4723b;

    public /* synthetic */ c(int i10, Object obj) {
        this.f4722a = i10;
        this.f4723b = obj;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        List<CrashDetailBean> list;
        int i10 = this.f4722a;
        Object obj = this.f4723b;
        switch (i10) {
            case 0:
                h hVar = (h) obj;
                if (!ca.a(hVar.f4753q, "local_crash_lock", 10000L)) {
                    X.a("Failed to lock file for uploading local crash.", new Object[0]);
                    return;
                }
                List<CrashDetailBean> listB = hVar.f4754r.b();
                if (listB == null || listB.size() <= 0) {
                    X.a("no crash need to be uploaded at this start", new Object[0]);
                } else {
                    X.a("Size of crash list: %s", Integer.valueOf(listB.size()));
                    int size = listB.size();
                    if (size > 20) {
                        ArrayList arrayList = new ArrayList();
                        Collections.sort(listB);
                        for (int i11 = 0; i11 < 20; i11++) {
                            arrayList.add(listB.get((size - 1) - i11));
                        }
                        list = arrayList;
                    } else {
                        list = listB;
                    }
                    hVar.f4754r.a(list, 0L, false, false, false);
                }
                ca.b(hVar.f4753q, "local_crash_lock");
                return;
            case 1:
                com.tencent.bugly.crashreport.common.strategy.c cVar = (com.tencent.bugly.crashreport.common.strategy.c) obj;
                try {
                    Map<String, byte[]> mapA = J.a().a(com.tencent.bugly.crashreport.common.strategy.c.f4640a, (I) null, true);
                    if (mapA != null) {
                        byte[] bArr = mapA.get("device");
                        byte[] bArr2 = mapA.get("gateway");
                        if (bArr != null) {
                            com.tencent.bugly.crashreport.common.info.a.a(cVar.f4647h).f(new String(bArr));
                        }
                        if (bArr2 != null) {
                            com.tencent.bugly.crashreport.common.info.a.a(cVar.f4647h).e(new String(bArr2));
                        }
                    }
                    cVar.f4646g = cVar.e();
                    if (cVar.f4646g != null) {
                        if (ca.b(com.tencent.bugly.crashreport.common.strategy.c.f4642c) || !ca.c(com.tencent.bugly.crashreport.common.strategy.c.f4642c)) {
                            cVar.f4646g.f4633q = StrategyBean.f4617a;
                            cVar.f4646g.f4634r = StrategyBean.f4618b;
                        } else {
                            cVar.f4646g.f4633q = com.tencent.bugly.crashreport.common.strategy.c.f4642c;
                            cVar.f4646g.f4634r = com.tencent.bugly.crashreport.common.strategy.c.f4642c;
                        }
                    }
                } catch (Throwable th2) {
                    if (!X.b(th2)) {
                        th2.printStackTrace();
                    }
                }
                cVar.a(cVar.f4646g, false);
                return;
            default:
                do {
                    try {
                    } catch (InterruptedException e10) {
                        throw new IllegalStateException(e10);
                    }
                    break;
                } while (((f5.b) obj).i());
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f5.b bVar) {
        super("ExoPlayer:SimpleDecoder");
        this.f4722a = 2;
        this.f4723b = bVar;
    }
}
