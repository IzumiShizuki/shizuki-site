package com.tencent.bugly.beta.tinker;

import android.os.MessageQueue;
import com.tencent.tinker.lib.reporter.DefaultLoadReporter;
import com.tencent.tinker.lib.util.UpgradePatchRetry;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements MessageQueue.IdleHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TinkerLoadReporter f4416a;

    public a(TinkerLoadReporter tinkerLoadReporter) {
        this.f4416a = tinkerLoadReporter;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        if (!UpgradePatchRetry.getInstance(((DefaultLoadReporter) this.f4416a).context).onPatchRetryLoad()) {
            return false;
        }
        TinkerReport.onReportRetryPatch();
        return false;
    }
}
