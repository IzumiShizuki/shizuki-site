package d;

import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import com.cnl.kikoeru.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class n extends m3.a implements x0, androidx.lifecycle.k, w7.e, l0, g.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f.a f5238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n5.d f5239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v2.e f5240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w0 f5241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f5242f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ub.p f5243g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m f5244h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f5245i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f5246j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final CopyOnWriteArrayList f5247k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CopyOnWriteArrayList f5248l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f5249m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f5250n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f5251o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f5252p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ub.p f5253q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ub.p f5254r;

    public n() {
        f.a aVar = new f.a();
        this.f5238b = aVar;
        this.f5239c = new n5.d(1);
        m4.z zVar = new m4.z(this, new t9.f(5, this));
        v2.e eVar = new v2.e(zVar);
        this.f5240d = eVar;
        this.f5242f = new l(this);
        this.f5243g = ub.a.d(new e(this, 0));
        new AtomicInteger();
        this.f5244h = new m(this);
        this.f5245i = new CopyOnWriteArrayList();
        this.f5246j = new CopyOnWriteArrayList();
        this.f5247k = new CopyOnWriteArrayList();
        this.f5248l = new CopyOnWriteArrayList();
        this.f5249m = new CopyOnWriteArrayList();
        this.f5250n = new CopyOnWriteArrayList();
        androidx.lifecycle.z zVar2 = this.f14026a;
        if (zVar2 == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        final int i10 = 0;
        zVar2.W0(new androidx.lifecycle.v(this) { // from class: d.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f5203b;

            {
                this.f5203b = this;
            }

            @Override // androidx.lifecycle.v
            public final void i(androidx.lifecycle.x xVar, androidx.lifecycle.o oVar) {
                Window window;
                View viewPeekDecorView;
                switch (i10) {
                    case 0:
                        n nVar = this.f5203b;
                        if (oVar == androidx.lifecycle.o.ON_STOP && (window = nVar.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        n nVar2 = this.f5203b;
                        if (oVar == androidx.lifecycle.o.ON_DESTROY) {
                            nVar2.f5238b.f6604b = null;
                            if (!nVar2.isChangingConfigurations()) {
                                nVar2.d().a();
                            }
                            l lVar = nVar2.f5242f;
                            n nVar3 = lVar.f5227d;
                            nVar3.getWindow().getDecorView().removeCallbacks(lVar);
                            nVar3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(lVar);
                        }
                        break;
                }
            }
        });
        final int i11 = 1;
        this.f14026a.W0(new androidx.lifecycle.v(this) { // from class: d.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f5203b;

            {
                this.f5203b = this;
            }

            @Override // androidx.lifecycle.v
            public final void i(androidx.lifecycle.x xVar, androidx.lifecycle.o oVar) {
                Window window;
                View viewPeekDecorView;
                switch (i11) {
                    case 0:
                        n nVar = this.f5203b;
                        if (oVar == androidx.lifecycle.o.ON_STOP && (window = nVar.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        n nVar2 = this.f5203b;
                        if (oVar == androidx.lifecycle.o.ON_DESTROY) {
                            nVar2.f5238b.f6604b = null;
                            if (!nVar2.isChangingConfigurations()) {
                                nVar2.d().a();
                            }
                            l lVar = nVar2.f5242f;
                            n nVar3 = lVar.f5227d;
                            nVar3.getWindow().getDecorView().removeCallbacks(lVar);
                            nVar3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(lVar);
                        }
                        break;
                }
            }
        });
        this.f14026a.W0(new w7.b(this, i11));
        zVar.a();
        androidx.lifecycle.m0.c(this);
        if (Build.VERSION.SDK_INT <= 23) {
            this.f14026a.W0(new a0(this));
        }
        ((v2.e) eVar.f22365c).y("android:support:activity-result", new h(0, this));
        i iVar = new i(this);
        n nVar = aVar.f6604b;
        if (nVar != null) {
            iVar.a(nVar);
        }
        aVar.f6603a.add(iVar);
        this.f5253q = ub.a.d(new e(this, 1));
        this.f5254r = ub.a.d(new e(this, 2));
    }

    public static void g(n nVar) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e10) {
            if (!jc.l.a(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e10;
            }
        } catch (NullPointerException e11) {
            if (!jc.l.a(e11.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e11;
            }
        }
    }

    @Override // d.l0
    public final j0 a() {
        return (j0) this.f5254r.getValue();
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h();
        View decorView = getWindow().getDecorView();
        jc.l.d(decorView, "getDecorView(...)");
        this.f5242f.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.k
    public final u0 b() {
        return (u0) this.f5253q.getValue();
    }

    @Override // androidx.lifecycle.k
    public final i4.e c() {
        i4.e eVar = new i4.e();
        Application application = getApplication();
        LinkedHashMap linkedHashMap = eVar.f9002a;
        if (application != null) {
            linkedHashMap.put(t0.f816e, getApplication());
        }
        linkedHashMap.put(androidx.lifecycle.m0.f783a, this);
        linkedHashMap.put(androidx.lifecycle.m0.f784b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(androidx.lifecycle.m0.f785c, extras);
        }
        return eVar;
    }

    @Override // androidx.lifecycle.x0
    public final w0 d() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f5241e == null) {
            k kVar = (k) getLastNonConfigurationInstance();
            if (kVar != null) {
                this.f5241e = kVar.f5221a;
            }
            if (this.f5241e == null) {
                this.f5241e = new w0();
            }
        }
        w0 w0Var = this.f5241e;
        jc.l.b(w0Var);
        return w0Var;
    }

    @Override // w7.e
    public final v2.e e() {
        return (v2.e) this.f5240d.f22365c;
    }

    @Override // androidx.lifecycle.x
    public final androidx.lifecycle.q f() {
        return this.f14026a;
    }

    public final void h() {
        View decorView = getWindow().getDecorView();
        jc.l.d(decorView, "getDecorView(...)");
        androidx.lifecycle.m0.i(decorView, this);
        View decorView2 = getWindow().getDecorView();
        jc.l.d(decorView2, "getDecorView(...)");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        jc.l.d(decorView3, "getDecorView(...)");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        jc.l.d(decorView4, "getDecorView(...)");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        jc.l.d(decorView5, "getDecorView(...)");
        decorView5.setTag(R.id.report_drawn, this);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        if (this.f5244h.a(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        a().c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        jc.l.e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator it = this.f5245i.iterator();
        jc.l.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((t3.a) it.next()).accept(configuration);
        }
    }

    @Override // m3.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f5240d.t(bundle);
        f.a aVar = this.f5238b;
        aVar.getClass();
        aVar.f6604b = this;
        Iterator it = aVar.f6603a.iterator();
        while (it.hasNext()) {
            ((i) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i10 = androidx.lifecycle.i0.f774b;
        androidx.lifecycle.f0.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        jc.l.e(menu, "menu");
        if (i10 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i10, menu);
        getMenuInflater();
        Iterator it = this.f5239c.f15326a.iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        jc.l.e(menuItem, "item");
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 != 0) {
            return false;
        }
        Iterator it = this.f5239c.f15326a.iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z10) {
        if (this.f5251o) {
            return;
        }
        Iterator it = this.f5248l.iterator();
        jc.l.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((t3.a) it.next()).accept(new g5.w(29));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        jc.l.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f5247k.iterator();
        jc.l.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((t3.a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i10, Menu menu) {
        jc.l.e(menu, "menu");
        Iterator it = this.f5239c.f15326a.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z10) {
        if (this.f5252p) {
            return;
        }
        Iterator it = this.f5249m.iterator();
        jc.l.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((t3.a) it.next()).accept(new m3.l(0));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        jc.l.e(menu, "menu");
        if (i10 != 0) {
            return true;
        }
        super.onPreparePanel(i10, view, menu);
        Iterator it = this.f5239c.f15326a.iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        jc.l.e(strArr, "permissions");
        jc.l.e(iArr, "grantResults");
        if (this.f5244h.a(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        k kVar;
        w0 w0Var = this.f5241e;
        if (w0Var == null && (kVar = (k) getLastNonConfigurationInstance()) != null) {
            w0Var = kVar.f5221a;
        }
        if (w0Var == null) {
            return null;
        }
        k kVar2 = new k();
        kVar2.f5221a = w0Var;
        return kVar2;
    }

    @Override // m3.a, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        jc.l.e(bundle, "outState");
        androidx.lifecycle.z zVar = this.f14026a;
        if (zVar != null) {
            jc.l.c(zVar, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            zVar.F1(androidx.lifecycle.p.f796c);
        }
        super.onSaveInstanceState(bundle);
        this.f5240d.x(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator it = this.f5246j.iterator();
        jc.l.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((t3.a) it.next()).accept(Integer.valueOf(i10));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f5250n.iterator();
        jc.l.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (a.a.H()) {
                a.a.t("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            w wVar = (w) this.f5243g.getValue();
            synchronized (wVar.f5258a) {
                try {
                    wVar.f5259b = true;
                    Iterator it = wVar.f5260c.iterator();
                    while (it.hasNext()) {
                        ((ic.a) it.next()).b();
                    }
                    wVar.f5260c.clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i10) {
        h();
        View decorView = getWindow().getDecorView();
        jc.l.d(decorView, "getDecorView(...)");
        this.f5242f.a(decorView);
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i10) {
        jc.l.e(intent, "intent");
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13) throws IntentSender.SendIntentException {
        jc.l.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        jc.l.e(intent, "intent");
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        jc.l.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        h();
        View decorView = getWindow().getDecorView();
        jc.l.d(decorView, "getDecorView(...)");
        this.f5242f.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z10, Configuration configuration) {
        jc.l.e(configuration, "newConfig");
        this.f5251o = true;
        try {
            super.onMultiWindowModeChanged(z10, configuration);
            this.f5251o = false;
            Iterator it = this.f5248l.iterator();
            jc.l.d(it, "iterator(...)");
            while (it.hasNext()) {
                ((t3.a) it.next()).accept(new g5.w(29));
            }
        } catch (Throwable th2) {
            this.f5251o = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        jc.l.e(configuration, "newConfig");
        this.f5252p = true;
        try {
            super.onPictureInPictureModeChanged(z10, configuration);
            this.f5252p = false;
            Iterator it = this.f5249m.iterator();
            jc.l.d(it, "iterator(...)");
            while (it.hasNext()) {
                ((t3.a) it.next()).accept(new m3.l(0));
            }
        } catch (Throwable th2) {
            this.f5252p = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h();
        View decorView = getWindow().getDecorView();
        jc.l.d(decorView, "getDecorView(...)");
        this.f5242f.a(decorView);
        super.setContentView(view, layoutParams);
    }
}
