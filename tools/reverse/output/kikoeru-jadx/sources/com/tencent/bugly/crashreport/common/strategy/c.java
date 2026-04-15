package com.tencent.bugly.crashreport.common.strategy;

import android.content.Context;
import com.tencent.bugly.a;
import com.tencent.bugly.crashreport.biz.f;
import com.tencent.bugly.proguard.J;
import com.tencent.bugly.proguard.L;
import com.tencent.bugly.proguard.W;
import com.tencent.bugly.proguard.X;
import com.tencent.bugly.proguard.ca;
import com.tencent.bugly.proguard.ra;
import com.tencent.bugly.proguard.sa;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f4640a = 1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static c f4641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f4642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<a> f4643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final W f4644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final StrategyBean f4645f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private StrategyBean f4646g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Context f4647h;

    public c(Context context, List<a> list) {
        this.f4647h = context;
        a(context);
        this.f4645f = new StrategyBean();
        this.f4643d = list;
        this.f4644e = W.c();
    }

    public StrategyBean c() {
        StrategyBean strategyBean = this.f4646g;
        if (strategyBean != null) {
            if (!ca.c(strategyBean.f4633q)) {
                this.f4646g.f4633q = StrategyBean.f4617a;
            }
            if (!ca.c(this.f4646g.f4634r)) {
                this.f4646g.f4634r = StrategyBean.f4618b;
            }
            return this.f4646g;
        }
        if (!ca.b(f4642c) && ca.c(f4642c)) {
            StrategyBean strategyBean2 = this.f4645f;
            String str = f4642c;
            strategyBean2.f4633q = str;
            strategyBean2.f4634r = str;
        }
        return this.f4645f;
    }

    public synchronized boolean d() {
        return this.f4646g != null;
    }

    public StrategyBean e() {
        byte[] bArr;
        List<L> listA = J.a().a(2);
        if (listA == null || listA.size() <= 0 || (bArr = listA.get(0).f4878g) == null) {
            return null;
        }
        return (StrategyBean) ca.a(bArr, StrategyBean.CREATOR);
    }

    public static synchronized c b() {
        return f4641b;
    }

    public static synchronized c a(Context context, List<a> list) {
        try {
            if (f4641b == null) {
                f4641b = new c(context, list);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f4641b;
    }

    public void a(long j10) {
        this.f4644e.a(new com.tencent.bugly.crashreport.crash.c(1, this), j10);
    }

    public void a(StrategyBean strategyBean, boolean z10) {
        X.a("[Strategy] Notify %s", f.class.getName());
        f.a(strategyBean, z10);
        for (a aVar : this.f4643d) {
            try {
                X.a("[Strategy] Notify %s", aVar.getClass().getName());
                aVar.onServerStrategyChanged(strategyBean);
            } catch (Throwable th2) {
                if (!X.b(th2)) {
                    th2.printStackTrace();
                }
            }
        }
    }

    public static void a(String str) {
        if (!ca.b(str) && ca.c(str)) {
            f4642c = str;
        } else {
            X.e("URL user set is invalid.", new Object[0]);
        }
    }

    public void a(sa saVar) {
        if (saVar == null) {
            return;
        }
        StrategyBean strategyBean = this.f4646g;
        if (strategyBean == null || saVar.f5116k != strategyBean.f4631o) {
            StrategyBean strategyBean2 = new StrategyBean();
            strategyBean2.f4622f = saVar.f5109d;
            strategyBean2.f4624h = saVar.f5111f;
            strategyBean2.f4623g = saVar.f5110e;
            if (ca.b(f4642c) || !ca.c(f4642c)) {
                if (ca.c(saVar.f5112g)) {
                    X.a("[Strategy] Upload url changes to %s", saVar.f5112g);
                    strategyBean2.f4633q = saVar.f5112g;
                }
                if (ca.c(saVar.f5113h)) {
                    X.a("[Strategy] Exception upload url changes to %s", saVar.f5113h);
                    strategyBean2.f4634r = saVar.f5113h;
                }
            }
            ra raVar = saVar.f5114i;
            if (raVar != null && !ca.b(raVar.f5086a)) {
                strategyBean2.f4635s = saVar.f5114i.f5086a;
            }
            long j10 = saVar.f5116k;
            if (j10 != 0) {
                strategyBean2.f4631o = j10;
            }
            Map<String, String> map = saVar.f5115j;
            if (map != null && map.size() > 0) {
                Map<String, String> map2 = saVar.f5115j;
                strategyBean2.f4636t = map2;
                String str = map2.get("B11");
                if (str != null && str.equals("1")) {
                    strategyBean2.f4625i = true;
                } else {
                    strategyBean2.f4625i = false;
                }
                String str2 = saVar.f5115j.get("B3");
                if (str2 != null) {
                    strategyBean2.f4639w = Long.valueOf(str2).longValue();
                }
                long j11 = saVar.f5120o;
                strategyBean2.f4632p = j11;
                strategyBean2.f4638v = j11;
                String str3 = saVar.f5115j.get("B27");
                if (str3 != null && str3.length() > 0) {
                    try {
                        int i10 = Integer.parseInt(str3);
                        if (i10 > 0) {
                            strategyBean2.f4637u = i10;
                        }
                    } catch (Exception e10) {
                        if (!X.b(e10)) {
                            e10.printStackTrace();
                        }
                    }
                }
                String str4 = saVar.f5115j.get("B25");
                if (str4 != null && str4.equals("1")) {
                    strategyBean2.f4627k = true;
                } else {
                    strategyBean2.f4627k = false;
                }
            }
            X.c("[Strategy] enableCrashReport:%b, enableQuery:%b, enableUserInfo:%b, enableAnr:%b, enableBlock:%b, enableSession:%b, enableSessionTimer:%b, sessionOverTime:%d, enableCocos:%b, strategyLastUpdateTime:%d", Boolean.valueOf(strategyBean2.f4622f), Boolean.valueOf(strategyBean2.f4624h), Boolean.valueOf(strategyBean2.f4623g), Boolean.valueOf(strategyBean2.f4625i), Boolean.valueOf(strategyBean2.f4626j), Boolean.valueOf(strategyBean2.f4629m), Boolean.valueOf(strategyBean2.f4630n), Long.valueOf(strategyBean2.f4632p), Boolean.valueOf(strategyBean2.f4627k), Long.valueOf(strategyBean2.f4631o));
            this.f4646g = strategyBean2;
            if (!ca.c(saVar.f5112g)) {
                X.a("[Strategy] download url is null", new Object[0]);
                this.f4646g.f4633q = "";
            }
            if (!ca.c(saVar.f5113h)) {
                X.a("[Strategy] download crashurl is null", new Object[0]);
                this.f4646g.f4634r = "";
            }
            J.a().b(2);
            L l10 = new L();
            l10.f4873b = 2;
            l10.f4872a = strategyBean2.f4620d;
            l10.f4876e = strategyBean2.f4621e;
            l10.f4878g = ca.a(strategyBean2);
            J.a().c(l10);
            a(strategyBean2, true);
        }
    }

    private static void a(Context context) {
        if (com.tencent.bugly.crashreport.common.info.a.a(context) != null) {
            String str = com.tencent.bugly.crashreport.common.info.a.a(context).f4574fa;
            if ("oversea".equals(str)) {
                StrategyBean.f4617a = "https://astat.bugly.qcloud.com/rqd/async";
                StrategyBean.f4618b = "https://astat.bugly.qcloud.com/rqd/async";
            } else if ("na_https".equals(str)) {
                StrategyBean.f4617a = "https://astat.bugly.cros.wr.pvp.net/:8180/rqd/async";
                StrategyBean.f4618b = "https://astat.bugly.cros.wr.pvp.net/:8180/rqd/async";
            }
        }
    }
}
