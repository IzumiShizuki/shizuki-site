package com.tencent.bugly.crashreport.biz;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.tencent.bugly.crashreport.common.info.a;
import com.tencent.bugly.proguard.I;
import com.tencent.bugly.proguard.J;
import com.tencent.bugly.proguard.W;
import com.tencent.bugly.proguard.X;
import com.tencent.bugly.proguard.ca;
import java.util.ArrayList;
import java.util.List;
import ob.b;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f4540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f4541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f4542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f4543d;

    public c(Context context, boolean z10) {
        this.f4540a = context;
        this.f4543d = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f3 A[Catch: all -> 0x0027, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:11:0x000f, B:15:0x0017, B:17:0x001d, B:23:0x002a, B:25:0x003f, B:28:0x0048, B:30:0x004f, B:31:0x0052, B:33:0x0058, B:35:0x006c, B:36:0x007c, B:40:0x0084, B:41:0x008e, B:42:0x0093, B:44:0x0099, B:46:0x00a7, B:48:0x00b4, B:49:0x00b7, B:51:0x00c5, B:57:0x00cf, B:60:0x00d6, B:63:0x00ed, B:65:0x00f3, B:67:0x00f8, B:70:0x00ff, B:74:0x0117, B:76:0x011d, B:79:0x0126, B:81:0x012c, B:84:0x0135, B:86:0x013f, B:89:0x0148, B:93:0x0164, B:96:0x016b, B:62:0x00e7), top: B:101:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011d A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:11:0x000f, B:15:0x0017, B:17:0x001d, B:23:0x002a, B:25:0x003f, B:28:0x0048, B:30:0x004f, B:31:0x0052, B:33:0x0058, B:35:0x006c, B:36:0x007c, B:40:0x0084, B:41:0x008e, B:42:0x0093, B:44:0x0099, B:46:0x00a7, B:48:0x00b4, B:49:0x00b7, B:51:0x00c5, B:57:0x00cf, B:60:0x00d6, B:63:0x00ed, B:65:0x00f3, B:67:0x00f8, B:70:0x00ff, B:74:0x0117, B:76:0x011d, B:79:0x0126, B:81:0x012c, B:84:0x0135, B:86:0x013f, B:89:0x0148, B:93:0x0164, B:96:0x016b, B:62:0x00e7), top: B:101:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0126 A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:11:0x000f, B:15:0x0017, B:17:0x001d, B:23:0x002a, B:25:0x003f, B:28:0x0048, B:30:0x004f, B:31:0x0052, B:33:0x0058, B:35:0x006c, B:36:0x007c, B:40:0x0084, B:41:0x008e, B:42:0x0093, B:44:0x0099, B:46:0x00a7, B:48:0x00b4, B:49:0x00b7, B:51:0x00c5, B:57:0x00cf, B:60:0x00d6, B:63:0x00ed, B:65:0x00f3, B:67:0x00f8, B:70:0x00ff, B:74:0x0117, B:76:0x011d, B:79:0x0126, B:81:0x012c, B:84:0x0135, B:86:0x013f, B:89:0x0148, B:93:0x0164, B:96:0x016b, B:62:0x00e7), top: B:101:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void c() {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.biz.c.c():void");
    }

    public void b(long j10) {
        W.c().a(new ob.c(this, j10), j10);
    }

    private static UserInfoBean a(Context context, int i10) {
        a aVarA = a.a(context);
        UserInfoBean userInfoBean = new UserInfoBean();
        userInfoBean.f4522b = i10;
        userInfoBean.f4523c = aVarA.f4576h;
        userInfoBean.f4524d = aVarA.y();
        userInfoBean.f4525e = System.currentTimeMillis();
        userInfoBean.f4526f = -1L;
        userInfoBean.f4534n = aVarA.E;
        userInfoBean.f4535o = i10 != 1 ? 0 : 1;
        userInfoBean.f4532l = aVarA.C();
        userInfoBean.f4533m = aVarA.W;
        userInfoBean.f4527g = aVarA.X;
        userInfoBean.f4528h = aVarA.Y;
        userInfoBean.f4529i = aVarA.Z;
        userInfoBean.f4531k = aVarA.f4564aa;
        userInfoBean.f4538r = aVarA.h();
        userInfoBean.f4539s = aVarA.g();
        userInfoBean.f4536p = aVarA.A();
        userInfoBean.f4537q = aVarA.t();
        return userInfoBean;
    }

    public void b() {
        W wC = W.c();
        if (wC != null) {
            wC.a(new ob.a(this, 0));
        }
    }

    public void a(int i10, boolean z10, long j10) {
        com.tencent.bugly.crashreport.common.strategy.c cVarB = com.tencent.bugly.crashreport.common.strategy.c.b();
        if (cVarB != null && !cVarB.c().f4623g && i10 != 1 && i10 != 3) {
            X.b("UserInfo is disable", new Object[0]);
            return;
        }
        if (i10 == 1 || i10 == 3) {
            this.f4542c++;
        }
        W.c().a(new b(this, a(this.f4540a, i10), z10), j10);
    }

    public void a(long j10) {
        W.c().a(new b(this, null, true), j10);
    }

    public void a() {
        this.f4541b = ca.b() + 86400000;
        W.c().a(new ob.a(this, 1), (this.f4541b - System.currentTimeMillis()) + 5000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(UserInfoBean userInfoBean, boolean z10) {
        List<UserInfoBean> listA;
        if (userInfoBean == null) {
            return;
        }
        if (!z10 && userInfoBean.f4522b != 1 && (listA = a(a.a(this.f4540a).f4576h)) != null && listA.size() >= 20) {
            X.c("[UserInfo] There are too many user info in local: %d", Integer.valueOf(listA.size()));
            return;
        }
        long jA = J.a().a("t_ui", a(userInfoBean), (I) null, true);
        if (jA >= 0) {
            X.a("[Database] insert %s success with ID: %d", "t_ui", Long.valueOf(jA));
            userInfoBean.f4521a = jA;
        }
    }

    public List<UserInfoBean> a(String str) {
        Cursor cursorA;
        String string;
        try {
            if (ca.b(str)) {
                string = null;
            } else {
                StringBuilder sb = new StringBuilder("_pc = '");
                sb.append(str);
                sb.append("'");
                string = sb.toString();
            }
            cursorA = J.a().a("t_ui", null, string, null, null, true);
            if (cursorA == null) {
                return null;
            }
            try {
                StringBuilder sb2 = new StringBuilder();
                ArrayList arrayList = new ArrayList();
                while (cursorA.moveToNext()) {
                    UserInfoBean userInfoBeanA = a(cursorA);
                    if (userInfoBeanA != null) {
                        arrayList.add(userInfoBeanA);
                    } else {
                        try {
                            long j10 = cursorA.getLong(cursorA.getColumnIndex("_id"));
                            sb2.append(" or ");
                            sb2.append("_id");
                            sb2.append(" = ");
                            sb2.append(j10);
                        } catch (Throwable unused) {
                            X.e("[Database] unknown id.", new Object[0]);
                        }
                    }
                }
                String string2 = sb2.toString();
                if (string2.length() > 0) {
                    X.e("[Database] deleted %s error data %d", "t_ui", Integer.valueOf(J.a().a("t_ui", string2.substring(4), (String[]) null, (I) null, true)));
                }
                cursorA.close();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                try {
                    if (!X.b(th)) {
                        th.printStackTrace();
                    }
                    if (cursorA != null) {
                        cursorA.close();
                    }
                    return null;
                } finally {
                    if (cursorA != null) {
                        cursorA.close();
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            cursorA = null;
        }
    }

    public void a(List<UserInfoBean> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < list.size() && i10 < 50; i10++) {
            UserInfoBean userInfoBean = list.get(i10);
            sb.append(" or _id = ");
            sb.append(userInfoBean.f4521a);
        }
        String string = sb.toString();
        if (string.length() > 0) {
            string = string.substring(4);
        }
        String str = string;
        sb.setLength(0);
        try {
            X.a("[Database] deleted %s data %d", "t_ui", Integer.valueOf(J.a().a("t_ui", str, (String[]) null, (I) null, true)));
        } catch (Throwable th2) {
            if (X.b(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    public ContentValues a(UserInfoBean userInfoBean) {
        if (userInfoBean == null) {
            return null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            long j10 = userInfoBean.f4521a;
            if (j10 > 0) {
                contentValues.put("_id", Long.valueOf(j10));
            }
            contentValues.put("_tm", Long.valueOf(userInfoBean.f4525e));
            contentValues.put("_ut", Long.valueOf(userInfoBean.f4526f));
            contentValues.put("_tp", Integer.valueOf(userInfoBean.f4522b));
            contentValues.put("_pc", userInfoBean.f4523c);
            contentValues.put("_dt", ca.a(userInfoBean));
            return contentValues;
        } catch (Throwable th2) {
            if (!X.b(th2)) {
                th2.printStackTrace();
            }
            return null;
        }
    }

    public UserInfoBean a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            byte[] blob = cursor.getBlob(cursor.getColumnIndex("_dt"));
            if (blob == null) {
                return null;
            }
            long j10 = cursor.getLong(cursor.getColumnIndex("_id"));
            UserInfoBean userInfoBean = (UserInfoBean) ca.a(blob, UserInfoBean.CREATOR);
            if (userInfoBean == null) {
                return userInfoBean;
            }
            userInfoBean.f4521a = j10;
            return userInfoBean;
        } catch (Throwable th2) {
            if (!X.b(th2)) {
                th2.printStackTrace();
            }
            return null;
        }
    }
}
