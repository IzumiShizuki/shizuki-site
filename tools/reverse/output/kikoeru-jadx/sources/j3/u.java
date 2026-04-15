package j3;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.lifecycle.m0;
import b0.d0;
import ce.j0;
import com.cnl.kikoeru.R;
import d.e0;
import j2.a3;
import java.util.UUID;
import x0.c0;
import x0.e1;
import x0.p1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u extends j2.a {
    public final int[] A;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ic.a f10175i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public y f10176j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f10177k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View f10178l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w f10179m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final WindowManager f10180n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final WindowManager.LayoutParams f10181o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public x f10182p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public f3.m f10183q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e1 f10184r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e1 f10185s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public f3.k f10186t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final c0 f10187u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Rect f10188v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final h1.y f10189w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public e0 f10190x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e1 f10191y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f10192z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ic.a aVar, y yVar, String str, View view, f3.c cVar, x xVar, UUID uuid) {
        super(view.getContext());
        w vVar = Build.VERSION.SDK_INT >= 29 ? new v() : new w();
        this.f10175i = aVar;
        this.f10176j = yVar;
        this.f10177k = str;
        this.f10178l = view;
        this.f10179m = vVar;
        Object systemService = view.getContext().getSystemService("window");
        jc.l.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f10180n = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        y yVar2 = this.f10176j;
        boolean zB = j.b(view);
        boolean z10 = yVar2.f10194b;
        int i10 = yVar2.f10193a;
        if (z10 && zB) {
            i10 |= 8192;
        } else if (z10 && !zB) {
            i10 &= -8193;
        }
        layoutParams.flags = i10;
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.f10181o = layoutParams;
        this.f10182p = xVar;
        this.f10183q = f3.m.f6667a;
        this.f10184r = x0.v.v(null);
        this.f10185s = x0.v.v(null);
        this.f10187u = x0.v.o(new d0(21, this));
        this.f10188v = new Rect();
        this.f10189w = new h1.y(new h(this, 2));
        setId(android.R.id.content);
        m0.i(this, m0.d(view));
        setTag(R.id.view_tree_view_model_store_owner, m0.e(view));
        setTag(R.id.view_tree_saved_state_registry_owner, ua.l.R(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(cVar.Q((float) 8));
        setOutlineProvider(new a3(2));
        this.f10191y = x0.v.v(o.f10149a);
        this.A = new int[2];
    }

    private final ic.n getContent() {
        return (ic.n) this.f10191y.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g2.c0 getParentLayoutCoordinates() {
        return (g2.c0) this.f10185s.getValue();
    }

    private final f3.k getVisibleDisplayBounds() {
        this.f10179m.getClass();
        View view = this.f10178l;
        Rect rect = this.f10188v;
        view.getWindowVisibleDisplayFrame(rect);
        return new f3.k(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final void setContent(ic.n nVar) {
        this.f10191y.setValue(nVar);
    }

    private final void setParentLayoutCoordinates(g2.c0 c0Var) {
        this.f10185s.setValue(c0Var);
    }

    @Override // j2.a
    public final void a(int i10, x0.o oVar) {
        oVar.Y(-857613600);
        int i11 = (oVar.h(this) ? 4 : 2) | i10;
        if (oVar.N(i11 & 1, (i11 & 3) != 2)) {
            getContent().q(oVar, 0);
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new cg.d(i10, 13, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f10176j.f10195c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                ic.a aVar = this.f10175i;
                if (aVar != null) {
                    aVar.b();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // j2.a
    public final void f(boolean z10, int i10, int i11, int i12, int i13) {
        super.f(z10, i10, i11, i12, i13);
        this.f10176j.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.f10181o;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.f10179m.getClass();
        this.f10180n.updateViewLayout(this, layoutParams);
    }

    @Override // j2.a
    public final void g(int i10, int i11) {
        this.f10176j.getClass();
        f3.k visibleDisplayBounds = getVisibleDisplayBounds();
        super.g(View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.f6664c - visibleDisplayBounds.f6662a, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.a(), Integer.MIN_VALUE));
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f10187u.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.f10181o;
    }

    public final f3.m getParentLayoutDirection() {
        return this.f10183q;
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final f3.l m7getPopupContentSizebOM6tXw() {
        return (f3.l) this.f10184r.getValue();
    }

    public final x getPositionProvider() {
        return this.f10182p;
    }

    @Override // j2.a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f10192z;
    }

    public final String getTestTag() {
        return this.f10177k;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    public final void j(x0.r rVar, ic.n nVar) {
        setParentCompositionContext(rVar);
        setContent(nVar);
        this.f10192z = true;
    }

    public final void k(ic.a aVar, y yVar, String str, f3.m mVar) {
        int i10;
        this.f10175i = aVar;
        this.f10177k = str;
        if (!jc.l.a(this.f10176j, yVar)) {
            yVar.getClass();
            this.f10176j = yVar;
            boolean zB = j.b(this.f10178l);
            boolean z10 = yVar.f10194b;
            int i11 = yVar.f10193a;
            if (z10 && zB) {
                i11 |= 8192;
            } else if (z10 && !zB) {
                i11 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.f10181o;
            layoutParams.flags = i11;
            this.f10179m.getClass();
            this.f10180n.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = mVar.ordinal();
        if (iOrdinal != 0) {
            i10 = 1;
            if (iOrdinal != 1) {
                throw new j0();
            }
        } else {
            i10 = 0;
        }
        super.setLayoutDirection(i10);
    }

    public final void l() {
        g2.c0 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.h()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jK = parentLayoutCoordinates.k();
            long jC = parentLayoutCoordinates.c(0L);
            long jRound = (((long) Math.round(Float.intBitsToFloat((int) (jC >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jC & 4294967295L)))) & 4294967295L);
            int i10 = (int) (jRound >> 32);
            int i11 = (int) (jRound & 4294967295L);
            f3.k kVar = new f3.k(i10, i11, ((int) (jK >> 32)) + i10, ((int) (jK & 4294967295L)) + i11);
            if (kVar.equals(this.f10186t)) {
                return;
            }
            this.f10186t = kVar;
            n();
        }
    }

    public final void m(g2.c0 c0Var) {
        setParentLayoutCoordinates(c0Var);
        l();
    }

    public final void n() {
        f3.l lVarM7getPopupContentSizebOM6tXw;
        f3.k kVar = this.f10186t;
        if (kVar == null || (lVarM7getPopupContentSizebOM6tXw = m7getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j10 = lVarM7getPopupContentSizebOM6tXw.f6666a;
        f3.k visibleDisplayBounds = getVisibleDisplayBounds();
        long jA = (((long) visibleDisplayBounds.a()) & 4294967295L) | (((long) (visibleDisplayBounds.f6664c - visibleDisplayBounds.f6662a)) << 32);
        jc.x xVar = new jc.x();
        xVar.f10837a = 0L;
        this.f10189w.d(this, c.f10120h, new t(xVar, this, kVar, jA, j10));
        long j11 = xVar.f10837a;
        WindowManager.LayoutParams layoutParams = this.f10181o;
        layoutParams.x = (int) (j11 >> 32);
        layoutParams.y = (int) (j11 & 4294967295L);
        boolean z10 = this.f10176j.f10197e;
        w wVar = this.f10179m;
        if (z10) {
            wVar.a(this, (int) (jA >> 32), (int) (jA & 4294967295L));
        }
        wVar.getClass();
        this.f10180n.updateViewLayout(this, layoutParams);
    }

    @Override // j2.a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f10189w.e();
        if (!this.f10176j.f10195c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.f10190x == null) {
            this.f10190x = new e0(1, this.f10175i);
        }
        d.j.f(this, this.f10190x);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h1.y yVar = this.f10189w;
        androidx.media3.exoplayer.offline.g gVar = yVar.f8096h;
        if (gVar != null) {
            gVar.i();
        }
        yVar.a();
        if (Build.VERSION.SDK_INT >= 33) {
            d.j.g(this, this.f10190x);
        }
        this.f10190x = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f10176j.f10196d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            ic.a aVar = this.f10175i;
            if (aVar != null) {
                aVar.b();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            ic.a aVar2 = this.f10175i;
            if (aVar2 != null) {
                aVar2.b();
            }
        }
        return true;
    }

    public final void setParentLayoutDirection(f3.m mVar) {
        this.f10183q = mVar;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m8setPopupContentSizefhxjrPA(f3.l lVar) {
        this.f10184r.setValue(lVar);
    }

    public final void setPositionProvider(x xVar) {
        this.f10182p = xVar;
    }

    public final void setTestTag(String str) {
        this.f10177k = str;
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    public j2.a getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
    }
}
