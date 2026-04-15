package com.tencent.bugly.proguard;

import android.content.Context;
import com.tencent.bugly.crashreport.biz.UserInfoBean;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.common.strategy.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class M {
    public static ta a(UserInfoBean userInfoBean, com.tencent.bugly.crashreport.common.info.a aVar) {
        if (userInfoBean == null) {
            return null;
        }
        ta taVar = new ta();
        taVar.f5122b = userInfoBean.f4525e;
        taVar.f5126f = userInfoBean.f4530j;
        taVar.f5125e = userInfoBean.f4523c;
        taVar.f5124d = userInfoBean.f4524d;
        taVar.f5129i = userInfoBean.f4535o == 1;
        int i10 = userInfoBean.f4522b;
        if (i10 == 1) {
            taVar.f5123c = (byte) 1;
        } else if (i10 == 2) {
            taVar.f5123c = (byte) 4;
        } else if (i10 == 3) {
            taVar.f5123c = (byte) 2;
        } else if (i10 == 4) {
            taVar.f5123c = (byte) 3;
        } else {
            if (i10 < 10 || i10 >= 20) {
                X.b("unknown uinfo type %d ", Integer.valueOf(i10));
                return null;
            }
            taVar.f5123c = (byte) i10;
        }
        HashMap map = new HashMap();
        taVar.f5127g = map;
        if (userInfoBean.f4536p >= 0) {
            map.put("C01", "" + userInfoBean.f4536p);
        }
        if (userInfoBean.f4537q >= 0) {
            taVar.f5127g.put("C02", "" + userInfoBean.f4537q);
        }
        Map<String, String> map2 = userInfoBean.f4538r;
        if (map2 != null && map2.size() > 0) {
            for (Map.Entry<String, String> entry : userInfoBean.f4538r.entrySet()) {
                taVar.f5127g.put("C03_" + entry.getKey(), entry.getValue());
            }
        }
        Map<String, String> map3 = userInfoBean.f4539s;
        if (map3 != null && map3.size() > 0) {
            for (Map.Entry<String, String> entry2 : userInfoBean.f4539s.entrySet()) {
                taVar.f5127g.put("C04_" + entry2.getKey(), entry2.getValue());
            }
        }
        Map<String, String> map4 = taVar.f5127g;
        StringBuilder sb = new StringBuilder("");
        sb.append(!userInfoBean.f4532l);
        map4.put("A36", sb.toString());
        taVar.f5127g.put("F02", "" + userInfoBean.f4527g);
        taVar.f5127g.put("F03", "" + userInfoBean.f4528h);
        taVar.f5127g.put("F04", "" + userInfoBean.f4530j);
        taVar.f5127g.put("F05", "" + userInfoBean.f4529i);
        taVar.f5127g.put("F06", "" + userInfoBean.f4533m);
        taVar.f5127g.put("F10", "" + userInfoBean.f4531k);
        X.a("summary type %d vm:%d", Byte.valueOf(taVar.f5123c), Integer.valueOf(taVar.f5127g.size()));
        return taVar;
    }

    public static ua a(List<UserInfoBean> list, int i10) {
        com.tencent.bugly.crashreport.common.info.a aVarM;
        if (list == null || list.size() == 0 || (aVarM = com.tencent.bugly.crashreport.common.info.a.m()) == null) {
            return null;
        }
        aVarM.E();
        ua uaVar = new ua();
        uaVar.f5133d = aVarM.f4576h;
        uaVar.f5134e = aVarM.l();
        ArrayList<ta> arrayList = new ArrayList<>();
        Iterator<UserInfoBean> it = list.iterator();
        while (it.hasNext()) {
            ta taVarA = a(it.next(), aVarM);
            if (taVarA != null) {
                arrayList.add(taVarA);
            }
        }
        uaVar.f5135f = arrayList;
        HashMap map = new HashMap();
        uaVar.f5136g = map;
        map.put("A7", "" + aVarM.f4588n);
        uaVar.f5136g.put("A6", "" + aVarM.j());
        uaVar.f5136g.put("A5", "" + aVarM.k());
        uaVar.f5136g.put("A2", "" + aVarM.v());
        uaVar.f5136g.put("A1", "" + aVarM.v());
        uaVar.f5136g.put("A24", "" + aVarM.f4592p);
        uaVar.f5136g.put("A17", "" + aVarM.x());
        uaVar.f5136g.put("A15", "" + aVarM.i());
        uaVar.f5136g.put("A13", "" + aVarM.n());
        uaVar.f5136g.put("F08", "" + aVarM.f4568ca);
        uaVar.f5136g.put("F09", "" + aVarM.f4570da);
        Map<String, String> mapG = aVarM.g();
        if (mapG != null && mapG.size() > 0) {
            for (Map.Entry<String, String> entry : mapG.entrySet()) {
                uaVar.f5136g.put("C04_" + entry.getKey(), entry.getValue());
            }
        }
        if (i10 == 1) {
            uaVar.f5132c = (byte) 1;
            return uaVar;
        }
        if (i10 != 2) {
            X.b("unknown up type %d ", Integer.valueOf(i10));
            return null;
        }
        uaVar.f5132c = (byte) 2;
        return uaVar;
    }

    public static <T extends AbstractC0010m> T a(byte[] bArr, Class<T> cls) {
        if (bArr != null && bArr.length > 0) {
            try {
                T tNewInstance = cls.newInstance();
                C0008k c0008k = new C0008k(bArr);
                c0008k.a("utf-8");
                tNewInstance.a(c0008k);
                return tNewInstance;
            } catch (Throwable th2) {
                if (!X.a(th2)) {
                    th2.printStackTrace();
                }
            }
        }
        return null;
    }

    public static pa a(Context context, int i10, byte[] bArr) {
        String str;
        com.tencent.bugly.crashreport.common.info.a aVarM = com.tencent.bugly.crashreport.common.info.a.m();
        StrategyBean strategyBeanC = c.b().c();
        if (aVarM != null && strategyBeanC != null) {
            try {
                pa paVar = new pa();
                synchronized (aVarM) {
                    try {
                        paVar.f5040c = aVarM.f4573f;
                        paVar.f5041d = aVarM.e();
                        paVar.f5042e = aVarM.f4575g;
                        paVar.f5043f = aVarM.E;
                        paVar.f5044g = aVarM.I;
                        paVar.f5045h = aVarM.f4584l;
                        paVar.f5046i = i10;
                        if (bArr == null) {
                            bArr = "".getBytes();
                        }
                        paVar.f5047j = bArr;
                        paVar.f5048k = aVarM.f4590o;
                        paVar.f5049l = aVarM.f4592p;
                        paVar.f5050m = new HashMap();
                        paVar.f5051n = aVarM.u();
                        paVar.f5052o = strategyBeanC.f4631o;
                        paVar.f5054q = aVarM.l();
                        paVar.f5055r = com.tencent.bugly.crashreport.common.info.b.c(context);
                        paVar.f5056s = System.currentTimeMillis();
                        paVar.f5058u = aVarM.q();
                        paVar.f5061x = "" + aVarM.l();
                        paVar.f5062y = paVar.f5055r;
                        paVar.f5053p = "com.tencent.bugly";
                        paVar.f5050m.put("A26", "" + aVarM.r());
                        paVar.f5050m.put("A62", "" + aVarM.D());
                        paVar.f5050m.put("A63", "" + aVarM.B());
                        paVar.f5050m.put("F11", "" + aVarM.f4577ha);
                        paVar.f5050m.put("F12", "" + aVarM.ga);
                        paVar.f5050m.put("D3", "" + aVarM.G);
                        List<com.tencent.bugly.a> list = com.tencent.bugly.b.f4349b;
                        if (list != null) {
                            for (com.tencent.bugly.a aVar : list) {
                                String str2 = aVar.versionKey;
                                if (str2 != null && (str = aVar.version) != null) {
                                    paVar.f5050m.put(str2, str);
                                }
                            }
                        }
                        paVar.f5050m.put("G15", ca.b("G15", ""));
                        paVar.f5050m.put("D4", ca.b("D4", "0"));
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                Map<String, String> mapF = aVarM.f();
                if (mapF != null) {
                    for (Map.Entry<String, String> entry : mapF.entrySet()) {
                        paVar.f5050m.put(entry.getKey(), entry.getValue());
                    }
                }
                return paVar;
            } catch (Throwable th3) {
                if (!X.a(th3)) {
                    th3.printStackTrace();
                }
                return null;
            }
        }
        X.b("Can not create request pkg for parameters is invalid.", new Object[0]);
        return null;
    }

    public static byte[] a(Object obj) {
        try {
            C0004e c0004e = new C0004e();
            c0004e.a();
            c0004e.a("utf-8");
            c0004e.a(1);
            c0004e.c("RqdServer");
            c0004e.b("sync");
            c0004e.a("detail", obj);
            return c0004e.b();
        } catch (Throwable th2) {
            if (X.a(th2)) {
                return null;
            }
            th2.printStackTrace();
            return null;
        }
    }

    public static qa a(byte[] bArr, StrategyBean strategyBean, boolean z10) {
        if (bArr == null) {
            return null;
        }
        try {
            C0004e c0004e = new C0004e();
            c0004e.a();
            c0004e.a("utf-8");
            c0004e.a(bArr);
            Object objB = c0004e.b("detail", new qa());
            if (qa.class.isInstance(objB)) {
                return (qa) qa.class.cast(objB);
            }
            return null;
        } catch (Throwable th2) {
            if (X.a(th2)) {
                return null;
            }
            th2.printStackTrace();
            return null;
        }
    }

    public static byte[] a(AbstractC0010m abstractC0010m) {
        try {
            C0009l c0009l = new C0009l();
            c0009l.a("utf-8");
            abstractC0010m.a(c0009l);
            return c0009l.b();
        } catch (Throwable th2) {
            if (X.a(th2)) {
                return null;
            }
            th2.printStackTrace();
            return null;
        }
    }
}
