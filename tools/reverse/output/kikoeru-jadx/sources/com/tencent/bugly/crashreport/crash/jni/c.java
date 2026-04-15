package com.tencent.bugly.crashreport.crash.jni;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.bugly.crashreport.common.info.a;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.proguard.X;
import com.tencent.bugly.proguard.ca;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static List<File> f4801a = new ArrayList();

    public static String a(String str) {
        if (str == null) {
            return "";
        }
        String[] strArrSplit = str.split("\n");
        if (strArrSplit == null || strArrSplit.length == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrSplit) {
            if (!str2.contains("java.lang.Thread.getStackTrace(")) {
                sb.append(str2);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    private static String b(String str, String str2) {
        BufferedReader bufferedReaderA = ca.a(str, "map_record.txt");
        if (bufferedReaderA == null) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            String line = bufferedReaderA.readLine();
            if (line != null && line.startsWith(str2)) {
                while (true) {
                    String line2 = bufferedReaderA.readLine();
                    if (line2 == null) {
                        String string = sb.toString();
                        try {
                            return string;
                        } catch (Exception e10) {
                            return string;
                        }
                    }
                    sb.append("  ");
                    sb.append(line2);
                    sb.append("\n");
                }
            }
            try {
                bufferedReaderA.close();
                return null;
            } catch (Exception e11) {
                X.b(e11);
                return null;
            }
        } catch (Throwable th2) {
            try {
                X.b(th2);
                try {
                    bufferedReaderA.close();
                } catch (Exception e12) {
                    X.b(e12);
                }
                return null;
            } finally {
                try {
                    bufferedReaderA.close();
                } catch (Exception e102) {
                    X.b(e102);
                }
            }
        }
    }

    private static String c(String str, String str2) {
        BufferedReader bufferedReaderA = ca.a(str, "reg_record.txt");
        if (bufferedReaderA == null) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            String line = bufferedReaderA.readLine();
            if (line == null || !line.startsWith(str2)) {
                try {
                    bufferedReaderA.close();
                    return null;
                } catch (Exception e10) {
                    X.b(e10);
                    return null;
                }
            }
            int i10 = 18;
            int i11 = 0;
            int length = 0;
            while (true) {
                String line2 = bufferedReaderA.readLine();
                if (line2 == null) {
                    sb.append("\n");
                    String string = sb.toString();
                    try {
                        return string;
                    } catch (Exception e11) {
                        return string;
                    }
                }
                if (i11 % 4 == 0) {
                    if (i11 > 0) {
                        sb.append("\n");
                    }
                    sb.append("  ");
                } else {
                    if (line2.length() > 16) {
                        i10 = 28;
                    }
                    sb.append("                ".substring(0, i10 - length));
                }
                length = line2.length();
                sb.append(line2);
                i11++;
            }
        } catch (Throwable th2) {
            try {
                X.b(th2);
                try {
                    bufferedReaderA.close();
                } catch (Exception e12) {
                    X.b(e12);
                }
                return null;
            } finally {
                try {
                    bufferedReaderA.close();
                } catch (Exception e112) {
                    X.b(e112);
                }
            }
        }
    }

    public static Map<String, Integer> d(String str) {
        if (str == null) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            for (String str2 : str.split(",")) {
                String[] strArrSplit = str2.split(":");
                if (strArrSplit.length != 2) {
                    X.b("error format at %s", str2);
                    return null;
                }
                map.put(strArrSplit[0], Integer.valueOf(Integer.parseInt(strArrSplit[1])));
            }
            return map;
        } catch (Exception e10) {
            X.b("error format intStateStr %s", str);
            e10.printStackTrace();
            return null;
        }
    }

    public static CrashDetailBean a(Context context, Map<String, String> map, NativeExceptionHandler nativeExceptionHandler) {
        String str;
        Map<String, String> map2;
        if (map == null) {
            return null;
        }
        if (a.a(context) == null) {
            X.b("abnormal com info not created", new Object[0]);
            return null;
        }
        String str2 = map.get("intStateStr");
        if (str2 != null && str2.trim().length() > 0) {
            Map<String, Integer> mapD = d(str2);
            if (mapD == null) {
                X.b("parse intSateMap fail", Integer.valueOf(map.size()));
                return null;
            }
            try {
                mapD.get("sino").getClass();
                mapD.get("sud").getClass();
                str = map.get("soVersion");
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                if (TextUtils.isEmpty(str)) {
                    X.b("error format at version", new Object[0]);
                    return null;
                }
                String str3 = map.get("errorAddr");
                String str4 = str3 == null ? "unknown" : str3;
                String str5 = map.get("codeMsg");
                if (str5 == null) {
                    str5 = "unknown";
                }
                String str6 = map.get("tombPath");
                String str7 = str6 == null ? "unknown" : str6;
                String str8 = map.get("signalName");
                if (str8 == null) {
                    str8 = "unknown";
                }
                map.get("errnoMsg");
                String string = map.get("stack");
                if (string == null) {
                    string = "unknown";
                }
                String str9 = map.get("jstack");
                if (str9 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(string);
                    sb.append("java:\n");
                    sb.append(str9);
                    string = sb.toString();
                }
                Integer num = mapD.get("sico");
                if (num != null && num.intValue() > 0) {
                    str8 = str8 + "(" + str5 + ")";
                    str5 = "KERNEL";
                }
                String str10 = str5;
                String str11 = map.get("nativeLog");
                byte[] bArrA = (str11 == null || str11.isEmpty()) ? null : ca.a((File) null, str11, "BuglyNativeLog.txt");
                String str12 = map.get("sendingProcess");
                if (str12 == null) {
                    str12 = "unknown";
                }
                Integer num2 = mapD.get("spd");
                if (num2 != null) {
                    str12 = str12 + "(" + num2 + ")";
                }
                String str13 = str12;
                String str14 = map.get("threadName");
                if (str14 == null) {
                    str14 = "unknown";
                }
                Integer num3 = mapD.get("et");
                if (num3 != null) {
                    str14 = str14 + "(" + num3 + ")";
                }
                String str15 = map.get("processName");
                String str16 = str15 != null ? str15 : "unknown";
                Integer num4 = mapD.get("ep");
                if (num4 != null) {
                    str16 = str16 + "(" + num4 + ")";
                }
                String str17 = map.get("key-value");
                if (str17 != null) {
                    HashMap map3 = new HashMap();
                    for (String str18 : str17.split("\n")) {
                        String[] strArrSplit = str18.split("=");
                        if (strArrSplit.length == 2) {
                            map3.put(strArrSplit[0], strArrSplit[1]);
                        }
                    }
                    map2 = map3;
                } else {
                    map2 = null;
                }
                CrashDetailBean crashDetailBeanPackageCrashDatas = nativeExceptionHandler.packageCrashDatas(str16, str14, (((long) mapD.get("ets").intValue()) * 1000) + (((long) mapD.get("etms").intValue()) / 1000), str8, str4, a(string), str10, str13, str7, map.get("sysLogPath"), map.get("jniLogPath"), str, bArrA, map2, false, false);
                if (crashDetailBeanPackageCrashDatas != null) {
                    String str19 = map.get("userId");
                    if (str19 != null) {
                        X.a("[Native record info] userId: %s", str19);
                        crashDetailBeanPackageCrashDatas.f4665m = str19;
                    }
                    String str20 = map.get("sysLog");
                    if (str20 != null) {
                        crashDetailBeanPackageCrashDatas.f4675w = str20;
                    }
                    String str21 = map.get("appVersion");
                    if (str21 != null) {
                        X.a("[Native record info] appVersion: %s", str21);
                        crashDetailBeanPackageCrashDatas.f4658f = str21;
                    }
                    String str22 = map.get("isAppForeground");
                    if (str22 != null) {
                        X.a("[Native record info] isAppForeground: %s", str22);
                        crashDetailBeanPackageCrashDatas.O = str22.equalsIgnoreCase("true");
                    }
                    String str23 = map.get("launchTime");
                    if (str23 != null) {
                        X.a("[Native record info] launchTime: %s", str23);
                        try {
                            crashDetailBeanPackageCrashDatas.N = Long.parseLong(str23);
                        } catch (NumberFormatException e10) {
                            if (!X.b(e10)) {
                                e10.printStackTrace();
                            }
                        }
                    }
                    crashDetailBeanPackageCrashDatas.f4678z = null;
                    crashDetailBeanPackageCrashDatas.f4663k = true;
                }
                return crashDetailBeanPackageCrashDatas;
            } catch (Throwable th3) {
                th = th3;
                X.b("error format", new Object[0]);
                th.printStackTrace();
                return null;
            }
        }
        X.b("no intStateStr", new Object[0]);
        return null;
    }

    public static void b(String str) {
        File[] fileArrListFiles;
        if (str == null) {
            return;
        }
        try {
            File file = new File(str);
            if (file.canRead() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                for (File file2 : fileArrListFiles) {
                    if (file2.canRead() && file2.canWrite() && file2.length() == 0) {
                        file2.delete();
                        X.a("Delete empty record file %s", file2.getAbsoluteFile());
                    }
                }
            }
        } catch (Throwable th2) {
            X.b(th2);
        }
    }

    public static String c(String str) {
        if (str == null) {
            return null;
        }
        File file = new File(str, "backup_record.txt");
        if (file.exists()) {
            return file.getAbsolutePath();
        }
        return null;
    }

    public static String a(BufferedInputStream bufferedInputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        if (bufferedInputStream == null) {
            return null;
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream(1024);
            while (true) {
                try {
                    int i10 = bufferedInputStream.read();
                    if (i10 == -1) {
                        break;
                    }
                    if (i10 == 0) {
                        String str = new String(byteArrayOutputStream.toByteArray(), "UTf-8");
                        byteArrayOutputStream.close();
                        return str;
                    }
                    byteArrayOutputStream.write(i10);
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        X.b(th);
                        return null;
                    } finally {
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [boolean] */
    public static CrashDetailBean a(Context context, String str, NativeExceptionHandler nativeExceptionHandler) {
        BufferedInputStream bufferedInputStream;
        String str2;
        String strA;
        BufferedInputStream bufferedInputStream2 = 0;
        if (context != null && str != null && nativeExceptionHandler != null) {
            File file = new File(str, "rqd_record.eup");
            if (file.exists()) {
                ?? CanRead = file.canRead();
                try {
                    if (CanRead != 0) {
                        try {
                            bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                            try {
                                String strA2 = a(bufferedInputStream);
                                if (strA2 != null && strA2.equals("NATIVE_RQD_REPORT")) {
                                    HashMap map = new HashMap();
                                    loop0: while (true) {
                                        str2 = null;
                                        while (true) {
                                            strA = a(bufferedInputStream);
                                            if (strA == null) {
                                                break loop0;
                                            }
                                            if (str2 == null) {
                                                str2 = strA;
                                            }
                                        }
                                        map.put(str2, strA);
                                    }
                                    if (str2 != null) {
                                        X.b("record not pair! drop! %s", str2);
                                        try {
                                            bufferedInputStream.close();
                                            return null;
                                        } catch (IOException e10) {
                                            e10.printStackTrace();
                                            return null;
                                        }
                                    }
                                    CrashDetailBean crashDetailBeanA = a(context, map, nativeExceptionHandler);
                                    try {
                                        bufferedInputStream.close();
                                        return crashDetailBeanA;
                                    } catch (IOException e11) {
                                        e11.printStackTrace();
                                        return crashDetailBeanA;
                                    }
                                }
                                X.b("record read fail! %s", strA2);
                                try {
                                    bufferedInputStream.close();
                                    return null;
                                } catch (IOException e12) {
                                    e12.printStackTrace();
                                    return null;
                                }
                            } catch (IOException e13) {
                                e = e13;
                                e.printStackTrace();
                                if (bufferedInputStream != null) {
                                    try {
                                        bufferedInputStream.close();
                                    } catch (IOException e14) {
                                        e14.printStackTrace();
                                    }
                                }
                                return null;
                            }
                        } catch (IOException e15) {
                            e = e15;
                            bufferedInputStream = null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (bufferedInputStream2 != 0) {
                                try {
                                    bufferedInputStream2.close();
                                } catch (IOException e16) {
                                    e16.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedInputStream2 = CanRead;
                }
            }
            return null;
        }
        X.b("get eup record file args error", new Object[0]);
        return null;
    }

    public static String a(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String strC = c(str, str2);
        if (strC != null && !strC.isEmpty()) {
            sb.append("Register infos:\n");
            sb.append(strC);
        }
        String strB = b(str, str2);
        if (strB != null && !strB.isEmpty()) {
            if (sb.length() > 0) {
                sb.append("\n");
            }
            sb.append("System SO infos:\n");
            sb.append(strB);
        }
        return sb.toString();
    }

    public static void a(boolean z10, String str) {
        if (str != null) {
            f4801a.add(new File(str, "rqd_record.eup"));
            f4801a.add(new File(str, "reg_record.txt"));
            f4801a.add(new File(str, "map_record.txt"));
            f4801a.add(new File(str, "backup_record.txt"));
            if (z10) {
                b(str);
            }
        }
        List<File> list = f4801a;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (File file : f4801a) {
            if (file.exists() && file.canWrite()) {
                file.delete();
                X.a("Delete record file %s", file.getAbsoluteFile());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String a(String str, int i10, String str2, boolean z10) {
        String str3;
        BufferedReader bufferedReader = null;
        if (str != null && i10 > 0) {
            File file = new File(str);
            if (file.exists() && file.canRead()) {
                X.c("Read system log from native record file(length: %s bytes): %s", Long.valueOf(file.length()), file.getAbsolutePath());
                f4801a.add(file);
                X.a("Add this record file to list for cleaning lastly.", new Object[0]);
                if (str2 == null) {
                    return ca.a(new File(str), i10, z10);
                }
                StringBuilder sb = new StringBuilder();
                try {
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));
                        while (true) {
                            try {
                                String line = bufferedReader2.readLine();
                                if (line == null) {
                                    break;
                                }
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(str2);
                                sb2.append("[ ]*:");
                                if (Pattern.compile(sb2.toString()).matcher(line).find()) {
                                    sb.append(line);
                                    sb.append("\n");
                                }
                                if (i10 > 0 && sb.length() > i10) {
                                    if (z10) {
                                        sb.delete(i10, sb.length());
                                        break;
                                    }
                                    sb.delete(0, sb.length() - i10);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedReader = bufferedReader2;
                                try {
                                    X.b(th);
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("\n[error:");
                                    sb3.append(th.toString());
                                    sb3.append("]");
                                    sb.append(sb3.toString());
                                    String string = sb.toString();
                                    str3 = string;
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                        str3 = string;
                                    }
                                    return str3;
                                } catch (Throwable th3) {
                                    if (bufferedReader != null) {
                                        try {
                                            bufferedReader.close();
                                        } catch (Exception e10) {
                                            X.b(e10);
                                        }
                                    }
                                    throw th3;
                                }
                            }
                        }
                        String string2 = sb.toString();
                        bufferedReader2.close();
                        return string2;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Exception e11) {
                    X.b(e11);
                    str3 = sb;
                }
            }
        }
        return null;
    }
}
