package com.tencent.bugly.crashreport.crash.jni;

import android.content.Context;
import android.os.Build;
import c7.r;
import com.tencent.bugly.crashreport.common.info.a;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.e;
import com.tencent.bugly.crashreport.crash.h;
import com.tencent.bugly.proguard.W;
import com.tencent.bugly.proguard.X;
import com.tencent.bugly.proguard.ca;
import java.io.File;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class NativeCrashHandler implements com.tencent.bugly.crashreport.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static NativeCrashHandler f4781a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f4782b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f4783c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f4784d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f4785e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Context f4786f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a f4787g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final W f4788h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private NativeExceptionHandler f4789i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f4790j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f4791k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f4792l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f4793m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f4794n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f4795o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private e f4796p;

    public NativeCrashHandler(Context context, a aVar, e eVar, com.tencent.bugly.crashreport.common.strategy.c cVar, W w10, boolean z10, String str) {
        this.f4786f = ca.a(context);
        try {
            if (ca.b(str)) {
                str = context.getDir("bugly", 0).getAbsolutePath();
            }
        } catch (Throwable unused) {
            str = t0.D("/data/data/", a.a(context).f4575g, "/app_bugly");
        }
        this.f4796p = eVar;
        this.f4790j = str;
        this.f4787g = aVar;
        this.f4788h = w10;
        this.f4791k = z10;
        this.f4789i = new b(context, aVar, eVar, com.tencent.bugly.crashreport.common.strategy.c.b());
    }

    public static synchronized NativeCrashHandler getInstance(Context context, a aVar, e eVar, com.tencent.bugly.crashreport.common.strategy.c cVar, W w10, boolean z10, String str) {
        try {
            if (f4781a == null) {
                f4781a = new NativeCrashHandler(context, aVar, eVar, cVar, w10, z10, str);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f4781a;
    }

    public static boolean isShouldHandleInJava() {
        return f4785e;
    }

    public static void setShouldHandleInJava(boolean z10) {
        f4785e = z10;
        NativeCrashHandler nativeCrashHandler = f4781a;
        if (nativeCrashHandler != null) {
            nativeCrashHandler.a(999, "" + z10);
        }
    }

    @Override // com.tencent.bugly.crashreport.b
    public boolean appendLogToNative(String str, String str2, String str3) {
        if ((this.f4792l || this.f4793m) && f4783c && str != null && str2 != null && str3 != null) {
            try {
                if (this.f4793m) {
                    return appendNativeLog(str, str2, str3);
                }
                Boolean bool = (Boolean) ca.a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "appendNativeLog", null, new Class[]{String.class, String.class, String.class}, new Object[]{str, str2, str3});
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (UnsatisfiedLinkError unused) {
                f4783c = false;
            } catch (Throwable th2) {
                if (!X.b(th2)) {
                    th2.printStackTrace();
                }
                return false;
            }
        }
        return false;
    }

    public native boolean appendNativeLog(String str, String str2, String str3);

    public native boolean appendWholeNativeLog(String str);

    public void checkUploadRecordCrash() {
        this.f4788h.a(new r(9, this));
    }

    public void dumpAnrNativeStack() {
        a(19, "1");
    }

    public void enableCatchAnrTrace() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 30 || i10 < 23) {
            return;
        }
        f4782b |= 2;
    }

    public boolean filterSigabrtSysLog() {
        return a(998, "true");
    }

    public synchronized String getDumpFilePath() {
        return this.f4790j;
    }

    @Override // com.tencent.bugly.crashreport.b
    public String getLogFromNative() {
        if ((!this.f4792l && !this.f4793m) || !f4783c) {
            return null;
        }
        try {
            return this.f4793m ? getNativeLog() : (String) ca.a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "getNativeLog", null, null, null);
        } catch (UnsatisfiedLinkError unused) {
            f4783c = false;
            return null;
        } catch (Throwable th2) {
            if (!X.b(th2)) {
                th2.printStackTrace();
            }
            return null;
        }
    }

    public NativeExceptionHandler getNativeExceptionHandler() {
        return this.f4789i;
    }

    public native String getNativeKeyValueList();

    public native String getNativeLog();

    public boolean isEnableCatchAnrTrace() {
        return (f4782b & 2) == 2;
    }

    public synchronized boolean isUserOpened() {
        return this.f4795o;
    }

    public synchronized void onStrategyChanged(StrategyBean strategyBean) {
        if (strategyBean != null) {
            try {
                boolean z10 = strategyBean.f4622f;
                if (z10 != this.f4794n) {
                    X.e("server native changed to %b", Boolean.valueOf(z10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        boolean z11 = com.tencent.bugly.crashreport.common.strategy.c.b().c().f4622f && this.f4795o;
        if (z11 != this.f4794n) {
            X.c("native changed to %b", Boolean.valueOf(z11));
            b(z11);
        }
    }

    public boolean putKeyValueToNative(String str, String str2) {
        if ((this.f4792l || this.f4793m) && f4783c && str != null && str2 != null) {
            try {
                if (this.f4793m) {
                    return putNativeKeyValue(str, str2);
                }
                Boolean bool = (Boolean) ca.a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "putNativeKeyValue", null, new Class[]{String.class, String.class}, new Object[]{str, str2});
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (UnsatisfiedLinkError unused) {
                f4783c = false;
            } catch (Throwable th2) {
                if (!X.b(th2)) {
                    th2.printStackTrace();
                }
                return false;
            }
        }
        return false;
    }

    public native boolean putNativeKeyValue(String str, String str2);

    public native String regist(String str, boolean z10, int i10);

    public void removeEmptyNativeRecordFiles() {
        c.b(this.f4790j);
    }

    public native String removeNativeKeyValue(String str);

    public synchronized void setDumpFilePath(String str) {
        this.f4790j = str;
    }

    public boolean setNativeAppChannel(String str) {
        return a(12, str);
    }

    public boolean setNativeAppPackage(String str) {
        return a(13, str);
    }

    public boolean setNativeAppVersion(String str) {
        return a(10, str);
    }

    public native void setNativeInfo(int i10, String str);

    @Override // com.tencent.bugly.crashreport.b
    public boolean setNativeIsAppForeground(boolean z10) {
        return a(14, z10 ? "true" : "false");
    }

    public boolean setNativeLaunchTime(long j10) {
        try {
            return a(15, String.valueOf(j10));
        } catch (NumberFormatException e10) {
            if (X.b(e10)) {
                return false;
            }
            e10.printStackTrace();
            return false;
        }
    }

    public boolean setNativeUserId(String str) {
        return a(11, str);
    }

    public synchronized void setUserOpened(boolean z10) {
        try {
            c(z10);
            boolean zIsUserOpened = isUserOpened();
            com.tencent.bugly.crashreport.common.strategy.c cVarB = com.tencent.bugly.crashreport.common.strategy.c.b();
            if (cVarB != null) {
                zIsUserOpened = zIsUserOpened && cVarB.c().f4622f;
            }
            if (zIsUserOpened != this.f4794n) {
                X.c("native changed to %b", Boolean.valueOf(zIsUserOpened));
                b(zIsUserOpened);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void startNativeMonitor() {
        try {
            if (!this.f4793m && !this.f4792l) {
                String str = "Bugly";
                boolean zB = ca.b(this.f4787g.L);
                boolean z10 = !zB;
                if (h.f4738b) {
                    boolean zA = a(!zB ? this.f4787g.L : "Bugly-rqd", z10);
                    this.f4793m = zA;
                    if (!zA && zB) {
                        this.f4792l = a("NativeRQD", false);
                    }
                } else {
                    String str2 = this.f4787g.L;
                    if (!zB) {
                        str = str2;
                    }
                    this.f4793m = a(str, z10);
                }
                if (this.f4793m || this.f4792l) {
                    a(this.f4791k);
                    if (f4783c) {
                        setNativeAppVersion(this.f4787g.E);
                        setNativeAppChannel(this.f4787g.I);
                        setNativeAppPackage(this.f4787g.f4575g);
                        setNativeUserId(this.f4787g.y());
                        setNativeIsAppForeground(this.f4787g.C());
                        setNativeLaunchTime(this.f4787g.f4569d);
                    }
                    return;
                }
                return;
            }
            a(this.f4791k);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public native void testCrash();

    public void testNativeCrash() {
        if (this.f4793m) {
            testCrash();
        } else {
            X.e("[Native] Bugly SO file has not been load.", new Object[0]);
        }
    }

    public native String unregist();

    public void b() {
        long jB = ca.b() - h.f4743g;
        long jB2 = ca.b() + 86400000;
        File file = new File(this.f4790j);
        if (file.exists() && file.isDirectory()) {
            try {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                    int i10 = 0;
                    int i11 = 0;
                    for (File file2 : fileArrListFiles) {
                        long jLastModified = file2.lastModified();
                        if (jLastModified < jB || jLastModified >= jB2) {
                            X.c("[Native] Delete record file: %s", file2.getAbsolutePath());
                            i10++;
                            if (file2.delete()) {
                                i11++;
                            }
                        }
                    }
                    X.a("[Native] Number of record files overdue: %d, has deleted: %d", Integer.valueOf(i10), Integer.valueOf(i11));
                }
            } catch (Throwable th2) {
                X.b(th2);
            }
        }
    }

    public synchronized void c() {
        if (!this.f4794n) {
            X.e("[Native] Native crash report has already unregistered.", new Object[0]);
            return;
        }
        try {
        } catch (Throwable unused) {
            X.a("[Native] Failed to close native crash report.", new Object[0]);
        }
        if (unregist() != null) {
            X.c("[Native] Successfully closed native crash report.", new Object[0]);
            this.f4794n = false;
            return;
        }
        try {
            ca.a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "enableHandler", null, new Class[]{Boolean.TYPE}, new Object[]{Boolean.FALSE});
            this.f4794n = false;
            X.c("[Native] Successfully closed native crash report.", new Object[0]);
            return;
        } catch (Throwable unused2) {
            X.a("[Native] Failed to close native crash report.", new Object[0]);
            this.f4793m = false;
            this.f4792l = false;
            return;
        }
    }

    private static void a(String str) {
        X.a("[Native] Check extra jni for Bugly NDK v%s", str);
        String strReplace = "2.1.1".replace(".", "");
        String strReplace2 = "2.3.0".replace(".", "");
        String strReplace3 = str.replace(".", "");
        if (strReplace3.length() == 2) {
            strReplace3 = strReplace3.concat("0");
        } else if (strReplace3.length() == 1) {
            strReplace3 = strReplace3.concat("00");
        }
        try {
            if (Integer.parseInt(strReplace3) >= Integer.parseInt(strReplace)) {
                f4783c = true;
            }
            if (Integer.parseInt(strReplace3) >= Integer.parseInt(strReplace2)) {
                f4784d = true;
            }
        } catch (Throwable unused) {
        }
        if (f4784d) {
            X.c("[Native] Info setting jni can be accessed.", new Object[0]);
        } else {
            X.e("[Native] Info setting jni can not be accessed.", new Object[0]);
        }
        if (f4783c) {
            X.c("[Native] Extra jni can be accessed.", new Object[0]);
        } else {
            X.e("[Native] Extra jni can not be accessed.", new Object[0]);
        }
    }

    public static synchronized NativeCrashHandler getInstance() {
        return f4781a;
    }

    public void testNativeCrash(boolean z10, boolean z11, boolean z12) {
        a(16, "" + z10);
        a(17, "" + z11);
        a(18, "" + z12);
        testNativeCrash();
    }

    private synchronized void c(boolean z10) {
        if (this.f4795o != z10) {
            X.c("user change native %b", Boolean.valueOf(z10));
            this.f4795o = z10;
        }
    }

    public synchronized void b(boolean z10) {
        try {
            if (z10) {
                startNativeMonitor();
            } else {
                c();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void a(boolean z10) {
        if (this.f4794n) {
            X.e("[Native] Native crash report has already registered.", new Object[0]);
            return;
        }
        if (this.f4793m) {
            try {
                String strRegist = regist(this.f4790j, z10, f4782b);
                if (strRegist != null) {
                    X.c("[Native] Native Crash Report enable.", new Object[0]);
                    a(strRegist);
                    this.f4787g.M = strRegist;
                    String strConcat = "-".concat(strRegist);
                    if (!h.f4738b && !this.f4787g.f4584l.contains(strConcat)) {
                        a aVar = this.f4787g;
                        aVar.f4584l = aVar.f4584l.concat("-").concat(this.f4787g.M);
                    }
                    X.c("comInfo.sdkVersion %s", this.f4787g.f4584l);
                    this.f4794n = true;
                    return;
                }
            } catch (Throwable unused) {
                X.a("[Native] Failed to load Bugly SO file.", new Object[0]);
            }
        } else if (this.f4792l) {
            try {
                Class cls = Integer.TYPE;
                String str = (String) ca.a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "registNativeExceptionHandler2", null, new Class[]{String.class, String.class, cls, cls}, new Object[]{this.f4790j, com.tencent.bugly.crashreport.common.info.b.a(this.f4786f, false), Integer.valueOf(z10 ? 1 : 5), 1});
                if (str == null) {
                    str = (String) ca.a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "registNativeExceptionHandler", null, new Class[]{String.class, String.class, cls}, new Object[]{this.f4790j, com.tencent.bugly.crashreport.common.info.b.a(this.f4786f, false), Integer.valueOf(a.m().d())});
                }
                if (str != null) {
                    this.f4794n = true;
                    this.f4787g.M = str;
                    Boolean bool = (Boolean) ca.a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "checkExtraJni", null, new Class[]{String.class}, new Object[]{str});
                    if (bool != null) {
                        f4783c = bool.booleanValue();
                    }
                    ca.a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "enableHandler", null, new Class[]{Boolean.TYPE}, new Object[]{Boolean.TRUE});
                    ca.a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "setLogMode", null, new Class[]{cls}, new Object[]{Integer.valueOf(z10 ? 1 : 5)});
                    return;
                }
            } catch (Throwable unused2) {
            }
        }
        this.f4793m = false;
        this.f4792l = false;
    }

    private boolean a(String str, boolean z10) {
        boolean z11;
        try {
            X.c("[Native] Trying to load so: %s", str);
            if (z10) {
                System.load(str);
            } else {
                System.loadLibrary(str);
            }
            try {
                X.c("[Native] Successfully loaded SO: %s", str);
                return true;
            } catch (Throwable th2) {
                th = th2;
                z11 = true;
                X.e(th.getMessage(), new Object[0]);
                X.e("[Native] Failed to load so: %s", str);
                return z11;
            }
        } catch (Throwable th3) {
            th = th3;
            z11 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i10, String str) {
        if (this.f4793m && f4784d) {
            try {
                setNativeInfo(i10, str);
                return true;
            } catch (UnsatisfiedLinkError unused) {
                f4784d = false;
            } catch (Throwable th2) {
                if (!X.b(th2)) {
                    th2.printStackTrace();
                }
                return false;
            }
        }
        return false;
    }
}
