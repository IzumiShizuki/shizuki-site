package com.tencent.bugly.crashreport.common.info;

import a0.c;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import com.tencent.bugly.proguard.X;
import com.tencent.bugly.proguard.ca;
import j2.h0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f4612a = {"/su", "/su/bin/su", "/sbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/data/local/su", "/system/xbin/su", "/system/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/system/bin/cufsdosck", "/system/xbin/cufsdosck", "/system/bin/cufsmgr", "/system/xbin/cufsmgr", "/system/bin/cufaevdd", "/system/xbin/cufaevdd", "/system/bin/conbb", "/system/xbin/conbb"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f4613b = {"com.ami.duosupdater.ui", "com.ami.launchmetro", "com.ami.syncduosservices", "com.bluestacks.home", "com.bluestacks.windowsfilemanager", "com.bluestacks.settings", "com.bluestacks.bluestackslocationprovider", "com.bluestacks.appsettings", "com.bluestacks.bstfolder", "com.bluestacks.BstCommandProcessor", "com.bluestacks.s2p", "com.bluestacks.setup", "com.kaopu001.tiantianserver", "com.kpzs.helpercenter", "com.kaopu001.tiantianime", "com.android.development_settings", "com.android.development", "com.android.customlocale2", "com.genymotion.superuser", "com.genymotion.clipboardproxy", "com.uc.xxzs.keyboard", "com.uc.xxzs", "com.blue.huang17.agent", "com.blue.huang17.launcher", "com.blue.huang17.ime", "com.microvirt.guide", "com.microvirt.market", "com.microvirt.memuime", "cn.itools.vm.launcher", "cn.itools.vm.proxy", "cn.itools.vm.softkeyboard", "cn.itools.avdmarket", "com.syd.IME", "com.bignox.app.store.hd", "com.bignox.launcher", "com.bignox.app.phone", "com.bignox.app.noxservice", "com.android.noxpush", "com.haimawan.push", "me.haima.helpcenter", "com.windroy.launcher", "com.windroy.superuser", "com.windroy.launcher", "com.windroy.ime", "com.android.flysilkworm", "com.android.emu.inputservice", "com.tiantian.ime", "com.microvirt.launcher", "me.le8.androidassist", "com.vphone.helper", "com.vphone.launcher", "com.duoyi.giftcenter.giftcenter"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f4614c = {"/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq", "/system/lib/libc_malloc_debug_qemu.so", "/sys/qemu_trace", "/system/bin/qemu-props", "/dev/socket/qemud", "/dev/qemu_pipe", "/dev/socket/baseband_genyd", "/dev/socket/genyd"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f4615d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f4616e = null;

    public static String a(Context context) {
        if (context == null) {
            return "fail";
        }
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            return string == null ? "null" : string.toLowerCase();
        } catch (Throwable th2) {
            if (!X.b(th2)) {
                X.c("Failed to get Android ID.", new Object[0]);
            }
            return "fail";
        }
    }

    public static String b(Context context) {
        return ca.a(context, "ro.board.platform");
    }

    public static int c() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (Throwable th2) {
            if (X.b(th2)) {
                return -1;
            }
            th2.printStackTrace();
            return -1;
        }
    }

    public static String d() {
        try {
            return Build.BRAND;
        } catch (Throwable th2) {
            if (X.b(th2)) {
                return "fail";
            }
            th2.printStackTrace();
            return "fail";
        }
    }

    public static String e() {
        return "";
    }

    public static String f() {
        try {
            return Build.MODEL;
        } catch (Throwable th2) {
            if (X.b(th2)) {
                return "fail";
            }
            th2.printStackTrace();
            return "fail";
        }
    }

    public static long g() {
        if (!a()) {
            return 0L;
        }
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (Throwable th2) {
            if (X.b(th2)) {
                return -2L;
            }
            th2.printStackTrace();
            return -2L;
        }
    }

    public static long h() {
        FileReader fileReader;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("/proc/meminfo");
            try {
                BufferedReader bufferedReader2 = new BufferedReader(fileReader, 2048);
                try {
                    bufferedReader2.readLine();
                    String line = bufferedReader2.readLine();
                    if (line == null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e10) {
                            if (!X.b(e10)) {
                                e10.printStackTrace();
                            }
                        }
                        try {
                            fileReader.close();
                        } catch (IOException e11) {
                            if (!X.b(e11)) {
                                e11.printStackTrace();
                            }
                        }
                        return -1L;
                    }
                    long j10 = Long.parseLong(line.split(":\\s+", 2)[1].toLowerCase().replace("kb", "").trim()) * 1024;
                    String line2 = bufferedReader2.readLine();
                    if (line2 == null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e12) {
                            if (!X.b(e12)) {
                                e12.printStackTrace();
                            }
                        }
                        try {
                            fileReader.close();
                        } catch (IOException e13) {
                            if (!X.b(e13)) {
                                e13.printStackTrace();
                            }
                        }
                        return -1L;
                    }
                    long j11 = Long.parseLong(line2.split(":\\s+", 2)[1].toLowerCase().replace("kb", "").trim());
                    Long.signum(j11);
                    long j12 = (j11 * 1024) + j10;
                    String line3 = bufferedReader2.readLine();
                    if (line3 == null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e14) {
                            if (!X.b(e14)) {
                                e14.printStackTrace();
                            }
                        }
                        try {
                            fileReader.close();
                        } catch (IOException e15) {
                            if (!X.b(e15)) {
                                e15.printStackTrace();
                            }
                        }
                        return -1L;
                    }
                    long j13 = (Long.parseLong(line3.split(":\\s+", 2)[1].toLowerCase().replace("kb", "").trim()) * 1024) + j12;
                    try {
                        bufferedReader2.close();
                    } catch (IOException e16) {
                        if (!X.b(e16)) {
                            e16.printStackTrace();
                        }
                    }
                    try {
                        fileReader.close();
                    } catch (IOException e17) {
                        if (!X.b(e17)) {
                            e17.printStackTrace();
                        }
                    }
                    return j13;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    try {
                        if (!X.b(th)) {
                            th.printStackTrace();
                        }
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e18) {
                                if (!X.b(e18)) {
                                    e18.printStackTrace();
                                }
                            }
                        }
                        if (fileReader == null) {
                            return -2L;
                        }
                        try {
                            fileReader.close();
                            return -2L;
                        } catch (IOException e19) {
                            if (X.b(e19)) {
                                return -2L;
                            }
                            e19.printStackTrace();
                            return -2L;
                        }
                    } catch (Throwable th3) {
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e20) {
                                if (!X.b(e20)) {
                                    e20.printStackTrace();
                                }
                            }
                        }
                        if (fileReader != null) {
                            try {
                                fileReader.close();
                            } catch (IOException e21) {
                                if (!X.b(e21)) {
                                    e21.printStackTrace();
                                }
                            }
                        }
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            fileReader = null;
        }
    }

    public static long i() {
        FileReader fileReader;
        Throwable th2;
        BufferedReader bufferedReader;
        try {
            fileReader = new FileReader("/proc/meminfo");
            try {
                bufferedReader = new BufferedReader(fileReader, 2048);
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        long j10 = Long.parseLong(line.split(":\\s+", 2)[1].toLowerCase().replace("kb", "").trim()) * 1024;
                        try {
                            bufferedReader.close();
                        } catch (IOException e10) {
                            if (!X.b(e10)) {
                                e10.printStackTrace();
                            }
                        }
                        try {
                            fileReader.close();
                        } catch (IOException e11) {
                            if (!X.b(e11)) {
                                e11.printStackTrace();
                            }
                        }
                        return j10;
                    }
                    try {
                        bufferedReader.close();
                    } catch (IOException e12) {
                        if (!X.b(e12)) {
                            e12.printStackTrace();
                        }
                    }
                    try {
                        fileReader.close();
                        return -1L;
                    } catch (IOException e13) {
                        if (X.b(e13)) {
                            return -1L;
                        }
                        e13.printStackTrace();
                        return -1L;
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    try {
                        if (!X.b(th2)) {
                            th2.printStackTrace();
                        }
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e14) {
                                if (!X.b(e14)) {
                                    e14.printStackTrace();
                                }
                            }
                        }
                        if (fileReader == null) {
                            return -2L;
                        }
                        try {
                            fileReader.close();
                            return -2L;
                        } catch (IOException e15) {
                            if (X.b(e15)) {
                                return -2L;
                            }
                            e15.printStackTrace();
                            return -2L;
                        }
                    } catch (Throwable th4) {
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e16) {
                                if (!X.b(e16)) {
                                    e16.printStackTrace();
                                }
                            }
                        }
                        if (fileReader != null) {
                            try {
                                fileReader.close();
                            } catch (IOException e17) {
                                if (!X.b(e17)) {
                                    e17.printStackTrace();
                                }
                            }
                        }
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                th2 = th5;
                bufferedReader = null;
            }
        } catch (Throwable th6) {
            fileReader = null;
            th2 = th6;
            bufferedReader = null;
        }
    }

    public static long j() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (Throwable th2) {
            if (X.b(th2)) {
                return -1L;
            }
            th2.printStackTrace();
            return -1L;
        }
    }

    public static long k() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (Throwable th2) {
            if (X.b(th2)) {
                return -1L;
            }
            th2.printStackTrace();
            return -1L;
        }
    }

    public static long l() {
        if (!a()) {
            return 0L;
        }
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (Throwable th2) {
            if (X.b(th2)) {
                return -2L;
            }
            th2.printStackTrace();
            return -2L;
        }
    }

    public static String m() {
        try {
            return Build.VERSION.RELEASE;
        } catch (Throwable th2) {
            if (X.b(th2)) {
                return "fail";
            }
            th2.printStackTrace();
            return "fail";
        }
    }

    public static String n() {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            String[] strArr = f4614c;
            if (i10 >= strArr.length) {
                break;
            }
            if (i10 == 0) {
                if (!new File(strArr[i10]).exists()) {
                    arrayList.add(Integer.valueOf(i10));
                }
            } else if (new File(strArr[i10]).exists()) {
                arrayList.add(Integer.valueOf(i10));
            }
            i10++;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.toString();
    }

    public static int o() {
        try {
            Method method = Class.forName("android.app.ActivityManagerNative").getMethod("getDefault", null);
            method.setAccessible(true);
            return method.invoke(null, null).getClass().getName().startsWith("$Proxy") ? 256 : 0;
        } catch (Exception unused) {
            return 256;
        }
    }

    public static int p() throws Throwable {
        int i10 = 0;
        BufferedReader bufferedReader = null;
        try {
            try {
                try {
                    HashSet hashSet = new HashSet();
                    StringBuilder sb = new StringBuilder("/proc/");
                    sb.append(Process.myPid());
                    sb.append("/maps");
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(sb.toString()), "utf-8"));
                    while (true) {
                        try {
                            String line = bufferedReader2.readLine();
                            if (line == null) {
                                break;
                            }
                            if (line.endsWith(".so") || line.endsWith(".jar")) {
                                hashSet.add(line.substring(line.lastIndexOf(" ") + 1));
                            }
                        } catch (FileNotFoundException e10) {
                            e = e10;
                            bufferedReader = bufferedReader2;
                            e.printStackTrace();
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return i10;
                        } catch (UnsupportedEncodingException e11) {
                            e = e11;
                            bufferedReader = bufferedReader2;
                            e.printStackTrace();
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return i10;
                        } catch (IOException e12) {
                            e = e12;
                            bufferedReader = bufferedReader2;
                            e.printStackTrace();
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return i10;
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e13) {
                                    e13.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    }
                    for (Object obj : hashSet) {
                        if (((String) obj).toLowerCase().contains("xposed")) {
                            i10 |= 64;
                        }
                        if (((String) obj).contains("com.saurik.substrate")) {
                            i10 |= 128;
                        }
                    }
                    bufferedReader2.close();
                    return i10;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (FileNotFoundException e14) {
                e = e14;
            } catch (UnsupportedEncodingException e15) {
                e = e15;
            } catch (IOException e16) {
                e = e16;
            }
        } catch (IOException e17) {
            e17.printStackTrace();
        }
    }

    public static boolean q() {
        boolean z10;
        String[] strArr = f4612a;
        int length = strArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                z10 = false;
                break;
            }
            if (new File(strArr[i10]).exists()) {
                z10 = true;
                break;
            }
            i10++;
        }
        String str = Build.TAGS;
        return (str != null && str.contains("test-keys")) || z10;
    }

    public static int b() {
        try {
            throw new Exception("detect hook");
        } catch (Exception e10) {
            int i10 = 0;
            int i11 = 0;
            for (StackTraceElement stackTraceElement : e10.getStackTrace()) {
                if (stackTraceElement.getClassName().equals("de.robv.android.xposed.XposedBridge") && stackTraceElement.getMethodName().equals("main")) {
                    i10 |= 4;
                }
                if (stackTraceElement.getClassName().equals("de.robv.android.xposed.XposedBridge") && stackTraceElement.getMethodName().equals("handleHookedMethod")) {
                    i10 |= 8;
                }
                if (stackTraceElement.getClassName().equals("com.saurik.substrate.MS$2") && stackTraceElement.getMethodName().equals("invoked")) {
                    i10 |= 16;
                }
                if (stackTraceElement.getClassName().equals("com.android.internal.os.ZygoteInit") && (i11 = i11 + 1) == 2) {
                    i10 |= 32;
                }
            }
            return i10;
        }
    }

    public static String e(Context context) {
        PackageManager packageManager = context.getPackageManager();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            String[] strArr = f4613b;
            if (i10 >= strArr.length) {
                break;
            }
            try {
                packageManager.getPackageInfo(strArr[i10], 1);
                arrayList.add(Integer.valueOf(i10));
            } catch (PackageManager.NameNotFoundException unused) {
            }
            i10++;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String c(android.content.Context r4) {
        /*
            java.lang.String r0 = "MOBILE("
            java.lang.String r1 = "connectivity"
            java.lang.Object r1 = r4.getSystemService(r1)     // Catch: java.lang.Exception -> L73
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1     // Catch: java.lang.Exception -> L73
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()     // Catch: java.lang.Exception -> L73
            if (r1 != 0) goto L12
            r4 = 0
            return r4
        L12:
            int r2 = r1.getType()     // Catch: java.lang.Exception -> L73
            r3 = 1
            if (r2 != r3) goto L1d
            java.lang.String r4 = "WIFI"
            goto L7f
        L1d:
            int r1 = r1.getType()     // Catch: java.lang.Exception -> L73
            if (r1 != 0) goto L7d
            java.lang.String r1 = "phone"
            java.lang.Object r4 = r4.getSystemService(r1)     // Catch: java.lang.Exception -> L73
            android.telephony.TelephonyManager r4 = (android.telephony.TelephonyManager) r4     // Catch: java.lang.Exception -> L73
            if (r4 == 0) goto L7d
            int r4 = r4.getNetworkType()     // Catch: java.lang.Exception -> L73
            switch(r4) {
                case 1: goto L70;
                case 2: goto L6d;
                case 3: goto L6a;
                case 4: goto L67;
                case 5: goto L64;
                case 6: goto L61;
                case 7: goto L5e;
                case 8: goto L5b;
                case 9: goto L58;
                case 10: goto L55;
                case 11: goto L52;
                case 12: goto L4f;
                case 13: goto L4c;
                case 14: goto L49;
                case 15: goto L46;
                default: goto L34;
            }     // Catch: java.lang.Exception -> L73
        L34:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L73
            r1.<init>(r0)     // Catch: java.lang.Exception -> L73
            r1.append(r4)     // Catch: java.lang.Exception -> L73
            java.lang.String r4 = ")"
            r1.append(r4)     // Catch: java.lang.Exception -> L73
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Exception -> L73
            return r4
        L46:
            java.lang.String r4 = "HSPA+"
            goto L7f
        L49:
            java.lang.String r4 = "eHRPD"
            goto L7f
        L4c:
            java.lang.String r4 = "LTE"
            goto L7f
        L4f:
            java.lang.String r4 = "EVDO_B"
            goto L7f
        L52:
            java.lang.String r4 = "iDen"
            goto L7f
        L55:
            java.lang.String r4 = "HSPA"
            goto L7f
        L58:
            java.lang.String r4 = "HSUPA"
            goto L7f
        L5b:
            java.lang.String r4 = "HSDPA"
            goto L7f
        L5e:
            java.lang.String r4 = "1xRTT"
            goto L7f
        L61:
            java.lang.String r4 = "EVDO_A"
            goto L7f
        L64:
            java.lang.String r4 = "EVDO_0"
            goto L7f
        L67:
            java.lang.String r4 = "CDMA"
            goto L7f
        L6a:
            java.lang.String r4 = "UMTS"
            goto L7f
        L6d:
            java.lang.String r4 = "EDGE"
            goto L7f
        L70:
            java.lang.String r4 = "GPRS"
            goto L7f
        L73:
            r4 = move-exception
            boolean r0 = com.tencent.bugly.proguard.X.b(r4)
            if (r0 != 0) goto L7d
            r4.printStackTrace()
        L7d:
            java.lang.String r4 = "unknown"
        L7f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.common.info.b.c(android.content.Context):java.lang.String");
    }

    public static String d(Context context) {
        String strA = ca.a(context, "ro.miui.ui.version.name");
        if (!ca.b(strA) && !strA.equals("fail")) {
            return "XiaoMi/MIUI/".concat(strA);
        }
        String strA2 = ca.a(context, "ro.build.version.emui");
        if (!ca.b(strA2) && !strA2.equals("fail")) {
            return "HuaWei/EMOTION/".concat(strA2);
        }
        String strA3 = ca.a(context, "ro.lenovo.series");
        if (!ca.b(strA3) && !strA3.equals("fail")) {
            return h0.x("Lenovo/VIBE/", ca.a(context, "ro.build.version.incremental"));
        }
        String strA4 = ca.a(context, "ro.build.nubia.rom.name");
        if (!ca.b(strA4) && !strA4.equals("fail")) {
            StringBuilder sbK = c.K("Zte/NUBIA/", strA4, "_");
            sbK.append(ca.a(context, "ro.build.nubia.rom.code"));
            return sbK.toString();
        }
        String strA5 = ca.a(context, "ro.meizu.product.model");
        if (!ca.b(strA5) && !strA5.equals("fail")) {
            return "Meizu/FLYME/" + ca.a(context, "ro.build.display.id");
        }
        String strA6 = ca.a(context, "ro.build.version.opporom");
        if (!ca.b(strA6) && !strA6.equals("fail")) {
            return "Oppo/COLOROS/".concat(strA6);
        }
        String strA7 = ca.a(context, "ro.vivo.os.build.display.id");
        if (!ca.b(strA7) && !strA7.equals("fail")) {
            return "vivo/FUNTOUCH/".concat(strA7);
        }
        String strA8 = ca.a(context, "ro.aa.romver");
        if (!ca.b(strA8) && !strA8.equals("fail")) {
            StringBuilder sbK2 = c.K("htc/", strA8, "/");
            sbK2.append(ca.a(context, "ro.build.description"));
            return sbK2.toString();
        }
        String strA9 = ca.a(context, "ro.lewa.version");
        if (!ca.b(strA9) && !strA9.equals("fail")) {
            StringBuilder sbK3 = c.K("tcl/", strA9, "/");
            sbK3.append(ca.a(context, "ro.build.display.id"));
            return sbK3.toString();
        }
        String strA10 = ca.a(context, "ro.gn.gnromvernumber");
        if (!ca.b(strA10) && !strA10.equals("fail")) {
            StringBuilder sbK4 = c.K("amigo/", strA10, "/");
            sbK4.append(ca.a(context, "ro.build.display.id"));
            return sbK4.toString();
        }
        String strA11 = ca.a(context, "ro.build.tyd.kbstyle_version");
        if (!ca.b(strA11) && !strA11.equals("fail")) {
            return "dido/".concat(strA11);
        }
        return ca.a(context, "ro.build.fingerprint") + "/" + ca.a(context, "ro.build.rom.id");
    }

    public static boolean f(Context context) {
        return (((g(context) | b()) | p()) | o()) > 0;
    }

    public static boolean a() {
        try {
            return Environment.getExternalStorageState().equals("mounted");
        } catch (Throwable th2) {
            if (X.b(th2)) {
                return false;
            }
            th2.printStackTrace();
            return false;
        }
    }

    public static int g(Context context) {
        int i10;
        PackageManager packageManager = context.getPackageManager();
        try {
            packageManager.getInstallerPackageName("de.robv.android.xposed.installer");
            i10 = 1;
        } catch (Exception unused) {
            i10 = 0;
        }
        try {
            packageManager.getInstallerPackageName("com.saurik.substrate");
            return i10 | 2;
        } catch (Exception unused2) {
            return i10;
        }
    }

    public static String a(Context context, boolean z10) {
        String property = null;
        if (z10) {
            try {
                String strA = ca.a(context, "ro.product.cpu.abilist");
                if (ca.b(strA) || strA.equals("fail")) {
                    strA = ca.a(context, "ro.product.cpu.abi");
                }
                if (!ca.b(strA) && !strA.equals("fail")) {
                    X.a(b.class, "ABI list: ".concat(strA), new Object[0]);
                    property = strA.split(",")[0];
                }
            } catch (Throwable th2) {
                if (!X.b(th2)) {
                    th2.printStackTrace();
                }
                return "fail";
            }
        }
        if (property == null) {
            property = System.getProperty("os.arch");
        }
        return "" + property;
    }

    public static boolean i(Context context) {
        float fMaxMemory = (float) ((Runtime.getRuntime().maxMemory() * 1.0d) / 1048576.0d);
        float f10 = (float) ((Runtime.getRuntime().totalMemory() * 1.0d) / 1048576.0d);
        float f11 = fMaxMemory - f10;
        X.a("maxMemory : %f", Float.valueOf(fMaxMemory));
        X.a("totalMemory : %f", Float.valueOf(f10));
        X.a("freeMemory : %f", Float.valueOf(f11));
        return f11 < 10.0f;
    }

    public static boolean h(Context context) {
        return (e(context) == null && n() == null) ? false : true;
    }
}
