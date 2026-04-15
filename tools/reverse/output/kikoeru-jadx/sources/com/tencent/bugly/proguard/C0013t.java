package com.tencent.bugly.proguard;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.bugly.beta.tinker.TinkerManager;
import com.tencent.bugly.beta.upgrade.BetaGrayStrategy;
import java.io.File;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class C0013t {
    public static synchronized void a(Context context) {
        String str;
        File[] fileArrListFiles;
        String strA;
        B b10;
        try {
            com.tencent.bugly.beta.global.e eVar = com.tencent.bugly.beta.global.e.f4381b;
            String absolutePath = context.getDir(TinkerManager.PATCH_DIR, 0).getAbsolutePath();
            String absolutePath2 = context.getDir("tmpPatch", 32768).getAbsolutePath();
            eVar.I = new File(absolutePath, TinkerManager.PATCH_NAME);
            if (TextUtils.isEmpty(com.tencent.bugly.beta.global.a.a("PatchFile", ""))) {
                com.tencent.bugly.beta.global.a.b("PatchFile", eVar.I.getAbsolutePath());
            }
            eVar.J = new File(absolutePath2, "tmpPatch.apk");
            if (eVar.I != null && TextUtils.isEmpty(com.tencent.bugly.beta.global.a.a("PatchFile", ""))) {
                com.tencent.bugly.beta.global.a.b("PatchFile", eVar.I.getAbsolutePath());
            }
            File dir = context.getDir("tmpPatch", 0);
            eVar.K = dir;
            if (dir != null && TextUtils.isEmpty(com.tencent.bugly.beta.global.a.a("PatchTmpDir", ""))) {
                com.tencent.bugly.beta.global.a.b("PatchTmpDir", eVar.I.getAbsolutePath());
            }
            BetaGrayStrategy betaGrayStrategy = (BetaGrayStrategy) com.tencent.bugly.beta.global.a.a("hotfix.strategy.bch", BetaGrayStrategy.CREATOR);
            if (betaGrayStrategy == null || (b10 = betaGrayStrategy.f4429a) == null || b10.f4840u != 3) {
                if (TinkerManager.getInstance().getPatchDirectory(eVar.f4407v) != null && !TinkerManager.getInstance().getPatchDirectory(eVar.f4407v).exists()) {
                    com.tencent.bugly.beta.global.a.b("IS_PATCH_ROLL_BACK", false);
                }
                if (com.tencent.bugly.beta.global.a.a("IS_PATCH_ROLL_BACK", false)) {
                    TinkerManager.getInstance().onPatchRollback(false);
                }
            } else {
                Map<String, String> map = b10.f4836q;
                if (map != null) {
                    eVar.O = map.get("H2");
                }
                eVar.P = com.tencent.bugly.beta.global.a.a("PatchResult", false);
                eVar.Q = Integer.valueOf(com.tencent.bugly.beta.global.a.a("PATCH_MAX_TIMES", "0")).intValue();
                if (eVar.P) {
                    X.c("[patch] inject success", new Object[0]);
                    if (!com.tencent.bugly.beta.global.a.a("UPLOAD_PATCH_RESULT", false)) {
                        com.tencent.bugly.beta.global.a.b("UPLOAD_PATCH_RESULT", true);
                        C0012p c0012p = C0012p.f5037a;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        B b11 = betaGrayStrategy.f4429a;
                        if (c0012p.a(new z("active", jCurrentTimeMillis, (byte) 0, 0L, null, b11.f4837r, b11.f4840u, null))) {
                            X.c("save patch success event success!", new Object[0]);
                        } else {
                            X.b("save patch success event failed!", new Object[0]);
                        }
                    }
                } else {
                    X.c("[patch] inject failure", new Object[0]);
                    if (!com.tencent.bugly.beta.global.a.a("UPLOAD_PATCH_RESULT", false)) {
                        com.tencent.bugly.beta.global.a.b("UPLOAD_PATCH_RESULT", true);
                        C0012p c0012p2 = C0012p.f5037a;
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        B b12 = betaGrayStrategy.f4429a;
                        if (c0012p2.a(new z("active", jCurrentTimeMillis2, (byte) 1, 0L, null, b12.f4837r, b12.f4840u, null))) {
                            X.c("save patch failed event success!", new Object[0]);
                        } else {
                            X.b("save patch failed event failed!", new Object[0]);
                        }
                    }
                }
            }
            if (TextUtils.isEmpty(TinkerManager.getNewTinkerId())) {
                X.e("[patch] tinker new id is null ,so patch version is invalid", new Object[0]);
                eVar.O = "";
            }
            ca.c("G15", eVar.O);
            File file = com.tencent.bugly.beta.global.e.f4381b.J;
            if (file != null && file.exists() && file.delete()) {
                X.c("[patch] delete tmpPatch.apk success", new Object[0]);
            }
            File file2 = com.tencent.bugly.beta.global.e.f4381b.I;
            if (file2 != null && file2.exists() && (strA = ca.a(file2, "SHA")) != null) {
                com.tencent.bugly.beta.global.e.f4381b.N = strA;
            }
            if (TinkerManager.isTinkerManagerInstalled()) {
                if (TextUtils.isEmpty(eVar.L)) {
                    eVar.L = TinkerManager.getTinkerId();
                }
                X.c("TINKER_ID:" + eVar.L, new Object[0]);
                eVar.M = TinkerManager.getNewTinkerId();
                X.c("NEW_TINKER_ID:" + eVar.M, new Object[0]);
                TinkerManager.getInstance().setTinkerListener(new e0(eVar));
            }
            if (TextUtils.isEmpty(com.tencent.bugly.beta.global.a.a("BaseArchName", "")) && (str = eVar.f4407v.getApplicationInfo().nativeLibraryDir) != null && (fileArrListFiles = new File(str).listFiles()) != null && fileArrListFiles.length > 0) {
                boolean z10 = false;
                for (File file3 : fileArrListFiles) {
                    if (file3.getName().endsWith(".so")) {
                        String strReplace = file3.getName().replace(".so", "");
                        if (strReplace.startsWith("lib")) {
                            strReplace = strReplace.substring(strReplace.indexOf("lib") + 3);
                        }
                        X.c("libName:" + strReplace, new Object[0]);
                        String absolutePath3 = file3.getAbsolutePath();
                        X.c("soFilePath:" + absolutePath3, new Object[0]);
                        Iterator<String> it = eVar.f4385ca.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (strReplace.equals(it.next())) {
                                    z10 = true;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (!z10) {
                            String strB = com.tencent.bugly.beta.global.a.b(absolutePath3);
                            X.c("archName:" + strB, new Object[0]);
                            if (strB != null && strB.equals("armeabi-v5te")) {
                                strB = "armeabi";
                            }
                            com.tencent.bugly.beta.global.a.b(strReplace, strB);
                            if (TextUtils.isEmpty(com.tencent.bugly.beta.global.a.a("BaseArchName", ""))) {
                                com.tencent.bugly.beta.global.a.b("BaseArchName", strB);
                            }
                            z10 = false;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
