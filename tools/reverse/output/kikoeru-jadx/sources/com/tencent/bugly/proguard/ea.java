package com.tencent.bugly.proguard;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class ea extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f4967a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f4968b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final List<da> f4969c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<fa> f4970d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ArrayList<da> f4971e = new ArrayList<>();

    private int e() {
        int iMax = 0;
        for (int i10 = 0; i10 < this.f4969c.size(); i10++) {
            try {
                iMax = Math.max(iMax, this.f4969c.get(i10).a());
            } catch (Exception e10) {
                X.a(e10);
                return iMax;
            }
        }
        return iMax;
    }

    public void a() {
        a(new Handler(Looper.getMainLooper()));
    }

    public void b() {
        for (int i10 = 0; i10 < this.f4969c.size(); i10++) {
            try {
                if (this.f4969c.get(i10).c().equals(Looper.getMainLooper().getThread().getName())) {
                    X.a("remove handler::%s", this.f4969c.get(i10));
                    this.f4969c.remove(i10);
                }
            } catch (Exception e10) {
                X.a(e10);
                return;
            }
        }
    }

    public boolean c() {
        if (isAlive()) {
            return false;
        }
        try {
            start();
            return true;
        } catch (Exception e10) {
            X.a(e10);
            return false;
        }
    }

    public boolean d() {
        this.f4967a = true;
        if (!isAlive()) {
            return false;
        }
        try {
            interrupt();
        } catch (Exception e10) {
            X.a(e10);
        }
        return true;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (!this.f4967a) {
            for (int i10 = 0; i10 < this.f4969c.size(); i10++) {
                try {
                    this.f4969c.get(i10).f();
                } catch (Exception e10) {
                    X.a(e10);
                } catch (OutOfMemoryError e11) {
                    X.a(e11);
                }
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            for (long jUptimeMillis2 = 2000; jUptimeMillis2 > 0 && !isInterrupted(); jUptimeMillis2 = 2000 - (SystemClock.uptimeMillis() - jUptimeMillis)) {
                Thread.sleep(jUptimeMillis2);
            }
            int iE = e();
            if (iE != 0 && iE != 1) {
                this.f4971e.clear();
                for (int i11 = 0; i11 < this.f4969c.size(); i11++) {
                    da daVar = this.f4969c.get(i11);
                    if (daVar.d()) {
                        this.f4971e.add(daVar);
                        daVar.a(Long.MAX_VALUE);
                    }
                }
                NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance();
                if (nativeCrashHandler == null || !nativeCrashHandler.isEnableCatchAnrTrace()) {
                    X.a("do not enable jni mannual dump anr trace", new Object[0]);
                } else {
                    nativeCrashHandler.dumpAnrNativeStack();
                    X.a("jni mannual dump anr trace", new Object[0]);
                }
                int i12 = 0;
                while (true) {
                    if (this.f4968b) {
                        break;
                    }
                    X.a("do not enable anr continue check", new Object[0]);
                    Thread.sleep(2000L);
                    i12++;
                    if (i12 == 15) {
                        this.f4971e.clear();
                        break;
                    }
                }
                for (int i13 = 0; i13 < this.f4971e.size(); i13++) {
                    da daVar2 = this.f4971e.get(i13);
                    for (int i14 = 0; i14 < this.f4970d.size(); i14++) {
                        X.b("main thread blocked,now begin to upload anr stack", new Object[0]);
                        this.f4970d.get(i14).a(daVar2);
                        this.f4968b = false;
                    }
                }
            }
        }
    }

    public void a(Handler handler) {
        a(handler, 5000L);
    }

    public void a(Handler handler, long j10) {
        if (handler == null) {
            X.b("addThread handler should not be null", new Object[0]);
            return;
        }
        String name = handler.getLooper().getThread().getName();
        for (int i10 = 0; i10 < this.f4969c.size(); i10++) {
            try {
                if (this.f4969c.get(i10).c().equals(handler.getLooper().getThread().getName())) {
                    X.b("addThread fail ,this thread has been added in monitor queue", new Object[0]);
                    return;
                }
            } catch (Exception e10) {
                X.a(e10);
            }
            this.f4969c.add(new da(handler, name, j10));
        }
        this.f4969c.add(new da(handler, name, j10));
    }

    public void b(fa faVar) {
        this.f4970d.remove(faVar);
    }

    public void a(fa faVar) {
        if (this.f4970d.contains(faVar)) {
            X.a("addThreadMonitorListeners fail ,this threadMonitorListener has been added in monitor queue", new Object[0]);
        } else {
            this.f4970d.add(faVar);
        }
    }

    public void a(boolean z10) {
        this.f4968b = z10;
    }
}
