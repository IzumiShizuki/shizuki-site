package com.tencent.bugly.beta.upgrade;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public interface UpgradeStateListener {
    void onDownloadCompleted(boolean z10);

    void onUpgradeFailed(boolean z10);

    void onUpgradeNoVersion(boolean z10);

    void onUpgradeSuccess(boolean z10);

    void onUpgrading(boolean z10);
}
