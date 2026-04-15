package com.tencent.bugly.crashreport.crash.anr;

import android.app.ActivityManager;
import android.content.Context;
import android.os.FileObserver;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.common.info.AppInfo;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.crashreport.crash.anr.TraceFileHelper;
import com.tencent.bugly.crashreport.crash.e;
import com.tencent.bugly.proguard.J;
import com.tencent.bugly.proguard.W;
import com.tencent.bugly.proguard.X;
import com.tencent.bugly.proguard.ba;
import com.tencent.bugly.proguard.ca;
import com.tencent.bugly.proguard.da;
import com.tencent.bugly.proguard.ea;
import com.tencent.bugly.proguard.fa;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class h implements fa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static h f4702a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f4705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.tencent.bugly.crashreport.common.info.a f4706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final W f4707f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.tencent.bugly.crashreport.common.strategy.c f4708g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f4709h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final e f4710i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private FileObserver f4711j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ea f4713l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f4714m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AtomicInteger f4703b = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f4704c = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f4712k = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ActivityManager.ProcessErrorStateInfo f4715n = new ActivityManager.ProcessErrorStateInfo();

    private h(Context context, com.tencent.bugly.crashreport.common.strategy.c cVar, com.tencent.bugly.crashreport.common.info.a aVar, W w10, J j10, e eVar, BuglyStrategy.a aVar2) {
        this.f4705d = ca.a(context);
        this.f4709h = context.getDir("bugly", 0).getAbsolutePath();
        this.f4706e = aVar;
        this.f4707f = w10;
        this.f4708g = cVar;
        this.f4710i = eVar;
    }

    private boolean h() {
        ea eaVar = this.f4713l;
        if (eaVar != null && eaVar.isAlive()) {
            return false;
        }
        ea eaVar2 = new ea();
        this.f4713l = eaVar2;
        StringBuilder sb = new StringBuilder("Bugly-ThreadMonitor");
        int i10 = this.f4714m;
        this.f4714m = i10 + 1;
        sb.append(i10);
        eaVar2.setName(sb.toString());
        this.f4713l.a();
        this.f4713l.a(this);
        boolean zC = this.f4713l.c();
        this.f4707f.a(new rb.b(this, 1));
        return zC;
    }

    private synchronized void i() {
        if (a()) {
            X.e("start when started!", new Object[0]);
            return;
        }
        if (TextUtils.isEmpty(this.f4709h)) {
            return;
        }
        h();
        rb.a aVar = new rb.a(this, this.f4709h);
        this.f4711j = aVar;
        try {
            aVar.startWatching();
            X.c("startWatchingPrivateAnrDir! dumFilePath is %s", this.f4709h);
            this.f4707f.a(new rb.b(this, 2));
        } catch (Throwable th2) {
            this.f4711j = null;
            X.e("startWatchingPrivateAnrDir failed!", new Object[0]);
            if (!X.b(th2)) {
                th2.printStackTrace();
            }
        }
    }

    private boolean j() {
        ea eaVar = this.f4713l;
        if (eaVar == null) {
            return false;
        }
        boolean zD = eaVar.d();
        this.f4713l.b();
        this.f4713l.b(this);
        this.f4713l = null;
        return zD;
    }

    private synchronized void k() {
        if (!a()) {
            X.e("close when closed!", new Object[0]);
            return;
        }
        j();
        X.c("stopWatchingPrivateAnrDir", new Object[0]);
        try {
            this.f4711j.stopWatching();
            this.f4711j = null;
            X.e("close anr monitor!", new Object[0]);
        } catch (Throwable th2) {
            X.e("stop anr monitor failed!", new Object[0]);
            if (!X.b(th2)) {
                th2.printStackTrace();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.io.File l() {
        /*
            r18 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.io.File r2 = new java.io.File
            r3 = r18
            java.lang.String r4 = r3.f4709h
            r2.<init>(r4)
            boolean r4 = r2.exists()
            if (r4 == 0) goto Laa
            boolean r4 = r2.isDirectory()
            if (r4 == 0) goto Laa
            java.io.File[] r2 = r2.listFiles()     // Catch: java.lang.Throwable -> La6
            if (r2 == 0) goto L22
            int r4 = r2.length     // Catch: java.lang.Throwable -> La6
            if (r4 != 0) goto L26
        L22:
            r16 = 0
            goto Lad
        L26:
            java.lang.String r4 = "jni_mannual_bugly_trace_"
            java.lang.String r6 = ".txt"
            int r7 = r2.length     // Catch: java.lang.Throwable -> La6
            r8 = 0
            r9 = 0
        L2d:
            if (r9 >= r7) goto Laa
            r10 = r2[r9]     // Catch: java.lang.Throwable -> La6
            java.lang.String r11 = r10.getName()     // Catch: java.lang.Throwable -> La6
            boolean r12 = r11.startsWith(r4)     // Catch: java.lang.Throwable -> La6
            if (r12 == 0) goto L86
            int r12 = r11.indexOf(r6)     // Catch: java.lang.Throwable -> L83
            if (r12 <= 0) goto L86
            r13 = 24
            java.lang.String r12 = r11.substring(r13, r12)     // Catch: java.lang.Throwable -> L83
            long r12 = java.lang.Long.parseLong(r12)     // Catch: java.lang.Throwable -> L83
            long r14 = r0 - r12
            r16 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 / r16
            r16 = 0
            java.lang.String r5 = "current time %d trace time is %d s"
            java.lang.Long r17 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L80
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch: java.lang.Throwable -> L80
            r13 = 2
            java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch: java.lang.Throwable -> L80
            r13[r8] = r17     // Catch: java.lang.Throwable -> L80
            r17 = 0
            r8 = 1
            r13[r8] = r12     // Catch: java.lang.Throwable -> L89
            com.tencent.bugly.proguard.X.a(r5, r13)     // Catch: java.lang.Throwable -> L89
            java.lang.String r5 = "current time minus trace time is %d s"
            java.lang.Long r12 = java.lang.Long.valueOf(r14)     // Catch: java.lang.Throwable -> L89
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L89
            r8[r17] = r12     // Catch: java.lang.Throwable -> L89
            com.tencent.bugly.proguard.X.a(r5, r8)     // Catch: java.lang.Throwable -> L89
            r11 = 30
            int r5 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r5 < 0) goto L7f
            r8 = 0
            goto La3
        L7f:
            return r10
        L80:
            r17 = 0
            goto L89
        L83:
            r16 = 0
            goto L80
        L86:
            r16 = 0
            goto La3
        L89:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La1
            r5.<init>()     // Catch: java.lang.Throwable -> La1
            java.lang.String r8 = "Trace file that has invalid format: "
            r5.append(r8)     // Catch: java.lang.Throwable -> La1
            r5.append(r11)     // Catch: java.lang.Throwable -> La1
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> La1
            r8 = 0
            java.lang.Object[] r10 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> La1
            com.tencent.bugly.proguard.X.a(r5, r10)     // Catch: java.lang.Throwable -> La1
            goto La3
        La1:
            r0 = move-exception
            goto Lae
        La3:
            int r9 = r9 + 1
            goto L2d
        La6:
            r0 = move-exception
            r16 = 0
            goto Lae
        Laa:
            r16 = 0
            goto Lb1
        Lad:
            return r16
        Lae:
            com.tencent.bugly.proguard.X.b(r0)
        Lb1:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.crash.anr.h.l():java.io.File");
    }

    public synchronized boolean c() {
        return this.f4712k;
    }

    public void d() {
        int i10;
        boolean z10;
        int iIndexOf;
        long jB = ca.b() - com.tencent.bugly.crashreport.crash.h.f4743g;
        File file = new File(this.f4709h);
        if (file.exists() && file.isDirectory()) {
            try {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                    return;
                }
                int length = fileArrListFiles.length;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i11 < length) {
                    File file2 = fileArrListFiles[i11];
                    String name = file2.getName();
                    if (name.startsWith("bugly_trace_") || name.startsWith("bugly_trace_")) {
                        z10 = true;
                        i10 = 12;
                    } else {
                        i10 = i13;
                        z10 = false;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Number Trace file : ");
                    sb.append(name);
                    X.a(sb.toString(), new Object[0]);
                    if (z10) {
                        try {
                            iIndexOf = name.indexOf(".txt");
                        } catch (Throwable unused) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Trace file that has invalid format: ");
                            sb2.append(name);
                            X.a(sb2.toString(), new Object[0]);
                        }
                        if (iIndexOf <= 0 || Long.parseLong(name.substring(i10, iIndexOf)) < jB) {
                            if (file2.delete()) {
                                i12++;
                            }
                        }
                    }
                    i11++;
                    i13 = i10;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Number of overdue trace files that has deleted: ");
                sb3.append(i12);
                X.a(sb3.toString(), new Object[0]);
            } catch (Throwable th2) {
                X.b(th2);
            }
        }
    }

    public synchronized void e() {
        if (a()) {
            X.e("start when started!", new Object[0]);
            return;
        }
        rb.a aVar = new rb.a(this);
        this.f4711j = aVar;
        try {
            aVar.startWatching();
            X.c("start anr monitor!", new Object[0]);
            this.f4707f.a(new rb.b(this, 0));
        } catch (Throwable th2) {
            this.f4711j = null;
            X.e("start anr monitor failed!", new Object[0]);
            if (!X.b(th2)) {
                th2.printStackTrace();
            }
        }
    }

    public synchronized void f() {
        if (!a()) {
            X.e("close when closed!", new Object[0]);
            return;
        }
        try {
            this.f4711j.stopWatching();
            this.f4711j = null;
            X.e("close anr monitor!", new Object[0]);
        } catch (Throwable th2) {
            X.e("stop anr monitor failed!", new Object[0]);
            if (!X.b(th2)) {
                th2.printStackTrace();
            }
        }
    }

    public void g() {
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (i10 >= 30) {
                return;
            }
            try {
                X.c("try main sleep for make a test anr! try:%d/30 , kill it if you don't want to wait!", Integer.valueOf(i11));
                ca.c(5000L);
                i10 = i11;
            } catch (Throwable th2) {
                if (X.b(th2)) {
                    return;
                }
                th2.printStackTrace();
                return;
            }
        }
    }

    private synchronized void c(boolean z10) {
        if (this.f4712k != z10) {
            X.c("user change anr %b", Boolean.valueOf(z10));
            this.f4712k = z10;
        }
    }

    public boolean b() {
        return this.f4703b.get() != 0;
    }

    public static h a(Context context, com.tencent.bugly.crashreport.common.strategy.c cVar, com.tencent.bugly.crashreport.common.info.a aVar, W w10, J j10, e eVar, BuglyStrategy.a aVar2) {
        if (f4702a == null) {
            f4702a = new h(context, cVar, aVar, w10, j10, eVar, aVar2);
        }
        return f4702a;
    }

    public void b(boolean z10) {
        c(z10);
        boolean zC = c();
        com.tencent.bugly.crashreport.common.strategy.c cVarB = com.tencent.bugly.crashreport.common.strategy.c.b();
        if (cVarB != null) {
            zC = zC && cVarB.c().f4622f;
        }
        if (zC != a()) {
            X.c("anr changed to %b", Boolean.valueOf(zC));
            a(zC);
        }
    }

    public ActivityManager.ProcessErrorStateInfo a(Context context, long j10) {
        if (j10 < 0) {
            j10 = 0;
        }
        try {
            X.a("to find!", new Object[0]);
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            long j11 = j10 / 500;
            int i10 = 0;
            while (true) {
                X.a("waiting!", new Object[0]);
                List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
                if (processesInErrorState != null) {
                    for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                        if (processErrorStateInfo.condition == 2) {
                            X.a("found!", new Object[0]);
                            return processErrorStateInfo;
                        }
                    }
                }
                ca.c(500L);
                int i11 = i10 + 1;
                if (i10 >= j11) {
                    X.a("end!", new Object[0]);
                    return null;
                }
                i10 = i11;
            }
        } catch (Exception e10) {
            X.a(e10);
            return null;
        } catch (OutOfMemoryError e11) {
            this.f4715n.pid = Process.myPid();
            this.f4715n.shortMsg = "bugly sdk waitForAnrProcessStateChanged encount error:" + e11.getMessage();
            return this.f4715n;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str) {
        return str.startsWith("bugly_trace_");
    }

    public a a(Context context, ActivityManager.ProcessErrorStateInfo processErrorStateInfo, long j10, Map<String, String> map) {
        a aVar = new a();
        aVar.f4692c = j10;
        aVar.f4690a = processErrorStateInfo != null ? processErrorStateInfo.processName : AppInfo.a(context, Process.myPid());
        aVar.f4695f = processErrorStateInfo != null ? processErrorStateInfo.shortMsg : "";
        aVar.f4694e = processErrorStateInfo != null ? processErrorStateInfo.longMsg : "";
        aVar.f4691b = map;
        Thread thread = Looper.getMainLooper().getThread();
        if (map != null) {
            Iterator<String> it = map.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (next.startsWith(thread.getName())) {
                    aVar.f4696g = map.get(next);
                    break;
                }
            }
        }
        if (TextUtils.isEmpty(aVar.f4696g)) {
            aVar.f4696g = "main stack is null , some error may be encountered.";
        }
        Long lValueOf = Long.valueOf(aVar.f4692c);
        String str = aVar.f4693d;
        String str2 = aVar.f4690a;
        String str3 = aVar.f4696g;
        String str4 = aVar.f4695f;
        String str5 = aVar.f4694e;
        Map<String, String> map2 = aVar.f4691b;
        X.a("anr tm:%d\ntr:%s\nproc:%s\nmain stack:%s\nsMsg:%s\n lMsg:%s\n threads:%d", lValueOf, str, str2, str3, str4, str5, Integer.valueOf(map2 == null ? 0 : map2.size()));
        return aVar;
    }

    public CrashDetailBean a(a aVar) {
        CrashDetailBean crashDetailBean = new CrashDetailBean();
        try {
            crashDetailBean.C = com.tencent.bugly.crashreport.common.info.b.h();
            crashDetailBean.D = com.tencent.bugly.crashreport.common.info.b.j();
            crashDetailBean.E = com.tencent.bugly.crashreport.common.info.b.g();
            crashDetailBean.F = this.f4706e.v();
            crashDetailBean.G = this.f4706e.w();
            crashDetailBean.H = this.f4706e.x();
            if (!com.tencent.bugly.crashreport.common.info.b.i(this.f4705d)) {
                crashDetailBean.f4675w = ca.a(this.f4705d, com.tencent.bugly.crashreport.crash.h.f4741e, com.tencent.bugly.crashreport.crash.h.f4744h);
            }
            crashDetailBean.f4654b = 3;
            crashDetailBean.f4657e = this.f4706e.l();
            com.tencent.bugly.crashreport.common.info.a aVar2 = this.f4706e;
            crashDetailBean.f4658f = aVar2.E;
            crashDetailBean.f4659g = aVar2.i();
            crashDetailBean.f4665m = this.f4706e.y();
            crashDetailBean.f4666n = "ANR_EXCEPTION";
            crashDetailBean.f4667o = aVar.f4695f;
            crashDetailBean.f4669q = aVar.f4696g;
            HashMap map = new HashMap();
            crashDetailBean.Q = map;
            map.put("BUGLY_CR_01", aVar.f4694e);
            String str = crashDetailBean.f4669q;
            int iIndexOf = str != null ? str.indexOf("\n") : -1;
            crashDetailBean.f4668p = iIndexOf > 0 ? crashDetailBean.f4669q.substring(0, iIndexOf) : "GET_FAIL";
            crashDetailBean.f4670r = aVar.f4692c;
            String str2 = crashDetailBean.f4669q;
            if (str2 != null) {
                crashDetailBean.f4673u = ca.c(str2.getBytes());
            }
            crashDetailBean.f4678z = aVar.f4691b;
            crashDetailBean.A = aVar.f4690a;
            crashDetailBean.B = "main(1)";
            crashDetailBean.I = this.f4706e.r();
            crashDetailBean.f4660h = this.f4706e.p();
            crashDetailBean.f4661i = this.f4706e.o();
            crashDetailBean.f4674v = aVar.f4693d;
            com.tencent.bugly.crashreport.common.info.a aVar3 = this.f4706e;
            crashDetailBean.M = aVar3.M;
            crashDetailBean.N = aVar3.f4569d;
            crashDetailBean.O = aVar3.C();
            if (!com.tencent.bugly.crashreport.common.info.b.i(this.f4705d)) {
                this.f4710i.d(crashDetailBean);
            }
            crashDetailBean.R = this.f4706e.A();
            crashDetailBean.S = this.f4706e.t();
            crashDetailBean.T = this.f4706e.h();
            crashDetailBean.U = this.f4706e.g();
            crashDetailBean.f4677y = ba.b();
            return crashDetailBean;
        } catch (Throwable th2) {
            if (!X.b(th2)) {
                th2.printStackTrace();
            }
            return crashDetailBean;
        }
    }

    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v9 */
    public boolean a(String str, String str2, String str3) throws Throwable {
        Map<String, String[]> map;
        ?? r18;
        BufferedWriter bufferedWriter;
        boolean z10;
        TraceFileHelper.a targetDumpInfo = TraceFileHelper.readTargetDumpInfo(str3, str, true);
        char c3 = 0;
        if (targetDumpInfo != null && (map = targetDumpInfo.f4689d) != null && map.size() > 0) {
            File file = new File(str2);
            try {
                if (!file.exists()) {
                    if (!file.getParentFile().exists()) {
                        file.getParentFile().mkdirs();
                    }
                    file.createNewFile();
                }
                if (file.exists() && file.canWrite()) {
                    BufferedWriter bufferedWriter2 = null;
                    try {
                        try {
                            bufferedWriter = new BufferedWriter(new FileWriter(file, false));
                        } catch (IOException e10) {
                            e = e10;
                            r18 = 0;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        try {
                            String[] strArr = targetDumpInfo.f4689d.get("main");
                            if (strArr != null && strArr.length >= 3) {
                                String str4 = strArr[0];
                                String str5 = strArr[1];
                                bufferedWriter.write("\"main\" tid=" + strArr[2] + " :\n" + str4 + "\n" + str5 + "\n\n");
                                bufferedWriter.flush();
                            }
                            for (Map.Entry<String, String[]> entry : targetDumpInfo.f4689d.entrySet()) {
                                if (!entry.getKey().equals("main") && entry.getValue() != null && entry.getValue().length >= 3) {
                                    String str6 = entry.getValue()[c3];
                                    String str7 = entry.getValue()[1];
                                    String str8 = entry.getValue()[2];
                                    StringBuilder sb = new StringBuilder();
                                    z10 = false;
                                    try {
                                        sb.append("\"");
                                        sb.append(entry.getKey());
                                        sb.append("\" tid=");
                                        sb.append(str8);
                                        sb.append(" :\n");
                                        sb.append(str6);
                                        sb.append("\n");
                                        sb.append(str7);
                                        sb.append("\n\n");
                                        bufferedWriter.write(sb.toString());
                                        bufferedWriter.flush();
                                        c3 = 0;
                                    } catch (IOException e11) {
                                        e = e11;
                                        bufferedWriter2 = bufferedWriter;
                                        r18 = z10;
                                        if (!X.b(e)) {
                                            e.printStackTrace();
                                        }
                                        Object[] objArr = new Object[1];
                                        objArr[r18] = e.getClass().getName() + ":" + e.getMessage();
                                        X.b("dump trace fail %s", objArr);
                                        if (bufferedWriter2 != null) {
                                            try {
                                                bufferedWriter2.close();
                                            } catch (IOException e12) {
                                                if (!X.b(e12)) {
                                                    e12.printStackTrace();
                                                }
                                            }
                                        }
                                        return r18;
                                    }
                                }
                            }
                            try {
                                bufferedWriter.close();
                                return true;
                            } catch (IOException e13) {
                                if (!X.b(e13)) {
                                    e13.printStackTrace();
                                }
                                return true;
                            }
                        } catch (IOException e14) {
                            e = e14;
                            z10 = false;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedWriter2 = bufferedWriter;
                        BufferedWriter bufferedWriter3 = bufferedWriter2;
                        Throwable th4 = th;
                        if (bufferedWriter3 != null) {
                            try {
                                bufferedWriter3.close();
                                throw th4;
                            } catch (IOException e15) {
                                if (!X.b(e15)) {
                                    e15.printStackTrace();
                                    throw th4;
                                }
                                throw th4;
                            }
                        }
                        throw th4;
                    }
                } else {
                    X.b("backup file create fail %s", str2);
                    return false;
                }
            } catch (Exception e16) {
                if (!X.b(e16)) {
                    e16.printStackTrace();
                }
                X.b("backup file create error! %s  %s", e16.getClass().getName() + ":" + e16.getMessage(), str2);
                return false;
            }
        } else {
            X.b("not found trace dump for %s", str3);
            return false;
        }
    }

    public boolean a(Context context, String str, ActivityManager.ProcessErrorStateInfo processErrorStateInfo, long j10, Map<String, String> map) {
        a aVarA = a(context, processErrorStateInfo, j10, map);
        X.c("found visiable anr , start to upload!", new Object[0]);
        CrashDetailBean crashDetailBeanA = a(aVarA);
        if (crashDetailBeanA == null) {
            X.b("pack anr fail!", new Object[0]);
            return false;
        }
        com.tencent.bugly.crashreport.crash.h.g().a(crashDetailBeanA);
        if (crashDetailBeanA.f4653a >= 0) {
            X.c("backup anr record success!", new Object[0]);
        } else {
            X.e("backup anr record fail!", new Object[0]);
        }
        if (str != null && new File(str).exists()) {
            aVarA.f4693d = new File(this.f4709h, "bugly_trace_" + j10 + ".txt").getAbsolutePath();
            this.f4703b.set(3);
            if (a(str, aVarA.f4693d, aVarA.f4690a)) {
                X.c("backup trace success", new Object[0]);
            }
        } else {
            File fileL = l();
            X.c("traceFile is %s", fileL);
            if (fileL != null) {
                crashDetailBeanA.f4674v = fileL.getAbsolutePath();
            }
        }
        e.a("ANR", ca.a(), aVarA.f4690a, "main", aVarA.f4696g, crashDetailBeanA);
        if (!this.f4710i.c(crashDetailBeanA)) {
            this.f4710i.a(crashDetailBeanA, 3000L, true);
        }
        this.f4710i.e(crashDetailBeanA);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f2 A[Catch: all -> 0x00f6, TRY_LEAVE, TryCatch #2 {all -> 0x00f6, blocks: (B:73:0x00ec, B:75:0x00f2, B:80:0x00fb), top: B:95:0x00ec }] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [long] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.crash.anr.h.a(java.lang.String):void");
    }

    public synchronized boolean a() {
        return this.f4711j != null;
    }

    public synchronized void a(boolean z10) {
        try {
            if (z10) {
                i();
            } else {
                k();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void a(StrategyBean strategyBean) {
        X.e("customer decides whether to open or close.", new Object[0]);
    }

    @Override // com.tencent.bugly.proguard.fa
    public boolean a(da daVar) {
        Map<String, String> mapA;
        HashMap map = new HashMap();
        if (daVar.b().equals(Looper.getMainLooper())) {
            try {
                mapA = ca.a(200000, false);
            } catch (Throwable th2) {
                X.a(th2);
                map.put("main", th2.getMessage());
                mapA = map;
            }
            Map<String, String> map2 = mapA;
            X.a("onThreadBlock found visiable anr , start to process!", new Object[0]);
            String strD = com.tencent.bugly.crashreport.common.info.b.d(this.f4705d);
            if (!TextUtils.isEmpty(strD) && (strD.contains("XiaoMi") || strD.contains("samsung"))) {
                this.f4715n = a(this.f4705d, 20000L);
            }
            a(this.f4705d, "", this.f4715n, System.currentTimeMillis(), map2);
        } else {
            X.a("anr handler onThreadBlock only care main thread ,current thread is: %s", daVar.c());
        }
        return true;
    }
}
