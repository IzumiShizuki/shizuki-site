package com.tencent.bugly.crashreport.crash;

import com.tencent.bugly.proguard.X;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Thread f4724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f4727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f4728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Map f4729f;

    public d(Thread thread, int i10, String str, String str2, String str3, Map map) {
        this.f4724a = thread;
        this.f4725b = i10;
        this.f4726c = str;
        this.f4727d = str2;
        this.f4728e = str3;
        this.f4729f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (k.f4802a == null) {
                X.b("[ExtraCrashManager] Extra crash manager has not been initialized.", new Object[0]);
            } else {
                k.f4802a.b(this.f4724a, this.f4725b, this.f4726c, this.f4727d, this.f4728e, this.f4729f);
            }
        } catch (Throwable th2) {
            if (!X.a(th2)) {
                th2.printStackTrace();
            }
            X.b("[ExtraCrashManager] Crash error %s %s %s", this.f4726c, this.f4727d, this.f4728e);
        }
    }
}
