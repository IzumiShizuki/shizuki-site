package s8;

import androidx.lifecycle.q;
import androidx.lifecycle.w;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f19587b = new g(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f19588c = new f();

    @Override // androidx.lifecycle.q
    public final void W0(w wVar) {
        if (!(wVar instanceof androidx.lifecycle.f)) {
            throw new IllegalArgumentException((wVar + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        androidx.lifecycle.f fVar = (androidx.lifecycle.f) wVar;
        f fVar2 = f19588c;
        fVar.g(fVar2);
        fVar.q(fVar2);
        fVar.b(fVar2);
    }

    @Override // androidx.lifecycle.q
    public final androidx.lifecycle.p a1() {
        return androidx.lifecycle.p.f798e;
    }

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }

    @Override // androidx.lifecycle.q
    public final void q1(w wVar) {
    }
}
