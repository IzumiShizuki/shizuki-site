package s0;

import a9.r;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import ce.j0;
import com.cnl.kikoeru.R;
import f3.k;
import f3.m;
import ic.n;
import j2.a3;
import java.util.UUID;
import jc.l;
import m0.v2;
import x0.c0;
import x0.e1;
import x0.o;
import x0.p1;
import x0.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i extends j2.a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ic.a f19327i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f19328j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final WindowManager f19329k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final WindowManager.LayoutParams f19330l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public v2 f19331m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public m f19332n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final e1 f19333o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e1 f19334p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c0 f19335q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Rect f19336r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Rect f19337s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q9.b f19338t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final e1 f19339u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f19340v;

    public i(ic.a aVar, View view, f3.c cVar, v2 v2Var, UUID uuid) {
        super(view.getContext());
        this.f19327i = aVar;
        this.f19328j = view;
        Object systemService = view.getContext().getSystemService("window");
        l.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f19329k = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = 393248;
        layoutParams.softInputMode = 1;
        layoutParams.type = 1000;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.f19330l = layoutParams;
        this.f19331m = v2Var;
        this.f19332n = m.f6667a;
        this.f19333o = v.v(null);
        this.f19334p = v.v(null);
        this.f19335q = v.o(new n0(26, this));
        this.f19336r = new Rect();
        this.f19337s = new Rect();
        this.f19338t = new q9.b(6);
        setId(android.R.id.content);
        m0.i(this, m0.d(view));
        setTag(R.id.view_tree_view_model_store_owner, m0.e(view));
        setTag(R.id.view_tree_saved_state_registry_owner, ua.l.R(view));
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(cVar.Q((float) 8));
        setOutlineProvider(new a3(3));
        this.f19339u = v.v(b.f19319a);
    }

    @Override // j2.a
    public final void a(int i10, o oVar) {
        oVar.Y(-864350873);
        int i11 = (oVar.h(this) ? 4 : 2) | i10;
        if (oVar.N(i11 & 1, (i11 & 3) != 2)) {
            ((n) this.f19339u.getValue()).q(oVar, 0);
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new r(i10, 18, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
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
                ic.a aVar = this.f19327i;
                if (aVar != null) {
                    aVar.b();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // j2.a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f19340v;
    }

    public final void i(ic.a aVar, m mVar) {
        int i10;
        this.f19327i = aVar;
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

    public final void j() {
        f3.l lVar;
        k kVar = (k) this.f19333o.getValue();
        if (kVar == null || (lVar = (f3.l) this.f19334p.getValue()) == null) {
            return;
        }
        long j10 = lVar.f6666a;
        View view = this.f19328j;
        Rect rect = this.f19336r;
        view.getWindowVisibleDisplayFrame(rect);
        long jA = this.f19331m.a(kVar, (((long) (rect.right - rect.left)) << 32) | (((long) (rect.bottom - rect.top)) & 4294967295L), this.f19332n, j10);
        WindowManager.LayoutParams layoutParams = this.f19330l;
        layoutParams.x = (int) (jA >> 32);
        layoutParams.y = (int) (jA & 4294967295L);
        this.f19329k.updateViewLayout(this, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.f19328j;
        Rect rect = this.f19337s;
        view.getWindowVisibleDisplayFrame(rect);
        if (l.a(rect, this.f19336r)) {
            return;
        }
        j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
    
        if (((java.lang.Boolean) r7.f19338t.q(r1, r0)).booleanValue() != false) goto L28;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            if (r8 != 0) goto L7
            boolean r8 = super.onTouchEvent(r8)
            return r8
        L7:
            int r0 = r8.getAction()
            r1 = 0
            if (r0 != 0) goto L38
            float r0 = r8.getX()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L3f
            float r0 = r8.getX()
            int r2 = r7.getWidth()
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L3f
            float r0 = r8.getY()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L3f
            float r0 = r8.getY()
            int r2 = r7.getHeight()
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L3f
        L38:
            int r0 = r8.getAction()
            r2 = 4
            if (r0 != r2) goto L95
        L3f:
            x0.e1 r0 = r7.f19333o
            java.lang.Object r0 = r0.getValue()
            f3.k r0 = (f3.k) r0
            if (r0 == 0) goto L8c
            float r2 = r8.getRawX()
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 != 0) goto L52
            goto L5a
        L52:
            float r2 = r8.getRawY()
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L5c
        L5a:
            r1 = 0
            goto L7e
        L5c:
            float r1 = r8.getRawX()
            float r2 = r8.getRawY()
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r3 = (long) r1
            int r1 = java.lang.Float.floatToRawIntBits(r2)
            long r1 = (long) r1
            r5 = 32
            long r3 = r3 << r5
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r5
            long r1 = r1 | r3
            p1.b r3 = new p1.b
            r3.<init>(r1)
            r1 = r3
        L7e:
            q9.b r2 = r7.f19338t
            java.lang.Object r0 = r2.q(r1, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L95
        L8c:
            ic.a r8 = r7.f19327i
            if (r8 == 0) goto L93
            r8.b()
        L93:
            r8 = 1
            return r8
        L95:
            boolean r8 = super.onTouchEvent(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.i.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i10) {
    }
}
