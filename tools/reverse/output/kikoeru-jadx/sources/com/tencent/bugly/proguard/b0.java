package com.tencent.bugly.proguard;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4920a;

    public /* synthetic */ b0(int i10) {
        this.f4920a = i10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f4920a) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setName("BuglyThread-" + W.f4913a.getAndIncrement());
                return thread;
            default:
                Thread thread2 = new Thread(runnable);
                thread2.setName("BETA_SDK_DOWNLOAD");
                return thread2;
        }
    }
}
