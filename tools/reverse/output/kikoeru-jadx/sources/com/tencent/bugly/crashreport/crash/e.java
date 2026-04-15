package com.tencent.bugly.crashreport.crash;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Environment;
import android.text.TextUtils;
import androidx.media3.exoplayer.offline.u;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.common.info.PlugInBean;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import com.tencent.bugly.proguard.AbstractC0010m;
import com.tencent.bugly.proguard.I;
import com.tencent.bugly.proguard.J;
import com.tencent.bugly.proguard.L;
import com.tencent.bugly.proguard.M;
import com.tencent.bugly.proguard.T;
import com.tencent.bugly.proguard.X;
import com.tencent.bugly.proguard.ca;
import com.tencent.bugly.proguard.ka;
import com.tencent.bugly.proguard.ma;
import com.tencent.bugly.proguard.na;
import com.tencent.bugly.proguard.oa;
import com.tencent.bugly.proguard.pa;
import j2.h0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f4730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Context f4731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final T f4732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final J f4733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final com.tencent.bugly.crashreport.common.strategy.c f4734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected m f4735f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected BuglyStrategy.a f4736g;

    public e(int i10, Context context, T t10, J j10, com.tencent.bugly.crashreport.common.strategy.c cVar, BuglyStrategy.a aVar, m mVar) {
        f4730a = i10;
        this.f4731b = context;
        this.f4732c = t10;
        this.f4733d = j10;
        this.f4734e = cVar;
        this.f4736g = aVar;
        this.f4735f = mVar;
    }

    private boolean g(CrashDetailBean crashDetailBean) {
        String absolutePath;
        try {
            X.a("save eup logs", new Object[0]);
            com.tencent.bugly.crashreport.common.info.a aVarM = com.tencent.bugly.crashreport.common.info.a.m();
            String strE = aVarM.e();
            String str = aVarM.E;
            String str2 = crashDetailBean.A;
            Locale locale = Locale.US;
            String str3 = "#--------\npackage:" + strE + "\nversion:" + str + "\nsdk:" + aVarM.f4584l + "\nprocess:" + str2 + "\ndate:" + ca.a(new Date(crashDetailBean.f4670r)) + "\ntype:" + crashDetailBean.f4666n + "\nmessage:" + crashDetailBean.f4667o + "\nstack:\n" + crashDetailBean.f4669q + "\neupID:" + crashDetailBean.f4655c + "\n";
            if (h.f4746j != null) {
                File file = new File(h.f4746j);
                if (file.isFile()) {
                    file = file.getParentFile();
                }
                absolutePath = file.getAbsolutePath();
            } else if (Environment.getExternalStorageState().equals("mounted")) {
                String absolutePath2 = Environment.getExternalStorageDirectory().getAbsolutePath();
                StringBuilder sb = new StringBuilder();
                sb.append(absolutePath2);
                sb.append("/Tencent/");
                sb.append(this.f4731b.getPackageName());
                absolutePath = sb.toString();
            } else {
                absolutePath = null;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(absolutePath);
            sb2.append("/euplog.txt");
            ca.a(this.f4731b, sb2.toString(), str3, h.f4747k);
            return true;
        } catch (Throwable th2) {
            X.e("rqdp{  save error} %s", th2.toString());
            if (!X.b(th2)) {
                th2.printStackTrace();
            }
            return false;
        }
    }

    public CrashDetailBean a(List<b> list, CrashDetailBean crashDetailBean) {
        List<CrashDetailBean> listA;
        String[] strArrSplit;
        if (list == null || list.size() == 0) {
            return crashDetailBean;
        }
        ArrayList arrayList = new ArrayList(10);
        for (b bVar : list) {
            if (bVar.f4720e) {
                arrayList.add(bVar);
            }
        }
        CrashDetailBean crashDetailBean2 = null;
        if (arrayList.size() > 0 && (listA = a(arrayList)) != null && listA.size() > 0) {
            Collections.sort(listA);
            for (int i10 = 0; i10 < listA.size(); i10++) {
                CrashDetailBean crashDetailBean3 = listA.get(i10);
                if (i10 == 0) {
                    crashDetailBean2 = crashDetailBean3;
                } else {
                    String str = crashDetailBean3.f4671s;
                    if (str != null && (strArrSplit = str.split("\n")) != null) {
                        for (String str2 : strArrSplit) {
                            if (!crashDetailBean2.f4671s.contains("" + str2)) {
                                crashDetailBean2.f4672t++;
                                crashDetailBean2.f4671s += str2 + "\n";
                            }
                        }
                    }
                }
            }
        }
        if (crashDetailBean2 == null) {
            crashDetailBean.f4662j = true;
            crashDetailBean.f4672t = 0;
            crashDetailBean.f4671s = "";
            crashDetailBean2 = crashDetailBean;
        }
        for (b bVar2 : list) {
            if (!bVar2.f4720e && !bVar2.f4719d) {
                if (!crashDetailBean2.f4671s.contains("" + bVar2.f4717b)) {
                    crashDetailBean2.f4672t++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(crashDetailBean2.f4671s);
                    crashDetailBean2.f4671s = a0.c.H(bVar2.f4717b, "\n", sb);
                }
            }
        }
        if (crashDetailBean2.f4670r != crashDetailBean.f4670r) {
            if (!crashDetailBean2.f4671s.contains("" + crashDetailBean.f4670r)) {
                crashDetailBean2.f4672t++;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(crashDetailBean2.f4671s);
                crashDetailBean2.f4671s = a0.c.H(crashDetailBean.f4670r, "\n", sb2);
            }
        }
        return crashDetailBean2;
    }

    public List<b> b(List<b> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (b bVar : list) {
            if (bVar.f4719d && bVar.f4717b <= jCurrentTimeMillis - 86400000) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public boolean c(CrashDetailBean crashDetailBean) {
        return a(crashDetailBean, -123456789);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d4 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:11:0x001b, B:12:0x001e, B:42:0x007d, B:46:0x0084, B:50:0x0094, B:52:0x00a0, B:54:0x00b1, B:56:0x00b8, B:83:0x0131, B:87:0x0142, B:89:0x014e, B:91:0x015d, B:93:0x0174, B:97:0x0195, B:99:0x019c, B:94:0x017e, B:96:0x0185, B:102:0x01b8, B:105:0x01c3, B:111:0x01ed, B:113:0x01f1, B:117:0x01f9, B:119:0x0214, B:120:0x0223, B:123:0x022a, B:126:0x0257, B:107:0x01d4, B:110:0x01db, B:58:0x00c1, B:63:0x00d5, B:15:0x0025, B:21:0x0036, B:25:0x0044, B:29:0x0052, B:34:0x0062, B:38:0x0070), top: B:132:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01f1 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:11:0x001b, B:12:0x001e, B:42:0x007d, B:46:0x0084, B:50:0x0094, B:52:0x00a0, B:54:0x00b1, B:56:0x00b8, B:83:0x0131, B:87:0x0142, B:89:0x014e, B:91:0x015d, B:93:0x0174, B:97:0x0195, B:99:0x019c, B:94:0x017e, B:96:0x0185, B:102:0x01b8, B:105:0x01c3, B:111:0x01ed, B:113:0x01f1, B:117:0x01f9, B:119:0x0214, B:120:0x0223, B:123:0x022a, B:126:0x0257, B:107:0x01d4, B:110:0x01db, B:58:0x00c1, B:63:0x00d5, B:15:0x0025, B:21:0x0036, B:25:0x0044, B:29:0x0052, B:34:0x0062, B:38:0x0070), top: B:132:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00be A[PHI: r15
      0x00be: PHI (r15v1 long) = (r15v0 long), (r15v6 long) binds: [B:59:0x00c4, B:53:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(com.tencent.bugly.crashreport.crash.CrashDetailBean r26) {
        /*
            Method dump skipped, instruction units count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.crash.e.d(com.tencent.bugly.crashreport.crash.CrashDetailBean):void");
    }

    public void e(CrashDetailBean crashDetailBean) {
        int i10 = crashDetailBean.f4654b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 3 && !h.g().j()) {
                    return;
                }
            } else if (!h.g().k()) {
                return;
            }
        } else if (!h.g().k()) {
            return;
        }
        if (this.f4735f != null) {
            X.a("Calling 'onCrashHandleEnd' of RQD crash listener.", new Object[0]);
            this.f4735f.a(crashDetailBean.f4654b == 1);
        }
    }

    public void f(CrashDetailBean crashDetailBean) {
        if (crashDetailBean == null) {
            return;
        }
        ContentValues contentValuesB = b(crashDetailBean);
        if (contentValuesB != null) {
            long jA = J.a().a("t_cr", contentValuesB, (I) null, true);
            if (jA >= 0) {
                X.a("insert %s success!", "t_cr");
                crashDetailBean.f4653a = jA;
            }
        }
        if (h.f4745i) {
            g(crashDetailBean);
        }
    }

    public void c(List<b> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        StringBuilder sbP = h0.p("_id in (");
        Iterator<b> it = list.iterator();
        while (it.hasNext()) {
            sbP.append(it.next().f4716a);
            sbP.append(",");
        }
        StringBuilder sb = new StringBuilder(sbP.substring(0, sbP.lastIndexOf(",")));
        sb.append(")");
        String string = sb.toString();
        sb.setLength(0);
        try {
            X.a("deleted %s data %d", "t_cr", Integer.valueOf(J.a().a("t_cr", string, (String[]) null, (I) null, true)));
        } catch (Throwable th2) {
            if (X.b(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    public List<CrashDetailBean> b() {
        StrategyBean strategyBeanC = com.tencent.bugly.crashreport.common.strategy.c.b().c();
        if (strategyBeanC == null) {
            X.e("have not synced remote!", new Object[0]);
            return null;
        }
        if (!strategyBeanC.f4622f) {
            X.e("Crashreport remote closed, please check your APP ID correct and Version available, then uninstall and reinstall your app.", new Object[0]);
            X.d("[init] WARNING! Crashreport closed by server, please check your APP ID correct and Version available, then uninstall and reinstall your app.", new Object[0]);
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jB = ca.b();
        List<b> listA = a();
        X.a("Size of crash list loaded from DB: %s", Integer.valueOf(listA.size()));
        if (listA.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(b(listA));
        listA.removeAll(arrayList);
        Iterator<b> it = listA.iterator();
        while (it.hasNext()) {
            b next = it.next();
            long j10 = next.f4717b;
            if (j10 < jB - h.f4743g) {
                it.remove();
                arrayList.add(next);
            } else if (next.f4719d) {
                if (j10 >= jCurrentTimeMillis - 86400000) {
                    it.remove();
                } else if (!next.f4720e) {
                    it.remove();
                    arrayList.add(next);
                }
            } else if (next.f4721f >= 3 && j10 < jCurrentTimeMillis - 86400000) {
                it.remove();
                arrayList.add(next);
            }
        }
        if (arrayList.size() > 0) {
            c(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        List<CrashDetailBean> listA2 = a(listA);
        if (listA2 != null && listA2.size() > 0) {
            String str = com.tencent.bugly.crashreport.common.info.a.m().E;
            Iterator<CrashDetailBean> it2 = listA2.iterator();
            while (it2.hasNext()) {
                CrashDetailBean next2 = it2.next();
                if (!str.equals(next2.f4658f)) {
                    it2.remove();
                    arrayList2.add(next2);
                }
            }
        }
        if (arrayList2.size() > 0) {
            d(arrayList2);
        }
        return listA2;
    }

    public boolean a(CrashDetailBean crashDetailBean, int i10) {
        ArrayList arrayList;
        if (crashDetailBean == null) {
            return true;
        }
        String str = h.f4750n;
        if (str != null && !str.isEmpty()) {
            X.a("Crash filter for crash stack is: %s", h.f4750n);
            if (crashDetailBean.f4669q.contains(h.f4750n)) {
                X.e("This crash contains the filter string set. It will not be record and upload.", new Object[0]);
                return true;
            }
        }
        String str2 = h.f4751o;
        if (str2 != null && !str2.isEmpty()) {
            X.a("Crash regular filter for crash stack is: %s", h.f4751o);
            if (Pattern.compile(h.f4751o).matcher(crashDetailBean.f4669q).find()) {
                X.e("This crash matches the regular filter string set. It will not be record and upload.", new Object[0]);
                return true;
            }
        }
        if (crashDetailBean.f4654b != 2) {
            L l10 = new L();
            l10.f4873b = 1;
            l10.f4874c = crashDetailBean.A;
            l10.f4875d = crashDetailBean.B;
            l10.f4876e = crashDetailBean.f4670r;
            this.f4733d.b(1);
            this.f4733d.c(l10);
            X.d("[crash] a crash occur, handling...", new Object[0]);
        } else {
            X.d("[crash] a caught exception occur, handling...", new Object[0]);
        }
        List<b> listA = a();
        if (listA == null || listA.size() <= 0) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(10);
            ArrayList<b> arrayList2 = new ArrayList(10);
            arrayList.addAll(b(listA));
            listA.removeAll(arrayList);
            if (listA.size() > 20) {
                a(5);
            }
            if (a(crashDetailBean)) {
                boolean z10 = false;
                for (b bVar : listA) {
                    if (crashDetailBean.f4673u.equals(bVar.f4718c)) {
                        if (bVar.f4720e) {
                            z10 = true;
                        }
                        arrayList2.add(bVar);
                    }
                }
                if (z10 || arrayList2.size() >= h.f4739c) {
                    X.c("same crash occur too much do merged!", new Object[0]);
                    CrashDetailBean crashDetailBeanA = a(arrayList2, crashDetailBean);
                    for (b bVar2 : arrayList2) {
                        if (bVar2.f4716a != crashDetailBeanA.f4653a) {
                            arrayList.add(bVar2);
                        }
                    }
                    f(crashDetailBeanA);
                    c(arrayList);
                    X.d("[crash] save crash success. For this device crash many times, it will not upload crashes immediately", new Object[0]);
                    return true;
                }
            }
        }
        f(crashDetailBean);
        if (arrayList != null && !arrayList.isEmpty()) {
            c(arrayList);
        }
        X.d("[crash] save crash success", new Object[0]);
        return false;
    }

    public ContentValues b(CrashDetailBean crashDetailBean) {
        if (crashDetailBean == null) {
            return null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            long j10 = crashDetailBean.f4653a;
            if (j10 > 0) {
                contentValues.put("_id", Long.valueOf(j10));
            }
            contentValues.put("_tm", Long.valueOf(crashDetailBean.f4670r));
            contentValues.put("_s1", crashDetailBean.f4673u);
            contentValues.put("_up", Integer.valueOf(crashDetailBean.f4656d ? 1 : 0));
            contentValues.put("_me", Integer.valueOf(crashDetailBean.f4662j ? 1 : 0));
            contentValues.put("_uc", Integer.valueOf(crashDetailBean.f4664l));
            contentValues.put("_dt", ca.a(crashDetailBean));
            return contentValues;
        } catch (Throwable th2) {
            if (!X.b(th2)) {
                th2.printStackTrace();
            }
            return null;
        }
    }

    public CrashDetailBean b(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            byte[] blob = cursor.getBlob(cursor.getColumnIndex("_dt"));
            if (blob == null) {
                return null;
            }
            long j10 = cursor.getLong(cursor.getColumnIndex("_id"));
            CrashDetailBean crashDetailBean = (CrashDetailBean) ca.a(blob, CrashDetailBean.CREATOR);
            if (crashDetailBean == null) {
                return crashDetailBean;
            }
            crashDetailBean.f4653a = j10;
            return crashDetailBean;
        } catch (Throwable th2) {
            if (!X.b(th2)) {
                th2.printStackTrace();
            }
            return null;
        }
    }

    public void d(List<CrashDetailBean> list) {
        if (list != null) {
            try {
                if (list.size() == 0) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                for (CrashDetailBean crashDetailBean : list) {
                    sb.append(" or ");
                    sb.append("_id");
                    sb.append(" = ");
                    sb.append(crashDetailBean.f4653a);
                }
                String string = sb.toString();
                if (string.length() > 0) {
                    string = string.substring(4);
                }
                String str = string;
                sb.setLength(0);
                X.a("deleted %s data %d", "t_cr", Integer.valueOf(J.a().a("t_cr", str, (String[]) null, (I) null, true)));
            } catch (Throwable th2) {
                if (X.b(th2)) {
                    return;
                }
                th2.printStackTrace();
            }
        }
    }

    public boolean a(CrashDetailBean crashDetailBean) {
        int i10 = crashDetailBean.f4654b;
        return !com.tencent.bugly.b.f4350c && (!((i10 == 3) || (i10 == 0 || i10 == 1)) || h.f4740d);
    }

    public void a(CrashDetailBean crashDetailBean, long j10, boolean z10) {
        if (h.f4748l) {
            X.c("try to upload right now", new Object[0]);
            ArrayList arrayList = new ArrayList();
            arrayList.add(crashDetailBean);
            a(arrayList, j10, z10, crashDetailBean.f4654b == 7, z10);
            return;
        }
        X.c("do not upload spot crash right now, crash would be uploaded when app next start", new Object[0]);
    }

    public void a(List<CrashDetailBean> list, long j10, boolean z10, boolean z11, boolean z12) {
        if (!com.tencent.bugly.crashreport.common.info.a.a(this.f4731b).f4580j) {
            X.e("warn: not upload process", new Object[0]);
            return;
        }
        T t10 = this.f4732c;
        if (t10 == null) {
            X.e("warn: upload manager is null", new Object[0]);
            return;
        }
        if (!z12 && !t10.a(h.f4737a)) {
            X.e("warn: not crashHappen or not should upload", new Object[0]);
            return;
        }
        StrategyBean strategyBeanC = this.f4734e.c();
        if (!strategyBeanC.f4622f) {
            X.e("remote report is disable!", new Object[0]);
            X.d("[crash] server closed bugly in this app. please check your appid if is correct, and re-install it", new Object[0]);
            return;
        }
        if (list != null && list.size() != 0) {
            try {
                String str = strategyBeanC.f4634r;
                String str2 = StrategyBean.f4618b;
                oa oaVarA = a(this.f4731b, list, com.tencent.bugly.crashreport.common.info.a.m());
                if (oaVarA == null) {
                    X.e("create eupPkg fail!", new Object[0]);
                    return;
                }
                byte[] bArrA = M.a((AbstractC0010m) oaVarA);
                if (bArrA == null) {
                    X.e("send encode fail!", new Object[0]);
                    return;
                }
                pa paVarA = M.a(this.f4731b, 830, bArrA);
                if (paVarA == null) {
                    X.e("request package is null.", new Object[0]);
                    return;
                }
                u uVar = new u(12, this, list);
                if (z10) {
                    this.f4732c.a(f4730a, paVarA, str, str2, uVar, j10, z11);
                    return;
                } else {
                    this.f4732c.a(f4730a, paVarA, str, str2, uVar, false);
                    return;
                }
            } catch (Throwable th2) {
                X.b("req cr error %s", th2.toString());
                if (X.a(th2)) {
                    return;
                }
                th2.printStackTrace();
                return;
            }
        }
        X.e("warn: crashList is null or crashList num is 0", new Object[0]);
    }

    public void a(boolean z10, List<CrashDetailBean> list) {
        if (list != null && list.size() > 0) {
            X.a("up finish update state %b", Boolean.valueOf(z10));
            for (CrashDetailBean crashDetailBean : list) {
                X.a("pre uid:%s uc:%d re:%b me:%b", crashDetailBean.f4655c, Integer.valueOf(crashDetailBean.f4664l), Boolean.valueOf(crashDetailBean.f4656d), Boolean.valueOf(crashDetailBean.f4662j));
                int i10 = crashDetailBean.f4664l + 1;
                crashDetailBean.f4664l = i10;
                crashDetailBean.f4656d = z10;
                X.a("set uid:%s uc:%d re:%b me:%b", crashDetailBean.f4655c, Integer.valueOf(i10), Boolean.valueOf(crashDetailBean.f4656d), Boolean.valueOf(crashDetailBean.f4662j));
            }
            Iterator<CrashDetailBean> it = list.iterator();
            while (it.hasNext()) {
                h.g().a(it.next());
            }
            X.a("update state size %d", Integer.valueOf(list.size()));
        }
        if (z10) {
            return;
        }
        X.d("[crash] upload fail.", new Object[0]);
    }

    public List<CrashDetailBean> a(List<b> list) {
        Throwable th2;
        Cursor cursorA;
        if (list == null || list.size() == 0) {
            return null;
        }
        StringBuilder sbP = h0.p("_id in (");
        Iterator<b> it = list.iterator();
        while (it.hasNext()) {
            sbP.append(it.next().f4716a);
            sbP.append(",");
        }
        if (sbP.toString().contains(",")) {
            sbP = new StringBuilder(sbP.substring(0, sbP.lastIndexOf(",")));
        }
        sbP.append(")");
        String string = sbP.toString();
        sbP.setLength(0);
        try {
            cursorA = J.a().a("t_cr", null, string, null, null, true);
            if (cursorA == null) {
                if (cursorA != null) {
                    cursorA.close();
                }
                return null;
            }
            try {
                ArrayList arrayList = new ArrayList();
                sbP.append("_id");
                sbP.append(" in ");
                sbP.append("(");
                int i10 = 0;
                while (cursorA.moveToNext()) {
                    CrashDetailBean crashDetailBeanB = b(cursorA);
                    if (crashDetailBeanB != null) {
                        arrayList.add(crashDetailBeanB);
                    } else {
                        try {
                            sbP.append(cursorA.getLong(cursorA.getColumnIndex("_id")));
                            sbP.append(",");
                            i10++;
                        } catch (Throwable unused) {
                            X.e("unknown id!", new Object[0]);
                        }
                    }
                }
                if (sbP.toString().contains(",")) {
                    sbP = new StringBuilder(sbP.substring(0, sbP.lastIndexOf(",")));
                }
                sbP.append(")");
                String string2 = sbP.toString();
                if (i10 > 0) {
                    X.e("deleted %s illegal data %d", "t_cr", Integer.valueOf(J.a().a("t_cr", string2, (String[]) null, (I) null, true)));
                }
                cursorA.close();
                return arrayList;
            } catch (Throwable th3) {
                th2 = th3;
                try {
                    if (!X.b(th2)) {
                        th2.printStackTrace();
                    }
                    if (cursorA != null) {
                        cursorA.close();
                    }
                    return null;
                } finally {
                }
            }
        } catch (Throwable th4) {
            th2 = th4;
            cursorA = null;
        }
    }

    public b a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            b bVar = new b();
            bVar.f4716a = cursor.getLong(cursor.getColumnIndex("_id"));
            bVar.f4717b = cursor.getLong(cursor.getColumnIndex("_tm"));
            bVar.f4718c = cursor.getString(cursor.getColumnIndex("_s1"));
            bVar.f4719d = cursor.getInt(cursor.getColumnIndex("_up")) == 1;
            bVar.f4720e = cursor.getInt(cursor.getColumnIndex("_me")) == 1;
            bVar.f4721f = cursor.getInt(cursor.getColumnIndex("_uc"));
            return bVar;
        } catch (Throwable th2) {
            if (!X.b(th2)) {
                th2.printStackTrace();
            }
            return null;
        }
    }

    public List<b> a() {
        Cursor cursorA;
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursorA = J.a().a("t_cr", new String[]{"_id", "_tm", "_s1", "_up", "_me", "_uc"}, null, null, null, true);
        } catch (Throwable th2) {
            th = th2;
        }
        if (cursorA == null) {
            if (cursorA != null) {
                cursorA.close();
            }
            return null;
        }
        try {
            if (cursorA.getCount() < 1) {
                cursorA.close();
                return arrayList;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("_id");
            sb.append(" in ");
            sb.append("(");
            int i10 = 0;
            while (cursorA.moveToNext()) {
                try {
                    b bVarA = a(cursorA);
                    if (bVarA != null) {
                        arrayList.add(bVarA);
                    } else {
                        try {
                            sb.append(cursorA.getLong(cursorA.getColumnIndex("_id")));
                            sb.append(",");
                            i10++;
                        } catch (Throwable unused) {
                            X.e("unknown id!", new Object[0]);
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            if (sb.toString().contains(",")) {
                sb = new StringBuilder(sb.substring(0, sb.lastIndexOf(",")));
            }
            sb.append(")");
            String string = sb.toString();
            sb.setLength(0);
            if (i10 > 0) {
                X.e("deleted %s illegal data %d", "t_cr", Integer.valueOf(J.a().a("t_cr", string, (String[]) null, (I) null, true)));
            }
            cursorA.close();
            return arrayList;
        } catch (Throwable th4) {
            th = th4;
        }
        cursor = cursorA;
        try {
            if (!X.b(th)) {
                th.printStackTrace();
            }
            return arrayList;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public void a(int i10) {
        if (i10 <= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("_id in (SELECT _id FROM t_cr order by _id limit ");
        sb.append(i10);
        sb.append(")");
        String string = sb.toString();
        sb.setLength(0);
        try {
            X.a("deleted first record %s data %d", "t_cr", Integer.valueOf(J.a().a("t_cr", string, (String[]) null, (I) null, true)));
        } catch (Throwable th2) {
            if (X.b(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    public static na a(Context context, CrashDetailBean crashDetailBean, com.tencent.bugly.crashreport.common.info.a aVar) {
        ma maVarA;
        ma maVarA2;
        ma maVar;
        if (context != null && crashDetailBean != null && aVar != null) {
            na naVar = new na();
            int i10 = crashDetailBean.f4654b;
            switch (i10) {
                case 0:
                    naVar.f5017i = crashDetailBean.f4662j ? "200" : "100";
                    break;
                case 1:
                    naVar.f5017i = crashDetailBean.f4662j ? "201" : "101";
                    break;
                case 2:
                    naVar.f5017i = crashDetailBean.f4662j ? "202" : "102";
                    break;
                case 3:
                    naVar.f5017i = crashDetailBean.f4662j ? "203" : "103";
                    break;
                case 4:
                    naVar.f5017i = crashDetailBean.f4662j ? "204" : "104";
                    break;
                case 5:
                    naVar.f5017i = crashDetailBean.f4662j ? "207" : "107";
                    break;
                case 6:
                    naVar.f5017i = crashDetailBean.f4662j ? "206" : "106";
                    break;
                case 7:
                    naVar.f5017i = crashDetailBean.f4662j ? "208" : "108";
                    break;
                default:
                    X.b("crash type error! %d", Integer.valueOf(i10));
                    break;
            }
            naVar.f5018j = crashDetailBean.f4670r;
            naVar.f5019k = crashDetailBean.f4666n;
            naVar.f5020l = crashDetailBean.f4667o;
            naVar.f5021m = crashDetailBean.f4668p;
            naVar.f5023o = crashDetailBean.f4669q;
            naVar.f5024p = crashDetailBean.f4678z;
            naVar.f5025q = crashDetailBean.f4655c;
            naVar.f5026r = null;
            naVar.f5028t = crashDetailBean.f4665m;
            naVar.f5029u = crashDetailBean.f4657e;
            naVar.f5022n = crashDetailBean.B;
            naVar.f5030v = null;
            X.a("libInfo %s", naVar.f5031w);
            Map<String, PlugInBean> map = crashDetailBean.f4660h;
            if (map != null && map.size() > 0) {
                naVar.f5032x = new ArrayList<>();
                for (Map.Entry<String, PlugInBean> entry : crashDetailBean.f4660h.entrySet()) {
                    ka kaVar = new ka();
                    kaVar.f4993a = entry.getValue().f4560a;
                    kaVar.f4995c = entry.getValue().f4562c;
                    kaVar.f4997e = entry.getValue().f4561b;
                    naVar.f5032x.add(kaVar);
                }
            }
            if (crashDetailBean.f4662j) {
                naVar.f5027s = crashDetailBean.f4672t;
                String str = crashDetailBean.f4671s;
                if (str != null && str.length() > 0) {
                    if (naVar.f5033y == null) {
                        naVar.f5033y = new ArrayList<>();
                    }
                    try {
                        naVar.f5033y.add(new ma((byte) 1, "alltimes.txt", crashDetailBean.f4671s.getBytes("utf-8")));
                    } catch (UnsupportedEncodingException e10) {
                        e10.printStackTrace();
                        naVar.f5033y = null;
                    }
                }
                Integer numValueOf = Integer.valueOf(naVar.f5027s);
                ArrayList<ma> arrayList = naVar.f5033y;
                X.a("crashcount:%d sz:%d", numValueOf, Integer.valueOf(arrayList != null ? arrayList.size() : 0));
            }
            if (crashDetailBean.f4675w != null) {
                if (naVar.f5033y == null) {
                    naVar.f5033y = new ArrayList<>();
                }
                try {
                    naVar.f5033y.add(new ma((byte) 1, "log.txt", crashDetailBean.f4675w.getBytes("utf-8")));
                } catch (UnsupportedEncodingException e11) {
                    e11.printStackTrace();
                    naVar.f5033y = null;
                }
            }
            if (crashDetailBean.f4676x != null) {
                if (naVar.f5033y == null) {
                    naVar.f5033y = new ArrayList<>();
                }
                try {
                    naVar.f5033y.add(new ma((byte) 1, "jniLog.txt", crashDetailBean.f4676x.getBytes("utf-8")));
                } catch (UnsupportedEncodingException e12) {
                    e12.printStackTrace();
                    naVar.f5033y = null;
                }
            }
            if (!ca.b(crashDetailBean.W)) {
                if (naVar.f5033y == null) {
                    naVar.f5033y = new ArrayList<>();
                }
                try {
                    maVar = new ma((byte) 1, "crashInfos.txt", crashDetailBean.W.getBytes("utf-8"));
                } catch (UnsupportedEncodingException e13) {
                    e13.printStackTrace();
                    maVar = null;
                }
                if (maVar != null) {
                    X.a("attach crash infos", new Object[0]);
                    naVar.f5033y.add(maVar);
                }
            }
            if (crashDetailBean.X != null) {
                if (naVar.f5033y == null) {
                    naVar.f5033y = new ArrayList<>();
                }
                ma maVarA3 = a("backupRecord.zip", context, crashDetailBean.X);
                if (maVarA3 != null) {
                    X.a("attach backup record", new Object[0]);
                    naVar.f5033y.add(maVarA3);
                }
            }
            byte[] bArr = crashDetailBean.f4677y;
            if (bArr != null && bArr.length > 0) {
                ma maVar2 = new ma((byte) 2, "buglylog.zip", bArr);
                X.a("attach user log", new Object[0]);
                if (naVar.f5033y == null) {
                    naVar.f5033y = new ArrayList<>();
                }
                naVar.f5033y.add(maVar2);
            }
            if (crashDetailBean.f4654b == 3) {
                if (naVar.f5033y == null) {
                    naVar.f5033y = new ArrayList<>();
                }
                X.a("crashBean.anrMessages:%s", crashDetailBean.Q);
                Map<String, String> map2 = crashDetailBean.Q;
                if (map2 != null && map2.containsKey("BUGLY_CR_01")) {
                    try {
                        if (!TextUtils.isEmpty(crashDetailBean.Q.get("BUGLY_CR_01"))) {
                            naVar.f5033y.add(new ma((byte) 1, "anrMessage.txt", crashDetailBean.Q.get("BUGLY_CR_01").getBytes("utf-8")));
                            X.a("attach anr message", new Object[0]);
                        }
                    } catch (UnsupportedEncodingException e14) {
                        e14.printStackTrace();
                        naVar.f5033y = null;
                    }
                    crashDetailBean.Q.remove("BUGLY_CR_01");
                }
                if (crashDetailBean.f4674v != null && NativeCrashHandler.getInstance().isEnableCatchAnrTrace() && (maVarA2 = a("trace.zip", context, crashDetailBean.f4674v)) != null) {
                    X.a("attach traces", new Object[0]);
                    naVar.f5033y.add(maVarA2);
                }
            }
            if (crashDetailBean.f4654b == 1) {
                if (naVar.f5033y == null) {
                    naVar.f5033y = new ArrayList<>();
                }
                String str2 = crashDetailBean.f4674v;
                if (str2 != null && (maVarA = a("tomb.zip", context, str2)) != null) {
                    X.a("attach tombs", new Object[0]);
                    naVar.f5033y.add(maVarA);
                }
            }
            List<String> list = aVar.f4589na;
            if (list != null && !list.isEmpty()) {
                if (naVar.f5033y == null) {
                    naVar.f5033y = new ArrayList<>();
                }
                StringBuilder sb = new StringBuilder();
                Iterator<String> it = aVar.f4589na.iterator();
                while (it.hasNext()) {
                    sb.append(it.next());
                }
                try {
                    naVar.f5033y.add(new ma((byte) 1, "martianlog.txt", sb.toString().getBytes("utf-8")));
                    X.a("attach pageTracingList", new Object[0]);
                } catch (UnsupportedEncodingException e15) {
                    e15.printStackTrace();
                }
            }
            byte[] bArr2 = crashDetailBean.V;
            if (bArr2 != null && bArr2.length > 0) {
                if (naVar.f5033y == null) {
                    naVar.f5033y = new ArrayList<>();
                }
                naVar.f5033y.add(new ma((byte) 1, "userExtraByteData", crashDetailBean.V));
                X.a("attach extraData", new Object[0]);
            }
            HashMap map3 = new HashMap();
            naVar.f5034z = map3;
            map3.put("A9", "" + crashDetailBean.C);
            naVar.f5034z.put("A11", "" + crashDetailBean.D);
            naVar.f5034z.put("A10", "" + crashDetailBean.E);
            naVar.f5034z.put("A23", "" + crashDetailBean.f4658f);
            naVar.f5034z.put("A7", "" + aVar.f4588n);
            naVar.f5034z.put("A6", "" + aVar.j());
            naVar.f5034z.put("A5", "" + aVar.k());
            naVar.f5034z.put("A22", "" + aVar.l());
            naVar.f5034z.put("A2", "" + crashDetailBean.G);
            naVar.f5034z.put("A1", "" + crashDetailBean.F);
            naVar.f5034z.put("A24", "" + aVar.f4592p);
            naVar.f5034z.put("A17", "" + crashDetailBean.H);
            naVar.f5034z.put("A25", "" + aVar.l());
            naVar.f5034z.put("A15", "" + aVar.i());
            naVar.f5034z.put("A13", "" + aVar.n());
            naVar.f5034z.put("A34", "" + crashDetailBean.A);
            if (aVar.f4572ea != null) {
                naVar.f5034z.put("productIdentify", "" + aVar.f4572ea);
            }
            try {
                naVar.f5034z.put("A26", "" + URLEncoder.encode(crashDetailBean.I, "utf-8"));
            } catch (UnsupportedEncodingException e16) {
                e16.printStackTrace();
            }
            if (crashDetailBean.f4654b == 1) {
                naVar.f5034z.put("A27", "" + crashDetailBean.L);
                naVar.f5034z.put("A28", "" + crashDetailBean.K);
                naVar.f5034z.put("A29", "" + crashDetailBean.f4663k);
            }
            naVar.f5034z.put("A30", "" + crashDetailBean.M);
            naVar.f5034z.put("A18", "" + crashDetailBean.N);
            Map<String, String> map4 = naVar.f5034z;
            StringBuilder sb2 = new StringBuilder("");
            sb2.append(!crashDetailBean.O);
            map4.put("A36", sb2.toString());
            naVar.f5034z.put("F02", "" + aVar.X);
            naVar.f5034z.put("F03", "" + aVar.Y);
            naVar.f5034z.put("F04", "" + aVar.u());
            naVar.f5034z.put("F05", "" + aVar.Z);
            naVar.f5034z.put("F06", "" + aVar.W);
            naVar.f5034z.put("F08", "" + aVar.f4568ca);
            naVar.f5034z.put("F09", "" + aVar.f4570da);
            naVar.f5034z.put("F10", "" + aVar.f4564aa);
            if (crashDetailBean.R >= 0) {
                naVar.f5034z.put("C01", "" + crashDetailBean.R);
            }
            if (crashDetailBean.S >= 0) {
                naVar.f5034z.put("C02", "" + crashDetailBean.S);
            }
            Map<String, String> map5 = crashDetailBean.T;
            if (map5 != null && map5.size() > 0) {
                for (Map.Entry<String, String> entry2 : crashDetailBean.T.entrySet()) {
                    naVar.f5034z.put("C03_" + entry2.getKey(), entry2.getValue());
                }
            }
            Map<String, String> map6 = crashDetailBean.U;
            if (map6 != null && map6.size() > 0) {
                for (Map.Entry<String, String> entry3 : crashDetailBean.U.entrySet()) {
                    naVar.f5034z.put("C04_" + entry3.getKey(), entry3.getValue());
                }
            }
            naVar.A = null;
            Map<String, String> map7 = crashDetailBean.P;
            if (map7 != null && map7.size() > 0) {
                Map<String, String> map8 = crashDetailBean.P;
                naVar.A = map8;
                X.c("setted message size %d", Integer.valueOf(map8.size()));
            }
            X.a("%s rid:%s sess:%s ls:%ds isR:%b isF:%b isM:%b isN:%b mc:%d ,%s ,isUp:%b ,vm:%d", crashDetailBean.f4666n, crashDetailBean.f4655c, aVar.u(), Long.valueOf((crashDetailBean.f4670r - crashDetailBean.N) / 1000), Boolean.valueOf(crashDetailBean.f4663k), Boolean.valueOf(crashDetailBean.O), Boolean.valueOf(crashDetailBean.f4662j), Boolean.valueOf(crashDetailBean.f4654b == 1), Integer.valueOf(crashDetailBean.f4672t), crashDetailBean.f4671s, Boolean.valueOf(crashDetailBean.f4656d), Integer.valueOf(naVar.f5034z.size()));
            return naVar;
        }
        X.e("enExp args == null", new Object[0]);
        return null;
    }

    public static oa a(Context context, List<CrashDetailBean> list, com.tencent.bugly.crashreport.common.info.a aVar) {
        if (context != null && list != null && list.size() != 0 && aVar != null) {
            oa oaVar = new oa();
            oaVar.f5036b = new ArrayList<>();
            Iterator<CrashDetailBean> it = list.iterator();
            while (it.hasNext()) {
                oaVar.f5036b.add(a(context, it.next(), aVar));
            }
            return oaVar;
        }
        X.e("enEXPPkg args == null!", new Object[0]);
        return null;
    }

    public static ma a(String str, Context context, String str2) {
        FileInputStream fileInputStream;
        if (str2 != null && context != null) {
            X.a("zip %s", str2);
            File file = new File(str2);
            File file2 = new File(context.getCacheDir(), str);
            if (!ca.a(file, file2, 5000)) {
                X.e("zip fail!", new Object[0]);
                return null;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                fileInputStream = new FileInputStream(file2);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i10 = fileInputStream.read(bArr);
                        if (i10 <= 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i10);
                        byteArrayOutputStream.flush();
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    X.a("read bytes :%d", Integer.valueOf(byteArray.length));
                    ma maVar = new ma((byte) 2, file2.getName(), byteArray);
                    try {
                        fileInputStream.close();
                    } catch (IOException e10) {
                        if (!X.b(e10)) {
                            e10.printStackTrace();
                        }
                    }
                    if (file2.exists()) {
                        X.a("del tmp", new Object[0]);
                        file2.delete();
                    }
                    return maVar;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        if (!X.b(th)) {
                            th.printStackTrace();
                        }
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e11) {
                                if (!X.b(e11)) {
                                    e11.printStackTrace();
                                }
                            }
                        }
                        if (file2.exists()) {
                            X.a("del tmp", new Object[0]);
                            file2.delete();
                        }
                        return null;
                    } catch (Throwable th3) {
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e12) {
                                if (!X.b(e12)) {
                                    e12.printStackTrace();
                                }
                            }
                        }
                        if (file2.exists()) {
                            X.a("del tmp", new Object[0]);
                            file2.delete();
                        }
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                fileInputStream = null;
            }
        } else {
            X.e("rqdp{  createZipAttachment sourcePath == null || context == null ,pls check}", new Object[0]);
            return null;
        }
    }

    public static void a(String str, String str2, String str3, String str4, String str5, CrashDetailBean crashDetailBean) {
        String str6;
        com.tencent.bugly.crashreport.common.info.a aVarM = com.tencent.bugly.crashreport.common.info.a.m();
        if (aVarM == null) {
            return;
        }
        X.b("#++++++++++Record By Bugly++++++++++#", new Object[0]);
        X.b("# You can use Bugly(http:\\\\bugly.qq.com) to get more Crash Detail!", new Object[0]);
        X.b("# PKG NAME: %s", aVarM.f4575g);
        X.b("# APP VER: %s", aVarM.E);
        X.b("# SDK VER: %s", aVarM.f4584l);
        X.b("# LAUNCH TIME: %s", ca.a(new Date(com.tencent.bugly.crashreport.common.info.a.m().f4569d)));
        X.b("# CRASH TYPE: %s", str);
        X.b("# CRASH TIME: %s", str2);
        X.b("# CRASH PROCESS: %s", str3);
        X.b("# CRASH THREAD: %s", str4);
        if (crashDetailBean != null) {
            X.b("# REPORT ID: %s", crashDetailBean.f4655c);
            X.b("# CRASH DEVICE: %s %s", aVarM.f4590o, aVarM.n().booleanValue() ? "ROOTED" : "UNROOT");
            X.b("# RUNTIME AVAIL RAM:%d ROM:%d SD:%d", Long.valueOf(crashDetailBean.C), Long.valueOf(crashDetailBean.D), Long.valueOf(crashDetailBean.E));
            X.b("# RUNTIME TOTAL RAM:%d ROM:%d SD:%d", Long.valueOf(crashDetailBean.F), Long.valueOf(crashDetailBean.G), Long.valueOf(crashDetailBean.H));
            if (!ca.b(crashDetailBean.L)) {
                X.b("# EXCEPTION FIRED BY %s %s", crashDetailBean.L, crashDetailBean.K);
            } else if (crashDetailBean.f4654b == 3) {
                if (crashDetailBean.Q == null) {
                    str6 = "null";
                } else {
                    str6 = "" + crashDetailBean.Q.get("BUGLY_CR_01");
                }
                X.b("# EXCEPTION ANR MESSAGE:\n %s", str6);
            }
        }
        if (!ca.b(str5)) {
            X.b("# CRASH STACK: ", new Object[0]);
            X.b(str5, new Object[0]);
        }
        X.b("#++++++++++++++++++++++++++++++++++++++++++#", new Object[0]);
    }
}
