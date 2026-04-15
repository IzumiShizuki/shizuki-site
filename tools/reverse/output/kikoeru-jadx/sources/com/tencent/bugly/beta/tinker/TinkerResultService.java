package com.tencent.bugly.beta.tinker;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.tencent.bugly.beta.tinker.TinkerManager;
import com.tencent.bugly.beta.tinker.TinkerUtils;
import com.tencent.tinker.lib.service.DefaultTinkerResultService;
import com.tencent.tinker.lib.service.PatchResult;
import com.tencent.tinker.lib.util.TinkerLog;
import com.tencent.tinker.lib.util.TinkerServiceInternals;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class TinkerResultService extends DefaultTinkerResultService {
    private static final String TAG = "Tinker.TinkerResultService";

    /* JADX INFO: Access modifiers changed from: private */
    public void restartProcess() {
        TinkerLog.i(TAG, "app is background now, i can kill quietly", new Object[0]);
        Process.killProcess(Process.myPid());
    }

    public void onPatchResult(PatchResult patchResult) {
        TinkerManager.TinkerPatchResultListener tinkerPatchResultListener = TinkerManager.patchResultListener;
        if (tinkerPatchResultListener != null) {
            tinkerPatchResultListener.onPatchResult(patchResult);
        }
        if (patchResult == null) {
            TinkerLog.e(TAG, "TinkerResultService received null result!!!!", new Object[0]);
            return;
        }
        TinkerLog.i(TAG, "TinkerResultService receive result: %s", new Object[]{patchResult.toString()});
        TinkerServiceInternals.killTinkerPatchServiceProcess(getApplicationContext());
        new Handler(Looper.getMainLooper()).post(new d(patchResult));
        if (patchResult.isSuccess) {
            deleteRawPatchFile(new File(patchResult.rawPatchFilePath));
            if (!checkIfNeedKill(patchResult)) {
                TinkerLog.i(TAG, "I have already install the newly patch version!", new Object[0]);
                return;
            }
            if (TinkerManager.isPatchRestartOnScreenOff()) {
                if (TinkerUtils.isBackground()) {
                    TinkerLog.i(TAG, "it is in background, just restart process", new Object[0]);
                    restartProcess();
                } else {
                    TinkerLog.i(TAG, "tinker wait screen to restart process", new Object[0]);
                    new TinkerUtils.ScreenState(getApplicationContext(), new e(this));
                }
            }
        }
    }
}
