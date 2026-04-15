package j2;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.cnl.kikoeru.R;
import com.tencent.bugly.BuglyStrategy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends u3.b {
    public static final o.x Q;
    public boolean A;
    public a0 B;
    public o.y C;
    public final o.z D;
    public final o.w E;
    public final o.w F;
    public final String G;
    public final String H;
    public final c7.e1 I;
    public final o.y J;
    public t2 K;
    public boolean L;
    public final o.w M;
    public final a9.m N;
    public final ArrayList O;
    public final c0 P;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f9769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9770e = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c0 f9771f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AccessibilityManager f9772g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f9773h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w f9774i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x f9775j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f9776k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Handler f9777l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final z f9778m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f9779n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f9780o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public v3.d f9781p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public v3.d f9782q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f9783r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final o.y f9784s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o.y f9785t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final o.v0 f9786u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final o.v0 f9787v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f9788w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Integer f9789x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final o.f f9790y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final kf.f f9791z;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        o.x xVar = o.l.f16001a;
        o.x xVar2 = new o.x(32);
        int i10 = xVar2.f16071b;
        if (i10 < 0) {
            p.a.d("");
            throw null;
        }
        int i11 = i10 + 32;
        xVar2.b(i11);
        int[] iArr2 = xVar2.f16070a;
        int i12 = xVar2.f16071b;
        if (i10 != i12) {
            vb.l.h0(i11, i10, i12, iArr2, iArr2);
        }
        vb.l.l0(i10, 0, 12, iArr, iArr2);
        xVar2.f16071b += 32;
        Q = xVar2;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [j2.w] */
    /* JADX WARN: Type inference failed for: r3v4, types: [j2.x] */
    public d0(v vVar) {
        this.f9769d = vVar;
        int i10 = 0;
        this.f9771f = new c0(this, i10);
        Object systemService = vVar.getContext().getSystemService("accessibility");
        jc.l.c(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f9772g = accessibilityManager;
        this.f9773h = 100L;
        this.f9774i = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: j2.w
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z10) {
                d0 d0Var = this.f10066a;
                d0Var.f9776k = z10 ? d0Var.f9772g.getEnabledAccessibilityServiceList(-1) : vb.r.f22819a;
            }
        };
        this.f9775j = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: j2.x
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z10) {
                d0 d0Var = this.f10091a;
                d0Var.f9776k = d0Var.f9772g.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.f9776k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f9777l = new Handler(Looper.getMainLooper());
        this.f9778m = new z(this);
        this.f9779n = Integer.MIN_VALUE;
        this.f9780o = Integer.MIN_VALUE;
        this.f9784s = new o.y();
        this.f9785t = new o.y();
        this.f9786u = new o.v0(0);
        this.f9787v = new o.v0(0);
        this.f9788w = -1;
        this.f9790y = new o.f(0);
        this.f9791z = g8.a.c(1, 6, null);
        this.A = true;
        o.y yVar = o.n.f16024a;
        jc.l.c(yVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.C = yVar;
        this.D = new o.z();
        this.E = new o.w();
        this.F = new o.w();
        this.G = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.H = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.I = new c7.e1(5);
        this.J = new o.y();
        q2.o oVarA = vVar.getSemanticsOwner().a();
        jc.l.c(yVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.K = new t2(oVarA, yVar);
        int i11 = o.j.f15991a;
        this.M = new o.w();
        vVar.addOnAttachStateChangeListener(new y(i10, this));
        this.N = new a9.m(17, this);
        this.O = new ArrayList();
        this.P = new c0(this, 1);
    }

    public static /* synthetic */ void E(d0 d0Var, int i10, int i11, Integer num, int i12) {
        if ((i12 & 4) != 0) {
            num = null;
        }
        d0Var.D(i10, i11, num, null);
    }

    public static Rect L(q1.h0 h0Var) {
        if (!(h0Var instanceof q1.c0) && !(h0Var instanceof q1.d0)) {
            return null;
        }
        p1.c cVarO = h0Var.o();
        return new Rect((int) cVarO.f16483a, (int) cVarO.f16484b, (int) cVarO.f16485c, (int) cVarO.f16486d);
    }

    public static float[] M(q1.h0 h0Var) {
        if (!(h0Var instanceof q1.d0)) {
            return null;
        }
        p1.d dVar = ((q1.d0) h0Var).f17497e;
        long j10 = dVar.f16494h;
        long j11 = dVar.f16493g;
        long j12 = dVar.f16492f;
        long j13 = dVar.f16491e;
        return new float[]{Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j13 & 4294967295L)), Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L)), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)), Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L))};
    }

    public static Region N(q1.h0 h0Var) {
        if (!(h0Var instanceof q1.b0)) {
            return null;
        }
        q1.b0 b0Var = (q1.b0) h0Var;
        p1.c cVarO = b0Var.o();
        Region region = new Region(new Rect((int) cVarO.f16483a, (int) cVarO.f16484b, (int) cVarO.f16485c, (int) cVarO.f16486d));
        Region region2 = new Region();
        q1.e0 e0Var = b0Var.f17493e;
        if (!(e0Var instanceof q1.h)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        region2.setPath(((q1.h) e0Var).f17511a, region);
        return region2;
    }

    public static CharSequence O(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int length = charSequence.length();
            int i10 = BuglyStrategy.a.MAX_USERDATA_VALUE_LENGTH;
            if (length > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(BuglyStrategy.a.MAX_USERDATA_VALUE_LENGTH))) {
                    i10 = 99999;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i10);
                jc.l.c(charSequenceSubSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    public static String u(q2.o oVar) {
        t2.g gVar;
        if (oVar != null) {
            q2.k kVar = oVar.f17639d;
            o.k0 k0Var = kVar.f17630a;
            q2.w wVar = q2.t.f17670a;
            if (k0Var.c(wVar)) {
                return h3.a.b((List) kVar.j(wVar), ",", null, 62);
            }
            q2.w wVar2 = q2.t.E;
            if (k0Var.c(wVar2)) {
                Object objG = k0Var.g(wVar2);
                if (objG == null) {
                    objG = null;
                }
                t2.g gVar2 = (t2.g) objG;
                if (gVar2 != null) {
                    return gVar2.f20320b;
                }
            } else {
                Object objG2 = k0Var.g(q2.t.A);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                if (list != null && (gVar = (t2.g) vb.m.a0(list)) != null) {
                    return gVar.f20320b;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ic.a, jc.m] */
    /* JADX WARN: Type inference failed for: r3v2, types: [ic.a, jc.m] */
    public static final boolean x(q2.i iVar, float f10) {
        ?? r0 = iVar.f17602a;
        if (f10 >= 0.0f || ((Number) r0.b()).floatValue() <= 0.0f) {
            return f10 > 0.0f && ((Number) r0.b()).floatValue() < ((Number) iVar.f17603b.b()).floatValue();
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ic.a, jc.m] */
    /* JADX WARN: Type inference failed for: r3v1, types: [ic.a, jc.m] */
    public static final boolean y(q2.i iVar) {
        ?? r0 = iVar.f17602a;
        if (((Number) r0.b()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) r0.b()).floatValue();
        ((Number) iVar.f17603b.b()).floatValue();
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ic.a, jc.m] */
    /* JADX WARN: Type inference failed for: r2v1, types: [ic.a, jc.m] */
    public static final boolean z(q2.i iVar) {
        ?? r0 = iVar.f17602a;
        if (((Number) r0.b()).floatValue() < ((Number) iVar.f17603b.b()).floatValue()) {
            return true;
        }
        ((Number) r0.b()).floatValue();
        return false;
    }

    public final int A(int i10) {
        if (i10 == this.f9769d.getSemanticsOwner().a().f17642g) {
            return -1;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(q2.o r21, j2.t2 r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            int[] r3 = o.o.f16027a
            o.z r3 = new o.z
            r3.<init>()
            r4 = 4
            java.util.List r5 = q2.o.j(r4, r1)
            i2.j0 r6 = r1.f17638c
            r7 = r5
            java.util.Collection r7 = (java.util.Collection) r7
            int r7 = r7.size()
            r8 = 0
            r9 = 0
        L1d:
            if (r9 >= r7) goto L43
            java.lang.Object r10 = r5.get(r9)
            q2.o r10 = (q2.o) r10
            o.m r11 = r0.t()
            int r10 = r10.f17642g
            boolean r11 = r11.a(r10)
            if (r11 == 0) goto L40
            o.z r11 = r2.f10011b
            boolean r11 = r11.b(r10)
            if (r11 != 0) goto L3d
            r0.w(r6)
            return
        L3d:
            r3.a(r10)
        L40:
            int r9 = r9 + 1
            goto L1d
        L43:
            o.z r2 = r2.f10011b
            int[] r5 = r2.f16074b
            long[] r2 = r2.f16073a
            int r7 = r2.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L8e
            r9 = 0
        L4f:
            r10 = r2[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 == 0) goto L89
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        L69:
            if (r14 >= r12) goto L87
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r19 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r19 >= 0) goto L83
            int r15 = r9 << 3
            int r15 = r15 + r14
            r15 = r5[r15]
            boolean r15 = r3.b(r15)
            if (r15 != 0) goto L83
            r0.w(r6)
            return
        L83:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L69
        L87:
            if (r12 != r13) goto L8e
        L89:
            if (r9 == r7) goto L8e
            int r9 = r9 + 1
            goto L4f
        L8e:
            java.util.List r1 = q2.o.j(r4, r1)
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
        L99:
            if (r8 >= r2) goto Lbf
            java.lang.Object r3 = r1.get(r8)
            q2.o r3 = (q2.o) r3
            o.y r4 = r0.J
            int r5 = r3.f17642g
            java.lang.Object r4 = r4.b(r5)
            j2.t2 r4 = (j2.t2) r4
            if (r4 == 0) goto Lbc
            o.m r5 = r0.t()
            int r6 = r3.f17642g
            boolean r5 = r5.a(r6)
            if (r5 == 0) goto Lbc
            r0.B(r3, r4)
        Lbc:
            int r8 = r8 + 1
            goto L99
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.d0.B(q2.o, j2.t2):void");
    }

    public final boolean C(AccessibilityEvent accessibilityEvent) {
        if (!v()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f9783r = true;
        }
        try {
            return ((Boolean) this.f9771f.a(accessibilityEvent)).booleanValue();
        } finally {
            this.f9783r = false;
        }
    }

    public final boolean D(int i10, int i11, Integer num, List list) {
        if (i10 == Integer.MIN_VALUE || !v()) {
            return false;
        }
        AccessibilityEvent accessibilityEventO = o(i10, i11);
        if (num != null) {
            accessibilityEventO.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventO.setContentDescription(h3.a.b(list, ",", null, 62));
        }
        return C(accessibilityEventO);
    }

    public final void F(int i10, int i11, String str) {
        AccessibilityEvent accessibilityEventO = o(A(i10), 32);
        accessibilityEventO.setContentChangeTypes(i11);
        if (str != null) {
            accessibilityEventO.getText().add(str);
        }
        C(accessibilityEventO);
    }

    public final void G(int i10) {
        a0 a0Var = this.B;
        if (a0Var != null) {
            q2.o oVar = a0Var.f9715a;
            if (i10 != oVar.f17642g) {
                return;
            }
            if (SystemClock.uptimeMillis() - a0Var.f9720f <= 1000) {
                AccessibilityEvent accessibilityEventO = o(A(oVar.f17642g), 131072);
                accessibilityEventO.setFromIndex(a0Var.f9718d);
                accessibilityEventO.setToIndex(a0Var.f9719e);
                accessibilityEventO.setAction(a0Var.f9716b);
                accessibilityEventO.setMovementGranularity(a0Var.f9717c);
                accessibilityEventO.getText().add(u(oVar));
                C(accessibilityEventO);
            }
        }
        this.B = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:214:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(o.m r60) {
        /*
            Method dump skipped, instruction units count: 1574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.d0.H(o.m):void");
    }

    public final void I(i2.j0 j0Var, o.z zVar) {
        q2.k kVarX;
        if (j0Var.I() && !this.f9769d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(j0Var)) {
            i2.j0 j0Var2 = null;
            if (!j0Var.F.d(8)) {
                j0Var = j0Var.v();
                while (true) {
                    if (j0Var == null) {
                        j0Var = null;
                        break;
                    } else if (j0Var.F.d(8)) {
                        break;
                    } else {
                        j0Var = j0Var.v();
                    }
                }
            }
            if (j0Var == null || (kVarX = j0Var.x()) == null) {
                return;
            }
            if (!kVarX.f17632c) {
                i2.j0 j0VarV = j0Var.v();
                while (true) {
                    if (j0VarV != null) {
                        q2.k kVarX2 = j0VarV.x();
                        if (kVarX2 != null && kVarX2.f17632c) {
                            j0Var2 = j0VarV;
                            break;
                        }
                        j0VarV = j0VarV.v();
                    } else {
                        break;
                    }
                }
                if (j0Var2 != null) {
                    j0Var = j0Var2;
                }
            }
            int i10 = j0Var.f8743b;
            if (zVar.a(i10)) {
                E(this, A(i10), 2048, 1, 8);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [ic.a, jc.m] */
    /* JADX WARN: Type inference failed for: r0v18, types: [ic.a, jc.m] */
    /* JADX WARN: Type inference failed for: r0v8, types: [ic.a, jc.m] */
    /* JADX WARN: Type inference failed for: r2v1, types: [ic.a, jc.m] */
    public final void J(i2.j0 j0Var) {
        if (j0Var.I() && !this.f9769d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(j0Var)) {
            int i10 = j0Var.f8743b;
            q2.i iVar = (q2.i) this.f9784s.b(i10);
            q2.i iVar2 = (q2.i) this.f9785t.b(i10);
            if (iVar == null && iVar2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventO = o(i10, 4096);
            if (iVar != null) {
                accessibilityEventO.setScrollX((int) ((Number) iVar.f17602a.b()).floatValue());
                accessibilityEventO.setMaxScrollX((int) ((Number) iVar.f17603b.b()).floatValue());
            }
            if (iVar2 != null) {
                accessibilityEventO.setScrollY((int) ((Number) iVar2.f17602a.b()).floatValue());
                accessibilityEventO.setMaxScrollY((int) ((Number) iVar2.f17603b.b()).floatValue());
            }
            C(accessibilityEventO);
        }
    }

    public final boolean K(q2.o oVar, int i10, int i11, boolean z10) {
        String strU;
        q2.k kVar = oVar.f17639d;
        int i12 = oVar.f17642g;
        q2.w wVar = q2.j.f17612i;
        if (kVar.f17630a.c(wVar) && l0.h(oVar)) {
            ic.o oVar2 = (ic.o) ((q2.a) oVar.f17639d.j(wVar)).f17587b;
            if (oVar2 != null) {
                return ((Boolean) oVar2.g(Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
            }
        } else if ((i10 != i11 || i11 != this.f9788w) && (strU = u(oVar)) != null) {
            if (i10 < 0 || i10 != i11 || i11 > strU.length()) {
                i10 = -1;
            }
            this.f9788w = i10;
            boolean z11 = strU.length() > 0;
            C(q(A(i12), z11 ? Integer.valueOf(this.f9788w) : null, z11 ? Integer.valueOf(this.f9788w) : null, z11 ? Integer.valueOf(strU.length()) : null, strU));
            G(i12);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x013a, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0144, code lost:
    
        if (((r7 & ((~r7) << 6)) & r20) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0146, code lost:
    
        r1 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P() {
        /*
            Method dump skipped, instruction units count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.d0.P():void");
    }

    @Override // u3.b
    public final r.y1 b(View view) {
        return this.f9778m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(int i10, v3.d dVar, String str, Bundle bundle) {
        q2.o oVar;
        Region regionN;
        float[] fArrM;
        Rect rectL;
        AccessibilityNodeInfo accessibilityNodeInfo;
        int i11;
        RectF rectF;
        AccessibilityNodeInfo accessibilityNodeInfo2 = dVar.f22380a;
        q2.p pVar = (q2.p) t().b(i10);
        if (pVar == null || (oVar = pVar.f17643a) == null) {
            return;
        }
        q2.k kVar = oVar.f17639d;
        o.k0 k0Var = kVar.f17630a;
        String strU = u(oVar);
        if (jc.l.a(str, this.G)) {
            int iD = this.E.d(i10);
            if (iD != -1) {
                accessibilityNodeInfo2.getExtras().putInt(str, iD);
                return;
            }
            return;
        }
        if (jc.l.a(str, this.H)) {
            int iD2 = this.F.d(i10);
            if (iD2 != -1) {
                accessibilityNodeInfo2.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        i2.g1 g1Var = null;
        if (k0Var.c(q2.j.f17604a) && bundle != null && jc.l.a(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i12 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i13 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i13 > 0 && i12 >= 0) {
                if (i12 < (strU != null ? strU.length() : Integer.MAX_VALUE)) {
                    t2.i0 i0VarZ = l0.z(kVar);
                    if (i0VarZ == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    int i14 = 0;
                    while (i14 < i13) {
                        int i15 = i12 + i14;
                        if (i15 >= i0VarZ.f20344a.f20326a.f20320b.length()) {
                            arrayList.add(g1Var);
                            accessibilityNodeInfo = accessibilityNodeInfo2;
                            i11 = i13;
                        } else {
                            p1.c cVarB = i0VarZ.b(i15);
                            i2.g1 g1VarD = oVar.d();
                            long jH = 0;
                            if (g1VarD != null) {
                                if (!g1VarD.M0().f9703n) {
                                    g1VarD = g1Var;
                                }
                                if (g1VarD != null) {
                                    jH = g1VarD.H(0L);
                                }
                            }
                            p1.c cVarI = cVarB.i(jH);
                            p1.c cVarG = oVar.g();
                            p1.c cVarE = cVarI.g(cVarG) ? cVarI.e(cVarG) : g1Var;
                            if (cVarE != 0) {
                                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(cVarE.f16484b)) & 4294967295L) | (((long) Float.floatToRawIntBits(cVarE.f16483a)) << 32);
                                v vVar = this.f9769d;
                                long jX = vVar.x(jFloatToRawIntBits);
                                long jX2 = vVar.x((((long) Float.floatToRawIntBits(cVarE.f16485c)) << 32) | (((long) Float.floatToRawIntBits(cVarE.f16486d)) & 4294967295L));
                                int i16 = (int) (jX >> 32);
                                int i17 = (int) (jX2 >> 32);
                                accessibilityNodeInfo = accessibilityNodeInfo2;
                                i11 = i13;
                                int i18 = (int) (jX & 4294967295L);
                                int i19 = (int) (jX2 & 4294967295L);
                                rectF = new RectF(Math.min(Float.intBitsToFloat(i16), Float.intBitsToFloat(i17)), Math.min(Float.intBitsToFloat(i18), Float.intBitsToFloat(i19)), Math.max(Float.intBitsToFloat(i16), Float.intBitsToFloat(i17)), Math.max(Float.intBitsToFloat(i18), Float.intBitsToFloat(i19)));
                            } else {
                                accessibilityNodeInfo = accessibilityNodeInfo2;
                                i11 = i13;
                                rectF = null;
                            }
                            arrayList.add(rectF);
                        }
                        i14++;
                        i13 = i11;
                        accessibilityNodeInfo2 = accessibilityNodeInfo;
                        g1Var = null;
                    }
                    accessibilityNodeInfo2.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        q2.w wVar = q2.t.f17694y;
        if (k0Var.c(wVar) && bundle != null && jc.l.a(str, "androidx.compose.ui.semantics.testTag")) {
            Object objG = k0Var.g(wVar);
            String str2 = (String) (objG == null ? null : objG);
            if (str2 != null) {
                accessibilityNodeInfo2.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (jc.l.a(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfo2.getExtras().putInt(str, oVar.f17642g);
            return;
        }
        if (jc.l.a(str, "androidx.compose.ui.semantics.shapeType")) {
            Object objG2 = k0Var.g(q2.t.O);
            q1.l0 l0Var = (q1.l0) (objG2 == null ? null : objG2);
            if (l0Var != null) {
                q1.h0 h0VarP = p(l0Var, oVar);
                if (h0VarP instanceof q1.c0) {
                    accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L(h0VarP));
                    return;
                } else if (h0VarP instanceof q1.d0) {
                    accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L(h0VarP));
                    accessibilityNodeInfo2.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", M(h0VarP));
                    return;
                } else {
                    if (!(h0VarP instanceof q1.b0)) {
                        throw new ce.j0();
                    }
                    accessibilityNodeInfo2.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", N(h0VarP));
                    return;
                }
            }
            return;
        }
        if (jc.l.a(str, "androidx.compose.ui.semantics.shapeRect")) {
            Object objG3 = k0Var.g(q2.t.O);
            q1.l0 l0Var2 = (q1.l0) (objG3 == null ? null : objG3);
            if (l0Var2 == null || (rectL = L(p(l0Var2, oVar))) == null) {
                return;
            }
            accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", rectL);
            return;
        }
        if (jc.l.a(str, "androidx.compose.ui.semantics.shapeCorners")) {
            Object objG4 = k0Var.g(q2.t.O);
            q1.l0 l0Var3 = (q1.l0) (objG4 == null ? null : objG4);
            if (l0Var3 == null || (fArrM = M(p(l0Var3, oVar))) == null) {
                return;
            }
            accessibilityNodeInfo2.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrM);
            return;
        }
        if (jc.l.a(str, "androidx.compose.ui.semantics.shapeRegion")) {
            Object objG5 = k0Var.g(q2.t.O);
            q1.l0 l0Var4 = (q1.l0) (objG5 == null ? null : objG5);
            if (l0Var4 == null || (regionN = N(p(l0Var4, oVar))) == null) {
                return;
            }
            accessibilityNodeInfo2.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionN);
        }
    }

    public final Rect k(q2.p pVar) {
        f3.k kVar = pVar.f17644b;
        float f10 = kVar.f6662a;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(kVar.f6663b)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
        v vVar = this.f9769d;
        long jX = vVar.x(jFloatToRawIntBits);
        long jX2 = vVar.x((((long) Float.floatToRawIntBits(kVar.f6664c)) << 32) | (((long) Float.floatToRawIntBits(kVar.f6665d)) & 4294967295L));
        int i10 = (int) (jX >> 32);
        int i11 = (int) (jX2 >> 32);
        int i12 = (int) (jX & 4294967295L);
        int i13 = (int) (jX2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11))), (int) Math.floor(Math.min(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f2, code lost:
    
        if (hf.a0.l(r4, r2) == r7) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:13:0x0030, B:24:0x005d, B:28:0x006f, B:30:0x0077, B:32:0x0080, B:34:0x0086, B:35:0x0095, B:37:0x009d, B:20:0x0047, B:23:0x004e), top: B:57:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00f2 -> B:50:0x00f5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(ac.c r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.d0.l(ac.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f5  */
    /* JADX WARN: Type inference failed for: r1v20, types: [ic.a, jc.m] */
    /* JADX WARN: Type inference failed for: r2v9, types: [ic.a, jc.m] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(int r23, boolean r24, long r25) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.d0.m(int, boolean, long):boolean");
    }

    public final void n() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (v()) {
                B(this.f9769d.getSemanticsOwner().a(), this.K);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                H(t());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    P();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final AccessibilityEvent o(int i10, int i11) {
        q2.p pVar;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i11);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        v vVar = this.f9769d;
        accessibilityEventObtain.setPackageName(vVar.getContext().getPackageName());
        accessibilityEventObtain.setSource(vVar, i10);
        if (v() && (pVar = (q2.p) t().b(i10)) != null) {
            q2.o oVar = pVar.f17643a;
            accessibilityEventObtain.setPassword(oVar.f17639d.f17630a.c(q2.t.J));
            Object objG = oVar.f17639d.f17630a.g(q2.t.f17683n);
            if (objG == null) {
                objG = null;
            }
            boolean zA = jc.l.a(objG, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                d.a.g(accessibilityEventObtain, zA);
            }
        }
        return accessibilityEventObtain;
    }

    public final q1.h0 p(q1.l0 l0Var, q2.o oVar) {
        i2.g1 g1VarD = oVar.d();
        return l0Var.a(gh.g.R(g1VarD != null ? g1VarD.f7182c : 0L), oVar.f17638c.f8767z, this.f9769d.getDensity());
    }

    public final AccessibilityEvent q(int i10, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventO = o(i10, 8192);
        if (num != null) {
            accessibilityEventO.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventO.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventO.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventO.getText().add(charSequence);
        }
        return accessibilityEventO;
    }

    public final int r(q2.o oVar) {
        q2.k kVar = oVar.f17639d;
        q2.k kVar2 = oVar.f17639d;
        q2.w wVar = q2.t.f17670a;
        if (!kVar.f17630a.c(q2.t.f17670a)) {
            q2.w wVar2 = q2.t.F;
            if (kVar2.f17630a.c(wVar2)) {
                return (int) (((t2.k0) kVar2.j(wVar2)).f20358a & 4294967295L);
            }
        }
        return this.f9788w;
    }

    public final int s(q2.o oVar) {
        q2.k kVar = oVar.f17639d;
        q2.k kVar2 = oVar.f17639d;
        q2.w wVar = q2.t.f17670a;
        if (!kVar.f17630a.c(q2.t.f17670a)) {
            q2.w wVar2 = q2.t.F;
            if (kVar2.f17630a.c(wVar2)) {
                return (int) (((t2.k0) kVar2.j(wVar2)).f20358a >> 32);
            }
        }
        return this.f9788w;
    }

    public final o.m t() {
        if (this.A) {
            this.A = false;
            v vVar = this.f9769d;
            this.C = q2.r.b(vVar.getSemanticsOwner());
            if (v()) {
                o.y yVar = this.C;
                Resources resources = vVar.getContext().getResources();
                o.w wVar = this.E;
                wVar.a();
                o.w wVar2 = this.F;
                wVar2.a();
                q2.p pVar = (q2.p) yVar.b(-1);
                q2.o oVar = pVar != null ? pVar.f17643a : null;
                jc.l.b(oVar);
                ArrayList arrayListB = q2.x.b(oVar, new a0.f0(19, yVar), new a0.f0(20, resources), ud.b.w(oVar));
                int iR = ud.b.r(arrayListB);
                int i10 = 1;
                if (1 <= iR) {
                    while (true) {
                        int i11 = ((q2.o) arrayListB.get(i10 - 1)).f17642g;
                        int i12 = ((q2.o) arrayListB.get(i10)).f17642g;
                        wVar.f(i11, i12);
                        wVar2.f(i12, i11);
                        if (i10 == iR) {
                            break;
                        }
                        i10++;
                    }
                }
            }
        }
        return this.C;
    }

    public final boolean v() {
        return this.f9772g.isEnabled() && !this.f9776k.isEmpty();
    }

    public final void w(i2.j0 j0Var) {
        if (this.f9790y.add(j0Var)) {
            this.f9791z.e(ub.a0.f21526a);
        }
    }
}
