package j2;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.cnl.kikoeru.R;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f9707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IBinder f9708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o3 f9709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x0.r f9710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a0.o f9711e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9712f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9713g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9714h;

    public a(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        y yVar = new y(1, this);
        addOnAttachStateChangeListener(yVar);
        x2 x2Var = new x2(this);
        vb.w.o(this).f26378a.add(x2Var);
        this.f9711e = new a0.o(this, yVar, x2Var, 4);
    }

    private final void setParentContext(x0.r rVar) {
        if (this.f9710d != rVar) {
            this.f9710d = rVar;
            if (rVar != null) {
                this.f9707a = null;
            }
            o3 o3Var = this.f9709c;
            if (o3Var != null) {
                o3Var.a();
                this.f9709c = null;
                if (isAttachedToWindow()) {
                    e();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f9708b != iBinder) {
            this.f9708b = iBinder;
            this.f9707a = null;
        }
    }

    public abstract void a(int i10, x0.o oVar);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        b();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        b();
        return super.addViewInLayout(view, i10, layoutParams);
    }

    public final void b() {
        if (this.f9713g) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void d() {
        o3 o3Var = this.f9709c;
        if (o3Var != null) {
            o3Var.a();
        }
        this.f9709c = null;
        requestLayout();
    }

    public final void e() {
        if (this.f9709c == null) {
            try {
                this.f9713g = true;
                this.f9709c = p3.a(this, h(), new f1.f(new cg.d(9, this), -656146368, true));
            } finally {
                this.f9713g = false;
            }
        }
    }

    public void f(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i12 - i10) - getPaddingRight(), (i13 - i11) - getPaddingBottom());
        }
    }

    public void g(int i10, int i11) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i10, i11);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i10)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i11) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i11)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    public final boolean getHasComposition() {
        return this.f9709c != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f9712f;
    }

    public final x0.r h() {
        x0.t1 t1Var;
        yb.h hVar;
        v0 v0Var;
        x0.r rVarB = this.f9710d;
        if (rVarB == null) {
            rVarB = l3.b(this);
            if (rVarB == null) {
                Object parent = getParent();
                while (rVarB == null && (parent instanceof View)) {
                    View view = (View) parent;
                    rVarB = l3.b(view);
                    parent = view.getParent();
                }
            }
            boolean z10 = false;
            if (rVarB != null) {
                x0.r rVar = (!(rVarB instanceof x0.t1) || ((x0.q1) ((x0.t1) rVarB).f24486t.getValue()).compareTo(x0.q1.f24428b) > 0) ? rVarB : null;
                if (rVar != null) {
                    this.f9707a = new WeakReference(rVar);
                }
            } else {
                rVarB = null;
            }
            if (rVarB == null) {
                WeakReference weakReference = this.f9707a;
                if (weakReference == null || (rVarB = (x0.r) weakReference.get()) == null || ((rVarB instanceof x0.t1) && ((x0.q1) ((x0.t1) rVarB).f24486t.getValue()).compareTo(x0.q1.f24428b) <= 0)) {
                    rVarB = null;
                }
                if (rVarB == null) {
                    if (!isAttachedToWindow()) {
                        f2.a.b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    View view2 = this;
                    Object parent2 = getParent();
                    while (parent2 instanceof View) {
                        View view3 = (View) parent2;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        parent2 = view3.getParent();
                    }
                    x0.r rVarB2 = l3.b(view2);
                    if (rVarB2 == null) {
                        ((f3) g3.f9819a.get()).getClass();
                        yb.h hVar2 = yb.i.f26088a;
                        ub.p pVar = t0.f9992m;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            hVar = (yb.h) t0.f9992m.getValue();
                        } else {
                            hVar = (yb.h) t0.f9993n.get();
                            if (hVar == null) {
                                throw new IllegalStateException("no AndroidUiDispatcher for this thread");
                            }
                        }
                        yb.h hVarG = hVar.G(hVar2);
                        x0.s0 s0Var = (x0.s0) hVarG.R(x0.r0.f24435b);
                        if (s0Var != null) {
                            v0Var = new v0(s0Var);
                            b5.d0 d0Var = (b5.d0) v0Var.f10063c;
                            synchronized (d0Var.f1521b) {
                                d0Var.f1520a = false;
                            }
                        } else {
                            v0Var = null;
                        }
                        jc.y yVar = new jc.y();
                        yb.h b2Var = (j1.r) hVarG.R(j1.c.f9677p);
                        if (b2Var == null) {
                            b2Var = new b2();
                            yVar.f10838a = b2Var;
                        }
                        if (v0Var != null) {
                            hVar2 = v0Var;
                        }
                        yb.h hVarG2 = hVarG.G(hVar2).G(b2Var);
                        t1Var = new x0.t1(hVarG2);
                        t1Var.C();
                        nf.d dVarB = hf.a0.b(hVarG2);
                        androidx.lifecycle.x xVarD = androidx.lifecycle.m0.d(view2);
                        androidx.lifecycle.q qVarF = xVarD != null ? xVarD.f() : null;
                        if (qVarF == null) {
                            f2.a.c("ViewTreeLifecycleOwner not found from " + view2);
                            throw new ce.j0();
                        }
                        view2.addOnAttachStateChangeListener(new h3(view2, t1Var));
                        qVarF.W0(new j3(dVarB, v0Var, t1Var, yVar, view2));
                        view2.setTag(R.id.androidx_compose_ui_view_composition_context, t1Var);
                        hf.y0 y0Var = hf.y0.f8612a;
                        Handler handler = view2.getHandler();
                        int i10 = jf.e.f10873a;
                        view2.addOnAttachStateChangeListener(new y(2, hf.a0.y(y0Var, new jf.d(handler, "windowRecomposer cleanup", false).f10872f, null, new ba.u0(t1Var, view2, z10 ? 1 : 0, 22), 2)));
                    } else {
                        if (!(rVarB2 instanceof x0.t1)) {
                            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
                        }
                        t1Var = (x0.t1) rVarB2;
                    }
                    x0.t1 t1Var2 = ((x0.q1) t1Var.f24486t.getValue()).compareTo(x0.q1.f24428b) > 0 ? t1Var : null;
                    if (t1Var2 != null) {
                        this.f9707a = new WeakReference(t1Var2);
                    }
                    return t1Var;
                }
            }
        }
        return rVarB;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.f9714h || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            e();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        f(z10, i10, i11, i12, i13);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        e();
        g(i10, i11);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i10);
        }
    }

    public final void setParentCompositionContext(x0.r rVar) {
        setParentContext(rVar);
    }

    public final void setShowLayoutBounds(boolean z10) {
        this.f9712f = z10;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((v) ((i2.p1) childAt)).setShowLayoutBounds(z10);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z10) {
        super.setTransitionGroup(z10);
        this.f9714h = true;
    }

    public final void setViewCompositionStrategy(y2 y2Var) {
        a0.o oVar = this.f9711e;
        if (oVar != null) {
            oVar.b();
        }
        ((l0) y2Var).getClass();
        y yVar = new y(1, this);
        addOnAttachStateChangeListener(yVar);
        x2 x2Var = new x2(this);
        vb.w.o(this).f26378a.add(x2Var);
        this.f9711e = new a0.o(this, yVar, x2Var, 4);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10) {
        b();
        super.addView(view, i10);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        b();
        return super.addViewInLayout(view, i10, layoutParams, z10);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, int i11) {
        b();
        super.addView(view, i10, i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, i10, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
