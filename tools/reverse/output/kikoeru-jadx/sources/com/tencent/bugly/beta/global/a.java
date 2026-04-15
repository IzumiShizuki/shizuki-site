package com.tencent.bugly.beta.global;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.core.content.FileProvider;
import com.tencent.bugly.beta.tinker.TinkerReport;
import com.tencent.bugly.proguard.C0012p;
import com.tencent.bugly.proguard.X;
import com.tencent.bugly.proguard.ca;
import java.io.File;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class a {
    public static int a(Context context) {
        TelephonyManager telephonyManager;
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return 0;
            }
            if (activeNetworkInfo.getType() == 1) {
                return 1;
            }
            if (activeNetworkInfo.getType() == 0 && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                switch (telephonyManager.getNetworkType()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        return 2;
                    case 3:
                    case 5:
                    case 6:
                    case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                    case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                    case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                    case 12:
                    case 14:
                    case 15:
                        return 3;
                    case 13:
                        return 4;
                    default:
                        return 0;
                }
            }
        } catch (Exception e10) {
            if (!X.b(e10)) {
                e10.printStackTrace();
            }
        }
        return 0;
    }

    public static String b(String str) {
        return new com.tencent.bugly.beta.utils.c(str).a();
    }

    public static void b(String str, String str2) {
        SharedPreferences sharedPreferences = e.f4381b.D;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString(str, str2).apply();
        }
    }

    public static void b(String str, boolean z10) {
        SharedPreferences sharedPreferences = e.f4381b.D;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putBoolean(str, z10).apply();
        }
    }

    public static int a(Context context, float f10) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static BitmapDrawable a(Bitmap bitmap, int i10, int i11, float f10) {
        DisplayMetrics displayMetrics = e.f4381b.E;
        int i12 = (int) (displayMetrics.widthPixels * displayMetrics.heightPixels * 0.8f);
        if (bitmap == null || i10 * i11 > i12) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, i10, i11);
        RectF rectF = new RectF(rect);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-16777216);
        canvas.drawRoundRect(rectF, f10, f10, paint);
        canvas.drawRect(0.0f, f10, i10, i11, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), rect, paint);
        return new BitmapDrawable(bitmapCreateBitmap);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005a A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:12:0x0016, B:15:0x0021, B:17:0x0030, B:27:0x0052, B:29:0x005a, B:31:0x0063, B:34:0x0074, B:33:0x006d, B:25:0x0046), top: B:68:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ee A[Catch: Exception -> 0x00e4, TryCatch #1 {Exception -> 0x00e4, blocks: (B:53:0x00d1, B:55:0x00d9, B:60:0x00ee, B:64:0x00fa, B:54:0x00d4, B:42:0x00ae, B:39:0x009c), top: B:70:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap a(android.content.Context r19, int r20, java.lang.Object... r21) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.beta.global.a.a(android.content.Context, int, java.lang.Object[]):android.graphics.Bitmap");
    }

    public static boolean a(Context context, File file, String str) throws Throwable {
        if (file != null) {
            try {
                if (file.exists() && file.getName().endsWith(".apk")) {
                    String strA = ca.a(file, "MD5");
                    if (!TextUtils.isEmpty(str) && !TextUtils.equals(str.toUpperCase(), strA)) {
                        X.c("md5 error [file md5: %s] [target md5: %s]", strA, str);
                        return false;
                    }
                    Runtime.getRuntime().exec("chmod 777 " + file.getAbsolutePath());
                    Intent intent = new Intent("android.intent.action.VIEW");
                    if (Build.VERSION.SDK_INT >= 24) {
                        intent.addFlags(1);
                        int i10 = FileProvider.f738a;
                        Class[] clsArr = {Context.class, String.class, File.class};
                        StringBuilder sb = new StringBuilder();
                        sb.append(com.tencent.bugly.crashreport.common.info.a.a(context).f4575g);
                        sb.append(".fileProvider");
                        Uri uri = (Uri) ca.a("androidx.core.content.FileProvider", "getUriForFile", null, clsArr, new Object[]{context, sb.toString(), file});
                        if (uri == null) {
                            X.b("file location is " + file.toString(), new Object[0]);
                            X.b("install failed, contentUri is null!", new Object[0]);
                            return false;
                        }
                        X.a("contentUri is " + uri, new Object[0]);
                        intent.setDataAndType(uri, "application/vnd.android.package-archive");
                    } else {
                        intent.setDataAndType(Uri.fromFile(file), "application/vnd.android.package-archive");
                    }
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                    return true;
                }
            } catch (Exception e10) {
                if (!X.a(e10)) {
                    e10.printStackTrace();
                }
            }
        }
        return false;
    }

    public static boolean a(File file, String str, String str2) throws Throwable {
        if (file != null) {
            try {
                if (file.exists()) {
                    String strA = ca.a(file, str2);
                    if (!TextUtils.isEmpty(str) && TextUtils.equals(str.toUpperCase(), strA)) {
                        return true;
                    }
                    X.c("checkFileUniqueId failed [file  uniqueId %s] [target uniqueId %s]", strA, str);
                    return false;
                }
            } catch (Exception unused) {
                X.b("checkFileUniqueId exception", new Object[0]);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0074 A[Catch: IOException -> 0x0070, TRY_LEAVE, TryCatch #8 {IOException -> 0x0070, blocks: (B:54:0x006c, B:58:0x0074), top: B:69:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(java.io.File r3, java.io.File r4) throws java.lang.Throwable {
        /*
            r0 = 0
            if (r3 == 0) goto L7c
            r1 = 0
            boolean r2 = r3.exists()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            if (r2 == 0) goto L7c
            boolean r2 = r3.isDirectory()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            if (r2 == 0) goto L12
            goto L7c
        L12:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            r3.<init>(r4, r0)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L40
            r4 = 1048576(0x100000, float:1.469368E-39)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2d
        L20:
            int r1 = r2.read(r4)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2d
            if (r1 <= 0) goto L2f
            r3.write(r4, r0, r1)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2d
            goto L20
        L2a:
            r4 = move-exception
        L2b:
            r1 = r3
            goto L68
        L2d:
            r4 = move-exception
            goto L3c
        L2f:
            r2.close()     // Catch: java.io.IOException -> L36
            r3.close()     // Catch: java.io.IOException -> L36
            goto L3a
        L36:
            r3 = move-exception
            r3.printStackTrace()
        L3a:
            r0 = 1
            goto L64
        L3c:
            r1 = r2
            goto L50
        L3e:
            r3 = move-exception
            goto L43
        L40:
            r3 = move-exception
            r4 = r3
            goto L46
        L43:
            r4 = r1
            r1 = r2
            goto L6a
        L46:
            r3 = r1
            goto L3c
        L48:
            r3 = move-exception
            goto L4d
        L4a:
            r3 = move-exception
            r4 = r3
            goto L4f
        L4d:
            r4 = r1
            goto L6a
        L4f:
            r3 = r1
        L50:
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L5b
            r1.close()     // Catch: java.io.IOException -> L59
            goto L5b
        L59:
            r3 = move-exception
            goto L61
        L5b:
            if (r3 == 0) goto L64
            r3.close()     // Catch: java.io.IOException -> L59
            goto L64
        L61:
            r3.printStackTrace()
        L64:
            return r0
        L65:
            r4 = move-exception
            r2 = r1
            goto L2b
        L68:
            r3 = r4
            goto L43
        L6a:
            if (r1 == 0) goto L72
            r1.close()     // Catch: java.io.IOException -> L70
            goto L72
        L70:
            r4 = move-exception
            goto L78
        L72:
            if (r4 == 0) goto L7b
            r4.close()     // Catch: java.io.IOException -> L70
            goto L7b
        L78:
            r4.printStackTrace()
        L7b:
            throw r3
        L7c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.beta.global.a.a(java.io.File, java.io.File):boolean");
    }

    public static Bitmap a(Drawable drawable) {
        Bitmap bitmapCreateBitmap;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static void a(File file) {
        File[] fileArrListFiles;
        if (file == null || !file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles()) == null || fileArrListFiles.length <= 0) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (!file2.delete()) {
                X.b("cannot delete file:%s", file2.getAbsolutePath());
            }
        }
    }

    public static synchronized <T extends Parcelable> boolean a(String str, T t10) {
        boolean z10 = false;
        if (t10 == null) {
            return false;
        }
        byte[] bArrA = ca.a(t10);
        if (bArrA != null) {
            if (C0012p.f5037a.a(1002, str, bArrA)) {
                z10 = true;
            }
        }
        return z10;
    }

    public static synchronized <T extends Parcelable> T a(String str, Parcelable.Creator<T> creator) {
        Map<String, byte[]> mapC = C0012p.f5037a.c();
        if (mapC == null) {
            return null;
        }
        byte[] bArr = mapC.get(str);
        if (bArr != null && bArr.length > 0) {
            return (T) ca.a(bArr, creator);
        }
        return null;
    }

    public static synchronized boolean a(String str) {
        return C0012p.f5037a.a(str);
    }

    public static String a(String str, String str2) {
        SharedPreferences sharedPreferences = e.f4381b.D;
        return sharedPreferences != null ? sharedPreferences.getString(str, str2) : str2;
    }

    public static boolean a(String str, boolean z10) {
        SharedPreferences sharedPreferences = e.f4381b.D;
        return sharedPreferences != null ? sharedPreferences.getBoolean(str, z10) : z10;
    }

    public static String a(Context context, String str) {
        Bundle bundle;
        Object obj;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && (obj = bundle.get(str)) != null) {
                return String.valueOf(obj);
            }
            return null;
        } catch (Exception e10) {
            X.b(a.class, "getManifestMetaDataValue exception:" + e10.getMessage(), new Object[0]);
            return null;
        }
    }
}
