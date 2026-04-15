package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import c7.e1;
import c7.r;
import i7.j1;
import i7.p2;
import j2.x2;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import l7.a;
import m3.l;
import m7.a0;
import m7.b;
import m7.b0;
import m7.c0;
import m7.d0;
import m7.e0;
import m7.f;
import m7.g0;
import m7.h;
import m7.m;
import m7.m0;
import m7.o;
import m7.p;
import m7.q;
import m7.s;
import m7.u;
import m7.v;
import m7.x;
import m7.y;
import m7.z;
import q.t0;
import u3.d;
import u3.n;
import u3.t;
import vb.w;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static final Class[] B0;
    public static final m C0;
    public static final c0 D0;
    public EdgeEffect A;
    public EdgeEffect B;
    public EdgeEffect C;
    public EdgeEffect D;
    public q E;
    public int F;
    public int G;
    public VelocityTracker H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public final int N;
    public final int O;
    public final float P;
    public final float Q;
    public boolean R;
    public final e0 S;
    public h T;
    public final j1 U;
    public final b0 V;
    public ArrayList W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f1024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f1025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a0 f1026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e1 f1027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e1 f1028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f1029f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1030g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f1031h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Rect f1032i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public s f1033j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f1034k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f1035l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public f f1036m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1037n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1038o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1039p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1040q;
    public final l q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f1041r;
    public g0 r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1042s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public d f1043s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1044t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int[] f1045t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AccessibilityManager f1046u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int[] f1047u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f1048v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final int[] f1049v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f1050w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final ArrayList f1051w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f1052x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final r f1053x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f1054y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public p f1055z;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final int[] f1022y0 = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final float f1023z0 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean A0 = true;

    static {
        Class cls = Integer.TYPE;
        B0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        C0 = new m();
        D0 = new c0();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        float fA;
        Context context2;
        AttributeSet attributeSet2;
        TypedArray typedArray;
        int i10;
        char c3;
        int i11;
        char c10;
        Constructor constructor;
        super(context, attributeSet, com.cnl.kikoeru.R.attr.recyclerViewStyle);
        this.f1025b = new y(this);
        this.f1029f = new l();
        this.f1031h = new Rect();
        this.f1032i = new Rect();
        new RectF();
        new ArrayList();
        this.f1034k = new ArrayList();
        this.f1035l = new ArrayList();
        this.f1040q = 0;
        this.f1048v = false;
        this.f1050w = false;
        this.f1052x = 0;
        this.f1054y = 0;
        this.f1055z = D0;
        b bVar = new b();
        Object[] objArr = null;
        bVar.f14918a = null;
        bVar.f14919b = new ArrayList();
        bVar.f14920c = 250L;
        bVar.f14921d = 250L;
        bVar.f14818e = new ArrayList();
        bVar.f14819f = new ArrayList();
        bVar.f14820g = new ArrayList();
        bVar.f14821h = new ArrayList();
        bVar.f14822i = new ArrayList();
        bVar.f14823j = new ArrayList();
        bVar.f14824k = new ArrayList();
        bVar.f14825l = new ArrayList();
        bVar.f14826m = new ArrayList();
        bVar.f14827n = new ArrayList();
        bVar.f14828o = new ArrayList();
        this.E = bVar;
        this.F = 0;
        this.G = -1;
        this.P = Float.MIN_VALUE;
        this.Q = Float.MIN_VALUE;
        this.R = true;
        this.S = new e0(this);
        this.U = A0 ? new j1() : null;
        b0 b0Var = new b0();
        b0Var.f14829a = 0;
        b0Var.f14830b = false;
        b0Var.f14831c = false;
        b0Var.f14832d = false;
        b0Var.f14833e = false;
        this.V = b0Var;
        int i12 = 6;
        l lVar = new l(i12);
        this.q0 = lVar;
        this.f1045t0 = new int[2];
        this.f1047u0 = new int[2];
        this.f1049v0 = new int[2];
        this.f1051w0 = new ArrayList();
        this.f1053x0 = new r(i12, this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.M = viewConfiguration.getScaledTouchSlop();
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 26) {
            Method method = t.f21331a;
            fA = m2.b.d(viewConfiguration);
        } else {
            fA = t.a(viewConfiguration, context);
        }
        this.P = fA;
        this.Q = i13 >= 26 ? m2.b.e(viewConfiguration) : t.a(viewConfiguration, context);
        this.N = viewConfiguration.getScaledMinimumFlingVelocity();
        this.O = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1024a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.E.f14918a = lVar;
        this.f1027d = new e1(new l(5, this));
        this.f1028e = new e1(new p2(this));
        Field field = u3.s.f21328a;
        if ((i13 >= 26 ? n.a(this) : 0) == 0 && i13 >= 26) {
            n.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f1046u = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new g0(this));
        int[] iArr = a.f11873a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, com.cnl.kikoeru.R.attr.recyclerViewStyle, 0);
        if (i13 >= 29) {
            u3.p.b(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, com.cnl.kikoeru.R.attr.recyclerViewStyle, 0);
        }
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f1030g = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + m());
            }
            Resources resources = getContext().getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(com.cnl.kikoeru.R.dimen.fastscroll_default_thickness);
            c3 = 2;
            int dimensionPixelSize2 = resources.getDimensionPixelSize(com.cnl.kikoeru.R.dimen.fastscroll_minimum_range);
            int dimensionPixelOffset = resources.getDimensionPixelOffset(com.cnl.kikoeru.R.dimen.fastscroll_margin);
            attributeSet2 = attributeSet;
            typedArray = typedArrayObtainStyledAttributes;
            i10 = 4;
            i11 = com.cnl.kikoeru.R.attr.recyclerViewStyle;
            c10 = 3;
            context2 = context;
            new f(this, stateListDrawable, drawable, stateListDrawable2, drawable2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelOffset);
        } else {
            context2 = context;
            attributeSet2 = attributeSet;
            typedArray = typedArrayObtainStyledAttributes;
            i10 = 4;
            c3 = 2;
            i11 = com.cnl.kikoeru.R.attr.recyclerViewStyle;
            c10 = 3;
        }
        typedArray.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context2.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context2.getClassLoader()).asSubclass(s.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(B0);
                        Object[] objArr2 = new Object[i10];
                        objArr2[0] = context2;
                        objArr2[1] = attributeSet2;
                        objArr2[c3] = Integer.valueOf(i11);
                        objArr2[c10] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e10) {
                        try {
                            constructor = clsAsSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e11) {
                            e11.initCause(e10);
                            throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Error creating LayoutManager " + str, e11);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((s) constructor.newInstance(objArr));
                } catch (ClassCastException e12) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Class is not a LayoutManager " + str, e12);
                } catch (ClassNotFoundException e13) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Unable to find LayoutManager " + str, e13);
                } catch (IllegalAccessException e14) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Cannot access non-public constructor " + str, e14);
                } catch (InstantiationException e15) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e15);
                } catch (InvocationTargetException e16) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e16);
                }
            }
        }
        int[] iArr2 = f1022y0;
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, iArr2, com.cnl.kikoeru.R.attr.recyclerViewStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            u3.p.b(this, context2, iArr2, attributeSet2, typedArrayObtainStyledAttributes2, com.cnl.kikoeru.R.attr.recyclerViewStyle, 0);
        }
        boolean z10 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z10);
        setTag(com.cnl.kikoeru.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    public static int d(int i10, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i11) {
        if (i10 > 0 && edgeEffect != null && ud.n.l(edgeEffect) != 0.0f) {
            int iRound = Math.round(ud.n.x(edgeEffect, ((-i10) * 4.0f) / i11, 0.5f) * ((-i11) / 4.0f));
            if (iRound != i10) {
                edgeEffect.finish();
            }
            return i10 - iRound;
        }
        if (i10 >= 0 || edgeEffect2 == null || ud.n.l(edgeEffect2) == 0.0f) {
            return i10;
        }
        float f10 = i11;
        int iRound2 = Math.round(ud.n.x(edgeEffect2, (i10 * 4.0f) / f10, 0.5f) * (f10 / 4.0f));
        if (iRound2 != i10) {
            edgeEffect2.finish();
        }
        return i10 - iRound2;
    }

    private d getScrollingChildHelper() {
        if (this.f1043s0 == null) {
            this.f1043s0 = new d(this);
        }
        return this.f1043s0;
    }

    public static void p(View view) {
        if (view == null) {
            return;
        }
        ((m7.t) view.getLayoutParams()).getClass();
    }

    public final void A(int i10) {
        getScrollingChildHelper().e(i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i10, int i11) {
        s sVar = this.f1033j;
        if (sVar != null) {
            sVar.getClass();
        }
        super.addFocusables(arrayList, i10, i11);
    }

    public final void b(String str) {
        if (this.f1052x > 0) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + m());
        }
        if (this.f1054y > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + m()));
        }
    }

    public final void c(int i10, int i11) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.A;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            zIsFinished = false;
        } else {
            this.A.onRelease();
            zIsFinished = this.A.isFinished();
        }
        EdgeEffect edgeEffect2 = this.C;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.C.onRelease();
            zIsFinished |= this.C.isFinished();
        }
        EdgeEffect edgeEffect3 = this.B;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.B.onRelease();
            zIsFinished |= this.B.isFinished();
        }
        EdgeEffect edgeEffect4 = this.D;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.D.onRelease();
            zIsFinished |= this.D.isFinished();
        }
        if (zIsFinished) {
            Field field = u3.s.f21328a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof m7.t) && this.f1033j.d((m7.t) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        s sVar = this.f1033j;
        if (sVar != null && sVar.b()) {
            return this.f1033j.f(this.V);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        s sVar = this.f1033j;
        if (sVar != null && sVar.b()) {
            this.f1033j.g(this.V);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        s sVar = this.f1033j;
        if (sVar != null && sVar.b()) {
            return this.f1033j.h(this.V);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        s sVar = this.f1033j;
        if (sVar != null && sVar.c()) {
            return this.f1033j.i(this.V);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        s sVar = this.f1033j;
        if (sVar != null && sVar.c()) {
            this.f1033j.j(this.V);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        s sVar = this.f1033j;
        if (sVar != null && sVar.c()) {
            return this.f1033j.k(this.V);
        }
        return 0;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        ViewParent viewParentC;
        d scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f21280d && (viewParentC = scrollingChildHelper.c(0)) != null) {
            try {
                return viewParentC.onNestedFling(scrollingChildHelper.f21279c, f10, f11, z10);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentC + " does not implement interface method onNestedFling", e10);
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        ViewParent viewParentC;
        d scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f21280d && (viewParentC = scrollingChildHelper.c(0)) != null) {
            try {
                return viewParentC.onNestedPreFling(scrollingChildHelper.f21279c, f10, f11);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentC + " does not implement interface method onNestedPreFling", e10);
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().a(i10, i11, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().b(i10, i11, i12, i13, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        ArrayList arrayList = this.f1034k;
        int size = arrayList.size();
        boolean z11 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            f fVar = (f) arrayList.get(i10);
            if (fVar.f14857l != fVar.f14859n.getWidth() || fVar.f14858m != fVar.f14859n.getHeight()) {
                fVar.f14857l = fVar.f14859n.getWidth();
                fVar.f14858m = fVar.f14859n.getHeight();
                fVar.d(0);
            } else if (fVar.f14867v != 0) {
                if (fVar.f14860o) {
                    int i11 = fVar.f14857l;
                    int i12 = fVar.f14849d;
                    int i13 = i11 - i12;
                    int i14 = 0 - (0 / 2);
                    StateListDrawable stateListDrawable = fVar.f14847b;
                    stateListDrawable.setBounds(0, 0, i12, 0);
                    Drawable drawable = fVar.f14848c;
                    drawable.setBounds(0, 0, fVar.f14850e, fVar.f14858m);
                    RecyclerView recyclerView = fVar.f14859n;
                    Field field = u3.s.f21328a;
                    if (recyclerView.getLayoutDirection() == 1) {
                        drawable.draw(canvas);
                        canvas.translate(i12, i14);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(-1.0f, 1.0f);
                        canvas.translate(-i12, -i14);
                    } else {
                        canvas.translate(i13, 0.0f);
                        drawable.draw(canvas);
                        canvas.translate(0.0f, i14);
                        stateListDrawable.draw(canvas);
                        canvas.translate(-i13, -i14);
                    }
                }
                if (fVar.f14861p) {
                    int i15 = fVar.f14858m;
                    int i16 = fVar.f14853h;
                    int i17 = i15 - i16;
                    StateListDrawable stateListDrawable2 = fVar.f14851f;
                    stateListDrawable2.setBounds(0, 0, 0, i16);
                    Drawable drawable2 = fVar.f14852g;
                    drawable2.setBounds(0, 0, fVar.f14857l, fVar.f14854i);
                    canvas.translate(0.0f, i17);
                    drawable2.draw(canvas);
                    canvas.translate(0 - (0 / 2), 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-r8, -i17);
                }
            }
            i10++;
        }
        EdgeEffect edgeEffect = this.A;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f1030g ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.A;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.B;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f1030g) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.B;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.C;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f1030g ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.C;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.D;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f1030g) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.D;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(iSave4);
        }
        if ((z10 || this.E == null || arrayList.size() <= 0 || !this.E.b()) ? z10 : true) {
            Field field2 = u3.s.f21328a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public final void e() {
        if (!this.f1039p || this.f1048v) {
            int i10 = r3.a.f18745a;
            Trace.beginSection("RV FullInvalidate");
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            Trace.endSection();
            return;
        }
        e1 e1Var = this.f1027d;
        if (((ArrayList) e1Var.f3620d).size() > 0) {
            e1Var.getClass();
            if (((ArrayList) e1Var.f3620d).size() > 0) {
                int i11 = r3.a.f18745a;
                Trace.beginSection("RV FullInvalidate");
                Log.w("RecyclerView", "No adapter attached; skipping layout");
                Trace.endSection();
            }
        }
    }

    public final void f(int i10, int i11) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        Field field = u3.s.f21328a;
        setMeasuredDimension(s.e(i10, paddingRight, getMinimumWidth()), s.e(i11, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c4, code lost:
    
        if (r4 > 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e2, code lost:
    
        if (r7 > 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e5, code lost:
    
        if (r4 < 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e8, code lost:
    
        if (r7 < 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f1, code lost:
    
        if ((r7 * r1) <= 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00fa, code lost:
    
        if ((r7 * r1) >= 0) goto L84;
     */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r13, int r14) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final boolean g(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().a(i10, i11, i12, iArr, iArr2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        s sVar = this.f1033j;
        if (sVar != null) {
            return sVar.l();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        s sVar = this.f1033j;
        if (sVar != null) {
            return sVar.m(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public m7.n getAdapter() {
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        s sVar = this.f1033j;
        if (sVar == null) {
            return super.getBaseline();
        }
        sVar.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f1030g;
    }

    public g0 getCompatAccessibilityDelegate() {
        return this.r0;
    }

    public p getEdgeEffectFactory() {
        return this.f1055z;
    }

    public q getItemAnimator() {
        return this.E;
    }

    public int getItemDecorationCount() {
        return this.f1034k.size();
    }

    public s getLayoutManager() {
        return this.f1033j;
    }

    public int getMaxFlingVelocity() {
        return this.O;
    }

    public int getMinFlingVelocity() {
        return this.N;
    }

    public long getNanoTime() {
        if (A0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public u getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.R;
    }

    public x getRecycledViewPool() {
        return this.f1025b.a();
    }

    public int getScrollState() {
        return this.F;
    }

    public final void h(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        getScrollingChildHelper().b(0, 0, i10, i11, iArr, i12, iArr2);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().c(0) != null;
    }

    public final void i() {
        if (this.D != null) {
            return;
        }
        ((c0) this.f1055z).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.D = edgeEffect;
        if (this.f1030g) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f1037n;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f1041r;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f21280d;
    }

    public final void j() {
        if (this.A != null) {
            return;
        }
        ((c0) this.f1055z).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.A = edgeEffect;
        if (this.f1030g) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void k() {
        if (this.C != null) {
            return;
        }
        ((c0) this.f1055z).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.C = edgeEffect;
        if (this.f1030g) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void l() {
        if (this.B != null) {
            return;
        }
        ((c0) this.f1055z).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.B = edgeEffect;
        if (this.f1030g) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String m() {
        return " " + super.toString() + ", adapter:null, layout:" + this.f1033j + ", context:" + getContext();
    }

    public final View n(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            java.util.ArrayList r1 = r11.f1035l
            int r2 = r1.size()
            r3 = 0
            r4 = 0
        Lc:
            if (r4 >= r2) goto L64
            java.lang.Object r5 = r1.get(r4)
            m7.f r5 = (m7.f) r5
            int r6 = r5.f14862q
            r7 = 1
            r8 = 2
            if (r6 != r7) goto L59
            float r6 = r12.getX()
            float r9 = r12.getY()
            boolean r6 = r5.b(r6, r9)
            float r9 = r12.getX()
            float r10 = r12.getY()
            boolean r9 = r5.a(r9, r10)
            int r10 = r12.getAction()
            if (r10 != 0) goto L61
            if (r6 != 0) goto L3c
            if (r9 == 0) goto L61
        L3c:
            if (r9 == 0) goto L49
            r5.f14863r = r7
            float r6 = r12.getX()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f14856k = r6
            goto L55
        L49:
            if (r6 == 0) goto L55
            r5.f14863r = r8
            float r6 = r12.getY()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f14855j = r6
        L55:
            r5.d(r8)
            goto L5b
        L59:
            if (r6 != r8) goto L61
        L5b:
            r6 = 3
            if (r0 == r6) goto L61
            r11.f1036m = r5
            return r7
        L61:
            int r4 = r4 + 1
            goto Lc
        L64:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f1052x = r0
            r1 = 1
            r5.f1037n = r1
            boolean r2 = r5.f1039p
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            r0 = 1
        L14:
            r5.f1039p = r0
            m7.y r0 = r5.f1025b
            m7.x r0 = r0.f14940e
            m7.s r0 = r5.f1033j
            if (r0 == 0) goto L20
            r0.f14928e = r1
        L20:
            boolean r0 = androidx.recyclerview.widget.RecyclerView.A0
            if (r0 == 0) goto L73
            java.lang.ThreadLocal r0 = m7.h.f14878e
            java.lang.Object r1 = r0.get()
            m7.h r1 = (m7.h) r1
            r5.T = r1
            if (r1 != 0) goto L6c
            m7.h r1 = new m7.h
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f14880a = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f14883d = r2
            r5.T = r1
            java.lang.reflect.Field r1 = u3.s.f21328a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L5e
            if (r1 == 0) goto L5e
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L5e
            goto L60
        L5e:
            r1 = 1114636288(0x42700000, float:60.0)
        L60:
            m7.h r2 = r5.T
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f14882c = r3
            r0.set(r2)
        L6c:
            m7.h r0 = r5.T
            java.util.ArrayList r0 = r0.f14880a
            r0.add(r5)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Object obj;
        h hVar;
        super.onDetachedFromWindow();
        q qVar = this.E;
        if (qVar != null) {
            qVar.a();
        }
        int i10 = 0;
        setScrollState(0);
        e0 e0Var = this.S;
        e0Var.f14843g.removeCallbacks(e0Var);
        e0Var.f14839c.abortAnimation();
        this.f1037n = false;
        s sVar = this.f1033j;
        if (sVar != null) {
            sVar.f14928e = false;
            sVar.A(this);
        }
        this.f1051w0.clear();
        removeCallbacks(this.f1053x0);
        this.f1029f.getClass();
        do {
            b7.m mVar = m0.f14917a;
            Object[] objArr = (Object[]) mVar.f1959c;
            int i11 = mVar.f1958b;
            obj = null;
            if (i11 > 0) {
                int i12 = i11 - 1;
                Object obj2 = objArr[i12];
                jc.l.c(obj2, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
                objArr[i12] = null;
                mVar.f1958b--;
                obj = obj2;
            }
        } while (obj != null);
        y yVar = this.f1025b;
        ArrayList arrayList = yVar.f14937b;
        if (arrayList.size() > 0) {
            throw t0.A(0, arrayList);
        }
        yVar.b(false);
        while (i10 < getChildCount()) {
            int i13 = i10 + 1;
            View childAt = getChildAt(i10);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            ArrayList arrayList2 = w.o(childAt).f26378a;
            for (int iR = ud.b.r(arrayList2); -1 < iR; iR--) {
                ((x2) arrayList2.get(iR)).f10095a.d();
            }
            i10 = i13;
        }
        if (!A0 || (hVar = this.T) == null) {
            return;
        }
        hVar.f14880a.remove(this);
        this.T = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f1034k;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((f) arrayList.get(i10)).getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        if (!this.f1041r) {
            this.f1036m = null;
            if (o(motionEvent)) {
                w();
                setScrollState(0);
                return true;
            }
            s sVar = this.f1033j;
            if (sVar != null) {
                boolean zB = sVar.b();
                boolean zC = this.f1033j.c();
                if (this.H == null) {
                    this.H = VelocityTracker.obtain();
                }
                this.H.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.f1042s) {
                        this.f1042s = false;
                    }
                    this.G = motionEvent.getPointerId(0);
                    int x3 = (int) (motionEvent.getX() + 0.5f);
                    this.K = x3;
                    this.I = x3;
                    int y5 = (int) (motionEvent.getY() + 0.5f);
                    this.L = y5;
                    this.J = y5;
                    EdgeEffect edgeEffect = this.A;
                    if (edgeEffect == null || ud.n.l(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z10 = false;
                    } else {
                        ud.n.x(this.A, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z10 = true;
                    }
                    EdgeEffect edgeEffect2 = this.C;
                    if (edgeEffect2 != null && ud.n.l(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                        ud.n.x(this.C, 0.0f, motionEvent.getY() / getHeight());
                        z10 = true;
                    }
                    EdgeEffect edgeEffect3 = this.B;
                    if (edgeEffect3 != null && ud.n.l(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                        ud.n.x(this.B, 0.0f, motionEvent.getX() / getWidth());
                        z10 = true;
                    }
                    EdgeEffect edgeEffect4 = this.D;
                    if (edgeEffect4 != null && ud.n.l(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                        ud.n.x(this.D, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z10 = true;
                    }
                    if (z10 || this.F == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        A(1);
                    }
                    int[] iArr = this.f1047u0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i10 = zB;
                    if (zC) {
                        i10 = (zB ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().d(i10, 0);
                } else if (actionMasked == 1) {
                    this.H.clear();
                    A(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.G);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.G + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x10 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y7 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.F != 1) {
                        int i11 = x10 - this.I;
                        int i12 = y7 - this.J;
                        if (!zB || Math.abs(i11) <= this.M) {
                            z11 = false;
                        } else {
                            this.K = x10;
                            z11 = true;
                        }
                        if (zC && Math.abs(i12) > this.M) {
                            this.L = y7;
                            z11 = true;
                        }
                        if (z11) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    w();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.G = motionEvent.getPointerId(actionIndex);
                    int x11 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.K = x11;
                    this.I = x11;
                    int y10 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.L = y10;
                    this.J = y10;
                } else if (actionMasked == 6) {
                    s(motionEvent);
                }
                if (this.F == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = r3.a.f18745a;
        Trace.beginSection("RV OnLayout");
        Log.w("RecyclerView", "No adapter attached; skipping layout");
        Trace.endSection();
        this.f1039p = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        s sVar = this.f1033j;
        if (sVar == null) {
            f(i10, i11);
            return;
        }
        if (sVar.y()) {
            View.MeasureSpec.getMode(i10);
            View.MeasureSpec.getMode(i11);
            this.f1033j.f14925b.f(i10, i11);
        } else {
            if (this.f1038o) {
                this.f1033j.f14925b.f(i10, i11);
                return;
            }
            b0 b0Var = this.V;
            if (b0Var.f14833e) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            b0Var.getClass();
            this.f1040q++;
            this.f1033j.f14925b.f(i10, i11);
            if (this.f1040q < 1) {
                this.f1040q = 1;
            }
            this.f1040q--;
            b0Var.f14831c = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (this.f1052x > 0) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a0 a0Var = (a0) parcelable;
        this.f1026c = a0Var;
        super.onRestoreInstanceState(a0Var.f200a);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        a0 a0Var = new a0(super.onSaveInstanceState());
        a0 a0Var2 = this.f1026c;
        if (a0Var2 != null) {
            a0Var.f14817c = a0Var2.f14817c;
            return a0Var;
        }
        s sVar = this.f1033j;
        if (sVar != null) {
            a0Var.f14817c = sVar.D();
            return a0Var;
        }
        a0Var.f14817c = null;
        return a0Var;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        this.D = null;
        this.B = null;
        this.C = null;
        this.A = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0389 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f5 A[PHI: r1
      0x01f5: PHI (r1v59 int) = (r1v43 int), (r1v63 int) binds: [B:90:0x01de, B:94:0x01f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instruction units count: 1043
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean q() {
        return !this.f1039p || this.f1048v || ((ArrayList) this.f1027d.f3620d).size() > 0;
    }

    public final void r() {
        int iF = this.f1028e.F();
        for (int i10 = 0; i10 < iF; i10++) {
            ((m7.t) this.f1028e.E(i10).getLayoutParams()).f14932b = true;
        }
        ArrayList arrayList = this.f1025b.f14937b;
        if (arrayList.size() > 0) {
            throw t0.A(0, arrayList);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z10) {
        p(view);
        view.clearAnimation();
        p(view);
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.f1033j.getClass();
        if (this.f1052x <= 0 && view2 != null) {
            v(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.f1033j.H(this, view, rect, z10, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        ArrayList arrayList = this.f1035l;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((f) arrayList.get(i10)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f1040q != 0 || this.f1041r) {
            return;
        }
        super.requestLayout();
    }

    public final void s(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.G) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.G = motionEvent.getPointerId(i10);
            int x3 = (int) (motionEvent.getX(i10) + 0.5f);
            this.K = x3;
            this.I = x3;
            int y5 = (int) (motionEvent.getY(i10) + 0.5f);
            this.L = y5;
            this.J = y5;
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i10, int i11) {
        s sVar = this.f1033j;
        if (sVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f1041r) {
            return;
        }
        boolean zB = sVar.b();
        boolean zC = this.f1033j.c();
        if (zB || zC) {
            if (!zB) {
                i10 = 0;
            }
            if (!zC) {
                i11 = 0;
            }
            x(i10, i11, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (this.f1052x <= 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f1044t |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(g0 g0Var) {
        this.r0 = g0Var;
        u3.s.b(this, g0Var);
    }

    public void setAdapter(m7.n nVar) {
        setLayoutFrozen(false);
        q qVar = this.E;
        if (qVar != null) {
            qVar.a();
        }
        s sVar = this.f1033j;
        y yVar = this.f1025b;
        if (sVar != null) {
            sVar.F();
            this.f1033j.G(yVar);
        }
        yVar.f14936a.clear();
        yVar.c();
        e1 e1Var = this.f1027d;
        e1Var.T((ArrayList) e1Var.f3620d);
        e1Var.T((ArrayList) e1Var.f3619c);
        s sVar2 = this.f1033j;
        if (sVar2 != null) {
            sVar2.z();
        }
        yVar.f14936a.clear();
        yVar.c();
        yVar.b(true);
        x xVarA = yVar.a();
        if (xVarA.f14934b == 0) {
            SparseArray sparseArray = xVarA.f14933a;
            if (sparseArray.size() > 0) {
                ((m7.w) sparseArray.valueAt(0)).getClass();
                throw null;
            }
        }
        this.V.f14830b = true;
        this.f1050w = this.f1050w;
        this.f1048v = true;
        int iF = this.f1028e.F();
        for (int i10 = 0; i10 < iF; i10++) {
            p(this.f1028e.E(i10));
        }
        r();
        ArrayList arrayList = yVar.f14937b;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (arrayList.get(i11) != null) {
                throw new ClassCastException();
            }
        }
        yVar.c();
        requestLayout();
    }

    public void setChildDrawingOrderCallback(o oVar) {
        if (oVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.f1030g) {
            this.D = null;
            this.B = null;
            this.C = null;
            this.A = null;
        }
        this.f1030g = z10;
        super.setClipToPadding(z10);
        if (this.f1039p) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(p pVar) {
        pVar.getClass();
        this.f1055z = pVar;
        this.D = null;
        this.B = null;
        this.C = null;
        this.A = null;
    }

    public void setHasFixedSize(boolean z10) {
        this.f1038o = z10;
    }

    public void setItemAnimator(q qVar) {
        q qVar2 = this.E;
        if (qVar2 != null) {
            qVar2.a();
            this.E.f14918a = null;
        }
        this.E = qVar;
        if (qVar != null) {
            qVar.f14918a = this.q0;
        }
    }

    public void setItemViewCacheSize(int i10) {
        y yVar = this.f1025b;
        yVar.f14938c = i10;
        yVar.e();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(s sVar) {
        if (sVar == this.f1033j) {
            return;
        }
        setScrollState(0);
        e0 e0Var = this.S;
        e0Var.f14843g.removeCallbacks(e0Var);
        e0Var.f14839c.abortAnimation();
        s sVar2 = this.f1033j;
        y yVar = this.f1025b;
        if (sVar2 != null) {
            q qVar = this.E;
            if (qVar != null) {
                qVar.a();
            }
            this.f1033j.F();
            this.f1033j.G(yVar);
            yVar.f14936a.clear();
            yVar.c();
            if (this.f1037n) {
                s sVar3 = this.f1033j;
                sVar3.f14928e = false;
                sVar3.A(this);
            }
            this.f1033j.J(null);
            this.f1033j = null;
        } else {
            yVar.f14936a.clear();
            yVar.c();
        }
        e1 e1Var = this.f1028e;
        p2 p2Var = (p2) e1Var.f3618b;
        ((bh.a) e1Var.f3619c).E();
        ArrayList arrayList = (ArrayList) e1Var.f3620d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            p((View) arrayList.get(size));
            arrayList.remove(size);
        }
        RecyclerView recyclerView = (RecyclerView) p2Var.f9258a;
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            p(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f1033j = sVar;
        if (sVar != null) {
            if (sVar.f14925b != null) {
                throw new IllegalArgumentException("LayoutManager " + sVar + " is already attached to a RecyclerView:" + sVar.f14925b.m());
            }
            sVar.J(this);
            if (this.f1037n) {
                this.f1033j.f14928e = true;
            }
        }
        yVar.e();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        d scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f21280d) {
            RecyclerView recyclerView = scrollingChildHelper.f21279c;
            Field field = u3.s.f21328a;
            u3.l.d(recyclerView);
        }
        scrollingChildHelper.f21280d = z10;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.R = z10;
    }

    public void setRecycledViewPool(x xVar) {
        y yVar = this.f1025b;
        RecyclerView recyclerView = yVar.f14941f;
        yVar.b(false);
        if (yVar.f14940e != null) {
            r2.f14934b--;
        }
        yVar.f14940e = xVar;
        if (xVar != null) {
            recyclerView.getAdapter();
        }
    }

    public void setScrollState(int i10) {
        if (i10 == this.F) {
            return;
        }
        this.F = i10;
        if (i10 != 2) {
            e0 e0Var = this.S;
            e0Var.f14843g.removeCallbacks(e0Var);
            e0Var.f14839c.abortAnimation();
        }
        s sVar = this.f1033j;
        if (sVar != null) {
            sVar.E(i10);
        }
        ArrayList arrayList = this.W;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((v) this.W.get(size)).getClass();
            }
        }
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 == 1) {
                this.M = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
        }
        this.M = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(d0 d0Var) {
        this.f1025b.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().d(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().e(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        if (z10 != this.f1041r) {
            b("Do not suppressLayout in layout or scroll");
            if (!z10) {
                this.f1041r = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f1041r = true;
            this.f1042s = true;
            setScrollState(0);
            e0 e0Var = this.S;
            e0Var.f14843g.removeCallbacks(e0Var);
            e0Var.f14839c.abortAnimation();
        }
    }

    public final int t(float f10, int i10) {
        float height = f10 / getHeight();
        float width = i10 / getWidth();
        EdgeEffect edgeEffect = this.A;
        float f11 = 0.0f;
        if (edgeEffect == null || ud.n.l(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.C;
            if (edgeEffect2 != null && ud.n.l(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.C.onRelease();
                } else {
                    float fX = ud.n.x(this.C, width, height);
                    if (ud.n.l(this.C) == 0.0f) {
                        this.C.onRelease();
                    }
                    f11 = fX;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.A.onRelease();
            } else {
                float f12 = -ud.n.x(this.A, -width, 1.0f - height);
                if (ud.n.l(this.A) == 0.0f) {
                    this.A.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getWidth());
    }

    public final int u(float f10, int i10) {
        float width = f10 / getWidth();
        float height = i10 / getHeight();
        EdgeEffect edgeEffect = this.B;
        float f11 = 0.0f;
        if (edgeEffect == null || ud.n.l(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.D;
            if (edgeEffect2 != null && ud.n.l(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.D.onRelease();
                } else {
                    float fX = ud.n.x(this.D, height, 1.0f - width);
                    if (ud.n.l(this.D) == 0.0f) {
                        this.D.onRelease();
                    }
                    f11 = fX;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.B.onRelease();
            } else {
                float f12 = -ud.n.x(this.B, -height, width);
                if (ud.n.l(this.B) == 0.0f) {
                    this.B.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getHeight());
    }

    public final void v(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f1031h;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof m7.t) {
            m7.t tVar = (m7.t) layoutParams;
            if (!tVar.f14932b) {
                Rect rect2 = tVar.f14931a;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f1033j.H(this, view, this.f1031h, !this.f1039p, view2 == null);
    }

    public final void w() {
        VelocityTracker velocityTracker = this.H;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        A(0);
        EdgeEffect edgeEffect = this.A;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.A.isFinished();
        }
        EdgeEffect edgeEffect2 = this.B;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.B.isFinished();
        }
        EdgeEffect edgeEffect3 = this.C;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.C.isFinished();
        }
        EdgeEffect edgeEffect4 = this.D;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.D.isFinished();
        }
        if (zIsFinished) {
            Field field = u3.s.f21328a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean x(int r12, int r13, android.view.MotionEvent r14, int r15) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.x(int, int, android.view.MotionEvent, int):boolean");
    }

    public final boolean y(EdgeEffect edgeEffect, int i10, int i11) {
        if (i10 > 0) {
            return true;
        }
        float fL = ud.n.l(edgeEffect) * i11;
        float fAbs = Math.abs(-i10) * 0.35f;
        float f10 = this.f1024a * 0.015f;
        double dLog = Math.log(fAbs / f10);
        double d10 = f1023z0;
        return ((float) (Math.exp((d10 / (d10 - 1.0d)) * dLog) * ((double) f10))) < fL;
    }

    public final void z(int i10, int i11, boolean z10) {
        s sVar = this.f1033j;
        if (sVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f1041r) {
            return;
        }
        int i12 = !sVar.b() ? 0 : i10;
        int i13 = !this.f1033j.c() ? 0 : i11;
        if (i12 == 0 && i13 == 0) {
            return;
        }
        if (z10) {
            int i14 = i12 != 0 ? 1 : 0;
            if (i13 != 0) {
                i14 |= 2;
            }
            getScrollingChildHelper().d(i14, 1);
        }
        e0 e0Var = this.S;
        RecyclerView recyclerView = e0Var.f14843g;
        int iAbs = Math.abs(i12);
        int iAbs2 = Math.abs(i13);
        boolean z11 = iAbs > iAbs2;
        int width = z11 ? recyclerView.getWidth() : recyclerView.getHeight();
        if (!z11) {
            iAbs = iAbs2;
        }
        int iMin = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        Interpolator interpolator = e0Var.f14840d;
        m mVar = C0;
        if (interpolator != mVar) {
            e0Var.f14840d = mVar;
            e0Var.f14839c = new OverScroller(recyclerView.getContext(), mVar);
        }
        e0Var.f14838b = 0;
        e0Var.f14837a = 0;
        recyclerView.setScrollState(2);
        e0Var.f14839c.startScroll(0, 0, i12, i13, iMin);
        if (Build.VERSION.SDK_INT < 23) {
            e0Var.f14839c.computeScrollOffset();
        }
        if (e0Var.f14841e) {
            e0Var.f14842f = true;
            return;
        }
        RecyclerView recyclerView2 = e0Var.f14843g;
        recyclerView2.removeCallbacks(e0Var);
        Field field = u3.s.f21328a;
        recyclerView2.postOnAnimation(e0Var);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        s sVar = this.f1033j;
        if (sVar != null) {
            return sVar.n(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m());
    }

    public void setOnFlingListener(u uVar) {
    }

    @Deprecated
    public void setOnScrollListener(v vVar) {
    }

    @Deprecated
    public void setRecyclerListener(z zVar) {
    }
}
