package com.tencent.bugly.proguard;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static H f4859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f4860b = System.currentTimeMillis();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f4861c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SharedPreferences f4864f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<Integer, Map<String, E>> f4863e = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f4862d = com.tencent.bugly.crashreport.common.info.a.m().f4576h;

    public H(Context context) {
        this.f4861c = context;
        this.f4864f = context.getSharedPreferences("crashrecord", 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b A[Catch: all -> 0x003e, Exception -> 0x0065, PHI: r6
      0x005b: PHI (r6v12 java.io.ObjectInputStream) = (r6v11 java.io.ObjectInputStream), (r6v13 java.io.ObjectInputStream) binds: [B:26:0x004e, B:31:0x0059] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #6 {Exception -> 0x0065, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x0017, B:14:0x0039, B:34:0x0061, B:35:0x0064, B:32:0x005b), top: B:44:0x0003, outer: #7 }] */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized <T extends java.util.List<?>> T c(int r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L65
            android.content.Context r3 = r5.f4861c     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L65
            java.lang.String r4 = "crashrecord"
            java.io.File r3 = r3.getDir(r4, r1)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L65
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L65
            r4.<init>()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L65
            r4.append(r6)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L65
            java.lang.String r6 = ""
            r4.append(r6)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L65
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L65
            r2.<init>(r3, r6)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L65
            boolean r6 = r2.exists()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L65
            if (r6 != 0) goto L29
            monitor-exit(r5)
            return r0
        L29:
            java.io.ObjectInputStream r6 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L42 java.lang.ClassNotFoundException -> L46 java.io.IOException -> L51
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L42 java.lang.ClassNotFoundException -> L46 java.io.IOException -> L51
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L42 java.lang.ClassNotFoundException -> L46 java.io.IOException -> L51
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L42 java.lang.ClassNotFoundException -> L46 java.io.IOException -> L51
            java.lang.Object r2 = r6.readObject()     // Catch: java.lang.Throwable -> L40 java.lang.ClassNotFoundException -> L47 java.io.IOException -> L52
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L40 java.lang.ClassNotFoundException -> L47 java.io.IOException -> L52
            r6.close()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L65
            monitor-exit(r5)
            return r2
        L3e:
            r6 = move-exception
            goto L6e
        L40:
            r2 = move-exception
            goto L5f
        L42:
            r6 = move-exception
            r2 = r6
            r6 = r0
            goto L5f
        L46:
            r6 = r0
        L47:
            java.lang.String r2 = "get object error"
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L40
            com.tencent.bugly.proguard.X.c(r2, r3)     // Catch: java.lang.Throwable -> L40
            if (r6 == 0) goto L6c
            goto L5b
        L51:
            r6 = r0
        L52:
            java.lang.String r2 = "open record file error"
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L40
            com.tencent.bugly.proguard.X.c(r2, r3)     // Catch: java.lang.Throwable -> L40
            if (r6 == 0) goto L6c
        L5b:
            r6.close()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L65
            goto L6c
        L5f:
            if (r6 == 0) goto L64
            r6.close()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L65
        L64:
            throw r2     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L65
        L65:
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L3e
            java.lang.String r1 = "readCrashRecord error"
            com.tencent.bugly.proguard.X.b(r1, r6)     // Catch: java.lang.Throwable -> L3e
        L6c:
            monitor-exit(r5)
            return r0
        L6e:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3e
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.H.c(int):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean b(int i10) {
        try {
            try {
                List<E> listC = c(i10);
                if (listC == null) {
                    return false;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (E e10 : listC) {
                    String str = e10.f4853b;
                    if (str != null && str.equalsIgnoreCase(this.f4862d) && e10.f4855d > 0) {
                        arrayList.add(e10);
                    }
                    if (e10.f4854c + 86400000 < jCurrentTimeMillis) {
                        arrayList2.add(e10);
                    }
                }
                Collections.sort(arrayList);
                if (arrayList.size() >= 2) {
                    if (arrayList.size() <= 0 || ((E) arrayList.get(arrayList.size() - 1)).f4854c + 86400000 >= jCurrentTimeMillis) {
                        return true;
                    }
                    listC.clear();
                    a(i10, listC);
                    return false;
                }
                listC.removeAll(arrayList2);
                a(i10, listC);
                return false;
            } catch (Exception unused) {
                X.b("isFrequentCrash failed", new Object[0]);
                return false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static synchronized H a(Context context) {
        try {
            if (f4859a == null) {
                f4859a = new H(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f4859a;
    }

    public static synchronized H a() {
        return f4859a;
    }

    public void a(int i10, int i11) {
        W.c().a(new q(this, i10, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0055 A[Catch: all -> 0x0036, Exception -> 0x0059, TryCatch #2 {Exception -> 0x0059, blocks: (B:7:0x0006, B:9:0x000c, B:11:0x001a, B:15:0x0032, B:34:0x0055, B:35:0x0058, B:31:0x004d), top: B:43:0x0006, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized <T extends java.util.List<?>> void a(int r5, T r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r6 != 0) goto L5
            monitor-exit(r4)
            return
        L5:
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L59
            android.content.Context r2 = r4.f4861c     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L59
            java.lang.String r3 = "crashrecord"
            java.io.File r2 = r2.getDir(r3, r0)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L59
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L59
            r3.<init>()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L59
            r3.append(r5)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L59
            java.lang.String r5 = ""
            r3.append(r5)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L59
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L59
            r1.<init>(r2, r5)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L59
            r5 = 0
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3e
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3e
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3e
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3e
            r2.writeObject(r6)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            r2.close()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L59
            goto L60
        L36:
            r5 = move-exception
            goto L62
        L38:
            r5 = move-exception
            goto L51
        L3a:
            r5 = move-exception
            goto L41
        L3c:
            r6 = move-exception
            goto L53
        L3e:
            r6 = move-exception
            r2 = r5
            r5 = r6
        L41:
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L38
            java.lang.String r5 = "open record file error"
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L38
            com.tencent.bugly.proguard.X.c(r5, r6)     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L60
            r2.close()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L59
            goto L60
        L51:
            r6 = r5
            r5 = r2
        L53:
            if (r5 == 0) goto L58
            r5.close()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L59
        L58:
            throw r6     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L59
        L59:
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L36
            java.lang.String r6 = "writeCrashRecord error"
            com.tencent.bugly.proguard.X.b(r6, r5)     // Catch: java.lang.Throwable -> L36
        L60:
            monitor-exit(r4)
            return
        L62:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L36
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.H.a(int, java.util.List):void");
    }

    public synchronized boolean a(int i10) {
        boolean z10;
        z10 = true;
        try {
            SharedPreferences sharedPreferences = this.f4864f;
            StringBuilder sb = new StringBuilder();
            sb.append(i10);
            sb.append("_");
            sb.append(this.f4862d);
            z10 = sharedPreferences.getBoolean(sb.toString(), true);
            W.c().a(new c4.i(this, i10));
        } catch (Exception unused) {
            X.b("canInit error", new Object[0]);
            return z10;
        }
        return z10;
    }
}
