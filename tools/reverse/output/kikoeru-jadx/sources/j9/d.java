package j9;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.view.View;
import android.view.WindowManager;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.cnl.kikoeru.MainApplication;
import g2.v0;
import j2.h0;
import java.lang.ref.WeakReference;
import m0.z8;
import q1.k0;
import t2.l0;
import x0.j1;
import x0.n2;
import x0.p1;
import x0.r0;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f10668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ pc.u[] f10669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static WeakReference f10670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static WindowManager.LayoutParams f10671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f10672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final hg.b f10673f;

    static {
        jc.o oVar = new jc.o(d.class, "offsetY", "getOffsetY()F", 0);
        jc.a0 a0Var = jc.z.f10839a;
        f10669b = new pc.u[]{a0Var.e(oVar), a0Var.f(new jc.r(d.class, "noTouchable", "<v#0>", 0)), a0Var.f(new jc.r(d.class, "noTouchable", "<v#1>", 0))};
        f10668a = new d();
        f10673f = pc.f0.P(gg.c.a(), "floatingLrcY", Float.valueOf(0.0f), jc.z.a(Float.TYPE));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(com.cnl.kikoeru.MainApplication r8) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.d.b(com.cnl.kikoeru.MainApplication):void");
    }

    public static boolean c(Context context) {
        jc.l.e(context, "ctx");
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        boolean zCanDrawOverlays = Settings.canDrawOverlays(context);
        if (!zCanDrawOverlays) {
            Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
            intent.setData(Uri.parse("package:" + context.getPackageName()));
            intent.addFlags(268435456);
            intent.addFlags(536870912);
            intent.addFlags(65536);
            context.startActivity(intent);
        }
        return zCanDrawOverlays;
    }

    public static void d(MainApplication mainApplication) {
        jc.l.e(mainApplication, "ctx");
        Object systemService = mainApplication.getSystemService("window");
        jc.l.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        WindowManager windowManager = (WindowManager) systemService;
        try {
            WeakReference weakReference = f10670c;
            windowManager.removeView(weakReference != null ? (View) weakReference.get() : null);
            f10672e = false;
        } catch (Throwable th2) {
            ub.a.b(th2);
        }
    }

    public final void a(int i10, x0.o oVar) {
        x0.o oVar2 = oVar;
        oVar2.Y(-1424627097);
        int i11 = i10 & 1;
        if (oVar2.N(i11, i11 != 0)) {
            Object objK = oVar2.K();
            r0 r0Var = x0.k.f24334a;
            if (objK == r0Var) {
                objK = x0.v.m(oVar2);
                oVar2.h0(objK);
            }
            hf.y yVar = (hf.y) objK;
            Object objK2 = oVar2.K();
            if (objK2 == r0Var) {
                objK2 = x0.v.v("");
                oVar2.h0(objK2);
            }
            w0 w0Var = (w0) objK2;
            boolean zH = oVar2.h(yVar);
            Object objK3 = oVar2.K();
            if (zH || objK3 == r0Var) {
                objK3 = new androidx.lifecycle.r(yVar, w0Var, null, 8);
                oVar2.h0(objK3);
            }
            ub.a0 a0Var = ub.a0.f21526a;
            x0.v.e((ic.n) objK3, a0Var, oVar2);
            Object objK4 = oVar2.K();
            if (objK4 == r0Var) {
                objK4 = pc.f0.P(gg.c.a(), "floatingLyricsTextAlignCenter", Boolean.TRUE, jc.z.a(Boolean.TYPE));
                oVar2.h0(objK4);
            }
            w0 w0VarF = lc.b.F((hg.b) objK4, oVar2);
            Object objK5 = oVar2.K();
            if (objK5 == r0Var) {
                objK5 = x0.v.o(new ba.r(w0VarF, 3));
                oVar2.h0(objK5);
            }
            n2 n2Var = (n2) objK5;
            Object objK6 = oVar2.K();
            if (objK6 == r0Var) {
                objK6 = pc.f0.P(gg.c.a(), "floatingLyricsTextSize", 25, jc.z.a(Integer.TYPE));
                oVar2.h0(objK6);
            }
            w0 w0VarF2 = lc.b.F((hg.b) objK6, oVar2);
            Object objK7 = oVar2.K();
            Class cls = Long.TYPE;
            if (objK7 == r0Var) {
                objK7 = pc.f0.P(gg.c.a(), "floatLyricsTextColor", 4294967295L, jc.z.a(cls));
                oVar2.h0(objK7);
            }
            w0 w0VarF3 = lc.b.F((hg.b) objK7, oVar2);
            Object objK8 = oVar2.K();
            if (objK8 == r0Var) {
                objK8 = pc.f0.P(gg.c.a(), "floatLyricsTextShadowColor", 4278190080L, jc.z.a(cls));
                oVar2.h0(objK8);
            }
            w0 w0VarF4 = lc.b.F((hg.b) objK8, oVar2);
            j1.q qVarC = androidx.compose.foundation.layout.c.c(j1.n.f9689a, 1.0f);
            Object objK9 = oVar2.K();
            if (objK9 == r0Var) {
                objK9 = b.f10658a;
                oVar2.h0(objK9);
            }
            j1.q qVarJ = androidx.compose.foundation.layout.a.j(c2.e0.a(qVarC, a0Var, (PointerInputEventHandler) objK9), 5);
            v0 v0VarD = y.p.d(j1.c.f9666e, false);
            int iQ = x0.v.q(oVar2);
            j1 j1VarL = oVar2.l();
            j1.q qVarC2 = j1.a.c(qVarJ, oVar2);
            i2.k.f8771g0.getClass();
            i2.i iVar = i2.j.f8733b;
            oVar2.a0();
            if (oVar2.S) {
                oVar2.k(iVar);
            } else {
                oVar2.k0();
            }
            x0.v.A(i2.j.f8738g, v0VarD, oVar2);
            x0.v.A(i2.j.f8737f, j1VarL, oVar2);
            i2.h hVar = i2.j.f8741j;
            if (oVar2.S || !jc.l.a(oVar2.K(), Integer.valueOf(iQ))) {
                h0.s(iQ, oVar2, iQ, hVar);
            }
            x0.v.A(i2.j.f8735d, qVarC2, oVar2);
            z8.b((String) w0Var.getValue(), null, q1.h0.e(((Number) w0VarF4.getValue()).longValue()), lc.b.C(((Number) w0VarF2.getValue()).intValue()), null, null, 0L, null, new e3.k(((e3.k) n2Var.getValue()).f6081a), 0L, 2, false, 3, 0, l0.a(l0.f20361d, 0L, 0L, null, null, null, 0L, new k0(q1.h0.e(((Number) w0VarF4.getValue()).longValue()), (((long) Float.floatToRawIntBits(5.0f)) << 32) | (((long) Float.floatToRawIntBits(5.0f)) & 4294967295L), 20.0f), new s1.h(5.0f, 10.0f, 0, 1, 20), 0L, null, null, 16752639), oVar, 0, 3120, 54770);
            z8.b((String) w0Var.getValue(), null, q1.h0.e(((Number) w0VarF3.getValue()).longValue()), lc.b.C(((Number) w0VarF2.getValue()).intValue()), null, null, 0L, null, new e3.k(((e3.k) n2Var.getValue()).f6081a), 0L, 2, false, 3, 0, null, oVar, 0, 3120, 120306);
            oVar2 = oVar;
            oVar2.p(true);
        } else {
            oVar2.Q();
        }
        p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new a9.r(i10, 7, this);
        }
    }
}
