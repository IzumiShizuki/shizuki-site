package com.tencent.bugly.proguard;

import com.tencent.bugly.beta.interfaces.BetaPatchListener;
import com.tencent.bugly.beta.tinker.TinkerManager;
import com.tencent.bugly.beta.ui.HotfixDialog;
import com.tencent.bugly.beta.ui.UiManager;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements TinkerManager.TinkerListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.bugly.beta.global.e f4966a;

    public e0(com.tencent.bugly.beta.global.e eVar) {
        this.f4966a = eVar;
    }

    @Override // com.tencent.bugly.beta.tinker.TinkerManager.TinkerListener
    public final void onApplyFailure(String str) {
        com.tencent.bugly.beta.global.e eVar = this.f4966a;
        eVar.P = false;
        com.tencent.bugly.beta.global.a.b("PatchResult", false);
        com.tencent.bugly.beta.global.a.b("IS_PATCHING", false);
        X.c("Tinker patch failure, result: " + str, new Object[0]);
        BetaPatchListener betaPatchListener = eVar.Y;
        if (betaPatchListener != null) {
            betaPatchListener.onApplyFailure(str);
        }
    }

    @Override // com.tencent.bugly.beta.tinker.TinkerManager.TinkerListener
    public final void onApplySuccess(String str) {
        com.tencent.bugly.beta.global.e eVar = this.f4966a;
        eVar.f4389ea = false;
        eVar.P = true;
        com.tencent.bugly.beta.global.a.b("IS_PATCHING", false);
        com.tencent.bugly.beta.global.a.b("PatchResult", true);
        X.c("Tinker patch success, result: " + str, new Object[0]);
        if (eVar.Z) {
            UiManager.show(new HotfixDialog(), true);
        }
        BetaPatchListener betaPatchListener = eVar.Y;
        if (betaPatchListener != null) {
            betaPatchListener.onApplySuccess(str);
        }
    }

    @Override // com.tencent.bugly.beta.tinker.TinkerManager.TinkerListener
    public final void onDownloadFailure(String str) {
        BetaPatchListener betaPatchListener = this.f4966a.Y;
        if (betaPatchListener != null) {
            betaPatchListener.onDownloadFailure(str);
        }
    }

    @Override // com.tencent.bugly.beta.tinker.TinkerManager.TinkerListener
    public final void onDownloadSuccess(String str) {
        BetaPatchListener betaPatchListener = this.f4966a.Y;
        if (betaPatchListener != null) {
            betaPatchListener.onDownloadSuccess(str);
        }
    }

    @Override // com.tencent.bugly.beta.tinker.TinkerManager.TinkerListener
    public final void onPatchRollback() {
        X.c("patch rollback callback.", new Object[0]);
        com.tencent.bugly.beta.global.e eVar = this.f4966a;
        BetaPatchListener betaPatchListener = eVar.Y;
        if (betaPatchListener != null) {
            betaPatchListener.onPatchRollback();
        }
        if (TinkerManager.getInstance().getPatchDirectory(eVar.f4407v) == null || TinkerManager.getInstance().getPatchDirectory(eVar.f4407v).exists()) {
            return;
        }
        com.tencent.bugly.beta.global.a.b("IS_PATCH_ROLL_BACK", false);
    }

    @Override // com.tencent.bugly.beta.tinker.TinkerManager.TinkerListener
    public final void onPatchStart() {
        this.f4966a.f4389ea = true;
        com.tencent.bugly.beta.global.a.b("IS_PATCHING", true);
    }
}
