package com.tencent.bugly.beta.upgrade;

import android.text.TextUtils;
import com.tencent.bugly.beta.global.e;
import com.tencent.bugly.proguard.A;
import com.tencent.bugly.proguard.AbstractC0010m;
import com.tencent.bugly.proguard.M;
import com.tencent.bugly.proguard.P;
import com.tencent.bugly.proguard.T;
import com.tencent.bugly.proguard.X;
import com.tencent.bugly.proguard.pa;
import com.tencent.bugly.proguard.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b f4440a = new b();

    public synchronized void a(int i10, int i11, byte[] bArr, a aVar, boolean z10, String str) {
        com.tencent.bugly.crashreport.common.info.a aVarM = com.tencent.bugly.crashreport.common.info.a.m();
        try {
            pa paVarA = M.a(e.f4381b.f4407v, i10, bArr);
            if (paVarA != null) {
                e eVar = e.f4381b;
                paVarA.f5041d = eVar.f4409x;
                if (!TextUtils.isEmpty(eVar.R)) {
                    paVarA.f5044g = eVar.R;
                }
                Map<String, String> map = paVarA.f5050m;
                if (map != null) {
                    map.put("G6", eVar.f4410y);
                    paVarA.f5050m.put("G10", "1.5.23");
                    paVarA.f5050m.put("G3", "" + eVar.A);
                    paVarA.f5050m.put("G11", String.valueOf(eVar.f4411z));
                    paVarA.f5050m.put("G2", String.valueOf(com.tencent.bugly.beta.global.a.a(e.f4381b.f4407v)));
                    int i12 = eVar.f4403r;
                    if (i12 < 0) {
                        i12 = 0;
                    }
                    paVarA.f5050m.put("G12", String.valueOf(i12));
                    paVarA.f5050m.put("A21", "" + aVarM.y());
                    paVarA.f5050m.put("A22", "" + aVarM.l());
                    paVarA.f5050m.put("G13", "" + eVar.L);
                    paVarA.f5050m.put("G14", "" + eVar.M);
                    paVarA.f5050m.put("G15", "" + eVar.O);
                    paVarA.f5050m.put("G17", "" + aVarM.n());
                    paVarA.f5050m.put("C01", "" + aVarM.A());
                    paVarA.f5050m.put("G18", "" + aVarM.y());
                    paVarA.f5050m.put("strategyType", "" + i11);
                    paVarA.f5050m.put("strategyRequestManner", "" + z10);
                    Map<String, String> mapH = aVarM.h();
                    if (mapH != null && mapH.size() > 0) {
                        for (Map.Entry<String, String> entry : mapH.entrySet()) {
                            Map<String, String> map2 = paVarA.f5050m;
                            StringBuilder sb = new StringBuilder();
                            sb.append("C03_");
                            sb.append(entry.getKey());
                            map2.put(sb.toString(), entry.getValue());
                        }
                    }
                    X.a("app version is: [%s.%s], [deviceId:%s], channel: [%s], buildNo: [%s], base tinkerId:[%s], patch tinkerId:[%s], patch version:[%s], strategyType:[%s]", eVar.A, Integer.valueOf(eVar.f4411z), aVarM.l(), paVarA.f5044g, Integer.valueOf(eVar.f4403r), eVar.L, eVar.M, eVar.O, Integer.valueOf(i11));
                    HashMap map3 = new HashMap();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(e.f4381b.H.f4435b);
                    sb2.append("");
                    map3.put("grayStrategyUpdateTime", sb2.toString());
                    if (z10) {
                        T.a().a(1002, paVarA.f5046i, M.a((Object) paVarA), str, str, aVar, 0, 1, true, map3);
                    } else {
                        T.a().a(1002, paVarA.f5046i, M.a((Object) paVarA), str, str, (P) aVar, false, (Map<String, String>) map3);
                    }
                }
            }
        } catch (Throwable th2) {
            if (!X.b(th2)) {
                th2.printStackTrace();
            }
            aVar.a(i10, null, 0L, 0L, false, "sendRequest failed");
        }
    }

    public synchronized void a(z zVar, boolean z10) throws Throwable {
        try {
            if (zVar == null) {
                return;
            }
            try {
                ArrayList arrayList = new ArrayList();
                arrayList.add(zVar);
                A a10 = new A(arrayList);
                try {
                    try {
                        a(803, -1, M.a((AbstractC0010m) a10), new a(2, 803, a10, Boolean.valueOf(z10)), false, e.f4381b.H.f4434a.f5112g);
                    } catch (Throwable th2) {
                        th = th2;
                        Throwable th3 = th;
                        if (!X.a(th3)) {
                            th3.printStackTrace();
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    public synchronized void a(A a10, boolean z10) {
        if (a10 == null) {
            return;
        }
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            a(803, -1, M.a((AbstractC0010m) a10), new a(2, 803, a10, Boolean.valueOf(z10)), false, e.f4381b.H.f4434a.f5112g);
        } catch (Throwable th3) {
            th = th3;
            Throwable th4 = th;
            if (!X.a(th4)) {
                th4.printStackTrace();
            }
        }
    }
}
