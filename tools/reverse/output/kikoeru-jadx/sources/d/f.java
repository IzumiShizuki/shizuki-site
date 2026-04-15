package d;

import android.window.OnBackInvokedDispatcher;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements androidx.lifecycle.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0 f5196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f5197b;

    public /* synthetic */ f(j0 j0Var, n nVar) {
        this.f5196a = j0Var;
        this.f5197b = nVar;
    }

    @Override // androidx.lifecycle.v
    public final void i(androidx.lifecycle.x xVar, androidx.lifecycle.o oVar) {
        if (oVar == androidx.lifecycle.o.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = j.a(this.f5197b);
            j0 j0Var = this.f5196a;
            j0Var.f5218e = onBackInvokedDispatcherA;
            j0Var.d(j0Var.f5220g);
        }
    }
}
