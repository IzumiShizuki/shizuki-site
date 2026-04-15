package com.tencent.bugly.beta.tinker;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TinkerManager f4417a;

    public c(TinkerManager tinkerManager) {
        this.f4417a = tinkerManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TinkerManager tinkerManager = this.f4417a;
        if (tinkerManager.tinkerListener != null) {
            tinkerManager.tinkerListener.onPatchRollback();
        }
    }
}
