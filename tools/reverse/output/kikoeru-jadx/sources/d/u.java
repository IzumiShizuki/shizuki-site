package d;

import android.os.Build;
import android.view.View;
import android.view.Window;
import r.y1;
import u3.a1;
import u3.x0;
import u3.y0;
import u3.z0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class u extends t {
    @Override // d.s, lc.b
    public void T(m0 m0Var, m0 m0Var2, Window window, View view, boolean z10, boolean z11) {
        jc.l.e(m0Var, "statusBarStyle");
        jc.l.e(m0Var2, "navigationBarStyle");
        jc.l.e(window, "window");
        jc.l.e(view, "view");
        n7.d.z(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        y1 y1Var = new y1(view);
        int i10 = Build.VERSION.SDK_INT;
        x0 a1Var = i10 >= 35 ? new a1(window, y1Var, 1) : i10 >= 30 ? new x0(window, y1Var, 1) : i10 >= 26 ? new z0(window, y1Var, 0) : i10 >= 23 ? new y0(window, y1Var, 0) : new x0(window, y1Var, 0);
        a1Var.C(!z10);
        a1Var.A(!z11);
    }
}
