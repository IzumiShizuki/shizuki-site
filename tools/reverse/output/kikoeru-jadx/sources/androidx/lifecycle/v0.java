package androidx.lifecycle;

import b0.w1;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final pe.d f819b = new pe.d(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f820a;

    public v0() {
        this.f820a = new AtomicReference(null);
    }

    public s0 a(pc.c cVar) {
        jc.l.e(cVar, "modelClass");
        w1 w1Var = (w1) this.f820a;
        String strX = cVar.x();
        if (strX != null) {
            return w1Var.R("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strX), cVar);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public v0(w0 w0Var, u0 u0Var, i4.b bVar) {
        jc.l.e(w0Var, "store");
        jc.l.e(u0Var, "factory");
        jc.l.e(bVar, "defaultCreationExtras");
        this.f820a = new w1(w0Var, u0Var, bVar);
    }

    public v0(e0 e0Var) {
        this.f820a = e0Var;
    }
}
