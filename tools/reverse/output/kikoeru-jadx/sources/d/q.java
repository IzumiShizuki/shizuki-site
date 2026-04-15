package d;

import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q extends lc.b {
    @Override // lc.b
    public void T(m0 m0Var, m0 m0Var2, Window window, View view, boolean z10, boolean z11) {
        jc.l.e(m0Var, "statusBarStyle");
        jc.l.e(m0Var2, "navigationBarStyle");
        jc.l.e(window, "window");
        jc.l.e(view, "view");
        n7.d.z(window, false);
        window.addFlags(67108864);
        window.addFlags(134217728);
    }
}
