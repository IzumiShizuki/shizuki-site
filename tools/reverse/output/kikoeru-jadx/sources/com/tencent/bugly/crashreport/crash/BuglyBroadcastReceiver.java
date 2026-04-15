package com.tencent.bugly.crashreport.crash;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import cb.t;
import com.tencent.bugly.crashreport.biz.f;
import com.tencent.bugly.proguard.T;
import com.tencent.bugly.proguard.X;
import com.tencent.bugly.proguard.ca;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class BuglyBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static BuglyBroadcastReceiver f4648a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f4650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f4651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f4652e = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IntentFilter f4649b = new IntentFilter();

    public static synchronized BuglyBroadcastReceiver getInstance() {
        try {
            if (f4648a == null) {
                f4648a = new BuglyBroadcastReceiver();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f4648a;
    }

    public synchronized void addFilter(String str) {
        try {
            if (!this.f4649b.hasAction(str)) {
                this.f4649b.addAction(str);
            }
            X.a("add action %s", str);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            a(context, intent);
        } catch (Throwable th2) {
            if (X.b(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    public synchronized void register(Context context) {
        this.f4650c = context;
        ca.a(new t(3, this, this, false));
    }

    public synchronized void unregister(Context context) {
        try {
            X.c(getClass(), "Unregister broadcast receiver of Bugly.", new Object[0]);
            context.unregisterReceiver(this);
            this.f4650c = context;
        } catch (Throwable th2) {
            if (!X.b(th2)) {
                th2.printStackTrace();
            }
        }
    }

    public final synchronized boolean a(Context context, Intent intent) {
        if (context != null && intent != null) {
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                if (this.f4652e) {
                    this.f4652e = false;
                    return true;
                }
                String strC = com.tencent.bugly.crashreport.common.info.b.c(this.f4650c);
                X.a("is Connect BC " + strC, new Object[0]);
                X.c("network %s changed to %s", "" + this.f4651d, "" + strC);
                if (strC == null) {
                    this.f4651d = null;
                    return true;
                }
                String str = this.f4651d;
                this.f4651d = strC;
                long jCurrentTimeMillis = System.currentTimeMillis();
                com.tencent.bugly.crashreport.common.strategy.c cVarB = com.tencent.bugly.crashreport.common.strategy.c.b();
                T tA = T.a();
                com.tencent.bugly.crashreport.common.info.a aVarA = com.tencent.bugly.crashreport.common.info.a.a(context);
                if (cVarB != null && tA != null && aVarA != null) {
                    if (!strC.equals(str) && jCurrentTimeMillis - tA.b(h.f4737a) > 30000) {
                        X.c("try to upload crash on network changed.", new Object[0]);
                        h hVarG = h.g();
                        if (hVarG != null) {
                            hVarG.a(0L);
                        }
                        X.c("try to upload userinfo on network changed.", new Object[0]);
                        f.f4552i.b();
                    }
                    return true;
                }
                X.e("not inited BC not work", new Object[0]);
                return true;
            }
        }
        return false;
    }
}
