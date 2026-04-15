package u3;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class m0 extends t0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f21308i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Method f21309j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Class f21310k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static Field f21311l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static Field f21312m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowInsets f21313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p3.b[] f21314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p3.b f21315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public w0 f21316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p3.b f21317g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f21318h;

    public m0(w0 w0Var, WindowInsets windowInsets) {
        super(w0Var);
        this.f21315e = null;
        this.f21313c = windowInsets;
    }

    private static void B() {
        try {
            f21309j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f21310k = cls;
            f21311l = cls.getDeclaredField("mVisibleInsets");
            f21312m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f21311l.setAccessible(true);
            f21312m.setAccessible(true);
        } catch (ReflectiveOperationException e10) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
        }
        f21308i = true;
    }

    public static boolean C(int i10, int i11) {
        return (i10 & 6) == (i11 & 6);
    }

    private p3.b w(int i10, boolean z10) {
        p3.b bVarA = p3.b.f16524e;
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                bVarA = p3.b.a(bVarA, x(i11, z10));
            }
        }
        return bVarA;
    }

    private p3.b y() {
        w0 w0Var = this.f21316f;
        return w0Var != null ? w0Var.f21343a.j() : p3.b.f16524e;
    }

    private p3.b z(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f21308i) {
            B();
        }
        Method method = f21309j;
        if (method != null && f21310k != null && f21311l != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f21311l.get(f21312m.get(objInvoke));
                if (rect != null) {
                    return p3.b.b(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
        }
        return null;
    }

    public boolean A(int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 8 && i10 != 128) {
                return true;
            }
        }
        return !x(i10, false).equals(p3.b.f16524e);
    }

    @Override // u3.t0
    public void d(View view) {
        p3.b bVarZ = z(view);
        if (bVarZ == null) {
            bVarZ = p3.b.f16524e;
        }
        s(bVarZ);
    }

    @Override // u3.t0
    public void e(w0 w0Var) {
        w0Var.f21343a.t(this.f21316f);
        p3.b bVar = this.f21317g;
        t0 t0Var = w0Var.f21343a;
        t0Var.s(bVar);
        t0Var.v(this.f21318h);
    }

    @Override // u3.t0
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return Objects.equals(this.f21317g, m0Var.f21317g) && C(this.f21318h, m0Var.f21318h);
    }

    @Override // u3.t0
    public p3.b g(int i10) {
        return w(i10, false);
    }

    @Override // u3.t0
    public p3.b h(int i10) {
        return w(i10, true);
    }

    @Override // u3.t0
    public final p3.b l() {
        if (this.f21315e == null) {
            WindowInsets windowInsets = this.f21313c;
            this.f21315e = p3.b.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f21315e;
    }

    @Override // u3.t0
    public w0 n(int i10, int i11, int i12, int i13) {
        w0 w0VarC = w0.c(null, this.f21313c);
        int i14 = Build.VERSION.SDK_INT;
        l0 k0Var = i14 >= 34 ? new k0(w0VarC) : i14 >= 31 ? new j0(w0VarC) : i14 >= 30 ? new i0(w0VarC) : i14 >= 29 ? new h0(w0VarC) : new g0(w0VarC);
        k0Var.g(w0.a(l(), i10, i11, i12, i13));
        k0Var.e(w0.a(j(), i10, i11, i12, i13));
        return k0Var.b();
    }

    @Override // u3.t0
    public boolean p() {
        return this.f21313c.isRound();
    }

    @Override // u3.t0
    public boolean q(int i10) {
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0 && !A(i11)) {
                return false;
            }
        }
        return true;
    }

    @Override // u3.t0
    public void r(p3.b[] bVarArr) {
        this.f21314d = bVarArr;
    }

    @Override // u3.t0
    public void s(p3.b bVar) {
        this.f21317g = bVar;
    }

    @Override // u3.t0
    public void t(w0 w0Var) {
        this.f21316f = w0Var;
    }

    @Override // u3.t0
    public void v(int i10) {
        this.f21318h = i10;
    }

    public p3.b x(int i10, boolean z10) {
        p3.b bVarJ;
        int i11;
        p3.b bVar = p3.b.f16524e;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 8) {
                    p3.b[] bVarArr = this.f21314d;
                    bVarJ = bVarArr != null ? bVarArr[n7.e.v(8)] : null;
                    if (bVarJ != null) {
                        return bVarJ;
                    }
                    p3.b bVarL = l();
                    p3.b bVarY = y();
                    int i12 = bVarL.f16528d;
                    if (i12 > bVarY.f16528d) {
                        return p3.b.b(0, 0, 0, i12);
                    }
                    p3.b bVar2 = this.f21317g;
                    if (bVar2 != null && !bVar2.equals(bVar) && (i11 = this.f21317g.f16528d) > bVarY.f16528d) {
                        return p3.b.b(0, 0, 0, i11);
                    }
                } else {
                    if (i10 == 16) {
                        return k();
                    }
                    if (i10 == 32) {
                        return i();
                    }
                    if (i10 == 64) {
                        return m();
                    }
                    if (i10 == 128) {
                        w0 w0Var = this.f21316f;
                        c cVarF = w0Var != null ? w0Var.f21343a.f() : f();
                        if (cVarF != null) {
                            int i13 = Build.VERSION.SDK_INT;
                            return p3.b.b(i13 >= 28 ? m3.e.f(cVarF.f21275a) : 0, i13 >= 28 ? m3.e.h(cVarF.f21275a) : 0, i13 >= 28 ? m3.e.g(cVarF.f21275a) : 0, i13 >= 28 ? m3.e.e(cVarF.f21275a) : 0);
                        }
                    }
                }
            } else {
                if (z10) {
                    p3.b bVarY2 = y();
                    p3.b bVarJ2 = j();
                    return p3.b.b(Math.max(bVarY2.f16525a, bVarJ2.f16525a), 0, Math.max(bVarY2.f16527c, bVarJ2.f16527c), Math.max(bVarY2.f16528d, bVarJ2.f16528d));
                }
                if ((this.f21318h & 2) == 0) {
                    p3.b bVarL2 = l();
                    w0 w0Var2 = this.f21316f;
                    bVarJ = w0Var2 != null ? w0Var2.f21343a.j() : null;
                    int iMin = bVarL2.f16528d;
                    if (bVarJ != null) {
                        iMin = Math.min(iMin, bVarJ.f16528d);
                    }
                    return p3.b.b(bVarL2.f16525a, 0, bVarL2.f16527c, iMin);
                }
            }
        } else {
            if (z10) {
                return p3.b.b(0, Math.max(y().f16526b, l().f16526b), 0, 0);
            }
            if ((this.f21318h & 4) == 0) {
                return p3.b.b(0, l().f16526b, 0, 0);
            }
        }
        return bVar;
    }

    public m0(w0 w0Var, m0 m0Var) {
        this(w0Var, new WindowInsets(m0Var.f21313c));
    }
}
