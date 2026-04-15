package com.cnl.kikoeru;

import a0.c;
import a9.i;
import a9.j;
import a9.k;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import d.m0;
import d.n;
import d.p;
import d.s;
import d.t;
import d.u;
import d.v;
import f1.f;
import g9.a;
import h9.d;
import hg.b;
import i9.o;
import j2.k1;
import jc.l;
import jc.z;
import kotlin.Metadata;
import na.q;
import na.w;
import pc.f0;
import ub.a0;
import xf.r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/cnl/kikoeru/MainActivity;", "Ld/n;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MainActivity extends n {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f4292u = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f4293s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f4294t = true;

    public static final void i(MainActivity mainActivity) {
        if (((Boolean) c.F(Boolean.TYPE, gg.c.a(), "checkClipboardUrl", Boolean.TRUE)).booleanValue()) {
            r rVar = w.f15765a;
            Object systemService = i.a().getSystemService("clipboard");
            l.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            ClipData primaryClip = ((ClipboardManager) systemService).getPrimaryClip();
            int i10 = 0;
            String string = (primaryClip == null || primaryClip.getItemCount() <= 0) ? null : primaryClip.getItemAt(0).getText().toString();
            if (string == null) {
                return;
            }
            String strI = w.i(a.f7454a, string);
            if (strI == null) {
                strI = w.i(a.f7455b, string);
            }
            if (strI == null) {
                return;
            }
            b bVarP = f0.P(gg.c.a(), "lastClipboardRJ", "", z.a(String.class));
            if (l.a(bVarP.a(), strI)) {
                return;
            }
            bVarP.d(strI);
            ka.n.c(q.g(R.string.url_in_clipboard), 10000L, new j(i10, strI), q.g(R.string.open), 490);
        }
    }

    @Override // d.n, m3.a, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object objB;
        lc.b rVar;
        super.onCreate(bundle);
        try {
            o.f9489a.getClass();
            boolean z10 = o.b().length() == 0;
            Boolean boolValueOf = Boolean.valueOf(a.c());
            hg.a aVarA = gg.c.a();
            Class cls = Boolean.TYPE;
            boolean zBooleanValue = ((Boolean) f0.P(aVarA, "disableNotification", boolValueOf, z.a(cls)).a()).booleanValue();
            boolean zBooleanValue2 = ((Boolean) f0.P(gg.c.a(), "showNotificationStartup", Boolean.TRUE, z.a(cls)).a()).booleanValue();
            if (!zBooleanValue && zBooleanValue2 && !z10) {
                startService(new Intent(this, (Class<?>) MainService.class));
            }
            ((androidx.lifecycle.q) d.c()).y1(((Number) f0.P(gg.c.a(), "speedAudioFloat", Float.valueOf(1.0f), z.a(Float.TYPE)).a()).floatValue());
            objB = a0.f21526a;
        } catch (Throwable th2) {
            objB = ub.a.b(th2);
        }
        Throwable thA = ub.n.a(objB);
        if (thA != null) {
            thA.printStackTrace();
        }
        int i10 = 29;
        a9.n nVar = new a9.n(i10);
        m0 m0Var = new m0(0, 0, nVar);
        int i11 = p.f5255a;
        int i12 = p.f5256b;
        a9.n nVar2 = new a9.n(i10);
        m0 m0Var2 = new m0(i11, i12, nVar2);
        View decorView = getWindow().getDecorView();
        l.d(decorView, "getDecorView(...)");
        Resources resources = decorView.getResources();
        l.d(resources, "getResources(...)");
        boolean zBooleanValue3 = ((Boolean) nVar.a(resources)).booleanValue();
        Resources resources2 = decorView.getResources();
        l.d(resources2, "getResources(...)");
        boolean zBooleanValue4 = ((Boolean) nVar2.a(resources2)).booleanValue();
        d.q qVar = p.f5257c;
        lc.b bVar = qVar;
        if (qVar == null) {
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 30) {
                rVar = new v();
            } else if (i13 >= 29) {
                rVar = new u();
            } else if (i13 >= 28) {
                rVar = new t();
            } else if (i13 >= 26) {
                rVar = new s();
            } else if (i13 >= 23) {
                rVar = new d.r();
            } else {
                d.q qVar2 = new d.q();
                p.f5257c = qVar2;
                rVar = qVar2;
            }
            bVar = rVar;
        }
        Window window = getWindow();
        l.d(window, "getWindow(...)");
        bVar.T(m0Var, m0Var2, window, decorView, zBooleanValue3, zBooleanValue4);
        Window window2 = getWindow();
        l.d(window2, "getWindow(...)");
        bVar.k(window2);
        f fVar = a9.b.f211b;
        ViewGroup.LayoutParams layoutParams = e.d.f6021a;
        View childAt = ((ViewGroup) getWindow().getDecorView().findViewById(android.R.id.content)).getChildAt(0);
        k1 k1Var = childAt instanceof k1 ? (k1) childAt : null;
        if (k1Var != null) {
            k1Var.setParentCompositionContext(null);
            k1Var.setContent(fVar);
            return;
        }
        k1 k1Var2 = new k1(this);
        k1Var2.setParentCompositionContext(null);
        k1Var2.setContent(fVar);
        View decorView2 = getWindow().getDecorView();
        if (androidx.lifecycle.m0.d(decorView2) == null) {
            androidx.lifecycle.m0.i(decorView2, this);
        }
        if (androidx.lifecycle.m0.e(decorView2) == null) {
            decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        }
        if (ua.l.R(decorView2) == null) {
            decorView2.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
        setContentView(k1Var2, e.d.f6021a);
    }

    @Override // d.n, android.app.Activity
    public final void onNewIntent(Intent intent) {
        l.e(intent, "intent");
        super.onNewIntent(intent);
        if (System.currentTimeMillis() - this.f4293s >= 1000) {
            this.f4293s = System.currentTimeMillis();
            hf.a0.y(androidx.lifecycle.m0.f(this), null, null, new k(0, intent, null), 3);
        } else {
            q.c("ignore " + intent, "CallDeepLink");
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        this.f4294t = true;
        super.onResume();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10 && this.f4294t) {
            this.f4294t = false;
            hf.a0.y(androidx.lifecycle.m0.f(this), null, null, new k(1, this, null), 3);
        }
    }
}
