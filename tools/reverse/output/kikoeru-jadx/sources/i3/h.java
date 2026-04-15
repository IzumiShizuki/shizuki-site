package i3;

import a0.f0;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.m0;
import androidx.lifecycle.x;
import b0.o1;
import c2.a0;
import c2.g0;
import c2.z;
import com.cnl.kikoeru.R;
import e7.c0;
import g2.n1;
import i2.j0;
import i2.p1;
import i2.q1;
import i2.r1;
import i2.u;
import j2.l3;
import j2.v;
import java.util.LinkedHashMap;
import u3.s;
import u3.t0;
import u3.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class h extends ViewGroup implements u3.e, x0.i, q1, u3.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2.d f8950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f8951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p1 f8952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ic.a f8953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ic.a f8955f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ic.a f8956g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j1.q f8957h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ic.k f8958i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f3.c f8959j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ic.k f8960k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public x f8961l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public w7.e f8962m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int[] f8963n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f8964o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public w0 f8965p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g f8966q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g f8967r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ic.k f8968s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int[] f8969t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f8970u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f8971v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c0 f8972w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f8973x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final j0 f8974y;

    public h(Context context, x0.n nVar, int i10, b2.d dVar, View view, p1 p1Var) {
        super(context);
        this.f8950a = dVar;
        this.f8951b = view;
        this.f8952c = p1Var;
        LinkedHashMap linkedHashMap = l3.f9882a;
        setTag(R.id.androidx_compose_ui_view_composition_context, nVar);
        int i11 = 0;
        setSaveFromParentEnabled(false);
        addView(view);
        q qVar = (q) this;
        s.c(this, new b(qVar, i11));
        u3.l.c(this, this);
        this.f8953d = f.f8946e;
        this.f8955f = f.f8945d;
        this.f8956g = f.f8944c;
        j1.n nVar2 = j1.n.f9689a;
        this.f8957h = nVar2;
        this.f8959j = a.a.c();
        int i12 = 2;
        this.f8963n = new int[2];
        this.f8964o = 0L;
        int i13 = 1;
        this.f8966q = new g(qVar, i13);
        this.f8967r = new g(qVar, i11);
        this.f8969t = new int[2];
        this.f8970u = Integer.MIN_VALUE;
        this.f8971v = Integer.MIN_VALUE;
        this.f8972w = new c0(4);
        j0 j0Var = new j0(3);
        j0Var.f8756o = qVar;
        j1.q qVarA = q2.m.a(androidx.compose.ui.input.nestedscroll.a.a(nVar2, j.f8975a, dVar), true, c.f8935e);
        z zVar = new z();
        zVar.f3355a = new a0(qVar, i11);
        bd.a aVar = new bd.a();
        bd.a aVar2 = zVar.f3356b;
        if (aVar2 != null) {
            aVar2.f2541b = null;
        }
        zVar.f3356b = aVar;
        aVar.f2541b = zVar;
        setOnRequestDisallowInterceptTouchEvent$ui_release(aVar);
        j1.q qVarD = androidx.compose.ui.layout.a.d(androidx.compose.ui.draw.a.a(qVarA.e(zVar), new cg.b(qVar, j0Var, qVar, 7)), new d(qVar, j0Var, i12));
        j0Var.h0(this.f8957h.e(qVarD));
        this.f8958i = new o1(11, j0Var, qVarD);
        j0Var.d0(this.f8959j);
        this.f8960k = new f0(15, j0Var);
        j0Var.M = new d(qVar, j0Var, i11);
        j0Var.N = new a0(qVar, i13);
        j0Var.g0(new e(qVar, j0Var, i11));
        this.f8974y = j0Var;
    }

    public static final int e(q qVar, int i10, int i11, int i12) {
        return (i12 >= 0 || i10 == i11) ? View.MeasureSpec.makeMeasureSpec(nh.b.k(i12, i10, i11), 1073741824) : (i12 != -2 || i11 == Integer.MAX_VALUE) ? (i12 != -1 || i11 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i11, 1073741824) : View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
    }

    public static p3.b f(p3.b bVar, int i10, int i11, int i12, int i13) {
        int i14 = bVar.f16525a - i10;
        if (i14 < 0) {
            i14 = 0;
        }
        int i15 = bVar.f16526b - i11;
        if (i15 < 0) {
            i15 = 0;
        }
        int i16 = bVar.f16527c - i12;
        if (i16 < 0) {
            i16 = 0;
        }
        int i17 = bVar.f16528d - i13;
        return p3.b.b(i14, i15, i16, i17 >= 0 ? i17 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r1 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            f2.a.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return ((v) this.f8952c).getSnapshotObserver();
    }

    @Override // x0.i
    public final void a() {
        this.f8956g.b();
    }

    @Override // x0.i
    public final void b() {
        this.f8955f.b();
        removeAllViewsInLayout();
    }

    @Override // u3.f
    public final w0 c(View view, w0 w0Var) {
        this.f8965p = new w0(w0Var);
        return g(w0Var);
    }

    public final w0 g(w0 w0Var) {
        t0 t0Var = w0Var.f21343a;
        p3.b bVarG = t0Var.g(-1);
        p3.b bVar = p3.b.f16524e;
        if (!bVarG.equals(bVar) || !t0Var.h(-9).equals(bVar) || t0Var.f() != null) {
            u uVar = this.f8974y.F.f8664c;
            if (uVar.R.f9703n) {
                long jX = android.support.v4.media.session.b.X(uVar.H(0L));
                int i10 = (int) (jX >> 32);
                if (i10 < 0) {
                    i10 = 0;
                }
                int i11 = (int) (jX & 4294967295L);
                if (i11 < 0) {
                    i11 = 0;
                }
                long jK = n1.i(uVar).k();
                int i12 = (int) (jK & 4294967295L);
                long j10 = uVar.f7182c;
                long jX2 = android.support.v4.media.session.b.X(uVar.H((((long) Float.floatToRawIntBits((int) (j10 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j10 >> 32))) << 32)));
                int i13 = ((int) (jK >> 32)) - ((int) (jX2 >> 32));
                if (i13 < 0) {
                    i13 = 0;
                }
                int i14 = i12 - ((int) (jX2 & 4294967295L));
                int i15 = i14 < 0 ? 0 : i14;
                if (i10 != 0 || i11 != 0 || i13 != 0 || i15 != 0) {
                    return w0Var.f21343a.n(i10, i11, i13, i15);
                }
            }
        }
        return w0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.f8969t;
        getLocationInWindow(iArr);
        int i10 = iArr[0];
        region.op(i10, iArr[1], getWidth() + i10, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final f3.c getDensity() {
        return this.f8959j;
    }

    public final View getInteropView() {
        return this.f8951b;
    }

    public final j0 getLayoutNode() {
        return this.f8974y;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f8951b.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final x getLifecycleOwner() {
        return this.f8961l;
    }

    public final j1.q getModifier() {
        return this.f8957h;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        c0 c0Var = this.f8972w;
        return c0Var.f6309c | c0Var.f6308b;
    }

    public final ic.k getOnDensityChanged$ui_release() {
        return this.f8960k;
    }

    public final ic.k getOnModifierChanged$ui_release() {
        return this.f8958i;
    }

    public final ic.k getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.f8968s;
    }

    public final ic.a getRelease() {
        return this.f8956g;
    }

    public final ic.a getReset() {
        return this.f8955f;
    }

    public final w7.e getSavedStateRegistryOwner() {
        return this.f8962m;
    }

    public final ic.a getUpdate() {
        return this.f8953d;
    }

    public final View getView() {
        return this.f8951b;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.f8973x) {
            this.f8974y.C();
            return null;
        }
        this.f8951b.postOnAnimation(new a(0, this.f8967r));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f8951b.isNestedScrollingEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f8966q.b();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.f8973x) {
            this.f8974y.C();
        } else {
            this.f8951b.postOnAnimation(new a(0, this.f8967r));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().f8837a.b(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f8951b.layout(0, 0, i12 - i10, i13 - i11);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        View view = this.f8951b;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i10, i11);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.f8970u = i10;
        this.f8971v = i11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!this.f8951b.isNestedScrollingEnabled()) {
            return false;
        }
        hf.a0.y(this.f8950a.c(), null, null, new da.c0(z10, this, pc.f0.c(f10 * (-1.0f), f11 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        if (!this.f8951b.isNestedScrollingEnabled()) {
            return false;
        }
        hf.a0.y(this.f8950a.c(), null, null, new g0(this, pc.f0.c(f10 * (-1.0f), f11 * (-1.0f)), (yb.c) null, 2), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (Build.VERSION.SDK_INT >= 23 || i10 != 0) {
            return;
        }
        this.f8974y.C();
    }

    @Override // i2.q1
    public final boolean q() {
        return isAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        ic.k kVar = this.f8968s;
        if (kVar != null) {
            kVar.a(Boolean.valueOf(z10));
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final void setDensity(f3.c cVar) {
        if (cVar != this.f8959j) {
            this.f8959j = cVar;
            ic.k kVar = this.f8960k;
            if (kVar != null) {
                kVar.a(cVar);
            }
        }
    }

    public final void setLifecycleOwner(x xVar) {
        if (xVar != this.f8961l) {
            this.f8961l = xVar;
            m0.i(this, xVar);
        }
    }

    public final void setModifier(j1.q qVar) {
        if (qVar != this.f8957h) {
            this.f8957h = qVar;
            ic.k kVar = this.f8958i;
            if (kVar != null) {
                kVar.a(qVar);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(ic.k kVar) {
        this.f8960k = kVar;
    }

    public final void setOnModifierChanged$ui_release(ic.k kVar) {
        this.f8958i = kVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(ic.k kVar) {
        this.f8968s = kVar;
    }

    public final void setRelease(ic.a aVar) {
        this.f8956g = aVar;
    }

    public final void setReset(ic.a aVar) {
        this.f8955f = aVar;
    }

    public final void setSavedStateRegistryOwner(w7.e eVar) {
        if (eVar != this.f8962m) {
            this.f8962m = eVar;
            setTag(R.id.view_tree_saved_state_registry_owner, eVar);
        }
    }

    public final void setUpdate(ic.a aVar) {
        this.f8953d = aVar;
        this.f8954e = true;
        this.f8966q.b();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
}
