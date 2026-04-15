package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Process;
import j2.h0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class ba {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f4921a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static SimpleDateFormat f4922b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f4923c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f4924d = 30720;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static StringBuilder f4925e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static StringBuilder f4926f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f4927g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static a f4928h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static String f4929i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static String f4930j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Context f4931k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static String f4932l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static boolean f4933m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static boolean f4934n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static ExecutorService f4935o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static int f4936p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Object f4937q = new Object();

    /* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f4938a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private File f4939b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f4940c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f4941d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f4942e = 30720;

        public a(String str) {
            if (str == null || str.equals("")) {
                return;
            }
            this.f4940c = str;
            this.f4938a = a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean a() {
            try {
                File file = new File(this.f4940c);
                this.f4939b = file;
                if (file.exists() && !this.f4939b.delete()) {
                    this.f4938a = false;
                    return false;
                }
                if (this.f4939b.createNewFile()) {
                    return true;
                }
                this.f4938a = false;
                return false;
            } catch (Throwable th2) {
                X.b(th2);
                this.f4938a = false;
                return false;
            }
        }

        public boolean a(String str) {
            FileOutputStream fileOutputStream;
            if (!this.f4938a) {
                return false;
            }
            try {
                fileOutputStream = new FileOutputStream(this.f4939b, true);
                try {
                    byte[] bytes = str.getBytes("UTF-8");
                    fileOutputStream.write(bytes);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    this.f4941d += (long) bytes.length;
                    this.f4938a = true;
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                    }
                    return true;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        X.b(th);
                        this.f4938a = false;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        return false;
                    } catch (Throwable th3) {
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
            }
        }
    }

    static {
        try {
            f4922b = new SimpleDateFormat("MM-dd HH:mm:ss");
        } catch (Throwable th2) {
            X.a(th2.getCause());
        }
    }

    public static synchronized void c(String str, String str2, String str3) {
        try {
            if (f4933m && f4923c) {
                try {
                    if (f4934n) {
                        f4935o.execute(new c0(0, str, str2, str3));
                    } else {
                        f4935o.execute(new c0(1, str, str2, str3));
                    }
                } catch (Exception e10) {
                    X.a(e10);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static String d() {
        com.tencent.bugly.crashreport.b bVar;
        try {
            com.tencent.bugly.crashreport.common.info.a aVarM = com.tencent.bugly.crashreport.common.info.a.m();
            if (aVarM == null || (bVar = aVarM.f4593pa) == null) {
                return null;
            }
            return bVar.getLogFromNative();
        } catch (Throwable th2) {
            if (X.b(th2)) {
                return null;
            }
            th2.printStackTrace();
            return null;
        }
    }

    private static synchronized void e(String str, String str2, String str3) {
        String strA = a(str, str2, str3, Process.myTid());
        synchronized (f4937q) {
            try {
                f4926f.append(strA);
            } finally {
                try {
                } catch (Throwable th2) {
                }
            }
            if (f4926f.length() >= f4924d) {
                StringBuilder sb = f4926f;
                f4926f = sb.delete(0, sb.indexOf("\u0001\r\n") + 1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean f(String str, String str2, String str3) {
        com.tencent.bugly.crashreport.b bVar;
        try {
            com.tencent.bugly.crashreport.common.info.a aVarM = com.tencent.bugly.crashreport.common.info.a.m();
            if (aVarM == null || (bVar = aVarM.f4593pa) == null) {
                return false;
            }
            return bVar.appendLogToNative(str, str2, str3);
        } catch (Throwable th2) {
            if (X.b(th2)) {
                return false;
            }
            th2.printStackTrace();
            return false;
        }
    }

    private static synchronized void g(String str, String str2, String str3) {
        String strA = a(str, str2, str3, Process.myTid());
        synchronized (f4937q) {
            try {
                f4926f.append(strA);
                if (f4926f.length() <= f4924d) {
                    return;
                }
                if (f4927g) {
                    return;
                }
                f4927g = true;
                a aVar = f4928h;
                if (aVar == null) {
                    f4928h = new a(f4932l);
                } else if (aVar.f4939b == null || f4928h.f4939b.length() + ((long) f4926f.length()) > f4928h.f4942e) {
                    f4928h.a();
                }
                if (f4928h.a(f4926f.toString())) {
                    f4926f.setLength(0);
                    f4927g = false;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized void a(Context context) {
        if (f4933m || context == null || !f4923c) {
            return;
        }
        try {
            f4935o = Executors.newSingleThreadExecutor();
            f4926f = new StringBuilder(0);
            f4925e = new StringBuilder(0);
            f4931k = context;
            f4929i = com.tencent.bugly.crashreport.common.info.a.a(context).f4576h;
            f4930j = "";
            StringBuilder sb = new StringBuilder();
            sb.append(f4931k.getFilesDir().getPath());
            sb.append("/buglylog_");
            sb.append(f4929i);
            sb.append("_");
            sb.append(f4930j);
            sb.append(".txt");
            f4932l = sb.toString();
            f4936p = Process.myPid();
        } catch (Throwable unused) {
        }
        f4933m = true;
    }

    public static byte[] b() {
        return f4921a ? a() : c();
    }

    public static byte[] c() {
        if (!f4923c) {
            return null;
        }
        if (f4934n) {
            X.c("[LogUtil] Get user log from native.", new Object[0]);
            String strD = d();
            if (strD != null) {
                X.c("[LogUtil] Got user log from native: %d bytes", Integer.valueOf(strD.length()));
                return ca.a((File) null, strD, "BuglyNativeLog.txt");
            }
        }
        StringBuilder sb = new StringBuilder();
        synchronized (f4937q) {
            try {
                a aVar = f4928h;
                if (aVar != null && aVar.f4938a && f4928h.f4939b != null && f4928h.f4939b.length() > 0) {
                    sb.append(ca.a(f4928h.f4939b, 30720, true));
                }
                StringBuilder sb2 = f4926f;
                if (sb2 != null && sb2.length() > 0) {
                    sb.append(f4926f.toString());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ca.a((File) null, sb.toString(), "BuglyLog.txt");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void d(String str, String str2, String str3) {
        try {
            if (f4921a) {
                e(str, str2, str3);
            } else {
                g(str, str2, str3);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static void a(int i10) {
        synchronized (f4937q) {
            try {
                f4924d = i10;
                if (i10 < 0) {
                    f4924d = 0;
                } else if (i10 > 30720) {
                    f4924d = 30720;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void a(String str, String str2, Throwable th2) {
        if (th2 == null) {
            return;
        }
        String message = th2.getMessage();
        if (message == null) {
            message = "";
        }
        c(str, str2, message + '\n' + ca.a(th2));
    }

    private static String a(String str, String str2, String str3, long j10) {
        String string;
        f4925e.setLength(0);
        if (str3.length() > 30720) {
            str3 = str3.substring(str3.length() - 30720, str3.length() - 1);
        }
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = f4922b;
        if (simpleDateFormat != null) {
            string = simpleDateFormat.format(date);
        } else {
            string = date.toString();
        }
        StringBuilder sb = f4925e;
        sb.append(string);
        sb.append(" ");
        sb.append(f4936p);
        sb.append(" ");
        sb.append(j10);
        h0.w(sb, " ", str, " ", str2);
        sb.append(": ");
        sb.append(str3);
        sb.append("\u0001\r\n");
        return f4925e.toString();
    }

    public static byte[] a() {
        if (f4923c) {
            return ca.a((File) null, f4926f.toString(), "BuglyLog.txt");
        }
        return null;
    }
}
