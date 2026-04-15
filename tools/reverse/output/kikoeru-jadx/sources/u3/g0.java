package u3;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends l0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Field f21294e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f21295f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Constructor f21296g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f21297h = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WindowInsets f21298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p3.b f21299d;

    public g0() {
        this.f21298c = i();
    }

    private static WindowInsets i() {
        if (!f21295f) {
            try {
                f21294e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
            }
            f21295f = true;
        }
        Field field = f21294e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
            }
        }
        if (!f21297h) {
            try {
                f21296g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e12) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
            }
            f21297h = true;
        }
        Constructor constructor = f21296g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e13) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
            }
        }
        return null;
    }

    @Override // u3.l0
    public w0 b() {
        a();
        w0 w0VarC = w0.c(null, this.f21298c);
        p3.b[] bVarArr = this.f21307b;
        t0 t0Var = w0VarC.f21343a;
        t0Var.r(bVarArr);
        t0Var.u(this.f21299d);
        return w0VarC;
    }

    @Override // u3.l0
    public void e(p3.b bVar) {
        this.f21299d = bVar;
    }

    @Override // u3.l0
    public void g(p3.b bVar) {
        WindowInsets windowInsets = this.f21298c;
        if (windowInsets != null) {
            this.f21298c = windowInsets.replaceSystemWindowInsets(bVar.f16525a, bVar.f16526b, bVar.f16527c, bVar.f16528d);
        }
    }

    public g0(w0 w0Var) {
        super(w0Var);
        this.f21298c = w0Var.b();
    }
}
