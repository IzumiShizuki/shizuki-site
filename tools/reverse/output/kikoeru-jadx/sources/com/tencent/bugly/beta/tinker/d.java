package com.tencent.bugly.beta.tinker;

import com.tencent.tinker.lib.service.PatchResult;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PatchResult f4418a;

    public d(PatchResult patchResult) {
        this.f4418a = patchResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f4418a.isSuccess) {
            TinkerManager.getInstance().onApplySuccess(this.f4418a.toString());
        } else {
            TinkerManager.getInstance().onApplyFailure(this.f4418a.toString());
        }
    }
}
