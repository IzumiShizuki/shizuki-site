package com.tencent.bugly.proguard;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.tencent.bugly.crashreport.common.info.AppInfo;
import com.tencent.bugly.crashreport.common.info.PlugInBean;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class ca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, String> f4947a;

    public static String a() {
        return a(System.currentTimeMillis());
    }

    public static String b(Throwable th2) {
        if (th2 == null) {
            return "";
        }
        try {
            StringWriter stringWriter = new StringWriter();
            th2.printStackTrace(new PrintWriter(stringWriter));
            return stringWriter.getBuffer().toString();
        } catch (Throwable th3) {
            if (X.b(th3)) {
                return "fail";
            }
            th3.printStackTrace();
            return "fail";
        }
    }

    public static String c(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "NULL";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bArr);
            return a(messageDigest.digest());
        } catch (Throwable th2) {
            if (X.b(th2)) {
                return null;
            }
            th2.printStackTrace();
            return null;
        }
    }

    public static Parcel d(byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        return parcelObtain;
    }

    public static String a(long j10) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(new Date(j10));
        } catch (Exception unused) {
            return new Date().toString();
        }
    }

    public static String a(Date date) {
        if (date == null) {
            return null;
        }
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(date);
        } catch (Exception unused) {
            return new Date().toString();
        }
    }

    public static byte[] b(byte[] bArr, int i10) {
        if (bArr == null || i10 == -1) {
            return bArr;
        }
        X.a("[Util] Zip %d bytes data with type %s", Integer.valueOf(bArr.length), i10 == 2 ? "Gzip" : "zip");
        try {
            ha haVarA = ga.a(i10);
            if (haVarA == null) {
                return null;
            }
            return haVarA.a(bArr);
        } catch (Throwable th2) {
            if (!X.b(th2)) {
                th2.printStackTrace();
            }
            return null;
        }
    }

    public static void c(long j10) {
        try {
            Thread.sleep(j10);
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] a(java.io.File r6, java.lang.String r7, java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.ca.a(java.io.File, java.lang.String, java.lang.String):byte[]");
    }

    public static boolean c(String str) {
        if (b(str)) {
            return false;
        }
        if (str.length() > 255) {
            X.c("URL(%s)'s length is larger than 255.", str);
            return false;
        }
        if (str.toLowerCase().startsWith("http")) {
            return true;
        }
        X.c("URL(%s) is not start with \"http\".", str);
        return false;
    }

    public static long b() {
        try {
            return (((System.currentTimeMillis() + ((long) TimeZone.getDefault().getRawOffset())) / 86400000) * 86400000) - ((long) TimeZone.getDefault().getRawOffset());
        } catch (Throwable th2) {
            if (X.b(th2)) {
                return -1L;
            }
            th2.printStackTrace();
            return -1L;
        }
    }

    public static void c(String str, String str2) {
        if (com.tencent.bugly.crashreport.common.info.a.m() == null || com.tencent.bugly.crashreport.common.info.a.m().f4595qa == null) {
            return;
        }
        com.tencent.bugly.crashreport.common.info.a.m().f4595qa.edit().putString(str, str2).apply();
    }

    public static boolean b(String str) {
        return str == null || str.trim().length() <= 0;
    }

    public static byte[] b(long j10) {
        try {
            return ("" + j10).getBytes("utf-8");
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static long b(byte[] bArr) {
        if (bArr == null) {
            return -1L;
        }
        try {
            return Long.parseLong(new String(bArr, "utf-8"));
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
            return -1L;
        }
    }

    public static void b(Parcel parcel, Map<String, String> map) {
        if (map != null && map.size() > 0) {
            int size = map.size();
            ArrayList<String> arrayList = new ArrayList<>(size);
            ArrayList<String> arrayList2 = new ArrayList<>(size);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(entry.getKey());
                arrayList2.add(entry.getValue());
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("keys", arrayList);
            bundle.putStringArrayList("values", arrayList2);
            parcel.writeBundle(bundle);
            return;
        }
        parcel.writeBundle(null);
    }

    public static Map<String, String> b(Parcel parcel) {
        Bundle bundle = parcel.readBundle();
        if (bundle == null) {
            return null;
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("keys");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("values");
        if (stringArrayList != null && stringArrayList2 != null && stringArrayList.size() == stringArrayList2.size()) {
            HashMap map = new HashMap(stringArrayList.size());
            for (int i10 = 0; i10 < stringArrayList.size(); i10++) {
                map.put(stringArrayList.get(i10), stringArrayList2.get(i10));
            }
            return map;
        }
        X.b("map parcel error!", new Object[0]);
        return null;
    }

    public static boolean b(Context context) {
        try {
            return com.tencent.bugly.crashreport.common.info.a.m().C();
        } catch (SecurityException unused) {
            X.b("无法获取GET_TASK权限，将在通知栏提醒升级，如需弹窗提醒，请在AndroidManifest.xml中添加GET_TASKS权限：\n<uses-permission android:name=\"android.permission.GET_TASKS\" />\n", new Object[0]);
            return true;
        } catch (Exception e10) {
            if (X.a(e10)) {
                return true;
            }
            e10.printStackTrace();
            return true;
        }
    }

    public static boolean b(Context context, String str) {
        X.a("[Util] Try to unlock file: %s (pid=%d | tid=%d)", str, Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        try {
            File file = new File(context.getFilesDir() + File.separator + str);
            if (!file.exists()) {
                return true;
            }
            if (!file.delete()) {
                return false;
            }
            X.a("[Util] Successfully unlocked file: %s (pid=%d | tid=%d)", str, Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
            return true;
        } catch (Throwable th2) {
            X.b(th2);
            return false;
        }
    }

    public static byte[] a(byte[] bArr, int i10) {
        if (bArr == null || i10 == -1) {
            return bArr;
        }
        X.a("[Util] Unzip %d bytes data with type %s", Integer.valueOf(bArr.length), i10 == 2 ? "Gzip" : "zip");
        try {
            ha haVarA = ga.a(i10);
            if (haVarA == null) {
                return null;
            }
            return haVarA.b(bArr);
        } catch (Throwable th2) {
            if (th2.getMessage() != null && th2.getMessage().contains("Not in GZIP format")) {
                X.e(th2.getMessage(), new Object[0]);
            } else if (!X.b(th2)) {
                th2.printStackTrace();
            }
            return null;
        }
    }

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b10 : bArr) {
            String hexString = Integer.toHexString(b10 & 255);
            if (hexString.length() == 1) {
                stringBuffer.append("0");
            }
            stringBuffer.append(hexString);
        }
        return stringBuffer.toString().toUpperCase();
    }

    public static String b(String str, String str2) {
        return (com.tencent.bugly.crashreport.common.info.a.m() == null || com.tencent.bugly.crashreport.common.info.a.m().f4595qa == null) ? "" : com.tencent.bugly.crashreport.common.info.a.m().f4595qa.getString(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    public static String a(File file, String str) throws Throwable {
        FileInputStream fileInputStream;
        ?? r0 = 0;
        if (file != null && file.exists()) {
            ?? CanRead = file.canRead();
            try {
                try {
                    if (CanRead != 0) {
                        try {
                            fileInputStream = new FileInputStream(file);
                        } catch (IOException e10) {
                            e = e10;
                            fileInputStream = null;
                        } catch (NoSuchAlgorithmException e11) {
                            e = e11;
                            fileInputStream = null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (r0 != 0) {
                                try {
                                    r0.close();
                                } catch (IOException e12) {
                                    e12.printStackTrace();
                                }
                            }
                            throw th;
                        }
                        try {
                            MessageDigest messageDigest = MessageDigest.getInstance(str);
                            byte[] bArr = new byte[102400];
                            while (true) {
                                int i10 = fileInputStream.read(bArr);
                                if (i10 != -1) {
                                    messageDigest.update(bArr, 0, i10);
                                } else {
                                    String strA = a(messageDigest.digest());
                                    try {
                                        fileInputStream.close();
                                        return strA;
                                    } catch (IOException e13) {
                                        e13.printStackTrace();
                                        return strA;
                                    }
                                }
                            }
                        } catch (IOException e14) {
                            e = e14;
                            if (!X.b(e)) {
                                e.printStackTrace();
                            }
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            return null;
                        } catch (NoSuchAlgorithmException e15) {
                            e = e15;
                            if (!X.b(e)) {
                                e.printStackTrace();
                            }
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            return null;
                        }
                    }
                } catch (IOException e16) {
                    e16.printStackTrace();
                }
            } catch (Throwable th3) {
                th = th3;
                r0 = CanRead;
            }
        }
        return null;
    }

    public static boolean a(File file, File file2, int i10) {
        ZipOutputStream zipOutputStream;
        X.a("rqdp{  ZF start}", new Object[0]);
        if (file != null && file2 != null && !file.equals(file2)) {
            if (file.exists() && file.canRead()) {
                try {
                    if (file2.getParentFile() != null && !file2.getParentFile().exists()) {
                        file2.getParentFile().mkdirs();
                    }
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                } catch (Throwable th2) {
                    if (!X.b(th2)) {
                        th2.printStackTrace();
                    }
                }
                if (!file2.exists() || !file2.canRead()) {
                    return false;
                }
                FileInputStream fileInputStream = null;
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file2)));
                        try {
                            zipOutputStream.setMethod(8);
                            zipOutputStream.putNextEntry(new ZipEntry(file.getName()));
                            if (i10 <= 1000) {
                                i10 = 1000;
                            }
                            byte[] bArr = new byte[i10];
                            while (true) {
                                int i11 = fileInputStream2.read(bArr);
                                if (i11 <= 0) {
                                    break;
                                }
                                zipOutputStream.write(bArr, 0, i11);
                            }
                            zipOutputStream.flush();
                            zipOutputStream.closeEntry();
                            try {
                                fileInputStream2.close();
                            } catch (IOException e10) {
                                e10.printStackTrace();
                            }
                            try {
                                zipOutputStream.close();
                            } catch (IOException e11) {
                                e11.printStackTrace();
                            }
                            X.a("rqdp{  ZF end}", new Object[0]);
                            return true;
                        } catch (Throwable th3) {
                            th = th3;
                            fileInputStream = fileInputStream2;
                            try {
                                if (!X.b(th)) {
                                    th.printStackTrace();
                                }
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException e12) {
                                        e12.printStackTrace();
                                    }
                                }
                                if (zipOutputStream != null) {
                                    try {
                                        zipOutputStream.close();
                                    } catch (IOException e13) {
                                        e13.printStackTrace();
                                    }
                                }
                                X.a("rqdp{  ZF end}", new Object[0]);
                                return false;
                            } catch (Throwable th4) {
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException e14) {
                                        e14.printStackTrace();
                                    }
                                }
                                if (zipOutputStream != null) {
                                    try {
                                        zipOutputStream.close();
                                    } catch (IOException e15) {
                                        e15.printStackTrace();
                                    }
                                }
                                X.a("rqdp{  ZF end}", new Object[0]);
                                throw th4;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        zipOutputStream = null;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    zipOutputStream = null;
                }
            } else {
                X.e("rqdp{  !sFile.exists() || !sFile.canRead(),pls check ,return!}", new Object[0]);
                return false;
            }
        } else {
            X.e("rqdp{  err ZF 1R!}", new Object[0]);
            return false;
        }
    }

    public static ArrayList<String> a(Context context, String[] strArr) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        Process processExec;
        if (AppInfo.e(context)) {
            return new ArrayList<>(Arrays.asList("unknown(low memory)"));
        }
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            processExec = Runtime.getRuntime().exec(strArr);
            bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
            bufferedReader2 = null;
        }
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                arrayList.add(line);
            } catch (Throwable th3) {
                th = th3;
                bufferedReader2 = null;
            }
            try {
                if (!X.b(th)) {
                    th.printStackTrace();
                }
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                }
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException e11) {
                        e11.printStackTrace();
                    }
                }
                return null;
            } finally {
            }
        }
        bufferedReader2 = new BufferedReader(new InputStreamReader(processExec.getErrorStream()));
        while (true) {
            try {
                String line2 = bufferedReader2.readLine();
                if (line2 != null) {
                    arrayList.add(line2);
                } else {
                    try {
                        break;
                    } catch (IOException e12) {
                        e12.printStackTrace();
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        bufferedReader.close();
        try {
            bufferedReader2.close();
        } catch (IOException e13) {
            e13.printStackTrace();
        }
        return arrayList;
    }

    public static String a(Context context, String str) {
        if (str == null || str.trim().equals("")) {
            return "";
        }
        if (f4947a == null) {
            f4947a = new HashMap();
            ArrayList<String> arrayListA = a(context, new String[]{(new File("/system/bin/sh").exists() && new File("/system/bin/sh").canExecute()) ? "/system/bin/sh" : "sh", "-c", "getprop"});
            if (arrayListA != null && arrayListA.size() > 0) {
                X.a(ca.class, "Successfully get 'getprop' list.", new Object[0]);
                Pattern patternCompile = Pattern.compile("\\[(.+)\\]: \\[(.*)\\]");
                Iterator<String> it = arrayListA.iterator();
                while (it.hasNext()) {
                    Matcher matcher = patternCompile.matcher(it.next());
                    if (matcher.find()) {
                        f4947a.put(matcher.group(1), matcher.group(2));
                    }
                }
                X.a(ca.class, "Systems properties number: %d.", Integer.valueOf(f4947a.size()));
            }
        }
        return f4947a.containsKey(str) ? f4947a.get(str) : "fail";
    }

    /* JADX WARN: Finally extract failed */
    public static void a(Context context, String str, String str2, int i10) {
        Throwable th2;
        FileOutputStream fileOutputStream;
        X.a("rqdp{  sv sd start} %s", str);
        if (str2 == null || str2.trim().length() <= 0) {
            return;
        }
        File file = new File(str);
        try {
            if (!file.exists()) {
                if (file.getParentFile() != null) {
                    file.getParentFile().mkdirs();
                }
                file.createNewFile();
            }
            try {
                if (file.length() >= i10) {
                    fileOutputStream = new FileOutputStream(file, false);
                } else {
                    fileOutputStream = new FileOutputStream(file, true);
                }
            } catch (Throwable th3) {
                th2 = th3;
                fileOutputStream = null;
            }
            try {
                fileOutputStream.write(str2.getBytes("UTF-8"));
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (Throwable th4) {
                th2 = th4;
                try {
                    if (!X.b(th2)) {
                        th2.printStackTrace();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                } catch (Throwable th5) {
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            if (!X.b(th6)) {
                th6.printStackTrace();
            }
        }
        X.a("rqdp{  sv sd end}", new Object[0]);
    }

    public static void a(String str) {
        if (str == null) {
            return;
        }
        File file = new File(str);
        if (file.isFile() && file.exists() && file.canWrite()) {
            file.delete();
        }
    }

    public static Context a(Context context) {
        Context applicationContext;
        return (context == null || (applicationContext = context.getApplicationContext()) == null) ? context : applicationContext;
    }

    public static String a(Throwable th2) {
        if (th2 == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    public static void a(Class<?> cls, String str, Object obj, Object obj2) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(obj2, obj);
        } catch (Exception unused) {
        }
    }

    public static Object a(String str, String str2, Object obj, Class<?>[] clsArr, Object[] objArr) {
        try {
            Method declaredMethod = Class.forName(str).getDeclaredMethod(str2, clsArr);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(obj, objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Parcel parcel, Map<String, PlugInBean> map) {
        if (map != null && map.size() > 0) {
            int size = map.size();
            ArrayList arrayList = new ArrayList(size);
            ArrayList arrayList2 = new ArrayList(size);
            for (Map.Entry<String, PlugInBean> entry : map.entrySet()) {
                arrayList.add(entry.getKey());
                arrayList2.add(entry.getValue());
            }
            Bundle bundle = new Bundle();
            bundle.putInt("pluginNum", arrayList.size());
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                bundle.putString(t0.B(i10, "pluginKey"), (String) arrayList.get(i10));
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                bundle.putString(t0.C(i11, "pluginVal", "plugInId"), ((PlugInBean) arrayList2.get(i11)).f4560a);
                bundle.putString("pluginVal" + i11 + "plugInUUID", ((PlugInBean) arrayList2.get(i11)).f4562c);
                bundle.putString("pluginVal" + i11 + "plugInVersion", ((PlugInBean) arrayList2.get(i11)).f4561b);
            }
            parcel.writeBundle(bundle);
            return;
        }
        parcel.writeBundle(null);
    }

    public static Map<String, PlugInBean> a(Parcel parcel) {
        Bundle bundle = parcel.readBundle();
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iIntValue = ((Integer) bundle.get("pluginNum")).intValue();
        for (int i10 = 0; i10 < iIntValue; i10++) {
            arrayList.add(bundle.getString("pluginKey" + i10));
        }
        for (int i11 = 0; i11 < iIntValue; i11++) {
            arrayList2.add(new PlugInBean(bundle.getString("pluginVal" + i11 + "plugInId"), bundle.getString("pluginVal" + i11 + "plugInVersion"), bundle.getString("pluginVal" + i11 + "plugInUUID")));
        }
        if (arrayList.size() == arrayList2.size()) {
            HashMap map = new HashMap(arrayList.size());
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                map.put(arrayList.get(i12), PlugInBean.class.cast(arrayList2.get(i12)));
            }
            return map;
        }
        X.b("map plugin parcel error!", new Object[0]);
        return null;
    }

    public static byte[] a(Parcelable parcelable) {
        Parcel parcelObtain = Parcel.obtain();
        parcelable.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    public static <T> T a(byte[] bArr, Parcelable.Creator<T> creator) {
        Parcel parcelD = d(bArr);
        try {
            return creator.createFromParcel(parcelD);
        } catch (Throwable th2) {
            try {
                th2.printStackTrace();
                if (parcelD == null) {
                    return null;
                }
                parcelD.recycle();
                return null;
            } finally {
                if (parcelD != null) {
                    parcelD.recycle();
                }
            }
        }
    }

    public static String a(Context context, int i10, String str) {
        String[] strArr;
        Process processExec = null;
        if (!AppInfo.a(context, "android.permission.READ_LOGS")) {
            X.e("no read_log permission!", new Object[0]);
            return null;
        }
        if (str == null) {
            strArr = new String[]{"logcat", "-d", "-v", "threadtime"};
        } else {
            strArr = new String[]{"logcat", "-d", "-v", "threadtime", "-s", str};
        }
        StringBuilder sb = new StringBuilder();
        try {
            processExec = Runtime.getRuntime().exec(strArr);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
                sb.append("\n");
                if (i10 > 0 && sb.length() > i10) {
                    sb.delete(0, sb.length() - i10);
                }
            }
            String string = sb.toString();
            try {
                processExec.getOutputStream().close();
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            try {
                processExec.getInputStream().close();
            } catch (IOException e11) {
                e11.printStackTrace();
            }
            try {
                processExec.getErrorStream().close();
            } catch (IOException e12) {
                e12.printStackTrace();
            }
            return string;
        } catch (Throwable th2) {
            try {
                if (!X.b(th2)) {
                    th2.printStackTrace();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\n[error:");
                sb2.append(th2.toString());
                sb2.append("]");
                sb.append(sb2.toString());
                String string2 = sb.toString();
                if (processExec != null) {
                    try {
                        processExec.getOutputStream().close();
                    } catch (IOException e13) {
                        e13.printStackTrace();
                    }
                    try {
                        processExec.getInputStream().close();
                    } catch (IOException e14) {
                        e14.printStackTrace();
                    }
                    try {
                        processExec.getErrorStream().close();
                    } catch (IOException e15) {
                        e15.printStackTrace();
                    }
                }
                return string2;
            } catch (Throwable th3) {
                if (processExec != null) {
                    try {
                        processExec.getOutputStream().close();
                    } catch (IOException e16) {
                        e16.printStackTrace();
                    }
                    try {
                        processExec.getInputStream().close();
                    } catch (IOException e17) {
                        e17.printStackTrace();
                    }
                    try {
                        processExec.getErrorStream().close();
                    } catch (IOException e18) {
                        e18.printStackTrace();
                    }
                }
                throw th3;
            }
        }
    }

    public static Map<String, String> a(int i10, boolean z10) {
        HashMap map = new HashMap(12);
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        if (allStackTraces == null) {
            return null;
        }
        Thread thread = Looper.getMainLooper().getThread();
        if (!allStackTraces.containsKey(thread)) {
            allStackTraces.put(thread, thread.getStackTrace());
        }
        long id2 = Thread.currentThread().getId();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
            if (!z10 || id2 != entry.getKey().getId()) {
                int i11 = 0;
                sb.setLength(0);
                if (entry.getValue() != null && entry.getValue().length != 0) {
                    StackTraceElement[] value = entry.getValue();
                    int length = value.length;
                    while (true) {
                        if (i11 >= length) {
                            break;
                        }
                        StackTraceElement stackTraceElement = value[i11];
                        if (i10 > 0 && sb.length() >= i10) {
                            sb.append("\n[Stack over limit size :" + i10 + " , has been cut!]");
                            break;
                        }
                        sb.append(stackTraceElement.toString());
                        sb.append("\n");
                        i11++;
                    }
                    map.put(entry.getKey().getName() + "(" + entry.getKey().getId() + ")", sb.toString());
                }
            }
        }
        return map;
    }

    public static boolean a(Context context, String str, long j10) {
        X.a("[Util] Try to lock file:%s (pid=%d | tid=%d)", str, Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        try {
            File file = new File(context.getFilesDir() + File.separator + str);
            if (file.exists()) {
                if (System.currentTimeMillis() - file.lastModified() < j10) {
                    return false;
                }
                X.a("[Util] Lock file (%s) is expired, unlock it.", str);
                b(context, str);
            }
            if (file.createNewFile()) {
                X.a("[Util] Successfully locked file: %s (pid=%d | tid=%d)", str, Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                return true;
            }
            X.a("[Util] Failed to locked file: %s (pid=%d | tid=%d)", str, Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
            return false;
        } catch (Throwable th2) {
            X.b(th2);
            return false;
        }
    }

    public static String a(File file, int i10, boolean z10) {
        BufferedReader bufferedReader;
        if (file == null || !file.exists() || !file.canRead()) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append("\n");
                    if (i10 > 0 && sb.length() > i10) {
                        if (z10) {
                            sb.delete(i10, sb.length());
                            break;
                        }
                        sb.delete(0, sb.length() - i10);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        X.b(th);
                        return null;
                    } finally {
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Exception e10) {
                                X.b(e10);
                            }
                        }
                    }
                }
            }
            String string = sb.toString();
            try {
                bufferedReader.close();
                return string;
            } catch (Exception e11) {
                X.b(e11);
                return string;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
        }
    }

    public static BufferedReader a(File file) {
        if (file != null && file.exists() && file.canRead()) {
            try {
                return new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));
            } catch (Throwable th2) {
                X.b(th2);
            }
        }
        return null;
    }

    public static BufferedReader a(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            File file = new File(str, str2);
            if (file.exists() && file.canRead()) {
                return a(file);
            }
            return null;
        } catch (NullPointerException e10) {
            X.b(e10);
            return null;
        }
    }

    public static Thread a(Runnable runnable, String str) {
        try {
            Thread thread = new Thread(runnable);
            thread.setName(str);
            thread.start();
            return thread;
        } catch (Throwable th2) {
            X.b("[Util] Failed to start a thread to execute task with message: %s", th2.getMessage());
            return null;
        }
    }

    public static boolean a(Runnable runnable) {
        if (runnable == null) {
            return false;
        }
        W wC = W.c();
        if (wC != null) {
            return wC.a(runnable);
        }
        String[] strArrSplit = runnable.getClass().getName().split("\\.");
        return a(runnable, strArrSplit[strArrSplit.length - 1]) != null;
    }

    public static SharedPreferences a(String str, Context context) {
        if (context != null) {
            return context.getSharedPreferences(str, 0);
        }
        return null;
    }
}
