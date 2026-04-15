package com.tencent.bugly.crashreport.crash;

import android.content.Context;
import android.os.Process;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.proguard.X;
import com.tencent.bugly.proguard.ba;
import com.tencent.bugly.proguard.ca;
import j2.h0;
import java.lang.Thread;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class l implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f4807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f4808b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final Context f4809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final e f4810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final com.tencent.bugly.crashreport.common.strategy.c f4811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final com.tencent.bugly.crashreport.common.info.a f4812f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected Thread.UncaughtExceptionHandler f4813g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected Thread.UncaughtExceptionHandler f4814h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected boolean f4815i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f4816j;

    public l(Context context, e eVar, com.tencent.bugly.crashreport.common.strategy.c cVar, com.tencent.bugly.crashreport.common.info.a aVar) {
        this.f4809c = context;
        this.f4810d = eVar;
        this.f4811e = cVar;
        this.f4812f = aVar;
    }

    public synchronized void a() {
        if (this.f4816j >= 10) {
            X.c("java crash handler over %d, no need set.", 10);
            return;
        }
        this.f4815i = true;
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != null) {
            if (l.class.getName().equals(defaultUncaughtExceptionHandler.getClass().getName())) {
                return;
            }
            if ("com.android.internal.os.RuntimeInit$UncaughtHandler".equals(defaultUncaughtExceptionHandler.getClass().getName())) {
                X.c("backup system java handler: %s", defaultUncaughtExceptionHandler.toString());
                this.f4814h = defaultUncaughtExceptionHandler;
                this.f4813g = defaultUncaughtExceptionHandler;
            } else {
                X.c("backup java handler: %s", defaultUncaughtExceptionHandler.toString());
                this.f4813g = defaultUncaughtExceptionHandler;
            }
        }
        Thread.setDefaultUncaughtExceptionHandler(this);
        this.f4816j++;
        X.c("registered java monitor: %s", toString());
    }

    public synchronized void b() {
        this.f4815i = false;
        X.c("close java monitor!", new Object[0]);
        if (Thread.getDefaultUncaughtExceptionHandler().getClass().getName().contains("bugly")) {
            X.c("Java monitor to unregister: %s", toString());
            Thread.setDefaultUncaughtExceptionHandler(this.f4813g);
            this.f4816j--;
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        synchronized (f4808b) {
            b(thread, th2, true, null, null);
        }
    }

    public void b(Thread thread, Throwable th2, boolean z10, String str, byte[] bArr) {
        if (z10) {
            X.b("Java Crash Happen cause by %s(%d)", thread.getName(), Long.valueOf(thread.getId()));
            if (a(thread)) {
                X.c("this class has handled this exception", new Object[0]);
                if (this.f4814h != null) {
                    X.c("call system handler", new Object[0]);
                    this.f4814h.uncaughtException(thread, th2);
                } else {
                    a(thread, th2);
                }
            }
        } else {
            X.b("Java Catch Happen", new Object[0]);
        }
        try {
            if (!this.f4815i) {
                X.a("Java crash handler is disable. Just return.", new Object[0]);
                if (z10) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f4813g;
                    if (uncaughtExceptionHandler != null && a(uncaughtExceptionHandler)) {
                        X.b("sys default last handle start!", new Object[0]);
                        this.f4813g.uncaughtException(thread, th2);
                        X.b("sys default last handle end!", new Object[0]);
                        return;
                    } else if (this.f4814h != null) {
                        X.b("system handle start!", new Object[0]);
                        this.f4814h.uncaughtException(thread, th2);
                        X.b("system handle end!", new Object[0]);
                        return;
                    } else {
                        X.b("crashreport last handle start!", new Object[0]);
                        a(thread, th2);
                        X.b("crashreport last handle end!", new Object[0]);
                        return;
                    }
                }
                return;
            }
            if (!this.f4811e.d()) {
                X.e("no remote but still store!", new Object[0]);
            }
            if (!this.f4811e.c().f4622f && this.f4811e.d()) {
                X.b("crash report was closed by remote , will not upload to Bugly , print local for helpful!", new Object[0]);
                e.a(z10 ? "JAVA_CRASH" : "JAVA_CATCH", ca.a(), this.f4812f.f4576h, thread.getName(), ca.b(th2), null);
                if (z10) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f4813g;
                    if (uncaughtExceptionHandler2 != null && a(uncaughtExceptionHandler2)) {
                        X.b("sys default last handle start!", new Object[0]);
                        this.f4813g.uncaughtException(thread, th2);
                        X.b("sys default last handle end!", new Object[0]);
                        return;
                    } else if (this.f4814h != null) {
                        X.b("system handle start!", new Object[0]);
                        this.f4814h.uncaughtException(thread, th2);
                        X.b("system handle end!", new Object[0]);
                        return;
                    } else {
                        X.b("crashreport last handle start!", new Object[0]);
                        a(thread, th2);
                        X.b("crashreport last handle end!", new Object[0]);
                        return;
                    }
                }
                return;
            }
            CrashDetailBean crashDetailBeanA = a(thread, th2, z10, str, bArr);
            if (crashDetailBeanA == null) {
                X.b("pkg crash datas fail!", new Object[0]);
                if (z10) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = this.f4813g;
                    if (uncaughtExceptionHandler3 != null && a(uncaughtExceptionHandler3)) {
                        X.b("sys default last handle start!", new Object[0]);
                        this.f4813g.uncaughtException(thread, th2);
                        X.b("sys default last handle end!", new Object[0]);
                        return;
                    } else if (this.f4814h != null) {
                        X.b("system handle start!", new Object[0]);
                        this.f4814h.uncaughtException(thread, th2);
                        X.b("system handle end!", new Object[0]);
                        return;
                    } else {
                        X.b("crashreport last handle start!", new Object[0]);
                        a(thread, th2);
                        X.b("crashreport last handle end!", new Object[0]);
                        return;
                    }
                }
                return;
            }
            e.a(z10 ? "JAVA_CRASH" : "JAVA_CATCH", ca.a(), this.f4812f.f4576h, thread.getName(), ca.b(th2), crashDetailBeanA);
            if (!this.f4810d.c(crashDetailBeanA)) {
                this.f4810d.a(crashDetailBeanA, 3000L, z10);
            }
            if (z10) {
                this.f4810d.e(crashDetailBeanA);
            }
            if (z10) {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler4 = this.f4813g;
                if (uncaughtExceptionHandler4 != null && a(uncaughtExceptionHandler4)) {
                    X.b("sys default last handle start!", new Object[0]);
                    this.f4813g.uncaughtException(thread, th2);
                    X.b("sys default last handle end!", new Object[0]);
                } else if (this.f4814h != null) {
                    X.b("system handle start!", new Object[0]);
                    this.f4814h.uncaughtException(thread, th2);
                    X.b("system handle end!", new Object[0]);
                } else {
                    X.b("crashreport last handle start!", new Object[0]);
                    a(thread, th2);
                    X.b("crashreport last handle end!", new Object[0]);
                }
            }
        } catch (Throwable th3) {
            try {
                if (!X.b(th3)) {
                    th3.printStackTrace();
                }
                if (z10) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = this.f4813g;
                    if (uncaughtExceptionHandler5 != null && a(uncaughtExceptionHandler5)) {
                        X.b("sys default last handle start!", new Object[0]);
                        this.f4813g.uncaughtException(thread, th2);
                        X.b("sys default last handle end!", new Object[0]);
                    } else if (this.f4814h != null) {
                        X.b("system handle start!", new Object[0]);
                        this.f4814h.uncaughtException(thread, th2);
                        X.b("system handle end!", new Object[0]);
                    } else {
                        X.b("crashreport last handle start!", new Object[0]);
                        a(thread, th2);
                        X.b("crashreport last handle end!", new Object[0]);
                    }
                }
            } catch (Throwable th4) {
                if (z10) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = this.f4813g;
                    if (uncaughtExceptionHandler6 != null && a(uncaughtExceptionHandler6)) {
                        X.b("sys default last handle start!", new Object[0]);
                        this.f4813g.uncaughtException(thread, th2);
                        X.b("sys default last handle end!", new Object[0]);
                    } else if (this.f4814h != null) {
                        X.b("system handle start!", new Object[0]);
                        this.f4814h.uncaughtException(thread, th2);
                        X.b("system handle end!", new Object[0]);
                    } else {
                        X.b("crashreport last handle start!", new Object[0]);
                        a(thread, th2);
                        X.b("crashreport last handle end!", new Object[0]);
                    }
                }
                throw th4;
            }
        }
    }

    public void a(Thread thread, Throwable th2) {
        X.b("current process die", new Object[0]);
        Process.killProcess(Process.myPid());
        System.exit(1);
    }

    public CrashDetailBean a(Thread thread, Throwable th2, boolean z10, String str, byte[] bArr) {
        String strB;
        if (th2 == null) {
            X.e("We can do nothing with a null throwable.", new Object[0]);
            return null;
        }
        boolean zI = h.g().i();
        String str2 = (zI && z10) ? " This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful![Bugly]" : "";
        if (zI && z10) {
            X.b("This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful!", new Object[0]);
        }
        CrashDetailBean crashDetailBean = new CrashDetailBean();
        crashDetailBean.C = com.tencent.bugly.crashreport.common.info.b.h();
        crashDetailBean.D = com.tencent.bugly.crashreport.common.info.b.j();
        crashDetailBean.E = com.tencent.bugly.crashreport.common.info.b.g();
        crashDetailBean.F = this.f4812f.v();
        crashDetailBean.G = this.f4812f.w();
        crashDetailBean.H = this.f4812f.x();
        crashDetailBean.f4675w = ca.a(this.f4809c, h.f4741e, h.f4744h);
        byte[] bArrB = ba.b();
        crashDetailBean.f4677y = bArrB;
        X.c("user log size:%d", Integer.valueOf(bArrB == null ? 0 : bArrB.length));
        crashDetailBean.f4654b = z10 ? 0 : 2;
        crashDetailBean.f4657e = this.f4812f.l();
        com.tencent.bugly.crashreport.common.info.a aVar = this.f4812f;
        crashDetailBean.f4658f = aVar.E;
        crashDetailBean.f4659g = aVar.i();
        crashDetailBean.f4665m = this.f4812f.y();
        String name = th2.getClass().getName();
        String strA = a(th2, 1000);
        if (strA == null) {
            strA = "";
        }
        X.b("stack frame :%d, has cause %b", Integer.valueOf(th2.getStackTrace().length), Boolean.valueOf(th2.getCause() != null));
        String string = th2.getStackTrace().length > 0 ? th2.getStackTrace()[0].toString() : "";
        Throwable cause = th2;
        while (cause != null && cause.getCause() != null) {
            cause = cause.getCause();
        }
        if (cause != null && cause != th2) {
            crashDetailBean.f4666n = cause.getClass().getName();
            String strA2 = a(cause, 1000);
            crashDetailBean.f4667o = strA2;
            if (strA2 == null) {
                crashDetailBean.f4667o = "";
            }
            if (cause.getStackTrace().length > 0) {
                crashDetailBean.f4668p = cause.getStackTrace()[0].toString();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(name);
            sb.append(":");
            sb.append(strA);
            sb.append("\n");
            sb.append(string);
            sb.append("\n......\nCaused by:\n");
            sb.append(crashDetailBean.f4666n);
            sb.append(":");
            sb.append(crashDetailBean.f4667o);
            sb.append("\n");
            strB = b(cause, h.f4742f);
            sb.append(strB);
            crashDetailBean.f4669q = sb.toString();
        } else {
            crashDetailBean.f4666n = name;
            String strK = h0.k(strA, "", str2);
            crashDetailBean.f4667o = strK;
            if (strK == null) {
                crashDetailBean.f4667o = "";
            }
            crashDetailBean.f4668p = string;
            strB = b(th2, h.f4742f);
            crashDetailBean.f4669q = strB;
        }
        crashDetailBean.f4670r = System.currentTimeMillis();
        crashDetailBean.f4673u = ca.c(crashDetailBean.f4669q.getBytes());
        try {
            crashDetailBean.f4678z = ca.a(h.f4742f, false);
            crashDetailBean.A = this.f4812f.f4576h;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(thread.getName());
            sb2.append("(");
            sb2.append(thread.getId());
            sb2.append(")");
            String string2 = sb2.toString();
            crashDetailBean.B = string2;
            crashDetailBean.f4678z.put(string2, strB);
            crashDetailBean.I = this.f4812f.r();
            crashDetailBean.f4660h = this.f4812f.p();
            crashDetailBean.f4661i = this.f4812f.o();
            com.tencent.bugly.crashreport.common.info.a aVar2 = this.f4812f;
            crashDetailBean.N = aVar2.f4569d;
            crashDetailBean.O = aVar2.C();
            if (z10) {
                this.f4810d.d(crashDetailBean);
            } else {
                boolean z11 = str != null && str.length() > 0;
                boolean z12 = bArr != null && bArr.length > 0;
                if (z11) {
                    HashMap map = new HashMap(1);
                    crashDetailBean.P = map;
                    map.put("UserData", str);
                }
                if (z12) {
                    crashDetailBean.V = bArr;
                }
            }
            crashDetailBean.R = this.f4812f.A();
            crashDetailBean.S = this.f4812f.t();
            crashDetailBean.T = this.f4812f.h();
            crashDetailBean.U = this.f4812f.g();
            return crashDetailBean;
        } catch (Throwable th3) {
            X.b("handle crash error %s", th3.toString());
            return crashDetailBean;
        }
    }

    private boolean a(Thread thread) {
        synchronized (f4808b) {
            try {
                if (f4807a != null && thread.getName().equals(f4807a)) {
                    return true;
                }
                f4807a = thread.getName();
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static String b(Throwable th2, int i10) {
        if (th2 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            if (th2.getStackTrace() != null) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    if (i10 > 0 && sb.length() >= i10) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("\n[Stack over limit size :");
                        sb2.append(i10);
                        sb2.append(" , has been cutted !]");
                        sb.append(sb2.toString());
                        return sb.toString();
                    }
                    sb.append(stackTraceElement.toString());
                    sb.append("\n");
                }
            }
        } catch (Throwable th3) {
            X.b("gen stack error %s", th3.toString());
        }
        return sb.toString();
    }

    private boolean a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        if (uncaughtExceptionHandler == null) {
            return true;
        }
        String name = uncaughtExceptionHandler.getClass().getName();
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            if (name.equals(className) && "uncaughtException".equals(methodName)) {
                return false;
            }
        }
        return true;
    }

    public synchronized void a(StrategyBean strategyBean) {
        if (strategyBean != null) {
            try {
                boolean z10 = strategyBean.f4622f;
                if (z10 != this.f4815i) {
                    X.c("java changed to %b", Boolean.valueOf(z10));
                    if (strategyBean.f4622f) {
                        a();
                    } else {
                        b();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static String a(Throwable th2, int i10) {
        if (th2.getMessage() == null) {
            return "";
        }
        if (i10 >= 0 && th2.getMessage().length() > i10) {
            return th2.getMessage().substring(0, i10) + "\n[Message over limit size:" + i10 + ", has been cutted!]";
        }
        return th2.getMessage();
    }
}
