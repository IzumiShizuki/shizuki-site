package j2;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.os.StrictMode;
import android.os.Trace;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import com.cnl.kikoeru.R;
import j1.p;
import j2.b1;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v extends ViewGroup implements i2.p1, i2.x1, c2.h, androidx.lifecycle.f, i2.n1 {
    public static Class Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static Method f10023a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static Method f10024b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final o.g0 f10025c1 = new o.g0();

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static m f10026d1;
    public boolean A;
    public final AtomicReference A0;
    public final c2.i B;
    public final n1 B0;
    public final a0.v C;
    public final x1 C0;
    public ic.k D;
    public final x0.e1 D0;
    public final b0.w1 E;
    public int E0;
    public final k1.b F;
    public final x0.e1 F0;
    public boolean G;
    public final m1 G0;
    public final i H;
    public final z1.c H0;
    public final h I;
    public final h2.d I0;
    public final i2.r1 J;
    public final r0 J0;
    public boolean K;
    public MotionEvent K0;
    public y0 L;
    public long L0;
    public r1 M;
    public final androidx.media3.exoplayer.offline.u M0;
    public f3.a N;
    public final o.g0 N0;
    public boolean O;
    public float O0;
    public final i2.x0 P;
    public float P0;
    public long Q;
    public final c7.r Q0;
    public final int[] R;
    public final a9.m R0;
    public final float[] S;
    public boolean S0;
    public final float[] T;
    public final t T0;
    public final float[] U;
    public final c1 U0;
    public long V;
    public boolean V0;
    public boolean W;
    public final i7.p2 W0;
    public View X0;
    public final s Y0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f10027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i2.l0 f10029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x0.e1 f10030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f10031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f10032f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o1.k f10033g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public yb.h f10034h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m1.a f10035i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a2 f10036j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final q1.p f10037k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x0 f10038l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g2.x f10039m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i2.j0 f10040n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final o.y f10041o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r2.b f10042p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v f10043q;
    public long q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q2.q f10044r;
    public boolean r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d0 f10045s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final x0.e1 f10046s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public l1.c f10047t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final x0.c0 f10048t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final g f10049u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public ic.k f10050u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final q1.e f10051v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final j f10052v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final k1.k f10053w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final k f10054w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList f10055x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final l f10056x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayList f10057y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final y2.b0 f10058y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f10059z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final y2.z f10060z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v33, types: [j2.j] */
    /* JADX WARN: Type inference failed for: r1v34, types: [j2.k] */
    /* JADX WARN: Type inference failed for: r1v35, types: [j2.l] */
    public v(Context context, yb.h hVar) {
        k1.b bVar;
        super(context);
        final v vVar = this;
        vVar.f10027a = 9205357640488583168L;
        int i10 = 1;
        vVar.f10028b = true;
        vVar.f10029c = new i2.l0();
        f3.e eVarC = lc.b.c(context);
        x0.r0 r0Var = x0.r0.f24437d;
        vVar.f10030d = new x0.e1(eVarC, r0Var);
        int i11 = Build.VERSION.SDK_INT;
        int i12 = 0;
        boolean z10 = i11 >= 35;
        vVar.f10032f = z10;
        q2.d dVar = new q2.d();
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(dVar);
        i2.a1 a1Var = new i2.a1() { // from class: androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1
            public final boolean equals(Object obj) {
                return obj == this;
            }

            @Override // i2.a1
            public final p h() {
                b1 b1Var = new b1();
                b1Var.f9730o = this.f719a;
                return b1Var;
            }

            public final int hashCode() {
                return this.f719a.hashCode();
            }

            @Override // i2.a1
            public final void l(p pVar) {
                ((b1) pVar).f9730o = this.f719a;
            }
        };
        vVar.f10033g = new o1.k(vVar, vVar);
        vVar.f10034h = hVar;
        vVar.f10035i = new m1.a();
        vVar.f10036j = new a2();
        j1.q qVarA = androidx.compose.ui.input.key.a.a(j1.n.f9689a, new r(vVar, i12));
        j1.q qVarA2 = androidx.compose.ui.input.rotary.a.a();
        vVar.f10037k = new q1.p();
        vVar.f10038l = new x0(ViewConfiguration.get(context));
        g2.x xVar = new g2.x();
        vVar.f10039m = xVar;
        i2.j0 j0Var = new i2.j0(3);
        j0Var.g0(g2.j1.f7216b);
        j0Var.d0(vVar.getDensity());
        j0Var.i0(vVar.getViewConfiguration());
        j0Var.h0(a0.c.r((i2.a1) androidx.compose.ui.layout.b.b(xVar), emptySemanticsElement).e(qVarA2).e(qVarA).e(((o1.k) vVar.getFocusOwner()).f16101e).e(vVar.m4getDragAndDropManager().f14021c).e(a1Var));
        vVar.f10040n = j0Var;
        o.y yVar = o.n.f16024a;
        vVar.f10041o = new o.y();
        vVar.getLayoutNodes();
        vVar.f10042p = new r2.b();
        vVar.f10043q = vVar;
        vVar.f10044r = new q2.q(vVar.getRoot(), dVar, vVar.getLayoutNodes());
        d0 d0Var = new d0(vVar);
        vVar.f10045s = d0Var;
        vVar.f10047t = new l1.c(vVar, new d.i0(0, vVar, l0.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1, 0, 5));
        g gVar = new g();
        Object systemService = context.getSystemService("accessibility");
        jc.l.c(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        vVar.f10049u = gVar;
        vVar.f10051v = new q1.e(vVar);
        vVar.f10053w = new k1.k();
        vVar.f10055x = new ArrayList();
        vVar.B = new c2.i();
        i2.j0 root = vVar.getRoot();
        a0.v vVar2 = new a0.v();
        vVar2.f153b = root;
        vVar2.f154c = new c2.d(root.F.f8664c);
        vVar2.f155d = new b0.c1(6);
        vVar2.f156e = new i2.s();
        vVar.C = vVar2;
        vVar.D = p.f9949c;
        vVar.E = e() ? new b0.w1(vVar, vVar.getAutofillTree()) : null;
        if (e()) {
            AutofillManager autofillManagerI = b7.l.i(context.getSystemService(b7.l.m()));
            if (autofillManagerI == null) {
                throw h0.g("Autofill service could not be located.");
            }
            vVar = this;
            bVar = new k1.b(new i7.p2(autofillManagerI), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        } else {
            bVar = null;
        }
        vVar.F = bVar;
        vVar.H = new i(context);
        vVar.I = new h(vVar.getClipboardManager());
        vVar.J = new i2.r1(new r(vVar, i10));
        vVar.P = new i2.x0(vVar.getRoot());
        long j10 = Integer.MAX_VALUE;
        vVar.Q = (j10 & 4294967295L) | (j10 << 32);
        vVar.R = new int[]{0, 0};
        float[] fArrA = q1.a0.a();
        vVar.S = fArrA;
        vVar.T = q1.a0.a();
        vVar.U = q1.a0.a();
        vVar.V = -1L;
        vVar.q0 = 9187343241974906880L;
        vVar.r0 = true;
        vVar.f10046s0 = x0.v.v(null);
        vVar.f10048t0 = x0.v.o(new t(vVar, i10));
        vVar.f10052v0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: j2.j
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f9834a.P();
            }
        };
        vVar.f10054w0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: j2.k
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                this.f9843a.P();
            }
        };
        vVar.f10056x0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: j2.l
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z11) {
                this.f9857a.H0.f26377a.setValue(new z1.a(z11 ? 1 : 2));
            }
        };
        y2.b0 b0Var = new y2.b0(vVar.getView(), vVar);
        vVar.f10058y0 = b0Var;
        vVar.f10060z0 = new y2.z(b0Var);
        vVar.A0 = new AtomicReference(null);
        vVar.B0 = new n1(vVar.getTextInputService());
        vVar.C0 = new x1();
        vVar.D0 = new x0.e1(vb.w.f(context), r0Var);
        vVar.E0 = i11 >= 31 ? context.getResources().getConfiguration().fontWeightAdjustment : 0;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        f3.m mVar = f3.m.f6667a;
        f3.m mVar2 = layoutDirection != 0 ? layoutDirection != 1 ? null : f3.m.f6668b : mVar;
        vVar.F0 = x0.v.v(mVar2 != null ? mVar2 : mVar);
        vVar.G0 = new m1(vVar, 1);
        vVar.H0 = new z1.c(vVar.isInTouchMode() ? 1 : 2);
        vVar.I0 = new h2.d(vVar);
        vVar.J0 = new r0(vVar);
        vVar.M0 = new androidx.media3.exoplayer.offline.u(27);
        vVar.N0 = new o.g0();
        vVar.Q0 = new c7.r(4, vVar);
        vVar.R0 = new a9.m(15, vVar);
        vVar.T0 = new t(vVar, 0);
        vVar.U0 = i11 < 29 ? new d1(fArrA) : new e1();
        vVar.addOnAttachStateChangeListener(vVar.f10047t);
        vVar.setWillNotDraw(false);
        vVar.setFocusable(true);
        if (i11 >= 26) {
            k0.f9844a.a(vVar, 1, false);
        }
        vVar.setFocusableInTouchMode(true);
        vVar.setClipChildren(false);
        u3.s.b(vVar, d0Var);
        vVar.setOnDragListener(vVar.m4getDragAndDropManager());
        vVar.getRoot().d(vVar);
        if (i11 >= 29) {
            f0.f9812a.a(vVar);
        }
        if (z10) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            vVar.f10031e = view;
            vVar.addView(view, -1);
        }
        vVar.W0 = i11 >= 31 ? new i7.p2(21, false) : null;
        vVar.Y0 = new s(vVar);
    }

    public static final void a(v vVar, int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iD;
        d0 d0Var = vVar.f10045s;
        if (jc.l.a(str, d0Var.G)) {
            int iD2 = d0Var.E.d(i10);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        if (!jc.l.a(str, d0Var.H) || (iD = d0Var.F.d(i10)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iD);
    }

    public static boolean e() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static void f(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof v) {
                ((v) childAt).B();
            } else if (childAt instanceof ViewGroup) {
                f((ViewGroup) childAt);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n get_viewTreeOwners() {
        return (n) this.f10046s0.getValue();
    }

    public static long h(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            return (((long) 0) << 32) | ((long) size);
        }
        if (mode == 0) {
            return (((long) 0) << 32) | ((long) Integer.MAX_VALUE);
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j10 = size;
        return j10 | (j10 << 32);
    }

    public static View l(View view, int i10) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (jc.l.a(declaredMethod.invoke(view, null), Integer.valueOf(i10))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View viewL = l(viewGroup.getChildAt(i11), i10);
                    if (viewL != null) {
                        return viewL;
                    }
                }
            }
        }
        return null;
    }

    public static void r(i2.j0 j0Var) {
        j0Var.D();
        z0.e eVarZ = j0Var.z();
        Object[] objArr = eVarZ.f26372a;
        int i10 = eVarZ.f26374c;
        for (int i11 = 0; i11 < i10; i11++) {
            r((i2.j0) objArr[i11]);
        }
    }

    private void setDensity(f3.c cVar) {
        this.f10030d.setValue(cVar);
    }

    private void setFontFamilyResolver(x2.d dVar) {
        this.D0.setValue(dVar);
    }

    private void setLayoutDirection(f3.m mVar) {
        this.F0.setValue(mVar);
    }

    private final void set_viewTreeOwners(n nVar) {
        this.f10046s0.setValue(nVar);
    }

    public static boolean t(MotionEvent motionEvent) {
        boolean z10 = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z10) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i10 = 1; i10 < pointerCount; i10++) {
                z10 = (Float.floatToRawIntBits(motionEvent.getX(i10)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i10)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !c2.f9763a.a(motionEvent, i10));
                if (z10) {
                    break;
                }
            }
        }
        return z10;
    }

    public final void A(i2.o1 o1Var, boolean z10) {
        ArrayList arrayList = this.f10055x;
        if (!z10) {
            if (this.f10059z) {
                return;
            }
            arrayList.remove(o1Var);
            ArrayList arrayList2 = this.f10057y;
            if (arrayList2 != null) {
                arrayList2.remove(o1Var);
                return;
            }
            return;
        }
        if (!this.f10059z) {
            arrayList.add(o1Var);
            return;
        }
        ArrayList arrayList3 = this.f10057y;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            this.f10057y = arrayList3;
        }
        arrayList3.add(o1Var);
    }

    public final void B() {
        k1.b bVar;
        if (this.G) {
            h1.y yVar = getSnapshotObserver().f8837a;
            synchronized (yVar.f8095g) {
                try {
                    z0.e eVar = yVar.f8094f;
                    int i10 = eVar.f26374c;
                    int i11 = 0;
                    for (int i12 = 0; i12 < i10; i12++) {
                        h1.x xVar = (h1.x) eVar.f26372a[i12];
                        xVar.e();
                        if (!xVar.f8082f.j()) {
                            i11++;
                        } else if (i11 > 0) {
                            Object[] objArr = eVar.f26372a;
                            objArr[i12 - i11] = objArr[i12];
                        }
                    }
                    int i13 = i10 - i11;
                    vb.l.p0(i13, i10, eVar.f26372a);
                    eVar.f26374c = i13;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.G = false;
        }
        y0 y0Var = this.L;
        if (y0Var != null) {
            f(y0Var);
        }
        if (e() && (bVar = this.F) != null) {
            o.z zVar = bVar.f10990h;
            if (zVar.f16076d == 0 && bVar.f10991i) {
                ((AutofillManager) bVar.f10983a.f9258a).commit();
                bVar.f10991i = false;
            }
            if (zVar.f16076d != 0) {
                bVar.f10991i = true;
            }
        }
        while (this.N0.h() && this.N0.e(0) != null) {
            int i14 = this.N0.f15971b;
            for (int i15 = 0; i15 < i14; i15++) {
                ic.a aVar = (ic.a) this.N0.e(i15);
                o.g0 g0Var = this.N0;
                if (i15 < 0 || i15 >= g0Var.f15971b) {
                    g0Var.m(i15);
                    throw null;
                }
                Object[] objArr2 = g0Var.f15970a;
                Object obj = objArr2[i15];
                objArr2[i15] = null;
                if (aVar != null) {
                    aVar.b();
                }
            }
            this.N0.k(0, i14);
        }
    }

    public final void C(i2.j0 j0Var) {
        d0 d0Var = this.f10045s;
        d0Var.A = true;
        if (d0Var.v()) {
            d0Var.w(j0Var);
        }
        l1.c cVar = this.f10047t;
        cVar.f11681g = true;
        if (cVar.e()) {
            cVar.f11682h.e(ub.a0.f21526a);
        }
    }

    public final void D(i2.j0 j0Var, boolean z10, boolean z11, boolean z12) {
        i2.j0 j0VarV;
        i2.j0 j0VarV2;
        i2.x0 x0Var = this.P;
        if (!z10) {
            if (x0Var.p(j0Var, z11) && z12) {
                K(j0Var);
                return;
            }
            return;
        }
        c7.e1 e1Var = x0Var.f8898b;
        i2.j0 j0Var2 = j0Var.f8749h;
        i2.n0 n0Var = j0Var.G;
        if (j0Var2 == null) {
            f2.a.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iOrdinal = n0Var.f8793d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new ce.j0();
                }
                if (!n0Var.f8794e || z11) {
                    n0Var.f8794e = true;
                    n0Var.f8805p.f8924v = true;
                    if (j0Var.Q) {
                        return;
                    }
                    if ((jc.l.a(j0Var.K(), Boolean.TRUE) || i2.x0.h(j0Var)) && ((j0VarV = j0Var.v()) == null || !j0VarV.G.f8794e)) {
                        e1Var.i(j0Var, i2.w.f8882a);
                    } else if ((j0Var.J() || i2.x0.i(j0Var)) && ((j0VarV2 = j0Var.v()) == null || !j0VarV2.r())) {
                        e1Var.i(j0Var, i2.w.f8884c);
                    }
                    if (x0Var.f8900d || !z12) {
                        return;
                    }
                    K(j0Var);
                    return;
                }
                return;
            }
        }
        x0Var.f8904h.b(new i2.w0(j0Var, true, z11));
    }

    public final void E(i2.j0 j0Var, boolean z10, boolean z11) {
        i2.n0 n0Var = j0Var.G;
        i2.w wVar = i2.w.f8885d;
        i2.x0 x0Var = this.P;
        if (!z10) {
            x0Var.getClass();
            int iOrdinal = n0Var.f8793d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                return;
            }
            if (iOrdinal != 4) {
                throw new ce.j0();
            }
            i2.j0 j0VarV = j0Var.v();
            boolean z12 = j0VarV == null || j0VarV.J();
            if (!z11) {
                if (j0Var.r()) {
                    return;
                }
                if (j0Var.p() && j0Var.J() == z12 && j0Var.J() == n0Var.f8805p.f8923u) {
                    return;
                }
            }
            i2.z0 z0Var = n0Var.f8805p;
            z0Var.f8925w = true;
            z0Var.f8926x = true;
            if (!j0Var.Q && z0Var.f8923u && z12) {
                if ((j0VarV == null || !j0VarV.p()) && (j0VarV == null || !j0VarV.r())) {
                    x0Var.f8898b.i(j0Var, wVar);
                }
                if (x0Var.f8900d) {
                    return;
                }
                K(null);
                return;
            }
            return;
        }
        c7.e1 e1Var = x0Var.f8898b;
        int iOrdinal2 = n0Var.f8793d.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                return;
            }
            if (iOrdinal2 != 2) {
                if (iOrdinal2 == 3) {
                    return;
                }
                if (iOrdinal2 != 4) {
                    throw new ce.j0();
                }
            }
        }
        if ((n0Var.f8794e || n0Var.f8795f) && !z11) {
            return;
        }
        n0Var.f8795f = true;
        n0Var.f8796g = true;
        i2.z0 z0Var2 = n0Var.f8805p;
        z0Var2.f8925w = true;
        z0Var2.f8926x = true;
        if (j0Var.Q) {
            return;
        }
        i2.j0 j0VarV2 = j0Var.v();
        if (jc.l.a(j0Var.K(), Boolean.TRUE) && ((j0VarV2 == null || !j0VarV2.G.f8794e) && (j0VarV2 == null || !j0VarV2.G.f8795f))) {
            e1Var.i(j0Var, i2.w.f8883b);
        } else if (j0Var.J() && ((j0VarV2 == null || !j0VarV2.p()) && (j0VarV2 == null || !j0VarV2.r()))) {
            e1Var.i(j0Var, wVar);
        }
        if (x0Var.f8900d) {
            return;
        }
        K(null);
    }

    public final void F() {
        d0 d0Var = this.f10045s;
        d0Var.A = true;
        if (d0Var.v() && !d0Var.L) {
            d0Var.L = true;
            d0Var.f9777l.post(d0Var.N);
        }
        l1.c cVar = this.f10047t;
        cVar.f11681g = true;
        if (!cVar.e() || cVar.f11688n) {
            return;
        }
        cVar.f11688n = true;
        cVar.f11683i.post(cVar.f11689o);
    }

    public final void G() {
        if (this.W) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.V) {
            this.V = jCurrentAnimationTimeMillis;
            c1 c1Var = this.U0;
            float[] fArr = this.T;
            c1Var.a(this, fArr);
            l0.A(fArr, this.U);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.R;
            view.getLocationOnScreen(iArr);
            float f10 = iArr[0];
            float f11 = iArr[1];
            view.getLocationInWindow(iArr);
            this.q0 = (((long) Float.floatToRawIntBits(f10 - iArr[0])) << 32) | (((long) Float.floatToRawIntBits(f11 - iArr[1])) & 4294967295L);
        }
    }

    public final void H(MotionEvent motionEvent) {
        this.V = AnimationUtils.currentAnimationTimeMillis();
        c1 c1Var = this.U0;
        float[] fArr = this.T;
        c1Var.a(this, fArr);
        l0.A(fArr, this.U);
        float x3 = motionEvent.getX();
        float y5 = motionEvent.getY();
        long jB = q1.a0.b((((long) Float.floatToRawIntBits(x3)) << 32) | (((long) Float.floatToRawIntBits(y5)) & 4294967295L), fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (jB >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (jB & 4294967295L));
        this.q0 = (((long) Float.floatToRawIntBits(rawX)) << 32) | (((long) Float.floatToRawIntBits(rawY)) & 4294967295L);
    }

    public final boolean I(i2.o1 o1Var) {
        androidx.media3.exoplayer.offline.u uVar;
        z0.e eVar;
        Reference referencePoll;
        boolean z10 = this.M == null || b3.f9736v || Build.VERSION.SDK_INT >= 23;
        if (z10) {
            do {
                uVar = this.M0;
                ReferenceQueue referenceQueue = (ReferenceQueue) uVar.f969c;
                eVar = (z0.e) uVar.f968b;
                referencePoll = referenceQueue.poll();
                if (referencePoll != null) {
                    eVar.j(referencePoll);
                }
            } while (referencePoll != null);
            eVar.b(new WeakReference(o1Var, (ReferenceQueue) uVar.f969c));
        }
        this.f10055x.remove(o1Var);
        return z10;
    }

    public final boolean J() {
        if (isFocused() || hasFocus()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void K(i2.j0 j0Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (j0Var != null) {
            while (j0Var != null && j0Var.s() == i2.h0.f8720a) {
                if (!this.O) {
                    i2.j0 j0VarV = j0Var.v();
                    if (j0VarV == null) {
                        break;
                    }
                    long j10 = j0VarV.F.f8664c.f7183d;
                    if (f3.a.f(j10) && f3.a.e(j10)) {
                        break;
                    }
                }
                j0Var = j0Var.v();
            }
            if (j0Var == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long L(long j10) {
        G();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - Float.intBitsToFloat((int) (this.q0 >> 32));
        return q1.a0.b((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L)) - Float.intBitsToFloat((int) (this.q0 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), this.U);
    }

    public final int M(MotionEvent motionEvent) {
        Object obj;
        if (this.V0) {
            this.V0 = false;
            int metaState = motionEvent.getMetaState();
            this.f10036j.getClass();
            e3.f9811a.setValue(new c2.b0(metaState));
        }
        c2.i iVar = this.B;
        androidx.media3.exoplayer.offline.u uVarA = iVar.a(motionEvent, this);
        a0.v vVar = this.C;
        if (uVarA == null) {
            if (!vVar.f152a) {
                ((o.s) ((b0.c1) vVar.f155d).f1208b).b();
                ((c2.d) vVar.f154c).f();
            }
            return 0;
        }
        List list = (List) uVarA.f969c;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i10 = size - 1;
                obj = list.get(size);
                if (((c2.v) obj).f3344e) {
                    break;
                }
                if (i10 < 0) {
                    break;
                }
                size = i10;
            }
            obj = null;
        } else {
            obj = null;
        }
        c2.v vVar2 = (c2.v) obj;
        if (vVar2 != null) {
            this.f10027a = vVar2.f3343d;
        }
        int iO = vVar.o(uVarA, this, u(motionEvent));
        uVarA.f968b = null;
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 0 && actionMasked != 5) || (iO & 1) != 0) {
            return iO;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        iVar.f3278c.delete(pointerId);
        iVar.f3277b.delete(pointerId);
        return iO;
    }

    public final void N(MotionEvent motionEvent, int i10, long j10, boolean z10) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i10 != 9 && i10 != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i11 = 0; i11 < pointerCount; i11++) {
            pointerPropertiesArr[i11] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i12 = 0; i12 < pointerCount; i12++) {
            pointerCoordsArr[i12] = new MotionEvent.PointerCoords();
        }
        int i13 = 0;
        while (i13 < pointerCount) {
            int i14 = ((actionIndex < 0 || i13 < actionIndex) ? 0 : 1) + i13;
            motionEvent.getPointerProperties(i14, pointerPropertiesArr[i13]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i13];
            motionEvent.getPointerCoords(i14, pointerCoords);
            float f10 = pointerCoords.x;
            long jX = x((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(f10)) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jX >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jX & 4294967295L));
            i13++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j10 : motionEvent.getDownTime(), j10, i10, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z10 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        androidx.media3.exoplayer.offline.u uVarA = this.B.a(motionEventObtain, this);
        jc.l.b(uVarA);
        this.C.o(uVarA, this, true);
        motionEventObtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O(ic.n r5, ac.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof j2.u
            if (r0 == 0) goto L13
            r0 = r6
            j2.u r0 = (j2.u) r0
            int r1 = r0.f10014f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10014f = r1
            goto L18
        L13:
            j2.u r0 = new j2.u
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f10012d
            int r1 = r0.f10014f
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 == r2) goto L29
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L29:
            ub.a.f(r6)
            goto L49
        L2d:
            ub.a.f(r6)
            j2.r r6 = new j2.r
            r1 = 2
            r6.<init>(r4, r1)
            r0.f10014f = r2
            e.j r1 = new e.j
            r2 = 0
            java.util.concurrent.atomic.AtomicReference r3 = r4.A0
            r1.<init>(r6, r3, r5, r2)
            java.lang.Object r5 = hf.a0.k(r1, r0)
            zb.a r6 = zb.a.f26667a
            if (r5 != r6) goto L49
            return
        L49:
            ce.j0 r5 = new ce.j0
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.v.O(ic.n, ac.c):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P() {
        /*
            r18 = this;
            r0 = r18
            int[] r1 = r0.R
            r0.getLocationOnScreen(r1)
            long r2 = r0.Q
            r4 = 32
            long r5 = r2 >> r4
            int r6 = (int) r5
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r7
            int r3 = (int) r2
            r2 = 0
            r5 = r1[r2]
            r9 = 1
            if (r6 != r5) goto L27
            r10 = r1[r9]
            if (r3 != r10) goto L27
            long r10 = r0.V
            r12 = 0
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 >= 0) goto L44
        L27:
            r1 = r1[r9]
            long r10 = (long) r5
            long r10 = r10 << r4
            long r12 = (long) r1
            long r12 = r12 & r7
            long r10 = r10 | r12
            r0.Q = r10
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == r1) goto L44
            if (r3 == r1) goto L44
            i2.j0 r1 = r0.getRoot()
            i2.n0 r1 = r1.G
            i2.z0 r1 = r1.f8805p
            r1.p0()
            r1 = 1
            goto L45
        L44:
            r1 = 0
        L45:
            r0.G()
            android.view.View r3 = r0.X0
            if (r3 != 0) goto L52
            android.view.View r3 = r0.getRootView()
            r0.X0 = r3
        L52:
            r2.b r5 = r0.getRectManager()
            long r10 = r0.Q
            long r12 = r0.q0
            long r12 = android.support.v4.media.session.b.X(r12)
            int r6 = r3.getWidth()
            int r3 = r3.getHeight()
            r5.getClass()
            float[] r14 = r0.T
            int r15 = nh.b.d(r14)
            r2.c r2 = r5.f18731b
            r15 = r15 & 2
            if (r15 != 0) goto L78
        L75:
            r16 = r7
            goto L7a
        L78:
            r14 = 0
            goto L75
        L7a:
            long r7 = r2.f18742c
            boolean r7 = f3.j.b(r12, r7)
            if (r7 != 0) goto L86
            r2.f18742c = r12
            r7 = 1
            goto L87
        L86:
            r7 = 0
        L87:
            long r12 = r2.f18743d
            boolean r8 = f3.j.b(r10, r12)
            if (r8 != 0) goto L92
            r2.f18743d = r10
            r7 = 1
        L92:
            if (r14 == 0) goto L95
            r7 = 1
        L95:
            long r10 = (long) r6
            long r10 = r10 << r4
            long r3 = (long) r3
            long r3 = r3 & r16
            long r3 = r3 | r10
            long r10 = r2.f18744e
            int r6 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r6 == 0) goto La4
            r2.f18744e = r3
            r7 = 1
        La4:
            if (r7 != 0) goto Lad
            boolean r2 = r5.f18734e
            if (r2 == 0) goto Lab
            goto Lad
        Lab:
            r2 = 0
            goto Lae
        Lad:
            r2 = 1
        Lae:
            r5.f18734e = r2
            i2.x0 r2 = r0.P
            r2.a(r1)
            r2.b r1 = r0.getRectManager()
            r1.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.v.P():void");
    }

    public final void Q(float f10) {
        if (this.f10032f) {
            if (f10 > 0.0f) {
                if (Float.isNaN(this.O0) || f10 > this.O0) {
                    this.O0 = f10;
                    return;
                }
                return;
            }
            if (f10 < 0.0f) {
                if (Float.isNaN(this.P0) || f10 < this.P0) {
                    this.P0 = f10;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        q2.k kVarX;
        ic.k kVar;
        if (e()) {
            k1.b bVar = this.F;
            if (bVar != null) {
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    int iKeyAt = sparseArray.keyAt(i10);
                    AutofillValue autofillValueJ = b7.l.j(sparseArray.get(iKeyAt));
                    if (autofillValueJ.isText()) {
                        i2.j0 j0Var = (i2.j0) bVar.f10984b.f17647c.b(iKeyAt);
                        if (j0Var != null && (kVarX = j0Var.x()) != null) {
                            Object objG = kVarX.f17630a.g(q2.j.f17610g);
                            if (objG == null) {
                                objG = null;
                            }
                            q2.a aVar = (q2.a) objG;
                            if (aVar != null && (kVar = (ic.k) aVar.f17587b) != null) {
                            }
                        }
                    } else if (autofillValueJ.isDate()) {
                        Log.w("ComposeAutofillManager", "Auto filling Date fields is not yet supported.");
                    } else if (autofillValueJ.isList()) {
                        Log.w("ComposeAutofillManager", "Auto filling dropdown lists is not yet supported.");
                    } else if (autofillValueJ.isToggle()) {
                        Log.w("ComposeAutofillManager", "Auto filling toggle fields are not yet supported.");
                    }
                }
            }
            b0.w1 w1Var = this.E;
            if (w1Var != null) {
                k1.k kVar2 = (k1.k) w1Var.f1396d;
                if (kVar2.f10994a.isEmpty()) {
                    return;
                }
                int size2 = sparseArray.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    int iKeyAt2 = sparseArray.keyAt(i11);
                    AutofillValue autofillValueJ2 = b7.l.j(sparseArray.get(iKeyAt2));
                    if (autofillValueJ2.isText()) {
                        autofillValueJ2.getTextValue().toString();
                        if (kVar2.f10994a.get(Integer.valueOf(iKeyAt2)) != null) {
                            throw new ClassCastException();
                        }
                    } else {
                        if (autofillValueJ2.isDate()) {
                            throw new ub.j("An operation is not implemented: b/138604541: Add onFill() callback for date");
                        }
                        if (autofillValueJ2.isList()) {
                            throw new ub.j("An operation is not implemented: b/138604541: Add onFill() callback for list");
                        }
                        if (autofillValueJ2.isToggle()) {
                            throw new ub.j("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.lifecycle.f
    public final void b(androidx.lifecycle.x xVar) {
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(l0.y());
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        return this.f10045s.m(i10, false, this.f10027a);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i10) {
        return this.f10045s.m(i10, true, this.f10027a);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) throws Throwable {
        if (!isAttachedToWindow()) {
            r(getRoot());
        }
        y(true);
        h1.n.k().m();
        this.f10059z = true;
        q1.p pVar = this.f10037k;
        q1.b bVar = pVar.f17565a;
        Canvas canvas2 = bVar.f17490a;
        bVar.f17490a = canvas;
        getRoot().i(bVar, null);
        pVar.f17565a.f17490a = canvas2;
        ArrayList arrayList = this.f10055x;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((i2.o1) arrayList.get(i10)).j();
            }
        }
        if (b3.f9736v) {
            int iSave = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave);
        }
        arrayList.clear();
        this.f10059z = false;
        ArrayList arrayList2 = this.f10057y;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }
        if (this.f10032f) {
            a1.a(this, this.O0);
            View view = this.f10031e;
            if (view == null) {
                jc.l.k("frameRateCategoryView");
                throw null;
            }
            a1.a(view, this.P0);
            if (!Float.isNaN(this.P0)) {
                view.invalidate();
                drawChild(canvas, view, getDrawingTime());
            }
            this.O0 = Float.NaN;
            this.P0 = Float.NaN;
        }
        getRectManager().b();
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) throws InterruptedException {
        i2.d1 d1Var;
        e2.a aVar;
        int size;
        i2.d1 d1Var2;
        j1.p pVarF;
        i2.d1 d1Var3;
        if (this.S0) {
            a9.m mVar = this.R0;
            removeCallbacks(mVar);
            if (motionEvent.getActionMasked() == 8) {
                this.S0 = false;
            } else {
                mVar.run();
            }
        }
        if (t(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() != 8) {
            if (!motionEvent.isFromSource(2)) {
                float x3 = motionEvent.getX();
                float y5 = motionEvent.getY();
                Float.floatToRawIntBits(x3);
                Float.floatToRawIntBits(y5);
                motionEvent.getEventTime();
                motionEvent.getActionMasked();
                o1.k kVar = (o1.k) getFocusOwner();
                if (kVar.f16100d.f16092e) {
                    System.out.println((Object) "FocusRelatedWarning: Dispatching indirect touch event while the focus system is invalidated.");
                } else {
                    o1.v vVarG = o1.f.g(kVar.f16099c);
                    if (vVarG != null) {
                        if (!vVarG.f9690a.f9703n) {
                            f2.a.b("visitAncestors called on an unattached node");
                        }
                        j1.p pVar = vVarG.f9690a;
                        i2.j0 j0VarY = i2.f.y(vVarG);
                        while (j0VarY != null) {
                            if ((j0VarY.F.f8667f.f9693d & 2097152) != 0) {
                                while (pVar != null) {
                                    if ((pVar.f9692c & 2097152) != 0) {
                                        j1.p pVarF2 = pVar;
                                        z0.e eVar = null;
                                        while (pVarF2 != null) {
                                            if ((pVarF2.f9692c & 2097152) != 0 && (pVarF2 instanceof i2.n)) {
                                                int i10 = 0;
                                                for (j1.p pVar2 = ((i2.n) pVarF2).f8789p; pVar2 != null; pVar2 = pVar2.f9695f) {
                                                    if ((pVar2.f9692c & 2097152) != 0) {
                                                        i10++;
                                                        if (i10 == 1) {
                                                            pVarF2 = pVar2;
                                                        } else {
                                                            if (eVar == null) {
                                                                eVar = new z0.e(new j1.p[16]);
                                                            }
                                                            if (pVarF2 != null) {
                                                                eVar.b(pVarF2);
                                                                pVarF2 = null;
                                                            }
                                                            eVar.b(pVar2);
                                                        }
                                                    }
                                                }
                                                if (i10 == 1) {
                                                }
                                            }
                                            pVarF2 = i2.f.f(eVar);
                                        }
                                    }
                                    pVar = pVar.f9694e;
                                }
                            }
                            j0VarY = j0VarY.v();
                            pVar = (j0VarY == null || (d1Var = j0VarY.F) == null) ? null : d1Var.f8666e;
                        }
                    }
                }
            }
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (!motionEvent.isFromSource(4194304)) {
            return (p(motionEvent) & 1) != 0;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        motionEvent.getAxisValue(26);
        Context context = getContext();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            Method method = u3.t.f21331a;
            m2.b.e(viewConfiguration);
        } else {
            u3.t.a(viewConfiguration, context);
        }
        Context context2 = getContext();
        if (i11 >= 26) {
            m2.b.d(viewConfiguration);
        } else {
            u3.t.a(viewConfiguration, context2);
        }
        motionEvent.getEventTime();
        motionEvent.getDeviceId();
        o1.k kVar2 = (o1.k) getFocusOwner();
        if (kVar2.f16100d.f16092e) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
            return false;
        }
        o1.v vVarG2 = o1.f.g(kVar2.f16099c);
        if (vVarG2 != null) {
            if (!vVarG2.f9690a.f9703n) {
                f2.a.b("visitAncestors called on an unattached node");
            }
            j1.p pVar3 = vVarG2.f9690a;
            i2.j0 j0VarY2 = i2.f.y(vVarG2);
            loop0: while (true) {
                if (j0VarY2 == null) {
                    pVarF = null;
                    break;
                }
                if ((j0VarY2.F.f8667f.f9693d & 16384) != 0) {
                    while (pVar3 != null) {
                        if ((pVar3.f9692c & 16384) != 0) {
                            pVarF = pVar3;
                            z0.e eVar2 = null;
                            while (pVarF != null) {
                                if (pVarF instanceof e2.a) {
                                    break loop0;
                                }
                                if ((pVarF.f9692c & 16384) != 0 && (pVarF instanceof i2.n)) {
                                    int i12 = 0;
                                    for (j1.p pVar4 = ((i2.n) pVarF).f8789p; pVar4 != null; pVar4 = pVar4.f9695f) {
                                        if ((pVar4.f9692c & 16384) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                pVarF = pVar4;
                                            } else {
                                                if (eVar2 == null) {
                                                    eVar2 = new z0.e(new j1.p[16]);
                                                }
                                                if (pVarF != null) {
                                                    eVar2.b(pVarF);
                                                    pVarF = null;
                                                }
                                                eVar2.b(pVar4);
                                            }
                                        }
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                pVarF = i2.f.f(eVar2);
                            }
                        }
                        pVar3 = pVar3.f9694e;
                    }
                }
                j0VarY2 = j0VarY2.v();
                pVar3 = (j0VarY2 == null || (d1Var3 = j0VarY2.F) == null) ? null : d1Var3.f8666e;
            }
            aVar = (e2.a) pVarF;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            e2.a aVar2 = aVar;
            if (!aVar2.f9690a.f9703n) {
                f2.a.b("visitAncestors called on an unattached node");
            }
            j1.p pVar5 = aVar2.f9690a.f9694e;
            i2.j0 j0VarY3 = i2.f.y(aVar);
            ArrayList arrayList = null;
            while (j0VarY3 != null) {
                if ((j0VarY3.F.f8667f.f9693d & 16384) != 0) {
                    while (pVar5 != null) {
                        if ((pVar5.f9692c & 16384) != 0) {
                            j1.p pVarF3 = pVar5;
                            z0.e eVar3 = null;
                            while (pVarF3 != null) {
                                if (pVarF3 instanceof e2.a) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(pVarF3);
                                } else if ((pVarF3.f9692c & 16384) != 0 && (pVarF3 instanceof i2.n)) {
                                    int i13 = 0;
                                    for (j1.p pVar6 = ((i2.n) pVarF3).f8789p; pVar6 != null; pVar6 = pVar6.f9695f) {
                                        if ((pVar6.f9692c & 16384) != 0) {
                                            i13++;
                                            if (i13 == 1) {
                                                pVarF3 = pVar6;
                                            } else {
                                                if (eVar3 == null) {
                                                    eVar3 = new z0.e(new j1.p[16]);
                                                }
                                                if (pVarF3 != null) {
                                                    eVar3.b(pVarF3);
                                                    pVarF3 = null;
                                                }
                                                eVar3.b(pVar6);
                                            }
                                        }
                                    }
                                    if (i13 == 1) {
                                    }
                                }
                                pVarF3 = i2.f.f(eVar3);
                            }
                        }
                        pVar5 = pVar5.f9694e;
                    }
                }
                j0VarY3 = j0VarY3.v();
                pVar5 = (j0VarY3 == null || (d1Var2 = j0VarY3.F) == null) ? null : d1Var2.f8666e;
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i14 = size - 1;
                    ((e2.a) arrayList.get(size)).getClass();
                    if (i14 < 0) {
                        break;
                    }
                    size = i14;
                }
            }
            j1.p pVarF4 = aVar2.f9690a;
            z0.e eVar4 = null;
            while (pVarF4 != null) {
                if (pVarF4 instanceof e2.a) {
                } else if ((pVarF4.f9692c & 16384) != 0 && (pVarF4 instanceof i2.n)) {
                    int i15 = 0;
                    for (j1.p pVar7 = ((i2.n) pVarF4).f8789p; pVar7 != null; pVar7 = pVar7.f9695f) {
                        if ((pVar7.f9692c & 16384) != 0) {
                            i15++;
                            if (i15 == 1) {
                                pVarF4 = pVar7;
                            } else {
                                if (eVar4 == null) {
                                    eVar4 = new z0.e(new j1.p[16]);
                                }
                                if (pVarF4 != null) {
                                    eVar4.b(pVarF4);
                                    pVarF4 = null;
                                }
                                eVar4.b(pVar7);
                            }
                        }
                    }
                    if (i15 == 1) {
                    }
                }
                pVarF4 = i2.f.f(eVar4);
            }
            if (!super.dispatchGenericMotionEvent(motionEvent)) {
                j1.p pVarF5 = aVar2.f9690a;
                z0.e eVar5 = null;
                while (pVarF5 != null) {
                    if (pVarF5 instanceof e2.a) {
                    } else if ((pVarF5.f9692c & 16384) != 0 && (pVarF5 instanceof i2.n)) {
                        int i16 = 0;
                        for (j1.p pVar8 = ((i2.n) pVarF5).f8789p; pVar8 != null; pVar8 = pVar8.f9695f) {
                            if ((pVar8.f9692c & 16384) != 0) {
                                i16++;
                                if (i16 == 1) {
                                    pVarF5 = pVar8;
                                } else {
                                    if (eVar5 == null) {
                                        eVar5 = new z0.e(new j1.p[16]);
                                    }
                                    if (pVarF5 != null) {
                                        eVar5.b(pVarF5);
                                        pVarF5 = null;
                                    }
                                    eVar5.b(pVar8);
                                }
                            }
                        }
                        if (i16 == 1) {
                        }
                    }
                    pVarF5 = i2.f.f(eVar5);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i17 = 0; i17 < size2; i17++) {
                        p pVar9 = ((e2.a) arrayList.get(i17)).f6062o;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0158  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r24) throws java.lang.InterruptedException {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.v.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return ((o1.k) getFocusOwner()).d(keyEvent, new b0.s1(7, this, keyEvent));
        }
        int metaState = keyEvent.getMetaState();
        this.f10036j.getClass();
        e3.f9811a.setValue(new c2.b0(metaState));
        return ((o1.k) getFocusOwner()).d(keyEvent, o1.h.f16093b) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        i2.d1 d1Var;
        if (isFocused()) {
            o1.k kVar = (o1.k) getFocusOwner();
            if (kVar.f16100d.f16092e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                o1.v vVarG = o1.f.g(kVar.f16099c);
                if (vVarG != null) {
                    if (!vVarG.f9690a.f9703n) {
                        f2.a.b("visitAncestors called on an unattached node");
                    }
                    j1.p pVar = vVarG.f9690a;
                    i2.j0 j0VarY = i2.f.y(vVarG);
                    while (j0VarY != null) {
                        if ((j0VarY.F.f8667f.f9693d & 131072) != 0) {
                            while (pVar != null) {
                                if ((pVar.f9692c & 131072) != 0) {
                                    j1.p pVarF = pVar;
                                    z0.e eVar = null;
                                    while (pVarF != null) {
                                        if ((pVarF.f9692c & 131072) != 0 && (pVarF instanceof i2.n)) {
                                            int i10 = 0;
                                            for (j1.p pVar2 = ((i2.n) pVarF).f8789p; pVar2 != null; pVar2 = pVar2.f9695f) {
                                                if ((pVar2.f9692c & 131072) != 0) {
                                                    i10++;
                                                    if (i10 == 1) {
                                                        pVarF = pVar2;
                                                    } else {
                                                        if (eVar == null) {
                                                            eVar = new z0.e(new j1.p[16]);
                                                        }
                                                        if (pVarF != null) {
                                                            eVar.b(pVarF);
                                                            pVarF = null;
                                                        }
                                                        eVar.b(pVar2);
                                                    }
                                                }
                                            }
                                            if (i10 == 1) {
                                            }
                                        }
                                        pVarF = i2.f.f(eVar);
                                    }
                                }
                                pVar = pVar.f9694e;
                            }
                        }
                        j0VarY = j0VarY.v();
                        pVar = (j0VarY == null || (d1Var = j0VarY.F) == null) ? null : d1Var.f8666e;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        int i10 = Build.VERSION.SDK_INT;
        if (23 > i10 || i10 >= 28) {
            super.dispatchProvideStructure(viewStructure);
        } else {
            e0.f9795a.a(viewStructure, getView());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) throws InterruptedException {
        if (this.S0) {
            a9.m mVar = this.R0;
            removeCallbacks(mVar);
            MotionEvent motionEvent2 = this.K0;
            jc.l.b(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.S0 = false;
            } else {
                mVar.run();
            }
        }
        if (!t(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || v(motionEvent))) {
            int iP = p(motionEvent);
            if ((iP & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if ((iP & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int i10) throws IllegalAccessException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return l(this, i10);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i10));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i10) {
        p1.c cVarD;
        if (view == null || this.P.f8899c) {
            return super.focusSearch(view, i10);
        }
        Object obj = t1.f10004f.get();
        jc.l.b(obj);
        View viewB = ((t1) obj).b(this, view, i10);
        if (view == this) {
            o1.v vVarG = o1.f.g(((o1.k) getFocusOwner()).f16099c);
            cVarD = vVarG != null ? o1.f.j(vVarG) : null;
            if (cVarD == null) {
                cVarD = o1.f.d(view, this);
            }
        } else {
            cVarD = o1.f.d(view, this);
        }
        o1.d dVarD = o1.f.D(i10);
        int i11 = dVarD != null ? dVarD.f16086a : 6;
        jc.y yVar = new jc.y();
        if (((o1.k) getFocusOwner()).e(i11, cVarD, new b0.u1(yVar, 3)) != null) {
            Object obj2 = yVar.f10838a;
            if (obj2 != null) {
                if (viewB != null) {
                    if (i11 == 1 || i11 == 2) {
                        return super.focusSearch(view, i10);
                    }
                    if (o1.f.o(o1.f.j((o1.v) obj2), o1.f.d(viewB, this), cVarD, i11)) {
                    }
                }
                return this;
            }
            if (viewB == null) {
            }
            return viewB;
        }
        return view;
    }

    @Override // androidx.lifecycle.f
    public final /* synthetic */ void g(androidx.lifecycle.x xVar) {
        a0.c.o(xVar);
    }

    public final y0 getAndroidViewsHandler$ui_release() {
        if (this.L == null) {
            y0 y0Var = new y0(getContext());
            this.L = y0Var;
            addView(y0Var, -1);
            requestLayout();
        }
        y0 y0Var2 = this.L;
        jc.l.b(y0Var2);
        return y0Var2;
    }

    public k1.e getAutofill() {
        return this.E;
    }

    public k1.j getAutofillManager() {
        return this.F;
    }

    public k1.k getAutofillTree() {
        return this.f10053w;
    }

    public final ic.k getConfigurationChangeObserver() {
        return this.D;
    }

    public final l1.c getContentCaptureManager$ui_release() {
        return this.f10047t;
    }

    public yb.h getCoroutineContext() {
        return this.f10034h;
    }

    public f3.c getDensity() {
        return (f3.c) this.f10030d.getValue();
    }

    public p1.c getEmbeddedViewFocusRect() {
        if (isFocused()) {
            o1.v vVarG = o1.f.g(((o1.k) getFocusOwner()).f16099c);
            if (vVarG != null) {
                return o1.f.j(vVarG);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return o1.f.d(viewFindFocus, this);
        }
        return null;
    }

    public o1.i getFocusOwner() {
        return this.f10033g;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        p1.c embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.f16483a);
            rect.top = Math.round(embeddedViewFocusRect.f16484b);
            rect.right = Math.round(embeddedViewFocusRect.f16485c);
            rect.bottom = Math.round(embeddedViewFocusRect.f16486d);
            return;
        }
        if (jc.l.a(((o1.k) getFocusOwner()).e(6, null, p.f9950d), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public x2.d getFontFamilyResolver() {
        return (x2.d) this.D0.getValue();
    }

    public x2.c getFontLoader() {
        return this.C0;
    }

    public q1.v getGraphicsContext() {
        return this.f10051v;
    }

    public y1.a getHapticFeedBack() {
        return this.G0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.P.f8898b.J();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public z1.b getInputModeManager() {
        return this.H0;
    }

    public final g2.x getInsetsListener() {
        return this.f10039m;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.V;
    }

    @Override // android.view.View, android.view.ViewParent
    public f3.m getLayoutDirection() {
        return (f3.m) this.F0.getValue();
    }

    public long getMeasureIteration() {
        i2.x0 x0Var = this.P;
        if (!x0Var.f8899c) {
            f2.a.a("measureIteration should be only used during the measure/layout pass");
        }
        return x0Var.f8903g;
    }

    public h2.d getModifierLocalManager() {
        return this.I0;
    }

    public g2.f1 getPlacementScope() {
        int i10 = g2.i1.f7208b;
        return new g2.q0(1, this);
    }

    public c2.r getPointerIconService() {
        return this.Y0;
    }

    public r2.b getRectManager() {
        return this.f10042p;
    }

    public i2.j0 getRoot() {
        return this.f10040n;
    }

    public i2.x1 getRootForTest() {
        return this.f10043q;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        i7.p2 p2Var;
        if (Build.VERSION.SDK_INT < 31 || (p2Var = this.W0) == null) {
            return false;
        }
        return ((Boolean) ((x0.e1) p2Var.f9258a).getValue()).booleanValue();
    }

    public q2.q getSemanticsOwner() {
        return this.f10044r;
    }

    public i2.l0 getSharedDrawScope() {
        return this.f10029c;
    }

    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? z0.f10106a.a(this) : this.K;
    }

    public i2.r1 getSnapshotObserver() {
        return this.J;
    }

    public u2 getSoftwareKeyboardController() {
        return this.B0;
    }

    public y2.z getTextInputService() {
        return this.f10060z0;
    }

    public v2 getTextToolbar() {
        return this.J0;
    }

    public final i2.w1 getUncaughtExceptionHandler$ui_release() {
        return null;
    }

    public z2 getViewConfiguration() {
        return this.f10038l;
    }

    public final n getViewTreeOwners() {
        return (n) this.f10048t0.getValue();
    }

    public d3 getWindowInfo() {
        return this.f10036j;
    }

    public final k1.b get_autofillManager$ui_release() {
        return this.F;
    }

    public final i2.o1 j(ic.n nVar, i2.f1 f1Var, t1.b bVar) {
        z0.e eVar;
        Reference referencePoll;
        Object obj;
        if (bVar != null) {
            return new w1(bVar, null, this, nVar, f1Var);
        }
        do {
            androidx.media3.exoplayer.offline.u uVar = this.M0;
            ReferenceQueue referenceQueue = (ReferenceQueue) uVar.f969c;
            eVar = (z0.e) uVar.f968b;
            referencePoll = referenceQueue.poll();
            if (referencePoll != null) {
                eVar.j(referencePoll);
            }
        } while (referencePoll != null);
        while (true) {
            int i10 = eVar.f26374c;
            if (i10 == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) eVar.k(i10 - 1)).get();
            if (obj != null) {
                break;
            }
        }
        i2.o1 o1Var = (i2.o1) obj;
        if (o1Var != null) {
            o1Var.f(nVar, f1Var);
            return o1Var;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23) {
            return new w1(getGraphicsContext().b(), getGraphicsContext(), this, nVar, f1Var);
        }
        if (isHardwareAccelerated() && i11 >= 23 && this.r0) {
            try {
                return new o2(this, nVar, f1Var);
            } catch (Throwable unused) {
                this.r0 = false;
            }
        }
        if (this.M == null) {
            if (!b3.f9735u) {
                l0.I(new View(getContext()));
            }
            r1 r1Var = b3.f9736v ? new r1(getContext()) : new c3(getContext());
            this.M = r1Var;
            addView(r1Var, -1);
        }
        r1 r1Var2 = this.M;
        jc.l.b(r1Var2);
        return new b3(this, r1Var2, nVar, f1Var);
    }

    public final void m(i2.j0 j0Var, boolean z10) {
        this.P.f(j0Var, z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        androidx.lifecycle.q qVarF;
        androidx.lifecycle.x xVar;
        b0.w1 w1Var;
        super.onAttachedToWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30) {
            setShowLayoutBounds(l0.y());
        }
        this.f10039m.onViewAttachedToWindow(this);
        if (i10 > 28) {
            if (f10026d1 == null) {
                m mVar = new m();
                f10026d1 = mVar;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (Z0 == null) {
                        Z0 = Class.forName("android.os.SystemProperties");
                    }
                    if (f10024b1 == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class cls = Z0;
                        f10024b1 = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                    }
                    Method method = f10024b1;
                    if (method != null) {
                        method.invoke(null, mVar);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            o.g0 g0Var = f10025c1;
            synchronized (g0Var) {
                g0Var.a(this);
            }
        }
        this.f10036j.f9721a.setValue(Boolean.valueOf(hasWindowFocus()));
        this.f10036j.getClass();
        this.f10036j.getClass();
        s(getRoot());
        r(getRoot());
        getSnapshotObserver().f8837a.e();
        if (e() && (w1Var = this.E) != null) {
            k1.i iVar = k1.i.f10993a;
            iVar.getClass();
            ((AutofillManager) w1Var.f1397e).registerCallback(k1.g.l(iVar));
        }
        androidx.lifecycle.x xVarD = androidx.lifecycle.m0.d(this);
        w7.e eVarR = ua.l.R(this);
        n viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (xVarD != null && eVarR != null && (xVarD != (xVar = viewTreeOwners.f9917a) || eVarR != xVar))) {
            if (xVarD == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (eVarR == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (qVarF = viewTreeOwners.f9917a.f()) != null) {
                qVarF.q1(this);
            }
            xVarD.f().W0(this);
            n nVar = new n(xVarD, eVarR);
            set_viewTreeOwners(nVar);
            ic.k kVar = this.f10050u0;
            if (kVar != null) {
                kVar.a(nVar);
            }
            this.f10050u0 = null;
        }
        this.H0.f26377a.setValue(new z1.a(isInTouchMode() ? 1 : 2));
        n viewTreeOwners2 = getViewTreeOwners();
        androidx.lifecycle.q qVarF2 = viewTreeOwners2 != null ? viewTreeOwners2.f9917a.f() : null;
        if (qVarF2 == null) {
            throw h0.g("No lifecycle owner exists");
        }
        qVarF2.W0(this);
        qVarF2.W0(this.f10047t);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f10052v0);
        getViewTreeObserver().addOnScrollChangedListener(this.f10054w0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f10056x0);
        if (Build.VERSION.SDK_INT >= 31) {
            i0.f9826a.b(this);
        }
        k1.b bVar = this.F;
        if (bVar != null) {
            ((o1.k) getFocusOwner()).f16103g.a(bVar);
            getSemanticsOwner().f17648d.a(bVar);
        }
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        j1.s sVar = (j1.s) this.A0.get();
        q0 q0Var = (q0) (sVar != null ? sVar.f9705b : null);
        if (q0Var == null) {
            return this.f10058y0.f25370d;
        }
        j1.s sVar2 = (j1.s) q0Var.f9966d.get();
        y1 y1Var = (y1) (sVar2 != null ? sVar2.f9705b : null);
        return y1Var != null && (y1Var.f10104e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(lc.b.c(getContext()));
        this.f10036j.getClass();
        int i10 = Build.VERSION.SDK_INT;
        if ((i10 >= 31 ? configuration.fontWeightAdjustment : 0) != this.E0) {
            this.E0 = i10 >= 31 ? configuration.fontWeightAdjustment : 0;
            setFontFamilyResolver(vb.w.f(getContext()));
        }
        this.D.a(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i10;
        j1.s sVar = (j1.s) this.A0.get();
        q0 q0Var = (q0) (sVar != null ? sVar.f9705b : null);
        if (q0Var == null) {
            y2.b0 b0Var = this.f10058y0;
            if (b0Var.f25370d) {
                y2.j jVar = b0Var.f25374h;
                y2.y yVar = b0Var.f25373g;
                int i11 = jVar.f25414e;
                boolean z10 = jVar.f25410a;
                if (i11 == 1) {
                    i10 = z10 ? 6 : 0;
                } else if (i11 == 0) {
                    i10 = 1;
                } else if (i11 == 2) {
                    i10 = 2;
                } else if (i11 == 6) {
                    i10 = 5;
                } else if (i11 == 5) {
                    i10 = 7;
                } else if (i11 == 3) {
                    i10 = 3;
                } else if (i11 == 4) {
                    i10 = 4;
                } else {
                    if (i11 != 7) {
                        throw new IllegalStateException("invalid ImeAction");
                    }
                }
                editorInfo.imeOptions = i10;
                int i12 = jVar.f25413d;
                if (i12 == 1) {
                    editorInfo.inputType = 1;
                } else if (i12 == 2) {
                    editorInfo.inputType = 1;
                    editorInfo.imeOptions = Integer.MIN_VALUE | i10;
                } else if (i12 == 3) {
                    editorInfo.inputType = 2;
                } else if (i12 == 4) {
                    editorInfo.inputType = 3;
                } else if (i12 == 5) {
                    editorInfo.inputType = 17;
                } else if (i12 == 6) {
                    editorInfo.inputType = 33;
                } else if (i12 == 7) {
                    editorInfo.inputType = 129;
                } else if (i12 == 8) {
                    editorInfo.inputType = 18;
                } else {
                    if (i12 != 9) {
                        throw new IllegalStateException("Invalid Keyboard Type");
                    }
                    editorInfo.inputType = 8194;
                }
                if (!z10) {
                    int i13 = editorInfo.inputType;
                    if ((i13 & 1) == 1) {
                        editorInfo.inputType = i13 | 131072;
                        if (i11 == 1) {
                            editorInfo.imeOptions |= 1073741824;
                        }
                    }
                }
                int i14 = editorInfo.inputType;
                if ((i14 & 1) == 1) {
                    int i15 = jVar.f25411b;
                    if (i15 == 1) {
                        editorInfo.inputType = i14 | 4096;
                    } else if (i15 == 2) {
                        editorInfo.inputType = i14 | 8192;
                    } else if (i15 == 3) {
                        editorInfo.inputType = i14 | 16384;
                    }
                    if (jVar.f25412c) {
                        editorInfo.inputType |= 32768;
                    }
                }
                long j10 = yVar.f25435b;
                int i16 = t2.k0.f20357c;
                editorInfo.initialSelStart = (int) (j10 >> 32);
                editorInfo.initialSelEnd = (int) (j10 & 4294967295L);
                ud.e.W(editorInfo, yVar.f25434a.f20320b);
                editorInfo.imeOptions |= 33554432;
                if (c4.k.d()) {
                    c4.k.a().g(editorInfo);
                }
                y2.u uVar = new y2.u(b0Var.f25373g, new xa.h(b0Var), b0Var.f25374h.f25412c);
                b0Var.f25375i.add(new WeakReference(uVar));
                return uVar;
            }
        } else {
            j1.s sVar2 = (j1.s) q0Var.f9966d.get();
            y1 y1Var = (y1) (sVar2 != null ? sVar2.f9705b : null);
            if (y1Var != null) {
                synchronized (y1Var.f10102c) {
                    if (y1Var.f10104e) {
                        return null;
                    }
                    j0.r rVarA = y1Var.f10100a.a(editorInfo);
                    a0.f0 f0Var = new a0.f0(24, y1Var);
                    int i17 = Build.VERSION.SDK_INT;
                    InputConnection pVar = i17 >= 34 ? new y2.p(rVarA, f0Var) : i17 >= 25 ? new y2.n(rVarA, f0Var) : i17 >= 24 ? new y2.m(rVarA, f0Var) : new y2.l(rVarA, f0Var);
                    y1Var.f10103d.b(new i2.e2(pVar));
                    return pVar;
                }
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        q2.o oVar;
        String strB;
        l1.c cVar = this.f10047t;
        cVar.getClass();
        for (long j10 : jArr) {
            q2.p pVar = (q2.p) cVar.d().b((int) j10);
            if (pVar != null && (oVar = pVar.f17643a) != null) {
                b5.b0.q();
                ViewTranslationRequest.Builder builderL = b5.b0.l(cVar.f11675a.getAutofillId(), oVar.f17642g);
                Object objG = oVar.f17639d.f17630a.g(q2.t.A);
                if (objG == null) {
                    objG = null;
                }
                List list = (List) objG;
                if (list != null && (strB = h3.a.b(list, "\n", null, 62)) != null) {
                    builderL.setValue("android:text", TranslationRequestValue.forText(new t2.g(strB)));
                    consumer.accept(builderL.build());
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        b0.w1 w1Var;
        super.onDetachedFromWindow();
        this.f10039m.onViewDetachedFromWindow(this);
        if (this.f10032f) {
            View view = this.f10031e;
            if (view == null) {
                jc.l.k("frameRateCategoryView");
                throw null;
            }
            removeView(view);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 28) {
            o.g0 g0Var = f10025c1;
            synchronized (g0Var) {
                g0Var.i(this);
            }
        }
        h1.y yVar = getSnapshotObserver().f8837a;
        androidx.media3.exoplayer.offline.g gVar = yVar.f8096h;
        if (gVar != null) {
            gVar.i();
        }
        yVar.a();
        this.f10036j.getClass();
        n viewTreeOwners = getViewTreeOwners();
        androidx.lifecycle.q qVarF = viewTreeOwners != null ? viewTreeOwners.f9917a.f() : null;
        if (qVarF == null) {
            throw h0.g("No lifecycle owner exists");
        }
        qVarF.q1(this.f10047t);
        qVarF.q1(this);
        if (e() && (w1Var = this.E) != null) {
            k1.i iVar = k1.i.f10993a;
            iVar.getClass();
            ((AutofillManager) w1Var.f1397e).unregisterCallback(k1.g.l(iVar));
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f10052v0);
        getViewTreeObserver().removeOnScrollChangedListener(this.f10054w0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f10056x0);
        if (i10 >= 31) {
            i0.f9826a.a(this);
        }
        k1.b bVar = this.F;
        if (bVar != null) {
            getSemanticsOwner().f17648d.i(bVar);
            ((o1.k) getFocusOwner()).f16103g.i(bVar);
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (z10 || hasFocus()) {
            return;
        }
        o1.f.e(((o1.k) getFocusOwner()).f16099c, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.V = 0L;
        this.P.j(this.T0);
        this.N = null;
        P();
        if (this.L != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        i2.x0 x0Var = this.P;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                s(getRoot());
            }
            long jH = h(i10);
            long jH2 = h(i11);
            long jW = pc.f0.w((int) (jH >>> 32), (int) (jH & 4294967295L), (int) (jH2 >>> 32), (int) (4294967295L & jH2));
            f3.a aVar = this.N;
            if (aVar == null) {
                this.N = new f3.a(jW);
                this.O = false;
            } else if (!f3.a.b(aVar.f6651a, jW)) {
                this.O = true;
            }
            x0Var.q(jW);
            x0Var.l();
            setMeasuredDimension(getRoot().G.f8805p.f7180a, getRoot().G.f8805p.f7181b);
            if (this.L != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().G.f8805p.f7180a, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().G.f8805p.f7181b, 1073741824));
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onProvideAutofillVirtualStructure(android.view.ViewStructure r12, int r13) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.v.onProvideAutofillVirtualStructure(android.view.ViewStructure, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        c2.q qVar;
        int toolType = motionEvent.getToolType(i10);
        if (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || (!(toolType == 2 || toolType == 4) || (qVar = ((s) getPointerIconService()).f9977a) == null)) {
            return super.onResolvePointerIcon(motionEvent, i10);
        }
        Context context = getContext();
        return qVar instanceof c2.a ? PointerIcon.getSystemIcon(context, ((c2.a) qVar).f3242b) : PointerIcon.getSystemIcon(context, 1000);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        if (this.f10028b) {
            f3.m mVar = f3.m.f6667a;
            f3.m mVar2 = i10 != 0 ? i10 != 1 ? null : f3.m.f6668b : mVar;
            if (mVar2 != null) {
                mVar = mVar2;
            }
            setLayoutDirection(mVar);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        i7.p2 p2Var;
        if (Build.VERSION.SDK_INT >= 31 && (p2Var = this.W0) != null) {
            q2.q semanticsOwner = getSemanticsOwner();
            yb.h coroutineContext = getCoroutineContext();
            z0.e eVar = new z0.e(new p2.h[16]);
            nh.b.F(semanticsOwner.a(), 0, new p2.g(1, 8, z0.e.class, eVar, "add", "add(Ljava/lang/Object;)Z"));
            vb.l.L0(eVar.f26372a, new g5.s(3, new ic.k[]{p2.b.f16504d, p2.b.f16505e}), 0, eVar.f26374c);
            int i10 = eVar.f26374c;
            p2.h hVar = (p2.h) (i10 == 0 ? null : eVar.f26372a[i10 - 1]);
            if (hVar != null) {
                f3.k kVar = hVar.f16522c;
                p2.c cVar = new p2.c(hVar.f16520a, kVar, hf.a0.b(coroutineContext), p2Var, this);
                i2.g1 g1Var = hVar.f16523d;
                p1.c cVarS = g2.n1.i(g1Var).s(g1Var, true);
                long j10 = (((long) kVar.f6662a) << 32) | (((long) kVar.f6663b) & 4294967295L);
                ScrollCaptureTarget scrollCaptureTargetH = b5.b0.h(this, q1.h0.y(g8.a.X(cVarS)), new Point((int) (j10 >> 32), (int) (j10 & 4294967295L)), cVar);
                scrollCaptureTargetH.setScrollBounds(q1.h0.y(kVar));
                consumer.accept(scrollCaptureTargetH);
            }
        }
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        l1.c cVar = this.f10047t;
        cVar.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (jc.l.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            gh.g.u(cVar, longSparseArray);
        } else {
            cVar.f11675a.post(new b5.h(17, cVar, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        boolean zY;
        this.f10036j.f9721a.setValue(Boolean.valueOf(z10));
        this.V0 = true;
        super.onWindowFocusChanged(z10);
        if (!z10 || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (zY = l0.y())) {
            return;
        }
        setShowLayoutBounds(zY);
        r(getRoot());
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int p(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.v.p(android.view.MotionEvent):int");
    }

    @Override // androidx.lifecycle.f
    public final void q(androidx.lifecycle.x xVar) {
        jc.l.e(xVar, "owner");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i10, Rect rect) {
        if (isFocused()) {
            return true;
        }
        if (((o1.k) getFocusOwner()).f16099c.D0().a()) {
            return super.requestFocus(i10, rect);
        }
        o1.d dVarD = o1.f.D(i10);
        int i11 = dVarD != null ? dVarD.f16086a : 7;
        return jc.l.a(((o1.k) getFocusOwner()).e(i11, rect != null ? q1.h0.D(rect) : null, new a0.a0(i11, 1)), Boolean.TRUE);
    }

    public final void s(i2.j0 j0Var) {
        this.P.p(j0Var, false);
        z0.e eVarZ = j0Var.z();
        Object[] objArr = eVarZ.f26372a;
        int i10 = eVarZ.f26374c;
        for (int i11 = 0; i11 < i10; i11++) {
            s((i2.j0) objArr[i11]);
        }
    }

    public void setAccessibilityEventBatchIntervalMillis(long j10) {
        this.f10045s.f9773h = j10;
    }

    public final void setConfigurationChangeObserver(ic.k kVar) {
        this.D = kVar;
    }

    public final void setContentCaptureManager$ui_release(l1.c cVar) {
        this.f10047t = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [j1.p] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [z0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public void setCoroutineContext(yb.h hVar) {
        this.f10034h = hVar;
        j1.p pVar = getRoot().F.f8667f;
        if (pVar instanceof c2.j0) {
            ((c2.j0) pVar).D0();
        }
        if (!pVar.f9690a.f9703n) {
            f2.a.b("visitSubtreeIf called on an unattached node");
        }
        z0.e eVar = new z0.e(new j1.p[16]);
        j1.p pVar2 = pVar.f9690a;
        j1.p pVar3 = pVar2.f9695f;
        if (pVar3 == null) {
            i2.f.b(eVar, pVar2);
        } else {
            eVar.b(pVar3);
        }
        while (true) {
            int i10 = eVar.f26374c;
            if (i10 == 0) {
                return;
            }
            j1.p pVar4 = (j1.p) eVar.k(i10 - 1);
            if ((pVar4.f9693d & 16) != 0) {
                for (j1.p pVar5 = pVar4; pVar5 != null; pVar5 = pVar5.f9695f) {
                    if ((pVar5.f9692c & 16) != 0) {
                        ?? F = pVar5;
                        ?? eVar2 = 0;
                        while (F != 0) {
                            if (F instanceof i2.u1) {
                                i2.u1 u1Var = (i2.u1) F;
                                if (u1Var instanceof c2.j0) {
                                    ((c2.j0) u1Var).D0();
                                }
                            } else if ((F.f9692c & 16) != 0 && (F instanceof i2.n)) {
                                j1.p pVar6 = ((i2.n) F).f8789p;
                                int i11 = 0;
                                F = F;
                                eVar2 = eVar2;
                                while (pVar6 != null) {
                                    if ((pVar6.f9692c & 16) != 0) {
                                        i11++;
                                        eVar2 = eVar2;
                                        if (i11 == 1) {
                                            F = pVar6;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new z0.e(new j1.p[16]);
                                            }
                                            if (F != 0) {
                                                eVar2.b(F);
                                                F = 0;
                                            }
                                            eVar2.b(pVar6);
                                        }
                                    }
                                    pVar6 = pVar6.f9695f;
                                    F = F;
                                    eVar2 = eVar2;
                                }
                                if (i11 == 1) {
                                }
                            }
                            F = i2.f.f(eVar2);
                        }
                    }
                }
            }
            i2.f.b(eVar, pVar4);
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j10) {
        this.V = j10;
    }

    public final void setOnViewTreeOwnersAvailable(ic.k kVar) {
        n viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            kVar.a(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.f10050u0 = kVar;
    }

    public void setShowLayoutBounds(boolean z10) {
        this.K = z10;
    }

    public void setUncaughtExceptionHandler(i2.w1 w1Var) {
        this.P.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final boolean u(MotionEvent motionEvent) {
        float x3 = motionEvent.getX();
        float y5 = motionEvent.getY();
        return 0.0f <= x3 && x3 <= ((float) getWidth()) && 0.0f <= y5 && y5 <= ((float) getHeight());
    }

    public final boolean v(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.K0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public final void w(float[] fArr) {
        G();
        q1.a0.e(fArr, this.T);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.q0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.q0 & 4294967295L));
        float[] fArr2 = this.S;
        q1.a0.d(fArr2);
        q1.a0.f(fArr2, fIntBitsToFloat, fIntBitsToFloat2);
        l0.E(fArr, fArr2);
    }

    public final long x(long j10) {
        G();
        long jB = q1.a0.b(j10, this.T);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.q0 >> 32)) + Float.intBitsToFloat((int) (jB >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.q0 & 4294967295L)) + Float.intBitsToFloat((int) (jB & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final void y(boolean z10) {
        t tVar;
        i2.x0 x0Var = this.P;
        if (x0Var.f8898b.J() || ((z0.e) x0Var.f8901e.f968b).f26374c != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z10) {
                try {
                    tVar = this.T0;
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            } else {
                tVar = null;
            }
            if (x0Var.j(tVar)) {
                requestLayout();
            }
            x0Var.a(false);
            if (this.A) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.A = false;
            }
            Trace.endSection();
        }
    }

    public final void z(i2.j0 j0Var, long j10) {
        i2.x0 x0Var = this.P;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            x0Var.k(j0Var, j10);
            if (!x0Var.f8898b.J()) {
                x0Var.a(false);
                if (this.A) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.A = false;
                }
            }
            getRectManager().b();
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10) {
        jc.l.b(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i10, layoutParams, true);
    }

    public g getAccessibilityManager() {
        return this.f10049u;
    }

    public h getClipboard() {
        return this.I;
    }

    public i getClipboardManager() {
        return this.H;
    }

    /* JADX INFO: renamed from: getDragAndDropManager, reason: merged with bridge method [inline-methods] */
    public m1.a m4getDragAndDropManager() {
        return this.f10035i;
    }

    public o.y getLayoutNodes() {
        return this.f10041o;
    }

    public v getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i10;
        layoutParamsGenerateDefaultLayoutParams.height = i11;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i10, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @ub.c
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @ub.c
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public View getView() {
        return this;
    }

    @Override // androidx.lifecycle.f
    public final /* synthetic */ void k(androidx.lifecycle.x xVar) {
    }

    @Override // androidx.lifecycle.f
    public final /* synthetic */ void n(androidx.lifecycle.x xVar) {
    }

    @Override // androidx.lifecycle.f
    public final /* synthetic */ void o(androidx.lifecycle.x xVar) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public final void setUncaughtExceptionHandler$ui_release(i2.w1 w1Var) {
    }
}
