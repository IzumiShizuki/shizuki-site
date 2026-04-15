package com.tencent.bugly.crashreport.crash;

import com.tencent.bugly.proguard.X;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f4679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Thread f4680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f4681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f4682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f4683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f4684f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h f4685g;

    public a(h hVar, boolean z10, Thread thread, Throwable th2, String str, byte[] bArr, boolean z11) {
        this.f4685g = hVar;
        this.f4679a = z10;
        this.f4680b = thread;
        this.f4681c = th2;
        this.f4682d = str;
        this.f4683e = bArr;
        this.f4684f = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h hVar = this.f4685g;
        try {
            X.a("post a throwable %b", Boolean.valueOf(this.f4679a));
            hVar.f4755s.b(this.f4680b, this.f4681c, false, this.f4682d, this.f4683e);
            if (this.f4684f) {
                X.c("clear user datas", new Object[0]);
                com.tencent.bugly.crashreport.common.info.a.a(hVar.f4753q).a();
            }
        } catch (Throwable th2) {
            if (!X.a(th2)) {
                th2.printStackTrace();
            }
            X.b("java catch error: %s", this.f4681c.toString());
        }
    }
}
