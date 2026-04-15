package com.tencent.bugly.crashreport.crash.jni;

import android.content.Context;
import com.tencent.bugly.crashreport.common.info.AppInfo;
import com.tencent.bugly.crashreport.common.info.a;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.crashreport.crash.e;
import com.tencent.bugly.crashreport.crash.h;
import com.tencent.bugly.proguard.X;
import com.tencent.bugly.proguard.ba;
import com.tencent.bugly.proguard.ca;
import j2.h0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class b implements NativeExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f4797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f4798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f4799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.tencent.bugly.crashreport.common.strategy.c f4800d;

    public b(Context context, a aVar, e eVar, com.tencent.bugly.crashreport.common.strategy.c cVar) {
        this.f4797a = context;
        this.f4798b = eVar;
        this.f4799c = aVar;
        this.f4800d = cVar;
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public void handleNativeException(int i10, int i11, long j10, long j11, String str, String str2, String str3, String str4, int i12, String str5, int i13, int i14, int i15, String str6, String str7) {
        X.c("Native Crash Happen v1", new Object[0]);
        handleNativeException2(i10, i11, j10, j11, str, str2, str3, str4, i12, str5, i13, i14, i15, str6, str7, null);
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public void handleNativeException2(int i10, int i11, long j10, long j11, String str, String str2, String str3, String str4, int i12, String str5, int i13, int i14, int i15, String str6, String str7, String[] strArr) {
        String str8;
        String str9;
        String str10;
        boolean z10;
        String str11;
        boolean z11;
        X.c("Native Crash Happen v2", new Object[0]);
        try {
            String strA = c.a(str3);
            if (i12 > 0) {
                str10 = "KERNEL";
                str8 = "UNKNOWN";
                str9 = str + "(" + str5 + ")";
            } else {
                String strA2 = i13 > 0 ? AppInfo.a(this.f4797a, i13) : "UNKNOWN";
                if (!strA2.equals(String.valueOf(i13))) {
                    strA2 = strA2 + "(" + i13 + ")";
                }
                str8 = strA2;
                str9 = str;
                str10 = str5;
            }
            HashMap map = new HashMap();
            if (strArr != null) {
                for (int i16 = 0; i16 < strArr.length; i16++) {
                    String str12 = strArr[i16];
                    if (str12 != null) {
                        X.c("Extra message[%d]: %s", Integer.valueOf(i16), str12);
                        String[] strArrSplit = str12.split("=");
                        if (strArrSplit.length == 2) {
                            map.put(strArrSplit[0], strArrSplit[1]);
                        } else {
                            X.e("bad extraMsg %s", str12);
                        }
                    }
                }
            } else {
                X.a("not found extraMsg", new Object[0]);
            }
            String str13 = (String) map.get("HasPendingException");
            if (str13 == null || !str13.equals("true")) {
                z10 = false;
            } else {
                X.c("Native crash happened with a Java pending exception.", new Object[0]);
                z10 = true;
            }
            String str14 = (String) map.get("ExceptionProcessName");
            if (str14 == null || str14.length() == 0) {
                str14 = this.f4799c.f4576h;
            } else {
                X.a("Name of crash process: %s", str14);
            }
            String str15 = (String) map.get("ExceptionThreadName");
            if (str15 == null || str15.length() == 0) {
                Thread threadCurrentThread = Thread.currentThread();
                str11 = threadCurrentThread.getName() + "(" + threadCurrentThread.getId() + ")";
            } else {
                X.a("Name of crash thread: %s", str15);
                Iterator<Thread> it = Thread.getAllStackTraces().keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str11 = str15;
                        z11 = false;
                        break;
                    }
                    Thread next = it.next();
                    if (next.getName().equals(str15)) {
                        str11 = str15 + "(" + next.getId() + ")";
                        z11 = true;
                        break;
                    }
                }
                if (!z11) {
                    str11 = str11 + "(" + i11 + ")";
                }
            }
            String str16 = str11;
            long j12 = (j11 / 1000) + (j10 * 1000);
            String str17 = (String) map.get("SysLogPath");
            String str18 = (String) map.get("JniLogPath");
            if (!this.f4800d.d()) {
                X.e("no remote but still store!", new Object[0]);
            }
            if (!this.f4800d.c().f4622f && this.f4800d.d()) {
                X.b("crash report was closed by remote , will not upload to Bugly , print local for helpful!", new Object[0]);
                e.a("NATIVE_CRASH", ca.a(), str14, str16, str9 + "\n" + str2 + "\n" + strA, null);
                ca.a(str4);
                return;
            }
            CrashDetailBean crashDetailBeanPackageCrashDatas = packageCrashDatas(str14, str16, j12, str9, str2, strA, str10, str8, str4, str17, str18, str7, null, null, true, z10);
            if (crashDetailBeanPackageCrashDatas == null) {
                X.b("pkg crash datas fail!", new Object[0]);
                return;
            }
            e.a("NATIVE_CRASH", ca.a(), str14, str16, str9 + "\n" + str2 + "\n" + strA, crashDetailBeanPackageCrashDatas);
            boolean zA = this.f4798b.a(crashDetailBeanPackageCrashDatas, i12);
            NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
            c.a(true, nativeCrashHandler != null ? nativeCrashHandler.getDumpFilePath() : null);
            if (!zA) {
                this.f4798b.a(crashDetailBeanPackageCrashDatas, 3000L, true);
            }
            this.f4798b.e(crashDetailBeanPackageCrashDatas);
            h.g().d();
        } catch (Throwable th2) {
            if (X.b(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    @Override // com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler
    public CrashDetailBean packageCrashDatas(String str, String str2, long j10, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, byte[] bArr, Map<String, String> map, boolean z10, boolean z11) {
        int i10;
        String str12;
        int iIndexOf;
        boolean zI = h.g().i();
        if (zI) {
            X.b("This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful!", new Object[0]);
        }
        CrashDetailBean crashDetailBean = new CrashDetailBean();
        crashDetailBean.f4654b = 1;
        crashDetailBean.f4657e = this.f4799c.l();
        a aVar = this.f4799c;
        crashDetailBean.f4658f = aVar.E;
        crashDetailBean.f4659g = aVar.i();
        crashDetailBean.f4665m = this.f4799c.y();
        crashDetailBean.f4666n = str3;
        crashDetailBean.f4667o = zI ? " This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful![Bugly]" : "";
        crashDetailBean.f4668p = str4;
        String str13 = str5 != null ? str5 : "";
        crashDetailBean.f4669q = str13;
        crashDetailBean.f4670r = j10;
        crashDetailBean.f4673u = ca.c(str13.getBytes());
        crashDetailBean.A = str;
        crashDetailBean.B = str2;
        crashDetailBean.I = this.f4799c.r();
        crashDetailBean.f4660h = this.f4799c.p();
        crashDetailBean.f4661i = this.f4799c.o();
        crashDetailBean.f4674v = str8;
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
        String dumpFilePath = nativeCrashHandler != null ? nativeCrashHandler.getDumpFilePath() : null;
        String strA = c.a(dumpFilePath, str8);
        if (!ca.b(strA)) {
            crashDetailBean.W = strA;
        }
        crashDetailBean.X = c.c(dumpFilePath);
        crashDetailBean.f4675w = c.a(str9, h.f4741e, h.f4744h, h.f4749m);
        crashDetailBean.f4676x = c.a(str10, h.f4741e, null, true);
        crashDetailBean.K = str7;
        crashDetailBean.L = str6;
        crashDetailBean.M = str11;
        crashDetailBean.F = this.f4799c.v();
        crashDetailBean.G = this.f4799c.w();
        crashDetailBean.H = this.f4799c.x();
        if (!z10) {
            crashDetailBean.C = -1L;
            crashDetailBean.D = -1L;
            crashDetailBean.E = -1L;
            if (crashDetailBean.f4675w == null) {
                crashDetailBean.f4675w = "this crash is occurred at last process! Log is miss, when get an terrible ABRT Native Exception etc.";
            }
            crashDetailBean.N = -1L;
            crashDetailBean.R = -1;
            crashDetailBean.S = -1;
            crashDetailBean.T = map;
            crashDetailBean.U = this.f4799c.g();
            crashDetailBean.f4678z = null;
            if (str == null) {
                crashDetailBean.A = "unknown(record)";
            }
            if (bArr != null) {
                crashDetailBean.f4677y = bArr;
            }
            return crashDetailBean;
        }
        crashDetailBean.C = com.tencent.bugly.crashreport.common.info.b.h();
        crashDetailBean.D = com.tencent.bugly.crashreport.common.info.b.j();
        crashDetailBean.E = com.tencent.bugly.crashreport.common.info.b.g();
        if (crashDetailBean.f4675w == null) {
            crashDetailBean.f4675w = ca.a(this.f4797a, h.f4741e, h.f4744h);
        }
        crashDetailBean.f4677y = ba.b();
        a aVar2 = this.f4799c;
        crashDetailBean.N = aVar2.f4569d;
        crashDetailBean.O = aVar2.C();
        crashDetailBean.f4678z = ca.a(h.f4742f, false);
        int iIndexOf2 = crashDetailBean.f4669q.indexOf("java:\n");
        if (iIndexOf2 > 0 && (i10 = iIndexOf2 + 6) < crashDetailBean.f4669q.length()) {
            String str14 = crashDetailBean.f4669q;
            String strSubstring = str14.substring(i10, str14.length() - 1);
            if (strSubstring.length() > 0 && crashDetailBean.f4678z.containsKey(crashDetailBean.B) && (iIndexOf = (str12 = crashDetailBean.f4678z.get(crashDetailBean.B)).indexOf(strSubstring)) > 0) {
                String strSubstring2 = str12.substring(iIndexOf);
                crashDetailBean.f4678z.put(crashDetailBean.B, strSubstring2);
                crashDetailBean.f4669q = crashDetailBean.f4669q.substring(0, i10);
                crashDetailBean.f4669q = h0.n(new StringBuilder(), crashDetailBean.f4669q, strSubstring2);
            }
        }
        if (str == null) {
            crashDetailBean.A = this.f4799c.f4576h;
        }
        this.f4798b.d(crashDetailBean);
        crashDetailBean.R = this.f4799c.A();
        crashDetailBean.S = this.f4799c.t();
        crashDetailBean.T = this.f4799c.h();
        crashDetailBean.U = this.f4799c.g();
        return crashDetailBean;
    }
}
