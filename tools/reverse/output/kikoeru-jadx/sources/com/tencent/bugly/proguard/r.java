package com.tencent.bugly.proguard;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.bugly.beta.download.DownloadListener;
import com.tencent.bugly.beta.download.DownloadTask;
import com.tencent.bugly.beta.tinker.TinkerManager;
import com.tencent.bugly.beta.upgrade.BetaGrayStrategy;
import java.io.File;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static r f5077a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BetaGrayStrategy f5078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DownloadTask f5079c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.tencent.bugly.beta.global.d f5083g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f5084h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f5080d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private DownloadListener f5081e = new com.tencent.bugly.beta.download.a(4, this, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.tencent.bugly.beta.upgrade.a f5082f = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f5085i = new Object();

    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(boolean r11, boolean r12, int r13) {
        /*
            r10 = this;
            java.lang.Object r8 = r10.f5085i
            monitor-enter(r8)
            r0 = 3
            if (r13 != r0) goto L16
            if (r11 != 0) goto L16
            java.lang.String r1 = "hotfix.strategy.bch"
            android.os.Parcelable$Creator<com.tencent.bugly.beta.upgrade.BetaGrayStrategy> r3 = com.tencent.bugly.beta.upgrade.BetaGrayStrategy.CREATOR     // Catch: java.lang.Throwable -> L13
            android.os.Parcelable r1 = com.tencent.bugly.beta.global.a.a(r1, r3)     // Catch: java.lang.Throwable -> L13
            com.tencent.bugly.beta.upgrade.BetaGrayStrategy r1 = (com.tencent.bugly.beta.upgrade.BetaGrayStrategy) r1     // Catch: java.lang.Throwable -> L13
            goto L17
        L13:
            r0 = move-exception
            goto Lc6
        L16:
            r1 = 0
        L17:
            com.tencent.bugly.beta.upgrade.a r3 = r10.f5082f     // Catch: java.lang.Throwable -> L13
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L49
            boolean r6 = r3.f4439d     // Catch: java.lang.Throwable -> L13
            if (r6 != 0) goto L49
            boolean r6 = r10.f5084h     // Catch: java.lang.Throwable -> L13
            if (r6 == r11) goto L26
            goto L49
        L26:
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L13
            com.tencent.bugly.beta.upgrade.a r0 = r10.f5082f     // Catch: java.lang.Throwable -> L46
            java.lang.Object[] r0 = r0.f4438c     // Catch: java.lang.Throwable -> L46
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r11)     // Catch: java.lang.Throwable -> L46
            r0[r4] = r1     // Catch: java.lang.Throwable -> L46
            com.tencent.bugly.beta.upgrade.a r0 = r10.f5082f     // Catch: java.lang.Throwable -> L46
            java.lang.Object[] r0 = r0.f4438c     // Catch: java.lang.Throwable -> L46
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r12)     // Catch: java.lang.Throwable -> L46
            r0[r5] = r1     // Catch: java.lang.Throwable -> L46
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L46
            com.tencent.bugly.beta.global.d r0 = r10.f5083g     // Catch: java.lang.Throwable -> L13
            java.lang.Object[] r0 = r0.f4379b     // Catch: java.lang.Throwable -> L13
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L13
            r0[r4] = r1     // Catch: java.lang.Throwable -> L13
            goto Lc4
        L46:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L46
            throw r0     // Catch: java.lang.Throwable -> L13
        L49:
            r10.f5084h = r11     // Catch: java.lang.Throwable -> L13
            if (r3 == 0) goto L4f
            r3.f4439d = r5     // Catch: java.lang.Throwable -> L13
        L4f:
            com.tencent.bugly.beta.upgrade.a r3 = new com.tencent.bugly.beta.upgrade.a     // Catch: java.lang.Throwable -> L13
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r11)     // Catch: java.lang.Throwable -> L13
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r12)     // Catch: java.lang.Throwable -> L13
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L13
            r0[r4] = r6     // Catch: java.lang.Throwable -> L13
            r0[r5] = r9     // Catch: java.lang.Throwable -> L13
            r6 = 2
            r0[r6] = r1     // Catch: java.lang.Throwable -> L13
            r9 = 804(0x324, float:1.127E-42)
            r3.<init>(r5, r9, r0)     // Catch: java.lang.Throwable -> L13
            r10.f5082f = r3     // Catch: java.lang.Throwable -> L13
            com.tencent.bugly.beta.global.d r0 = new com.tencent.bugly.beta.global.d     // Catch: java.lang.Throwable -> L13
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L13
            java.lang.Boolean r9 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L13
            r6[r4] = r9     // Catch: java.lang.Throwable -> L13
            r6[r5] = r3     // Catch: java.lang.Throwable -> L13
            r3 = 12
            r0.<init>(r3, r6)     // Catch: java.lang.Throwable -> L13
            r10.f5083g = r0     // Catch: java.lang.Throwable -> L13
            java.lang.String r0 = ""
            if (r1 == 0) goto L8b
            com.tencent.bugly.proguard.B r1 = r1.f4429a     // Catch: java.lang.Throwable -> L89
            if (r1 == 0) goto L8b
            java.lang.String r0 = r1.f4837r     // Catch: java.lang.Throwable -> L89
            long r3 = r1.f4839t     // Catch: java.lang.Throwable -> L89
        L86:
            r4 = r3
            r3 = r0
            goto L8e
        L89:
            r0 = move-exception
            goto Lbb
        L8b:
            r3 = 0
            goto L86
        L8e:
            java.util.HashMap r6 = new java.util.HashMap     // Catch: java.lang.Throwable -> L89
            r6.<init>()     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = "G16"
            com.tencent.bugly.beta.global.e r1 = com.tencent.bugly.beta.global.e.f4381b     // Catch: java.lang.Throwable -> L89
            java.lang.String r1 = r1.N     // Catch: java.lang.Throwable -> L89
            r6.put(r0, r1)     // Catch: java.lang.Throwable -> L89
            com.tencent.bugly.proguard.C r1 = new com.tencent.bugly.proguard.C     // Catch: java.lang.Throwable -> L89
            r2 = r11
            r1.<init>(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L89
            byte[] r4 = com.tencent.bugly.proguard.M.a(r1)     // Catch: java.lang.Throwable -> L89
            com.tencent.bugly.beta.upgrade.b r1 = com.tencent.bugly.beta.upgrade.b.f4440a     // Catch: java.lang.Throwable -> L89
            com.tencent.bugly.beta.upgrade.a r5 = r10.f5082f     // Catch: java.lang.Throwable -> L89
            com.tencent.bugly.beta.global.e r0 = com.tencent.bugly.beta.global.e.f4381b     // Catch: java.lang.Throwable -> L89
            com.tencent.bugly.beta.upgrade.BetaUploadStrategy r0 = r0.H     // Catch: java.lang.Throwable -> L89
            com.tencent.bugly.proguard.sa r0 = r0.f4434a     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = r0.f5113h     // Catch: java.lang.Throwable -> L89
            r2 = 804(0x324, float:1.127E-42)
            r6 = r11
            r3 = r13
            r7 = r0
            r1.a(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L89
            goto Lc4
        Lbb:
            boolean r1 = com.tencent.bugly.proguard.X.a(r0)     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto Lc4
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L13
        Lc4:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L13
            return
        Lc6:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L13
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.r.a(boolean, boolean, int):void");
    }

    public synchronized void a(int i10, B b10, boolean z10) {
        C0015x c0015xA;
        File file;
        this.f5079c = null;
        BetaGrayStrategy betaGrayStrategyA = a(b10);
        this.f5078b = betaGrayStrategyA;
        if (i10 == 0 && betaGrayStrategyA != null) {
            B b11 = betaGrayStrategyA.f4429a;
            if (b11 == null || b11.f4830k == null || (file = com.tencent.bugly.beta.global.e.f4381b.I) == null || !file.exists() || !com.tencent.bugly.beta.global.a.a(file, this.f5078b.f4429a.f4830k.f5144b, "SHA")) {
                if (b10 != null) {
                    if (com.tencent.bugly.beta.global.e.f4381b.Y != null && (c0015xA = this.f5078b.f4429a.a()) != null) {
                        this.f5080d.post(new c7.r(2, c0015xA));
                    }
                    com.tencent.bugly.beta.global.e eVar = com.tencent.bugly.beta.global.e.f4381b;
                    if ((eVar.f4382aa || z10) && eVar.f4383ba) {
                        a();
                    }
                }
                return;
            }
            X.c("patch has downloaded!", new Object[0]);
            com.tencent.bugly.beta.global.e eVar2 = com.tencent.bugly.beta.global.e.f4381b;
            if (!eVar2.P && eVar2.Q <= 3) {
                X.c("patch has downloaded but not patched execute patch!", new Object[0]);
                com.tencent.bugly.beta.global.e eVar3 = com.tencent.bugly.beta.global.e.f4381b;
                int i11 = eVar3.Q + 1;
                eVar3.Q = i11;
                com.tencent.bugly.beta.global.a.b("PATCH_MAX_TIMES", String.valueOf(i11));
                com.tencent.bugly.beta.global.a.a(file, com.tencent.bugly.beta.global.e.f4381b.J);
                TinkerManager.getInstance().onDownloadSuccess(com.tencent.bugly.beta.global.e.f4381b.J.getAbsolutePath(), com.tencent.bugly.beta.global.e.f4381b.X);
            }
        }
    }

    public BetaGrayStrategy a(B b10) {
        B b11;
        Map<String, String> map;
        B b12 = b10;
        BetaGrayStrategy betaGrayStrategy = (BetaGrayStrategy) com.tencent.bugly.beta.global.a.a("hotfix.strategy.bch", BetaGrayStrategy.CREATOR);
        if (betaGrayStrategy == null || betaGrayStrategy.f4429a == null) {
            com.tencent.bugly.beta.global.a.a("hotfix.strategy.bch");
            betaGrayStrategy = null;
        }
        if (b12 != null) {
            if (b12.f4838s != 1 && betaGrayStrategy != null && !TextUtils.isEmpty(betaGrayStrategy.f4429a.f4837r) && TextUtils.equals(b12.f4837r, betaGrayStrategy.f4429a.f4837r)) {
                C0012p c0012p = C0012p.f5037a;
                long jCurrentTimeMillis = System.currentTimeMillis();
                B b13 = betaGrayStrategy.f4429a;
                c0012p.a(new z("recall", jCurrentTimeMillis, (byte) 0, 0L, null, b13.f4837r, b13.f4840u, null));
                com.tencent.bugly.beta.global.a.a("hotfix.strategy.bch");
                com.tencent.bugly.beta.global.e eVar = com.tencent.bugly.beta.global.e.f4381b;
                DownloadTask downloadTaskA = eVar.f4404s.a(betaGrayStrategy.f4429a.f4830k.f5145c, eVar.K.getAbsolutePath(), null, betaGrayStrategy.f4429a.f4830k.f5144b);
                downloadTaskA.setDownloadType(3);
                downloadTaskA.delete(true);
                File file = com.tencent.bugly.beta.global.e.f4381b.J;
                if (file != null && file.exists() && file.delete()) {
                    X.c("delete tmpPatchFile", new Object[0]);
                }
                File file2 = com.tencent.bugly.beta.global.e.f4381b.I;
                if (file2 != null && file2.exists() && file2.delete()) {
                    X.c("delete patchFile", new Object[0]);
                }
                com.tencent.bugly.beta.global.a.b("IS_PATCH_ROLL_BACK", true);
                X.c("patch rollback", new Object[0]);
                if (!ca.b(com.tencent.bugly.beta.global.e.f4381b.f4407v)) {
                    TinkerManager.getInstance().onPatchRollback(true);
                } else {
                    TinkerManager.getInstance().onPatchRollback(false);
                }
                betaGrayStrategy = null;
            }
            if (b12.f4838s != 1) {
                b12 = null;
            }
        }
        if (b12 == null) {
            if (betaGrayStrategy == null || (b11 = betaGrayStrategy.f4429a) == null || b11.f4840u != 3) {
                return null;
            }
            return betaGrayStrategy;
        }
        BetaGrayStrategy betaGrayStrategy2 = new BetaGrayStrategy();
        betaGrayStrategy2.f4429a = b12;
        betaGrayStrategy2.f4433e = System.currentTimeMillis();
        if (betaGrayStrategy != null && (!TextUtils.equals(betaGrayStrategy.f4429a.f4830k.f5145c, b12.f4830k.f5145c) || ((map = b12.f4836q) != null && TextUtils.equals(map.get("H1"), "false")))) {
            com.tencent.bugly.beta.global.e.f4381b.O = b12.f4836q.get("H2");
            com.tencent.bugly.beta.global.e eVar2 = com.tencent.bugly.beta.global.e.f4381b;
            DownloadTask downloadTaskA2 = eVar2.f4404s.a(betaGrayStrategy.f4429a.f4830k.f5145c, eVar2.K.getAbsolutePath(), null, null);
            downloadTaskA2.setDownloadType(3);
            downloadTaskA2.delete(true);
            if (betaGrayStrategy.f4429a.f4840u == 3) {
                File file3 = com.tencent.bugly.beta.global.e.f4381b.J;
                if (file3 != null && file3.exists() && file3.delete()) {
                    X.c("delete tmpPatchFile", new Object[0]);
                }
                File file4 = com.tencent.bugly.beta.global.e.f4381b.I;
                if (file4 != null && file4.exists() && file4.delete()) {
                    com.tencent.bugly.beta.global.e.f4381b.N = "";
                    X.c("delete patchFile", new Object[0]);
                }
                com.tencent.bugly.beta.global.e.f4381b.Q = 0;
                com.tencent.bugly.beta.global.a.b("PATCH_MAX_TIMES", "0");
            }
        }
        a(betaGrayStrategy2);
        X.c("onUpgradeReceived: %s [type: %d]", b12, Integer.valueOf(b12.f4840u));
        return betaGrayStrategy2;
    }

    private void a() {
        BetaGrayStrategy betaGrayStrategy = this.f5078b;
        if (betaGrayStrategy == null) {
            return;
        }
        if (this.f5079c == null) {
            com.tencent.bugly.beta.global.e eVar = com.tencent.bugly.beta.global.e.f4381b;
            DownloadTask downloadTaskA = eVar.f4404s.a(betaGrayStrategy.f4429a.f4830k.f5145c, eVar.K.getAbsolutePath(), null, this.f5078b.f4429a.f4830k.f5144b);
            this.f5079c = downloadTaskA;
            downloadTaskA.setDownloadType(3);
        }
        DownloadTask downloadTask = this.f5079c;
        if (downloadTask == null) {
            return;
        }
        downloadTask.addListener(this.f5081e);
        this.f5079c.setNeededNotify(false);
        this.f5079c.download();
    }

    private void a(BetaGrayStrategy betaGrayStrategy) {
        B b10 = betaGrayStrategy.f4429a;
        if (b10 == null || b10.f4840u != 3) {
            return;
        }
        com.tencent.bugly.beta.global.a.a("hotfix.strategy.bch", betaGrayStrategy);
    }
}
