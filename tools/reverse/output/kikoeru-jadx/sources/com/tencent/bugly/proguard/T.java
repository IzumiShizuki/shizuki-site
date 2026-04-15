package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Process;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static T f4882a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f4884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public P f4885d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f4887f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f4888g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<Integer, Long> f4886e = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private LinkedBlockingQueue<Runnable> f4889h = new LinkedBlockingQueue<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private LinkedBlockingQueue<Runnable> f4890i = new LinkedBlockingQueue<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Object f4891j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f4892k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f4893l = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final J f4883b = J.a();

    public T(Context context) {
        this.f4884c = context;
    }

    public static /* synthetic */ int b(T t10) {
        int i10 = t10.f4893l - 1;
        t10.f4893l = i10;
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #1 {all -> 0x0052, blocks: (B:9:0x001e, B:13:0x004b, B:14:0x0050, B:27:0x0065, B:32:0x006f, B:40:0x0091, B:39:0x0086, B:43:0x0097, B:51:0x00b9, B:50:0x00ae, B:52:0x00bc, B:22:0x005c, B:24:0x0060, B:35:0x007a, B:46:0x00a2), top: B:95:0x001e, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0097 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #1 {all -> 0x0052, blocks: (B:9:0x001e, B:13:0x004b, B:14:0x0050, B:27:0x0065, B:32:0x006f, B:40:0x0091, B:39:0x0086, B:43:0x0097, B:51:0x00b9, B:50:0x00ae, B:52:0x00bc, B:22:0x005c, B:24:0x0060, B:35:0x007a, B:46:0x00a2), top: B:95:0x001e, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c(int r13) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.T.c(int):void");
    }

    public static synchronized T a(Context context) {
        try {
            if (f4882a == null) {
                f4882a = new T(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f4882a;
    }

    public synchronized long b(int i10) {
        if (i10 >= 0) {
            Long l10 = this.f4886e.get(Integer.valueOf(i10));
            if (l10 != null) {
                return l10.longValue();
            }
        } else {
            X.b("[UploadManager] Unknown upload ID: %d", Integer.valueOf(i10));
        }
        return 0L;
    }

    public static synchronized T a() {
        return f4882a;
    }

    public void a(int i10, int i11, byte[] bArr, String str, String str2, P p10, long j10, boolean z10) {
        try {
            a(new U(this.f4884c, i10, i11, bArr, str, str2, p10, true, z10), true, true, j10);
        } catch (Throwable th2) {
            if (X.b(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    public void a(int i10, pa paVar, String str, String str2, P p10, long j10, boolean z10) {
        a(i10, paVar.f5046i, M.a((Object) paVar), str, str2, p10, j10, z10);
    }

    public void a(int i10, int i11, byte[] bArr, String str, String str2, P p10, int i12, int i13, boolean z10, Map<String, String> map) {
        try {
            a(new U(this.f4884c, i10, i11, bArr, str, str2, p10, true, i12, i13, false, map), z10, false, 0L);
        } catch (Throwable th2) {
            if (X.b(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    public void a(int i10, int i11, byte[] bArr, String str, String str2, P p10, boolean z10, Map<String, String> map) {
        a(i10, i11, bArr, str, str2, p10, 0, 0, z10, map);
    }

    public void a(int i10, pa paVar, String str, String str2, P p10, boolean z10) {
        a(i10, paVar.f5046i, M.a((Object) paVar), str, str2, p10, 0, 0, z10, null);
    }

    public long a(boolean z10) {
        long jB;
        long jB2 = ca.b();
        int i10 = z10 ? 5 : 3;
        List<L> listA = this.f4883b.a(i10);
        if (listA != null && listA.size() > 0) {
            jB = 0;
            try {
                L l10 = listA.get(0);
                if (l10.f4876e >= jB2) {
                    jB = ca.b(l10.f4878g);
                    if (i10 == 3) {
                        this.f4887f = jB;
                    } else {
                        this.f4888g = jB;
                    }
                    listA.remove(l10);
                }
            } catch (Throwable th2) {
                X.b(th2);
            }
            if (listA.size() > 0) {
                this.f4883b.a(listA);
            }
        } else {
            jB = z10 ? this.f4888g : this.f4887f;
        }
        X.a("[UploadManager] Local network consume: %d KB", Long.valueOf(jB / 1024));
        return jB;
    }

    public synchronized void a(long j10, boolean z10) {
        int i10 = z10 ? 5 : 3;
        try {
            L l10 = new L();
            l10.f4873b = i10;
            l10.f4876e = ca.b();
            l10.f4874c = "";
            l10.f4875d = "";
            l10.f4878g = ca.b(j10);
            this.f4883b.b(i10);
            this.f4883b.c(l10);
            if (z10) {
                this.f4888g = j10;
            } else {
                this.f4887f = j10;
            }
            X.a("[UploadManager] Network total consume: %d KB", Long.valueOf(j10 / 1024));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void a(int i10, long j10) {
        try {
            if (i10 >= 0) {
                this.f4886e.put(Integer.valueOf(i10), Long.valueOf(j10));
                L l10 = new L();
                l10.f4873b = i10;
                l10.f4876e = j10;
                l10.f4874c = "";
                l10.f4875d = "";
                l10.f4878g = new byte[0];
                this.f4883b.b(i10);
                this.f4883b.c(l10);
                X.a("[UploadManager] Uploading(ID:%d) time: %s", Integer.valueOf(i10), ca.a(j10));
            } else {
                X.b("[UploadManager] Unknown uploading ID: %d", Integer.valueOf(i10));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public boolean a(int i10) {
        if (com.tencent.bugly.b.f4350c) {
            X.a("Uploading frequency will not be checked if SDK is in debug mode.", new Object[0]);
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - b(i10);
        X.a("[UploadManager] Time interval is %d seconds since last uploading(ID: %d).", Long.valueOf(jCurrentTimeMillis / 1000), Integer.valueOf(i10));
        if (jCurrentTimeMillis >= 30000) {
            return true;
        }
        X.c("[UploadManager] Data only be uploaded once in %d seconds.", 30L);
        return false;
    }

    private boolean a(Runnable runnable, boolean z10) {
        if (runnable == null) {
            X.c("[UploadManager] Upload task should not be null", new Object[0]);
            return false;
        }
        try {
            X.a("[UploadManager] Add upload task to queue (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
            synchronized (this.f4891j) {
                try {
                    if (z10) {
                        this.f4889h.put(runnable);
                    } else {
                        this.f4890i.put(runnable);
                    }
                } finally {
                }
            }
            return true;
        } catch (Throwable th2) {
            X.b("[UploadManager] Failed to add upload task to queue: %s", th2.getMessage());
            return false;
        }
    }

    private void a(Runnable runnable, long j10) {
        if (runnable == null) {
            X.e("[UploadManager] Upload task should not be null", new Object[0]);
            return;
        }
        X.a("[UploadManager] Execute synchronized upload task (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        Thread threadA = ca.a(runnable, "BUGLY_SYNC_UPLOAD");
        if (threadA == null) {
            X.b("[UploadManager] Failed to start a thread to execute synchronized upload task, add it to queue.", new Object[0]);
            a(runnable, true);
            return;
        }
        try {
            threadA.join(j10);
        } catch (Throwable th2) {
            X.b("[UploadManager] Failed to join upload synchronized task with message: %s. Add it to queue.", th2.getMessage());
            a(runnable, true);
            c(0);
        }
    }

    private void a(Runnable runnable, boolean z10, boolean z11, long j10) {
        if (runnable == null) {
            X.e("[UploadManager] Upload task should not be null", new Object[0]);
        }
        X.a("[UploadManager] Add upload task (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        if (z11) {
            a(runnable, j10);
        } else {
            a(runnable, z10);
            c(0);
        }
    }
}
