package com.tencent.bugly.beta.interfaces;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public interface BetaPatchListener {
    void onApplyFailure(String str);

    void onApplySuccess(String str);

    void onDownloadFailure(String str);

    void onDownloadReceived(long j10, long j11);

    void onDownloadSuccess(String str);

    void onPatchReceived(String str);

    void onPatchRollback();
}
