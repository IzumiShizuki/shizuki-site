package u3;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w0 f21342b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f21343a;

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            f21342b = s0.f21330s;
        } else if (i10 >= 30) {
            f21342b = q0.f21323r;
        } else {
            f21342b = t0.f21332b;
        }
    }

    public w0(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            this.f21343a = new s0(this, windowInsets);
            return;
        }
        if (i10 >= 31) {
            this.f21343a = new r0(this, windowInsets);
            return;
        }
        if (i10 >= 30) {
            this.f21343a = new q0(this, windowInsets);
            return;
        }
        if (i10 >= 29) {
            this.f21343a = new p0(this, windowInsets);
        } else if (i10 >= 28) {
            this.f21343a = new o0(this, windowInsets);
        } else {
            this.f21343a = new n0(this, windowInsets);
        }
    }

    public static p3.b a(p3.b bVar, int i10, int i11, int i12, int i13) {
        int iMax = Math.max(0, bVar.f16525a - i10);
        int iMax2 = Math.max(0, bVar.f16526b - i11);
        int iMax3 = Math.max(0, bVar.f16527c - i12);
        int iMax4 = Math.max(0, bVar.f16528d - i13);
        return (iMax == i10 && iMax2 == i11 && iMax3 == i12 && iMax4 == i13) ? bVar : p3.b.b(iMax, iMax2, iMax3, iMax4);
    }

    public static w0 c(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        w0 w0Var = new w0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            Field field = s.f21328a;
            w0 w0VarA = Build.VERSION.SDK_INT >= 23 ? m.a(view) : l.b(view);
            t0 t0Var = w0Var.f21343a;
            t0Var.t(w0VarA);
            t0Var.d(view.getRootView());
            t0Var.v(view.getWindowSystemUiVisibility());
        }
        return w0Var;
    }

    public final WindowInsets b() {
        t0 t0Var = this.f21343a;
        if (t0Var instanceof m0) {
            return ((m0) t0Var).f21313c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w0) {
            return Objects.equals(this.f21343a, ((w0) obj).f21343a);
        }
        return false;
    }

    public final int hashCode() {
        t0 t0Var = this.f21343a;
        if (t0Var == null) {
            return 0;
        }
        return t0Var.hashCode();
    }

    public w0(w0 w0Var) {
        if (w0Var != null) {
            t0 t0Var = w0Var.f21343a;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34 && (t0Var instanceof s0)) {
                this.f21343a = new s0(this, (s0) t0Var);
            } else if (i10 >= 31 && (t0Var instanceof r0)) {
                this.f21343a = new r0(this, (r0) t0Var);
            } else if (i10 >= 30 && (t0Var instanceof q0)) {
                this.f21343a = new q0(this, (q0) t0Var);
            } else if (i10 >= 29 && (t0Var instanceof p0)) {
                this.f21343a = new p0(this, (p0) t0Var);
            } else if (i10 >= 28 && (t0Var instanceof o0)) {
                this.f21343a = new o0(this, (o0) t0Var);
            } else if (t0Var instanceof n0) {
                this.f21343a = new n0(this, (n0) t0Var);
            } else if (t0Var instanceof m0) {
                this.f21343a = new m0(this, (m0) t0Var);
            } else {
                this.f21343a = new t0(this);
            }
            t0Var.e(this);
            return;
        }
        this.f21343a = new t0(this);
    }
}
