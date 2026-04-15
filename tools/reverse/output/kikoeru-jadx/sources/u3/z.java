package u3;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.cnl.kikoeru.R;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z extends d0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f21366e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f4.a f21367f = new f4.a(f4.a.f6676c);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f21368g = new DecelerateInterpolator(1.5f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AccelerateInterpolator f21369h = new AccelerateInterpolator(1.5f);

    public static void f(View view, e0 e0Var) {
        v vVarK = k(view);
        if (vVarK != null) {
            vVarK.a(e0Var);
            if (vVarK.f21335a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                f(viewGroup.getChildAt(i10), e0Var);
            }
        }
    }

    public static void g(View view, e0 e0Var, w0 w0Var, boolean z10) {
        v vVarK = k(view);
        if (vVarK != null) {
            vVarK.f21336b = w0Var;
            if (!z10) {
                vVarK.b();
                z10 = vVarK.f21335a == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                g(viewGroup.getChildAt(i10), e0Var, w0Var, z10);
            }
        }
    }

    public static void h(View view, w0 w0Var, List list) {
        v vVarK = k(view);
        if (vVarK != null) {
            w0Var = vVarK.d(w0Var, list);
            if (vVarK.f21335a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                h(viewGroup.getChildAt(i10), w0Var, list);
            }
        }
    }

    public static void i(View view, e0 e0Var, m0.w wVar) {
        v vVarK = k(view);
        if (vVarK != null) {
            vVarK.e(e0Var, wVar);
            if (vVarK.f21335a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                i(viewGroup.getChildAt(i10), e0Var, wVar);
            }
        }
    }

    public static WindowInsets j(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static v k(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof y) {
            return ((y) tag).f21364a;
        }
        return null;
    }
}
