package com.tencent.bugly.crashreport.common.info;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Process;
import android.text.TextUtils;
import com.tencent.bugly.proguard.X;
import com.tencent.bugly.proguard.ca;
import j2.h0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f4563a;
    public int F;
    public String G;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f4565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f4567c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f4571e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f4575g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f4576h;

    /* JADX INFO: renamed from: ha, reason: collision with root package name */
    public boolean f4577ha;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f4578i;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f4588n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f4590o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f4592p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f4594q;

    /* JADX INFO: renamed from: qa, reason: collision with root package name */
    public SharedPreferences f4595qa;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f4580j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f4582k = "com.tencent.bugly";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f4584l = "3.4.12(1.5.23)";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f4586m = "";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f4596r = "unknown";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f4598s = "unknown";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f4600t = "";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f4602u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f4604v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f4606w = -1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f4608x = -1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f4610y = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f4611z = null;
    private String A = null;
    private Map<String, PlugInBean> B = null;
    private boolean C = true;
    private String D = null;
    public String E = null;
    private String H = null;
    public String I = null;
    private Boolean J = null;
    private String K = null;
    public String L = null;
    public String M = null;
    private Map<String, PlugInBean> N = null;
    private Map<String, PlugInBean> O = null;
    public List<String> P = null;
    private int Q = -1;
    private int R = -1;
    private Map<String, String> S = new HashMap();
    private Map<String, String> T = new HashMap();
    private Map<String, String> U = new HashMap();
    private boolean V = true;
    public String W = "unknown";
    public long X = 0;
    public long Y = 0;
    public long Z = 0;

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    public long f4564aa = 0;

    /* JADX INFO: renamed from: ba, reason: collision with root package name */
    public boolean f4566ba = false;

    /* JADX INFO: renamed from: ca, reason: collision with root package name */
    public String f4568ca = null;

    /* JADX INFO: renamed from: da, reason: collision with root package name */
    public String f4570da = null;

    /* JADX INFO: renamed from: ea, reason: collision with root package name */
    public String f4572ea = null;

    /* JADX INFO: renamed from: fa, reason: collision with root package name */
    public String f4574fa = "";
    public boolean ga = false;

    /* JADX INFO: renamed from: ia, reason: collision with root package name */
    public Boolean f4579ia = null;

    /* JADX INFO: renamed from: ja, reason: collision with root package name */
    public Boolean f4581ja = null;

    /* JADX INFO: renamed from: ka, reason: collision with root package name */
    public HashMap<String, String> f4583ka = new HashMap<>();

    /* JADX INFO: renamed from: la, reason: collision with root package name */
    private String f4585la = null;

    /* JADX INFO: renamed from: ma, reason: collision with root package name */
    private String f4587ma = null;

    /* JADX INFO: renamed from: na, reason: collision with root package name */
    public List<String> f4589na = new ArrayList();

    /* JADX INFO: renamed from: oa, reason: collision with root package name */
    public boolean f4591oa = false;

    /* JADX INFO: renamed from: pa, reason: collision with root package name */
    public com.tencent.bugly.crashreport.b f4593pa = null;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final Object f4597ra = new Object();

    /* JADX INFO: renamed from: sa, reason: collision with root package name */
    private final Object f4599sa = new Object();

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private final Object f4601ta = new Object();

    /* JADX INFO: renamed from: ua, reason: collision with root package name */
    private final Object f4603ua = new Object();

    /* JADX INFO: renamed from: va, reason: collision with root package name */
    private final Object f4605va = new Object();

    /* JADX INFO: renamed from: wa, reason: collision with root package name */
    private final Object f4607wa = new Object();

    /* JADX INFO: renamed from: xa, reason: collision with root package name */
    private final Object f4609xa = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4569d = System.currentTimeMillis();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte f4573f = 1;

    private a(Context context) {
        this.G = null;
        this.f4577ha = false;
        this.f4565b = ca.a(context);
        c(context);
        this.f4575g = AppInfo.d(context);
        this.f4576h = AppInfo.a(context, Process.myPid());
        this.f4588n = b.d();
        String strF = b.f();
        this.f4590o = strF;
        this.G = AppInfo.a(context);
        String str = "Android " + b.m() + ",level " + b.c();
        this.f4592p = str;
        this.f4571e = h0.k(strF, ";", str);
        b(context);
        try {
            if (!context.getDatabasePath("bugly_db_").exists()) {
                this.f4577ha = true;
                X.a("App is first time to be installed on the device.", new Object[0]);
            }
        } catch (Throwable th2) {
            if (com.tencent.bugly.b.f4350c) {
                th2.printStackTrace();
            }
        }
        this.f4595qa = ca.a("BUGLY_COMMON_VALUES", context);
        X.a("com info create end", new Object[0]);
    }

    private void b(Context context) {
        Map<String, String> mapB = AppInfo.b(context);
        if (mapB == null) {
            return;
        }
        try {
            this.P = AppInfo.a(mapB);
            String str = mapB.get("BUGLY_APPID");
            if (str != null) {
                this.H = str;
                a("APP_ID", str);
            }
            String str2 = mapB.get("BUGLY_APP_VERSION");
            if (str2 != null) {
                this.E = str2;
            }
            String str3 = mapB.get("BUGLY_APP_CHANNEL");
            if (str3 != null) {
                this.I = str3;
            }
            String str4 = mapB.get("BUGLY_ENABLE_DEBUG");
            if (str4 != null) {
                this.f4566ba = str4.equalsIgnoreCase("true");
            }
            String str5 = mapB.get("com.tencent.rdm.uuid");
            if (str5 != null) {
                this.f4572ea = str5;
            }
            String str6 = mapB.get("BUGLY_APP_BUILD_NO");
            if (!TextUtils.isEmpty(str6)) {
                this.F = Integer.parseInt(str6);
            }
            String str7 = mapB.get("BUGLY_AREA");
            if (str7 != null) {
                this.f4574fa = str7;
            }
        } catch (Throwable th2) {
            if (X.b(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    private void c(Context context) {
        PackageInfo packageInfoC = AppInfo.c(context);
        if (packageInfoC == null) {
            return;
        }
        try {
            String str = packageInfoC.versionName;
            this.E = str;
            this.f4568ca = str;
            this.f4570da = Integer.toString(packageInfoC.versionCode);
        } catch (Throwable th2) {
            if (X.b(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    public static synchronized a m() {
        return f4563a;
    }

    public int A() {
        int i10;
        synchronized (this.f4605va) {
            i10 = this.Q;
        }
        return i10;
    }

    public boolean B() {
        if (this.f4581ja == null) {
            this.f4581ja = Boolean.valueOf(b.f(this.f4565b));
            X.c("Does it has hook frame? " + this.f4581ja, new Object[0]);
        }
        return this.f4581ja.booleanValue();
    }

    public boolean C() {
        return this.V;
    }

    public boolean D() {
        if (this.f4579ia == null) {
            this.f4579ia = Boolean.valueOf(b.h(this.f4565b));
            X.c("Is it a virtual machine? " + this.f4579ia, new Object[0]);
        }
        return this.f4579ia.booleanValue();
    }

    public String E() {
        try {
            Map<String, ?> all = this.f4565b.getSharedPreferences("BuglySdkInfos", 0).getAll();
            if (!all.isEmpty()) {
                synchronized (this.f4599sa) {
                    try {
                    } catch (Throwable th2) {
                        X.b(th2);
                    } finally {
                    }
                    for (Map.Entry<String, ?> entry : all.entrySet()) {
                        this.f4583ka.put(entry.getKey(), entry.getValue().toString());
                    }
                }
            }
        } catch (Throwable th3) {
            X.b(th3);
        }
        if (this.f4583ka.isEmpty()) {
            X.a("SDK_INFO is empty", new Object[0]);
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry2 : this.f4583ka.entrySet()) {
            sb.append("[");
            sb.append(entry2.getKey());
            sb.append(",");
            sb.append(entry2.getValue());
            sb.append("] ");
        }
        X.a("SDK_INFO = %s", sb.toString());
        a("SDK_INFO", sb.toString());
        return sb.toString();
    }

    public void F() {
        synchronized (this.f4597ra) {
            this.f4567c = UUID.randomUUID().toString();
        }
    }

    public void a(boolean z10) {
        this.V = z10;
        com.tencent.bugly.crashreport.b bVar = this.f4593pa;
        if (bVar != null) {
            bVar.setNativeIsAppForeground(z10);
        }
    }

    public void d(String str) {
        this.f4594q = str;
        synchronized (this.f4609xa) {
            this.T.put("E8", str);
        }
    }

    public String e() {
        return !ca.b(this.f4578i) ? this.f4578i : this.H;
    }

    public synchronized void f(String str) {
        this.f4600t = "" + str;
    }

    public void g(String str) {
        synchronized (this.f4607wa) {
            if (str == null) {
                str = "10000";
            }
            this.f4596r = str;
        }
    }

    public Map<String, String> h() {
        synchronized (this.f4601ta) {
            try {
                if (this.S.size() <= 0) {
                    return null;
                }
                return new HashMap(this.S);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String i() {
        if (this.D == null) {
            this.D = b.e();
        }
        return this.D;
    }

    public String j() {
        if (this.A == null) {
            this.A = b.b(this.f4565b);
        }
        return this.A;
    }

    public String k() {
        if (this.f4611z == null) {
            this.f4611z = b.a(this.f4565b, true);
        }
        return this.f4611z;
    }

    public String l() {
        String str = this.f4594q;
        if (str != null) {
            return str;
        }
        String strC = c();
        this.f4594q = strC;
        return strC;
    }

    public Boolean n() {
        if (this.J == null) {
            this.J = Boolean.valueOf(b.q());
        }
        return this.J;
    }

    public synchronized Map<String, PlugInBean> o() {
        Map<String, PlugInBean> map;
        map = this.N;
        Map<String, PlugInBean> map2 = this.O;
        if (map2 != null) {
            map.putAll(map2);
        }
        return map;
    }

    public synchronized Map<String, PlugInBean> p() {
        Map<String, PlugInBean> map = this.B;
        if (map != null && map.size() > 0) {
            HashMap map2 = new HashMap(this.B.size());
            map2.putAll(this.B);
            return map2;
        }
        return null;
    }

    public synchronized String q() {
        return this.f4600t;
    }

    public String r() {
        if (this.K == null) {
            String str = "" + b.d(this.f4565b);
            this.K = str;
            X.c("ROM ID: %s", str);
        }
        return this.K;
    }

    public String s() {
        return this.f4584l;
    }

    public int t() {
        return this.R;
    }

    public String u() {
        String str;
        synchronized (this.f4597ra) {
            try {
                if (this.f4567c == null) {
                    F();
                }
                str = this.f4567c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    public long v() {
        if (this.f4608x <= 0) {
            this.f4608x = b.i();
        }
        return this.f4608x;
    }

    public long w() {
        if (this.f4606w <= 0) {
            this.f4606w = b.k();
        }
        return this.f4606w;
    }

    public long x() {
        if (this.f4610y <= 0) {
            this.f4610y = b.l();
        }
        return this.f4610y;
    }

    public String y() {
        String str;
        synchronized (this.f4607wa) {
            str = this.f4596r;
        }
        return str;
    }

    public int z() {
        int size;
        synchronized (this.f4601ta) {
            size = this.S.size();
        }
        return size;
    }

    public Map<String, String> f() {
        synchronized (this.f4609xa) {
            try {
                if (this.T.size() <= 0) {
                    return null;
                }
                return new HashMap(this.T);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized a a(Context context) {
        try {
            if (f4563a == null) {
                f4563a = new a(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f4563a;
    }

    public synchronized void e(String str) {
        this.f4598s = "" + str;
    }

    public Map<String, String> g() {
        synchronized (this.f4603ua) {
            try {
                if (this.U.size() <= 0) {
                    return null;
                }
                return new HashMap(this.U);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int d() {
        return b.c();
    }

    public void a() {
        synchronized (this.f4601ta) {
            this.S.clear();
        }
    }

    public void c(String str) {
        this.H = str;
        a("APP_ID", str);
    }

    public String c() {
        if (!this.C) {
            return "";
        }
        if (this.f4604v == null) {
            this.f4604v = ca.b("androidid", "");
            String strA = b.a(this.f4565b);
            this.f4604v = strA;
            if (!TextUtils.isEmpty(strA)) {
                ca.c("androidid", this.f4604v);
            }
        }
        return this.f4604v;
    }

    public String a(String str) {
        String str2;
        if (ca.b(str)) {
            X.e("key should not be empty %s", h0.x("", str));
            return null;
        }
        synchronized (this.f4601ta) {
            str2 = this.S.get(str);
        }
        return str2;
    }

    public void c(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        synchronized (this.f4599sa) {
            this.f4583ka.put(str, str2);
        }
    }

    public void a(String str, String str2) {
        if (!ca.b(str) && !ca.b(str2)) {
            synchronized (this.f4603ua) {
                this.U.put(str, str2);
            }
            return;
        }
        X.e("server key&value should not be empty %s %s", h0.x("", str), h0.x("", str2));
    }

    public void b(boolean z10) {
        this.C = z10;
    }

    public String b(String str) {
        String strRemove;
        if (ca.b(str)) {
            X.e("key should not be empty %s", h0.x("", str));
            return null;
        }
        synchronized (this.f4601ta) {
            strRemove = this.S.remove(str);
        }
        return strRemove;
    }

    public void b(String str, String str2) {
        if (!ca.b(str) && !ca.b(str2)) {
            synchronized (this.f4601ta) {
                this.S.put(str, str2);
            }
            return;
        }
        X.e("key&value should not be empty %s %s", h0.x("", str), h0.x("", str2));
    }

    public void a(int i10) {
        int i11 = this.R;
        if (i11 != i10) {
            this.R = i10;
            X.c("server scene tag %d changed to tag %d", Integer.valueOf(i11), Integer.valueOf(this.R));
        }
    }

    public Set<String> b() {
        Set<String> setKeySet;
        synchronized (this.f4601ta) {
            setKeySet = this.S.keySet();
        }
        return setKeySet;
    }

    public void b(int i10) {
        synchronized (this.f4605va) {
            try {
                int i11 = this.Q;
                if (i11 != i10) {
                    this.Q = i10;
                    X.c("user scene tag %d changed to tag %d", Integer.valueOf(i11), Integer.valueOf(this.Q));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
