package com.tencent.bugly.proguard;

import android.content.Context;
import com.tencent.bugly.crashreport.common.strategy.c;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class U implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f4896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f4897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f4898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.tencent.bugly.crashreport.common.info.a f4899f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c f4900g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final O f4901h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final T f4902i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f4903j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final P f4904k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final P f4905l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f4906m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f4907n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Map<String, String> f4908o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected int f4909p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected long f4910q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected long f4911r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f4912s;

    public U(Context context, int i10, int i11, byte[] bArr, String str, String str2, P p10, boolean z10, boolean z11) {
        this(context, i10, i11, bArr, str, str2, p10, z10, 2, 30000, z11, null);
    }

    public void a() {
        this.f4902i.a(this.f4903j, System.currentTimeMillis());
        P p10 = this.f4904k;
        if (p10 != null) {
            p10.a(this.f4897d);
        }
        P p11 = this.f4905l;
        if (p11 != null) {
            p11.a(this.f4897d);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x022c, code lost:
    
        a(null, false, 1, "response data from server is empty", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0231, code lost:
    
        r0 = com.tencent.bugly.proguard.ca.a(r10, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0235, code lost:
    
        if (r0 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0237, code lost:
    
        r10 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0238, code lost:
    
        r0 = com.tencent.bugly.proguard.M.a(r10, r4, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x023c, code lost:
    
        if (r0 != null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0246, code lost:
    
        a(null, false, 1, "failed to decode response package", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x024f, code lost:
    
        r4 = java.lang.Integer.valueOf(r0.f5070d);
        r5 = r0.f5071e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0257, code lost:
    
        if (r5 != null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0259, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x025b, code lost:
    
        r5 = r5.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x025c, code lost:
    
        com.tencent.bugly.proguard.X.a("[Upload] Response cmd is: %d, length of sBuffer is: %d", r4, java.lang.Integer.valueOf(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0271, code lost:
    
        if (a(r0, r18.f4899f, r18.f4900g) != false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0279, code lost:
    
        a(r0, false, 2, "failed to process response package", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0285, code lost:
    
        a(r0, true, 2, "successfully uploaded", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0289, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01cf, code lost:
    
        if (r9 == 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01d1, code lost:
    
        r0 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01d8, code lost:
    
        r0.append("status of server is ");
        r0.append(r9);
        a(null, false, 1, r0.toString(), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ed, code lost:
    
        com.tencent.bugly.proguard.X.a("[Upload] Received %d bytes", java.lang.Integer.valueOf(r10.length));
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01fa, code lost:
    
        if (r10.length != 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01fc, code lost:
    
        r0 = r13.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0208, code lost:
    
        if (r0.hasNext() == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x020a, code lost:
    
        r1 = r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0212, code lost:
    
        com.tencent.bugly.proguard.X.a("[Upload] HTTP headers from server: key = %s, value = %s", r1.getKey(), r1.getValue());
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instruction units count: 723
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.U.run():void");
    }

    public U(Context context, int i10, int i11, byte[] bArr, String str, String str2, P p10, boolean z10, int i12, int i13, boolean z11, Map<String, String> map) {
        this.f4894a = 2;
        this.f4895b = 30000;
        this.f4906m = null;
        this.f4909p = 0;
        this.f4910q = 0L;
        this.f4911r = 0L;
        this.f4912s = false;
        this.f4896c = context;
        this.f4899f = com.tencent.bugly.crashreport.common.info.a.a(context);
        this.f4898e = bArr;
        this.f4900g = c.b();
        this.f4901h = O.a(context);
        T tA = T.a();
        this.f4902i = tA;
        this.f4903j = i10;
        this.f4906m = str;
        this.f4907n = str2;
        this.f4904k = p10;
        this.f4905l = tA.f4885d;
        this.f4897d = i11;
        if (i12 > 0) {
            this.f4894a = i12;
        }
        if (i13 > 0) {
            this.f4895b = i13;
        }
        this.f4912s = z11;
        this.f4908o = map;
    }

    public void a(int i10, String str) {
        X.b("[Upload] Failed to upload(%d): %s", Integer.valueOf(i10), str);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.tencent.bugly.proguard.qa r22, boolean r23, int r24, java.lang.String r25, int r26) {
        /*
            r21 = this;
            r0 = r21
            int r1 = r0.f4897d
            r2 = 630(0x276, float:8.83E-43)
            if (r1 == r2) goto L1c
            r2 = 640(0x280, float:8.97E-43)
            if (r1 == r2) goto L19
            r2 = 830(0x33e, float:1.163E-42)
            if (r1 == r2) goto L1c
            r2 = 840(0x348, float:1.177E-42)
            if (r1 == r2) goto L19
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L1e
        L19:
            java.lang.String r1 = "userinfo"
            goto L1e
        L1c:
            java.lang.String r1 = "crash"
        L1e:
            r2 = 0
            r3 = 1
            if (r23 == 0) goto L2c
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r1
            java.lang.String r1 = "[Upload] Success: %s"
            com.tencent.bugly.proguard.X.c(r1, r3)
            goto L3f
        L2c:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r24)
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r4
            r5[r3] = r1
            r1 = 2
            r5[r1] = r25
            java.lang.String r1 = "[Upload] Failed to upload(%d) %s: %s"
            com.tencent.bugly.proguard.X.b(r1, r5)
        L3f:
            long r1 = r0.f4910q
            long r3 = r0.f4911r
            long r1 = r1 + r3
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L5f
            com.tencent.bugly.proguard.T r1 = r0.f4902i
            boolean r2 = r0.f4912s
            long r1 = r1.a(r2)
            long r3 = r0.f4910q
            long r1 = r1 + r3
            long r3 = r0.f4911r
            long r1 = r1 + r3
            com.tencent.bugly.proguard.T r3 = r0.f4902i
            boolean r4 = r0.f4912s
            r3.a(r1, r4)
        L5f:
            com.tencent.bugly.proguard.P r5 = r0.f4904k
            if (r5 == 0) goto L72
            int r6 = r0.f4897d
            long r8 = r0.f4910q
            long r10 = r0.f4911r
            r7 = r22
            r12 = r23
            r13 = r25
            r5.a(r6, r7, r8, r10, r12, r13)
        L72:
            com.tencent.bugly.proguard.P r12 = r0.f4905l
            if (r12 == 0) goto L88
            int r13 = r0.f4897d
            long r1 = r0.f4910q
            long r3 = r0.f4911r
            r14 = r22
            r19 = r23
            r20 = r25
            r15 = r1
            r17 = r3
            r12.a(r13, r14, r15, r17, r19, r20)
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.U.a(com.tencent.bugly.proguard.qa, boolean, int, java.lang.String, int):void");
    }

    public boolean a(qa qaVar, com.tencent.bugly.crashreport.common.info.a aVar, c cVar) {
        if (qaVar == null) {
            X.e("resp == null!", new Object[0]);
            return false;
        }
        byte b10 = qaVar.f5069c;
        if (b10 != 0) {
            X.b("resp result error %d", Byte.valueOf(b10));
            return false;
        }
        try {
            if (!ca.b(qaVar.f5075i) && !com.tencent.bugly.crashreport.common.info.a.m().q().equals(qaVar.f5075i)) {
                J.a().a(c.f4640a, "device", qaVar.f5075i.getBytes("UTF-8"), (I) null, true);
                aVar.f(qaVar.f5075i);
            }
        } catch (Throwable th2) {
            X.b(th2);
        }
        aVar.f4602u = qaVar.f5073g;
        int i10 = qaVar.f5070d;
        if (i10 == 510) {
            byte[] bArr = qaVar.f5071e;
            if (bArr == null) {
                X.b("[Upload] Strategy data is null. Response cmd: %d", Integer.valueOf(i10));
                return false;
            }
            sa saVar = (sa) M.a(bArr, sa.class);
            if (saVar == null) {
                X.b("[Upload] Failed to decode strategy from server. Response cmd: %d", Integer.valueOf(qaVar.f5070d));
                return false;
            }
            cVar.a(saVar);
        }
        return true;
    }

    public void a(String str, long j10, String str2) {
        this.f4909p++;
        this.f4910q += j10;
    }

    public void a(long j10) {
        this.f4911r += j10;
    }

    private static String a(String str) {
        if (ca.b(str)) {
            return str;
        }
        try {
            return str + "?aid=" + UUID.randomUUID().toString();
        } catch (Throwable th2) {
            X.b(th2);
            return str;
        }
    }

    private static boolean a(Map<String, String> map) {
        if (map != null && map.size() != 0) {
            if (!map.containsKey("status")) {
                X.e("[Upload] Headers does not contain %s", "status");
                return false;
            }
            if (!map.containsKey("Bugly-Version")) {
                X.e("[Upload] Headers does not contain %s", "Bugly-Version");
                return false;
            }
            String str = map.get("Bugly-Version");
            if (!str.contains("bugly")) {
                X.e("[Upload] Bugly version is not valid: %s", str);
                return false;
            }
            X.a("[Upload] Bugly version from headers is: %s", str);
            return true;
        }
        X.e("[Upload] Headers is empty.", new Object[0]);
        return false;
    }
}
