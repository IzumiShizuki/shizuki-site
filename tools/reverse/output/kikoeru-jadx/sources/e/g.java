package e;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.cnl.kikoeru.R;
import d.l0;
import x0.o;
import x0.z;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f6024a = new z(new e(1));

    public static l0 a(o oVar) {
        l0 l0Var = (l0) oVar.j(f6024a);
        Object obj = null;
        if (l0Var == null) {
            oVar.W(1208426157);
            View view = (View) oVar.j(AndroidCompositionLocals_androidKt.f725f);
            jc.l.e(view, "<this>");
            while (true) {
                if (view == null) {
                    l0Var = null;
                    break;
                }
                Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                l0 l0Var2 = tag instanceof l0 ? (l0) tag : null;
                if (l0Var2 != null) {
                    l0Var = l0Var2;
                    break;
                }
                Object objX = ud.e.x(view);
                view = objX instanceof View ? (View) objX : null;
            }
            oVar.p(false);
        } else {
            oVar.W(1208423708);
            oVar.p(false);
        }
        if (l0Var != null) {
            oVar.W(1208423789);
            oVar.p(false);
            return l0Var;
        }
        oVar.W(1208428160);
        Context baseContext = (Context) oVar.j(AndroidCompositionLocals_androidKt.f721b);
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
            if (baseContext instanceof l0) {
                obj = baseContext;
                break;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        l0 l0Var3 = (l0) obj;
        oVar.p(false);
        return l0Var3;
    }
}
