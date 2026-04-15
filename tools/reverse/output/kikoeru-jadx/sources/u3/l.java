package u3;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.cnl.kikoeru.R;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static w0 b(View view) {
        if (f0.f21290d && view.isAttachedToWindow()) {
            try {
                Object obj = f0.f21287a.get(view.getRootView());
                if (obj != null) {
                    Rect rect = (Rect) f0.f21288b.get(obj);
                    Rect rect2 = (Rect) f0.f21289c.get(obj);
                    if (rect != null && rect2 != null) {
                        int i10 = Build.VERSION.SDK_INT;
                        l0 k0Var = i10 >= 34 ? new k0() : i10 >= 31 ? new j0() : i10 >= 30 ? new i0() : i10 >= 29 ? new h0() : new g0();
                        k0Var.e(p3.b.b(rect.left, rect.top, rect.right, rect.bottom));
                        k0Var.g(p3.b.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
                        w0 w0VarB = k0Var.b();
                        w0VarB.f21343a.t(w0VarB);
                        w0VarB.f21343a.d(view.getRootView());
                        return w0VarB;
                    }
                }
            } catch (IllegalAccessException e10) {
                Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e10.getMessage(), e10);
            }
        }
        return null;
    }

    public static void c(View view, f fVar) {
        k kVar = fVar != null ? new k(view, fVar) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, kVar);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (kVar != null) {
            view.setOnApplyWindowInsetsListener(kVar);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }

    public static void d(View view) {
        view.stopNestedScroll();
    }
}
