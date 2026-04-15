package d;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements androidx.lifecycle.v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ub.p f5178b = ub.a.d(new a9.g(27));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f5179a;

    public a0(n nVar) {
        this.f5179a = nVar;
    }

    @Override // androidx.lifecycle.v
    public final void i(androidx.lifecycle.x xVar, androidx.lifecycle.o oVar) {
        if (oVar != androidx.lifecycle.o.ON_DESTROY) {
            return;
        }
        Object systemService = this.f5179a.getSystemService("input_method");
        jc.l.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        x xVar2 = (x) f5178b.getValue();
        Object objB = xVar2.b(inputMethodManager);
        if (objB == null) {
            return;
        }
        synchronized (objB) {
            View viewC = xVar2.c(inputMethodManager);
            if (viewC == null) {
                return;
            }
            if (viewC.isAttachedToWindow()) {
                return;
            }
            boolean zA = xVar2.a(inputMethodManager);
            if (zA) {
                inputMethodManager.isActive();
            }
        }
    }
}
