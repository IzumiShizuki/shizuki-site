package com.tencent.bugly.beta.upgrade;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.bugly.beta.download.BetaReceiver;
import com.tencent.bugly.beta.download.DownloadListener;
import com.tencent.bugly.beta.download.DownloadTask;
import com.tencent.bugly.beta.global.e;
import com.tencent.bugly.beta.global.f;
import com.tencent.bugly.beta.ui.UpgradeDialog;
import com.tencent.bugly.proguard.B;
import com.tencent.bugly.proguard.C0012p;
import com.tencent.bugly.proguard.C0015x;
import com.tencent.bugly.proguard.C0016y;
import com.tencent.bugly.proguard.X;
import com.tencent.bugly.proguard.ca;
import com.tencent.bugly.proguard.ra;
import com.tencent.bugly.proguard.sa;
import com.tencent.bugly.proguard.z;
import java.io.File;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static d f4441a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BetaGrayStrategy f4442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DownloadTask f4443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public DownloadListener f4444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public UpgradeListener f4445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public UpgradeStateListener f4446f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4447g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4448h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.tencent.bugly.beta.global.d f4449i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.tencent.bugly.beta.global.d f4450j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4451k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Object f4452l = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object f4453m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private DownloadListener f4454n = new com.tencent.bugly.beta.download.a(3, this, 0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a f4455o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private com.tencent.bugly.beta.global.d f4456p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f4457q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f4458r;

    private B b() {
        BetaGrayStrategy betaGrayStrategy = this.f4442b;
        if (betaGrayStrategy == null) {
            return null;
        }
        return betaGrayStrategy.f4429a;
    }

    private DownloadTask c() {
        B b10 = b();
        if (b10 == null) {
            return null;
        }
        if (this.f4443c == null) {
            e eVar = e.f4381b;
            DownloadTask downloadTaskA = eVar.f4404s.a(b10.f4830k.f5145c, eVar.f4408w.getAbsolutePath(), null, this.f4442b.f4429a.f4830k.f5144b);
            this.f4443c = downloadTaskA;
            downloadTaskA.setDownloadType(1);
        }
        return this.f4443c;
    }

    private void b(boolean z10) {
        new Handler(Looper.getMainLooper()).post(new d7.b(this, z10));
    }

    public BetaGrayStrategy a(B b10) {
        BetaGrayStrategy betaGrayStrategy;
        char c3;
        BetaGrayStrategy betaGrayStrategy2;
        C0016y c0016y;
        int i10;
        e eVar;
        int i11;
        B b11;
        C0016y c0016y2;
        int i12;
        e eVar2;
        int i13;
        C0015x c0015x;
        B b12 = b10;
        synchronized (this.f4452l) {
            try {
                BetaGrayStrategy betaGrayStrategy3 = (BetaGrayStrategy) com.tencent.bugly.beta.global.a.a("app.upgrade.strategy.bch", BetaGrayStrategy.CREATOR);
                betaGrayStrategy = null;
                if (betaGrayStrategy3 != null && betaGrayStrategy3.f4429a == null) {
                    com.tencent.bugly.beta.global.a.a("app.upgrade.strategy.bch");
                    betaGrayStrategy3 = null;
                }
                if (betaGrayStrategy3 != null && (b11 = betaGrayStrategy3.f4429a) != null && ((i12 = (c0016y2 = b11.f4829j).f5152d) < (i13 = (eVar2 = e.f4381b).f4411z) || ((i12 == i13 && c0016y2.f5154f <= eVar2.f4403r) || b11.f4838s != 1 || ((c0015x = b11.f4830k) != null && TextUtils.equals(eVar2.f4410y, c0015x.f5144b))))) {
                    com.tencent.bugly.beta.global.a.a("app.upgrade.strategy.bch");
                    this.f4443c = null;
                    betaGrayStrategy3 = null;
                }
                if (b12 != null && ((i10 = (c0016y = b12.f4829j).f5152d) < (i11 = (eVar = e.f4381b).f4411z) || (i10 == i11 && c0016y.f5154f <= eVar.f4403r))) {
                    X.c("versionCode is too small, discard remote strategy: [new: %d buildno: %d] [current: %d buildno: %d]", Integer.valueOf(i10), Integer.valueOf(b12.f4829j.f5154f), Integer.valueOf(e.f4381b.f4411z), Integer.valueOf(e.f4381b.f4403r));
                    b12 = null;
                }
                if (b12 != null) {
                    if (b12.f4838s == 2 && betaGrayStrategy3 != null && betaGrayStrategy3.f4429a != null && !TextUtils.isEmpty(b12.f4837r) && !TextUtils.isEmpty(betaGrayStrategy3.f4429a.f4837r) && TextUtils.equals(b12.f4837r, betaGrayStrategy3.f4429a.f4837r)) {
                        X.c("撤回 strategy: %s", b12.f4837r);
                        betaGrayStrategy3 = null;
                    }
                    if (b12.f4838s != 1) {
                        X.c("invalid strategy: %s", b12.f4837r);
                        b12 = null;
                    }
                }
                if (b12 != null) {
                    if (betaGrayStrategy3 == null || betaGrayStrategy3.f4429a == null || TextUtils.isEmpty(b12.f4837r) || TextUtils.isEmpty(betaGrayStrategy3.f4429a.f4837r) || !TextUtils.equals(b12.f4837r, betaGrayStrategy3.f4429a.f4837r)) {
                        c3 = 0;
                        betaGrayStrategy2 = new BetaGrayStrategy();
                    } else {
                        BetaGrayStrategy betaGrayStrategy4 = new BetaGrayStrategy(ca.d(ca.a(betaGrayStrategy3)));
                        c3 = 0;
                        X.c("same strategyId:[new: %s] [current: %s] keep has popup times: %d, interval: %d", b12.f4837r, betaGrayStrategy3.f4429a.f4837r, Integer.valueOf(betaGrayStrategy4.f4430b), Long.valueOf(b12.f4833n));
                        betaGrayStrategy2 = betaGrayStrategy4;
                    }
                    betaGrayStrategy2.f4429a = b12;
                    betaGrayStrategy2.f4433e = System.currentTimeMillis();
                    if (betaGrayStrategy3 != null && !betaGrayStrategy3.f4429a.f4830k.f5145c.equals(b12.f4830k.f5145c)) {
                        DownloadTask downloadTask = this.f4443c;
                        if (downloadTask == null) {
                            e eVar3 = e.f4381b;
                            DownloadTask downloadTaskA = eVar3.f4404s.a(betaGrayStrategy3.f4429a.f4830k.f5145c, eVar3.f4408w.getAbsolutePath(), null, null);
                            this.f4443c = downloadTaskA;
                            downloadTaskA.setDownloadType(1);
                            this.f4443c.delete(true);
                            for (File file : e.f4381b.f4408w.listFiles()) {
                                if (!file.delete()) {
                                    Object[] objArr = new Object[1];
                                    objArr[c3] = file.getAbsolutePath();
                                    X.b("cannot deleteCache file:%s", objArr);
                                }
                            }
                            this.f4443c = null;
                        } else {
                            BetaReceiver.netListeners.remove(downloadTask.getDownloadUrl());
                            this.f4443c.delete(true);
                            this.f4443c = null;
                        }
                    }
                    a(betaGrayStrategy2);
                    Integer numValueOf = Integer.valueOf(b12.f4831l);
                    Object[] objArr2 = new Object[2];
                    objArr2[c3] = b12;
                    objArr2[1] = numValueOf;
                    X.c("onUpgradeReceived: %s [type: %d]", objArr2);
                    C0012p.f5037a.a(new z("rcv", System.currentTimeMillis(), (byte) 0, 0L, b12.f4829j, b12.f4837r, b12.f4840u, null));
                    betaGrayStrategy = betaGrayStrategy2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return betaGrayStrategy;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if ((r4.f4429a.f4832m - r4.f4430b) <= 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01ab, code lost:
    
        if (r4.f4831l != 3) goto L97;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(boolean r15, boolean r16, int r17, com.tencent.bugly.proguard.B r18, java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.beta.upgrade.d.a(boolean, boolean, int, com.tencent.bugly.proguard.B, java.lang.String):void");
    }

    private void a() {
        B b10 = b();
        if (b10 == null) {
            return;
        }
        if (this.f4443c == null) {
            this.f4443c = c();
        }
        if (this.f4443c == null) {
            return;
        }
        a(this.f4442b);
        BetaReceiver.addTask(this.f4443c);
        if (this.f4443c.getStatus() == 1 && !this.f4448h) {
            if (this.f4447g && com.tencent.bugly.beta.global.a.a(e.f4381b.f4407v, this.f4443c.getSaveFile(), b10.f4830k.f5144b)) {
                C0012p.f5037a.a(new z("install", System.currentTimeMillis(), (byte) 0, 0L, b10.f4829j, b10.f4837r, b10.f4840u, null));
                return;
            } else {
                b(this.f4447g);
                return;
            }
        }
        this.f4443c.download();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10) {
        B b10 = b();
        if (b10 == null) {
            return;
        }
        if (System.currentTimeMillis() <= b10.b() - 86400000) {
            X.b(System.currentTimeMillis() + "ms", new Object[0]);
            return;
        }
        f.f4412a.a(e.f4381b.f4404s, b10.f4836q);
        if (this.f4443c == null) {
            this.f4443c = c();
        }
        DownloadTask downloadTask = this.f4443c;
        if (downloadTask == null) {
            return;
        }
        if (!z10 && downloadTask.getStatus() == 2) {
            X.c("Task is downloading %s %s", b10.f4837r, this.f4443c.getDownloadUrl());
            return;
        }
        this.f4443c.addListener(this.f4454n);
        DownloadListener downloadListener = this.f4444d;
        if (downloadListener != null) {
            this.f4443c.addListener(downloadListener);
        }
        UpgradeDialog upgradeDialog = UpgradeDialog.instance;
        upgradeDialog.setUpgradeInfo(b10, this.f4443c);
        upgradeDialog.upgradeRunnable = new com.tencent.bugly.beta.global.d(3, this.f4442b, this.f4443c);
        upgradeDialog.cancelRunnable = new com.tencent.bugly.beta.global.d(4, this.f4442b, this.f4443c, Boolean.valueOf(z10));
        this.f4442b.f4431c = System.currentTimeMillis();
        a(this.f4442b);
        if (z10) {
            f.f4412a.a(new com.tencent.bugly.beta.global.d(2, upgradeDialog, Boolean.valueOf(z10)), 3000);
        } else {
            f.f4412a.a(new com.tencent.bugly.beta.global.d(2, upgradeDialog, Boolean.valueOf(z10 || b10.f4831l == 2)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087 A[Catch: all -> 0x0035, TryCatch #1 {, blocks: (B:5:0x001c, B:9:0x002c, B:46:0x0082, B:48:0x0087, B:50:0x008b, B:52:0x008f, B:55:0x0094, B:58:0x00aa, B:93:0x015f, B:94:0x016b, B:89:0x0157, B:91:0x015b, B:62:0x00b6, B:63:0x00b7, B:65:0x00bd, B:66:0x00bf, B:83:0x0148, B:85:0x014e, B:16:0x003d, B:18:0x0047, B:20:0x004f, B:23:0x0055, B:25:0x0059, B:40:0x0077, B:42:0x007b, B:29:0x0064, B:33:0x006b, B:56:0x0095, B:57:0x00a9, B:69:0x00ed, B:71:0x00f1, B:75:0x00fd, B:77:0x0104, B:79:0x0115, B:81:0x0128), top: B:100:0x001c, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bd A[Catch: all -> 0x0035, TryCatch #1 {, blocks: (B:5:0x001c, B:9:0x002c, B:46:0x0082, B:48:0x0087, B:50:0x008b, B:52:0x008f, B:55:0x0094, B:58:0x00aa, B:93:0x015f, B:94:0x016b, B:89:0x0157, B:91:0x015b, B:62:0x00b6, B:63:0x00b7, B:65:0x00bd, B:66:0x00bf, B:83:0x0148, B:85:0x014e, B:16:0x003d, B:18:0x0047, B:20:0x004f, B:23:0x0055, B:25:0x0059, B:40:0x0077, B:42:0x007b, B:29:0x0064, B:33:0x006b, B:56:0x0095, B:57:0x00a9, B:69:0x00ed, B:71:0x00f1, B:75:0x00fd, B:77:0x0104, B:79:0x0115, B:81:0x0128), top: B:100:0x001c, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0153 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0155 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(boolean r17, boolean r18, int r19) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.beta.upgrade.d.a(boolean, boolean, int):void");
    }

    public void a(sa saVar) {
        e eVar = e.f4381b;
        if (eVar.H == null) {
            eVar.H = new BetaUploadStrategy();
        }
        if (saVar != null) {
            BetaUploadStrategy betaUploadStrategy = e.f4381b.H;
            long j10 = betaUploadStrategy.f4435b;
            long j11 = saVar.f5116k;
            if (j10 == j11) {
                return;
            }
            betaUploadStrategy.f4435b = j11;
            sa saVar2 = betaUploadStrategy.f4434a;
            saVar2.f5110e = saVar.f5110e;
            saVar2.f5111f = saVar.f5111f;
            saVar2.f5116k = j11;
            if (ca.c(saVar.f5112g)) {
                e.f4381b.H.f4434a.f5112g = saVar.f5112g;
            }
            if (ca.c(saVar.f5113h)) {
                e.f4381b.H.f4434a.f5113h = saVar.f5113h;
            }
            ra raVar = saVar.f5114i;
            if (raVar != null && !TextUtils.isEmpty(raVar.f5086a)) {
                e.f4381b.H.f4434a.f5114i.f5086a = saVar.f5114i.f5086a;
            }
            Map<String, String> map = saVar.f5115j;
            if (map != null && map.size() > 0) {
                e.f4381b.H.f4434a.f5115j = saVar.f5115j;
            }
            if (ca.c(saVar.f5117l)) {
                e.f4381b.H.f4434a.f5117l = saVar.f5117l;
            }
            if (ca.c(saVar.f5118m)) {
                e.f4381b.H.f4434a.f5118m = saVar.f5118m;
            }
            com.tencent.bugly.beta.global.a.a("us.bch", e.f4381b.H);
        }
    }

    private void a(BetaGrayStrategy betaGrayStrategy) {
        B b10 = betaGrayStrategy.f4429a;
        if (b10 == null || b10.f4840u != 1) {
            return;
        }
        com.tencent.bugly.beta.global.a.a("app.upgrade.strategy.bch", betaGrayStrategy);
    }
}
