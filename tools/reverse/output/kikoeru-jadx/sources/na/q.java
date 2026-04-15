package na;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import android.widget.Toast;
import bg.i1;
import bg.l1;
import com.cnl.kikoeru.MainApplication;
import com.cnl.kikoeru.R;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import m0.l3;
import pc.f0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ub.p f15736a = ub.a.d(new i9.f(23));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f15737b;

    static {
        ub.a.d(new i9.f(24));
        f15737b = "android.permission.POST_NOTIFICATIONS";
    }

    public static final void a(Context context) {
        try {
            Intent intent = new Intent();
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
            intent.putExtra("android.provider.extra.CHANNEL_ID", context.getApplicationInfo().uid);
            intent.putExtra("app_package", context.getPackageName());
            intent.putExtra("app_uid", context.getApplicationInfo().uid);
            context.startActivity(intent);
        } catch (Exception e10) {
            e10.printStackTrace();
            Intent intent2 = new Intent();
            intent2.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent2.setData(Uri.fromParts("package", context.getPackageName(), null));
            context.startActivity(intent2);
        }
    }

    public static final void b() {
        String str;
        String str2 = (String) g9.a.a().getValue();
        String str3 = (String) f0.P(gg.c.a(), "username", "", jc.z.a(String.class)).a();
        String str4 = (String) f0.P(gg.c.a(), "password", "", jc.z.a(String.class)).a();
        String str5 = ag.z.f369a;
        Object objD = ag.z.d(str3, str4);
        if (!(objD instanceof ub.m)) {
            l1 l1Var = (l1) objD;
            ((hg.b) a9.i.f231b.getValue()).d(l1Var.f2922a);
            i1 i1Var = l1Var.f2923b;
            if (i1Var != null && (str = i1Var.f2902d) != null) {
                ((hg.b) a9.i.f233d.getValue()).d(str);
            }
            fg.f fVarD = a9.i.d();
            Boolean bool = Boolean.TRUE;
            fVarD.setValue(bool);
            a9.i.e().setValue(bool);
            ((d9.g) a9.i.c().f4312q.getValue()).a(new c9.a(0, str2, str3, str4, a9.i.f(), System.currentTimeMillis()));
        }
        Throwable thA = ub.n.a(objD);
        if (thA != null) {
            thA.printStackTrace();
            String strF = a9.i.f();
            jc.l.e(strF, "token");
            byte[] bArrDecode = Base64.decode((String) ef.n.L0(strF, new char[]{'.'}).get(1), 0);
            jc.l.d(bArrDecode, "decode(...)");
            String str6 = new String(bArrDecode, ef.a.f6541a);
            xf.b bVar = xf.c.f24987d;
            bVar.getClass();
            Object obj = xf.n.e((xf.m) bVar.a(str6, xf.o.f25013a)).get("exp");
            jc.l.b(obj);
            String str7 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(((long) xf.n.d(xf.n.f((xf.m) obj))) * 1000));
            jc.l.b(str7);
            ka.j.d(h(R.string.token_exp_auto_login_failed, str7), null, new l3(14), null, null, 509);
        }
    }

    public static final void c(Serializable serializable, String str) {
        if (String.valueOf(serializable).length() <= 4000) {
            Log.e(str, String.valueOf(serializable));
            return;
        }
        int i10 = 0;
        int iX = gh.g.x(0, String.valueOf(serializable).length() - 1, 4000);
        if (iX < 0) {
            return;
        }
        while (true) {
            int i11 = i10 + 4000;
            if (i11 < String.valueOf(serializable).length()) {
                String strSubstring = String.valueOf(serializable).substring(i10, i11);
                jc.l.d(strSubstring, "substring(...)");
                Log.e(str, strSubstring);
            } else {
                String strSubstring2 = String.valueOf(serializable).substring(i10, String.valueOf(serializable).length());
                jc.l.d(strSubstring2, "substring(...)");
                Log.e(str, strSubstring2);
            }
            if (i10 == iX) {
                return;
            } else {
                i10 = i11;
            }
        }
    }

    public static final void d(Object obj, String str) {
        if (String.valueOf(obj).length() <= 4000) {
            Log.i(str, String.valueOf(obj));
            return;
        }
        int i10 = 0;
        int iX = gh.g.x(0, String.valueOf(obj).length() - 1, 4000);
        if (iX < 0) {
            return;
        }
        while (true) {
            int i11 = i10 + 4000;
            if (i11 < String.valueOf(obj).length()) {
                String strSubstring = String.valueOf(obj).substring(i10, i11);
                jc.l.d(strSubstring, "substring(...)");
                Log.i(str, strSubstring);
            } else {
                String strSubstring2 = String.valueOf(obj).substring(i10, String.valueOf(obj).length());
                jc.l.d(strSubstring2, "substring(...)");
                Log.i(str, strSubstring2);
            }
            if (i10 == iX) {
                return;
            } else {
                i10 = i11;
            }
        }
    }

    public static final Object e(String str) {
        Object objB;
        jc.l.e(str, "<this>");
        try {
            MainApplication mainApplicationA = a9.i.a();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            mainApplicationA.startActivity(intent);
            objB = ub.a0.f21526a;
        } catch (Throwable th2) {
            objB = ub.a.b(th2);
        }
        Throwable thA = ub.n.a(objB);
        if (thA != null) {
            c(thA, "");
            ka.n.c(thA.getClass().getSimpleName() + "(" + thA.getLocalizedMessage() + ")", 0L, null, null, 511);
        }
        return objB;
    }

    public static final void f(String str) {
        jc.l.e(str, "<this>");
        Object systemService = a9.i.a().getSystemService("clipboard");
        jc.l.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(null, str));
        ka.n.c(g(R.string.copy_ok), 0L, null, null, 511);
    }

    public static final String g(int i10) {
        String string = a9.i.a().getString(i10);
        jc.l.d(string, "getString(...)");
        return string;
    }

    public static final String h(int i10, Object... objArr) {
        String string = a9.i.a().getString(i10, Arrays.copyOf(objArr, objArr.length));
        jc.l.d(string, "getString(...)");
        return string;
    }

    public static void i(String str) {
        Toast.makeText(a9.i.a(), str, 0).show();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(java.lang.String r4, ac.c r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof na.p
            if (r0 == 0) goto L13
            r0 = r5
            na.p r0 = (na.p) r0
            int r1 = r0.f15735f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15735f = r1
            goto L18
        L13:
            na.p r0 = new na.p
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f15734e
            int r1 = r0.f15735f
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            java.lang.Object r4 = r0.f15733d
            ub.a.f(r5)
            return r4
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            ub.a.f(r5)
            pf.e r5 = hf.l0.f8566a
            jf.d r5 = nf.n.f15850a
            i7.a r1 = new i7.a
            r3 = 0
            r1.<init>(r4, r3)
            r0.f15733d = r4
            r0.f15735f = r2
            java.lang.Object r5 = hf.a0.H(r5, r1, r0)
            zb.a r0 = zb.a.f26667a
            if (r5 != r0) goto L49
            return r0
        L49:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: na.q.j(java.lang.String, ac.c):java.lang.Object");
    }

    public static final boolean k(Throwable th2) {
        String message;
        String strA;
        if (!(th2 instanceof IllegalStateException) || (message = th2.getMessage()) == null) {
            return false;
        }
        try {
            xf.b bVar = xf.c.f24987d;
            bVar.getClass();
            xf.m mVar = (xf.m) bVar.a(message, xf.o.f25013a);
            xf.m mVar2 = (xf.m) xf.n.e(mVar).get("error");
            yb.c cVar = null;
            if (mVar2 != null && (strA = xf.n.f(mVar2).a()) != null) {
                ka.n.c(strA, 0L, null, null, 511);
                if (strA.equals("jwt expired")) {
                    hf.a0.y((hf.y) a9.i.f240k.getValue(), pf.d.f17138c, null, new ba.t(2, cVar, 13), 2);
                }
                return true;
            }
            xf.m mVar3 = (xf.m) xf.n.e(mVar).get("errors");
            if (mVar3 == null) {
                return false;
            }
            xf.e eVar = mVar3 instanceof xf.e ? (xf.e) mVar3 : null;
            if (eVar == null) {
                xf.n.b("JsonArray", mVar3);
                throw null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = eVar.f24993a.iterator();
            while (it.hasNext()) {
                xf.m mVar4 = (xf.m) xf.n.e((xf.m) it.next()).get("msg");
                String strA2 = mVar4 != null ? xf.n.f(mVar4).a() : null;
                if (strA2 != null) {
                    arrayList.add(strA2);
                }
            }
            String strF0 = vb.m.f0(arrayList, "\n", null, null, null, 62);
            if (strF0 == null) {
                return false;
            }
            ka.n.c(strF0, 0L, null, null, 511);
            return true;
        } catch (Throwable th3) {
            ub.a.b(th3);
            return false;
        }
    }
}
