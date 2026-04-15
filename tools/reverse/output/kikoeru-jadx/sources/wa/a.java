package wa;

import android.view.View;
import android.view.Window;
import jc.l;
import r.y1;
import u3.x0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f23457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y1 f23458b;

    public a(View view, Window window) {
        l.e(view, "view");
        this.f23457a = view;
        this.f23458b = window != null ? new y1(view, window) : null;
    }

    public final void a(boolean z10) {
        y1 y1Var = this.f23458b;
        if (z10) {
            if (y1Var != null) {
                ((x0) y1Var.f18634b).G(1);
            }
        } else if (y1Var != null) {
            ((x0) y1Var.f18634b).u(1);
        }
        if (z10) {
            if (y1Var != null) {
                ((x0) y1Var.f18634b).G(2);
            }
        } else if (y1Var != null) {
            ((x0) y1Var.f18634b).u(2);
        }
    }
}
