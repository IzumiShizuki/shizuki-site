package u3;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static w0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        w0 w0VarC = w0.c(null, rootWindowInsets);
        t0 t0Var = w0VarC.f21343a;
        t0Var.t(w0VarC);
        t0Var.d(view.getRootView());
        return w0VarC;
    }
}
