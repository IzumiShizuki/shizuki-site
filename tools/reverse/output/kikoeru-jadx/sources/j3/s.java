package j3;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.m0;
import com.cnl.kikoeru.R;
import d.j0;
import d.k0;
import d.l0;
import j2.a3;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s extends Dialog implements androidx.lifecycle.x, l0, w7.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.z f10162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v2.e f10163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0 f10164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ic.a f10165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q f10166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f10167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f10168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f10169h;

    public s(ic.a aVar, q qVar, View view, f3.m mVar, f3.c cVar, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), qVar.f10160e ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
        this.f10163b = new v2.e(new m4.z(this, new t9.f(5, this)));
        j0 j0Var = new j0(new a9.m(13, this));
        this.f10164c = j0Var;
        this.f10165d = aVar;
        this.f10166e = qVar;
        this.f10167f = view;
        float f10 = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        n7.d.z(window, this.f10166e.f10160e);
        window.setGravity(17);
        if (!this.f10166e.f10160e) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes = window.getAttributes();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                k.f10143a.a(attributes);
            }
            if (i10 >= 30) {
                l lVar = l.f10144a;
                lVar.a(attributes, 0);
                lVar.b(attributes, 0);
            }
            window.setAttributes(attributes);
        }
        p pVar = new p(getContext(), window);
        setTitle(this.f10166e.f10161f);
        pVar.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        pVar.setClipChildren(false);
        pVar.setElevation(cVar.Q(f10));
        pVar.setOutlineProvider(new a3(1));
        this.f10168g = pVar;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            c(viewGroup);
        }
        setContentView(pVar);
        m0.i(pVar, m0.d(view));
        pVar.setTag(R.id.view_tree_view_model_store_owner, m0.e(view));
        pVar.setTag(R.id.view_tree_saved_state_registry_owner, ua.l.R(view));
        g(this.f10165d, this.f10166e, mVar);
        j0Var.a(this, new k0(new a(this, 1)));
    }

    public static void b(s sVar) {
        super.onBackPressed();
    }

    public static final void c(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof p) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                c(viewGroup2);
            }
        }
    }

    @Override // d.l0
    public final j0 a() {
        return this.f10164c;
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        jc.l.e(view, "view");
        d();
        super.addContentView(view, layoutParams);
    }

    public final void d() {
        Window window = getWindow();
        jc.l.b(window);
        View decorView = window.getDecorView();
        jc.l.d(decorView, "getDecorView(...)");
        m0.i(decorView, this);
        Window window2 = getWindow();
        jc.l.b(window2);
        View decorView2 = window2.getDecorView();
        jc.l.d(decorView2, "getDecorView(...)");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        jc.l.b(window3);
        View decorView3 = window3.getDecorView();
        jc.l.d(decorView3, "getDecorView(...)");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // w7.e
    public final v2.e e() {
        return (v2.e) this.f10163b.f22365c;
    }

    @Override // androidx.lifecycle.x
    public final androidx.lifecycle.q f() {
        androidx.lifecycle.z zVar = this.f10162a;
        if (zVar != null) {
            return zVar;
        }
        androidx.lifecycle.z zVar2 = new androidx.lifecycle.z(this, true);
        this.f10162a = zVar2;
        return zVar2;
    }

    public final void g(ic.a aVar, q qVar, f3.m mVar) {
        int i10;
        this.f10165d = aVar;
        this.f10166e = qVar;
        z zVar = qVar.f10158c;
        boolean zB = j.b(this.f10167f);
        int iOrdinal = zVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zB = true;
            } else {
                if (iOrdinal != 2) {
                    throw new ce.j0();
                }
                zB = false;
            }
        }
        Window window = getWindow();
        jc.l.b(window);
        window.setFlags(zB ? 8192 : -8193, 8192);
        int iOrdinal2 = mVar.ordinal();
        if (iOrdinal2 == 0) {
            i10 = 0;
        } else {
            if (iOrdinal2 != 1) {
                throw new ce.j0();
            }
            i10 = 1;
        }
        p pVar = this.f10168g;
        pVar.setLayoutDirection(i10);
        boolean z10 = qVar.f10160e;
        boolean z11 = qVar.f10159d;
        Window window2 = pVar.f10150i;
        boolean z12 = (pVar.f10154m && z11 == pVar.f10152k && z10 == pVar.f10153l) ? false : true;
        pVar.f10152k = z11;
        pVar.f10153l = z10;
        if (z12) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i11 = z11 ? -2 : -1;
            if (i11 != attributes.width || !pVar.f10154m) {
                window2.setLayout(i11, -2);
                pVar.f10154m = true;
            }
        }
        setCanceledOnTouchOutside(qVar.f10157b);
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(z10 ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f10164c.c();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            jc.l.d(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            j0 j0Var = this.f10164c;
            j0Var.f5218e = onBackInvokedDispatcher;
            j0Var.d(j0Var.f5220g);
        }
        this.f10163b.t(bundle);
        androidx.lifecycle.z zVar = this.f10162a;
        if (zVar == null) {
            zVar = new androidx.lifecycle.z(this, true);
            this.f10162a = zVar;
        }
        zVar.D1(androidx.lifecycle.o.ON_CREATE);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (!this.f10166e.f10156a || !keyEvent.isTracking() || keyEvent.isCanceled() || i10 != 111) {
            return super.onKeyUp(i10, keyEvent);
        }
        this.f10165d.b();
        return true;
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        jc.l.d(bundleOnSaveInstanceState, "onSaveInstanceState(...)");
        this.f10163b.x(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        androidx.lifecycle.z zVar = this.f10162a;
        if (zVar == null) {
            zVar = new androidx.lifecycle.z(this, true);
            this.f10162a = zVar;
        }
        zVar.D1(androidx.lifecycle.o.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        androidx.lifecycle.z zVar = this.f10162a;
        if (zVar == null) {
            zVar = new androidx.lifecycle.z(this, true);
            this.f10162a = zVar;
        }
        zVar.D1(androidx.lifecycle.o.ON_DESTROY);
        this.f10162a = null;
        super.onStop();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = super.onTouchEvent(r10)
            j3.q r1 = r9.f10166e
            boolean r1 = r1.f10157b
            r2 = 3
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L8b
            j3.p r1 = r9.f10168g
            r1.getClass()
            float r5 = r10.getX()
            boolean r6 = java.lang.Float.isInfinite(r5)
            if (r6 != 0) goto L6e
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L6e
            float r5 = r10.getY()
            boolean r6 = java.lang.Float.isInfinite(r5)
            if (r6 != 0) goto L6e
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L6e
            android.view.View r5 = r1.getChildAt(r3)
            if (r5 != 0) goto L39
            goto L6e
        L39:
            int r6 = r1.getLeft()
            int r7 = r5.getLeft()
            int r7 = r7 + r6
            int r6 = r5.getWidth()
            int r6 = r6 + r7
            int r1 = r1.getTop()
            int r8 = r5.getTop()
            int r8 = r8 + r1
            int r1 = r5.getHeight()
            int r1 = r1 + r8
            float r5 = r10.getX()
            int r5 = lc.b.R(r5)
            if (r7 > r5) goto L6e
            if (r5 > r6) goto L6e
            float r5 = r10.getY()
            int r5 = lc.b.R(r5)
            if (r8 > r5) goto L6e
            if (r5 > r1) goto L6e
            goto L8b
        L6e:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L88
            if (r10 == r4) goto L7c
            if (r10 == r2) goto L79
            goto L95
        L79:
            r9.f10169h = r3
            return r0
        L7c:
            boolean r10 = r9.f10169h
            if (r10 == 0) goto L95
            ic.a r10 = r9.f10165d
            r10.b()
            r9.f10169h = r3
            return r4
        L88:
            r9.f10169h = r4
            return r4
        L8b:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L96
            if (r10 == r4) goto L96
            if (r10 == r2) goto L96
        L95:
            return r0
        L96:
            r9.f10169h = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.s.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.app.Dialog
    public final void setContentView(int i10) {
        d();
        super.setContentView(i10);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        jc.l.e(view, "view");
        d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        jc.l.e(view, "view");
        d();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
